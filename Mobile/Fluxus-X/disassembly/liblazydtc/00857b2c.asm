; FUN_00857b2c @ 00857b2c
00857b2c	stp x29,x30,[sp, #-0x40]!
00857b30	stp x28,x23,[sp, #0x10]
00857b34	stp x22,x21,[sp, #0x20]
00857b38	stp x20,x19,[sp, #0x30]
00857b3c	mov x29,sp
00857b40	sub sp,sp,#0x4f0
00857b44	mrs x22,tpidr_el0
00857b48	mov x20,x1
00857b4c	mov x21,x0
00857b50	mov x19,x8
00857b54	ldr x8,[x22, #0x28]
00857b58	mov x5,x4
00857b5c	mov x4,x3
00857b60	mov x3,x2
00857b64	mov x9,sp
00857b68	mov x0,sp
00857b6c	mov x1,x21
00857b70	mov x2,x20
00857b74	stur x8,[x29, #-0x8]
00857b78	add x23,x9,#0x108
00857b7c	bl 0x008583f0
00857b80	mov x0,sp
00857b84	bl 0x00857d50
00857b88	ldr w8,[sp, #0x9c]
00857b8c	cbz x20,0x00857ba4
00857b90	add x9,x21,x20
00857b94	ldurb w9,[x9, #-0x1]
00857b98	cmp w9,#0xa
00857b9c	cset w9,ne
00857ba0	b 0x00857ba8
00857ba4	mov w9,wzr
00857ba8	add w8,w9,w8
00857bac	ldr q0,[x23]
00857bb0	movi v1.2D,#0x0
00857bb4	stp x0,x8,[x19]
00857bb8	ldr x8,[sp, #0x118]
00857bbc	ldr x9,[sp, #0x100]
00857bc0	str q0,[x19, #0x10]
00857bc4	ldr q0,[sp, #0x1d0]
00857bc8	ldr x10,[sp, #0x4b0]
00857bcc	str x8,[x19, #0x20]
00857bd0	ldr x8,[sp, #0x1e0]
00857bd4	stur q0,[x19, #0x28]
00857bd8	ldr q0,[sp, #0xf0]
00857bdc	str x8,[x19, #0x38]
00857be0	ldr x8,[sp, #0x4c8]
00857be4	str q0,[x19, #0x40]
00857be8	ldr q0,[x23, #0x3b0]
00857bec	str x8,[x19, #0x70]
00857bf0	ldrb w8,[sp, #0x4e0]
00857bf4	str q0,[x19, #0x60]
00857bf8	ldr q0,[sp, #0x4d0]
00857bfc	strb w8,[x19, #0x88]
00857c00	mov w8,#0x40
00857c04	str xzr,[x23, #0x10]
00857c08	str q1,[x23]
00857c0c	str q1,[sp, #0x1d0]
00857c10	str xzr,[sp, #0x100]
00857c14	str q1,[sp, #0xf0]
00857c18	stp x9,x10,[x19, #0x50]
00857c1c	str q1,[x23, #0x3b0]
00857c20	str xzr,[x23, #0x3c0]
00857c24	stur q0,[x19, #0x78]
00857c28	str xzr,[sp, #0x1e0]
00857c2c	str xzr,[sp, #0x4b0]
00857c30	str q1,[sp, #0x4d0]
00857c34	strb w8,[sp, #0x4e0]
00857c38	mov x0,sp
00857c3c	bl 0x00857f44
00857c40	ldr x8,[x22, #0x28]
00857c44	ldur x9,[x29, #-0x8]
00857c48	cmp x8,x9
00857c4c	b.ne 0x00857d48
00857c50	add sp,sp,#0x4f0
00857c54	ldp x20,x19,[sp, #0x30]
00857c58	ldp x22,x21,[sp, #0x20]
00857c5c	ldp x28,x23,[sp, #0x10]
00857c60	ldp x29,x30,[sp], #0x40
00857c64	ret
00857d48	bl 0x00c2fec0
