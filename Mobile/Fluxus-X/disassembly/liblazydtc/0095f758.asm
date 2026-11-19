; FUN_0095f758 @ 0095f758
0095f758	sub sp,sp,#0x160
0095f75c	str x28,[sp, #0x110]
0095f760	stp x24,x23,[sp, #0x120]
0095f764	stp x22,x21,[sp, #0x130]
0095f768	stp x20,x19,[sp, #0x140]
0095f76c	stp x29,x30,[sp, #0x150]
0095f770	add x29,sp,#0x150
0095f774	mrs x23,tpidr_el0
0095f778	ldr x8,[x23, #0x28]
0095f77c	mov x19,x0
0095f780	stur x8,[x29, #-0x48]
0095f784	ldr w8,[x0]
0095f788	ldr x20,[x0, #0x10]
0095f78c	cmp w8,#0x3
0095f790	b.hi 0x0095f85c
0095f794	adrp x9,0x748000
0095f798	add x9,x9,#0xffc
0095f79c	ldrsw x8,[x9, x8, LSL #0x2]
0095f7a0	add x8,x8,x9
0095f7a4	br x8
0095f7a8	ldr w24,[x20, #0x131c]
0095f7ac	adrp x8,0x2cd000
0095f7b0	adrp x9,0x2a5000
0095f7b4	add x8,x8,#0x1ab
0095f7b8	add x9,x9,#0x5b3
0095f7bc	tst w24,#0x1000
0095f7c0	csel x21,x9,x8,eq
0095f7c4	cmp w1,#0x7
0095f7c8	b.hi 0x0095f92c
0095f7cc	adrp x9,0x749000
0095f7d0	mov w8,w1
0095f7d4	add x9,x9,#0xc
0095f7d8	ldrsw x8,[x9, x8, LSL #0x2]
0095f7dc	add x8,x8,x9
0095f7e0	br x8
0095f7e4	ldr w8,[x19, #0x1c]
0095f7e8	ldr w9,[x19, #0x24]
0095f7ec	add w10,w8,#0x1
0095f7f0	cmp w8,w9
0095f7f4	str w10,[x19, #0x1c]
0095f7f8	b.ge 0x0095f9a4
0095f7fc	ldr x8,[x19, #0x150]
0095f800	ldr w9,[x20, #0x131c]
0095f804	strb wzr,[x8]
0095f808	ldr x8,[x19, #0x150]
0095f80c	tbnz w9,#0x11,0x0095fa38
0095f810	mov w9,#0x1
0095f814	strb w9,[x8, #0x1]
0095f818	b 0x0095fa54
0095f81c	cbz x20,0x0095f93c
0095f820	ldrb w8,[x20, #0xa85]
0095f824	mov w0,wzr
0095f828	tbz w8,#0x4,0x0095fa0c
0095f82c	ldr x8,[x20, #0x12a0]
0095f830	cbz x8,0x0095f840
0095f834	ldr w8,[x8, #0x8]
0095f838	cmp w8,#0x1
0095f83c	b.lt 0x0095f93c
0095f840	adrp x1,0x2b6000
0095f844	adrp x2,0x2c5000
0095f848	add x1,x1,#0xc62
0095f84c	add x2,x2,#0x2a6
0095f850	mov x0,x20
0095f854	bl 0x00904c98
0095f858	b 0x0095f93c
0095f85c	adrp x1,0x2b6000
0095f860	adrp x2,0x2a7000
0095f864	add x1,x1,#0xc62
0095f868	add x2,x2,#0x5a1
0095f86c	mov x0,x20
0095f870	bl 0x00904b80
0095f874	mov w0,#0x47
0095f878	b 0x0095fa0c
0095f87c	ldrb w8,[x20, #0xa85]
0095f880	tbz w8,#0x4,0x0095f8b0
0095f884	ldr x8,[x20, #0x12a0]
0095f888	cbz x8,0x0095f898
0095f88c	ldr w8,[x8, #0x8]
0095f890	cmp w8,#0x1
0095f894	b.lt 0x0095f8b0
0095f898	adrp x1,0x2b6000
0095f89c	adrp x2,0x2ab000
0095f8a0	add x1,x1,#0xc62
0095f8a4	add x2,x2,#0x83f
0095f8a8	mov x0,x20
0095f8ac	bl 0x00904c98
0095f8b0	mov w8,#0x1
0095f8b4	mov x0,x19
0095f8b8	str w8,[x19]
0095f8bc	bl 0x0095f5d8
0095f8c0	cbnz w0,0x0095fa0c
0095f8c4	orr w1,wzr,#0x3
0095f8c8	b 0x0095f920
0095f8cc	add x8,x20,#0xa82
0095f8d0	ldr x8,[x8]
0095f8d4	tbnz w24,#0x11,0x0095f9bc
0095f8d8	tbz w8,#0x1c,0x0095f908
0095f8dc	ldr x8,[x20, #0x12a0]
0095f8e0	cbz x8,0x0095f8f0
0095f8e4	ldr w8,[x8, #0x8]
0095f8e8	cmp w8,#0x1
0095f8ec	b.lt 0x0095f908
0095f8f0	adrp x1,0x2b6000
0095f8f4	adrp x2,0x2ab000
0095f8f8	add x1,x1,#0xc62
0095f8fc	add x2,x2,#0x83f
0095f900	mov x0,x20
0095f904	bl 0x00904c98
0095f908	mov w8,#0x1
0095f90c	mov x0,x19
0095f910	str w8,[x19]
0095f914	bl 0x0095f5d8
0095f918	cbnz w0,0x0095fa0c
0095f91c	orr w1,wzr,#0x6
0095f920	mov x0,x19
0095f924	bl 0x0095fd58
0095f928	b 0x0095fa0c
0095f92c	adrp x1,0x29d000
0095f930	add x1,x1,#0x994
0095f934	mov x0,x20
0095f938	bl 0x00904b80
0095f93c	mov w0,wzr
0095f940	b 0x0095fa0c
0095f944	ldrb w8,[x20, #0xa85]
0095f948	tbz w8,#0x4,0x0095f978
0095f94c	ldr x8,[x20, #0x12a0]
0095f950	cbz x8,0x0095f960
0095f954	ldr w8,[x8, #0x8]
0095f958	cmp w8,#0x1
0095f95c	b.lt 0x0095f978
0095f960	adrp x1,0x2b6000
0095f964	adrp x2,0x2c7000
0095f968	add x1,x1,#0xc62
0095f96c	add x2,x2,#0x192
0095f970	mov x0,x20
0095f974	bl 0x00904c98
0095f978	mov w8,#0x2
0095f97c	mov x0,x19
0095f980	str w8,[x19]
0095f984	bl 0x0095f5d8
0095f988	cbnz w0,0x0095fa0c
0095f98c	mov w1,#0x4
0095f990	b 0x0095fa04
0095f994	orr w8,wzr,#0x3
0095f998	mov w0,wzr
0095f99c	str w8,[x19]
0095f9a0	b 0x0095fa0c
0095f9a4	mov w8,#0xffffff9e
0095f9a8	orr w9,wzr,#0x3
0095f9ac	mov w0,wzr
0095f9b0	str w8,[x19, #0x8]
0095f9b4	str w9,[x19]
0095f9b8	b 0x0095fa0c
0095f9bc	tbz w8,#0x1c,0x0095f9ec
0095f9c0	ldr x8,[x20, #0x12a0]
0095f9c4	cbz x8,0x0095f9d4
0095f9c8	ldr w8,[x8, #0x8]
0095f9cc	cmp w8,#0x1
0095f9d0	b.lt 0x0095f9ec
0095f9d4	adrp x1,0x2b6000
0095f9d8	adrp x2,0x2c7000
0095f9dc	add x1,x1,#0xc62
0095f9e0	add x2,x2,#0x192
0095f9e4	mov x0,x20
0095f9e8	bl 0x00904c98
0095f9ec	mov w8,#0x2
0095f9f0	mov x0,x19
0095f9f4	str w8,[x19]
0095f9f8	bl 0x0095f5d8
0095f9fc	cbnz w0,0x0095fa0c
0095fa00	orr w1,wzr,#0x6
0095fa04	mov x0,x19
0095fa08	bl 0x00960098
0095fa0c	ldr x8,[x23, #0x28]
0095fa10	ldur x9,[x29, #-0x48]
0095fa14	cmp x8,x9
0095fa18	b.ne 0x0095fd54
0095fa1c	ldp x29,x30,[sp, #0x150]
0095fa20	ldp x20,x19,[sp, #0x140]
0095fa24	ldp x22,x21,[sp, #0x130]
0095fa28	ldp x24,x23,[sp, #0x120]
0095fa2c	ldr x28,[sp, #0x110]
0095fa30	add sp,sp,#0x160
0095fa34	ret
0095fa38	mov w9,#0x2
0095fa3c	strb w9,[x8, #0x1]
0095fa40	ldr x1,[x20, #0x1158]
0095fa44	cmn x1,#0x1
0095fa48	b.eq 0x0095fa54
0095fa4c	mov x0,x20
0095fa50	bl 0x00931c50
0095fa54	ldr x8,[x19, #0x10]
0095fa58	mov x2,sp
0095fa5c	mov w4,#0x4
0095fa60	mov x1,xzr
0095fa64	ldr x8,[x8, #0x11a8]
0095fa68	mov x3,xzr
0095fa6c	add x0,x8,#0x1
0095fa70	bl 0x0091583c
0095fa74	cbnz w0,0x0095fa0c
0095fa78	ldr x22,[sp]
0095fa7c	mov x0,x22
0095fa80	bl 0x00c2ff50
0095fa84	ldrsw x1,[x19, #0x13c]
0095fa88	tst w24,#0x1000
0095fa8c	mov x8,#-0xc
0095fa90	orr x9,xzr,#-0x9
0095fa94	csel x8,x9,x8,eq
0095fa98	add x8,x8,x1
0095fa9c	cmp x0,x8
0095faa0	b.ls 0x0095fab0
0095faa4	adrp x1,0x2c3000
0095faa8	add x1,x1,#0x208
0095faac	b 0x0095fca8
0095fab0	ldr x8,[x19, #0x150]
0095fab4	adrp x2,0x2cd000
0095fab8	add x2,x2,#0x1b4
0095fabc	mov x3,x22
0095fac0	add x0,x8,#0x2
0095fac4	mov w4,wzr
0095fac8	mov x5,x21
0095facc	mov w6,wzr
0095fad0	bl 0x00c31b70
0095fad4	ldr x0,[sp]
0095fad8	bl 0x00c2ff50
0095fadc	ldrb w8,[x20, #0xa82]
0095fae0	tst w24,#0x1000
0095fae4	orr w9,wzr,#0xc
0095fae8	mov w10,#0x9
0095faec	csel x9,x10,x9,eq
0095faf0	add x21,x0,x9
0095faf4	tbnz w8,#0x2,0x0095fce8
0095faf8	mov w8,#0x131e
0095fafc	ldrb w8,[x20, x8]
0095fb00	tbz w8,#0x1,0x0095fb28
0095fb04	ldr x3,[x20, #0x1158]
0095fb08	cmn x3,#0x1
0095fb0c	b.eq 0x0095fb28
0095fb10	adrp x2,0x2d1000
0095fb14	add x2,x2,#0x1bf
0095fb18	add x0,sp,#0x8
0095fb1c	mov w1,#0x40
0095fb20	bl 0x00c31b70
0095fb24	b 0x0095fb30
0095fb28	orr w8,wzr,#0x30
0095fb2c	strh w8,[sp, #0x8]
0095fb30	ldrsw x8,[x19, #0x13c]
0095fb34	add x24,x21,#0x6
0095fb38	cmp x24,x8
0095fb3c	b.ls 0x0095fb48
0095fb40	mov w22,#0x47
0095fb44	b 0x0095fbac
0095fb48	ldr x8,[x19, #0x150]
0095fb4c	mov w10,#0x7374
0095fb50	mov w9,#0x65
0095fb54	movk w10,#0x7a69, LSL #16
0095fb58	add x8,x8,x21
0095fb5c	add x0,sp,#0x8
0095fb60	strh w9,[x8, #0x4]
0095fb64	str w10,[x8]
0095fb68	bl 0x00c2ff50
0095fb6c	ldrsw x8,[x19, #0x13c]
0095fb70	add x21,x21,#0x7
0095fb74	add x9,x0,x21
0095fb78	cmp x9,x8
0095fb7c	b.ls 0x0095fb8c
0095fb80	mov w22,#0x47
0095fb84	mov x21,x24
0095fb88	b 0x0095fbac
0095fb8c	ldr x8,[x19, #0x150]
0095fb90	add x1,sp,#0x8
0095fb94	add x0,x8,x24
0095fb98	bl 0x00c31b90
0095fb9c	add x0,sp,#0x8
0095fba0	bl 0x00c2ff50
0095fba4	mov w22,wzr
0095fba8	add x21,x0,x21
0095fbac	ldr w3,[x19, #0x140]
0095fbb0	adrp x2,0x2c6000
0095fbb4	add x2,x2,#0xd41
0095fbb8	add x0,sp,#0x8
0095fbbc	mov w1,#0x40
0095fbc0	bl 0x00c31b70
0095fbc4	cbnz w22,0x0095fc40
0095fbc8	ldrsw x8,[x19, #0x13c]
0095fbcc	add x24,x21,#0x8
0095fbd0	cmp x24,x8
0095fbd4	b.ls 0x0095fbe0
0095fbd8	mov w22,#0x47
0095fbdc	b 0x0095fc40
0095fbe0	ldr x8,[x19, #0x150]
0095fbe4	mov x9,#0x6c62
0095fbe8	movk x9,#0x736b, LSL #16
0095fbec	movk x9,#0x7a69, LSL #32
0095fbf0	movk x9,#0x65, LSL #48
0095fbf4	add x0,sp,#0x8
0095fbf8	str x9,[x8, x21#0x0]
0095fbfc	bl 0x00c2ff50
0095fc00	ldrsw x8,[x19, #0x13c]
0095fc04	add x21,x21,#0x9
0095fc08	add x9,x0,x21
0095fc0c	cmp x9,x8
0095fc10	b.ls 0x0095fc20
0095fc14	mov w22,#0x47
0095fc18	mov x21,x24
0095fc1c	b 0x0095fc40
0095fc20	ldr x8,[x19, #0x150]
0095fc24	add x1,sp,#0x8
0095fc28	add x0,x8,x24
0095fc2c	bl 0x00c31b90
0095fc30	add x0,sp,#0x8
0095fc34	bl 0x00c2ff50
0095fc38	mov w22,wzr
0095fc3c	add x21,x0,x21
0095fc40	ldr w3,[x19, #0x20]
0095fc44	adrp x2,0x2c6000
0095fc48	add x2,x2,#0xd41
0095fc4c	add x0,sp,#0x8
0095fc50	mov w1,#0x40
0095fc54	bl 0x00c31b70
0095fc58	cbnz w22,0x0095fca0
0095fc5c	ldrsw x8,[x19, #0x13c]
0095fc60	add x22,x21,#0x8
0095fc64	cmp x22,x8
0095fc68	b.hi 0x0095fca0
0095fc6c	ldr x8,[x19, #0x150]
0095fc70	mov x9,#0x6974
0095fc74	movk x9,#0x656d, LSL #16
0095fc78	movk x9,#0x756f, LSL #32
0095fc7c	movk x9,#0x74, LSL #48
0095fc80	add x0,sp,#0x8
0095fc84	str x9,[x8, x21#0x0]
0095fc88	bl 0x00c2ff50
0095fc8c	ldrsw x8,[x19, #0x13c]
0095fc90	add x21,x21,#0x9
0095fc94	add x9,x0,x21
0095fc98	cmp x9,x8
0095fc9c	b.ls 0x0095fccc
0095fca0	adrp x1,0x2bf000
0095fca4	add x1,x1,#0x440
0095fca8	mov x0,x20
0095fcac	bl 0x00904b80
0095fcb0	adrp x8,0xcc4000
0095fcb4	add x8,x8,#0x678
0095fcb8	ldr x0,[sp]
0095fcbc	ldr x8,[x8]
0095fcc0	blr x8
0095fcc4	mov w0,#0x47
0095fcc8	b 0x0095fa0c
0095fccc	ldr x8,[x19, #0x150]
0095fcd0	add x1,sp,#0x8
0095fcd4	add x0,x8,x22
0095fcd8	bl 0x00c31b90
0095fcdc	add x0,sp,#0x8
0095fce0	bl 0x00c2ff50
0095fce4	add x21,x0,x21
0095fce8	ldr x8,[x20, #0x20]
0095fcec	ldr w0,[x19, #0x18]
0095fcf0	ldr x1,[x19, #0x150]
0095fcf4	mov x2,x21
0095fcf8	ldr x8,[x8, #0x38]
0095fcfc	mov w3,wzr
0095fd00	ldr w5,[x8, #0xc]
0095fd04	add x4,x8,#0x10
0095fd08	bl 0x00c320d0
0095fd0c	cmp x0,x21
0095fd10	b.eq 0x0095fd3c
0095fd14	bl 0x00c30710
0095fd18	ldr w0,[x0]
0095fd1c	add x1,sp,#0x8
0095fd20	mov w2,#0x100
0095fd24	bl 0x00941a94
0095fd28	adrp x1,0x2b6000
0095fd2c	mov x2,x0
0095fd30	add x1,x1,#0xc62
0095fd34	mov x0,x20
0095fd38	bl 0x00904b80
0095fd3c	adrp x8,0xcc4000
0095fd40	add x8,x8,#0x678
0095fd44	ldr x0,[sp]
0095fd48	ldr x8,[x8]
0095fd4c	blr x8
0095fd50	b 0x0095f93c
0095fd54	bl 0x00c2fec0
