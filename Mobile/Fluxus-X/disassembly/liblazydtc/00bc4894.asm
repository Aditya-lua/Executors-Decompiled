; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::erase @ 00bc4894
00bc4894	paciasp
00bc4898	stp x29,x30,[sp, #-0x20]!
00bc489c	str x19,[sp, #0x10]
00bc48a0	mov x29,sp
00bc48a4	ldrb w8,[x0]
00bc48a8	ldr x9,[x0, #0x8]
00bc48ac	lsr x10,x8,#0x1
00bc48b0	tst w8,#0x1
00bc48b4	csel x9,x10,x9,eq
00bc48b8	cmp x1,x9
00bc48bc	b.hi 0x00bc4908
00bc48c0	cmn x2,#0x1
00bc48c4	b.eq 0x00bc48d8
00bc48c8	mov x19,x0
00bc48cc	bl 0x0081ff10
00bc48d0	mov x0,x19
00bc48d4	b 0x00bc48f8
00bc48d8	tbnz w8,#0x0,0x00bc48ec
00bc48dc	lsl w9,w1,#0x1
00bc48e0	mov x8,x0
00bc48e4	strb w9,[x8], #0x1
00bc48e8	b 0x00bc48f4
00bc48ec	ldr x8,[x0, #0x10]
00bc48f0	str x1,[x0, #0x8]
00bc48f4	strb wzr,[x8, x1]
00bc48f8	ldr x19,[sp, #0x10]
00bc48fc	ldp x29,x30,[sp], #0x20
00bc4900	autiasp
00bc4904	ret
00bc4908	bl 0x00814f80
