; std::__ndk1::__codecvt_utf8_utf16<char32_t>::do_max_length @ 00c01c00
00c01c00	bti c
00c01c04	ldrb w9,[x0, #0x18]
00c01c08	mov w8,#0x7
00c01c0c	tst w9,#0x4
00c01c10	mov w9,#0x4
00c01c14	csel w0,w9,w8,eq
00c01c18	ret
