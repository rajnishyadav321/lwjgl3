/* 
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux

import org.lwjgl.generator.*

val Bool = typedef(int, "Bool")

val XID = typedef(unsigned_long, "XID")
val VisualID = typedef(unsigned_long, "VisualID")

val Colormap = typedef(XID, "Colormap")
val Cursor = typedef(XID, "Cursor")
val Font = typedef(XID, "Font")
val Pixmap = typedef(XID, "Pixmap")
val Window = typedef(XID, "Window")

val Display_p = "Display".p // Display is a struct, but should be treated as an opaque type by apps
val DISPLAY = Display_p.IN("display", "the connection to the X server") // This is here so that GLX extensions can use it

val Visual_p = struct_p(LINUX_PACKAGE, "Visual") {
	documentation = "Visual structure; contains information about colormapping possible."
	nativeImport ("LinuxLWJGL.h")

	// ignored: XExtData_p.member("ext_data")
	VisualID.member("visualid")
	int.member("class", "clazz")
	unsigned_long.member("red_mask")
	unsigned_long.member("green_mask")
	unsigned_long.member("blue_mask")
	int.member("bits_per_rgb")
	int.member("map_entries")
}

val XVisualInfo_p = struct_p(LINUX_PACKAGE, "XVisualInfo") {
	documentation = "Information used by the visual utility routines to find desired visual type from the many visuals a display may support."
	nativeImport (
		"LinuxLWJGL.h",
		"<X11/Xutil.h>"
	)

	Visual_p.member("visual")
	VisualID.member("visualid")
	int.member("screen")
	int.member("depth")
	int.member("class", "clazz")
	unsigned_long.member("red_mask")
	unsigned_long.member("green_mask")
	unsigned_long.member("blue_mask")
	int.member("colormap_size")
	int.member("bits_per_rgb")
}

val XSetWindowAttributes_p = struct_p(LINUX_PACKAGE, "XSetWindowAttributes") {
	documentation = "Data structure for setting window attributes."
	nativeImport ("LinuxLWJGL.h")

	Pixmap.member("background_pixmap")
	unsigned_long.member("background_pixel")
	Pixmap.member("border_pixmap")
	unsigned_long.member("border_pixel")
	int.member("bit_gravity")
	int.member("win_gravity")
	int.member("backing_store")
	unsigned_long.member("backing_planes")
	unsigned_long.member("backing_pixel")
	Bool.member("save_under")
	long.member("event_mask")
	long.member("do_not_propagate_mask")
	Bool.member("override_redirect")
	Colormap.member("colormap")
	Cursor.member("cursor")
}

// --------------- Xrandr.h ---------------

val RROutput = typedef(XID, "RROutput")
val RRCrtc = typedef(XID, "RRCrtc")