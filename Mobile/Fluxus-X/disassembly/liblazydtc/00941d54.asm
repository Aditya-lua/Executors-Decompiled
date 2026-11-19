; FUN_00941d54 @ 00941d54
00941d54	mov x9,#0x53f6
00941d58	movk x9,#0xa5e3, LSL #16
00941d5c	movk x9,#0xc49b, LSL #32
00941d60	sub x8,x0,x2
00941d64	movk x9,#0x20, LSL #48
00941d68	cmp x8,x9
00941d6c	b.le 0x00941d78
00941d70	orr x0,xzr,#0x7fffffffffffffff
00941d74	ret
00941d78	mov x9,#0xac0a
00941d7c	movk x9,#0x5a1c, LSL #16
00941d80	movk x9,#0x3b64, LSL #32
00941d84	movk x9,#0xffdf, LSL #48
00941d88	cmp x8,x9
00941d8c	b.ge 0x00941d98
00941d90	orr x0,xzr,#-0x8000000000000000
00941d94	ret
00941d98	mov w11,#0x4dd3
00941d9c	mov w9,#0x3e8
00941da0	sub w10,w1,w3
00941da4	movk w11,#0x1062, LSL #16
00941da8	mul x8,x8,x9
00941dac	smull x9,w10,w11
00941db0	lsr x10,x9,#0x3f
00941db4	asr x9,x9,#0x26
00941db8	add w9,w9,w10
00941dbc	add x0,x8,w9, SXTW 
00941dc0	ret
