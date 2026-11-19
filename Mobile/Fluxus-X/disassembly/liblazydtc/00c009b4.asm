; std::__ndk1::__codecvt_utf16<wchar_t,true>::do_max_length @ 00c009b4
00c009b4	bti c
00c009b8	ldrb w9,[x0, #0x20]
00c009bc	mov w8,#0x6
00c009c0	tst w9,#0x4
00c009c4	mov w9,#0x4
00c009c8	csel w0,w9,w8,eq
00c009cc	ret
