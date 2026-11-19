; std::__ndk1::ctype<wchar_t>::do_narrow @ 00bfc9f8
00bfc9f8	bti c
00bfc9fc	cmp w1,#0x80
00bfca00	csel w0,w1,w2,cc
00bfca04	ret
