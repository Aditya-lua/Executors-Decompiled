; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::replace @ 00bc4ed0
00bc4ed0	bti c
00bc4ed4	ldrb w8,[x3]
00bc4ed8	ldr x9,[x3, #0x8]
00bc4edc	lsr x10,x8,#0x1
00bc4ee0	tst w8,#0x1
00bc4ee4	csel x9,x10,x9,eq
00bc4ee8	subs x9,x9,x4
00bc4eec	b.cc 0x00bc4f10
00bc4ef0	ldr x10,[x3, #0x10]
00bc4ef4	tst w8,#0x1
00bc4ef8	csinc x10,x10,x3,ne
00bc4efc	cmp x9,x5
00bc4f00	csel x8,x9,x5,cc
00bc4f04	add x3,x10,x4
00bc4f08	mov x4,x8
00bc4f0c	b 0x00c43d10
00bc4f10	paciasp
00bc4f14	stp x29,x30,[sp, #-0x10]!
00bc4f18	mov x29,sp
00bc4f1c	bl 0x00814f80
