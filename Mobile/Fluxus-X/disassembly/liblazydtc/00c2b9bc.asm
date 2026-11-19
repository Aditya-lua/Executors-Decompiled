; FUN_00c2b9bc @ 00c2b9bc
00c2b9bc	bti c
00c2b9c0	tbnz x0,#0x3e,0x00c2b9cc
00c2b9c4	mov x8,xzr
00c2b9c8	b 0x00c2b9d0
00c2b9cc	ldr x8,[x1, #0x10]
00c2b9d0	stp x28,x27,[sp, #-0x50]!
00c2b9d4	stp x26,x25,[sp, #0x10]
00c2b9d8	stp x24,x23,[sp, #0x20]
00c2b9dc	stp x22,x21,[sp, #0x30]
00c2b9e0	stp x20,x19,[sp, #0x40]
00c2b9e4	dup v1.2D,x8
00c2b9e8	adrp x9,0x29d000
00c2b9ec	adrp x10,0x29c000
00c2b9f0	adrp x11,0x29c000
00c2b9f4	adrp x12,0x29b000
00c2b9f8	ldr q0,[x9, #0x70]
00c2b9fc	ldr q2,[x10, #0x600]
00c2ba00	ldr q3,[x11, #0x750]
00c2ba04	ldr q4,[x12, #0xff0]
00c2ba08	ushl v5.2D,v1.2D,v0.2D
00c2ba0c	adrp x9,0x29c000
00c2ba10	adrp x10,0x29c000
00c2ba14	ushl v2.2D,v1.2D,v2.2D
00c2ba18	ushl v0.2D,v1.2D,v3.2D
00c2ba1c	ushl v1.2D,v1.2D,v4.2D
00c2ba20	adrp x11,0x29c000
00c2ba24	adrp x12,0x29d000
00c2ba28	ldr q3,[x10]
00c2ba2c	ldr q4,[x11, #0x10]
00c2ba30	ldr q6,[x9, #0x230]
00c2ba34	ldr q7,[x12, #0x1b0]
00c2ba38	and v2.16B,v2.16B,v3.16B
00c2ba3c	lsr x2,x0,#0x6
00c2ba40	lsr x14,x0,#0x7
00c2ba44	and v3.16B,v5.16B,v4.16B
00c2ba48	and v4.16B,v1.16B,v6.16B
00c2ba4c	and v5.16B,v0.16B,v7.16B
00c2ba50	lsr x5,x0,#0xe
00c2ba54	lsr x6,x0,#0x14
00c2ba58	lsr x7,x0,#0x9
00c2ba5c	lsl x19,x0,#0x7
00c2ba60	lsl x22,x0,#0x15
00c2ba64	lsr x24,x0,#0x1
00c2ba68	orr v2.16B,v3.16B,v2.16B
00c2ba6c	orr v3.16B,v5.16B,v4.16B
00c2ba70	lsr x17,x0,#0x10
00c2ba74	and x20,x5,#0x20
00c2ba78	and x5,x6,#0x8
00c2ba7c	and x23,x14,#0x20000
00c2ba80	and x25,x2,#0x40
00c2ba84	fmov x27,d1
00c2ba88	and x6,x22,#0x2000000000000
00c2ba8c	orr v2.16B,v3.16B,v2.16B
00c2ba90	and x22,x24,#0x80
00c2ba94	and x24,x19,#0x300000
00c2ba98	bfm x5,x7,#0x30,#0x0
00c2ba9c	orr x7,x23,x25
00c2baa0	and x19,x19,#0x400000
00c2baa4	lsr x23,x0,#0x3
00c2baa8	lsr x15,x0,#0x1d
00c2baac	lsr x16,x0,#0x1a
00c2bab0	ext v3.16B,v2.16B,v2.16B,0x8
00c2bab4	lsr x4,x8,#0x5
00c2bab8	lsl x14,x8,#0x23
00c2babc	fmov x28,d0
00c2bac0	bfm x19,x17,#0x2e,#0x0
00c2bac4	lsr x10,x0,#0x16
00c2bac8	lsr x11,x0,#0x4
00c2bacc	lsr x3,x8,#0x12
00c2bad0	and x21,x17,#0x10
00c2bad4	and x27,x27,#0x80000
00c2bad8	and x17,x23,#0x800000
00c2badc	lsr x9,x8,#0xe
00c2bae0	orr v2.8B,v2.8B,v3.8B
00c2bae4	lsr x12,x8,#0x2e
00c2bae8	lsr x1,x8,#0xd
00c2baec	and x16,x16,#0x2
00c2baf0	and x4,x4,#0x4
00c2baf4	and x26,x14,#0x3c000000000
00c2baf8	bfm x24,x2,#0x34,#0x0
00c2bafc	bfm x6,x15,#0x12,#0x0
00c2bb00	bfxil x27,x8,#0x10,#0x1
00c2bb04	orr x8,x19,x17
00c2bb08	bfm x16,x11,#0x31,#0x0
00c2bb0c	orr x20,x20,x21
00c2bb10	and x21,x28,#0x800000000000000
00c2bb14	orr x15,x22,x4
00c2bb18	bfm x26,x3,#0x14,#0x0
00c2bb1c	bfm x8,x10,#0x22,#0x0
00c2bb20	lsl x13,x0,#0x3
00c2bb24	fmov x28,d2
00c2bb28	bfm x21,x1,#0x26,#0x0
00c2bb2c	orr x17,x20,x5
00c2bb30	orr x1,x7,x24
00c2bb34	orr x10,x6,x15
00c2bb38	and x11,x11,#0x2000
00c2bb3c	orr x15,x26,x27
00c2bb40	orr x16,x16,x17
00c2bb44	orr x10,x1,x10
00c2bb48	orr x8,x8,x11
00c2bb4c	and x13,x13,#0x400
00c2bb50	orr x11,x15,x21
00c2bb54	orr x10,x16,x10
00c2bb58	bfm x8,x12,#0x6,#0x0
00c2bb5c	orr x12,x28,x13
00c2bb60	orr x10,x10,x11
00c2bb64	orr x10,x12,x10
00c2bb68	tst x0,#0x1
00c2bb6c	and x11,x14,#0x1000000000
00c2bb70	bfm x8,x9,#0x25,#0x0
00c2bb74	orr x9,x10,#0x300
00c2bb78	csel x9,x10,x9,eq
00c2bb7c	orr x8,x8,x11
00c2bb80	orr x8,x8,x9
00c2bb84	adrp x9,0xd28000
00c2bb88	orr x8,x8,#-0x8000000000000000
00c2bb8c	str x8,[x9, #0xe8]
00c2bb90	ldp x20,x19,[sp, #0x40]
00c2bb94	ldp x22,x21,[sp, #0x30]
00c2bb98	ldp x24,x23,[sp, #0x20]
00c2bb9c	ldp x26,x25,[sp, #0x10]
00c2bba0	ldp x28,x27,[sp], #0x50
00c2bba4	ret
