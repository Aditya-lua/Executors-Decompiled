; OSSL_HTTP_exchange @ 00b18c64
00b18c64	sub sp,sp,#0x100
00b18c68	str x21,[sp, #0xd0]
00b18c6c	stp x20,x19,[sp, #0xe0]
00b18c70	stp x29,x30,[sp, #0xf0]
00b18c74	add x29,sp,#0xf0
00b18c78	cbz x0,0x00b18cac
00b18c7c	mov x20,x1
00b18c80	mov x19,x0
00b18c84	cbz x1,0x00b18c8c
00b18c88	str xzr,[x20]
00b18c8c	mov x0,x19
00b18c90	bl 0x00b185dc
00b18c94	cbz x0,0x00b18cf4
00b18c98	mov x21,x0
00b18c9c	bl 0x00c322d0
00b18ca0	cmp w0,#0x0
00b18ca4	csel x0,xzr,x21,eq
00b18ca8	b 0x00b18ce0
00b18cac	bl 0x00c342a0
00b18cb0	adrp x0,0x2d6000
00b18cb4	adrp x2,0x2ca000
00b18cb8	add x0,x0,#0x829
00b18cbc	add x2,x2,#0x687
00b18cc0	mov w1,#0x41d
00b18cc4	bl 0x00c342b0
00b18cc8	mov w1,#0x102
00b18ccc	mov w0,#0x3d
00b18cd0	movk w1,#0xc, LSL #16
00b18cd4	mov x2,xzr
00b18cd8	bl 0x00c342c0
00b18cdc	mov x0,xzr
00b18ce0	ldp x29,x30,[sp, #0xf0]
00b18ce4	ldp x20,x19,[sp, #0xe0]
00b18ce8	ldr x21,[sp, #0xd0]
00b18cec	add sp,sp,#0x100
00b18cf0	ret
00b18cf4	ldr x0,[x19, #0xb8]
00b18cf8	cbz x0,0x00b18d18
00b18cfc	cbz x20,0x00b18df8
00b18d00	adrp x1,0x2d6000
00b18d04	add x1,x1,#0x829
00b18d08	mov w2,#0x42b
00b18d0c	bl 0x00c34600
00b18d10	str x0,[x20]
00b18d14	b 0x00b18cdc
00b18d18	bl 0x00c32410
00b18d1c	mov x20,x0
00b18d20	ubfx w8,w20,#0x17,#0x8
00b18d24	cmp w20,#0x0
00b18d28	mov w9,#0x2
00b18d2c	csel w8,w9,w8,lt
00b18d30	cmp w8,#0x14
00b18d34	b.eq 0x00b18d40
00b18d38	cmp w8,#0x3d
00b18d3c	b.ne 0x00b18e20
00b18d40	ldr x4,[x19, #0x48]
00b18d44	cbz x4,0x00b18d9c
00b18d48	ldr w8,[x19, #0x38]
00b18d4c	ldr x11,[x19, #0x50]
00b18d50	adrp x9,0x2af000
00b18d54	adrp x10,0x2ab000
00b18d58	add x9,x9,#0x792
00b18d5c	add x10,x10,#0x32c
00b18d60	adrp x12,0x2bc000
00b18d64	cmp w8,#0x0
00b18d68	add x12,x12,#0xda4
00b18d6c	csel x3,x10,x9,eq
00b18d70	cmp x11,#0x0
00b18d74	adrp x2,0x2aa000
00b18d78	csel x5,x12,x10,ne
00b18d7c	csel x6,x11,x10,ne
00b18d80	add x2,x2,#0xc4e
00b18d84	add x0,sp,#0x8
00b18d88	mov w1,#0xc8
00b18d8c	bl 0x00c34d30
00b18d90	mov w0,#0x1
00b18d94	add x1,sp,#0x8
00b18d98	bl 0x00c37fb0
00b18d9c	ldr x2,[x19, #0x40]
00b18da0	cbz x2,0x00b18db4
00b18da4	adrp x1,0x2ae000
00b18da8	add x1,x1,#0x87f
00b18dac	mov w0,#0x2
00b18db0	bl 0x00c37fb0
00b18db4	cbnz x20,0x00b18cdc
00b18db8	ldr w8,[x19, #0x38]
00b18dbc	adrp x9,0x2d6000
00b18dc0	adrp x10,0x2a8000
00b18dc4	add x9,x9,#0x843
00b18dc8	add x10,x10,#0xa0d
00b18dcc	cmp w8,#0x0
00b18dd0	adrp x2,0x2ba000
00b18dd4	csel x3,x10,x9,eq
00b18dd8	add x2,x2,#0x988
00b18ddc	add x0,sp,#0x8
00b18de0	mov w1,#0xc8
00b18de4	bl 0x00c34d30
00b18de8	mov w0,#0x1
00b18dec	add x1,sp,#0x8
00b18df0	bl 0x00c37fb0
00b18df4	b 0x00b18cdc
00b18df8	bl 0x00c342a0
00b18dfc	adrp x0,0x2d6000
00b18e00	adrp x2,0x2ca000
00b18e04	add x0,x0,#0x829
00b18e08	add x2,x2,#0x687
00b18e0c	mov w1,#0x428
00b18e10	bl 0x00c342b0
00b18e14	mov w0,#0x3d
00b18e18	mov w1,#0x74
00b18e1c	b 0x00b18cd4
00b18e20	asr w9,w20,#0x1f
00b18e24	and w10,w9,#0x7f800000
00b18e28	orr w10,w10,#0x7fffff
00b18e2c	cmp w8,#0x20
00b18e30	and w11,w10,w20
00b18e34	cset w9,eq
00b18e38	cmp w11,#0x93
00b18e3c	cset w10,eq
00b18e40	cmp w11,#0x67
00b18e44	cset w11,eq
00b18e48	cmp w8,#0x3a
00b18e4c	cset w8,eq
00b18e50	and w8,w8,w10
00b18e54	tbnz w8,#0x0,0x00b18d40
00b18e58	orr w8,w10,w11
00b18e5c	and w8,w9,w8
00b18e60	cbz w8,0x00b18cdc
00b18e64	b 0x00b18d40
