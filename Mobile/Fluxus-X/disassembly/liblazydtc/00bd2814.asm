; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sputc @ 00bd2814
00bd2814	bti c
00bd2818	ldp x9,x10,[x0, #0x30]
00bd281c	mov x8,x0
00bd2820	cmp x9,x10
00bd2824	b.eq 0x00bd2838
00bd2828	mov w0,w1
00bd282c	str w1,[x9], #0x4
00bd2830	str x9,[x8, #0x30]
00bd2834	ret
00bd2838	ldr x9,[x8]
00bd283c	mov x0,x8
00bd2840	ldr x16,[x9, #0x68]
00bd2844	br x16
