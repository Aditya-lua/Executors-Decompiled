; evp_do_ciph_getparams @ 00a62e14
00a62e14	cbz x0,0x00a62e74
00a62e18	ldr x8,[x0, #0x78]
00a62e1c	cbz x8,0x00a62e30
00a62e20	ldr x2,[x0, #0xd0]
00a62e24	cbz x2,0x00a62e38
00a62e28	mov x0,x1
00a62e2c	br x2
00a62e30	mov w0,#0xffffffff
00a62e34	ret
00a62e38	stp x29,x30,[sp, #-0x10]!
00a62e3c	mov x29,sp
00a62e40	bl 0x00c342a0
00a62e44	adrp x0,0x2af000
00a62e48	adrp x2,0x2c9000
00a62e4c	add x0,x0,#0xfe8
00a62e50	add x2,x2,#0x987
00a62e54	mov w1,#0x41
00a62e58	bl 0x00c342b0
00a62e5c	orr w0,wzr,#0x6
00a62e60	mov w1,#0xc5
00a62e64	mov x2,xzr
00a62e68	bl 0x00c342c0
00a62e6c	mov w0,wzr
00a62e70	ldp x29,x30,[sp], #0x10
00a62e74	ret
