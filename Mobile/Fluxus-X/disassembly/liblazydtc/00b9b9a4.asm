; mbedtls_ecdsa_sign_det_restartable @ 00b9b9a4
00b9b9a4	sub sp,sp,#0x1b0
00b9b9a8	stp x28,x27,[sp, #0x150]
00b9b9ac	stp x26,x25,[sp, #0x160]
00b9b9b0	stp x24,x23,[sp, #0x170]
00b9b9b4	stp x22,x21,[sp, #0x180]
00b9b9b8	stp x20,x19,[sp, #0x190]
00b9b9bc	stp x29,x30,[sp, #0x1a0]
00b9b9c0	add x29,sp,#0x1a0
00b9b9c4	mrs x23,tpidr_el0
00b9b9c8	ldr x8,[x23, #0x28]
00b9b9cc	mov x24,x0
00b9b9d0	mov x27,x7
00b9b9d4	mov x19,x5
00b9b9d8	stur x8,[x29, #-0x60]
00b9b9dc	ldr x21,[x0, #0x80]
00b9b9e0	mov w0,w6
00b9b9e4	mov x20,x4
00b9b9e8	mov x22,x3
00b9b9ec	mov x28,x2
00b9b9f0	mov x25,x1
00b9b9f4	bl 0x00c30210
00b9b9f8	mov x26,x0
00b9b9fc	cbz x0,0x00b9ba74
00b9ba00	add x8,x21,#0x7
00b9ba04	add x0,sp,#0x28
00b9ba08	stp x28,x27,[sp, #0x18]
00b9ba0c	lsr x27,x8,#0x3
00b9ba10	bl 0x00c41c00
00b9ba14	add x0,sp,#0xc0
00b9ba18	bl 0x00c42890
00b9ba1c	add x1,sp,#0x3c
00b9ba20	mov x0,x22
00b9ba24	mov x2,x27
00b9ba28	bl 0x00c41d80
00b9ba2c	mov w28,w0
00b9ba30	cbnz w0,0x00b9ba60
00b9ba34	ldr x8,[x24, #0x80]
00b9ba38	add x0,sp,#0x28
00b9ba3c	mov x1,x20
00b9ba40	add x8,x8,#0x7
00b9ba44	lsr x8,x8,#0x3
00b9ba48	cmp x8,x19
00b9ba4c	csel x21,x8,x19,cc
00b9ba50	mov x2,x21
00b9ba54	bl 0x00c41ca0
00b9ba58	mov w28,w0
00b9ba5c	cbz w0,0x00b9baac
00b9ba60	add x0,sp,#0xc0
00b9ba64	bl 0x00c42880
00b9ba68	add x0,sp,#0x28
00b9ba6c	bl 0x00c41bb0
00b9ba70	b 0x00b9ba78
00b9ba74	mov w28,#0xffffb080
00b9ba78	ldr x8,[x23, #0x28]
00b9ba7c	ldur x9,[x29, #-0x60]
00b9ba80	cmp x8,x9
00b9ba84	b.ne 0x00b9bb68
00b9ba88	mov w0,w28
00b9ba8c	ldp x29,x30,[sp, #0x1a0]
00b9ba90	ldp x20,x19,[sp, #0x190]
00b9ba94	ldp x22,x21,[sp, #0x180]
00b9ba98	ldp x24,x23,[sp, #0x170]
00b9ba9c	ldp x26,x25,[sp, #0x160]
00b9baa0	ldp x28,x27,[sp, #0x150]
00b9baa4	add sp,sp,#0x1b0
00b9baa8	ret
00b9baac	ldr x8,[x24, #0x80]
00b9bab0	lsl x9,x21,#0x3
00b9bab4	subs x1,x9,x8
00b9bab8	b.ls 0x00b9bacc
00b9babc	add x0,sp,#0x28
00b9bac0	bl 0x00c41d10
00b9bac4	mov w28,w0
00b9bac8	cbnz w0,0x00b9ba60
00b9bacc	add x28,x24,#0x68
00b9bad0	add x0,sp,#0x28
00b9bad4	mov x1,x28
00b9bad8	bl 0x00c41b50
00b9badc	tbnz w0,#0x1f,0x00b9baf8
00b9bae0	add x0,sp,#0x28
00b9bae4	add x1,sp,#0x28
00b9bae8	mov x2,x28
00b9baec	bl 0x00c41d60
00b9baf0	mov w28,w0
00b9baf4	cbnz w0,0x00b9ba60
00b9baf8	add x8,sp,#0x3c
00b9bafc	add x1,x8,x27
00b9bb00	add x0,sp,#0x28
00b9bb04	mov x2,x27
00b9bb08	bl 0x00c41d80
00b9bb0c	mov w28,w0
00b9bb10	cbnz w0,0x00b9ba60
00b9bb14	lsl x3,x27,#0x1
00b9bb18	add x0,sp,#0xc0
00b9bb1c	add x2,sp,#0x3c
00b9bb20	mov x1,x26
00b9bb24	bl 0x00c428b0
00b9bb28	mov w28,w0
00b9bb2c	cbnz w0,0x00b9ba60
00b9bb30	adrp x6,0xcb5000
00b9bb34	ldr x8,[x29, #0x10]
00b9bb38	ldr x6,[x6, #0xaa8]
00b9bb3c	ldp x2,x9,[sp, #0x18]
00b9bb40	add x7,sp,#0xc0
00b9bb44	mov x0,x24
00b9bb48	mov x1,x25
00b9bb4c	mov x3,x22
00b9bb50	mov x4,x20
00b9bb54	mov x5,x19
00b9bb58	stp x9,x8,[sp]
00b9bb5c	bl 0x00c42540
00b9bb60	mov w28,w0
00b9bb64	b 0x00b9ba60
00b9bb68	bl 0x00c2fec0
