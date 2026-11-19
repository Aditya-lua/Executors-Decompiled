; SSL_ctrl @ 009b2a80
009b2a80	str x19,[sp, #-0x20]!
009b2a84	sub w8,w1,#0x10
009b2a88	cmp w8,#0x78
009b2a8c	mov x19,x0
009b2a90	stp x29,x30,[sp, #0x10]
009b2a94	add x29,sp,#0x10
009b2a98	b.hi 0x009b2abc
009b2a9c	adrp x9,0x74c000
009b2aa0	add x9,x9,#0x70
009b2aa4	ldrsw x8,[x9, x8, LSL #0x2]
009b2aa8	add x8,x8,x9
009b2aac	br x8
009b2ab0	str x3,[x19, #0x4c8]
009b2ab4	mov w0,#0x1
009b2ab8	b 0x009b2dc8
009b2abc	ldr x8,[x19, #0x8]
009b2ac0	ldp x29,x30,[sp, #0x10]
009b2ac4	mov x0,x19
009b2ac8	ldr x4,[x8, #0x80]
009b2acc	ldr x19,[sp], #0x20
009b2ad0	br x4
009b2ad4	ldr w8,[x19, #0x9f0]
009b2ad8	orr w0,w8,w2
009b2adc	str w0,[x19, #0x9f0]
009b2ae0	b 0x009b2dc8
009b2ae4	ldrsw x0,[x19, #0xc60]
009b2ae8	b 0x009b2dc8
009b2aec	ldrsw x0,[x19, #0xc60]
009b2af0	str w2,[x19, #0xc60]
009b2af4	b 0x009b2dc8
009b2af8	ldr x0,[x19, #0xa00]
009b2afc	b 0x009b2dc8
009b2b00	tbnz x2,#0x3f,0x009b2dac
009b2b04	ldr x0,[x19, #0xa00]
009b2b08	str x2,[x19, #0xa00]
009b2b0c	b 0x009b2dc8
009b2b10	sub x8,x2,#0x200
009b2b14	orr w9,wzr,#0x3e00
009b2b18	cmp x8,x9
009b2b1c	mov x0,xzr
009b2b20	b.hi 0x009b2dc8
009b2b24	ldr x8,[x19, #0xa10]
009b2b28	str x2,[x19, #0xa18]
009b2b2c	cmp x8,x2
009b2b30	b.hi 0x009b2d58
009b2b34	mov w0,#0x1
009b2b38	b 0x009b2dc8
009b2b3c	ldrsw x0,[x19, #0x480]
009b2b40	b 0x009b2dc8
009b2b44	ldr w8,[x19, #0x9f0]
009b2b48	bic w0,w8,w2
009b2b4c	str w0,[x19, #0x9f0]
009b2b50	b 0x009b2dc8
009b2b54	ldr x8,[x19, #0x898]
009b2b58	ldr w9,[x8, #0x1c]
009b2b5c	orr w0,w9,w2
009b2b60	str w0,[x8, #0x1c]
009b2b64	b 0x009b2dc8
009b2b68	ldr x8,[x19, #0x898]
009b2b6c	ldr w9,[x8, #0x1c]
009b2b70	bic w0,w9,w2
009b2b74	str w0,[x8, #0x1c]
009b2b78	b 0x009b2dc8
009b2b7c	cbz x3,0x009b2db4
009b2b80	ldr x8,[x19, #0x350]
009b2b84	cbz x8,0x009b2dac
009b2b88	str x8,[x3]
009b2b8c	ldrsw x0,[x19, #0x358]
009b2b90	b 0x009b2dc8
009b2b94	ldr x8,[x19, #0x918]
009b2b98	cbz x8,0x009b2bb4
009b2b9c	mov x0,x19
009b2ba0	bl 0x00c344e0
009b2ba4	cbnz w0,0x009b2bb4
009b2ba8	mov x0,x19
009b2bac	bl 0x00c34510
009b2bb0	cbz w0,0x009b2dbc
009b2bb4	mov x0,#-0x1
009b2bb8	b 0x009b2dc8
009b2bbc	ldr w8,[x19, #0x9f8]
009b2bc0	cmp w2,#0x100
009b2bc4	and w10,w2,#0xffffff00
009b2bc8	orr w11,wzr,#0xfe00
009b2bcc	cset w9,eq
009b2bd0	cmp w10,w11
009b2bd4	cset w12,eq
009b2bd8	cmp w8,#0x100
009b2bdc	and w14,w8,#0xffffff00
009b2be0	orr w9,w9,w12
009b2be4	cset w12,eq
009b2be8	cmp w14,w11
009b2bec	cset w13,eq
009b2bf0	cbz w8,0x009b2c10
009b2bf4	cbz w9,0x009b2c10
009b2bf8	cmp w8,#0x100
009b2bfc	b.eq 0x009b2c10
009b2c00	orr w15,wzr,#0xfe00
009b2c04	cmp w14,w15
009b2c08	mov x0,xzr
009b2c0c	b.ne 0x009b2dc8
009b2c10	cmp w10,w11
009b2c14	cset w10,ne
009b2c18	cmp w2,#0x100
009b2c1c	orr w12,w12,w13
009b2c20	cset w11,ne
009b2c24	cbz w2,0x009b2c38
009b2c28	and w10,w11,w10
009b2c2c	and w10,w12,w10
009b2c30	mov x0,xzr
009b2c34	tbnz w10,#0x0,0x009b2dc8
009b2c38	orr w9,w9,w12
009b2c3c	tbnz w9,#0x0,0x009b2c68
009b2c40	cmp w8,#0x0
009b2c44	cset w9,eq
009b2c48	cmp w8,#0x2ff
009b2c4c	cset w8,gt
009b2c50	cbz w2,0x009b2c68
009b2c54	cmp w2,#0x2ff
009b2c58	b.gt 0x009b2c68
009b2c5c	orr w8,w9,w8
009b2c60	mov x0,xzr
009b2c64	tbnz w8,#0x0,0x009b2dc8
009b2c68	ldr x8,[x19, #0x9a8]
009b2c6c	ldr x8,[x8, #0x8]
009b2c70	ldr w0,[x8]
009b2c74	add x8,x19,#0x9f4
009b2c78	b 0x009b2d2c
009b2c7c	ldr w8,[x19, #0x9f4]
009b2c80	orr w10,wzr,#0xfe00
009b2c84	and w14,w2,#0xffffff00
009b2c88	cmp w8,#0x100
009b2c8c	and w11,w8,#0xffffff00
009b2c90	cset w9,eq
009b2c94	cmp w11,w10
009b2c98	cset w12,eq
009b2c9c	cmp w2,#0x100
009b2ca0	orr w9,w9,w12
009b2ca4	cset w12,eq
009b2ca8	cmp w14,w10
009b2cac	cset w13,eq
009b2cb0	cbz w2,0x009b2cd0
009b2cb4	cbz w9,0x009b2cd0
009b2cb8	cmp w2,#0x100
009b2cbc	b.eq 0x009b2cd0
009b2cc0	orr w15,wzr,#0xfe00
009b2cc4	cmp w14,w15
009b2cc8	mov x0,xzr
009b2ccc	b.ne 0x009b2dc8
009b2cd0	cmp w11,w10
009b2cd4	cset w10,ne
009b2cd8	cmp w8,#0x100
009b2cdc	orr w12,w12,w13
009b2ce0	cset w11,ne
009b2ce4	cbz w8,0x009b2cf8
009b2ce8	and w10,w11,w10
009b2cec	and w10,w12,w10
009b2cf0	mov x0,xzr
009b2cf4	tbnz w10,#0x0,0x009b2dc8
009b2cf8	orr w9,w12,w9
009b2cfc	tbnz w9,#0x0,0x009b2d1c
009b2d00	cmp w2,#0x2ff
009b2d04	ccmp w2,#0x0,#0x4,le
009b2d08	b.ne 0x009b2d1c
009b2d0c	cbz w8,0x009b2d1c
009b2d10	cmp w8,#0x300
009b2d14	mov x0,xzr
009b2d18	b.lt 0x009b2dc8
009b2d1c	ldr x8,[x19, #0x9a8]
009b2d20	ldr x8,[x8, #0x8]
009b2d24	ldr w0,[x8]
009b2d28	add x8,x19,#0x9f8
009b2d2c	mov w1,w2
009b2d30	mov x2,x8
009b2d34	bl 0x00c35e20
009b2d38	cmp w0,#0x0
009b2d3c	cset w0,ne
009b2d40	b 0x009b2dc8
009b2d44	ldr x8,[x19, #0xa18]
009b2d48	sub x9,x2,#0x1
009b2d4c	mov x0,xzr
009b2d50	cmp x9,x8
009b2d54	b.cs 0x009b2dc8
009b2d58	str x2,[x19, #0xa10]
009b2d5c	mov w0,#0x1
009b2d60	b 0x009b2dc8
009b2d64	sub x8,x2,#0x1
009b2d68	cmp x8,#0x1f
009b2d6c	mov x0,xzr
009b2d70	b.hi 0x009b2dc8
009b2d74	cmp x2,#0x2
009b2d78	mov w0,#0x1
009b2d7c	str x2,[x19, #0xa20]
009b2d80	b.lt 0x009b2dc8
009b2d84	str w0,[x19, #0xc60]
009b2d88	b 0x009b2dc8
009b2d8c	ldrsw x0,[x19, #0x9f4]
009b2d90	b 0x009b2dc8
009b2d94	ldrsw x0,[x19, #0x9f8]
009b2d98	b 0x009b2dc8
009b2d9c	mov w8,#0x8
009b2da0	str w8,[x19, #0x28]
009b2da4	mov w0,#0x1
009b2da8	b 0x009b2dc8
009b2dac	mov x0,xzr
009b2db0	b 0x009b2dc8
009b2db4	mov w0,#0x2
009b2db8	b 0x009b2dc8
009b2dbc	ldr x8,[x19, #0x918]
009b2dc0	ldr w8,[x8, #0x388]
009b2dc4	and x0,x8,#0x1
009b2dc8	ldp x29,x30,[sp, #0x10]
009b2dcc	ldr x19,[sp], #0x20
009b2dd0	ret
