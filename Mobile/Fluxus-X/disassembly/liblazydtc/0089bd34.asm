; FUN_0089bd34 @ 0089bd34
0089bd34	stp x29,x30,[sp, #-0x20]!
0089bd38	stp x20,x19,[sp, #0x10]
0089bd3c	mov x29,sp
0089bd40	mov x20,x1
0089bd44	mov x19,x0
0089bd48	bl 0x008a0818
0089bd4c	ldr x8,[x20]
0089bd50	mov x11,#0x2d69
0089bd54	movk x11,#0xeb38, LSL #16
0089bd58	lsl w9,w8,#0x3
0089bd5c	lsr x10,x8,#0x20
0089bd60	movk x11,#0xea08, LSL #32
0089bd64	movk x11,#0x9ddf, LSL #48
0089bd68	add x9,x9,#0x8
0089bd6c	eor x9,x9,x10
0089bd70	mul x9,x9,x11
0089bd74	eor x10,x10,x9, LSR #0x2f
0089bd78	eor x9,x10,x9
0089bd7c	mov x10,#0x959d
0089bd80	mul x9,x9,x11
0089bd84	movk x10,#0xb8f4, LSL #16
0089bd88	ldr x11,[x19, #0x18]
0089bd8c	movk x10,#0xd34f, LSL #32
0089bd90	movk x10,#0x949d, LSL #48
0089bd94	eor x9,x9,x9, LSR #0x2f
0089bd98	mul x9,x9,x10
0089bd9c	ldrb w10,[x19, #0x30]
0089bda0	lsr x9,x9,x10
0089bda4	mov w10,#0x1
0089bda8	lsr x12,x9,#0x6
0089bdac	lsl x14,x10,x9
0089bdb0	ldr x10,[x19]
0089bdb4	ldr x13,[x11, x12, LSL #0x3]
0089bdb8	tst x14,x13
0089bdbc	b.eq 0x0089bdf8
0089bdc0	ldr x12,[x19, #0x20]
0089bdc4	mov w16,#0x1
0089bdc8	sub x15,x12,#0x1
0089bdcc	lsl x12,x9,#0x4
0089bdd0	ldr x12,[x10, x12#0x0]
0089bdd4	cmp x12,x8
0089bdd8	b.eq 0x0089be18
0089bddc	add x9,x9,#0x1
0089bde0	and x9,x9,x15
0089bde4	lsr x12,x9,#0x6
0089bde8	lsl x14,x16,x9
0089bdec	ldr x13,[x11, x12, LSL #0x3]
0089bdf0	tst x13,x14
0089bdf4	b.ne 0x0089bdcc
0089bdf8	orr x13,x13,x14
0089bdfc	str x13,[x11, x12, LSL #0x3]
0089be00	add x11,x10,x9, LSL #0x4
0089be04	ldr x12,[x19, #0x28]
0089be08	str x8,[x11]
0089be0c	add x8,x12,#0x1
0089be10	str wzr,[x11, #0x8]
0089be14	str x8,[x19, #0x28]
0089be18	add x8,x10,x9, LSL #0x4
0089be1c	add x0,x8,#0x8
0089be20	ldp x20,x19,[sp, #0x10]
0089be24	ldp x29,x30,[sp], #0x20
0089be28	ret
