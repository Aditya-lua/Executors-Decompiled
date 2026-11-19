; ix::WebSocket::readyStateToString @ 0098feb8
0098feb8	cmp w0,#0x3
0098febc	b.hi 0x0098ff08
0098fec0	adrp x10,0x74a000
0098fec4	mov w9,w0
0098fec8	add x10,x10,#0xa4
0098fecc	ldrsw x9,[x10, x9, LSL #0x2]
0098fed0	add x9,x9,x10
0098fed4	br x9
0098fed8	adrp x10,0x29d000
0098fedc	add x10,x10,#0xa3e
0098fee0	ldr x10,[x10]
0098fee4	mov w9,#0x14
0098fee8	mov w11,#0x474e
0098feec	stp xzr,xzr,[x8]
0098fef0	str xzr,[x8, #0x10]
0098fef4	strb w9,[x8]
0098fef8	sturh w11,[x8, #0x9]
0098fefc	stur x10,[x8, #0x1]
0098ff00	strb wzr,[x8, #0xb]
0098ff04	ret
0098ff08	mov x10,#0x4e55
0098ff0c	movk x10,#0x4e4b, LSL #16
0098ff10	movk x10,#0x574f, LSL #32
0098ff14	orr w9,wzr,#0xe
0098ff18	movk x10,#0x4e, LSL #48
0098ff1c	stp xzr,xzr,[x8]
0098ff20	str xzr,[x8, #0x10]
0098ff24	b 0x0098ff68
0098ff28	mov w10,#0x504f
0098ff2c	mov w9,#0x8
0098ff30	movk w10,#0x4e45, LSL #16
0098ff34	stp xzr,xzr,[x8]
0098ff38	str xzr,[x8, #0x10]
0098ff3c	strb w9,[x8]
0098ff40	stur w10,[x8, #0x1]
0098ff44	strb wzr,[x8, #0x5]
0098ff48	ret
0098ff4c	mov x10,#0x4c43
0098ff50	movk x10,#0x534f, LSL #16
0098ff54	movk x10,#0x4e49, LSL #32
0098ff58	stp xzr,xzr,[x8]
0098ff5c	str xzr,[x8, #0x10]
0098ff60	orr w9,wzr,#0xe
0098ff64	movk x10,#0x47, LSL #48
0098ff68	strb w9,[x8]
0098ff6c	stur x10,[x8, #0x1]
0098ff70	ret
0098ff74	mov w11,#0x4c43
0098ff78	orr w9,wzr,#0xc
0098ff7c	mov w10,#0x4445
0098ff80	movk w11,#0x534f, LSL #16
0098ff84	stp xzr,xzr,[x8, #0x8]
0098ff88	strb w9,[x8]
0098ff8c	sturh w10,[x8, #0x5]
0098ff90	stur w11,[x8, #0x1]
0098ff94	strb wzr,[x8, #0x7]
0098ff98	ret
