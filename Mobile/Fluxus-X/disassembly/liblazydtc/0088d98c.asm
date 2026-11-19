; FUN_0088d98c @ 0088d98c
0088d98c	stp x29,x30,[sp, #-0x30]!
0088d990	stp x22,x21,[sp, #0x10]
0088d994	stp x20,x19,[sp, #0x20]
0088d998	mov x29,sp
0088d99c	ldr w8,[x2]
0088d9a0	mov w19,w3
0088d9a4	mov x20,x0
0088d9a8	cmp w8,#0x3
0088d9ac	b.gt 0x0088da24
0088d9b0	cmp w8,#0x1
0088d9b4	b.eq 0x0088da58
0088d9b8	cmp w8,#0x2
0088d9bc	b.eq 0x0088dae8
0088d9c0	cmp w8,#0x3
0088d9c4	b.ne 0x0088dad8
0088d9c8	mov x8,#-0x3f20000000000000
0088d9cc	ldr d0,[x2, #0x8]
0088d9d0	fmov d1,x8
0088d9d4	fcmp d0,d1
0088d9d8	b.lt 0x0088da10
0088d9dc	mov x8,#0xffc000000000
0088d9e0	movk x8,#0x40df, LSL #48
0088d9e4	fmov d1,x8
0088d9e8	fcmp d0,d1
0088d9ec	b.hi 0x0088da10
0088d9f0	fcvtzs w3,d0
0088d9f4	scvtf d1,w3
0088d9f8	fcmp d0,d1
0088d9fc	b.ne 0x0088da10
0088da00	fcmp d0,#0.0
0088da04	b.ne 0x0088db34
0088da08	fmov x8,d0
0088da0c	tbz x8,#0x3f,0x0088db34
0088da10	ldr x0,[x20]
0088da14	mov x22,x1
0088da18	bl 0x00874f18
0088da1c	tbz w0,#0x1f,0x0088da84
0088da20	b 0x0088db24
0088da24	cmp w8,#0x4
0088da28	b.eq 0x0088da6c
0088da2c	cmp w8,#0x5
0088da30	b.eq 0x0088db0c
0088da34	cmp w8,#0x6
0088da38	b.ne 0x0088dad8
0088da3c	mov x22,x1
0088da40	ldr x0,[x20]
0088da44	ldr x1,[x2, #0x8]
0088da48	ldr w2,[x2, #0x4]
0088da4c	bl 0x00875070
0088da50	tbz w0,#0x1f,0x0088da84
0088da54	b 0x0088db24
0088da58	ldr x0,[x20]
0088da5c	mov w1,#0x2
0088da60	mov w2,w19
0088da64	mov w3,wzr
0088da68	b 0x0088daf8
0088da6c	ldp s0,s1,[x2, #0x8]
0088da70	mov x22,x1
0088da74	ldp s2,s3,[x2, #0x10]
0088da78	ldr x0,[x20]
0088da7c	bl 0x00874f8c
0088da80	tbnz w0,#0x1f,0x0088db24
0088da84	mov w21,w0
0088da88	lsr w8,w0,#0xf
0088da8c	ldr x0,[x20]
0088da90	cbnz w8,0x0088dab0
0088da94	mov w1,#0x5
0088da98	mov w2,w19
0088da9c	mov w3,w21
0088daa0	ldp x20,x19,[sp, #0x20]
0088daa4	ldp x22,x21,[sp, #0x10]
0088daa8	ldp x29,x30,[sp], #0x30
0088daac	b 0x00875cac
0088dab0	mov w1,#0x42
0088dab4	mov w2,w19
0088dab8	mov w3,wzr
0088dabc	bl 0x00875cac
0088dac0	ldr x0,[x20]
0088dac4	mov w1,w21
0088dac8	ldp x20,x19,[sp, #0x20]
0088dacc	ldp x22,x21,[sp, #0x10]
0088dad0	ldp x29,x30,[sp], #0x30
0088dad4	b 0x00875d18
0088dad8	ldp x20,x19,[sp, #0x20]
0088dadc	ldp x22,x21,[sp, #0x10]
0088dae0	ldp x29,x30,[sp], #0x30
0088dae4	ret
0088dae8	ldr x0,[x20]
0088daec	ldrb w3,[x2, #0x8]
0088daf0	mov w1,#0x3
0088daf4	mov w2,w19
0088daf8	mov w4,wzr
0088dafc	ldp x20,x19,[sp, #0x20]
0088db00	ldp x22,x21,[sp, #0x10]
0088db04	ldp x29,x30,[sp], #0x30
0088db08	b 0x00875b54
0088db0c	ldp d0,d1,[x2, #0x8]
0088db10	mov x22,x1
0088db14	ldp d2,d3,[x2, #0x18]
0088db18	ldr x0,[x20]
0088db1c	bl 0x00875004
0088db20	tbz w0,#0x1f,0x0088da84
0088db24	adrp x1,0x2a7000
0088db28	add x1,x1,#0x164
0088db2c	add x0,x22,#0xc
0088db30	bl 0x0087fcd8
0088db34	ldr x0,[x20]
0088db38	mov w1,#0x4
0088db3c	mov w2,w19
0088db40	b 0x0088daa0
