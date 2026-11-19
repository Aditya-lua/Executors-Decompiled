; EVP_get_digestbyname @ 00a694c0
00a694c0	sub sp,sp,#0x30
00a694c4	stp x20,x19,[sp, #0x10]
00a694c8	mov x19,x0
00a694cc	mov w0,#0x8
00a694d0	mov x1,xzr
00a694d4	stp x29,x30,[sp, #0x20]
00a694d8	add x29,sp,#0x20
00a694dc	bl 0x00c35500
00a694e0	cbz w0,0x00a69534
00a694e4	mov w1,#0x1
00a694e8	mov x0,x19
00a694ec	bl 0x00c3c230
00a694f0	str x0,[sp, #0x8]
00a694f4	cbnz x0,0x00a69538
00a694f8	bl 0x00c3b650
00a694fc	mov x1,x19
00a69500	mov x20,x0
00a69504	bl 0x00c3b620
00a69508	cbz w0,0x00a69534
00a6950c	adrp x2,0xa69000
00a69510	mov w1,w0
00a69514	add x2,x2,#0x5d8
00a69518	add x3,sp,#0x8
00a6951c	mov x0,x20
00a69520	bl 0x00c3b610
00a69524	ldr x8,[sp, #0x8]
00a69528	cmp w0,#0x0
00a6952c	csel x0,xzr,x8,eq
00a69530	b 0x00a69538
00a69534	mov x0,xzr
00a69538	ldp x29,x30,[sp, #0x20]
00a6953c	ldp x20,x19,[sp, #0x10]
00a69540	add sp,sp,#0x30
00a69544	ret
