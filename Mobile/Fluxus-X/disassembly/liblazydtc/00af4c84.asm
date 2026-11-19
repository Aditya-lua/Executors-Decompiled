; X509V3_set_conf_lhash @ 00af4c84
00af4c84	cbz x0,0x00af4c98
00af4c88	adrp x8,0xcc9000
00af4c8c	add x8,x8,#0x5b0
00af4c90	stp x8,x1,[x0, #0x28]
00af4c94	ret
00af4c98	stp x29,x30,[sp, #-0x10]!
00af4c9c	mov x29,sp
00af4ca0	bl 0x00c342a0
00af4ca4	adrp x0,0x2aa000
00af4ca8	adrp x2,0x2da000
00af4cac	add x0,x0,#0x9f7
00af4cb0	add x2,x2,#0x629
00af4cb4	mov w1,#0x212
00af4cb8	bl 0x00c342b0
00af4cbc	mov w1,#0x102
00af4cc0	mov w0,#0x22
00af4cc4	movk w1,#0xc, LSL #16
00af4cc8	mov x2,xzr
00af4ccc	ldp x29,x30,[sp], #0x10
00af4cd0	b 0x00c342c0
