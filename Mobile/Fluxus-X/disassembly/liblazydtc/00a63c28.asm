; EVP_PKEY_derive @ 00a63c28
00a63c28	str x21,[sp, #-0x30]!
00a63c2c	stp x20,x19,[sp, #0x10]
00a63c30	stp x29,x30,[sp, #0x20]
00a63c34	add x29,sp,#0x20
00a63c38	cbz x0,0x00a63c74
00a63c3c	mov x19,x2
00a63c40	cbz x2,0x00a63c74
00a63c44	ldr w8,[x0]
00a63c48	mov x21,x0
00a63c4c	cmp w8,#0x800
00a63c50	b.ne 0x00a63ca0
00a63c54	ldr x0,[x21, #0x30]
00a63c58	mov x20,x1
00a63c5c	cbz x0,0x00a63ce0
00a63c60	ldr x8,[x21, #0x28]
00a63c64	ldr x4,[x8, #0x48]
00a63c68	cbz x20,0x00a63d14
00a63c6c	ldr x3,[x19]
00a63c70	b 0x00a63d18
00a63c74	bl 0x00c342a0
00a63c78	adrp x0,0x2d7000
00a63c7c	adrp x2,0x2d9000
00a63c80	add x0,x0,#0xecb
00a63c84	add x2,x2,#0xcb3
00a63c88	orr w1,wzr,#0x1fe
00a63c8c	bl 0x00c342b0
00a63c90	mov w1,#0x102
00a63c94	orr w0,wzr,#0x6
00a63c98	movk w1,#0xc, LSL #16
00a63c9c	b 0x00a63cc4
00a63ca0	bl 0x00c342a0
00a63ca4	adrp x0,0x2d7000
00a63ca8	adrp x2,0x2d9000
00a63cac	add x0,x0,#0xecb
00a63cb0	add x2,x2,#0xcb3
00a63cb4	mov w1,#0x203
00a63cb8	bl 0x00c342b0
00a63cbc	orr w0,wzr,#0x6
00a63cc0	mov w1,#0x97
00a63cc4	mov x2,xzr
00a63cc8	bl 0x00c342c0
00a63ccc	mov w0,#0xffffffff
00a63cd0	ldp x29,x30,[sp, #0x20]
00a63cd4	ldp x20,x19,[sp, #0x10]
00a63cd8	ldr x21,[sp], #0x30
00a63cdc	ret
00a63ce0	ldr x8,[x21, #0x78]
00a63ce4	cbz x8,0x00a63d30
00a63ce8	ldr x3,[x8, #0xb8]
00a63cec	cbz x3,0x00a63d30
00a63cf0	ldrb w8,[x8, #0x4]
00a63cf4	tbnz w8,#0x1,0x00a63d64
00a63cf8	mov x1,x20
00a63cfc	mov x2,x19
00a63d00	ldp x29,x30,[sp, #0x20]
00a63d04	ldp x20,x19,[sp, #0x10]
00a63d08	mov x0,x21
00a63d0c	ldr x21,[sp], #0x30
00a63d10	br x3
00a63d14	mov x3,xzr
00a63d18	mov x1,x20
00a63d1c	mov x2,x19
00a63d20	ldp x29,x30,[sp, #0x20]
00a63d24	ldp x20,x19,[sp, #0x10]
00a63d28	ldr x21,[sp], #0x30
00a63d2c	br x4
00a63d30	bl 0x00c342a0
00a63d34	adrp x0,0x2d7000
00a63d38	adrp x2,0x2d9000
00a63d3c	add x0,x0,#0xecb
00a63d40	add x2,x2,#0xcb3
00a63d44	mov w1,#0x210
00a63d48	bl 0x00c342b0
00a63d4c	orr w0,wzr,#0x6
00a63d50	mov w1,#0x96
00a63d54	mov x2,xzr
00a63d58	bl 0x00c342c0
00a63d5c	orr w0,wzr,#0xfffffffe
00a63d60	b 0x00a63cd0
00a63d64	ldr x0,[x21, #0x88]
00a63d68	bl 0x00c36440
00a63d6c	cbz w0,0x00a63dac
00a63d70	sxtw x8,w0
00a63d74	cbz x20,0x00a63de0
00a63d78	ldr x9,[x19]
00a63d7c	cmp x9,x8
00a63d80	b.cs 0x00a63dec
00a63d84	bl 0x00c342a0
00a63d88	adrp x0,0x2d7000
00a63d8c	adrp x2,0x2d9000
00a63d90	add x0,x0,#0xecb
00a63d94	add x2,x2,#0xcb3
00a63d98	mov w1,#0x214
00a63d9c	bl 0x00c342b0
00a63da0	orr w0,wzr,#0x6
00a63da4	mov w1,#0x9b
00a63da8	b 0x00a63dd0
00a63dac	bl 0x00c342a0
00a63db0	adrp x0,0x2d7000
00a63db4	adrp x2,0x2d9000
00a63db8	add x0,x0,#0xecb
00a63dbc	add x2,x2,#0xcb3
00a63dc0	mov w1,#0x214
00a63dc4	bl 0x00c342b0
00a63dc8	orr w0,wzr,#0x6
00a63dcc	mov w1,#0xa3
00a63dd0	mov x2,xzr
00a63dd4	bl 0x00c342c0
00a63dd8	mov w0,wzr
00a63ddc	b 0x00a63cd0
00a63de0	mov w0,#0x1
00a63de4	str x8,[x19]
00a63de8	b 0x00a63cd0
00a63dec	ldr x8,[x21, #0x78]
00a63df0	ldr x3,[x8, #0xb8]
00a63df4	b 0x00a63cf8
