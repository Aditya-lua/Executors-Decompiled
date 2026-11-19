; std::__ndk1::ctype<char>::do_narrow @ 00bfcf50
00bfcf50	bti c
00bfcf54	sxtb w8,w1
00bfcf58	cmp w8,#0x0
00bfcf5c	csel w0,w2,w1,lt
00bfcf60	ret
