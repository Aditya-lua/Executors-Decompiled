; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::assign @ 00bc61e4
00bc61e4	bti c
00bc61e8	ldrb w9,[x1]
00bc61ec	ldr x8,[x1, #0x8]
00bc61f0	lsr x10,x9,#0x1
00bc61f4	tst w9,#0x1
00bc61f8	csel x8,x10,x8,eq
00bc61fc	subs x8,x8,x2
00bc6200	b.cc 0x00bc6228
00bc6204	cmp x8,x3
00bc6208	ldr x10,[x1, #0x10]
00bc620c	add x11,x1,#0x4
00bc6210	csel x8,x8,x3,cc
00bc6214	tst w9,#0x1
00bc6218	csel x9,x11,x10,eq
00bc621c	add x1,x9,x2, LSL #0x2
00bc6220	mov x2,x8
00bc6224	b 0x00bc5e50
00bc6228	paciasp
00bc622c	stp x29,x30,[sp, #-0x10]!
00bc6230	mov x29,sp
00bc6234	bl 0x00bc531c
