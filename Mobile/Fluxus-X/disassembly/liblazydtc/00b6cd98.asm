; mbedtls_chacha20_self_test @ 00b6cd98
00b6cd98	str x28,[sp, #-0x50]!
00b6cd9c	stp x24,x23,[sp, #0x10]
00b6cda0	stp x22,x21,[sp, #0x20]
00b6cda4	stp x20,x19,[sp, #0x30]
00b6cda8	stp x29,x30,[sp, #0x40]
00b6cdac	add x29,sp,#0x40
00b6cdb0	sub sp,sp,#0x220
00b6cdb4	mrs x23,tpidr_el0
00b6cdb8	ldr x8,[x23, #0x28]
00b6cdbc	sub x9,x29,#0xd0
00b6cdc0	mov w19,w0
00b6cdc4	add x20,x9,#0x40
00b6cdc8	stur x8,[x29, #-0x48]
00b6cdcc	cbz w0,0x00b6cde0
00b6cdd0	adrp x0,0x2da000
00b6cdd4	add x0,x0,#0xcdd
00b6cdd8	mov w1,wzr
00b6cddc	bl 0x00c41af0
00b6cde0	sub x0,x29,#0xd0
00b6cde4	mov w1,#0x40
00b6cde8	mov w21,#0x40
00b6cdec	bl 0x00c42220
00b6cdf0	mov w1,#0x40
00b6cdf4	mov x0,x20
00b6cdf8	bl 0x00c42220
00b6cdfc	adrp x8,0x29c000
00b6ce00	ldr q1,[x8, #0x450]
00b6ce04	movi v0.2D,#0x0
00b6ce08	mov w1,#0x40
00b6ce0c	mov x0,x20
00b6ce10	stur x21,[x29, #-0x50]
00b6ce14	str q1,[sp]
00b6ce18	stp q1,q0,[x29, #-0xd0]
00b6ce1c	stp q0,q0,[x29, #-0xb0]
00b6ce20	bl 0x00c42220
00b6ce24	adrp x22,0x77c000
00b6ce28	add x22,x22,#0x9e8
00b6ce2c	sub x0,x29,#0xd0
00b6ce30	mov w1,#0x40
00b6ce34	add x3,sp,#0x10
00b6ce38	mov x2,x22
00b6ce3c	stur x21,[x29, #-0x50]
00b6ce40	bl 0x00c420b0
00b6ce44	sub x0,x29,#0xd0
00b6ce48	mov w1,#0x88
00b6ce4c	bl 0x00c42220
00b6ce50	adrp x21,0x77c000
00b6ce54	add x21,x21,#0xcd6
00b6ce58	add x0,sp,#0x10
00b6ce5c	mov w2,#0x40
00b6ce60	mov x1,x21
00b6ce64	bl 0x00c300b0
00b6ce68	cbnz w0,0x00b6cf14
00b6ce6c	cbz w19,0x00b6ce8c
00b6ce70	adrp x0,0x77c000
00b6ce74	add x0,x0,#0x87c
00b6ce78	bl 0x00c30760
00b6ce7c	adrp x0,0x2da000
00b6ce80	add x0,x0,#0xcdd
00b6ce84	mov w1,#0x1
00b6ce88	bl 0x00c41af0
00b6ce8c	sub x0,x29,#0xd0
00b6ce90	mov w1,#0x40
00b6ce94	mov w24,#0x40
00b6ce98	bl 0x00c42220
00b6ce9c	mov w1,#0x40
00b6cea0	mov x0,x20
00b6cea4	bl 0x00c42220
00b6cea8	ldr q0,[sp]
00b6ceac	adrp x8,0x29c000
00b6ceb0	orr x9,xzr,#0x200000000000000
00b6ceb4	mov w1,#0x40
00b6ceb8	stur q0,[x29, #-0xd0]
00b6cebc	ldr q0,[x8, #0x930]
00b6cec0	mov w8,#0x1
00b6cec4	mov x0,x20
00b6cec8	stur x24,[x29, #-0x50]
00b6cecc	stp xzr,xzr,[x29, #-0xc0]
00b6ced0	stur q0,[x29, #-0xb0]
00b6ced4	stp x8,x9,[x29, #-0xa0]
00b6ced8	bl 0x00c42220
00b6cedc	add x2,x22,#0x177
00b6cee0	sub x0,x29,#0xd0
00b6cee4	mov w1,#0x177
00b6cee8	add x3,sp,#0x10
00b6ceec	stur x24,[x29, #-0x50]
00b6cef0	bl 0x00c420b0
00b6cef4	sub x0,x29,#0xd0
00b6cef8	mov w1,#0x88
00b6cefc	bl 0x00c42220
00b6cf00	add x1,x21,#0x177
00b6cf04	add x0,sp,#0x10
00b6cf08	mov w2,#0x177
00b6cf0c	bl 0x00c300b0
00b6cf10	cbz w0,0x00b6cf54
00b6cf14	cbz w19,0x00b6cf24
00b6cf18	adrp x0,0x77c000
00b6cf1c	add x0,x0,#0x85c
00b6cf20	bl 0x00c30760
00b6cf24	mov w0,#0xffffffff
00b6cf28	ldr x8,[x23, #0x28]
00b6cf2c	ldur x9,[x29, #-0x48]
00b6cf30	cmp x8,x9
00b6cf34	b.ne 0x00b6cf74
00b6cf38	add sp,sp,#0x220
00b6cf3c	ldp x29,x30,[sp, #0x40]
00b6cf40	ldp x20,x19,[sp, #0x30]
00b6cf44	ldp x22,x21,[sp, #0x20]
00b6cf48	ldp x24,x23,[sp, #0x10]
00b6cf4c	ldr x28,[sp], #0x50
00b6cf50	ret
00b6cf54	cbz w19,0x00b6cf6c
00b6cf58	adrp x0,0x77c000
00b6cf5c	add x0,x0,#0x87c
00b6cf60	bl 0x00c30760
00b6cf64	mov w0,#0xa
00b6cf68	bl 0x00c42240
00b6cf6c	mov w0,wzr
00b6cf70	b 0x00b6cf28
00b6cf74	bl 0x00c2fec0
