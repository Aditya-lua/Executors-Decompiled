; std::__ndk1::__codecvt_utf16<char32_t,true>::do_max_length @ 00c013dc
00c013dc	bti c
00c013e0	ldrb w9,[x0, #0x18]
00c013e4	mov w8,#0x6
00c013e8	tst w9,#0x4
00c013ec	mov w9,#0x4
00c013f0	csel w0,w9,w8,eq
00c013f4	ret
