; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sungetc @ 00bd27e0
00bd27e0	bti c
00bd27e4	ldp x10,x9,[x0, #0x10]
00bd27e8	mov x8,x0
00bd27ec	cmp x10,x9
00bd27f0	b.eq 0x00bd2800
00bd27f4	ldr w0,[x9, #-0x4]!
00bd27f8	str x9,[x8, #0x18]
00bd27fc	ret
00bd2800	ldr x9,[x8]
00bd2804	mov x0,x8
00bd2808	mov w1,#0xffffffff
00bd280c	ldr x16,[x9, #0x58]
00bd2810	br x16
