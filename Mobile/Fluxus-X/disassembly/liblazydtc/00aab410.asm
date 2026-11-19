; CRYPTO_gcm128_new @ 00aab410
00aab410	str x21,[sp, #-0x30]!
00aab414	stp x20,x19,[sp, #0x10]
00aab418	mov x19,x1
00aab41c	adrp x1,0x2d8000
00aab420	mov x20,x0
00aab424	add x1,x1,#0x27b
00aab428	mov w0,#0x1b8
00aab42c	mov w2,#0x739
00aab430	stp x29,x30,[sp, #0x20]
00aab434	add x29,sp,#0x20
00aab438	bl 0x00c32320
00aab43c	mov x21,x0
00aab440	cbz x0,0x00aab454
00aab444	mov x0,x21
00aab448	mov x1,x20
00aab44c	mov x2,x19
00aab450	bl 0x00aa98e4
00aab454	ldp x29,x30,[sp, #0x20]
00aab458	ldp x20,x19,[sp, #0x10]
00aab45c	mov x0,x21
00aab460	ldr x21,[sp], #0x30
00aab464	ret
