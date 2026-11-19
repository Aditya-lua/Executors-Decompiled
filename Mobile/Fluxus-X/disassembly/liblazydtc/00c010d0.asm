; std::__ndk1::__codecvt_utf16<char32_t,false>::do_max_length @ 00c010d0
00c010d0	bti c
00c010d4	ldrb w9,[x0, #0x18]
00c010d8	mov w8,#0x6
00c010dc	tst w9,#0x4
00c010e0	mov w9,#0x4
00c010e4	csel w0,w9,w8,eq
00c010e8	ret
