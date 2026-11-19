; FUN_00941dc4 @ 00941dc4
00941dc4	mov x9,#0x53f6
00941dc8	movk x9,#0xa5e3, LSL #16
00941dcc	movk x9,#0xc49b, LSL #32
00941dd0	sub x8,x0,x2
00941dd4	movk x9,#0x20, LSL #48
00941dd8	cmp x8,x9
00941ddc	b.le 0x00941de8
00941de0	orr x0,xzr,#0x7fffffffffffffff
00941de4	ret
00941de8	mov x9,#0xac0a
00941dec	movk x9,#0x5a1c, LSL #16
00941df0	movk x9,#0x3b64, LSL #32
00941df4	movk x9,#0xffdf, LSL #48
00941df8	cmp x8,x9
00941dfc	b.ge 0x00941e08
00941e00	orr x0,xzr,#-0x8000000000000000
00941e04	ret
00941e08	mov w9,#0x3e8
00941e0c	add w10,w1,#0x3e7
00941e10	mov w11,#0x4dd3
00941e14	movk w11,#0x1062, LSL #16
00941e18	mul x8,x8,x9
00941e1c	sub w9,w10,w3
00941e20	smull x9,w9,w11
00941e24	lsr x10,x9,#0x3f
00941e28	asr x9,x9,#0x26
00941e2c	add w9,w9,w10
00941e30	add x0,x8,w9, SXTW 
00941e34	ret
