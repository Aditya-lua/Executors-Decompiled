; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::basic_string @ 00bc3be0
00bc3be0	bti c
00bc3be4	ldrb w8,[x1]
00bc3be8	tbnz w8,#0x0,0x00bc3c00
00bc3bec	ldr x8,[x1, #0x10]
00bc3bf0	ldr q0,[x1]
00bc3bf4	str x8,[x0, #0x10]
00bc3bf8	str q0,[x0]
00bc3bfc	ret
00bc3c00	ldp x2,x8,[x1, #0x8]
00bc3c04	mov x1,x8
00bc3c08	b 0x007ff40c
