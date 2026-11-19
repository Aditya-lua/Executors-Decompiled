; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::at @ 00bc4bd0
00bc4bd0	bti c
00bc4bd4	ldrb w8,[x0]
00bc4bd8	ldr x9,[x0, #0x8]
00bc4bdc	lsr x10,x8,#0x1
00bc4be0	tst w8,#0x1
00bc4be4	csel x9,x10,x9,eq
00bc4be8	cmp x1,x9
00bc4bec	b.cs 0x00bc4c04
00bc4bf0	ldr x9,[x0, #0x10]
00bc4bf4	tst w8,#0x1
00bc4bf8	csinc x8,x9,x0,ne
00bc4bfc	add x0,x8,x1
00bc4c00	ret
00bc4c04	paciasp
00bc4c08	stp x29,x30,[sp, #-0x10]!
00bc4c0c	mov x29,sp
00bc4c10	bl 0x00814f80
