; ENGINE_get_pkey_asn1_meth @ 00a52850
00a52850	sub sp,sp,#0x20
00a52854	stp x29,x30,[sp, #0x10]
00a52858	ldr x8,[x0, #0x50]
00a5285c	add x29,sp,#0x10
00a52860	cbz x8,0x00a52880
00a52864	mov w3,w1
00a52868	add x1,sp,#0x8
00a5286c	mov x2,xzr
00a52870	blr x8
00a52874	cbz w0,0x00a52880
00a52878	ldr x0,[sp, #0x8]
00a5287c	b 0x00a528b0
00a52880	bl 0x00c342a0
00a52884	adrp x0,0x2ac000
00a52888	adrp x2,0x2ad000
00a5288c	add x0,x0,#0x7e
00a52890	add x2,x2,#0xbc0
00a52894	mov w1,#0x5c
00a52898	bl 0x00c342b0
00a5289c	mov w0,#0x26
00a528a0	mov w1,#0x65
00a528a4	mov x2,xzr
00a528a8	bl 0x00c342c0
00a528ac	mov x0,xzr
00a528b0	ldp x29,x30,[sp, #0x10]
00a528b4	add sp,sp,#0x20
00a528b8	ret
