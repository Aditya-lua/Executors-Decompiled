; FUN_00c2e6c8 @ 00c2e6c8
00c2e6c8	paciasp
00c2e6cc	stp x29,x30,[sp, #-0x20]!
00c2e6d0	str x19,[sp, #0x10]
00c2e6d4	mov x29,sp
00c2e6d8	ldr x9,[x0]
00c2e6dc	cmp x9,x1
00c2e6e0	b.eq 0x00c2e828
00c2e6e4	mov x10,x9
00c2e6e8	mov x8,x0
00c2e6ec	ldrb w11,[x10], #0x1
00c2e6f0	and x0,x11,#0x7f
00c2e6f4	tbnz w11,#0x7,0x00c2e70c
00c2e6f8	str x10,[x8]
00c2e6fc	ldr x19,[sp, #0x10]
00c2e700	ldp x29,x30,[sp], #0x20
00c2e704	autiasp
00c2e708	ret
00c2e70c	cmp x10,x1
00c2e710	b.eq 0x00c2e828
00c2e714	ldrsb w11,[x9, #0x1]
00c2e718	and w10,w11,#0x7f
00c2e71c	orr x0,x0,x10, LSL #0x7
00c2e720	add x10,x9,#0x2
00c2e724	tbz w11,#0x1f,0x00c2e6f8
00c2e728	cmp x10,x1
00c2e72c	b.eq 0x00c2e828
00c2e730	ldrsb w11,[x9, #0x2]
00c2e734	and w10,w11,#0x7f
00c2e738	orr x0,x0,x10, LSL #0xe
00c2e73c	add x10,x9,#0x3
00c2e740	tbz w11,#0x1f,0x00c2e6f8
00c2e744	cmp x10,x1
00c2e748	b.eq 0x00c2e828
00c2e74c	ldrsb w11,[x9, #0x3]
00c2e750	and w10,w11,#0x7f
00c2e754	orr x0,x0,x10, LSL #0x15
00c2e758	add x10,x9,#0x4
00c2e75c	tbz w11,#0x1f,0x00c2e6f8
00c2e760	cmp x10,x1
00c2e764	b.eq 0x00c2e828
00c2e768	ldrsb w11,[x9, #0x4]
00c2e76c	and w10,w11,#0x7f
00c2e770	orr x0,x0,x10, LSL #0x1c
00c2e774	add x10,x9,#0x5
00c2e778	tbz w11,#0x1f,0x00c2e6f8
00c2e77c	cmp x10,x1
00c2e780	b.eq 0x00c2e828
00c2e784	ldrsb w11,[x9, #0x5]
00c2e788	and w10,w11,#0x7f
00c2e78c	orr x0,x0,x10, LSL #0x23
00c2e790	add x10,x9,#0x6
00c2e794	tbz w11,#0x1f,0x00c2e6f8
00c2e798	cmp x10,x1
00c2e79c	b.eq 0x00c2e828
00c2e7a0	ldrsb w11,[x9, #0x6]
00c2e7a4	and w10,w11,#0x7f
00c2e7a8	orr x0,x0,x10, LSL #0x2a
00c2e7ac	add x10,x9,#0x7
00c2e7b0	tbz w11,#0x1f,0x00c2e6f8
00c2e7b4	cmp x10,x1
00c2e7b8	b.eq 0x00c2e828
00c2e7bc	ldrsb w11,[x9, #0x7]
00c2e7c0	and w10,w11,#0x7f
00c2e7c4	orr x0,x0,x10, LSL #0x31
00c2e7c8	add x10,x9,#0x8
00c2e7cc	tbz w11,#0x1f,0x00c2e6f8
00c2e7d0	cmp x10,x1
00c2e7d4	b.eq 0x00c2e828
00c2e7d8	ldrsb w11,[x9, #0x8]
00c2e7dc	and w10,w11,#0x7f
00c2e7e0	orr x0,x0,x10, LSL #0x38
00c2e7e4	add x10,x9,#0x9
00c2e7e8	tbz w11,#0x1f,0x00c2e6f8
00c2e7ec	cmp x10,x1
00c2e7f0	b.eq 0x00c2e828
00c2e7f4	ldrb w11,[x10]
00c2e7f8	tst w11,#0x7e
00c2e7fc	b.ne 0x00c2e85c
00c2e800	add x10,x9,#0xa
00c2e804	tbnz w11,#0x7,0x00c2e820
00c2e808	orr x0,x0,x11, LSL #0x3f
00c2e80c	str x10,[x8]
00c2e810	ldr x19,[sp, #0x10]
00c2e814	ldp x29,x30,[sp], #0x20
00c2e818	autiasp
00c2e81c	ret
00c2e820	cmp x10,x1
00c2e824	b.ne 0x00c2e85c
00c2e828	adrp x19,0xcb4000
00c2e82c	adrp x1,0x2a1000
00c2e830	add x1,x1,#0x45d
00c2e834	ldr x19,[x19, #0xba0]
00c2e838	adrp x2,0x2ab000
00c2e83c	add x2,x2,#0x305
00c2e840	adrp x3,0x2ae000
00c2e844	add x3,x3,#0xedd
00c2e848	add x0,x19,#0x130
00c2e84c	bl 0x00c30940
00c2e850	add x0,x19,#0x130
00c2e854	bl 0x00c30c50
00c2e858	bl 0x00c30b40
00c2e85c	adrp x19,0xcb4000
00c2e860	adrp x1,0x2a1000
00c2e864	add x1,x1,#0x45d
00c2e868	ldr x19,[x19, #0xba0]
00c2e86c	adrp x2,0x2ab000
00c2e870	add x2,x2,#0x305
00c2e874	adrp x3,0x2b6000
00c2e878	add x3,x3,#0xc07
00c2e87c	add x0,x19,#0x130
00c2e880	bl 0x00c30940
00c2e884	add x0,x19,#0x130
00c2e888	bl 0x00c30c50
00c2e88c	bl 0x00c30b40
