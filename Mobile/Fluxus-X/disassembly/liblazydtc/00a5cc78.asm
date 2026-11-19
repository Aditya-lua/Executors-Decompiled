; evp_cipher_new @ 00a5cc78
00a5cc78	str x19,[sp, #-0x20]!
00a5cc7c	adrp x1,0x2a5000
00a5cc80	add x1,x1,#0xf9d
00a5cc84	mov w0,#0x100
00a5cc88	mov w2,#0x5c5
00a5cc8c	stp x29,x30,[sp, #0x10]
00a5cc90	add x29,sp,#0x10
00a5cc94	bl 0x00c34250
00a5cc98	mov x19,x0
00a5cc9c	cbz x0,0x00a5ccd4
00a5cca0	bl 0x00c34d50
00a5cca4	str x0,[x19, #0x88]
00a5cca8	cbz x0,0x00a5ccbc
00a5ccac	add x8,x19,#0x80
00a5ccb0	mov w9,#0x1
00a5ccb4	stlr w9,[x8]
00a5ccb8	b 0x00a5ccd4
00a5ccbc	adrp x1,0x2a5000
00a5ccc0	add x1,x1,#0xf9d
00a5ccc4	mov w2,#0x5ca
00a5ccc8	mov x0,x19
00a5cccc	bl 0x00c32310
00a5ccd0	mov x19,xzr
00a5ccd4	ldp x29,x30,[sp, #0x10]
00a5ccd8	mov x0,x19
00a5ccdc	ldr x19,[sp], #0x20
00a5cce0	ret
