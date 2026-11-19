; mbedtls_aes_xts_setkey_enc @ 00b6e5ec
00b6e5ec	str x21,[sp, #-0x30]!
00b6e5f0	stp x20,x19,[sp, #0x10]
00b6e5f4	stp x29,x30,[sp, #0x20]
00b6e5f8	add x29,sp,#0x20
00b6e5fc	mov x19,x1
00b6e600	cmp w2,#0x200
00b6e604	mov x20,x0
00b6e608	b.eq 0x00b6e614
00b6e60c	cmp w2,#0x100
00b6e610	b.ne 0x00b6e64c
00b6e614	lsr w21,w2,#0x1
00b6e618	lsr w8,w2,#0x4
00b6e61c	add x1,x19,x8
00b6e620	add x0,x20,#0x120
00b6e624	mov w2,w21
00b6e628	bl 0x00c41940
00b6e62c	cbnz w0,0x00b6e650
00b6e630	mov x0,x20
00b6e634	mov x1,x19
00b6e638	ldp x29,x30,[sp, #0x20]
00b6e63c	ldp x20,x19,[sp, #0x10]
00b6e640	mov w2,w21
00b6e644	ldr x21,[sp], #0x30
00b6e648	b 0x00c41940
00b6e64c	orr w0,wzr,#0xffffffe0
00b6e650	ldp x29,x30,[sp, #0x20]
00b6e654	ldp x20,x19,[sp, #0x10]
00b6e658	ldr x21,[sp], #0x30
00b6e65c	ret
