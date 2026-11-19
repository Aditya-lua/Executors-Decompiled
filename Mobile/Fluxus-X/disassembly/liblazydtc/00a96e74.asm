; IDEA_ofb64_encrypt @ 00a96e74
00a96e74	sub sp,sp,#0x70
00a96e78	stp x26,x25,[sp, #0x20]
00a96e7c	stp x24,x23,[sp, #0x30]
00a96e80	stp x22,x21,[sp, #0x40]
00a96e84	stp x20,x19,[sp, #0x50]
00a96e88	stp x29,x30,[sp, #0x60]
00a96e8c	ldr w25,[x5]
00a96e90	mov x19,x5
00a96e94	str x27,[sp, #0x10]
00a96e98	add x29,sp,#0x60
00a96e9c	tbnz w25,#0x1f,0x00a96fdc
00a96ea0	ldrb w8,[x4]
00a96ea4	ldrb w12,[x4, #0x4]
00a96ea8	ldrb w9,[x4, #0x1]
00a96eac	ldrb w13,[x4, #0x5]
00a96eb0	ldrb w10,[x4, #0x2]
00a96eb4	ldrb w14,[x4, #0x6]
00a96eb8	ldrb w11,[x4, #0x3]
00a96ebc	ldrb w15,[x4, #0x7]
00a96ec0	lsl x16,x8,#0x18
00a96ec4	lsl x17,x12,#0x18
00a96ec8	bfm x16,x9,#0x30,#0x7
00a96ecc	bfm x17,x13,#0x30,#0x7
00a96ed0	bfm x16,x10,#0x38,#0x7
00a96ed4	bfm x17,x14,#0x38,#0x7
00a96ed8	mov x20,x4
00a96edc	mov x22,x2
00a96ee0	strb w8,[sp, #0x18]
00a96ee4	strb w9,[sp, #0x19]
00a96ee8	orr x8,x16,x11
00a96eec	orr x9,x17,x15
00a96ef0	strb w10,[sp, #0x1a]
00a96ef4	strb w11,[sp, #0x1b]
00a96ef8	strb w12,[sp, #0x1c]
00a96efc	strb w13,[sp, #0x1d]
00a96f00	strb w14,[sp, #0x1e]
00a96f04	stp x8,x9,[sp]
00a96f08	strb w15,[sp, #0x1f]
00a96f0c	cbz x2,0x00a96fd4
00a96f10	mov x21,x3
00a96f14	mov x23,x1
00a96f18	mov x24,x0
00a96f1c	mov w26,wzr
00a96f20	add x27,sp,#0x18
00a96f24	sub x22,x22,#0x1
00a96f28	cbnz w25,0x00a96f78
00a96f2c	mov x0,sp
00a96f30	mov x1,x21
00a96f34	bl 0x00c3ddb0
00a96f38	ldp x8,x9,[sp]
00a96f3c	add w26,w26,#0x1
00a96f40	lsr x10,x8,#0x18
00a96f44	strb w10,[sp, #0x18]
00a96f48	lsr x10,x8,#0x10
00a96f4c	strb w10,[sp, #0x19]
00a96f50	lsr x10,x8,#0x8
00a96f54	strb w8,[sp, #0x1b]
00a96f58	lsr x8,x9,#0x18
00a96f5c	strb w8,[sp, #0x1c]
00a96f60	lsr x8,x9,#0x10
00a96f64	strb w8,[sp, #0x1d]
00a96f68	lsr x8,x9,#0x8
00a96f6c	strb w10,[sp, #0x1a]
00a96f70	strb w8,[sp, #0x1e]
00a96f74	strb w9,[sp, #0x1f]
00a96f78	ldrb w8,[x24], #0x1
00a96f7c	ldrb w9,[x27, w25, SXTW ]
00a96f80	add w10,w25,#0x1
00a96f84	and w25,w10,#0x7
00a96f88	eor w8,w9,w8
00a96f8c	strb w8,[x23], #0x1
00a96f90	cbnz x22,0x00a96f24
00a96f94	cbz w26,0x00a96fd4
00a96f98	ldp x8,x9,[sp]
00a96f9c	lsr x10,x8,#0x18
00a96fa0	strb w10,[x20]
00a96fa4	lsr x10,x8,#0x10
00a96fa8	strb w8,[x20, #0x3]
00a96fac	lsr x8,x8,#0x8
00a96fb0	strb w10,[x20, #0x1]
00a96fb4	lsr x10,x9,#0x18
00a96fb8	strb w8,[x20, #0x2]
00a96fbc	lsr x8,x9,#0x10
00a96fc0	strb w10,[x20, #0x4]
00a96fc4	lsr x10,x9,#0x8
00a96fc8	strb w8,[x20, #0x5]
00a96fcc	strb w10,[x20, #0x6]
00a96fd0	strb w9,[x20, #0x7]
00a96fd4	stp xzr,xzr,[sp]
00a96fd8	b 0x00a96fe0
00a96fdc	mov w25,#0xffffffff
00a96fe0	str w25,[x19]
00a96fe4	ldp x29,x30,[sp, #0x60]
00a96fe8	ldp x20,x19,[sp, #0x50]
00a96fec	ldp x22,x21,[sp, #0x40]
00a96ff0	ldp x24,x23,[sp, #0x30]
00a96ff4	ldp x26,x25,[sp, #0x20]
00a96ff8	ldr x27,[sp, #0x10]
00a96ffc	add sp,sp,#0x70
00a97000	ret
