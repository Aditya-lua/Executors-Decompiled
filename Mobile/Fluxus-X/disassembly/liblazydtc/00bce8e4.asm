; std::__ndk1::basic_streambuf<char,std::__ndk1::char_traits<char>>::sgetc @ 00bce8e4
00bce8e4	bti c
00bce8e8	ldp x8,x9,[x0, #0x18]
00bce8ec	cmp x8,x9
00bce8f0	b.eq 0x00bce8fc
00bce8f4	ldrb w0,[x8]
00bce8f8	ret
00bce8fc	ldr x8,[x0]
00bce900	ldr x16,[x8, #0x48]
00bce904	br x16
