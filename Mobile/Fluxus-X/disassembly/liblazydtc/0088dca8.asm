; FUN_0088dca8 @ 0088dca8
0088dca8	ldr x8,[x0, #0xc8]
0088dcac	cbz x8,0x0088dd64
0088dcb0	lsl w8,w1,#0x3
0088dcb4	mov x10,#0x2d69
0088dcb8	lsr x9,x1,#0x20
0088dcbc	movk x10,#0xeb38, LSL #16
0088dcc0	add x8,x8,#0x8
0088dcc4	movk x10,#0xea08, LSL #32
0088dcc8	eor x8,x8,x9
0088dccc	movk x10,#0x9ddf, LSL #48
0088dcd0	mul x8,x8,x10
0088dcd4	eor x9,x9,x8, LSR #0x2f
0088dcd8	eor x8,x9,x8
0088dcdc	mov x9,#0x959d
0088dce0	mul x8,x8,x10
0088dce4	movk x9,#0xb8f4, LSL #16
0088dce8	movk x9,#0xd34f, LSL #32
0088dcec	movk x9,#0x949d, LSL #48
0088dcf0	eor x8,x8,x8, LSR #0x2f
0088dcf4	mul x8,x8,x9
0088dcf8	ldrb w9,[x0, #0xd0]
0088dcfc	lsr x9,x8,x9
0088dd00	ldr x8,[x0, #0xb8]
0088dd04	lsr x10,x9,#0x6
0088dd08	ldr x10,[x8, x10, LSL #0x3]
0088dd0c	lsr x10,x10,x9
0088dd10	tbz w10,#0x0,0x0088dd64
0088dd14	ldr x11,[x0, #0xc0]
0088dd18	ldr x10,[x0, #0xa0]
0088dd1c	mov w12,#0x18
0088dd20	sub x11,x11,#0x1
0088dd24	madd x13,x9,x12,x10
0088dd28	ldr x14,[x13]
0088dd2c	cmp x14,x1
0088dd30	b.eq 0x0088dd50
0088dd34	add x9,x9,#0x1
0088dd38	and x9,x9,x11
0088dd3c	lsr x13,x9,#0x6
0088dd40	ldr x13,[x8, x13, LSL #0x3]
0088dd44	lsr x13,x13,x9
0088dd48	tbnz w13,#0x0,0x0088dd24
0088dd4c	b 0x0088dd64
0088dd50	ldrb w8,[x13, #0x9]
0088dd54	cmp w8,#0x1
0088dd58	b.ne 0x0088dd64
0088dd5c	ldrb w0,[x13, #0x8]
0088dd60	ret
0088dd64	mov w0,#0xffffffff
0088dd68	ret
