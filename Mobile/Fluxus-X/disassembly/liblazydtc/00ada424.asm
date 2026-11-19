; ossl_rsa_check_public_exponent @ 00ada424
00ada424	str x19,[sp, #-0x20]!
00ada428	stp x29,x30,[sp, #0x10]
00ada42c	add x29,sp,#0x10
00ada430	mov x19,x0
00ada434	bl 0x00c38d10
00ada438	cbz w0,0x00ada454
00ada43c	bl 0x00c38de0
00ada440	mov x1,x0
00ada444	mov x0,x19
00ada448	bl 0x00c38cc0
00ada44c	cmp w0,#0x0
00ada450	cset w0,gt
00ada454	ldp x29,x30,[sp, #0x10]
00ada458	ldr x19,[sp], #0x20
00ada45c	ret
