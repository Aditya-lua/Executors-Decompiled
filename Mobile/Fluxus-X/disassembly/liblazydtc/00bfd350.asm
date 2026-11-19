; std::__ndk1::ctype_byname<char>::do_tolower @ 00bfd350
00bfd350	bti c
00bfd354	and w8,w1,#0xff
00bfd358	orr w9,w1,#0x20
00bfd35c	sub w8,w8,#0x5b
00bfd360	cmn w8,#0x1a
00bfd364	csel w0,w1,w9,cc
00bfd368	ret
