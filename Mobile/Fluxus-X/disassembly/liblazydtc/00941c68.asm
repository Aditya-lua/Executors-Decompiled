; FUN_00941c68 @ 00941c68
00941c68	mov x2,xzr
00941c6c	cbz x0,0x00941cb0
00941c70	tbnz x1,#0x3f,0x00941cb0
00941c74	cbz x1,0x00941ca8
00941c78	mov x9,#0xf7cf
00941c7c	movk x9,#0xe353, LSL #16
00941c80	movk x9,#0x9ba5, LSL #32
00941c84	lsr x8,x1,#0x3
00941c88	movk x9,#0x20c4, LSL #48
00941c8c	umulh x8,x8,x9
00941c90	mov w10,#0x3e8
00941c94	lsr x8,x8,#0x4
00941c98	msub x9,x8,x10,x1
00941c9c	mul x9,x9,x10
00941ca0	stp x8,x9,[x0]
00941ca4	b 0x00941cac
00941ca8	stp xzr,xzr,[x0]
00941cac	mov x2,x0
00941cb0	mov x0,x2
00941cb4	ret
