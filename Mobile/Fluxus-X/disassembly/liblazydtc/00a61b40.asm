; FUN_00a61b40 @ 00a61b40
00a61b40	stp x28,x27,[sp, #-0x60]!
00a61b44	stp x26,x25,[sp, #0x10]
00a61b48	stp x24,x23,[sp, #0x20]
00a61b4c	stp x22,x21,[sp, #0x30]
00a61b50	stp x20,x19,[sp, #0x40]
00a61b54	stp x29,x30,[sp, #0x50]
00a61b58	add x29,sp,#0x50
00a61b5c	sub sp,sp,#0x1d0
00a61b60	ldr x8,[x0, #0x18]
00a61b64	mov x19,x0
00a61b68	mov w26,wzr
00a61b6c	cbnz x8,0x00a61b88
00a61b70	ldr x8,[x19]
00a61b74	mov w26,#0x1
00a61b78	ldr x8,[x8, #0x10]
00a61b7c	cmp x8,#0x0
00a61b80	csetm w8,eq
00a61b84	str w8,[x19, #0x20]
00a61b88	ldr w8,[x19, #0x10]
00a61b8c	cmp w8,#0x0
00a61b90	b.le 0x00a61cb4
00a61b94	add x9,x19,#0x30
00a61b98	str x9,[sp]
00a61b9c	add x9,sp,#0x30
00a61ba0	add w28,w8,#0x1
00a61ba4	add x27,x9,#0x8
00a61ba8	mov x23,xzr
00a61bac	sub w25,w28,#0x2
00a61bb0	cbnz w26,0x00a61bc8
00a61bb4	ldr x8,[x19, #0x18]
00a61bb8	cbz x8,0x00a61bc4
00a61bbc	ldr x23,[x8]
00a61bc0	b 0x00a61bc8
00a61bc4	mov x23,xzr
00a61bc8	ldr x8,[x19]
00a61bcc	mov w1,w25
00a61bd0	ldr x0,[x8, #0x18]
00a61bd4	bl 0x00c32610
00a61bd8	mov x20,x0
00a61bdc	cbz x0,0x00a61bec
00a61be0	ldp x22,x21,[x20]
00a61be4	ldp x8,x24,[x20, #0x10]
00a61be8	b 0x00a61bfc
00a61bec	mov x8,xzr
00a61bf0	mov x22,xzr
00a61bf4	mov x21,xzr
00a61bf8	mov x24,xzr
00a61bfc	movi v0.2D,#0x0
00a61c00	stp q0,q0,[x27, #0x20]
00a61c04	stp q0,q0,[x27]
00a61c08	ldr x9,[x19]
00a61c0c	str x20,[sp, #0x48]
00a61c10	str x9,[sp, #0x30]
00a61c14	ldr w10,[x19, #0x20]
00a61c18	str w10,[sp, #0x50]
00a61c1c	ldr w10,[x19, #0x14]
00a61c20	add w10,w10,#0x1
00a61c24	stp w25,w10,[sp, #0x40]
00a61c28	cbz w26,0x00a61c88
00a61c2c	ldr x1,[x9, #0x8]
00a61c30	cbz x1,0x00a61c40
00a61c34	mov x0,x8
00a61c38	bl 0x00c35ee0
00a61c3c	cbnz w0,0x00a61c98
00a61c40	cbz x24,0x00a61c68
00a61c44	ldr x8,[x19]
00a61c48	ldr x0,[x8, #0x10]
00a61c4c	cbz x0,0x00a61c68
00a61c50	mov x1,x24
00a61c54	bl 0x00c35ee0
00a61c58	cbnz w0,0x00a61c98
00a61c5c	ldr w8,[x19, #0x20]
00a61c60	add w8,w8,#0x1
00a61c64	str w8,[x19, #0x20]
00a61c68	add x0,sp,#0x30
00a61c6c	bl 0x00a61b40
00a61c70	ldr x8,[sp, #0x58]
00a61c74	str x8,[x19, #0x28]
00a61c78	ldr q0,[sp, #0x60]
00a61c7c	str q0,[x19, #0x30]
00a61c80	cbz w0,0x00a61c98
00a61c84	b 0x00a61cc8
00a61c88	mov x0,x23
00a61c8c	mov x1,x8
00a61c90	bl 0x00c3b910
00a61c94	cbnz w0,0x00a61c40
00a61c98	sub w28,w28,#0x1
00a61c9c	cmp w28,#0x1
00a61ca0	b.gt 0x00a61ba8
00a61ca4	mov x23,xzr
00a61ca8	mov x24,xzr
00a61cac	mov w21,#0xffffffff
00a61cb0	b 0x00a61eac
00a61cb4	mov x23,xzr
00a61cb8	mov x24,xzr
00a61cbc	add x20,x19,#0x30
00a61cc0	mov w21,#0xffffffff
00a61cc4	b 0x00a61eb0
00a61cc8	cmn w0,#0x1
00a61ccc	b.eq 0x00a61cec
00a61cd0	cmp w0,#0x1
00a61cd4	b.ne 0x00a61d28
00a61cd8	fmov x9,d0
00a61cdc	cbz x9,0x00a61d40
00a61ce0	cbz x8,0x00a61d88
00a61ce4	ldr x23,[x8, #0x18]
00a61ce8	b 0x00a61d8c
00a61cec	ldr w8,[x19, #0x20]
00a61cf0	cbz w8,0x00a61d80
00a61cf4	ldr x8,[x19]
00a61cf8	mov x0,x20
00a61cfc	ldr x9,[x8, #0x20]
00a61d00	ldr x1,[x8, #0x30]
00a61d04	blr x9
00a61d08	mov x23,x0
00a61d0c	mov x0,x22
00a61d10	bl 0x00c3b8e0
00a61d14	str x0,[x19, #0x40]
00a61d18	cbnz x23,0x00a61d2c
00a61d1c	mov w21,wzr
00a61d20	mov x24,xzr
00a61d24	b 0x00a61eac
00a61d28	mov x23,xzr
00a61d2c	mov x25,xzr
00a61d30	cbz w26,0x00a61e4c
00a61d34	ldr x0,[x19, #0x8]
00a61d38	mov x24,xzr
00a61d3c	b 0x00a61e5c
00a61d40	bl 0x00c342a0
00a61d44	adrp x0,0x2a0000
00a61d48	adrp x2,0x2af000
00a61d4c	add x0,x0,#0x26d
00a61d50	add x2,x2,#0xfd8
00a61d54	mov w1,#0x24b
00a61d58	bl 0x00c342b0
00a61d5c	mov w1,#0x103
00a61d60	mov w0,#0x3b
00a61d64	movk w1,#0xc, LSL #16
00a61d68	mov x2,xzr
00a61d6c	bl 0x00c342c0
00a61d70	mov w21,wzr
00a61d74	mov x23,xzr
00a61d78	mov x24,xzr
00a61d7c	b 0x00a61eac
00a61d80	mov w21,wzr
00a61d84	b 0x00a61f14
00a61d88	mov x23,xzr
00a61d8c	ldr x1,[x19, #0x40]
00a61d90	adrp x0,0x2a4000
00a61d94	add x25,sp,#0x30
00a61d98	add x0,x0,#0x18
00a61d9c	add x8,sp,#0x8
00a61da0	mov x2,xzr
00a61da4	add x24,x25,#0x28
00a61da8	bl 0x00c36280
00a61dac	ldr x8,[sp, #0x28]
00a61db0	ldur q0,[sp, #0x18]
00a61db4	ldur q1,[sp, #0x8]
00a61db8	str x8,[sp, #0x50]
00a61dbc	stp q1,q0,[sp, #0x30]
00a61dc0	cbz x23,0x00a61df8
00a61dc4	adrp x0,0x2ad000
00a61dc8	add x0,x0,#0xb85
00a61dcc	add x8,sp,#0x8
00a61dd0	mov x1,x23
00a61dd4	mov x2,xzr
00a61dd8	add x25,x25,#0x50
00a61ddc	bl 0x00c36280
00a61de0	ldr x8,[sp, #0x28]
00a61de4	ldur q0,[sp, #0x8]
00a61de8	ldur q1,[sp, #0x18]
00a61dec	str x8,[x24, #0x20]
00a61df0	stp q0,q1,[x24]
00a61df4	mov x24,x25
00a61df8	ldp x1,x2,[x19, #0x30]
00a61dfc	adrp x0,0x2d1000
00a61e00	add x0,x0,#0x67a
00a61e04	add x8,sp,#0x8
00a61e08	add x25,sp,#0x30
00a61e0c	bl 0x00c34c50
00a61e10	ldr x8,[sp, #0x28]
00a61e14	ldur q0,[sp, #0x8]
00a61e18	ldur q1,[sp, #0x18]
00a61e1c	str x8,[x24, #0x20]
00a61e20	add x8,sp,#0x8
00a61e24	stp q0,q1,[x24]
00a61e28	bl 0x00c34c40
00a61e2c	ldr x8,[sp, #0x28]
00a61e30	ldur q0,[sp, #0x18]
00a61e34	ldur q1,[sp, #0x8]
00a61e38	mov x23,xzr
00a61e3c	str x8,[x24, #0x48]
00a61e40	stur q0,[x24, #0x38]
00a61e44	stur q1,[x24, #0x28]
00a61e48	cbnz w26,0x00a61d34
00a61e4c	bl 0x00c32280
00a61e50	bl 0x00c32240
00a61e54	mov x24,x0
00a61e58	cbz x0,0x00a61e98
00a61e5c	bl 0x00c38860
00a61e60	mov x26,x0
00a61e64	cbz x0,0x00a61e9c
00a61e68	ldr x6,[x19]
00a61e6c	adrp x5,0xcb5000
00a61e70	ldr x8,[x22, #0x70]
00a61e74	mov x0,x21
00a61e78	ldr w4,[x6], #0x38
00a61e7c	ldr x5,[x5, #0x610]
00a61e80	mov x1,x26
00a61e84	mov x2,x23
00a61e88	mov x3,x25
00a61e8c	blr x8
00a61e90	mov w21,w0
00a61e94	b 0x00a61ea0
00a61e98	mov x26,xzr
00a61e9c	mov w21,wzr
00a61ea0	mov x0,x26
00a61ea4	bl 0x00c38850
00a61ea8	str x20,[x19, #0x28]
00a61eac	ldr x20,[sp]
00a61eb0	ldr x0,[x20]
00a61eb4	adrp x1,0x2a0000
00a61eb8	add x1,x1,#0x26d
00a61ebc	mov w2,#0x293
00a61ec0	bl 0x00c32310
00a61ec4	str xzr,[x20]
00a61ec8	cbz x24,0x00a61efc
00a61ecc	mov w1,#0x73
00a61ed0	add x3,sp,#0x8
00a61ed4	mov x0,x24
00a61ed8	mov x2,xzr
00a61edc	bl 0x00c321a0
00a61ee0	ldr x8,[sp, #0x8]
00a61ee4	movi v0.2D,#0x0
00a61ee8	ldr x9,[x8, #0x8]
00a61eec	str x9,[x20]
00a61ef0	ldr x9,[x8]
00a61ef4	str x9,[x19, #0x38]
00a61ef8	stp q0,q0,[x8]
00a61efc	mov x0,x24
00a61f00	bl 0x00c31a40
00a61f04	cbz x23,0x00a61f14
00a61f08	ldr x8,[x19]
00a61f0c	ldp x9,x0,[x8, #0x28]
00a61f10	blr x9
00a61f14	mov w0,w21
00a61f18	add sp,sp,#0x1d0
00a61f1c	ldp x29,x30,[sp, #0x50]
00a61f20	ldp x20,x19,[sp, #0x40]
00a61f24	ldp x22,x21,[sp, #0x30]
00a61f28	ldp x24,x23,[sp, #0x20]
00a61f2c	ldp x26,x25,[sp, #0x10]
00a61f30	ldp x28,x27,[sp], #0x60
00a61f34	ret
