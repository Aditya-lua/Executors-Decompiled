; FUN_00aa8db0 @ 00aa8db0
00aa8db0	sub sp,sp,#0x70
00aa8db4	stp x22,x21,[sp, #0x40]
00aa8db8	stp x20,x19,[sp, #0x50]
00aa8dbc	stp x29,x30,[sp, #0x60]
00aa8dc0	ldr q0,[x4]
00aa8dc4	mov w20,w2
00aa8dc8	mov x21,x1
00aa8dcc	mov x22,x0
00aa8dd0	mov x0,x4
00aa8dd4	mov x1,x4
00aa8dd8	mov x2,x3
00aa8ddc	str x23,[sp, #0x30]
00aa8de0	add x29,sp,#0x60
00aa8de4	mov w23,w5
00aa8de8	mov x19,x4
00aa8dec	str q0,[sp]
00aa8df0	blr x6
00aa8df4	add w8,w20,#0x7
00aa8df8	add w9,w20,#0xe
00aa8dfc	cmp w8,#0x0
00aa8e00	csel w8,w9,w8,lt
00aa8e04	asr w8,w8,#0x3
00aa8e08	cmp w20,#0x1
00aa8e0c	cbz w23,0x00aa8ecc
00aa8e10	b.lt 0x00aa8fe0
00aa8e14	sxtw x8,w8
00aa8e18	cmp x8,#0x1
00aa8e1c	csinc x10,x8,xzr,gt
00aa8e20	cmp x10,#0x1f
00aa8e24	mov x9,xzr
00aa8e28	b.ls 0x00aa8fb8
00aa8e2c	cmp x8,#0x1
00aa8e30	csinc x9,x8,xzr,gt
00aa8e34	add x12,x22,x9
00aa8e38	add x11,x21,x9
00aa8e3c	cmp x12,x21
00aa8e40	add x9,x19,x9
00aa8e44	cset w12,hi
00aa8e48	cmp x11,x22
00aa8e4c	cset w13,hi
00aa8e50	cmp x9,x21
00aa8e54	cset w9,hi
00aa8e58	cmp x11,x19
00aa8e5c	and w12,w12,w13
00aa8e60	cset w11,hi
00aa8e64	tbnz w12,#0x0,0x00aa8fb4
00aa8e68	and w11,w9,w11
00aa8e6c	mov x9,xzr
00aa8e70	tbnz w11,#0x0,0x00aa8fb8
00aa8e74	and x9,x10,#0x7fffffffffffffe0
00aa8e78	mov x13,sp
00aa8e7c	add x11,x21,#0x10
00aa8e80	add x12,x22,#0x10
00aa8e84	add x13,x13,#0x20
00aa8e88	add x14,x19,#0x10
00aa8e8c	mov x15,x9
00aa8e90	ldp q0,q1,[x12, #-0x10]
00aa8e94	ldp q2,q3,[x14, #-0x10]
00aa8e98	subs x15,x15,#0x20
00aa8e9c	add x12,x12,#0x20
00aa8ea0	add x14,x14,#0x20
00aa8ea4	eor v0.16B,v2.16B,v0.16B
00aa8ea8	eor v1.16B,v3.16B,v1.16B
00aa8eac	stp q0,q1,[x13, #-0x10]
00aa8eb0	stp q0,q1,[x11, #-0x10]
00aa8eb4	add x13,x13,#0x20
00aa8eb8	add x11,x11,#0x20
00aa8ebc	b.ne 0x00aa8e90
00aa8ec0	cmp x10,x9
00aa8ec4	b.ne 0x00aa8fb8
00aa8ec8	b 0x00aa8fe0
00aa8ecc	b.lt 0x00aa8fe0
00aa8ed0	sxtw x8,w8
00aa8ed4	cmp x8,#0x1
00aa8ed8	csinc x10,x8,xzr,gt
00aa8edc	cmp x10,#0x1f
00aa8ee0	mov x9,xzr
00aa8ee4	b.hi 0x00aa8f14
00aa8ee8	mov x10,sp
00aa8eec	ldrb w11,[x22, x9]
00aa8ef0	add x12,x10,x9
00aa8ef4	strb w11,[x12, #0x10]
00aa8ef8	ldrb w12,[x19, x9]
00aa8efc	eor w11,w12,w11
00aa8f00	strb w11,[x21, x9]
00aa8f04	add x9,x9,#0x1
00aa8f08	cmp x9,x8
00aa8f0c	b.lt 0x00aa8eec
00aa8f10	b 0x00aa8fe0
00aa8f14	cmp x8,#0x1
00aa8f18	csinc x9,x8,xzr,gt
00aa8f1c	add x12,x22,x9
00aa8f20	add x11,x21,x9
00aa8f24	cmp x12,x21
00aa8f28	add x9,x19,x9
00aa8f2c	cset w12,hi
00aa8f30	cmp x11,x22
00aa8f34	cset w13,hi
00aa8f38	cmp x9,x21
00aa8f3c	cset w9,hi
00aa8f40	cmp x11,x19
00aa8f44	and w12,w12,w13
00aa8f48	cset w11,hi
00aa8f4c	tbnz w12,#0x0,0x00aa9120
00aa8f50	and w11,w9,w11
00aa8f54	mov x9,xzr
00aa8f58	tbnz w11,#0x0,0x00aa8ee8
00aa8f5c	and x9,x10,#0x7fffffffffffffe0
00aa8f60	mov x13,sp
00aa8f64	add x11,x21,#0x10
00aa8f68	add x12,x22,#0x10
00aa8f6c	add x13,x13,#0x20
00aa8f70	add x14,x19,#0x10
00aa8f74	mov x15,x9
00aa8f78	ldp q0,q1,[x12, #-0x10]
00aa8f7c	subs x15,x15,#0x20
00aa8f80	add x12,x12,#0x20
00aa8f84	stp q0,q1,[x13, #-0x10]
00aa8f88	ldp q2,q3,[x14, #-0x10]
00aa8f8c	add x13,x13,#0x20
00aa8f90	add x14,x14,#0x20
00aa8f94	eor v0.16B,v2.16B,v0.16B
00aa8f98	eor v1.16B,v3.16B,v1.16B
00aa8f9c	stp q0,q1,[x11, #-0x10]
00aa8fa0	add x11,x11,#0x20
00aa8fa4	b.ne 0x00aa8f78
00aa8fa8	cmp x10,x9
00aa8fac	b.ne 0x00aa8ee8
00aa8fb0	b 0x00aa8fe0
00aa8fb4	mov x9,xzr
00aa8fb8	mov x10,sp
00aa8fbc	ldrb w11,[x22, x9]
00aa8fc0	ldrb w12,[x19, x9]
00aa8fc4	add x13,x10,x9
00aa8fc8	eor w11,w12,w11
00aa8fcc	strb w11,[x13, #0x10]
00aa8fd0	strb w11,[x21, x9]
00aa8fd4	add x9,x9,#0x1
00aa8fd8	cmp x9,x8
00aa8fdc	b.lt 0x00aa8fbc
00aa8fe0	add w8,w20,#0x7
00aa8fe4	cmp w20,#0x0
00aa8fe8	csel w8,w8,w20,lt
00aa8fec	and w9,w8,#0xfffffff8
00aa8ff0	subs w9,w20,w9
00aa8ff4	asr w8,w8,#0x3
00aa8ff8	b.eq 0x00aa90fc
00aa8ffc	mov x11,sp
00aa9000	add x8,x11,w8, SXTW 
00aa9004	mov w10,#0x8
00aa9008	ldur q1,[x8, #0x1]
00aa900c	dup v0.4S,w9
00aa9010	sub w9,w10,w9
00aa9014	ldrb w10,[x8]
00aa9018	ldrb w13,[x8, #0x4]
00aa901c	ldrb w17,[x8, #0x8]
00aa9020	ldrb w2,[x8, #0xc]
00aa9024	ldrb w14,[x8, #0x5]
00aa9028	ldrb w18,[x8, #0x9]
00aa902c	ldrb w3,[x8, #0xd]
00aa9030	ldrb w11,[x8, #0x2]
00aa9034	ldrb w15,[x8, #0x6]
00aa9038	ldrb w0,[x8, #0xa]
00aa903c	ldrb w4,[x8, #0xe]
00aa9040	dup v2.4S,w9
00aa9044	uxtl v3.8H,v1.8B
00aa9048	uxtl2 v1.8H,v1.16B
00aa904c	ldrb w12,[x8, #0x3]
00aa9050	ldrb w16,[x8, #0x7]
00aa9054	ldrb w1,[x8, #0xb]
00aa9058	ldrb w8,[x8, #0xf]
00aa905c	neg v2.4S,v2.4S
00aa9060	fmov s5,w10
00aa9064	uxtl2 v7.4S,v3.8H
00aa9068	uxtl2 v16.4S,v1.8H
00aa906c	uxtl v1.4S,v1.4H
00aa9070	uxtl v3.4S,v3.4H
00aa9074	fmov s4,w13
00aa9078	fmov s6,w2
00aa907c	mov v5.S[0x1],v3.S[0x0]
00aa9080	ushl v1.4S,v1.4S,v2.4S
00aa9084	ushl v16.4S,v16.4S,v2.4S
00aa9088	ushl v3.4S,v3.4S,v2.4S
00aa908c	ushl v2.4S,v7.4S,v2.4S
00aa9090	fmov s7,w17
00aa9094	mov v4.S[0x1],w14
00aa9098	mov v6.S[0x1],w3
00aa909c	mov v7.S[0x1],w18
00aa90a0	mov v4.S[0x2],w15
00aa90a4	mov v6.S[0x2],w4
00aa90a8	mov v7.S[0x2],w0
00aa90ac	mov v5.S[0x2],w11
00aa90b0	mov v4.S[0x3],w16
00aa90b4	mov v6.S[0x3],w8
00aa90b8	mov v7.S[0x3],w1
00aa90bc	mov v5.S[0x3],w12
00aa90c0	ushl v7.4S,v7.4S,v0.4S
00aa90c4	ushl v6.4S,v6.4S,v0.4S
00aa90c8	ushl v4.4S,v4.4S,v0.4S
00aa90cc	ushl v0.4S,v5.4S,v0.4S
00aa90d0	orr v1.16B,v1.16B,v7.16B
00aa90d4	orr v0.16B,v3.16B,v0.16B
00aa90d8	orr v2.16B,v2.16B,v4.16B
00aa90dc	orr v4.16B,v16.16B,v6.16B
00aa90e0	xtn v1.4H,v1.4S
00aa90e4	xtn v0.4H,v0.4S
00aa90e8	xtn2 v1.8H,v4.4S
00aa90ec	xtn2 v0.8H,v2.4S
00aa90f0	xtn v0.8B,v0.8H
00aa90f4	xtn2 v0.16B,v1.8H
00aa90f8	b 0x00aa9104
00aa90fc	mov x9,sp
00aa9100	ldr q0,[x9,w8, sxtw]
00aa9104	str q0,[x19]
00aa9108	ldp x29,x30,[sp, #0x60]
00aa910c	ldp x20,x19,[sp, #0x50]
00aa9110	ldp x22,x21,[sp, #0x40]
00aa9114	ldr x23,[sp, #0x30]
00aa9118	add sp,sp,#0x70
00aa911c	ret
00aa9120	mov x9,xzr
00aa9124	b 0x00aa8ee8
