; std::__ndk1::__codecvt_utf16<char16_t,false>::do_max_length @ 00c00bbc
00c00bbc	bti c
00c00bc0	ldrb w9,[x0, #0x18]
00c00bc4	mov w8,#0x4
00c00bc8	tst w9,#0x4
00c00bcc	mov w9,#0x2
00c00bd0	csel w0,w9,w8,eq
00c00bd4	ret
