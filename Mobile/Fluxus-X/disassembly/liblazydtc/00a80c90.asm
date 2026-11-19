; ossl_lib_ctx_is_child @ 00a80c90
00a80c90	stp x29,x30,[sp, #-0x10]!
00a80c94	mov x29,sp
00a80c98	cbnz x0,0x00a80cd8
00a80c9c	adrp x0,0xd21000
00a80ca0	adrp x1,0xa81000
00a80ca4	add x0,x0,#0xd5c
00a80ca8	add x1,x1,#0x348
00a80cac	bl 0x00c34d60
00a80cb0	cbz w0,0x00a80cd0
00a80cb4	adrp x8,0xd21000
00a80cb8	ldr w8,[x8, #0xd60]
00a80cbc	cbz w8,0x00a80cd0
00a80cc0	adrp x0,0xd21000
00a80cc4	add x0,x0,#0xd58
00a80cc8	bl 0x00c38360
00a80ccc	cbnz x0,0x00a80cd8
00a80cd0	adrp x0,0xd21000
00a80cd4	add x0,x0,#0xb90
00a80cd8	ldrb w8,[x0, #0x1c0]
00a80cdc	and w0,w8,#0x1
00a80ce0	ldp x29,x30,[sp], #0x10
00a80ce4	ret
