; FUN_00ac3c34 @ 00ac3c34
00ac3c34	stp x26,x25,[sp, #-0x40]!
00ac3c38	stp x24,x23,[sp, #0x10]
00ac3c3c	stp x22,x21,[sp, #0x20]
00ac3c40	stp x20,x19,[sp, #0x30]
00ac3c44	ldp w9,w12,[x0]
00ac3c48	ldp w11,w8,[x0, #0x8]
00ac3c4c	ldr w19,[x0, #0x10]
00ac3c50	cmp x2,#0x10
00ac3c54	b.cc 0x00ac3de8
00ac3c58	ldp w10,w13,[x0, #0x18]
00ac3c5c	ldr w14,[x0, #0x20]
00ac3c60	ldr w15,[x0, #0x14]
00ac3c64	add w16,w10,w10, LSR #0x2
00ac3c68	add w17,w13,w13, LSR #0x2
00ac3c6c	add w18,w14,w14, LSR #0x2
00ac3c70	mov w4,w18
00ac3c74	mov w5,w17
00ac3c78	mov w6,w16
00ac3c7c	ldrb w7,[x1]
00ac3c80	ldrb w23,[x1, #0x1]
00ac3c84	ldrb w21,[x1, #0x8]
00ac3c88	ldrb w26,[x1, #0x9]
00ac3c8c	ldrb w22,[x1, #0xc]
00ac3c90	bfm x7,x23,#0x38,#0x7
00ac3c94	ldrb w23,[x1, #0xd]
00ac3c98	ldrb w20,[x1, #0x4]
00ac3c9c	ldrb w25,[x1, #0x5]
00ac3ca0	ldrb w24,[x1, #0x2]
00ac3ca4	bfm x21,x26,#0x38,#0x7
00ac3ca8	ldrb w26,[x1, #0x6]
00ac3cac	bfm x22,x23,#0x38,#0x7
00ac3cb0	ldrb w23,[x1, #0xa]
00ac3cb4	bfm x20,x25,#0x38,#0x7
00ac3cb8	ldrb w25,[x1, #0x3]
00ac3cbc	bfm x7,x24,#0x30,#0x7
00ac3cc0	bfm x20,x26,#0x30,#0x7
00ac3cc4	ldrb w26,[x1, #0x7]
00ac3cc8	bfm x21,x23,#0x30,#0x7
00ac3ccc	ldrb w23,[x1, #0xb]
00ac3cd0	bfm x7,x25,#0x28,#0x7
00ac3cd4	add x9,x7,w9, UXTW 
00ac3cd8	ldrb w24,[x1, #0xe]
00ac3cdc	lsr x7,x9,#0x20
00ac3ce0	bfm x20,x26,#0x28,#0x7
00ac3ce4	bfm x21,x23,#0x28,#0x7
00ac3ce8	ldrb w23,[x1, #0xf]
00ac3cec	add x12,x7,w12, UXTW 
00ac3cf0	add x12,x12,x20
00ac3cf4	lsr x20,x12,#0x20
00ac3cf8	bfm x22,x24,#0x30,#0x7
00ac3cfc	and x9,x9,#0xffffffff
00ac3d00	add x11,x20,w11, UXTW 
00ac3d04	bfm x22,x23,#0x28,#0x7
00ac3d08	mul x7,x9,x15
00ac3d0c	mul x23,x9,x10
00ac3d10	mul x20,x9,x13
00ac3d14	mul x9,x9,x14
00ac3d18	and x12,x12,#0xffffffff
00ac3d1c	add x11,x11,x21
00ac3d20	madd x7,x12,x4,x7
00ac3d24	madd x23,x12,x15,x23
00ac3d28	madd x20,x12,x10,x20
00ac3d2c	madd x9,x12,x13,x9
00ac3d30	lsr x12,x11,#0x20
00ac3d34	add x8,x12,w8, UXTW 
00ac3d38	and x11,x11,#0xffffffff
00ac3d3c	add x8,x8,x22
00ac3d40	add w19,w19,w3
00ac3d44	madd x12,x11,x5,x7
00ac3d48	madd x7,x11,x4,x23
00ac3d4c	madd x20,x11,x15,x20
00ac3d50	madd x9,x11,x10,x9
00ac3d54	lsr x11,x8,#0x20
00ac3d58	and x8,x8,#0xffffffff
00ac3d5c	add w11,w19,w11
00ac3d60	madd x12,x8,x6,x12
00ac3d64	madd x7,x8,x5,x7
00ac3d68	madd x19,x8,x4,x20
00ac3d6c	madd x8,x8,x15,x9
00ac3d70	mul w9,w11,w16
00ac3d74	mul w20,w11,w17
00ac3d78	add x7,x7,x12, LSR #0x20
00ac3d7c	mul w21,w11,w18
00ac3d80	add x19,x19,x20
00ac3d84	add x7,x7,x9
00ac3d88	add x8,x8,x21
00ac3d8c	add x19,x19,x7, LSR #0x20
00ac3d90	add x20,x8,x19, LSR #0x20
00ac3d94	lsr x8,x20,#0x20
00ac3d98	madd w8,w11,w15,w8
00ac3d9c	and w9,w8,#0xfffffffc
00ac3da0	and w21,w8,#0x3
00ac3da4	add w8,w9,w8, LSR #0x2
00ac3da8	add w9,w8,w12
00ac3dac	eor w11,w8,w12
00ac3db0	eor w8,w9,w8
00ac3db4	orr w8,w8,w11
00ac3db8	eor w8,w8,w9
00ac3dbc	add w12,w7,w8, LSR #0x1f
00ac3dc0	bic w8,w7,w12
00ac3dc4	add w11,w19,w8, LSR #0x1f
00ac3dc8	bic w8,w19,w11
00ac3dcc	add w8,w20,w8, LSR #0x1f
00ac3dd0	sub x2,x2,#0x10
00ac3dd4	bic w7,w20,w8
00ac3dd8	cmp x2,#0xf
00ac3ddc	add w19,w21,w7, LSR #0x1f
00ac3de0	add x1,x1,#0x10
00ac3de4	b.hi 0x00ac3c7c
00ac3de8	stp w9,w12,[x0]
00ac3dec	stp w11,w8,[x0, #0x8]
00ac3df0	str w19,[x0, #0x10]
00ac3df4	ldp x20,x19,[sp, #0x30]
00ac3df8	ldp x22,x21,[sp, #0x20]
00ac3dfc	ldp x24,x23,[sp, #0x10]
00ac3e00	ldp x26,x25,[sp], #0x40
00ac3e04	ret
