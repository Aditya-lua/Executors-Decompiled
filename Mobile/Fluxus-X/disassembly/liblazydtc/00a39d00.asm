; ossl_ec_GFp_simple_point_get_affine_coordinates @ 00a39d00
00a39d00	sub sp,sp,#0x70
00a39d04	stp x28,x27,[sp, #0x10]
00a39d08	stp x26,x25,[sp, #0x20]
00a39d0c	stp x24,x23,[sp, #0x30]
00a39d10	stp x22,x21,[sp, #0x40]
00a39d14	stp x20,x19,[sp, #0x50]
00a39d18	stp x29,x30,[sp, #0x60]
00a39d1c	add x29,sp,#0x60
00a39d20	mov x19,x4
00a39d24	mov x21,x3
00a39d28	mov x24,x2
00a39d2c	mov x22,x1
00a39d30	mov x23,x0
00a39d34	bl 0x00c3ae10
00a39d38	cbz w0,0x00a39d70
00a39d3c	bl 0x00c342a0
00a39d40	adrp x0,0x2c7000
00a39d44	adrp x2,0x2a3000
00a39d48	add x0,x0,#0x8a7
00a39d4c	add x2,x2,#0xfd2
00a39d50	mov w1,#0x200
00a39d54	bl 0x00c342b0
00a39d58	mov w0,#0x10
00a39d5c	mov w1,#0x6a
00a39d60	mov x2,xzr
00a39d64	bl 0x00c342c0
00a39d68	mov w21,wzr
00a39d6c	b 0x00a39fe0
00a39d70	mov x20,xzr
00a39d74	cbnz x19,0x00a39d8c
00a39d78	ldr x0,[x23, #0xa8]
00a39d7c	bl 0x00c38a60
00a39d80	mov x20,x0
00a39d84	mov x19,x0
00a39d88	cbz x0,0x00a39e9c
00a39d8c	mov x0,x19
00a39d90	bl 0x00c38a90
00a39d94	mov x0,x19
00a39d98	bl 0x00c38a40
00a39d9c	mov x27,x0
00a39da0	mov x0,x19
00a39da4	bl 0x00c38a40
00a39da8	mov x26,x0
00a39dac	mov x0,x19
00a39db0	bl 0x00c38a40
00a39db4	mov x28,x0
00a39db8	mov x0,x19
00a39dbc	bl 0x00c38a40
00a39dc0	cbz x0,0x00a39fcc
00a39dc4	ldr x8,[x23]
00a39dc8	str x28,[sp, #0x8]
00a39dcc	ldr x28,[x22, #0x20]
00a39dd0	mov x25,x0
00a39dd4	ldr x8,[x8, #0x120]
00a39dd8	cbz x8,0x00a39df8
00a39ddc	mov x0,x23
00a39de0	mov x1,x27
00a39de4	mov x2,x28
00a39de8	mov x3,x19
00a39dec	blr x8
00a39df0	mov x28,x27
00a39df4	cbz w0,0x00a39fcc
00a39df8	mov x0,x28
00a39dfc	bl 0x00c38d20
00a39e00	ldr x8,[x23]
00a39e04	cbz w0,0x00a39e54
00a39e08	ldr x8,[x8, #0x120]
00a39e0c	cbz x8,0x00a39ea4
00a39e10	cbz x24,0x00a39e2c
00a39e14	ldr x2,[x22, #0x10]
00a39e18	mov x0,x23
00a39e1c	mov x1,x24
00a39e20	mov x3,x19
00a39e24	blr x8
00a39e28	cbz w0,0x00a39fcc
00a39e2c	cbz x21,0x00a39fc4
00a39e30	ldr x8,[x23]
00a39e34	ldr x2,[x22, #0x18]
00a39e38	mov x0,x23
00a39e3c	mov x1,x21
00a39e40	ldr x8,[x8, #0x120]
00a39e44	mov x3,x19
00a39e48	blr x8
00a39e4c	cbnz w0,0x00a39fc4
00a39e50	b 0x00a39fcc
00a39e54	ldr x8,[x8, #0x110]
00a39e58	mov x0,x23
00a39e5c	mov x1,x26
00a39e60	mov x2,x28
00a39e64	mov x3,x19
00a39e68	blr x8
00a39e6c	cbz w0,0x00a39ed0
00a39e70	ldr x8,[x23]
00a39e74	ldr x9,[x8, #0x118]
00a39e78	cbz x9,0x00a39f08
00a39e7c	ldr x27,[sp, #0x8]
00a39e80	ldr x2,[x23, #0x40]
00a39e84	mov x1,x26
00a39e88	mov x3,x19
00a39e8c	mov x0,x27
00a39e90	bl 0x00c38f00
00a39e94	cbnz w0,0x00a39f28
00a39e98	b 0x00a39fcc
00a39e9c	mov w21,wzr
00a39ea0	b 0x00a39fe0
00a39ea4	cbz x24,0x00a39eb8
00a39ea8	ldr x1,[x22, #0x10]
00a39eac	mov x0,x24
00a39eb0	bl 0x00c36990
00a39eb4	cbz x0,0x00a39fcc
00a39eb8	cbz x21,0x00a39fc4
00a39ebc	ldr x1,[x22, #0x18]
00a39ec0	mov x0,x21
00a39ec4	bl 0x00c36990
00a39ec8	cbnz x0,0x00a39fc4
00a39ecc	b 0x00a39fcc
00a39ed0	bl 0x00c342a0
00a39ed4	adrp x0,0x2c7000
00a39ed8	adrp x2,0x2a3000
00a39edc	add x0,x0,#0x8a7
00a39ee0	add x2,x2,#0xfd2
00a39ee4	mov w1,#0x232
00a39ee8	bl 0x00c342b0
00a39eec	mov w1,#0x3
00a39ef0	mov w0,#0x10
00a39ef4	movk w1,#0x8, LSL #16
00a39ef8	mov x2,xzr
00a39efc	bl 0x00c342c0
00a39f00	mov w21,wzr
00a39f04	b 0x00a39fd0
00a39f08	ldr x27,[sp, #0x8]
00a39f0c	ldr x8,[x8, #0x100]
00a39f10	mov x0,x23
00a39f14	mov x2,x26
00a39f18	mov x1,x27
00a39f1c	mov x3,x19
00a39f20	blr x8
00a39f24	cbz w0,0x00a39fcc
00a39f28	cbz x24,0x00a39f50
00a39f2c	ldr x8,[x23]
00a39f30	ldr x2,[x22, #0x10]
00a39f34	mov x0,x23
00a39f38	mov x1,x24
00a39f3c	ldr x8,[x8, #0xf8]
00a39f40	mov x3,x27
00a39f44	mov x4,x19
00a39f48	blr x8
00a39f4c	cbz w0,0x00a39fcc
00a39f50	cbz x21,0x00a39fc4
00a39f54	ldr x8,[x23]
00a39f58	ldr x9,[x8, #0x118]
00a39f5c	cbz x9,0x00a39f80
00a39f60	ldr x3,[x23, #0x40]
00a39f64	mov x0,x25
00a39f68	mov x1,x27
00a39f6c	mov x2,x26
00a39f70	mov x4,x19
00a39f74	bl 0x00c38ef0
00a39f78	cbnz w0,0x00a39fa0
00a39f7c	b 0x00a39fcc
00a39f80	ldr x8,[x8, #0xf8]
00a39f84	mov x0,x23
00a39f88	mov x1,x25
00a39f8c	mov x2,x27
00a39f90	mov x3,x26
00a39f94	mov x4,x19
00a39f98	blr x8
00a39f9c	cbz w0,0x00a39fcc
00a39fa0	ldr x8,[x23]
00a39fa4	ldr x2,[x22, #0x18]
00a39fa8	mov x0,x23
00a39fac	mov x1,x21
00a39fb0	ldr x8,[x8, #0xf8]
00a39fb4	mov x3,x25
00a39fb8	mov x4,x19
00a39fbc	blr x8
00a39fc0	cbz w0,0x00a39fcc
00a39fc4	mov w21,#0x1
00a39fc8	b 0x00a39fd0
00a39fcc	mov w21,wzr
00a39fd0	mov x0,x19
00a39fd4	bl 0x00c38a20
00a39fd8	mov x0,x20
00a39fdc	bl 0x00c38a30
00a39fe0	mov w0,w21
00a39fe4	ldp x29,x30,[sp, #0x60]
00a39fe8	ldp x20,x19,[sp, #0x50]
00a39fec	ldp x22,x21,[sp, #0x40]
00a39ff0	ldp x24,x23,[sp, #0x30]
00a39ff4	ldp x26,x25,[sp, #0x20]
00a39ff8	ldp x28,x27,[sp, #0x10]
00a39ffc	add sp,sp,#0x70
00a3a000	ret
