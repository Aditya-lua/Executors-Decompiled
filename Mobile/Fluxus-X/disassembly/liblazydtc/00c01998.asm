; std::__ndk1::__codecvt_utf8_utf16<wchar_t>::do_max_length @ 00c01998
00c01998	bti c
00c0199c	ldrb w9,[x0, #0x20]
00c019a0	mov w8,#0x7
00c019a4	tst w9,#0x4
00c019a8	mov w9,#0x4
00c019ac	csel w0,w9,w8,eq
00c019b0	ret
