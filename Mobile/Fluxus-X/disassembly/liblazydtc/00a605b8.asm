; EVP_PKCS82PKEY_ex @ 00a605b8
00a605b8	sub sp,sp,#0x60
00a605bc	stp x20,x19,[sp, #0x40]
00a605c0	mov x20,x1
00a605c4	add x1,sp,#0x10
00a605c8	stp x23,xzr,[sp, #0x20]
00a605cc	stp x22,x21,[sp, #0x30]
00a605d0	stp x29,x30,[sp, #0x50]
00a605d4	add x29,sp,#0x50
00a605d8	mov x19,x2
00a605dc	mov x21,x0
00a605e0	stp xzr,xzr,[sp, #0x10]
00a605e4	bl 0x00c37f20
00a605e8	mov w8,w0
00a605ec	cmp w0,#0x1
00a605f0	mov x0,xzr
00a605f4	b.lt 0x00a60688
00a605f8	ldr x9,[sp, #0x10]
00a605fc	cbz x9,0x00a60688
00a60600	adrp x1,0x2b7000
00a60604	adrp x2,0x2a2000
00a60608	sxtw x22,w8
00a6060c	add x1,x1,#0x291
00a60610	add x2,x2,#0x154
00a60614	add x0,sp,#0x28
00a60618	mov w4,#0x87
00a6061c	mov x3,xzr
00a60620	mov x5,x20
00a60624	mov x6,x19
00a60628	str x9,[sp, #0x18]
00a6062c	str x22,[sp, #0x8]
00a60630	bl 0x00c35f10
00a60634	mov x23,x0
00a60638	cbz x0,0x00a60650
00a6063c	add x1,sp,#0x18
00a60640	add x2,sp,#0x8
00a60644	mov x0,x23
00a60648	bl 0x00c37cf0
00a6064c	cbnz w0,0x00a60664
00a60650	mov x0,x21
00a60654	mov x1,x20
00a60658	mov x2,x19
00a6065c	bl 0x00a60424
00a60660	str x0,[sp, #0x28]
00a60664	ldr x0,[sp, #0x10]
00a60668	adrp x2,0x2ac000
00a6066c	add x2,x2,#0x10e
00a60670	mov w3,#0x5b
00a60674	mov x1,x22
00a60678	bl 0x00c345e0
00a6067c	mov x0,x23
00a60680	bl 0x00c35f00
00a60684	ldr x0,[sp, #0x28]
00a60688	ldp x29,x30,[sp, #0x50]
00a6068c	ldp x20,x19,[sp, #0x40]
00a60690	ldp x22,x21,[sp, #0x30]
00a60694	ldr x23,[sp, #0x20]
00a60698	add sp,sp,#0x60
00a6069c	ret
