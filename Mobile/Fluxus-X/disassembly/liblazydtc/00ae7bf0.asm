; SRP_VBASE_get1_by_user @ 00ae7bf0
00ae7bf0	sub sp,sp,#0x70
00ae7bf4	str x23,[sp, #0x30]
00ae7bf8	stp x22,x21,[sp, #0x40]
00ae7bfc	stp x20,x19,[sp, #0x50]
00ae7c00	stp x29,x30,[sp, #0x60]
00ae7c04	add x29,sp,#0x60
00ae7c08	cbz x0,0x00ae7f40
00ae7c0c	mov x21,x0
00ae7c10	ldr x0,[x0]
00ae7c14	mov x20,x1
00ae7c18	bl 0x00c325e0
00ae7c1c	cmp w0,#0x1
00ae7c20	b.lt 0x00ae7d44
00ae7c24	mov w19,wzr
00ae7c28	ldr x0,[x21]
00ae7c2c	mov w1,w19
00ae7c30	bl 0x00c32610
00ae7c34	mov x22,x0
00ae7c38	ldr x0,[x0]
00ae7c3c	mov x1,x20
00ae7c40	bl 0x00c301f0
00ae7c44	cbz w0,0x00ae7c60
00ae7c48	ldr x0,[x21]
00ae7c4c	add w19,w19,#0x1
00ae7c50	bl 0x00c325e0
00ae7c54	cmp w19,w0
00ae7c58	b.lt 0x00ae7c28
00ae7c5c	b 0x00ae7d44
00ae7c60	cbz x22,0x00ae7d44
00ae7c64	adrp x1,0x2ce000
00ae7c68	add x1,x1,#0x365
00ae7c6c	orr w0,wzr,#0x30
00ae7c70	mov w2,#0xc2
00ae7c74	bl 0x00c32320
00ae7c78	mov x19,x0
00ae7c7c	cbz x0,0x00ae7f44
00ae7c80	movi v0.2D,#0x0
00ae7c84	stp q0,q0,[x19, #0x10]
00ae7c88	str q0,[x19]
00ae7c8c	ldur q0,[x22, #0x18]
00ae7c90	adrp x23,0x2ce000
00ae7c94	add x23,x23,#0x365
00ae7c98	mov w2,#0xd9
00ae7c9c	stur q0,[x19, #0x18]
00ae7ca0	ldr x21,[x22]
00ae7ca4	ldr x20,[x22, #0x28]
00ae7ca8	mov x0,xzr
00ae7cac	mov x1,x23
00ae7cb0	bl 0x00c32310
00ae7cb4	ldr x0,[x19, #0x28]
00ae7cb8	mov w2,#0xda
00ae7cbc	mov x1,x23
00ae7cc0	bl 0x00c32310
00ae7cc4	cbz x21,0x00ae7ce4
00ae7cc8	adrp x1,0x2ce000
00ae7ccc	add x1,x1,#0x365
00ae7cd0	mov w2,#0xdb
00ae7cd4	mov x0,x21
00ae7cd8	bl 0x00c34600
00ae7cdc	str x0,[x19]
00ae7ce0	cbz x0,0x00ae7ef8
00ae7ce4	cbz x20,0x00ae7d04
00ae7ce8	adrp x1,0x2ce000
00ae7cec	add x1,x1,#0x365
00ae7cf0	mov w2,#0xdd
00ae7cf4	mov x0,x20
00ae7cf8	bl 0x00c34600
00ae7cfc	str x0,[x19, #0x28]
00ae7d00	cbz x0,0x00ae7ef8
00ae7d04	ldr x0,[x22, #0x8]
00ae7d08	bl 0x00c369a0
00ae7d0c	ldr x8,[x22, #0x10]
00ae7d10	mov x21,x0
00ae7d14	mov x0,x8
00ae7d18	bl 0x00c369a0
00ae7d1c	ldr x8,[x19, #0x8]
00ae7d20	mov x20,x0
00ae7d24	mov x0,x8
00ae7d28	bl 0x00c36290
00ae7d2c	ldr x0,[x19, #0x10]
00ae7d30	bl 0x00c322e0
00ae7d34	stp x21,x20,[x19, #0x8]
00ae7d38	cbz x21,0x00ae7ef8
00ae7d3c	cbnz x20,0x00ae7f44
00ae7d40	b 0x00ae7ef8
00ae7d44	ldr x8,[x21, #0x10]
00ae7d48	cbz x8,0x00ae7f40
00ae7d4c	ldr x8,[x21, #0x18]
00ae7d50	cbz x8,0x00ae7f40
00ae7d54	ldr x8,[x21, #0x20]
00ae7d58	cbz x8,0x00ae7f40
00ae7d5c	adrp x1,0x2ce000
00ae7d60	add x1,x1,#0x365
00ae7d64	orr w0,wzr,#0x30
00ae7d68	mov w2,#0xc2
00ae7d6c	bl 0x00c32320
00ae7d70	mov x19,x0
00ae7d74	cbz x0,0x00ae7f44
00ae7d78	movi v0.2D,#0x0
00ae7d7c	stp q0,q0,[x19, #0x10]
00ae7d80	str q0,[x19]
00ae7d84	ldur q0,[x21, #0x18]
00ae7d88	adrp x22,0x2ce000
00ae7d8c	add x22,x22,#0x365
00ae7d90	mov w2,#0xd9
00ae7d94	mov x0,xzr
00ae7d98	mov x1,x22
00ae7d9c	stur q0,[x19, #0x18]
00ae7da0	bl 0x00c32310
00ae7da4	ldr x0,[x19, #0x28]
00ae7da8	mov w2,#0xda
00ae7dac	mov x1,x22
00ae7db0	bl 0x00c32310
00ae7db4	cbz x20,0x00ae7dd4
00ae7db8	adrp x1,0x2ce000
00ae7dbc	add x1,x1,#0x365
00ae7dc0	mov w2,#0xdb
00ae7dc4	mov x0,x20
00ae7dc8	bl 0x00c34600
00ae7dcc	str x0,[x19]
00ae7dd0	cbz x0,0x00ae7ed8
00ae7dd4	add x0,sp,#0x1c
00ae7dd8	mov w1,#0x14
00ae7ddc	bl 0x00c3e4b0
00ae7de0	cmp w0,#0x1
00ae7de4	b.lt 0x00ae7ed8
00ae7de8	adrp x1,0x2d1000
00ae7dec	add x1,x1,#0x42e
00ae7df0	mov x0,xzr
00ae7df4	mov x2,xzr
00ae7df8	bl 0x00c357f0
00ae7dfc	mov x22,x0
00ae7e00	cbz x0,0x00ae7ee4
00ae7e04	bl 0x00c31fa0
00ae7e08	mov x23,x0
00ae7e0c	cbz x0,0x00ae7ee8
00ae7e10	mov x0,x23
00ae7e14	mov x1,x22
00ae7e18	mov x2,xzr
00ae7e1c	bl 0x00c31f70
00ae7e20	cbz w0,0x00ae7ee8
00ae7e24	ldr x21,[x21, #0x10]
00ae7e28	mov x0,x21
00ae7e2c	bl 0x00c2ff50
00ae7e30	mov x2,x0
00ae7e34	mov x0,x23
00ae7e38	mov x1,x21
00ae7e3c	bl 0x00c31f80
00ae7e40	cbz w0,0x00ae7ee8
00ae7e44	mov x0,x20
00ae7e48	bl 0x00c2ff50
00ae7e4c	mov x2,x0
00ae7e50	mov x0,x23
00ae7e54	mov x1,x20
00ae7e58	bl 0x00c31f80
00ae7e5c	cbz w0,0x00ae7ee8
00ae7e60	add x1,sp,#0x8
00ae7e64	mov x0,x23
00ae7e68	mov x2,xzr
00ae7e6c	bl 0x00c31f60
00ae7e70	cbz w0,0x00ae7ee8
00ae7e74	mov x0,x23
00ae7e78	bl 0x00c31f90
00ae7e7c	mov x0,x22
00ae7e80	bl 0x00c35800
00ae7e84	add x0,sp,#0x8
00ae7e88	mov w1,#0x14
00ae7e8c	mov x2,xzr
00ae7e90	bl 0x00c36970
00ae7e94	mov x21,x0
00ae7e98	add x0,sp,#0x1c
00ae7e9c	mov w1,#0x14
00ae7ea0	mov x2,xzr
00ae7ea4	bl 0x00c36970
00ae7ea8	ldr x8,[x19, #0x8]
00ae7eac	mov x20,x0
00ae7eb0	mov x0,x8
00ae7eb4	bl 0x00c36290
00ae7eb8	ldr x0,[x19, #0x10]
00ae7ebc	bl 0x00c322e0
00ae7ec0	stp x21,x20,[x19, #0x8]
00ae7ec4	cbz x21,0x00ae7ed8
00ae7ec8	mov x23,xzr
00ae7ecc	mov x22,xzr
00ae7ed0	cbnz x20,0x00ae7f44
00ae7ed4	b 0x00ae7ee8
00ae7ed8	mov x23,xzr
00ae7edc	mov x22,xzr
00ae7ee0	b 0x00ae7ee8
00ae7ee4	mov x23,xzr
00ae7ee8	mov x0,x22
00ae7eec	bl 0x00c35800
00ae7ef0	mov x0,x23
00ae7ef4	bl 0x00c31f90
00ae7ef8	ldr x0,[x19, #0x8]
00ae7efc	bl 0x00c36290
00ae7f00	ldr x0,[x19, #0x10]
00ae7f04	bl 0x00c322e0
00ae7f08	ldr x0,[x19]
00ae7f0c	adrp x20,0x2ce000
00ae7f10	add x20,x20,#0x365
00ae7f14	mov w2,#0xb9
00ae7f18	mov x1,x20
00ae7f1c	bl 0x00c32310
00ae7f20	ldr x0,[x19, #0x28]
00ae7f24	mov w2,#0xba
00ae7f28	mov x1,x20
00ae7f2c	bl 0x00c32310
00ae7f30	mov w2,#0xbb
00ae7f34	mov x0,x19
00ae7f38	mov x1,x20
00ae7f3c	bl 0x00c32310
00ae7f40	mov x19,xzr
00ae7f44	mov x0,x19
00ae7f48	ldp x29,x30,[sp, #0x60]
00ae7f4c	ldp x20,x19,[sp, #0x50]
00ae7f50	ldp x22,x21,[sp, #0x40]
00ae7f54	ldr x23,[sp, #0x30]
00ae7f58	add sp,sp,#0x70
00ae7f5c	ret
