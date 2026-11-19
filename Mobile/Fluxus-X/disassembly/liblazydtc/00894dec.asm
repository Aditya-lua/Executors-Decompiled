; FUN_00894dec @ 00894dec
00894dec	stp x29,x30,[sp, #-0x20]!
00894df0	stp x20,x19,[sp, #0x10]
00894df4	mov x29,sp
00894df8	mov x20,x1
00894dfc	mov x19,x0
00894e00	bl 0x008951fc
00894e04	ldr x8,[x20]
00894e08	mov x11,#0x2d69
00894e0c	movk x11,#0xeb38, LSL #16
00894e10	lsl w9,w8,#0x3
00894e14	lsr x10,x8,#0x20
00894e18	movk x11,#0xea08, LSL #32
00894e1c	movk x11,#0x9ddf, LSL #48
00894e20	add x9,x9,#0x8
00894e24	eor x9,x9,x10
00894e28	mul x9,x9,x11
00894e2c	eor x10,x10,x9, LSR #0x2f
00894e30	eor x9,x10,x9
00894e34	mov x10,#0x959d
00894e38	mul x9,x9,x11
00894e3c	movk x10,#0xb8f4, LSL #16
00894e40	ldr x11,[x19, #0x18]
00894e44	movk x10,#0xd34f, LSL #32
00894e48	movk x10,#0x949d, LSL #48
00894e4c	eor x9,x9,x9, LSR #0x2f
00894e50	mul x9,x9,x10
00894e54	ldrb w10,[x19, #0x30]
00894e58	lsr x9,x9,x10
00894e5c	mov w10,#0x1
00894e60	lsr x12,x9,#0x6
00894e64	lsl x14,x10,x9
00894e68	ldr x10,[x19]
00894e6c	ldr x13,[x11, x12, LSL #0x3]
00894e70	tst x14,x13
00894e74	b.eq 0x00894eac
00894e78	ldr x12,[x19, #0x20]
00894e7c	mov w16,#0x1
00894e80	sub x15,x12,#0x1
00894e84	ldr x12,[x10, x9, LSL #0x3]
00894e88	cmp x12,x8
00894e8c	b.eq 0x00894ec4
00894e90	add x9,x9,#0x1
00894e94	and x9,x9,x15
00894e98	lsr x12,x9,#0x6
00894e9c	lsl x14,x16,x9
00894ea0	ldr x13,[x11, x12, LSL #0x3]
00894ea4	tst x13,x14
00894ea8	b.ne 0x00894e84
00894eac	orr x13,x13,x14
00894eb0	str x13,[x11, x12, LSL #0x3]
00894eb4	ldr x11,[x19, #0x28]
00894eb8	str x8,[x10, x9, LSL #0x3]
00894ebc	add x8,x11,#0x1
00894ec0	str x8,[x19, #0x28]
00894ec4	add x0,x10,x9, LSL #0x3
00894ec8	ldp x20,x19,[sp, #0x10]
00894ecc	ldp x29,x30,[sp], #0x20
00894ed0	ret
