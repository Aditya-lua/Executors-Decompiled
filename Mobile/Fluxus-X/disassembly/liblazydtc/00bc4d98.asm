; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::operator= @ 00bc4d98
00bc4d98	bti c
00bc4d9c	cmp x0,x1
00bc4da0	b.eq 0x00bc4dc4
00bc4da4	ldrb w9,[x0]
00bc4da8	ldrb w8,[x1]
00bc4dac	tbnz w9,#0x0,0x00bc4dc8
00bc4db0	tbnz w8,#0x0,0x00bc4de0
00bc4db4	ldr x8,[x1, #0x10]
00bc4db8	ldr q0,[x1]
00bc4dbc	str x8,[x0, #0x10]
00bc4dc0	str q0,[x0]
00bc4dc4	ret
00bc4dc8	ldp x10,x9,[x1, #0x8]
00bc4dcc	lsr x11,x8,#0x1
00bc4dd0	tst w8,#0x1
00bc4dd4	csinc x1,x9,x1,ne
00bc4dd8	csel x2,x11,x10,eq
00bc4ddc	b 0x007fe004
00bc4de0	ldp x2,x8,[x1, #0x8]
00bc4de4	mov x1,x8
00bc4de8	b 0x007fdf5c
