; OSSL_STORE_find @ 00ae9bf8
00ae9bf8	sub sp,sp,#0x40
00ae9bfc	stp x22,x21,[sp, #0x10]
00ae9c00	stp x20,x19,[sp, #0x20]
00ae9c04	stp x29,x30,[sp, #0x30]
00ae9c08	ldr w8,[x0, #0x38]
00ae9c0c	add x29,sp,#0x30
00ae9c10	cbz w8,0x00ae9c5c
00ae9c14	bl 0x00c342a0
00ae9c18	adrp x0,0x2c2000
00ae9c1c	adrp x2,0x2c2000
00ae9c20	add x0,x0,#0x3bd
00ae9c24	add x2,x2,#0x3d6
00ae9c28	mov w1,#0x138
00ae9c2c	bl 0x00c342b0
00ae9c30	mov w0,#0x2c
00ae9c34	mov w1,#0x75
00ae9c38	mov x2,xzr
00ae9c3c	bl 0x00c342c0
00ae9c40	mov w20,wzr
00ae9c44	mov w0,w20
00ae9c48	ldp x29,x30,[sp, #0x30]
00ae9c4c	ldp x20,x19,[sp, #0x20]
00ae9c50	ldp x22,x21,[sp, #0x10]
00ae9c54	add sp,sp,#0x40
00ae9c58	ret
00ae9c5c	mov x21,x1
00ae9c60	cbz x1,0x00ae9cd4
00ae9c64	ldr x8,[x0, #0x8]
00ae9c68	mov x20,x0
00ae9c6c	cbz x8,0x00ae9d04
00ae9c70	str xzr,[sp, #0x8]
00ae9c74	ldr x8,[x8, #0xa8]
00ae9c78	cbz x8,0x00ae9d2c
00ae9c7c	bl 0x00c364c0
00ae9c80	cbz x0,0x00ae9d48
00ae9c84	ldr w8,[x21]
00ae9c88	mov x19,x0
00ae9c8c	sub w8,w8,#0x1
00ae9c90	cmp w8,#0x3
00ae9c94	b.hi 0x00ae9e88
00ae9c98	adrp x9,0x777000
00ae9c9c	add x9,x9,#0x1a8
00ae9ca0	ldrsw x8,[x9, x8, LSL #0x2]
00ae9ca4	add x8,x8,x9
00ae9ca8	br x8
00ae9cac	ldr x0,[x21, #0x8]
00ae9cb0	add x1,sp,#0x8
00ae9cb4	bl 0x00c350f0
00ae9cb8	cmp w0,#0x1
00ae9cbc	b.lt 0x00ae9e88
00ae9cc0	ldr x2,[sp, #0x8]
00ae9cc4	adrp x1,0x2be000
00ae9cc8	sxtw x3,w0
00ae9ccc	add x1,x1,#0x36f
00ae9cd0	b 0x00ae9e30
00ae9cd4	bl 0x00c342a0
00ae9cd8	adrp x0,0x2c2000
00ae9cdc	adrp x2,0x2c2000
00ae9ce0	add x0,x0,#0x3bd
00ae9ce4	add x2,x2,#0x3d6
00ae9ce8	mov w1,#0x13c
00ae9cec	bl 0x00c342b0
00ae9cf0	mov w8,#0x100
00ae9cf4	movk w8,#0xc, LSL #16
00ae9cf8	add w1,w8,#0x2
00ae9cfc	mov w0,#0x2c
00ae9d00	b 0x00ae9c38
00ae9d04	ldr x8,[x20]
00ae9d08	ldr x2,[x8, #0x30]
00ae9d0c	cbz x2,0x00ae9d74
00ae9d10	ldr x0,[x20, #0x10]
00ae9d14	mov x1,x21
00ae9d18	ldp x29,x30,[sp, #0x30]
00ae9d1c	ldp x20,x19,[sp, #0x20]
00ae9d20	ldp x22,x21,[sp, #0x10]
00ae9d24	add sp,sp,#0x40
00ae9d28	br x2
00ae9d2c	bl 0x00c342a0
00ae9d30	adrp x0,0x2c2000
00ae9d34	adrp x2,0x2c2000
00ae9d38	add x0,x0,#0x3bd
00ae9d3c	add x2,x2,#0x3d6
00ae9d40	mov w1,#0x14a
00ae9d44	b 0x00ae9d8c
00ae9d48	bl 0x00c342a0
00ae9d4c	adrp x0,0x2c2000
00ae9d50	adrp x2,0x2c2000
00ae9d54	add x0,x0,#0x3bd
00ae9d58	add x2,x2,#0x3d6
00ae9d5c	mov w1,#0x14f
00ae9d60	bl 0x00c342b0
00ae9d64	mov w1,#0x100
00ae9d68	mov w0,#0x2c
00ae9d6c	movk w1,#0xc, LSL #16
00ae9d70	b 0x00ae9c38
00ae9d74	bl 0x00c342a0
00ae9d78	adrp x0,0x2c2000
00ae9d7c	adrp x2,0x2c2000
00ae9d80	add x0,x0,#0x3bd
00ae9d84	add x2,x2,#0x3d6
00ae9d88	mov w1,#0x187
00ae9d8c	bl 0x00c342b0
00ae9d90	mov w0,#0x2c
00ae9d94	mov w1,#0x76
00ae9d98	b 0x00ae9c38
00ae9d9c	ldr x0,[x21, #0x8]
00ae9da0	add x1,sp,#0x8
00ae9da4	bl 0x00c350f0
00ae9da8	mov w22,w0
00ae9dac	cmp w0,#0x1
00ae9db0	b.lt 0x00ae9e88
00ae9db4	ldr x0,[x21, #0x10]
00ae9db8	mov x1,xzr
00ae9dbc	bl 0x00c375e0
00ae9dc0	mov x21,x0
00ae9dc4	cbz x0,0x00ae9e8c
00ae9dc8	ldr x2,[sp, #0x8]
00ae9dcc	adrp x1,0x2cd000
00ae9dd0	sxtw x3,w22
00ae9dd4	add x1,x1,#0xe11
00ae9dd8	mov x0,x19
00ae9ddc	bl 0x00c3a8f0
00ae9de0	cbz w0,0x00ae9e8c
00ae9de4	adrp x1,0x2d2000
00ae9de8	add x1,x1,#0x274
00ae9dec	mov x0,x19
00ae9df0	mov x2,x21
00ae9df4	bl 0x00c364d0
00ae9df8	cbnz w0,0x00ae9e40
00ae9dfc	b 0x00ae9e8c
00ae9e00	ldr x0,[x21, #0x18]
00ae9e04	bl 0x00c36230
00ae9e08	adrp x1,0x29d000
00ae9e0c	mov x2,x0
00ae9e10	add x1,x1,#0xe2e
00ae9e14	mov x0,x19
00ae9e18	mov x3,xzr
00ae9e1c	bl 0x00c3e890
00ae9e20	cbz w0,0x00ae9e88
00ae9e24	ldp x2,x3,[x21, #0x20]
00ae9e28	adrp x1,0x2c6000
00ae9e2c	add x1,x1,#0x28a
00ae9e30	mov x0,x19
00ae9e34	bl 0x00c3a8f0
00ae9e38	cbz w0,0x00ae9e88
00ae9e3c	mov x21,xzr
00ae9e40	mov x0,x19
00ae9e44	bl 0x00c364f0
00ae9e48	ldp x9,x8,[x20, #0x8]
00ae9e4c	mov x22,x0
00ae9e50	mov x1,x22
00ae9e54	ldr x9,[x9, #0xa8]
00ae9e58	mov x0,x8
00ae9e5c	blr x9
00ae9e60	mov w20,w0
00ae9e64	mov x0,x22
00ae9e68	bl 0x00c36500
00ae9e6c	b 0x00ae9e90
00ae9e70	ldp x2,x3,[x21, #0x20]
00ae9e74	adrp x1,0x2dc000
00ae9e78	add x1,x1,#0x974
00ae9e7c	mov x0,x19
00ae9e80	bl 0x00c3e890
00ae9e84	cbnz w0,0x00ae9e3c
00ae9e88	mov x21,xzr
00ae9e8c	mov w20,wzr
00ae9e90	mov x0,x19
00ae9e94	bl 0x00c364b0
00ae9e98	ldr x0,[sp, #0x8]
00ae9e9c	adrp x1,0x2c2000
00ae9ea0	add x1,x1,#0x3bd
00ae9ea4	mov w2,#0x181
00ae9ea8	bl 0x00c32310
00ae9eac	mov x0,x21
00ae9eb0	bl 0x00c36290
00ae9eb4	b 0x00ae9c44
