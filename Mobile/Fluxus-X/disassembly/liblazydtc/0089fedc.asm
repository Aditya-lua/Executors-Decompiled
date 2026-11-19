; FUN_0089fedc @ 0089fedc
0089fedc	sub sp,sp,#0x60
0089fee0	stp x29,x30,[sp, #0x40]
0089fee4	str x19,[sp, #0x50]
0089fee8	add x29,sp,#0x40
0089feec	mrs x19,tpidr_el0
0089fef0	ldr x8,[x19, #0x28]
0089fef4	stur x8,[x29, #-0x8]
0089fef8	ldr x0,[x0, #0xb8]
0089fefc	cbz x0,0x0089ffec
0089ff00	cbz x3,0x0089ff24
0089ff04	str x2,[sp]
0089ff08	mov w8,wzr
0089ff0c	ldp q1,q0,[x3]
0089ff10	ldr x9,[x3, #0x20]
0089ff14	str x9,[sp, #0x28]
0089ff18	stur q0,[sp, #0x18]
0089ff1c	stur q1,[sp, #0x8]
0089ff20	b 0x0089ffe0
0089ff24	ldr x8,[x1, #0x28]
0089ff28	cbz x8,0x0089ffc8
0089ff2c	lsl w8,w2,#0x3
0089ff30	mov x10,#0x2d69
0089ff34	lsr x9,x2,#0x20
0089ff38	movk x10,#0xeb38, LSL #16
0089ff3c	add x8,x8,#0x8
0089ff40	movk x10,#0xea08, LSL #32
0089ff44	eor x8,x8,x9
0089ff48	movk x10,#0x9ddf, LSL #48
0089ff4c	mul x8,x8,x10
0089ff50	eor x9,x9,x8, LSR #0x2f
0089ff54	eor x8,x9,x8
0089ff58	mov x9,#0x959d
0089ff5c	mul x8,x8,x10
0089ff60	movk x9,#0xb8f4, LSL #16
0089ff64	movk x9,#0xd34f, LSL #32
0089ff68	movk x9,#0x949d, LSL #48
0089ff6c	eor x8,x8,x8, LSR #0x2f
0089ff70	mul x8,x8,x9
0089ff74	ldrb w9,[x1, #0x30]
0089ff78	lsr x9,x8,x9
0089ff7c	ldr x8,[x1, #0x18]
0089ff80	lsr x10,x9,#0x6
0089ff84	ldr x10,[x8, x10, LSL #0x3]
0089ff88	lsr x10,x10,x9
0089ff8c	tbz w10,#0x0,0x0089ffc8
0089ff90	ldr x11,[x1, #0x20]
0089ff94	ldr x10,[x1]
0089ff98	mov w12,#0x30
0089ff9c	sub x11,x11,#0x1
0089ffa0	madd x13,x9,x12,x10
0089ffa4	ldr x14,[x13]
0089ffa8	cmp x14,x2
0089ffac	b.eq 0x008a000c
0089ffb0	add x9,x9,#0x1
0089ffb4	and x9,x9,x11
0089ffb8	lsr x13,x9,#0x6
0089ffbc	ldr x13,[x8, x13, LSL #0x3]
0089ffc0	lsr x13,x13,x9
0089ffc4	tbnz w13,#0x0,0x0089ffa0
0089ffc8	movi v0.2D,#0x0
0089ffcc	str x2,[sp]
0089ffd0	mov w8,#0x1
0089ffd4	str xzr,[sp, #0x28]
0089ffd8	stur q0,[sp, #0x8]
0089ffdc	stur q0,[sp, #0x18]
0089ffe0	mov x1,sp
0089ffe4	strb w8,[sp, #0x30]
0089ffe8	bl 0x008a0018
0089ffec	ldr x8,[x19, #0x28]
0089fff0	ldur x9,[x29, #-0x8]
0089fff4	cmp x8,x9
0089fff8	b.ne 0x008a0014
0089fffc	ldp x29,x30,[sp, #0x40]
008a0000	ldr x19,[sp, #0x50]
008a0004	add sp,sp,#0x60
008a0008	ret
008a000c	add x3,x13,#0x8
008a0010	b 0x0089ff04
008a0014	bl 0x00c2fec0
