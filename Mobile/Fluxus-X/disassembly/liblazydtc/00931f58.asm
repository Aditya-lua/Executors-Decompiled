; FUN_00931f58 @ 00931f58
00931f58	cbz x2,0x00931f98
00931f5c	sub x8,x0,x1
00931f60	cbz x8,0x00931f98
00931f64	str x19,[sp, #-0x20]!
00931f68	stp x29,x30,[sp, #0x10]
00931f6c	add x29,sp,#0x10
00931f70	mov x9,#0x53f7
00931f74	movk x9,#0xa5e3, LSL #16
00931f78	movk x9,#0xc49b, LSL #32
00931f7c	movk x9,#0x20, LSL #48
00931f80	cmp x8,x9
00931f84	b.ge 0x00931fa0
00931f88	mov w9,#0x3e8
00931f8c	mul x8,x8,x9
00931f90	sdiv x19,x8,x2
00931f94	b 0x00931fb8
00931f98	mov x0,xzr
00931f9c	ret
00931fa0	sdiv x8,x8,x2
00931fa4	mov w10,#0x3e8
00931fa8	mul x10,x8,x10
00931fac	cmp x8,x9
00931fb0	orr x8,xzr,#0x7fffffffffffffff
00931fb4	csel x19,x10,x8,lt
00931fb8	mov x0,x5
00931fbc	mov x1,x6
00931fc0	mov x2,x3
00931fc4	mov x3,x4
00931fc8	bl 0x00941dc4
00931fcc	ldp x29,x30,[sp, #0x10]
00931fd0	subs x8,x19,x0
00931fd4	csel x0,x8,xzr,gt
00931fd8	ldr x19,[sp], #0x20
00931fdc	ret
