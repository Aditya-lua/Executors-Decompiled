; OSSL_STORE_LOADER_do_all_provided @ 00aeb5c8
00aeb5c8	sub sp,sp,#0x70
00aeb5cc	str x21,[sp, #0x40]
00aeb5d0	stp x20,x19,[sp, #0x50]
00aeb5d4	mov x20,x2
00aeb5d8	mov x21,x1
00aeb5dc	mov x19,x0
00aeb5e0	str x0,[sp, #0x10]
00aeb5e4	add x0,sp,#0x10
00aeb5e8	mov w1,wzr
00aeb5ec	mov x2,xzr
00aeb5f0	mov x3,xzr
00aeb5f4	stp x29,x30,[sp, #0x60]
00aeb5f8	add x29,sp,#0x60
00aeb5fc	str xzr,[sp, #0x30]
00aeb600	bl 0x00aeb134
00aeb604	ldr x0,[sp, #0x30]
00aeb608	stp x21,x20,[sp]
00aeb60c	cbz x0,0x00aeb620
00aeb610	adrp x1,0xaeb000
00aeb614	add x1,x1,#0x664
00aeb618	mov x2,sp
00aeb61c	bl 0x00c3b5a0
00aeb620	adrp x2,0xc7d000
00aeb624	add x2,x2,#0xeb8
00aeb628	orr w1,wzr,#0xf
00aeb62c	mov x0,x19
00aeb630	bl 0x00c3b520
00aeb634	adrp x1,0xaeb000
00aeb638	add x1,x1,#0x664
00aeb63c	mov x2,sp
00aeb640	bl 0x00c3b5a0
00aeb644	ldr x0,[sp, #0x30]
00aeb648	cbz x0,0x00aeb650
00aeb64c	bl 0x00c3b5c0
00aeb650	ldp x29,x30,[sp, #0x60]
00aeb654	ldp x20,x19,[sp, #0x50]
00aeb658	ldr x21,[sp, #0x40]
00aeb65c	add sp,sp,#0x70
00aeb660	ret
