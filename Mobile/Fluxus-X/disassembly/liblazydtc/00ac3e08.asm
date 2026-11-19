; Poly1305_Final @ 00ac3e08
00ac3e08	stp x20,x19,[sp, #-0x20]!
00ac3e0c	stp x29,x30,[sp, #0x10]
00ac3e10	ldr x8,[x0, #0xe0]
00ac3e14	mov x19,x0
00ac3e18	mov x20,x1
00ac3e1c	add x29,sp,#0x10
00ac3e20	cbz x8,0x00ac3e68
00ac3e24	add x9,x8,#0x1
00ac3e28	add x10,x19,x8
00ac3e2c	mov w11,#0x1
00ac3e30	cmp x9,#0xf
00ac3e34	strb w11,[x10, #0xd0]
00ac3e38	b.hi 0x00ac3e54
00ac3e3c	add x9,x19,x9
00ac3e40	orr w10,wzr,#0xf
00ac3e44	add x0,x9,#0xd0
00ac3e48	sub x2,x10,x8
00ac3e4c	mov w1,wzr
00ac3e50	bl 0x00c301c0
00ac3e54	add x1,x19,#0xd0
00ac3e58	mov w2,#0x10
00ac3e5c	mov x0,x19
00ac3e60	mov w3,wzr
00ac3e64	bl 0x00ac3c34
00ac3e68	ldp w9,w10,[x19]
00ac3e6c	ldp w11,w12,[x19, #0x8]
00ac3e70	ldr w8,[x19, #0x10]
00ac3e74	orr w1,wzr,#0xf8
00ac3e78	add x13,x9,#0x5
00ac3e7c	add x14,x10,x13, LSR #0x20
00ac3e80	add x15,x11,x14, LSR #0x20
00ac3e84	add x16,x12,x15, LSR #0x20
00ac3e88	lsr x17,x16,#0x20
00ac3e8c	add w8,w8,w17
00ac3e90	lsr w8,w8,#0x2
00ac3e94	neg w17,w8
00ac3e98	sub w18,w8,#0x1
00ac3e9c	and w13,w17,w13
00ac3ea0	and w14,w17,w14
00ac3ea4	and w15,w17,w15
00ac3ea8	and w8,w17,w16
00ac3eac	and w9,w18,w9
00ac3eb0	and w10,w18,w10
00ac3eb4	ldp w16,w17,[x19, #0xc0]
00ac3eb8	orr w9,w9,w13
00ac3ebc	orr w10,w10,w14
00ac3ec0	ldp w13,w14,[x19, #0xc8]
00ac3ec4	and w11,w18,w11
00ac3ec8	orr w11,w11,w15
00ac3ecc	add x9,x9,x16
00ac3ed0	add x10,x10,x17
00ac3ed4	and w12,w18,w12
00ac3ed8	add x11,x11,x13
00ac3edc	add x10,x10,x9, LSR #0x20
00ac3ee0	orr w8,w12,w8
00ac3ee4	strb w9,[x20]
00ac3ee8	ubfx x12,x9,#0x8,#0x18
00ac3eec	ubfx x13,x9,#0x10,#0x10
00ac3ef0	ubfx x9,x9,#0x18,#0x8
00ac3ef4	add x11,x11,x10, LSR #0x20
00ac3ef8	add w8,w8,w14
00ac3efc	strb w12,[x20, #0x1]
00ac3f00	strb w13,[x20, #0x2]
00ac3f04	strb w9,[x20, #0x3]
00ac3f08	strb w10,[x20, #0x4]
00ac3f0c	ubfx x9,x10,#0x8,#0x18
00ac3f10	ubfx x12,x10,#0x10,#0x10
00ac3f14	ubfx x10,x10,#0x18,#0x8
00ac3f18	lsr x13,x11,#0x20
00ac3f1c	strb w9,[x20, #0x5]
00ac3f20	strb w10,[x20, #0x7]
00ac3f24	ubfx x9,x11,#0x8,#0x18
00ac3f28	ubfx x10,x11,#0x10,#0x10
00ac3f2c	add w8,w8,w13
00ac3f30	strb w11,[x20, #0x8]
00ac3f34	ubfx x11,x11,#0x18,#0x8
00ac3f38	strb w9,[x20, #0x9]
00ac3f3c	strb w10,[x20, #0xa]
00ac3f40	strb w8,[x20, #0xc]
00ac3f44	lsr w9,w8,#0x8
00ac3f48	lsr w10,w8,#0x10
00ac3f4c	lsr w8,w8,#0x18
00ac3f50	strb w12,[x20, #0x6]
00ac3f54	strb w11,[x20, #0xb]
00ac3f58	strb w9,[x20, #0xd]
00ac3f5c	strb w10,[x20, #0xe]
00ac3f60	strb w8,[x20, #0xf]
00ac3f64	ldp x29,x30,[sp, #0x10]
00ac3f68	mov x0,x19
00ac3f6c	ldp x20,x19,[sp], #0x20
00ac3f70	b 0x00c34750
