; ossl_DER_w_bn @ 00b4b654
00b4b654	str x21,[sp, #-0x30]!
00b4b658	stp x20,x19,[sp, #0x10]
00b4b65c	stp x29,x30,[sp, #0x20]
00b4b660	add x29,sp,#0x20
00b4b664	cbz x2,0x00b4b6b4
00b4b668	mov x20,x0
00b4b66c	mov x0,x2
00b4b670	mov x21,x2
00b4b674	mov w19,w1
00b4b678	bl 0x00c37f40
00b4b67c	mov w8,w0
00b4b680	mov w0,wzr
00b4b684	cbnz w8,0x00b4b6b8
00b4b688	mov x0,x21
00b4b68c	bl 0x00c369b0
00b4b690	cbz w0,0x00b4b6c8
00b4b694	adrp x2,0xb4b000
00b4b698	add x2,x2,#0x618
00b4b69c	add x3,sp,#0xc
00b4b6a0	mov x0,x20
00b4b6a4	mov w1,w19
00b4b6a8	str wzr,[sp, #0xc]
00b4b6ac	bl 0x00b4b500
00b4b6b0	b 0x00b4b6b8
00b4b6b4	mov w0,wzr
00b4b6b8	ldp x29,x30,[sp, #0x20]
00b4b6bc	ldp x20,x19,[sp, #0x10]
00b4b6c0	ldr x21,[sp], #0x30
00b4b6c4	ret
00b4b6c8	mov x0,x20
00b4b6cc	mov w1,w19
00b4b6d0	ldp x29,x30,[sp, #0x20]
00b4b6d4	ldp x20,x19,[sp, #0x10]
00b4b6d8	adrp x2,0xb4b000
00b4b6dc	add x2,x2,#0x6ec
00b4b6e0	mov x3,x21
00b4b6e4	ldr x21,[sp], #0x30
00b4b6e8	b 0x00b4b500
