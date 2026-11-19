; ossl_DER_w_octet_string @ 00b4b39c
00b4b39c	sub sp,sp,#0x40
00b4b3a0	stp x22,x21,[sp, #0x10]
00b4b3a4	stp x20,x19,[sp, #0x20]
00b4b3a8	mov x21,x3
00b4b3ac	mov x22,x2
00b4b3b0	mov w20,w1
00b4b3b4	mov x19,x0
00b4b3b8	stp x29,x30,[sp, #0x30]
00b4b3bc	add x29,sp,#0x30
00b4b3c0	tbnz w1,#0x1f,0x00b4b3dc
00b4b3c4	cmp w20,#0x1e
00b4b3c8	mov w0,wzr
00b4b3cc	b.gt 0x00b4b45c
00b4b3d0	mov x0,x19
00b4b3d4	bl 0x00c37240
00b4b3d8	cbz w0,0x00b4b45c
00b4b3dc	mov x0,x19
00b4b3e0	bl 0x00c37240
00b4b3e4	cbz w0,0x00b4b45c
00b4b3e8	mov x0,x19
00b4b3ec	mov x1,x22
00b4b3f0	mov x2,x21
00b4b3f4	bl 0x00c34390
00b4b3f8	cbz w0,0x00b4b45c
00b4b3fc	mov x0,x19
00b4b400	bl 0x00c34350
00b4b404	cbz w0,0x00b4b45c
00b4b408	mov w1,#0x4
00b4b40c	mov w2,#0x1
00b4b410	mov x0,x19
00b4b414	bl 0x00c343a0
00b4b418	cbz w0,0x00b4b45c
00b4b41c	tbnz w20,#0x1f,0x00b4b458
00b4b420	add x1,sp,#0x8
00b4b424	mov x0,x19
00b4b428	bl 0x00c34370
00b4b42c	cbz w0,0x00b4b45c
00b4b430	mov x0,x19
00b4b434	bl 0x00c34350
00b4b438	cbz w0,0x00b4b45c
00b4b43c	mov x1,sp
00b4b440	mov x0,x19
00b4b444	bl 0x00c34370
00b4b448	cbz w0,0x00b4b45c
00b4b44c	ldp x9,x8,[sp]
00b4b450	cmp x8,x9
00b4b454	b.ne 0x00b4b470
00b4b458	mov w0,#0x1
00b4b45c	ldp x29,x30,[sp, #0x30]
00b4b460	ldp x20,x19,[sp, #0x20]
00b4b464	ldp x22,x21,[sp, #0x10]
00b4b468	add sp,sp,#0x40
00b4b46c	ret
00b4b470	mov w8,#0xa0
00b4b474	orr w8,w20,w8
00b4b478	sxtw x1,w8
00b4b47c	mov w2,#0x1
00b4b480	mov x0,x19
00b4b484	bl 0x00c343a0
00b4b488	cmp w0,#0x0
00b4b48c	cset w0,ne
00b4b490	b 0x00b4b45c
