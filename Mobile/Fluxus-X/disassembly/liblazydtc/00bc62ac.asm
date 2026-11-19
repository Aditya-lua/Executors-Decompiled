; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::basic_string @ 00bc62ac
00bc62ac	paciasp
00bc62b0	stp x29,x30,[sp, #-0x40]!
00bc62b4	str x23,[sp, #0x10]
00bc62b8	stp x22,x21,[sp, #0x20]
00bc62bc	stp x20,x19,[sp, #0x30]
00bc62c0	mov x29,sp
00bc62c4	ldrb w8,[x1]
00bc62c8	ldr x9,[x1, #0x8]
00bc62cc	lsr x10,x8,#0x1
00bc62d0	tst w8,#0x1
00bc62d4	csel x9,x10,x9,eq
00bc62d8	subs x9,x9,x2
00bc62dc	b.cc 0x00bc6378
00bc62e0	ldr x10,[x1, #0x10]
00bc62e4	add x11,x1,#0x4
00bc62e8	tst w8,#0x1
00bc62ec	orr x8,xzr,#0x3ffffffffffffff8
00bc62f0	csel x22,x11,x10,eq
00bc62f4	cmp x9,x3
00bc62f8	csel x21,x9,x3,cc
00bc62fc	cmp x21,x8
00bc6300	b.cs 0x00bc637c
00bc6304	mov x20,x2
00bc6308	mov x19,x0
00bc630c	cmp x21,#0x5
00bc6310	b.cs 0x00bc6324
00bc6314	lsl w8,w21,#0x1
00bc6318	strb w8,[x19], #0x4
00bc631c	cbnz x21,0x00bc634c
00bc6320	b 0x00bc635c
00bc6324	orr x8,x21,#0x1
00bc6328	mov w9,#0x8
00bc632c	cmp x8,#0x5
00bc6330	csinc x23,x9,x8,eq
00bc6334	lsl x0,x23,#0x2
00bc6338	bl 0x00c2fed0
00bc633c	orr x8,x23,#0x1
00bc6340	stp x21,x0,[x19, #0x8]
00bc6344	str x8,[x19]
00bc6348	mov x19,x0
00bc634c	add x1,x22,x20, LSL #0x2
00bc6350	lsl x2,x21,#0x2
00bc6354	mov x0,x19
00bc6358	bl 0x00c2ff60
00bc635c	str wzr,[x19, x21, LSL #0x2]
00bc6360	ldp x20,x19,[sp, #0x30]
00bc6364	ldr x23,[sp, #0x10]
00bc6368	ldp x22,x21,[sp, #0x20]
00bc636c	ldp x29,x30,[sp], #0x40
00bc6370	autiasp
00bc6374	ret
00bc6378	bl 0x00bc531c
00bc637c	bl 0x00bc5610
