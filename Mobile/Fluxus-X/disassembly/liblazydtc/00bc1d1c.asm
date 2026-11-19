; ZSTD_XXH64 @ 00bc1d1c
00bc1d1c	mov x8,#0xeb4f
00bc1d20	mov x10,#0x67c5
00bc1d24	mov x9,#0x79f9
00bc1d28	movk x8,#0x27d4, LSL #16
00bc1d2c	movk x10,#0x1656, LSL #16
00bc1d30	movk x9,#0x9e37, LSL #16
00bc1d34	movk x8,#0xae3d, LSL #32
00bc1d38	movk x10,#0xeb2f, LSL #32
00bc1d3c	movk x9,#0x67b1, LSL #32
00bc1d40	movk x8,#0xc2b2, LSL #48
00bc1d44	movk x10,#0x27d4, LSL #48
00bc1d48	movk x9,#0x1656, LSL #48
00bc1d4c	cbz x0,0x00bc1e74
00bc1d50	mov x11,#0xca87
00bc1d54	cmp x1,#0x20
00bc1d58	movk x11,#0x85eb, LSL #16
00bc1d5c	movk x11,#0x79b1, LSL #32
00bc1d60	movk x11,#0x9e37, LSL #48
00bc1d64	b.cc 0x00bc1e7c
00bc1d68	mov x13,#0xb5d6
00bc1d6c	mov x15,#0x3579
00bc1d70	add x12,x0,x1
00bc1d74	movk x13,#0xadc0, LSL #16
00bc1d78	movk x15,#0x7a14, LSL #16
00bc1d7c	sub x16,x12,#0x1f
00bc1d80	movk x13,#0x27ee, LSL #32
00bc1d84	movk x15,#0x864e, LSL #32
00bc1d88	movk x13,#0x60ea, LSL #48
00bc1d8c	movk x15,#0x61c8, LSL #48
00bc1d90	add x14,x2,x13
00bc1d94	add x13,x2,x8
00bc1d98	add x12,x2,x15
00bc1d9c	ldp x15,x17,[x0]
00bc1da0	nop
00bc1da4	madd x14,x15,x8,x14
00bc1da8	madd x13,x17,x8,x13
00bc1dac	ldp x15,x17,[x0, #0x10]
00bc1db0	add x0,x0,#0x20
00bc1db4	cmp x0,x16
00bc1db8	madd x15,x15,x8,x2
00bc1dbc	ror x4,x14,#0x21
00bc1dc0	madd x12,x17,x8,x12
00bc1dc4	ror x3,x13,#0x21
00bc1dc8	mul x14,x4,x11
00bc1dcc	ror x17,x15,#0x21
00bc1dd0	mul x13,x3,x11
00bc1dd4	ror x15,x12,#0x21
00bc1dd8	mul x2,x17,x11
00bc1ddc	mul x12,x15,x11
00bc1de0	b.cc 0x00bc1d9c
00bc1de4	mov x16,#0x6ca9
00bc1de8	ror x14,x14,#0x3f
00bc1dec	ror x13,x13,#0x39
00bc1df0	movk x16,#0xf79, LSL #16
00bc1df4	ror x2,x2,#0x34
00bc1df8	ror x12,x12,#0x2e
00bc1dfc	movk x16,#0x5b01, LSL #32
00bc1e00	add x13,x13,x14
00bc1e04	mov x14,#0xae63
00bc1e08	movk x16,#0xdef3, LSL #48
00bc1e0c	add x12,x2,x12
00bc1e10	movk x14,#0xc2b2, LSL #16
00bc1e14	mul x4,x4,x16
00bc1e18	add x12,x13,x12
00bc1e1c	movk x14,#0xca77, LSL #32
00bc1e20	movk x14,#0x85eb, LSL #48
00bc1e24	mul x3,x3,x16
00bc1e28	mul x17,x17,x16
00bc1e2c	ror x4,x4,#0x21
00bc1e30	mul x4,x4,x11
00bc1e34	ror x3,x3,#0x21
00bc1e38	mul x13,x3,x11
00bc1e3c	ror x17,x17,#0x21
00bc1e40	mul x17,x17,x11
00bc1e44	eor x12,x12,x4
00bc1e48	madd x12,x12,x11,x14
00bc1e4c	eor x12,x12,x13
00bc1e50	mul x13,x15,x16
00bc1e54	madd x12,x12,x11,x14
00bc1e58	ror x13,x13,#0x21
00bc1e5c	eor x12,x12,x17
00bc1e60	mul x13,x13,x11
00bc1e64	madd x12,x12,x11,x14
00bc1e68	eor x12,x12,x13
00bc1e6c	madd x12,x12,x11,x14
00bc1e70	b 0x00bc1e80
00bc1e74	add x12,x2,x10
00bc1e78	b 0x00bc1f08
00bc1e7c	add x12,x2,x10
00bc1e80	and x13,x1,#0x1f
00bc1e84	add x12,x12,x1
00bc1e88	cmp x13,#0x8
00bc1e8c	b.cc 0x00bc1ec8
00bc1e90	mov x14,#0xae63
00bc1e94	movk x14,#0xc2b2, LSL #16
00bc1e98	movk x14,#0xca77, LSL #32
00bc1e9c	movk x14,#0x85eb, LSL #48
00bc1ea0	ldr x15,[x0], #0x8
00bc1ea4	sub x13,x13,#0x8
00bc1ea8	cmp x13,#0x7
00bc1eac	mul x15,x15,x8
00bc1eb0	ror x15,x15,#0x21
00bc1eb4	mul x15,x15,x11
00bc1eb8	eor x12,x15,x12
00bc1ebc	ror x12,x12,#0x25
00bc1ec0	madd x12,x12,x11,x14
00bc1ec4	b.hi 0x00bc1ea0
00bc1ec8	subs x14,x13,#0x4
00bc1ecc	b.cc 0x00bc1ee8
00bc1ed0	ldr w13,[x0], #0x4
00bc1ed4	mul x13,x13,x11
00bc1ed8	eor x12,x13,x12
00bc1edc	mov x13,x14
00bc1ee0	ror x12,x12,#0x29
00bc1ee4	madd x12,x12,x8,x9
00bc1ee8	cbz x13,0x00bc1f08
00bc1eec	ldrb w14,[x0], #0x1
00bc1ef0	subs x13,x13,#0x1
00bc1ef4	mul x14,x14,x10
00bc1ef8	eor x12,x14,x12
00bc1efc	ror x12,x12,#0x35
00bc1f00	mul x12,x12,x11
00bc1f04	b.ne 0x00bc1eec
00bc1f08	eor x10,x12,x12, LSR #0x21
00bc1f0c	mul x8,x10,x8
00bc1f10	eor x8,x8,x8, LSR #0x1d
00bc1f14	mul x8,x8,x9
00bc1f18	eor x0,x8,x8, LSR #0x20
00bc1f1c	ret
