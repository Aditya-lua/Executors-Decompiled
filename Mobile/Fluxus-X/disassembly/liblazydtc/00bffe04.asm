; std::__ndk1::__codecvt_utf8<wchar_t>::do_max_length @ 00bffe04
00bffe04	bti c
00bffe08	ldrb w9,[x0, #0x20]
00bffe0c	mov w8,#0x7
00bffe10	tst w9,#0x4
00bffe14	mov w9,#0x4
00bffe18	csel w0,w9,w8,eq
00bffe1c	ret
