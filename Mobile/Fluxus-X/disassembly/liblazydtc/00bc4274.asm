; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign @ 00bc4274
00bc4274	bti c
00bc4278	ldrb w9,[x1]
00bc427c	ldr x8,[x1, #0x8]
00bc4280	lsr x10,x9,#0x1
00bc4284	tst w9,#0x1
00bc4288	csel x8,x10,x8,eq
00bc428c	subs x8,x8,x2
00bc4290	b.cc 0x00bc42b4
00bc4294	cmp x8,x3
00bc4298	ldr x10,[x1, #0x10]
00bc429c	csel x8,x8,x3,cc
00bc42a0	tst w9,#0x1
00bc42a4	csinc x9,x10,x1,ne
00bc42a8	add x1,x9,x2
00bc42ac	mov x2,x8
00bc42b0	b 0x00802564
00bc42b4	paciasp
00bc42b8	stp x29,x30,[sp, #-0x10]!
00bc42bc	mov x29,sp
00bc42c0	bl 0x00814f80
