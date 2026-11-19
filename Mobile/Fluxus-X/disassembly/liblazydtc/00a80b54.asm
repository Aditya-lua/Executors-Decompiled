; ossl_lib_ctx_get_concrete @ 00a80b54
00a80b54	cbz x0,0x00a80b5c
00a80b58	ret
00a80b5c	stp x29,x30,[sp, #-0x10]!
00a80b60	adrp x0,0xd21000
00a80b64	adrp x1,0xa81000
00a80b68	add x0,x0,#0xd5c
00a80b6c	add x1,x1,#0x348
00a80b70	mov x29,sp
00a80b74	bl 0x00c34d60
00a80b78	cbz w0,0x00a80b9c
00a80b7c	adrp x8,0xd21000
00a80b80	ldr w8,[x8, #0xd60]
00a80b84	mov x0,xzr
00a80b88	cbz w8,0x00a80ba0
00a80b8c	adrp x0,0xd21000
00a80b90	add x0,x0,#0xd58
00a80b94	bl 0x00c38360
00a80b98	b 0x00a80ba0
00a80b9c	mov x0,xzr
00a80ba0	adrp x8,0xd21000
00a80ba4	add x8,x8,#0xb90
00a80ba8	cmp x0,#0x0
00a80bac	csel x0,x8,x0,eq
00a80bb0	ldp x29,x30,[sp], #0x10
00a80bb4	ret
