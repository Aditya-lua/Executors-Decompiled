; OBJ_nid2ln @ 00aae09c
00aae09c	sub sp,sp,#0x60
00aae0a0	str x19,[sp, #0x40]
00aae0a4	mov w19,w0
00aae0a8	cmp w0,#0x4df
00aae0ac	stp x29,x30,[sp, #0x50]
00aae0b0	add x29,sp,#0x50
00aae0b4	b.hi 0x00aae0dc
00aae0b8	cbz w19,0x00aae120
00aae0bc	adrp x8,0xc6d000
00aae0c0	add x8,x8,#0xa58
00aae0c4	mov w9,#0x28
00aae0c8	smaddl x8,w19,w9,x8
00aae0cc	ldr w8,[x8, #0x10]
00aae0d0	cbz w8,0x00aae13c
00aae0d4	sxtw x8,w19
00aae0d8	b 0x00aae124
00aae0dc	mov w0,#0x40
00aae0e0	mov x1,xzr
00aae0e4	bl 0x00c35500
00aae0e8	adrp x8,0xd22000
00aae0ec	ldr x0,[x8, #0x188]
00aae0f0	cbz x0,0x00aae188
00aae0f4	orr w8,wzr,#0x3
00aae0f8	add x9,sp,#0x8
00aae0fc	sub x1,x29,#0x20
00aae100	stur w8,[x29, #-0x20]
00aae104	stur x9,[x29, #-0x18]
00aae108	str w19,[sp, #0x18]
00aae10c	bl 0x00c34de0
00aae110	cbz x0,0x00aae158
00aae114	ldr x8,[x0, #0x8]
00aae118	ldr x0,[x8, #0x8]
00aae11c	b 0x00aae188
00aae120	mov x8,xzr
00aae124	adrp x10,0xc6d000
00aae128	mov w9,#0x28
00aae12c	add x10,x10,#0xa58
00aae130	madd x8,x8,x9,x10
00aae134	ldr x0,[x8, #0x8]
00aae138	b 0x00aae188
00aae13c	bl 0x00c342a0
00aae140	adrp x0,0x2d8000
00aae144	adrp x2,0x2d3000
00aae148	add x0,x0,#0x291
00aae14c	add x2,x2,#0xe9a
00aae150	mov w1,#0x11f
00aae154	b 0x00aae170
00aae158	bl 0x00c342a0
00aae15c	adrp x0,0x2d8000
00aae160	adrp x2,0x2d3000
00aae164	add x0,x0,#0x291
00aae168	add x2,x2,#0xe9a
00aae16c	mov w1,#0x132
00aae170	bl 0x00c342b0
00aae174	mov w0,#0x8
00aae178	mov w1,#0x65
00aae17c	mov x2,xzr
00aae180	bl 0x00c342c0
00aae184	mov x0,xzr
00aae188	ldp x29,x30,[sp, #0x50]
00aae18c	ldr x19,[sp, #0x40]
00aae190	add sp,sp,#0x60
00aae194	ret
