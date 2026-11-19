; ossl_ctx_global_properties @ 00ac3f74
00ac3f74	str x19,[sp, #-0x20]!
00ac3f78	mov x19,x0
00ac3f7c	stp x29,x30,[sp, #0x10]
00ac3f80	add x29,sp,#0x10
00ac3f84	cbz w1,0x00ac3f98
00ac3f88	mov w0,#0x40
00ac3f8c	mov x1,xzr
00ac3f90	bl 0x00c35500
00ac3f94	cbz w0,0x00ac3fb0
00ac3f98	adrp x2,0xc7c000
00ac3f9c	add x2,x2,#0x670
00ac3fa0	orr w1,wzr,#0xe
00ac3fa4	mov x0,x19
00ac3fa8	bl 0x00c3b520
00ac3fac	b 0x00ac3fb4
00ac3fb0	mov x0,xzr
00ac3fb4	ldp x29,x30,[sp, #0x10]
00ac3fb8	ldr x19,[sp], #0x20
00ac3fbc	ret
