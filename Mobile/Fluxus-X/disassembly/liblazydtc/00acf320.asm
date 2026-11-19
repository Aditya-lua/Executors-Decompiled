; ossl_rsa_todata @ 00acf320
00acf320	sub sp,sp,#0x70
00acf324	stp x26,x25,[sp, #0x20]
00acf328	stp x24,x23,[sp, #0x30]
00acf32c	stp x22,x21,[sp, #0x40]
00acf330	stp x20,x19,[sp, #0x50]
00acf334	stp x29,x30,[sp, #0x60]
00acf338	add x29,sp,#0x60
00acf33c	mov w24,w3
00acf340	mov x22,x2
00acf344	mov x23,x1
00acf348	mov x26,x0
00acf34c	stp xzr,xzr,[sp, #0x10]
00acf350	str xzr,[sp, #0x8]
00acf354	bl 0x00c34780
00acf358	mov x19,x0
00acf35c	bl 0x00c34780
00acf360	mov x20,x0
00acf364	bl 0x00c34780
00acf368	mov x21,x0
00acf36c	mov w25,wzr
00acf370	cbz x26,0x00acf464
00acf374	cbz x19,0x00acf464
00acf378	cbz x20,0x00acf464
00acf37c	cbz x21,0x00acf464
00acf380	add x1,sp,#0x10
00acf384	add x2,sp,#0x8
00acf388	add x3,sp,#0x18
00acf38c	mov x0,x26
00acf390	bl 0x00c3fc80
00acf394	mov x0,x26
00acf398	mov x1,x19
00acf39c	mov x2,x20
00acf3a0	mov x3,x21
00acf3a4	bl 0x00c3fcc0
00acf3a8	ldr x3,[sp, #0x10]
00acf3ac	adrp x2,0x2a5000
00acf3b0	add x2,x2,#0x623
00acf3b4	mov x0,x23
00acf3b8	mov x1,x22
00acf3bc	bl 0x00c39de0
00acf3c0	cbz w0,0x00acf460
00acf3c4	ldr x3,[sp, #0x8]
00acf3c8	adrp x2,0x2ab000
00acf3cc	add x2,x2,#0x8a5
00acf3d0	mov x0,x23
00acf3d4	mov x1,x22
00acf3d8	bl 0x00c39de0
00acf3dc	cbz w0,0x00acf460
00acf3e0	cbz w24,0x00acf458
00acf3e4	ldr x3,[sp, #0x18]
00acf3e8	cbz x3,0x00acf458
00acf3ec	adrp x2,0x2cf000
00acf3f0	add x2,x2,#0xc20
00acf3f4	mov x0,x23
00acf3f8	mov x1,x22
00acf3fc	bl 0x00c39de0
00acf400	cbz w0,0x00acf460
00acf404	adrp x2,0xcb5000
00acf408	ldr x2,[x2, #0x798]
00acf40c	mov x0,x23
00acf410	mov x1,x22
00acf414	mov x3,x19
00acf418	bl 0x00c3e8f0
00acf41c	cbz w0,0x00acf460
00acf420	adrp x2,0xcb5000
00acf424	ldr x2,[x2, #0x790]
00acf428	mov x0,x23
00acf42c	mov x1,x22
00acf430	mov x3,x20
00acf434	bl 0x00c3e8f0
00acf438	cbz w0,0x00acf460
00acf43c	adrp x2,0xcb5000
00acf440	ldr x2,[x2, #0x788]
00acf444	mov x0,x23
00acf448	mov x1,x22
00acf44c	mov x3,x21
00acf450	bl 0x00c3e8f0
00acf454	cbz w0,0x00acf460
00acf458	mov w25,#0x1
00acf45c	b 0x00acf464
00acf460	mov w25,wzr
00acf464	mov x0,x19
00acf468	bl 0x00c34770
00acf46c	mov x0,x20
00acf470	bl 0x00c34770
00acf474	mov x0,x21
00acf478	bl 0x00c34770
00acf47c	mov w0,w25
00acf480	ldp x29,x30,[sp, #0x60]
00acf484	ldp x20,x19,[sp, #0x50]
00acf488	ldp x22,x21,[sp, #0x40]
00acf48c	ldp x24,x23,[sp, #0x30]
00acf490	ldp x26,x25,[sp, #0x20]
00acf494	add sp,sp,#0x70
00acf498	ret
