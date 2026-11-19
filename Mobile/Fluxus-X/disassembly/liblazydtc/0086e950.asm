; FUN_0086e950 @ 0086e950
0086e950	stp x29,x30,[sp, #-0x50]!
0086e954	str x25,[sp, #0x10]
0086e958	stp x24,x23,[sp, #0x20]
0086e95c	stp x22,x21,[sp, #0x30]
0086e960	stp x20,x19,[sp, #0x40]
0086e964	mov x29,sp
0086e968	ldp x9,x8,[x0, #0x8]
0086e96c	mov x19,x0
0086e970	mov x22,x1
0086e974	cmp x9,x8
0086e978	b.cs 0x0086e994
0086e97c	ldr w8,[x22, #0x10]
0086e980	ldr q0,[x22]
0086e984	add x22,x9,#0x14
0086e988	str w8,[x9, #0x10]
0086e98c	str q0,[x9]
0086e990	b 0x0086ea44
0086e994	ldr x20,[x19]
0086e998	orr x11,xzr,#-0x3333333333333334
0086e99c	mov x10,#0x1
0086e9a0	movk x11,#0xcccd
0086e9a4	sub x23,x9,x20
0086e9a8	asr x9,x23,#0x2
0086e9ac	madd x10,x9,x11,x10
0086e9b0	orr x9,xzr,#-0x3333333333333334
0086e9b4	movk x9,#0xccc, LSL #48
0086e9b8	cmp x10,x9
0086e9bc	b.hi 0x0086ea60
0086e9c0	sub x21,x8,x20
0086e9c4	orr x12,xzr,#0x6666666666666666
0086e9c8	asr x8,x21,#0x2
0086e9cc	movk x12,#0x666, LSL #48
0086e9d0	mul x8,x8,x11
0086e9d4	lsl x11,x8,#0x1
0086e9d8	cmp x11,x10
0086e9dc	csel x10,x11,x10,hi
0086e9e0	cmp x8,x12
0086e9e4	csel x8,x10,x9,cc
0086e9e8	cmp x8,x9
0086e9ec	b.hi 0x0086ea64
0086e9f0	add x8,x8,x8, LSL #0x2
0086e9f4	lsl x24,x8,#0x2
0086e9f8	mov x0,x24
0086e9fc	bl 0x00c2fed0
0086ea00	ldr q0,[x22]
0086ea04	ldr w8,[x22, #0x10]
0086ea08	add x9,x0,x23
0086ea0c	mov x1,x20
0086ea10	mov x2,x23
0086ea14	mov x25,x0
0086ea18	str q0,[x9]
0086ea1c	add x24,x0,x24
0086ea20	add x22,x9,#0x14
0086ea24	str w8,[x9, #0x10]
0086ea28	bl 0x00c2ffd0
0086ea2c	stp x25,x22,[x19]
0086ea30	str x24,[x19, #0x10]
0086ea34	cbz x20,0x0086ea44
0086ea38	mov x0,x20
0086ea3c	mov x1,x21
0086ea40	bl 0x00c2fe80
0086ea44	str x22,[x19, #0x8]
0086ea48	ldp x20,x19,[sp, #0x40]
0086ea4c	ldr x25,[sp, #0x10]
0086ea50	ldp x22,x21,[sp, #0x30]
0086ea54	ldp x24,x23,[sp, #0x20]
0086ea58	ldp x29,x30,[sp], #0x50
0086ea5c	ret
0086ea60	bl 0x008704dc
0086ea64	bl 0x007fe1b8
