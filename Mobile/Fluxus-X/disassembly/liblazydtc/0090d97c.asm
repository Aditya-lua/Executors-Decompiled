; FUN_0090d97c @ 0090d97c
0090d97c	sub sp,sp,#0x50
0090d980	stp x24,x23,[sp, #0x10]
0090d984	stp x22,x21,[sp, #0x20]
0090d988	stp x20,x19,[sp, #0x30]
0090d98c	stp x29,x30,[sp, #0x40]
0090d990	add x29,sp,#0x40
0090d994	mrs x24,tpidr_el0
0090d998	ldr x8,[x24, #0x28]
0090d99c	mov x23,x3
0090d9a0	mov w21,w2
0090d9a4	mov x22,x1
0090d9a8	mov x20,x0
0090d9ac	str x8,[sp, #0x8]
0090d9b0	str xzr,[sp]
0090d9b4	bl 0x00906f54
0090d9b8	adrp x8,0xcc4000
0090d9bc	add x8,x8,#0x690
0090d9c0	mov w0,#0x1
0090d9c4	mov w1,#0x138
0090d9c8	ldr x8,[x8]
0090d9cc	blr x8
0090d9d0	mov x19,x0
0090d9d4	cbz x0,0x0090da18
0090d9d8	ldrb w8,[x22, #0x572]
0090d9dc	ldrb w9,[x19, #0x134]
0090d9e0	adrp x1,0xcc4000
0090d9e4	add x1,x1,#0xa88
0090d9e8	str w8,[x19]
0090d9ec	ldr w8,[x23]
0090d9f0	and w9,w9,#0xfffffffd
0090d9f4	mov x0,sp
0090d9f8	mov x2,x19
0090d9fc	str w8,[x19, #0x98]
0090da00	strb w9,[x19, #0x134]
0090da04	bl 0x00907328
0090da08	mov w23,w0
0090da0c	cbz w0,0x0090da68
0090da10	ldr x0,[sp]
0090da14	b 0x0090da1c
0090da18	mov w23,#0x1b
0090da1c	adrp x20,0xcc4000
0090da20	add x20,x20,#0x678
0090da24	ldr x8,[x20]
0090da28	blr x8
0090da2c	ldr x8,[x20]
0090da30	mov x0,x19
0090da34	str xzr,[sp]
0090da38	blr x8
0090da3c	ldr x8,[x24, #0x28]
0090da40	ldr x9,[sp, #0x8]
0090da44	cmp x8,x9
0090da48	b.ne 0x0090db18
0090da4c	mov w0,w23
0090da50	ldp x29,x30,[sp, #0x40]
0090da54	ldp x20,x19,[sp, #0x30]
0090da58	ldp x22,x21,[sp, #0x20]
0090da5c	ldp x24,x23,[sp, #0x10]
0090da60	add sp,sp,#0x50
0090da64	ret
0090da68	ldr x3,[sp]
0090da6c	mov x0,x20
0090da70	mov x1,x22
0090da74	mov w2,w21
0090da78	bl 0x0090738c
0090da7c	ldr w8,[x19, #0x98]
0090da80	add x9,x22,w21, SXTW  #0x2
0090da84	mov x1,x20
0090da88	str w8,[x9, #0x220]
0090da8c	ldr x0,[sp]
0090da90	bl 0x0090db1c
0090da94	ldrb w8,[x19, #0x134]
0090da98	orr w8,w8,#0x8
0090da9c	strb w8,[x19, #0x134]
0090daa0	bl 0x00941cb8
0090daa4	stp x0,x1,[x19, #0x110]
0090daa8	ldr x1,[sp]
0090daac	ldrb w8,[x1, #0x24]
0090dab0	orr w8,w8,#0x1
0090dab4	strb w8,[x1, #0x24]
0090dab8	cbz x20,0x0090db10
0090dabc	ldrb w8,[x20, #0xa85]
0090dac0	mov w23,wzr
0090dac4	tbz w8,#0x4,0x0090da3c
0090dac8	ldr x8,[x20, #0x12a0]
0090dacc	cbz x8,0x0090dae8
0090dad0	cbz x1,0x0090db10
0090dad4	ldr w8,[x8, #0x8]
0090dad8	mov w23,wzr
0090dadc	cmp w8,#0x0
0090dae0	b.gt 0x0090daec
0090dae4	b 0x0090da3c
0090dae8	cbz x1,0x0090db10
0090daec	ldr x8,[x1]
0090daf0	ldr w8,[x8, #0xc]
0090daf4	cmp w8,#0x1
0090daf8	b.lt 0x0090db10
0090dafc	ldr w3,[x19, #0x98]
0090db00	adrp x2,0x2c8000
0090db04	add x2,x2,#0xce3
0090db08	mov x0,x20
0090db0c	bl 0x00904ddc
0090db10	mov w23,wzr
0090db14	b 0x0090da3c
0090db18	bl 0x00c2fec0
