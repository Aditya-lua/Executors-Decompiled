; RSA_padding_add_PKCS1_type_1 @ 00ad5ab8
00ad5ab8	stp x22,x21,[sp, #-0x30]!
00ad5abc	sub w8,w1,#0xb
00ad5ac0	cmp w8,w3
00ad5ac4	stp x20,x19,[sp, #0x10]
00ad5ac8	stp x29,x30,[sp, #0x20]
00ad5acc	add x29,sp,#0x20
00ad5ad0	b.ge 0x00ad5b08
00ad5ad4	bl 0x00c342a0
00ad5ad8	adrp x0,0x2d8000
00ad5adc	adrp x2,0x2c8000
00ad5ae0	add x0,x0,#0x794
00ad5ae4	add x2,x2,#0x21b
00ad5ae8	mov w1,#0x23
00ad5aec	bl 0x00c342b0
00ad5af0	mov w0,#0x4
00ad5af4	mov w1,#0x6e
00ad5af8	mov x2,xzr
00ad5afc	bl 0x00c342c0
00ad5b00	mov w0,wzr
00ad5b04	b 0x00ad5b50
00ad5b08	mov x21,x0
00ad5b0c	mov w8,#0x100
00ad5b10	sub w9,w1,#0x3
00ad5b14	strh w8,[x21], #0x2
00ad5b18	sub w8,w9,w3
00ad5b1c	sxtw x22,w8
00ad5b20	mov x19,x2
00ad5b24	orr w1,wzr,#0xff
00ad5b28	mov x0,x21
00ad5b2c	mov x2,x22
00ad5b30	mov w20,w3
00ad5b34	bl 0x00c301c0
00ad5b38	add x0,x21,x22
00ad5b3c	strb wzr,[x0], #0x1
00ad5b40	mov w2,w20
00ad5b44	mov x1,x19
00ad5b48	bl 0x00c2ffd0
00ad5b4c	mov w0,#0x1
00ad5b50	ldp x29,x30,[sp, #0x20]
00ad5b54	ldp x20,x19,[sp, #0x10]
00ad5b58	ldp x22,x21,[sp], #0x30
00ad5b5c	ret
