; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::insert @ 00bc50f8
00bc50f8	bti c
00bc50fc	ldrb w8,[x2]
00bc5100	ldr x9,[x2, #0x8]
00bc5104	lsr x10,x8,#0x1
00bc5108	tst w8,#0x1
00bc510c	csel x9,x10,x9,eq
00bc5110	subs x9,x9,x3
00bc5114	b.cc 0x00bc5138
00bc5118	ldr x10,[x2, #0x10]
00bc511c	tst w8,#0x1
00bc5120	csinc x10,x10,x2,ne
00bc5124	cmp x9,x4
00bc5128	csel x8,x9,x4,cc
00bc512c	add x2,x10,x3
00bc5130	mov x3,x8
00bc5134	b 0x00c314c0
00bc5138	paciasp
00bc513c	stp x29,x30,[sp, #-0x10]!
00bc5140	mov x29,sp
00bc5144	bl 0x00814f80
