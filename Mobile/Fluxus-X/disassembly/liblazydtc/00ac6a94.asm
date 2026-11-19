; ossl_property_parse_init @ 00ac6a94
00ac6a94	stp x20,x19,[sp, #-0x20]!
00ac6a98	adrp x1,0x2c6000
00ac6a9c	add x1,x1,#0x1c3
00ac6aa0	mov w2,#0x1
00ac6aa4	stp x29,x30,[sp, #0x10]
00ac6aa8	add x29,sp,#0x10
00ac6aac	mov x19,x0
00ac6ab0	bl 0x00c3f870
00ac6ab4	cbz w0,0x00ac6b6c
00ac6ab8	adrp x1,0x2bb000
00ac6abc	add x1,x1,#0x5d
00ac6ac0	mov w2,#0x1
00ac6ac4	mov x0,x19
00ac6ac8	bl 0x00c3f870
00ac6acc	cbz w0,0x00ac6b6c
00ac6ad0	adrp x1,0x2dc000
00ac6ad4	add x1,x1,#0x37
00ac6ad8	mov w2,#0x1
00ac6adc	mov x0,x19
00ac6ae0	bl 0x00c3f870
00ac6ae4	cbz w0,0x00ac6b6c
00ac6ae8	adrp x1,0x2c3000
00ac6aec	add x1,x1,#0x9f4
00ac6af0	mov w2,#0x1
00ac6af4	mov x0,x19
00ac6af8	bl 0x00c3f870
00ac6afc	cbz w0,0x00ac6b6c
00ac6b00	adrp x1,0x2a4000
00ac6b04	add x1,x1,#0x12
00ac6b08	mov w2,#0x1
00ac6b0c	mov x0,x19
00ac6b10	bl 0x00c3f870
00ac6b14	cbz w0,0x00ac6b6c
00ac6b18	adrp x1,0x2bd000
00ac6b1c	add x1,x1,#0xa0b
00ac6b20	mov w2,#0x1
00ac6b24	mov x0,x19
00ac6b28	bl 0x00c3f870
00ac6b2c	cbz w0,0x00ac6b6c
00ac6b30	adrp x1,0x2b4000
00ac6b34	add x1,x1,#0x8d1
00ac6b38	mov w2,#0x1
00ac6b3c	mov x0,x19
00ac6b40	bl 0x00c3f890
00ac6b44	cmp w0,#0x1
00ac6b48	b.ne 0x00ac6b6c
00ac6b4c	adrp x1,0x2ca000
00ac6b50	add x1,x1,#0x2bf
00ac6b54	mov w2,#0x1
00ac6b58	mov x0,x19
00ac6b5c	mov w20,#0x1
00ac6b60	bl 0x00c3f890
00ac6b64	cmp w0,#0x2
00ac6b68	b.eq 0x00ac6b70
00ac6b6c	mov w20,wzr
00ac6b70	ldp x29,x30,[sp, #0x10]
00ac6b74	mov w0,w20
00ac6b78	ldp x20,x19,[sp], #0x20
00ac6b7c	ret
