; std::__ndk1::ctype_byname<char>::do_toupper @ 00bfd208
00bfd208	bti c
00bfd20c	and w8,w1,#0xff
00bfd210	eor w9,w1,#0x20
00bfd214	sub w8,w8,#0x7b
00bfd218	cmn w8,#0x1a
00bfd21c	csel w0,w1,w9,cc
00bfd220	ret
