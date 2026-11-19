; std::__ndk1::basic_streambuf<wchar_t,std::__ndk1::char_traits<wchar_t>>::sbumpc @ 00bd2744
00bd2744	bti c
00bd2748	ldp x9,x10,[x0, #0x18]
00bd274c	mov x8,x0
00bd2750	cmp x9,x10
00bd2754	b.eq 0x00bd2764
00bd2758	ldr w0,[x9], #0x4
00bd275c	str x9,[x8, #0x18]
00bd2760	ret
00bd2764	ldr x9,[x8]
00bd2768	mov x0,x8
00bd276c	ldr x16,[x9, #0x50]
00bd2770	br x16
