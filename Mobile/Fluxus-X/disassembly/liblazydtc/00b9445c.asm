; mbedtls_ecp_gen_key @ 00b9445c
00b9445c	stp x22,x21,[sp, #-0x30]!
00b94460	stp x20,x19,[sp, #0x10]
00b94464	stp x29,x30,[sp, #0x20]
00b94468	add x29,sp,#0x20
00b9446c	mov x21,x1
00b94470	mov w1,w0
00b94474	mov x0,x21
00b94478	mov x19,x3
00b9447c	mov x20,x2
00b94480	bl 0x00c42800
00b94484	cbnz w0,0x00b944a4
00b94488	add x22,x21,#0xc0
00b9448c	mov x0,x21
00b94490	mov x1,x22
00b94494	mov x2,x20
00b94498	mov x3,x19
00b9449c	bl 0x00c42680
00b944a0	cbz w0,0x00b944b4
00b944a4	ldp x29,x30,[sp, #0x20]
00b944a8	ldp x20,x19,[sp, #0x10]
00b944ac	ldp x22,x21,[sp], #0x30
00b944b0	ret
00b944b4	cbz x20,0x00b944e0
00b944b8	mov x4,x20
00b944bc	mov x5,x19
00b944c0	ldp x29,x30,[sp, #0x20]
00b944c4	ldp x20,x19,[sp, #0x10]
00b944c8	add x1,x21,#0xd0
00b944cc	add x3,x21,#0x38
00b944d0	mov x0,x21
00b944d4	mov x2,x22
00b944d8	ldp x22,x21,[sp], #0x30
00b944dc	b 0x00b923c4
00b944e0	mov w0,#0xffffb080
00b944e4	b 0x00b944a4
