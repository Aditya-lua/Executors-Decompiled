; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sungetc @ 00bce950
00bce950	bti c
00bce954	ldp x9,x8,[x0, #0x10]
00bce958	cmp x9,x8
00bce95c	b.eq 0x00bce970
00bce960	sub x9,x8,#0x1
00bce964	str x9,[x0, #0x18]
00bce968	ldurb w0,[x8, #-0x1]
00bce96c	ret
00bce970	ldr x8,[x0]
00bce974	mov w1,#0xffffffff
00bce978	ldr x16,[x8, #0x58]
00bce97c	br x16
