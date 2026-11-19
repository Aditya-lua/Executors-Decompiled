; FUN_00941e38 @ 00941e38
00941e38	mov x9,#0x5af5
00941e3c	movk x9,#0x7bd0, LSL #16
00941e40	sub x8,x0,x2
00941e44	movk x9,#0x863, LSL #32
00941e48	cmp x8,x9
00941e4c	b.le 0x00941e58
00941e50	orr x0,xzr,#0x7fffffffffffffff
00941e54	ret
00941e58	mov x9,#-0x5af5
00941e5c	movk x9,#0x842f, LSL #16
00941e60	movk x9,#0xf79c, LSL #32
00941e64	cmp x8,x9
00941e68	b.ge 0x00941e74
00941e6c	orr x0,xzr,#-0x8000000000000000
00941e70	ret
00941e74	mov w9,#0x4240
00941e78	movk w9,#0xf, LSL #16
00941e7c	mul x8,x8,x9
00941e80	add x8,x8,w1, SXTW 
00941e84	sub x0,x8,w3, SXTW 
00941e88	ret
