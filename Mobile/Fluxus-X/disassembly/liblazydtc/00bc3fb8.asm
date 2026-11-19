; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::at @ 00bc3fb8
00bc3fb8	bti c
00bc3fbc	ldrb w8,[x0]
00bc3fc0	ldr x9,[x0, #0x8]
00bc3fc4	lsr x10,x8,#0x1
00bc3fc8	tst w8,#0x1
00bc3fcc	csel x9,x10,x9,eq
00bc3fd0	cmp x1,x9
00bc3fd4	b.cs 0x00bc3fec
00bc3fd8	ldr x9,[x0, #0x10]
00bc3fdc	tst w8,#0x1
00bc3fe0	csinc x8,x9,x0,ne
00bc3fe4	add x0,x8,x1
00bc3fe8	ret
00bc3fec	paciasp
00bc3ff0	stp x29,x30,[sp, #-0x10]!
00bc3ff4	mov x29,sp
00bc3ff8	bl 0x00814f80
