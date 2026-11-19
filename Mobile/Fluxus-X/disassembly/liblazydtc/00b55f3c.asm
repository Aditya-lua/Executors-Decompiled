; SipHash_Init @ 00b55f3c
00b55f3c	ldp x10,x9,[x1]
00b55f40	ldr w11,[x0, #0x2c]
00b55f44	mov x12,#0x6575
00b55f48	mov x13,#0x7261
00b55f4c	mov x8,#0x6f6d
00b55f50	movk x12,#0x7073, LSL #16
00b55f54	movk x13,#0x6e65, LSL #16
00b55f58	movk x8,#0x6e64, LSL #16
00b55f5c	movk x12,#0x6d65, LSL #32
00b55f60	movk x13,#0x6765, LSL #32
00b55f64	movk x8,#0x7261, LSL #32
00b55f68	movk x12,#0x736f, LSL #48
00b55f6c	movk x13,#0x6c79, LSL #48
00b55f70	movk x8,#0x646f, LSL #48
00b55f74	eor x12,x10,x12
00b55f78	eor x10,x10,x13
00b55f7c	mov w13,#0x10
00b55f80	cmp w11,#0x0
00b55f84	csel w11,w13,w11,eq
00b55f88	mov w13,#0x4
00b55f8c	stp xzr,x12,[x0]
00b55f90	eor x12,x9,x8
00b55f94	cmp w3,#0x0
00b55f98	stp x12,x10,[x0, #0x10]
00b55f9c	csel w12,w13,w3,eq
00b55fa0	mov x13,#0x6573
00b55fa4	movk x13,#0x7974, LSL #16
00b55fa8	movk x13,#0x6462, LSL #32
00b55fac	mov w10,#0x2
00b55fb0	movk x13,#0x7465, LSL #48
00b55fb4	cmp w2,#0x0
00b55fb8	eor x13,x9,x13
00b55fbc	csel w10,w10,w2,eq
00b55fc0	cmp w11,#0x10
00b55fc4	stp wzr,w11,[x0, #0x28]
00b55fc8	stp w10,w12,[x0, #0x30]
00b55fcc	str x13,[x0, #0x20]
00b55fd0	b.ne 0x00b55fe0
00b55fd4	add x8,x8,#0x16
00b55fd8	eor x8,x9,x8
00b55fdc	str x8,[x0, #0x10]
00b55fe0	mov w0,#0x1
00b55fe4	ret
