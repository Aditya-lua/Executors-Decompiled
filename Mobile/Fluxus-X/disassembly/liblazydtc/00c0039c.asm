; std::__ndk1::__codecvt_utf8<char32_t>::do_max_length @ 00c0039c
00c0039c	bti c
00c003a0	ldrb w9,[x0, #0x18]
00c003a4	mov w8,#0x7
00c003a8	tst w9,#0x4
00c003ac	mov w9,#0x4
00c003b0	csel w0,w9,w8,eq
00c003b4	ret
