; OSSL_STORE_SEARCH_by_alias @ 00aead0c
00aead0c	stp x20,x19,[sp, #-0x20]!
00aead10	adrp x1,0x2c2000
00aead14	mov x19,x0
00aead18	add x1,x1,#0x3bd
00aead1c	orr w0,wzr,#0x30
00aead20	mov w2,#0x38e
00aead24	stp x29,x30,[sp, #0x10]
00aead28	add x29,sp,#0x10
00aead2c	bl 0x00c34250
00aead30	mov x20,x0
00aead34	cbz x0,0x00aead54
00aead38	mov w8,#0x4
00aead3c	mov x0,x19
00aead40	str w8,[x20]
00aead44	str x19,[x20, #0x20]
00aead48	bl 0x00c2ff50
00aead4c	str x0,[x20, #0x28]
00aead50	b 0x00aead84
00aead54	bl 0x00c342a0
00aead58	adrp x0,0x2c2000
00aead5c	adrp x2,0x2a0000
00aead60	add x0,x0,#0x3bd
00aead64	add x2,x2,#0xbec
00aead68	mov w1,#0x391
00aead6c	bl 0x00c342b0
00aead70	mov w1,#0x100
00aead74	mov w0,#0x2c
00aead78	movk w1,#0xc, LSL #16
00aead7c	mov x2,xzr
00aead80	bl 0x00c342c0
00aead84	ldp x29,x30,[sp, #0x10]
00aead88	mov x0,x20
00aead8c	ldp x20,x19,[sp], #0x20
00aead90	ret
