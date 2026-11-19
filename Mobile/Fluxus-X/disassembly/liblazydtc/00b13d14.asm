; X509_VERIFY_PARAM_new @ 00b13d14
00b13d14	stp x29,x30,[sp, #-0x10]!
00b13d18	adrp x1,0x2d8000
00b13d1c	add x1,x1,#0xa44
00b13d20	orr w0,wzr,#0x70
00b13d24	mov w2,#0x56
00b13d28	mov x29,sp
00b13d2c	bl 0x00c34250
00b13d30	cbz x0,0x00b13d4c
00b13d34	movi d0,#-0x100000000
00b13d38	mov w8,#0xffffffff
00b13d3c	stur d0,[x0, #0x24]
00b13d40	str w8,[x0, #0x2c]
00b13d44	ldp x29,x30,[sp], #0x10
00b13d48	ret
00b13d4c	bl 0x00c342a0
00b13d50	adrp x0,0x2d8000
00b13d54	adrp x2,0x2d6000
00b13d58	add x0,x0,#0xa44
00b13d5c	add x2,x2,#0x7f5
00b13d60	mov w1,#0x58
00b13d64	bl 0x00c342b0
00b13d68	mov w1,#0x100
00b13d6c	mov w0,#0xb
00b13d70	movk w1,#0xc, LSL #16
00b13d74	mov x2,xzr
00b13d78	bl 0x00c342c0
00b13d7c	mov x0,xzr
00b13d80	ldp x29,x30,[sp], #0x10
00b13d84	ret
