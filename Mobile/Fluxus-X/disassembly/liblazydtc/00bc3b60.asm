; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::basic_string @ 00bc3b60
00bc3b60	bti c
00bc3b64	ldrb w8,[x1]
00bc3b68	tbnz w8,#0x0,0x00bc3b80
00bc3b6c	ldr x8,[x1, #0x10]
00bc3b70	ldr q0,[x1]
00bc3b74	str x8,[x0, #0x10]
00bc3b78	str q0,[x0]
00bc3b7c	ret
00bc3b80	ldp x2,x8,[x1, #0x8]
00bc3b84	mov x1,x8
00bc3b88	b 0x007ff40c
