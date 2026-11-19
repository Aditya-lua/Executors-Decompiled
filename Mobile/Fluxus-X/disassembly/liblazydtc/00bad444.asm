; mbedtls_sha256_update @ 00bad444
00bad444	stp x24,x23,[sp, #-0x40]!
00bad448	stp x22,x21,[sp, #0x10]
00bad44c	stp x20,x19,[sp, #0x20]
00bad450	stp x29,x30,[sp, #0x30]
00bad454	add x29,sp,#0x30
00bad458	mov x19,x2
00bad45c	mov x20,x1
00bad460	mov x21,x0
00bad464	cbz x2,0x00bad51c
00bad468	ldr w8,[x21, #0x40]
00bad46c	and w23,w8,#0x3f
00bad470	adds w8,w8,w19
00bad474	str w8,[x21, #0x40]
00bad478	b.cc 0x00bad488
00bad47c	ldr w8,[x21, #0x44]
00bad480	add w8,w8,#0x1
00bad484	str w8,[x21, #0x44]
00bad488	cbz w23,0x00bad4c4
00bad48c	mov w8,#0x40
00bad490	sub w22,w8,w23
00bad494	cmp x22,x19
00bad498	b.hi 0x00bad4c4
00bad49c	add x0,x21,x23
00bad4a0	mov x1,x20
00bad4a4	mov x2,x22
00bad4a8	bl 0x00c2ffd0
00bad4ac	mov x0,x21
00bad4b0	mov x1,x21
00bad4b4	bl 0x00c434f0
00bad4b8	mov w23,wzr
00bad4bc	add x20,x20,x22
00bad4c0	sub x19,x19,x22
00bad4c4	cmp x19,#0x40
00bad4c8	b.cc 0x00bad508
00bad4cc	mov x24,x19
00bad4d0	mov x22,x20
00bad4d4	mov x0,x21
00bad4d8	mov x1,x22
00bad4dc	bl 0x00c434f0
00bad4e0	sub x24,x24,#0x40
00bad4e4	cmp x24,#0x3f
00bad4e8	add x22,x22,#0x40
00bad4ec	b.hi 0x00bad4d4
00bad4f0	and x8,x19,#-0x40
00bad4f4	add x20,x20,x8
00bad4f8	sub x19,x19,x8
00bad4fc	cbnz x8,0x00bad4c4
00bad500	mov w0,#0xffffffff
00bad504	b 0x00bad520
00bad508	cbz x19,0x00bad51c
00bad50c	add x0,x21,x23
00bad510	mov x1,x20
00bad514	mov x2,x19
00bad518	bl 0x00c2ffd0
00bad51c	mov w0,wzr
00bad520	ldp x29,x30,[sp, #0x30]
00bad524	ldp x20,x19,[sp, #0x20]
00bad528	ldp x22,x21,[sp, #0x10]
00bad52c	ldp x24,x23,[sp], #0x40
00bad530	ret
