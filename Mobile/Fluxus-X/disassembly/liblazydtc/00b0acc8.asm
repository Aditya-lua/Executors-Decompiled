; X509_STORE_add_cert @ 00b0acc8
00b0acc8	stp x29,x30,[sp, #-0x10]!
00b0accc	mov w2,wzr
00b0acd0	mov x29,sp
00b0acd4	bl 0x00b0ad24
00b0acd8	cbz w0,0x00b0ace8
00b0acdc	mov w0,#0x1
00b0ace0	ldp x29,x30,[sp], #0x10
00b0ace4	ret
00b0ace8	bl 0x00c342a0
00b0acec	adrp x0,0x2aa000
00b0acf0	adrp x2,0x2c6000
00b0acf4	add x0,x0,#0xba3
00b0acf8	add x2,x2,#0x3d6
00b0acfc	mov w1,#0x18f
00b0ad00	bl 0x00c342b0
00b0ad04	mov w1,#0x100
00b0ad08	mov w0,#0xb
00b0ad0c	movk w1,#0xc, LSL #16
00b0ad10	mov x2,xzr
00b0ad14	bl 0x00c342c0
00b0ad18	mov w0,wzr
00b0ad1c	ldp x29,x30,[sp], #0x10
00b0ad20	ret
