; FUN_0088dbf8 @ 0088dbf8
0088dbf8	ldr x8,[x0, #0x28]
0088dbfc	cbz x8,0x0088dca0
0088dc00	ldr x8,[x1]
0088dc04	mov x11,#0x2d69
0088dc08	movk x11,#0xeb38, LSL #16
0088dc0c	lsl w9,w8,#0x3
0088dc10	lsr x10,x8,#0x20
0088dc14	movk x11,#0xea08, LSL #32
0088dc18	movk x11,#0x9ddf, LSL #48
0088dc1c	add x9,x9,#0x8
0088dc20	eor x9,x9,x10
0088dc24	mul x9,x9,x11
0088dc28	eor x10,x10,x9, LSR #0x2f
0088dc2c	eor x9,x10,x9
0088dc30	mov x10,#0x959d
0088dc34	mul x9,x9,x11
0088dc38	movk x10,#0xb8f4, LSL #16
0088dc3c	movk x10,#0xd34f, LSL #32
0088dc40	movk x10,#0x949d, LSL #48
0088dc44	eor x9,x9,x9, LSR #0x2f
0088dc48	mul x9,x9,x10
0088dc4c	ldrb w10,[x0, #0x30]
0088dc50	lsr x10,x9,x10
0088dc54	ldr x9,[x0, #0x18]
0088dc58	lsr x11,x10,#0x6
0088dc5c	ldr x11,[x9, x11, LSL #0x3]
0088dc60	lsr x11,x11,x10
0088dc64	tbz w11,#0x0,0x0088dca0
0088dc68	ldr x12,[x0, #0x20]
0088dc6c	ldr x11,[x0]
0088dc70	sub x12,x12,#0x1
0088dc74	ldr x13,[x11, x10, LSL #0x3]
0088dc78	cmp x13,x8
0088dc7c	cset w0,eq
0088dc80	b.eq 0x0088dc9c
0088dc84	add x10,x10,#0x1
0088dc88	and x10,x10,x12
0088dc8c	lsr x13,x10,#0x6
0088dc90	ldr x13,[x9, x13, LSL #0x3]
0088dc94	lsr x13,x13,x10
0088dc98	tbnz w13,#0x0,0x0088dc74
0088dc9c	ret
0088dca0	mov w0,wzr
0088dca4	ret
