; FUN_00892e20 @ 00892e20
00892e20	stp x29,x30,[sp, #-0x60]!
00892e24	stp x28,x27,[sp, #0x10]
00892e28	stp x26,x25,[sp, #0x20]
00892e2c	stp x24,x23,[sp, #0x30]
00892e30	stp x22,x21,[sp, #0x40]
00892e34	stp x20,x19,[sp, #0x50]
00892e38	mov x29,sp
00892e3c	mov x20,#0x2d69
00892e40	mov x27,#0x959d
00892e44	adrp x22,0xcb4000
00892e48	movk x20,#0xeb38, LSL #16
00892e4c	movk x27,#0xb8f4, LSL #16
00892e50	ldr x22,[x22, #0xb48]
00892e54	movk x20,#0xea08, LSL #32
00892e58	movk x27,#0xd34f, LSL #32
00892e5c	adrp x21,0xd1b000
00892e60	movk x20,#0x9ddf, LSL #48
00892e64	adrp x23,0xd1b000
00892e68	adrp x24,0xd1a000
00892e6c	adrp x25,0xd1b000
00892e70	adrp x26,0xd1b000
00892e74	movk x27,#0x949d, LSL #48
00892e78	mov w28,#0x28
00892e7c	ldp x2,x9,[x0, #0x130]
00892e80	ldr w8,[x21, #0x10]
00892e84	ldrb w10,[x0, #0x140]
00892e88	ldr x11,[x0, #0x128]
00892e8c	ldr x12,[x0, #0x110]
00892e90	ldr w13,[x23, #0x50]
00892e94	ldrb w14,[x22]
00892e98	ldr w15,[x24, #0xfc0]
00892e9c	sub x2,x2,#0x1
00892ea0	ldr w16,[x25, #0xb0]
00892ea4	ldr w17,[x26, #0xe0]
00892ea8	ldr w3,[x1, #0x8]
00892eac	cbz x1,0x00892f28
00892eb0	cmp w3,w8
00892eb4	b.ne 0x00892f28
00892eb8	cbz x9,0x00892f88
00892ebc	ldr x1,[x1, #0x20]
00892ec0	lsl w3,w1,#0x3
00892ec4	lsr x4,x1,#0x20
00892ec8	add x3,x3,#0x8
00892ecc	eor x3,x3,x4
00892ed0	mul x3,x3,x20
00892ed4	eor x4,x4,x3, LSR #0x2f
00892ed8	eor x3,x4,x3
00892edc	mul x3,x3,x20
00892ee0	eor x3,x3,x3, LSR #0x2f
00892ee4	mul x3,x3,x27
00892ee8	lsr x3,x3,x10
00892eec	lsr x4,x3,#0x6
00892ef0	ldr x4,[x11, x4, LSL #0x3]
00892ef4	lsr x4,x4,x3
00892ef8	tbz w4,#0x0,0x00892f88
00892efc	madd x4,x3,x28,x12
00892f00	ldr x5,[x4]
00892f04	cmp x5,x1
00892f08	b.eq 0x00892f60
00892f0c	add x3,x3,#0x1
00892f10	and x3,x3,x2
00892f14	lsr x4,x3,#0x6
00892f18	ldr x4,[x11, x4, LSL #0x3]
00892f1c	lsr x4,x4,x3
00892f20	tbnz w4,#0x0,0x00892efc
00892f24	b 0x00892f88
00892f28	cbz x1,0x00892f40
00892f2c	cmp w3,w13
00892f30	b.ne 0x00892f40
00892f34	tbz w14,#0x0,0x00892f74
00892f38	ldrb w4,[x1, #0x49]
00892f3c	tbz w4,#0x0,0x00892f74
00892f40	cmp w3,w15
00892f44	ccmp w3,w16,#0x4,ne
00892f48	ccmp w3,w17,#0x4,ne
00892f4c	cset w4,ne
00892f50	cbz x1,0x00892fa8
00892f54	tbnz w4,#0x0,0x00892fa8
00892f58	ldr x1,[x1, #0x20]
00892f5c	b 0x00892ea8
00892f60	ldrb w1,[x4, #0x20]
00892f64	tbnz w1,#0x0,0x00892f88
00892f68	ldr x1,[x4, #0x8]
00892f6c	cbnz x1,0x00892ea8
00892f70	b 0x00892f88
00892f74	mov x19,x0
00892f78	bl 0x00892fbc
00892f7c	mov x1,x0
00892f80	mov x0,x19
00892f84	cbnz x1,0x00892e7c
00892f88	mov x0,xzr
00892f8c	ldp x20,x19,[sp, #0x50]
00892f90	ldp x22,x21,[sp, #0x40]
00892f94	ldp x24,x23,[sp, #0x30]
00892f98	ldp x26,x25,[sp, #0x20]
00892f9c	ldp x28,x27,[sp, #0x10]
00892fa0	ldp x29,x30,[sp], #0x60
00892fa4	ret
00892fa8	adrp x8,0xd1b000
00892fac	ldr w8,[x8, #0x70]
00892fb0	cmp w3,w8
00892fb4	csel x0,x1,xzr,eq
00892fb8	b 0x00892f8c
