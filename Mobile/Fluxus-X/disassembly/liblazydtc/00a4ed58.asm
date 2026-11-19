; ossl_decoder_store_remove_all_provided @ 00a4ed58
00a4ed58	str x19,[sp, #-0x20]!
00a4ed5c	stp x29,x30,[sp, #0x10]
00a4ed60	add x29,sp,#0x10
00a4ed64	mov x19,x0
00a4ed68	bl 0x00c3b2f0
00a4ed6c	adrp x2,0xc5d000
00a4ed70	add x2,x2,#0x58
00a4ed74	mov w1,#0xb
00a4ed78	bl 0x00c3b520
00a4ed7c	cbz x0,0x00a4ed90
00a4ed80	ldp x29,x30,[sp, #0x10]
00a4ed84	mov x1,x19
00a4ed88	ldr x19,[sp], #0x20
00a4ed8c	b 0x00c3b5e0
00a4ed90	ldp x29,x30,[sp, #0x10]
00a4ed94	mov w0,#0x1
00a4ed98	ldr x19,[sp], #0x20
00a4ed9c	ret
