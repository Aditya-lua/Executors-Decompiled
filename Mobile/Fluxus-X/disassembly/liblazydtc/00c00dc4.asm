; std::__ndk1::__codecvt_utf16<char16_t,true>::do_max_length @ 00c00dc4
00c00dc4	bti c
00c00dc8	ldrb w9,[x0, #0x18]
00c00dcc	mov w8,#0x4
00c00dd0	tst w9,#0x4
00c00dd4	mov w9,#0x2
00c00dd8	csel w0,w9,w8,eq
00c00ddc	ret
