; std::__ndk1::__codecvt_utf8_utf16<char16_t>::do_max_length @ 00c01acc
00c01acc	bti c
00c01ad0	ldrb w9,[x0, #0x18]
00c01ad4	mov w8,#0x7
00c01ad8	tst w9,#0x4
00c01adc	mov w9,#0x4
00c01ae0	csel w0,w9,w8,eq
00c01ae4	ret
