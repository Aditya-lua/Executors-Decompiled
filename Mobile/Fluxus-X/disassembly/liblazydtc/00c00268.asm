; std::__ndk1::__codecvt_utf8<char16_t>::do_max_length @ 00c00268
00c00268	bti c
00c0026c	ldrb w9,[x0, #0x18]
00c00270	mov w8,#0x6
00c00274	tst w9,#0x4
00c00278	mov w9,#0x3
00c0027c	csel w0,w9,w8,eq
00c00280	ret
