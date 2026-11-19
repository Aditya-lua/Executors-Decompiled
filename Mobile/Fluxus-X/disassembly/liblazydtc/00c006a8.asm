; std::__ndk1::__codecvt_utf16<wchar_t,false>::do_max_length @ 00c006a8
00c006a8	bti c
00c006ac	ldrb w9,[x0, #0x20]
00c006b0	mov w8,#0x6
00c006b4	tst w9,#0x4
00c006b8	mov w9,#0x4
00c006bc	csel w0,w9,w8,eq
00c006c0	ret
