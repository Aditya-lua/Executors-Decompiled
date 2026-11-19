; FUN_0086d8c0 @ 0086d8c0
0086d8c0	sub sp,sp,#0xb0
0086d8c4	stp x29,x30,[sp, #0x50]
0086d8c8	stp x28,x27,[sp, #0x60]
0086d8cc	stp x26,x25,[sp, #0x70]
0086d8d0	stp x24,x23,[sp, #0x80]
0086d8d4	stp x22,x21,[sp, #0x90]
0086d8d8	stp x20,x19,[sp, #0xa0]
0086d8dc	add x29,sp,#0x50
0086d8e0	mrs x28,tpidr_el0
0086d8e4	mov x19,x0
0086d8e8	ldr x8,[x28, #0x28]
0086d8ec	stur x8,[x29, #-0x8]
0086d8f0	ldur q0,[x0, #0x94]
0086d8f4	stur q0,[x29, #-0x20]
0086d8f8	bl 0x00858f2c
0086d8fc	adrp x8,0xd1e000
0086d900	ldrb w8,[x8, #0xce0]
0086d904	cmp w8,#0x1
0086d908	b.ne 0x0086d964
0086d90c	ldr w8,[x19, #0x90]
0086d910	cmp w8,#0x12e
0086d914	b.ne 0x0086d92c
0086d918	sub x1,x29,#0x20
0086d91c	mov x0,x19
0086d920	bl 0x0086dc74
0086d924	mov x24,x0
0086d928	b 0x0086dac8
0086d92c	cmp w8,#0x119
0086d930	b.ne 0x0086d964
0086d934	ldr x0,[x19, #0xa8]
0086d938	cbz x0,0x0086d964
0086d93c	adrp x1,0x2d2000
0086d940	add x1,x1,#0xbdf
0086d944	bl 0x00c301f0
0086d948	cbnz w0,0x0086d964
0086d94c	add x8,sp,#0x10
0086d950	add x0,x19,#0x70
0086d954	bl 0x00853d20
0086d958	ldr w8,[sp, #0x10]
0086d95c	cmp w8,#0x119
0086d960	b.eq 0x0086d918
0086d964	mov x0,x19
0086d968	mov w1,wzr
0086d96c	bl 0x0086060c
0086d970	ldr w24,[x19, #0x90]
0086d974	mov x21,x0
0086d978	cmp w24,#0x134
0086d97c	b.ne 0x0086d990
0086d980	mov x0,x19
0086d984	bl 0x00858f2c
0086d988	ldr x8,[x19, #0xb0]
0086d98c	b 0x0086d9a8
0086d990	adrp x2,0x2ae000
0086d994	add x2,x2,#0xfcf
0086d998	mov x0,x19
0086d99c	mov w1,#0x134
0086d9a0	bl 0x0086e3b4
0086d9a4	mov x8,#-0x1
0086d9a8	mov x0,x19
0086d9ac	mov w1,wzr
0086d9b0	str x8,[sp, #0x8]
0086d9b4	bl 0x0086060c
0086d9b8	ldr w20,[x19, #0x90]
0086d9bc	ldur x22,[x19, #0x94]
0086d9c0	mov x23,x0
0086d9c4	cmp w20,#0x127
0086d9c8	b.ne 0x0086da00
0086d9cc	ldr w25,[x19, #0x124]
0086d9d0	adrp x8,0xd1e000
0086d9d4	ldr w8,[x8, #0xba0]
0086d9d8	add w9,w25,#0x1
0086d9dc	cmp w9,w8
0086d9e0	str w9,[x19, #0x124]
0086d9e4	b.hi 0x0086dafc
0086d9e8	mov x0,x19
0086d9ec	bl 0x0086d8c0
0086d9f0	mov x26,x0
0086d9f4	str w25,[x19, #0x124]
0086d9f8	mov w25,#0x1
0086d9fc	b 0x0086da3c
0086da00	cmp w20,#0x126
0086da04	cset w25,eq
0086da08	b.ne 0x0086da18
0086da0c	mov x0,x19
0086da10	bl 0x00858f2c
0086da14	b 0x0086da2c
0086da18	adrp x2,0x2ae000
0086da1c	add x2,x2,#0xfcf
0086da20	mov x0,x19
0086da24	mov w1,#0x126
0086da28	bl 0x0086e3b4
0086da2c	mov x0,x19
0086da30	mov w1,wzr
0086da34	bl 0x0086060c
0086da38	mov x26,x0
0086da3c	ldur x8,[x29, #-0x20]
0086da40	ldur x9,[x26, #0x14]
0086da44	cmp w24,#0x134
0086da48	ldr x0,[x19, #0xe8]
0086da4c	mov w1,#0x80
0086da50	cset w27,eq
0086da54	stp x8,x9,[sp, #0x10]
0086da58	bl 0x0084e938
0086da5c	add x1,sp,#0x10
0086da60	mov x2,x21
0086da64	mov w3,w27
0086da68	mov x4,x23
0086da6c	mov w5,w25
0086da70	mov x6,x26
0086da74	mov x24,x0
0086da78	bl 0x0084f460
0086da7c	ldrb w8,[x19, #0x68]
0086da80	cmp w8,#0x1
0086da84	b.ne 0x0086dac8
0086da88	ldr x0,[x19, #0xe8]
0086da8c	cmp w20,#0x127
0086da90	mov w1,#0x20
0086da94	cset w21,eq
0086da98	bl 0x0084e938
0086da9c	ldr x1,[sp, #0x8]
0086daa0	mov x2,x22
0086daa4	mov w3,w21
0086daa8	mov x4,#-0x1
0086daac	mov x23,x0
0086dab0	bl 0x00851e98
0086dab4	add x0,x19,#0x4b0
0086dab8	add x1,sp,#0x10
0086dabc	str x24,[sp, #0x10]
0086dac0	bl 0x00860fa0
0086dac4	str x23,[x0]
0086dac8	ldr x8,[x28, #0x28]
0086dacc	ldur x9,[x29, #-0x8]
0086dad0	cmp x8,x9
0086dad4	b.ne 0x0086db24
0086dad8	mov x0,x24
0086dadc	ldp x20,x19,[sp, #0xa0]
0086dae0	ldp x22,x21,[sp, #0x90]
0086dae4	ldp x24,x23,[sp, #0x80]
0086dae8	ldp x26,x25,[sp, #0x70]
0086daec	ldp x28,x27,[sp, #0x60]
0086daf0	ldp x29,x30,[sp, #0x50]
0086daf4	add sp,sp,#0xb0
0086daf8	ret
0086dafc	ldr x8,[x28, #0x28]
0086db00	ldur x9,[x29, #-0x8]
0086db04	cmp x8,x9
0086db08	b.ne 0x0086db24
0086db0c	adrp x1,0x2a1000
0086db10	add x1,x1,#0x5df
0086db14	adrp x2,0x2d4000
0086db18	add x2,x2,#0xdc3
0086db1c	add x0,x19,#0x94
0086db20	bl 0x008578f8
0086db24	bl 0x00c2fec0
