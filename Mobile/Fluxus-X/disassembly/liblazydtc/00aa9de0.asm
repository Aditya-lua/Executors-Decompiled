; FUN_00aa9de0 @ 00aa9de0
00aa9de0	ldrb w11,[x0, #0xf]
00aa9de4	adrp x10,0x76e000
00aa9de8	add x10,x10,#0x998
00aa9dec	and x8,x11,#0xf
00aa9df0	add x9,x1,x8, LSL #0x4
00aa9df4	ldp x8,x12,[x9]
00aa9df8	orr w9,wzr,#0xe
00aa9dfc	b 0x00aa9e2c
00aa9e00	ldrb w11,[x0, x9]
00aa9e04	and x13,x8,#0xf
00aa9e08	ldr x13,[x10, x13, LSL #0x3]
00aa9e0c	extr x16,x12,x8,#0x4
00aa9e10	and x14,x11,#0xf
00aa9e14	add x14,x1,x14, LSL #0x4
00aa9e18	ldp x15,x14,[x14]
00aa9e1c	eor x8,x13,x12, LSR #0x4
00aa9e20	sub x9,x9,#0x1
00aa9e24	eor x8,x8,x15
00aa9e28	eor x12,x14,x16
00aa9e2c	and x11,x11,#-0x10
00aa9e30	and x13,x12,#0xf
00aa9e34	extr x14,x8,x12,#0x4
00aa9e38	ldr x12,[x10, x13, LSL #0x3]
00aa9e3c	add x11,x1,x11
00aa9e40	ldp x13,x11,[x11]
00aa9e44	cmn x9,#0x1
00aa9e48	eor x8,x12,x8, LSR #0x4
00aa9e4c	eor x12,x8,x13
00aa9e50	eor x8,x11,x14
00aa9e54	b.ne 0x00aa9e00
00aa9e58	lsr x10,x12,#0x38
00aa9e5c	lsr x9,x12,#0x20
00aa9e60	strb w10,[x0]
00aa9e64	lsr x10,x12,#0x30
00aa9e68	strb w10,[x0, #0x1]
00aa9e6c	lsr x10,x12,#0x28
00aa9e70	strb w9,[x0, #0x3]
00aa9e74	ubfx x9,x12,#0x10,#0x10
00aa9e78	strb w10,[x0, #0x2]
00aa9e7c	ubfx x10,x12,#0x18,#0x8
00aa9e80	ubfx x11,x12,#0x8,#0x18
00aa9e84	strb w9,[x0, #0x5]
00aa9e88	lsr x9,x8,#0x38
00aa9e8c	strb w10,[x0, #0x4]
00aa9e90	lsr x10,x8,#0x20
00aa9e94	strb w11,[x0, #0x6]
00aa9e98	lsr x11,x8,#0x30
00aa9e9c	strb w9,[x0, #0x8]
00aa9ea0	lsr x9,x8,#0x28
00aa9ea4	strb w11,[x0, #0x9]
00aa9ea8	ubfx x11,x8,#0x18,#0x8
00aa9eac	strb w9,[x0, #0xa]
00aa9eb0	ubfx x9,x8,#0x10,#0x10
00aa9eb4	strb w10,[x0, #0xb]
00aa9eb8	ubfx x10,x8,#0x8,#0x18
00aa9ebc	strb w12,[x0, #0x7]
00aa9ec0	strb w11,[x0, #0xc]
00aa9ec4	strb w9,[x0, #0xd]
00aa9ec8	strb w10,[x0, #0xe]
00aa9ecc	strb w8,[x0, #0xf]
00aa9ed0	ret
