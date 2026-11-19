; ZSTD_XXH32_digest @ 00bc1c38
00bc1c38	ldr w9,[x0, #0x4]
00bc1c3c	mov w8,#0x67b1
00bc1c40	movk w8,#0x1656, LSL #16
00bc1c44	cbz w9,0x00bc1c70
00bc1c48	ldp w9,w10,[x0, #0x8]
00bc1c4c	ldp w11,w12,[x0, #0x10]
00bc1c50	ror w9,w9,#0x1f
00bc1c54	ror w10,w10,#0x19
00bc1c58	ror w11,w11,#0x14
00bc1c5c	ror w12,w12,#0xe
00bc1c60	add w9,w10,w9
00bc1c64	add w10,w11,w12
00bc1c68	add w11,w9,w10
00bc1c6c	b 0x00bc1c78
00bc1c70	ldr w9,[x0, #0x10]
00bc1c74	add w11,w9,w8
00bc1c78	ldr w9,[x0, #0x28]
00bc1c7c	ldr w12,[x0]
00bc1c80	and x10,x9,#0xf
00bc1c84	mov w9,#0xae3d
00bc1c88	add w11,w12,w11
00bc1c8c	cmp w10,#0x4
00bc1c90	movk w9,#0xc2b2, LSL #16
00bc1c94	add x12,x0,#0x18
00bc1c98	b.cc 0x00bc1cc0
00bc1c9c	mov w13,#0xeb2f
00bc1ca0	movk w13,#0x27d4, LSL #16
00bc1ca4	ldr w14,[x12], #0x4
00bc1ca8	sub x10,x10,#0x4
00bc1cac	cmp x10,#0x3
00bc1cb0	madd w11,w14,w9,w11
00bc1cb4	ror w11,w11,#0xf
00bc1cb8	mul w11,w11,w13
00bc1cbc	b.hi 0x00bc1ca4
00bc1cc0	cbz x10,0x00bc1ce4
00bc1cc4	mov w13,#0x79b1
00bc1cc8	movk w13,#0x9e37, LSL #16
00bc1ccc	ldrb w14,[x12], #0x1
00bc1cd0	subs x10,x10,#0x1
00bc1cd4	madd w11,w14,w8,w11
00bc1cd8	ror w11,w11,#0x15
00bc1cdc	mul w11,w11,w13
00bc1ce0	b.ne 0x00bc1ccc
00bc1ce4	eor w8,w11,w11, LSR #0xf
00bc1ce8	mov w10,#0xca77
00bc1cec	movk w10,#0x85eb, LSL #16
00bc1cf0	mul w8,w8,w10
00bc1cf4	eor w8,w8,w8, LSR #0xd
00bc1cf8	mul w8,w8,w9
00bc1cfc	eor w0,w8,w8, LSR #0x10
00bc1d00	ret
