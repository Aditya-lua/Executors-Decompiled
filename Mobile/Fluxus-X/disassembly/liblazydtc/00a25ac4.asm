; i2d_ECPKParameters @ 00a25ac4
00a25ac4	stp x20,x19,[sp, #-0x20]!
00a25ac8	mov x20,x1
00a25acc	mov x1,xzr
00a25ad0	stp x29,x30,[sp, #0x10]
00a25ad4	add x29,sp,#0x10
00a25ad8	bl 0x00a24dfc
00a25adc	cbz x0,0x00a25b3c
00a25ae0	adrp x2,0xc5a000
00a25ae4	add x2,x2,#0xde8
00a25ae8	mov x1,x20
00a25aec	mov x19,x0
00a25af0	bl 0x00c36170
00a25af4	mov w20,w0
00a25af8	cbnz w0,0x00a25b28
00a25afc	bl 0x00c342a0
00a25b00	adrp x0,0x2af000
00a25b04	adrp x2,0x2c9000
00a25b08	add x0,x0,#0xe09
00a25b0c	add x2,x2,#0x677
00a25b10	mov w1,#0x39f
00a25b14	bl 0x00c342b0
00a25b18	mov w0,#0x10
00a25b1c	mov w1,#0x79
00a25b20	mov x2,xzr
00a25b24	bl 0x00c342c0
00a25b28	adrp x1,0xc5a000
00a25b2c	add x1,x1,#0xde8
00a25b30	mov x0,x19
00a25b34	bl 0x00c36160
00a25b38	b 0x00a25b6c
00a25b3c	bl 0x00c342a0
00a25b40	adrp x0,0x2af000
00a25b44	adrp x2,0x2c9000
00a25b48	add x0,x0,#0xe09
00a25b4c	add x2,x2,#0x677
00a25b50	mov w1,#0x39b
00a25b54	bl 0x00c342b0
00a25b58	mov w0,#0x10
00a25b5c	orr w1,wzr,#0x78
00a25b60	mov x2,xzr
00a25b64	bl 0x00c342c0
00a25b68	mov w20,wzr
00a25b6c	ldp x29,x30,[sp, #0x10]
00a25b70	mov w0,w20
00a25b74	ldp x20,x19,[sp], #0x20
00a25b78	ret
