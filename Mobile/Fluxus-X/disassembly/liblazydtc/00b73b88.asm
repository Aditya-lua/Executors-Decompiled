; FUN_00b73b88 @ 00b73b88
00b73b88	sub sp,sp,#0x80
00b73b8c	stp x24,x23,[sp, #0x40]
00b73b90	stp x22,x21,[sp, #0x50]
00b73b94	stp x20,x19,[sp, #0x60]
00b73b98	stp x29,x30,[sp, #0x70]
00b73b9c	add x29,sp,#0x70
00b73ba0	mrs x23,tpidr_el0
00b73ba4	ldr x8,[x23, #0x28]
00b73ba8	mov x20,x1
00b73bac	mov x19,x0
00b73bb0	movi v0.2D,#0x0
00b73bb4	add x21,x0,#0x28
00b73bb8	str x8,[sp, #0x38]
00b73bbc	orr w8,wzr,#0xc
00b73bc0	stp q0,q0,[sp, #0x10]
00b73bc4	str q0,[sp]
00b73bc8	ldr w9,[x19, x8#0x0]
00b73bcc	rev w9,w9
00b73bd0	add w9,w9,#0x1
00b73bd4	rev w10,w9
00b73bd8	str w10,[x19, x8#0x0]
00b73bdc	cbz x8,0x00b73be8
00b73be0	sub x8,x8,#0x4
00b73be4	cbz w9,0x00b73bc8
00b73be8	mov w1,#0x1
00b73bec	mov x3,sp
00b73bf0	mov x0,x21
00b73bf4	mov x2,x19
00b73bf8	mov x24,sp
00b73bfc	bl 0x00c418e0
00b73c00	mov w22,w0
00b73c04	cbnz w0,0x00b73ce4
00b73c08	add x3,x24,#0x10
00b73c0c	orr w8,wzr,#0xc
00b73c10	ldr w9,[x19, x8#0x0]
00b73c14	rev w9,w9
00b73c18	add w9,w9,#0x1
00b73c1c	rev w10,w9
00b73c20	str w10,[x19, x8#0x0]
00b73c24	cbz x8,0x00b73c30
00b73c28	sub x8,x8,#0x4
00b73c2c	cbz w9,0x00b73c10
00b73c30	mov w1,#0x1
00b73c34	mov x0,x21
00b73c38	mov x2,x19
00b73c3c	bl 0x00c418e0
00b73c40	mov w22,w0
00b73c44	cbnz w0,0x00b73ce4
00b73c48	mov x8,sp
00b73c4c	add x3,x8,#0x20
00b73c50	orr w8,wzr,#0xc
00b73c54	ldr w9,[x19, x8#0x0]
00b73c58	rev w9,w9
00b73c5c	add w9,w9,#0x1
00b73c60	rev w10,w9
00b73c64	str w10,[x19, x8#0x0]
00b73c68	cbz x8,0x00b73c74
00b73c6c	sub x8,x8,#0x4
00b73c70	cbz w9,0x00b73c54
00b73c74	mov w1,#0x1
00b73c78	mov x0,x21
00b73c7c	mov x2,x19
00b73c80	bl 0x00c418e0
00b73c84	mov w22,w0
00b73c88	cbnz w0,0x00b73ce4
00b73c8c	ldr q0,[sp]
00b73c90	ldr q1,[x20]
00b73c94	mov x1,sp
00b73c98	mov w2,#0x100
00b73c9c	mov x0,x21
00b73ca0	eor v0.16B,v1.16B,v0.16B
00b73ca4	str q0,[sp]
00b73ca8	ldr q0,[sp, #0x10]
00b73cac	ldr q1,[x20, #0x10]
00b73cb0	eor v0.16B,v1.16B,v0.16B
00b73cb4	str q0,[sp, #0x10]
00b73cb8	ldr q0,[sp, #0x20]
00b73cbc	ldr q1,[x20, #0x20]
00b73cc0	mov x20,sp
00b73cc4	eor v0.16B,v1.16B,v0.16B
00b73cc8	str q0,[sp, #0x20]
00b73ccc	bl 0x00c41940
00b73cd0	mov w22,w0
00b73cd4	cbnz w0,0x00b73ce4
00b73cd8	add x8,x20,#0x20
00b73cdc	ldr q0,[x8]
00b73ce0	str q0,[x19]
00b73ce4	mov x0,sp
00b73ce8	orr w1,wzr,#0x30
00b73cec	bl 0x00c42220
00b73cf0	ldr x8,[x23, #0x28]
00b73cf4	ldr x9,[sp, #0x38]
00b73cf8	cmp x8,x9
00b73cfc	b.ne 0x00b73d1c
00b73d00	mov w0,w22
00b73d04	ldp x29,x30,[sp, #0x70]
00b73d08	ldp x20,x19,[sp, #0x60]
00b73d0c	ldp x22,x21,[sp, #0x50]
00b73d10	ldp x24,x23,[sp, #0x40]
00b73d14	add sp,sp,#0x80
00b73d18	ret
00b73d1c	bl 0x00c2fec0
