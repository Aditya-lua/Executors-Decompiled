; FUN_00b43f30 @ 00b43f30
00b43f30	stp x29,x30,[sp, #-0x10]!
00b43f34	mov x29,sp
00b43f38	bl 0x00c41000
00b43f3c	cbz w0,0x00b43f68
00b43f40	adrp x1,0x2a6000
00b43f44	add x1,x1,#0xc47
00b43f48	orr w0,wzr,#0x18
00b43f4c	mov w2,#0x33
00b43f50	bl 0x00c34250
00b43f54	cbz x0,0x00b43f74
00b43f58	mov w8,#0x20
00b43f5c	str x8,[x0]
00b43f60	ldp x29,x30,[sp], #0x10
00b43f64	ret
00b43f68	mov x0,xzr
00b43f6c	ldp x29,x30,[sp], #0x10
00b43f70	ret
00b43f74	bl 0x00c342a0
00b43f78	adrp x0,0x2a6000
00b43f7c	adrp x2,0x2a6000
00b43f80	add x0,x0,#0xc47
00b43f84	add x2,x2,#0xc75
00b43f88	mov w1,#0x35
00b43f8c	bl 0x00c342b0
00b43f90	mov w1,#0x100
00b43f94	mov w0,#0x39
00b43f98	movk w1,#0xc, LSL #16
00b43f9c	mov x2,xzr
00b43fa0	bl 0x00c342c0
00b43fa4	mov x0,xzr
00b43fa8	ldp x29,x30,[sp], #0x10
00b43fac	ret
