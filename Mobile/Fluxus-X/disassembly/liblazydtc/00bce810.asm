; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::in_avail @ 00bce810
00bce810	bti c
00bce814	ldp x8,x9,[x0, #0x18]
00bce818	cmp x8,x9
00bce81c	b.cs 0x00bce828
00bce820	sub x0,x9,x8
00bce824	ret
00bce828	ldr x8,[x0]
00bce82c	ldr x16,[x8, #0x38]
00bce830	br x16
