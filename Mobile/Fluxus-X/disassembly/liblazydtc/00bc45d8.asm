; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::__grow_by @ 00bc45d8
00bc45d8	paciasp
00bc45dc	stp x29,x30,[sp, #-0x60]!
00bc45e0	str x27,[sp, #0x10]
00bc45e4	stp x26,x25,[sp, #0x20]
00bc45e8	stp x24,x23,[sp, #0x30]
00bc45ec	stp x22,x21,[sp, #0x40]
00bc45f0	stp x20,x19,[sp, #0x50]
00bc45f4	mov x29,sp
00bc45f8	mov x8,#-0x9
00bc45fc	sub x8,x8,x1
00bc4600	cmp x2,x8
00bc4604	b.hi 0x00bc46f4
00bc4608	ldrb w8,[x0]
00bc460c	ldr x9,[x0, #0x10]
00bc4610	mov x22,x6
00bc4614	mov x21,x5
00bc4618	mov x23,x4
00bc461c	mov x20,x1
00bc4620	tst w8,#0x1
00bc4624	mov x8,#-0xe
00bc4628	mov x25,x3
00bc462c	movk x8,#0x7fff, LSL #48
00bc4630	mov x19,x0
00bc4634	csinc x24,x9,x0,ne
00bc4638	cmp x1,x8
00bc463c	b.hi 0x00bc4670
00bc4640	lsl x8,x20,#0x1
00bc4644	add x9,x2,x20
00bc4648	mov w10,#0x1a
00bc464c	cmp x9,x8
00bc4650	csel x8,x9,x8,hi
00bc4654	orr x9,x8,#0x7
00bc4658	cmp x9,#0x17
00bc465c	csinc x9,x10,x9,eq
00bc4660	cmp x8,#0x17
00bc4664	mov w8,#0x17
00bc4668	csel x26,x8,x9,cc
00bc466c	b 0x00bc4674
00bc4670	mov x26,#-0x9
00bc4674	mov x0,x26
00bc4678	bl 0x00c2fed0
00bc467c	mov x27,x0
00bc4680	cbz x23,0x00bc4694
00bc4684	mov x0,x27
00bc4688	mov x1,x24
00bc468c	mov x2,x23
00bc4690	bl 0x00c2ff60
00bc4694	add x8,x21,x23
00bc4698	subs x2,x25,x8
00bc469c	b.eq 0x00bc46b4
00bc46a0	add x8,x24,x23
00bc46a4	add x9,x27,x23
00bc46a8	add x0,x9,x22
00bc46ac	add x1,x8,x21
00bc46b0	bl 0x00c2ff60
00bc46b4	add x1,x20,#0x1
00bc46b8	cmp x1,#0x17
00bc46bc	b.eq 0x00bc46c8
00bc46c0	mov x0,x24
00bc46c4	bl 0x00c2fe80
00bc46c8	orr x8,x26,#0x1
00bc46cc	str x27,[x19, #0x10]
00bc46d0	str x8,[x19]
00bc46d4	ldp x20,x19,[sp, #0x50]
00bc46d8	ldr x27,[sp, #0x10]
00bc46dc	ldp x22,x21,[sp, #0x40]
00bc46e0	ldp x24,x23,[sp, #0x30]
00bc46e4	ldp x26,x25,[sp, #0x20]
00bc46e8	ldp x29,x30,[sp], #0x60
00bc46ec	autiasp
00bc46f0	ret
00bc46f4	bl 0x007fe124
