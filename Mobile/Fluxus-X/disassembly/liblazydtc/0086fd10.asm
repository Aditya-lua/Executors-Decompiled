; FUN_0086fd10 @ 0086fd10
0086fd10	stp x29,x30,[sp, #-0x30]!
0086fd14	str x21,[sp, #0x10]
0086fd18	stp x20,x19,[sp, #0x20]
0086fd1c	mov x29,sp
0086fd20	ldp x9,x8,[x0, #0x20]
0086fd24	mov x21,#0x7c15
0086fd28	movk x21,#0x7f4a, LSL #16
0086fd2c	mov x20,x1
0086fd30	mov x19,x0
0086fd34	movk x21,#0x79b9, LSL #32
0086fd38	add x10,x9,x9, LSL #0x1
0086fd3c	movk x21,#0x9e37, LSL #48
0086fd40	cmp x8,x10, LSR #0x2
0086fd44	b.cc 0x0086fdb8
0086fd48	cbz x8,0x0086fdac
0086fd4c	ldr x8,[x20]
0086fd50	ldrb w11,[x19, #0x30]
0086fd54	lsr x10,x8,#0x4
0086fd58	eor x10,x10,x8, LSR #0x9
0086fd5c	mul x10,x10,x21
0086fd60	lsr x11,x10,x11
0086fd64	ldr x10,[x19, #0x18]
0086fd68	lsr x12,x11,#0x6
0086fd6c	ldr x12,[x10, x12, LSL #0x3]
0086fd70	lsr x12,x12,x11
0086fd74	tbz w12,#0x0,0x0086fdac
0086fd78	ldr x12,[x19]
0086fd7c	sub x13,x9,#0x1
0086fd80	mov w14,#0x18
0086fd84	mul x15,x11,x14
0086fd88	ldr x15,[x12, x15#0x0]
0086fd8c	cmp x15,x8
0086fd90	b.eq 0x0086fdb8
0086fd94	add x11,x11,#0x1
0086fd98	and x11,x11,x13
0086fd9c	lsr x15,x11,#0x6
0086fda0	ldr x15,[x10, x15, LSL #0x3]
0086fda4	lsr x15,x15,x11
0086fda8	tbnz w15,#0x0,0x0086fd84
0086fdac	mov x0,x19
0086fdb0	bl 0x0086fe6c
0086fdb4	ldr x9,[x19, #0x20]
0086fdb8	ldr x10,[x20]
0086fdbc	ldrb w11,[x19, #0x30]
0086fdc0	ldr x12,[x19, #0x18]
0086fdc4	lsr x8,x10,#0x4
0086fdc8	eor x8,x8,x10, LSR #0x9
0086fdcc	mul x8,x8,x21
0086fdd0	lsr x8,x8,x11
0086fdd4	mov w11,#0x1
0086fdd8	lsr x13,x8,#0x6
0086fddc	lsl x15,x11,x8
0086fde0	ldr x11,[x19]
0086fde4	ldr x14,[x12, x13, LSL #0x3]
0086fde8	tst x15,x14
0086fdec	b.eq 0x0086fe28
0086fdf0	sub x9,x9,#0x1
0086fdf4	mov w16,#0x18
0086fdf8	mov w17,#0x1
0086fdfc	mul x13,x8,x16
0086fe00	ldr x13,[x11, x13#0x0]
0086fe04	cmp x13,x10
0086fe08	b.eq 0x0086fe50
0086fe0c	add x8,x8,#0x1
0086fe10	and x8,x8,x9
0086fe14	lsr x13,x8,#0x6
0086fe18	lsl x15,x17,x8
0086fe1c	ldr x14,[x12, x13, LSL #0x3]
0086fe20	tst x14,x15
0086fe24	b.ne 0x0086fdfc
0086fe28	mov w9,#0x18
0086fe2c	madd x9,x8,x9,x11
0086fe30	orr x11,x14,x15
0086fe34	str x11,[x12, x13, LSL #0x3]
0086fe38	stp xzr,xzr,[x9, #0x8]
0086fe3c	ldr x11,[x19, #0x28]
0086fe40	str x10,[x9]
0086fe44	add x9,x11,#0x1
0086fe48	ldr x11,[x19]
0086fe4c	str x9,[x19, #0x28]
0086fe50	mov w9,#0x18
0086fe54	madd x8,x8,x9,x11
0086fe58	add x0,x8,#0x8
0086fe5c	ldp x20,x19,[sp, #0x20]
0086fe60	ldr x21,[sp, #0x10]
0086fe64	ldp x29,x30,[sp], #0x30
0086fe68	ret
