; FUN_0089dcf8 @ 0089dcf8
0089dcf8	ldr x8,[x0, #0x28]
0089dcfc	cbz x8,0x0089dd74
0089dd00	ldr x8,[x1]
0089dd04	mov x10,#0x7c15
0089dd08	movk x10,#0x7f4a, LSL #16
0089dd0c	lsr x9,x8,#0x4
0089dd10	movk x10,#0x79b9, LSL #32
0089dd14	movk x10,#0x9e37, LSL #48
0089dd18	eor x9,x9,x8, LSR #0x9
0089dd1c	mul x9,x9,x10
0089dd20	ldrb w10,[x0, #0x30]
0089dd24	lsr x10,x9,x10
0089dd28	ldr x9,[x0, #0x18]
0089dd2c	lsr x11,x10,#0x6
0089dd30	ldr x11,[x9, x11, LSL #0x3]
0089dd34	lsr x11,x11,x10
0089dd38	tbz w11,#0x0,0x0089dd74
0089dd3c	ldr x12,[x0, #0x20]
0089dd40	ldr x11,[x0]
0089dd44	mov w13,#0x30
0089dd48	sub x12,x12,#0x1
0089dd4c	madd x14,x10,x13,x11
0089dd50	ldr x15,[x14]
0089dd54	cmp x15,x8
0089dd58	b.eq 0x0089dd78
0089dd5c	add x10,x10,#0x1
0089dd60	and x10,x10,x12
0089dd64	lsr x14,x10,#0x6
0089dd68	ldr x14,[x9, x14, LSL #0x3]
0089dd6c	lsr x14,x14,x10
0089dd70	tbnz w14,#0x0,0x0089dd4c
0089dd74	mov x14,xzr
0089dd78	add x8,x14,#0x8
0089dd7c	cmp x14,#0x0
0089dd80	csel x0,xzr,x8,eq
0089dd84	ret
