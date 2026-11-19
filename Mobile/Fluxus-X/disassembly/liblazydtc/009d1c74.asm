; FUN_009d1c74 @ 009d1c74
009d1c74	sub sp,sp,#0x50
009d1c78	stp x24,x23,[sp, #0x10]
009d1c7c	stp x22,x21,[sp, #0x20]
009d1c80	stp x20,x19,[sp, #0x30]
009d1c84	stp x29,x30,[sp, #0x40]
009d1c88	ldr x8,[x0, #0x8]
009d1c8c	add x29,sp,#0x40
009d1c90	ldr x9,[x8, #0xc0]
009d1c94	ldrb w9,[x9, #0x60]
009d1c98	tbnz w9,#0x3,0x009d1ec8
009d1c9c	mov x19,x0
009d1ca0	mov w0,#0x1
009d1ca4	tbnz w1,#0xb,0x009d1ecc
009d1ca8	ldr w8,[x8]
009d1cac	cmp w8,#0x304
009d1cb0	b.lt 0x009d1ecc
009d1cb4	cmp w8,#0x10, LSL #12
009d1cb8	b.eq 0x009d1ecc
009d1cbc	ldr w8,[x19, #0x38]
009d1cc0	mov w20,w2
009d1cc4	orr w9,w8,w2
009d1cc8	cbz w9,0x009d1d0c
009d1ccc	cbz w8,0x009d1d40
009d1cd0	ldr x8,[x19, #0x4b0]
009d1cd4	cbz x8,0x009d1d84
009d1cd8	ldrb w8,[x19, #0xa9]
009d1cdc	tbz w8,#0x3,0x009d1eb4
009d1ce0	ldr w8,[x19, #0xb48]
009d1ce4	cbnz w8,0x009d1eb4
009d1ce8	ldr w8,[x19, #0x8e8]
009d1cec	cbz w8,0x009d1e44
009d1cf0	bl 0x00c342a0
009d1cf4	adrp x0,0x2c1000
009d1cf8	adrp x2,0x2d3000
009d1cfc	add x0,x0,#0x800
009d1d00	add x2,x2,#0x81b
009d1d04	mov w1,#0x556
009d1d08	b 0x009d1d70
009d1d0c	ldr w9,[x19, #0x4d0]
009d1d10	cbz w9,0x009d1d1c
009d1d14	ldrb w9,[x19, #0xb28]
009d1d18	tbnz w9,#0x0,0x009d1ccc
009d1d1c	bl 0x00c342a0
009d1d20	adrp x0,0x2c1000
009d1d24	adrp x2,0x2d3000
009d1d28	add x0,x0,#0x800
009d1d2c	add x2,x2,#0x81b
009d1d30	mov w1,#0x526
009d1d34	bl 0x00c342b0
009d1d38	mov w1,#0x6d
009d1d3c	b 0x009d1e8c
009d1d40	cbnz w20,0x009d1ec8
009d1d44	mov x0,x19
009d1d48	mov x1,xzr
009d1d4c	mov x2,xzr
009d1d50	bl 0x00c34aa0
009d1d54	cbnz w0,0x009d1ec8
009d1d58	bl 0x00c342a0
009d1d5c	adrp x0,0x2c1000
009d1d60	adrp x2,0x2d3000
009d1d64	add x0,x0,#0x800
009d1d68	add x2,x2,#0x81b
009d1d6c	mov w1,#0x5a8
009d1d70	bl 0x00c342b0
009d1d74	mov w2,#0x103
009d1d78	mov w1,#0x50
009d1d7c	movk w2,#0xc, LSL #16
009d1d80	b 0x009d1e90
009d1d84	cbz w20,0x009d1e50
009d1d88	ldr w8,[x19, #0x8e8]
009d1d8c	cbnz w8,0x009d1e50
009d1d90	ldr w8,[x19, #0x4d0]
009d1d94	cbz w8,0x009d1da0
009d1d98	ldrb w8,[x19, #0xb28]
009d1d9c	tbz w8,#0x1,0x009d1e50
009d1da0	ldr x21,[x19, #0xad8]
009d1da4	ldr x22,[x19, #0xad0]
009d1da8	add x1,sp,#0x8
009d1dac	mov x2,sp
009d1db0	mov x0,x19
009d1db4	bl 0x00c36740
009d1db8	ldr x8,[sp]
009d1dbc	cbz x8,0x009d1e50
009d1dc0	mov x24,xzr
009d1dc4	ldr x8,[sp, #0x8]
009d1dc8	mov w4,#0x1
009d1dcc	mov x0,x19
009d1dd0	mov x2,x21
009d1dd4	ldrh w23,[x8, x24, LSL #0x1]
009d1dd8	mov x3,x22
009d1ddc	mov w1,w23
009d1de0	bl 0x00c36e90
009d1de4	cbz w0,0x009d1e20
009d1de8	mov w2,#0x4
009d1dec	movk w2,#0x2, LSL #16
009d1df0	mov x0,x19
009d1df4	mov w1,w23
009d1df8	bl 0x00c367e0
009d1dfc	cbz w0,0x009d1e20
009d1e00	mov w2,#0x304
009d1e04	mov w3,#0x304
009d1e08	mov x0,x19
009d1e0c	mov w1,w23
009d1e10	mov w4,wzr
009d1e14	mov x5,xzr
009d1e18	bl 0x00c36800
009d1e1c	cbnz w0,0x009d1e34
009d1e20	ldr x8,[sp]
009d1e24	add x24,x24,#0x1
009d1e28	cmp x24,x8
009d1e2c	b.cc 0x009d1dc4
009d1e30	b 0x009d1e38
009d1e34	ldr x8,[sp]
009d1e38	cmp x24,x8
009d1e3c	b.cs 0x009d1e50
009d1e40	strh w23,[x19, #0x4ae]
009d1e44	mov w0,#0x1
009d1e48	str w0,[x19, #0x8e8]
009d1e4c	b 0x009d1ecc
009d1e50	ldr w8,[x19, #0x4d0]
009d1e54	cbz w8,0x009d1e60
009d1e58	ldrb w8,[x19, #0xb28]
009d1e5c	tbnz w8,#0x0,0x009d1ea4
009d1e60	bl 0x00c342a0
009d1e64	adrp x0,0x2c1000
009d1e68	adrp x2,0x2d3000
009d1e6c	add x0,x0,#0x800
009d1e70	add x2,x2,#0x81b
009d1e74	mov w1,#0x587
009d1e78	bl 0x00c342b0
009d1e7c	cmp w20,#0x0
009d1e80	mov w8,#0x6d
009d1e84	mov w9,#0x28
009d1e88	csel w1,w9,w8,ne
009d1e8c	mov w2,#0x65
009d1e90	mov x0,x19
009d1e94	mov x3,xzr
009d1e98	bl 0x00c34410
009d1e9c	mov w0,wzr
009d1ea0	b 0x009d1ecc
009d1ea4	ldrb w8,[x19, #0xa9]
009d1ea8	tbz w8,#0x3,0x009d1eb4
009d1eac	ldr w8,[x19, #0xb48]
009d1eb0	cbz w8,0x009d1ee4
009d1eb4	ldr w8,[x19, #0x8e8]
009d1eb8	cmp w8,#0x1
009d1ebc	b.ne 0x009d1ec8
009d1ec0	mov w8,#0x2
009d1ec4	str w8,[x19, #0x8e8]
009d1ec8	mov w0,#0x1
009d1ecc	ldp x29,x30,[sp, #0x40]
009d1ed0	ldp x20,x19,[sp, #0x30]
009d1ed4	ldp x22,x21,[sp, #0x20]
009d1ed8	ldp x24,x23,[sp, #0x10]
009d1edc	add sp,sp,#0x50
009d1ee0	ret
009d1ee4	ldr w8,[x19, #0x8e8]
009d1ee8	cbz w8,0x009d1e44
009d1eec	bl 0x00c342a0
009d1ef0	adrp x0,0x2c1000
009d1ef4	adrp x2,0x2d3000
009d1ef8	add x0,x0,#0x800
009d1efc	add x2,x2,#0x81b
009d1f00	mov w1,#0x593
009d1f04	b 0x009d1d70
