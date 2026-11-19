; FUN_008a7f0c @ 008a7f0c
008a7f0c	stp x29,x30,[sp, #-0x20]!
008a7f10	stp x20,x19,[sp, #0x10]
008a7f14	mov x29,sp
008a7f18	mov x20,x1
008a7f1c	mov x19,x0
008a7f20	bl 0x008a8000
008a7f24	ldr x8,[x20]
008a7f28	mov x11,#0x2d69
008a7f2c	movk x11,#0xeb38, LSL #16
008a7f30	lsl w9,w8,#0x3
008a7f34	lsr x10,x8,#0x20
008a7f38	movk x11,#0xea08, LSL #32
008a7f3c	movk x11,#0x9ddf, LSL #48
008a7f40	add x9,x9,#0x8
008a7f44	eor x9,x9,x10
008a7f48	mul x9,x9,x11
008a7f4c	eor x10,x10,x9, LSR #0x2f
008a7f50	eor x9,x10,x9
008a7f54	mov x10,#0x959d
008a7f58	mul x9,x9,x11
008a7f5c	movk x10,#0xb8f4, LSL #16
008a7f60	ldr x11,[x19, #0x18]
008a7f64	movk x10,#0xd34f, LSL #32
008a7f68	movk x10,#0x949d, LSL #48
008a7f6c	eor x9,x9,x9, LSR #0x2f
008a7f70	mul x9,x9,x10
008a7f74	ldrb w10,[x19, #0x30]
008a7f78	lsr x9,x9,x10
008a7f7c	mov w10,#0x1
008a7f80	lsr x12,x9,#0x6
008a7f84	lsl x14,x10,x9
008a7f88	ldr x10,[x19]
008a7f8c	ldr x13,[x11, x12, LSL #0x3]
008a7f90	tst x14,x13
008a7f94	b.eq 0x008a7fd0
008a7f98	ldr x12,[x19, #0x20]
008a7f9c	mov w16,#0x1
008a7fa0	sub x15,x12,#0x1
008a7fa4	lsl x12,x9,#0x4
008a7fa8	ldr x12,[x10, x12#0x0]
008a7fac	cmp x12,x8
008a7fb0	b.eq 0x008a7fec
008a7fb4	add x9,x9,#0x1
008a7fb8	and x9,x9,x15
008a7fbc	lsr x12,x9,#0x6
008a7fc0	lsl x14,x16,x9
008a7fc4	ldr x13,[x11, x12, LSL #0x3]
008a7fc8	tst x13,x14
008a7fcc	b.ne 0x008a7fa4
008a7fd0	orr x13,x13,x14
008a7fd4	str x13,[x11, x12, LSL #0x3]
008a7fd8	add x11,x10,x9, LSL #0x4
008a7fdc	ldr x12,[x19, #0x28]
008a7fe0	stp x8,xzr,[x11]
008a7fe4	add x8,x12,#0x1
008a7fe8	str x8,[x19, #0x28]
008a7fec	add x8,x10,x9, LSL #0x4
008a7ff0	add x0,x8,#0x8
008a7ff4	ldp x20,x19,[sp, #0x10]
008a7ff8	ldp x29,x30,[sp], #0x20
008a7ffc	ret
