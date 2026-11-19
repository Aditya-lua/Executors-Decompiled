; FUN_0089def0 @ 0089def0
0089def0	stp x29,x30,[sp, #-0x20]!
0089def4	str x19,[sp, #0x10]
0089def8	mov x29,sp
0089defc	ldp x8,x9,[x0, #0x8]
0089df00	mov x19,x0
0089df04	cmp x8,x9
0089df08	b.cs 0x0089df54
0089df0c	ldr x9,[x1]
0089df10	ldur q0,[x1, #0x8]
0089df14	add x0,x8,#0x38
0089df18	str x9,[x8]
0089df1c	ldr x9,[x1, #0x18]
0089df20	stur q0,[x8, #0x8]
0089df24	str x9,[x8, #0x18]
0089df28	ldrb w9,[x1, #0x30]
0089df2c	ldr q0,[x1, #0x20]
0089df30	stp xzr,xzr,[x1, #0x10]
0089df34	str xzr,[x1, #0x8]
0089df38	strb w9,[x8, #0x30]
0089df3c	mov w9,#0x40
0089df40	str q0,[x8, #0x20]
0089df44	str xzr,[x1]
0089df48	stp xzr,xzr,[x1, #0x20]
0089df4c	strb w9,[x1, #0x30]
0089df50	b 0x0089df5c
0089df54	mov x0,x19
0089df58	bl 0x0089f9c8
0089df5c	str x0,[x19, #0x8]
0089df60	ldr x19,[sp, #0x10]
0089df64	ldp x29,x30,[sp], #0x20
0089df68	ret
