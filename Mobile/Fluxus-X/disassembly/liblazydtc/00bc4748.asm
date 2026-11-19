; std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>::assign @ 00bc4748
00bc4748	paciasp
00bc474c	stp x29,x30,[sp, #-0x50]!
00bc4750	str x25,[sp, #0x10]
00bc4754	stp x24,x23,[sp, #0x20]
00bc4758	stp x22,x21,[sp, #0x30]
00bc475c	stp x20,x19,[sp, #0x40]
00bc4760	mov x29,sp
00bc4764	ldr x8,[x0]
00bc4768	ldrb w9,[x0]
00bc476c	mov w21,w2
00bc4770	mov x19,x1
00bc4774	mov x20,x0
00bc4778	and x10,x8,#-0x2
00bc477c	tst w9,#0x1
00bc4780	mov w9,#0x16
00bc4784	sub x10,x10,#0x1
00bc4788	and w8,w8,#0xff
00bc478c	csel x25,x9,x10,eq
00bc4790	subs x9,x1,x25
00bc4794	b.ls 0x00bc4808
00bc4798	mov x10,#-0x9
00bc479c	sub x10,x10,x25
00bc47a0	cmp x9,x10
00bc47a4	b.hi 0x00bc4890
00bc47a8	ldr x9,[x20, #0x10]
00bc47ac	tst w8,#0x1
00bc47b0	mov x8,#-0xd
00bc47b4	movk x8,#0x7fff, LSL #48
00bc47b8	csinc x23,x9,x20,ne
00bc47bc	cmp x25,x8
00bc47c0	b.cs 0x00bc4828
00bc47c4	lsl x8,x25,#0x1
00bc47c8	mov w10,#0x1a
00bc47cc	cmp x19,x8
00bc47d0	csel x8,x19,x8,hi
00bc47d4	orr x9,x8,#0x7
00bc47d8	cmp x9,#0x17
00bc47dc	csinc x9,x10,x9,eq
00bc47e0	cmp x8,#0x17
00bc47e4	mov w8,#0x17
00bc47e8	csel x24,x8,x9,cc
00bc47ec	mov x0,x24
00bc47f0	bl 0x00c2fed0
00bc47f4	add x1,x25,#0x1
00bc47f8	mov x22,x0
00bc47fc	cmp x1,#0x17
00bc4800	b.ne 0x00bc483c
00bc4804	b 0x00bc4844
00bc4808	ldr x9,[x20, #0x10]
00bc480c	tst w8,#0x1
00bc4810	csinc x22,x9,x20,ne
00bc4814	cbnz x19,0x00bc4850
00bc4818	tbnz w8,#0x0,0x00bc4868
00bc481c	lsl w8,w19,#0x1
00bc4820	strb w8,[x20]
00bc4824	b 0x00bc486c
00bc4828	mov x0,#-0x9
00bc482c	mov x24,#-0x9
00bc4830	bl 0x00c2fed0
00bc4834	mov x22,x0
00bc4838	add x1,x25,#0x1
00bc483c	mov x0,x23
00bc4840	bl 0x00c2fe80
00bc4844	orr x8,x24,#0x1
00bc4848	stp xzr,x22,[x20, #0x8]
00bc484c	str x8,[x20]
00bc4850	mov x0,x22
00bc4854	mov w1,w21
00bc4858	mov x2,x19
00bc485c	bl 0x00c301c0
00bc4860	ldrb w8,[x20]
00bc4864	tbz w8,#0x0,0x00bc481c
00bc4868	str x19,[x20, #0x8]
00bc486c	mov x0,x20
00bc4870	strb wzr,[x22, x19]
00bc4874	ldp x20,x19,[sp, #0x40]
00bc4878	ldr x25,[sp, #0x10]
00bc487c	ldp x22,x21,[sp, #0x30]
00bc4880	ldp x24,x23,[sp, #0x20]
00bc4884	ldp x29,x30,[sp], #0x50
00bc4888	autiasp
00bc488c	ret
00bc4890	bl 0x007fe124
