/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 */
package org.lwjgl.system.linux.templates

import org.lwjgl.generator.*
import org.lwjgl.system.linux.*

val X11 = "X11".nativeClass(LINUX_PACKAGE, binding = simpleBinding("X11")) {
	documentation = "Native bindings to libX11.so"

	// TODO: should these be here?
	IntConstant(
		"Boolean values",

		"True"..1,
		"False"..0
	)

	IntConstant(
		"RESERVED RESOURCE AND CONSTANT DEFINITIONS",

		"None"..0,
		"ParentRelative"..1,
		"CopyFromParent"..0,
		"PointerWindow"..0,
		"InputFocus"..1,
		"PointerRoot"..1,
		"AnyPropertyType"..0,
		"AnyKey"..0,
		"AnyButton"..0,
		"AllTemporary"..0,
		"CurrentTime"..0,
		"NoSymbol"..0
	)

	IntConstant(
		"ERROR CODES",

		"Success"..0,
		"BadRequest"..1,
		"BadValue"..2,
		"BadWindow"..3,
		"BadPixmap"..4,
		"BadAtom"..5,
		"BadCursor"..6,
		"BadFont"..7,
		"BadMatch"..8,
		"BadDrawable"..9,
		"BadAccess"..10,
		"BadAlloc"..11,
		"BadColor"..12,
		"BadGC"..13,
		"BadIDChoice"..14,
		"BadName"..15,
		"BadLength"..16,
		"BadImplementation"..17
	)

	IntConstant(
		"Window attributes for CreateWindow and ChangeWindowAttributes",

		"CWBackPixmap" expr "1 << 0",
		"CWBackPixel" expr "1 << 1",
		"CWBorderPixmap" expr "1 << 2",
		"CWBorderPixel" expr "1 << 3",
		"CWBitGravity" expr "1 << 4",
		"CWWinGravity" expr "1 << 5",
		"CWBackingStore" expr "1 << 6",
		"CWBackingPlanes" expr "1 << 7",
		"CWBackingPixel" expr "1 << 8",
		"CWOverrideRedirect" expr "1 << 9",
		"CWSaveUnder" expr "1 << 10",
		"CWEventMask" expr "1 << 11",
		"CWDontPropagate" expr "1 << 12",
		"CWColormap" expr "1 << 13",
		"CWCursor" expr "1 << 14"
	)

	IntConstant(
		"Input Event Masks. Used as event-mask window attribute and as arguments to Grab requests. Not to be confused with event names.",

		"NoEventMask"..0,
		"KeyPressMask" expr "1 << 0",
		"KeyReleaseMask" expr "1 << 1",
		"ButtonPressMask" expr "1 << 2",
		"ButtonReleaseMask" expr "1 << 3",
		"EnterWindowMask" expr "1 << 4",
		"LeaveWindowMask" expr "1 << 5",
		"PointerMotionMask" expr "1 << 6",
		"PointerMotionHintMask" expr "1 << 7",
		"Button1MotionMask" expr "1 << 8",
		"Button2MotionMask" expr "1 << 9",
		"Button3MotionMask" expr "1 << 10",
		"Button4MotionMask" expr "1 << 11",
		"Button5MotionMask" expr "1 << 12",
		"ButtonMotionMask" expr "1 << 13",
		"KeymapStateMask" expr "1 << 14",
		"ExposureMask" expr "1 << 15",
		"VisibilityChangeMask" expr "1 << 16",
		"StructureNotifyMask" expr "1 << 17",
		"ResizeRedirectMask" expr "1 << 18",
		"SubstructureNotifyMask" expr "1 << 19",
		"SubstructureRedirectMask" expr "1 << 20",
		"FocusChangeMask" expr "1 << 21",
		"PropertyChangeMask" expr "1 << 22",
		"ColormapChangeMask" expr "1 << 23",
		"OwnerGrabButtonMask" expr "1 << 24"
	)

	IntConstant(
		"""
		Event names. Used in "type" field in ##XEvent structures. Not to be confused with event masks above. They start from 2 because 0 and 1 are
		reserved in the protocol for errors and replies.
		""",

		"KeyPress"..2,
		"KeyRelease"..3,
		"ButtonPress"..4,
		"ButtonRelease"..5,
		"MotionNotify"..6,
		"EnterNotify"..7,
		"LeaveNotify"..8,
		"FocusIn"..9,
		"FocusOut"..10,
		"KeymapNotify"..11,
		"Expose"..12,
		"GraphicsExpose"..13,
		"NoExpose"..14,
		"VisibilityNotify"..15,
		"CreateNotify"..16,
		"DestroyNotify"..17,
		"UnmapNotify"..18,
		"MapNotify"..19,
		"MapRequest"..20,
		"ReparentNotify"..21,
		"ConfigureNotify"..22,
		"ConfigureRequest"..23,
		"GravityNotify"..24,
		"ResizeRequest"..25,
		"CirculateNotify"..26,
		"CirculateRequest"..27,
		"PropertyNotify"..28,
		"SelectionClear"..29,
		"SelectionRequest"..30,
		"SelectionNotify"..31,
		"ColormapNotify"..32,
		"ClientMessage"..33,
		"MappingNotify"..34,
		"GenericEvent"..35,
		"LASTEvent"..36
	)

	IntConstant(
		"Key masks. Used as modifiers to GrabButton and GrabKey, results of QueryPointer, state in various key-, mouse-, and button-related events.",

		"ShiftMask" expr "1<<0",
		"LockMask" expr "1<<1",
		"ControlMask" expr "1<<2",
		"Mod1Mask" expr "1<<3",
		"Mod2Mask" expr "1<<4",
		"Mod3Mask" expr "1<<5",
		"Mod4Mask" expr "1<<6",
		"Mod5Mask" expr "1<<7"
	)

	IntConstant(
		"modifier names. Used to build a SetModifierMapping request or to read a GetModifierMapping request. These correspond to the masks defined above.",

		"ShiftMapIndex"..0,
		"LockMapIndex"..1,
		"ControlMapIndex"..2,
		"Mod1MapIndex"..3,
		"Mod2MapIndex"..4,
		"Mod3MapIndex"..5,
		"Mod4MapIndex"..6,
		"Mod5MapIndex"..7
	)

	IntConstant(
		"button masks. Used in same manner as Key masks above. Not to be confused with button names below.",

		"Button1Mask" expr "1<<8",
		"Button2Mask" expr "1<<9",
		"Button3Mask" expr "1<<10",
		"Button4Mask" expr "1<<11",
		"Button5Mask" expr "1<<12",
		"AnyModifier" expr "1<<15"
	)

	IntConstant(
		"""
		button names. Used as arguments to GrabButton and as detail in ButtonPress and ButtonRelease events. Not to be confused with button masks above. Note
		that 0 is already defined above as "AnyButton".
		""",

		"Button1"..1,
		"Button2"..2,
		"Button3"..3,
		"Button4"..4,
		"Button5"..5
	)

	IntConstant(
		"Notify modes",

		"NotifyNormal"..0,
		"NotifyGrab"..1,
		"NotifyUngrab"..2,
		"NotifyWhileGrabbed"..3,
		"NotifyHint"..1
	)

	IntConstant(
		"Notify detail",

		"NotifyAncestor"..0,
		"NotifyVirtual"..1,
		"NotifyInferior"..2,
		"NotifyNonlinear"..3,
		"NotifyNonlinearVirtual"..4,
		"NotifyPointer"..5,
		"NotifyPointerRoot"..6,
		"NotifyDetailNone"..7
	)

	IntConstant(
		"Visibility notify",

		"VisibilityUnobscured"..0,
		"VisibilityPartiallyObscured"..1,
		"VisibilityFullyObscured"..2
	)

	IntConstant(
		"Circulation request",

		"PlaceOnTop"..0,
		"PlaceOnBottom"..1
	)

	IntConstant(
		"Property notification",

		"PropertyNewValue"..0,
		"PropertyDelete"..1
	)

	IntConstant(
		"Color Map notification",

		"ColormapUninstalled"..0,
		"ColormapInstalled"..1
	)

	IntConstant(
		"GrabPointer, GrabButton, GrabKeyboard, GrabKey Modes",

		"GrabModeSync"..0,
		"GrabModeAsync"..1
	)

	IntConstant(
		"GrabPointer, GrabKeyboard reply status",

		"GrabSuccess"..0,
		"AlreadyGrabbed"..1,
		"GrabInvalidTime"..2,
		"GrabNotViewable"..3,
		"GrabFrozen"..4
	)

	IntConstant(
		"AllowEvents modes",

		"AsyncPointer"..0,
		"SyncPointer"..1,
		"ReplayPointer"..2,
		"AsyncKeyboard"..3,
		"SyncKeyboard"..4,
		"ReplayKeyboard"..5,
		"AsyncBoth"..6,
		"SyncBoth"..7
	)

	IntConstant(
		"For Xlib#XCreateColormap().",

		"AllocNone"..0,
		"AllocAll"..1
	)

	IntConstant(
		"Used in Xlib#XSetInputFocus(), Xlib#XGetInputFocus().",

		"RevertToNone" expr "None",
		"RevertToPointerRoot" expr "PointerRoot",
		"RevertToParent"..2
	)

	IntConstant(
		"Window classes used by Xlib#XCreateWindow().",

		"InputOutput"..1,
		"InputOnly"..2
	)

	IntConstant(
		"SCREEN SAVER STUFF",

		"DontPreferBlanking"..0,
		"PreferBlanking"..1,
		"DefaultBlanking"..2,
		"DisableScreenSaver"..0,
		"DisableScreenInterval"..0,
		"DontAllowExposures"..0,
		"AllowExposures"..1,
		"DefaultExposures"..2,
		"ScreenSaverReset"..0,
		"ScreenSaverActive"..1
	)

	IntConstant(
		"Property modes",

		"PropModeReplace"..0,
		"PropModePrepend"..1,
		"PropModeAppend"..2
	)

	IntConstant(
		"graphics functions, as in GC.alu",

		"GXclear"..0x0,
		"GXand"..0x1,
		"GXandReverse"..0x2,
		"GXcopy"..0x3,
		"GXandInverted"..0x4,
		"GXnoop"..0x5,
		"GXxor"..0x6,
		"GXor"..0x7,
		"GXnor"..0x8,
		"GXequiv"..0x9,
		"GXinvert"..0xa,
		"GXorReverse"..0xb,
		"GXcopyInverted"..0xc,
		"GXorInverted"..0xd,
		"GXnand"..0xe,
		"GXset"..0xf
	)

	IntConstant(
		"LineStyle",

		"LineSolid"..0,
		"LineOnOffDash"..1,
		"LineDoubleDash"..2
	)

	IntConstant(
		"capStyle",

		"CapNotLast"..0,
		"CapButt"..1,
		"CapRound"..2,
		"CapProjecting"..3
	)

	IntConstant(
		"joinStyle",

		"JoinMiter"..0,
		"JoinRound"..1,
		"JoinBevel"..2
	)

	IntConstant(
		"fillStyle",

		"FillSolid"..0,
		"FillTiled"..1,
		"FillStippled"..2,
		"FillOpaqueStippled"..3
	)

	IntConstant(
		"fillRule",

		"EvenOddRule"..0,
		"WindingRule"..1
	)

	IntConstant(
		"subwindow mode",

		"ClipByChildren"..0,
		"IncludeInferiors"..1
	)

	IntConstant(
		"SetClipRectangles ordering",

		"Unsorted"..0,
		"YSorted"..1,
		"YXSorted"..2,
		"YXBanded"..3
	)

	IntConstant(
		"CoordinateMode for drawing routines",

		"CoordModeOrigin"..0,
		"CoordModePrevious"..1
	)

	IntConstant(
		"Polygon shapes",

		"Complex"..0,
		"Nonconvex"..1,
		"Convex"..2
	)

	IntConstant(
		"Arc modes for PolyFillArc",

		"ArcChord"..0,
		"ArcPieSlice"..1
	)

	IntConstant(
		"GC components: masks used in CreateGC, CopyGC, ChangeGC, OR'ed into GC.stateChanges",

		"GCFunction" expr "1<<0",
		"GCPlaneMask" expr "1<<1",
		"GCForeground" expr "1<<2",
		"GCBackground" expr "1<<3",
		"GCLineWidth" expr "1<<4",
		"GCLineStyle" expr "1<<5",
		"GCCapStyle" expr "1<<6",
		"GCJoinStyle" expr "1<<7",
		"GCFillStyle" expr "1<<8",
		"GCFillRule" expr "1<<9",
		"GCTile" expr "1<<10",
		"GCStipple" expr "1<<11",
		"GCTileStipXOrigin" expr "1<<12",
		"GCTileStipYOrigin" expr "1<<13",
		"GCFont" expr "1<<14",
		"GCSubwindowMode" expr "1<<15",
		"GCGraphicsExposures" expr "1<<16",
		"GCClipXOrigin" expr "1<<17",
		"GCClipYOrigin" expr "1<<18",
		"GCClipMask" expr "1<<19",
		"GCDashOffset" expr "1<<20",
		"GCDashList" expr "1<<21",
		"GCArcMode" expr "1<<22",
		"GCLastBit"..22
	)

	val DISPLAY = Display_p.IN("display", "the connection to the X server")
	val WINDOW = Window.IN("w", "the window")
	//val DRAWABLE = Drawable.IN("d", "the drawable")

	Display_p(
		"XOpenDisplay",
		"""
		Returns a Display structure that serves as the connection to the X server and that contains all the information about that X server. {@code XOpenDisplay}
		connects your application to the X server through TCP or DECnet communications protocols, or through some local inter-process communication protocol.
		If the hostname is a host machine name and a single colon (:) separates the hostname and display number, {@code XOpenDisplay} connects using TCP streams.
		If the hostname is not specified, Xlib uses whatever it believes is the fastest transport. If the hostname is a host machine name and a double colon
		(::) separates the hostname and display number, {@code XOpenDisplay} connects using DECnet. A single X server can support any or all of these transport
		mechanisms simultaneously. A particular Xlib implementation can support many more of these transport mechanisms.
		""",

		nullable..const..charASCII_p.IN(
			"display_name",
			"""
			the hardware display name, which determines the display and communications domain to be used. On a POSIX-conformant system, if the
			{@code display_name} is $NULL, it defaults to the value of the DISPLAY environment variable.
			"""
		)
	)

	int(
		"XDefaultScreen",
		"Returns a pointer to the default screen.",

		DISPLAY
	)

	Window(
		"XRootWindow",
		"Returns the root window of the specified screen.",

		DISPLAY,
		int.IN("screen_number", "the appropriate screen number on the host server")
	)

	Colormap(
		"XCreateColormap",
		"""
		Creates a colormap of the specified visual type for the screen on which the specified window resides and returns the colormap ID associated with it.
		Note that the specified window is only used to determine the screen.
		""",

		DISPLAY,
		WINDOW,
		Visual_p.IN("visual", "a visual type supported on the screen. If the visual type is not one supported by the screen, a {@code BadMatch} error results."),
		int.IN("alloc", "the colormap entries to be allocated. You can pass AllocNone or AllocAll.")
	)

	int(
		"XFreeColormap",
		"""
		Deletes the association between the {@code colormap} resource ID and the {@code colormap} and frees the {@code colormap} storage. However, this function
		has no effect on the default colormap for a screen. If the specified {@code colormap} is an installed map for a screen, it is uninstalled. If the
		specified {@code colormap} is defined as the {@code colormap} for a window, {@code XFreeColormap()} changes the colormap associated with the window to
		X#GrabSuccess() and generates a {@code ColormapNotify} event. X does not define the colors displayed for a window with a colormap of X#GrabSuccess.
		""",

		DISPLAY,
		Colormap.IN("colormap", "the colormap to destroy")
	)

	Window(
		"XCreateWindow",
		"""
		Creates an unmapped subwindow for a specified parent window, returns the window ID of the created window, and causes the X server to generate a
		{@code CreateNotify }event. The created window is placed on top in the stacking order with respect to siblings.

		The coordinate system has the X axis horizontal and the Y axis vertical with the origin [0, 0] at the upper-left corner. Coordinates are integral, in
		terms of pixels, and coincide with pixel centers. Each window and pixmap has its own coordinate system. For a window, the origin is inside the border at
		the inside, upper-left corner.

		The x and y coordinates are the top-left outside corner of the window's borders and are relative to the inside of the parent window's borders.

		The width and height are the created window's inside dimensions and do not include the created window's borders.
		""",

		DISPLAY,
		Window.IN("parent", "the parent window"),
		int.IN("x", "the window x-coordinate"),
		int.IN("y", "the window y-coordinate"),
		unsigned_int.IN("width", "the window width"),
		unsigned_int.IN("height", "the window height"),
		unsigned_int.IN("border_width", "the border width"),
		int.IN("depth", "the window's depth. A depth of X#GrabSuccess() means the depth is taken from the parent."),
		unsigned_int.IN("windowClass", "the created window's class", "X#InputOutput X#InputOnly X#CopyFromParent"),
		Visual_p.IN("visual", "the visual type. A visual of X#GrabSuccess() means the visual type is taken from the parent."),
		unsigned_long.IN(
			"valuemask",
			"""
			which window attributes are defined in the attributes argument. This mask is the bitwise inclusive OR of the valid attribute mask bits. If
			{@code valuemask} is zero, the attributes are ignored and are not referenced.
			"""
		),
		XSetWindowAttributes_p.IN("attributes", "the structure from which the values (as specified by the value mask) are to be taken")
	)

	int(
		"XDestroyWindow",
		"""
		Destroys the specified window as well as all of its subwindows and causes the X server to generate a {@code DestroyNotify} event for each window. The
		window should never be referenced again. If the window specified by the {@code w} argument is mapped, it is unmapped automatically. The ordering of the
		{@code DestroyNotify} events is such that for any given window being destroyed, {@code DestroyNotify} is generated on any inferiors of the window before
		being generated on the window itself. The ordering among siblings and across subhierarchies is not otherwise constrained. If the window you specified is
		a root window, no windows are destroyed. Destroying a mapped window will generate {@code Expose} events on other windows that were obscured by the
		window being destroyed.
		""",

		DISPLAY,
		WINDOW
	)

	int(
		"XFree",
		"Free in-memory data that was created by an Xlib function.",

		MultiType(PointerMapping.DATA_POINTER)..void_p.IN("data", "the data that is to be freed")
	)
}