; evp_do_ciph_ctx_getparams @ 00a62e78
00a62e78	cbz x0,0x00a62edc
00a62e7c	ldr x8,[x0, #0x78]
00a62e80	cbz x8,0x00a62e98
00a62e84	ldr x3,[x0, #0xd8]
00a62e88	cbz x3,0x00a62ea0
00a62e8c	mov x0,x1
00a62e90	mov x1,x2
00a62e94	br x3
00a62e98	mov w0,#0xffffffff
00a62e9c	ret
00a62ea0	stp x29,x30,[sp, #-0x10]!
00a62ea4	mov x29,sp
00a62ea8	bl 0x00c342a0
00a62eac	adrp x0,0x2af000
00a62eb0	adrp x2,0x2c9000
00a62eb4	add x0,x0,#0xfe8
00a62eb8	add x2,x2,#0x987
00a62ebc	mov w1,#0x41
00a62ec0	bl 0x00c342b0
00a62ec4	orr w0,wzr,#0x6
00a62ec8	mov w1,#0xc5
00a62ecc	mov x2,xzr
00a62ed0	bl 0x00c342c0
00a62ed4	mov w0,wzr
00a62ed8	ldp x29,x30,[sp], #0x10
00a62edc	ret
