; evp_do_md_getparams @ 00a62f48
00a62f48	cbz x0,0x00a62fa8
00a62f4c	ldr x8,[x0, #0x70]
00a62f50	cbz x8,0x00a62f64
00a62f54	ldr x2,[x0, #0xc0]
00a62f58	cbz x2,0x00a62f6c
00a62f5c	mov x0,x1
00a62f60	br x2
00a62f64	mov w0,#0xffffffff
00a62f68	ret
00a62f6c	stp x29,x30,[sp, #-0x10]!
00a62f70	mov x29,sp
00a62f74	bl 0x00c342a0
00a62f78	adrp x0,0x2af000
00a62f7c	adrp x2,0x2c9000
00a62f80	add x0,x0,#0xfe8
00a62f84	add x2,x2,#0x987
00a62f88	mov w1,#0x41
00a62f8c	bl 0x00c342b0
00a62f90	orr w0,wzr,#0x6
00a62f94	mov w1,#0xc5
00a62f98	mov x2,xzr
00a62f9c	bl 0x00c342c0
00a62fa0	mov w0,wzr
00a62fa4	ldp x29,x30,[sp], #0x10
00a62fa8	ret
