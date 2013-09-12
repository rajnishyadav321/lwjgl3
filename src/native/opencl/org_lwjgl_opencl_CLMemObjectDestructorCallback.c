/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
#include "common_tools.h"
#include "OpenCL.h"

static jmethodID CLMemObjectDestructorCallbackInvoke;

static void CL_CALLBACK CLMemObjectDestructorCallbackProc(
	cl_mem memobj,
	void *user_data
) {
	ATTACH_THREAD()

    (*env)->CallVoidMethod(env, (jobject)user_data, CLMemObjectDestructorCallbackInvoke,
        (jlong)(intptr_t)memobj
    );

	// Delete the global reference, will not be needed anymore
	(*env)->DeleteGlobalRef(env, (jobject)user_data);

	DETACH_THREAD()
}

CALLBACK_SETUP(org_lwjgl_opencl_CLMemObjectDestructorCallback, CLMemObjectDestructorCallback)