; ossl_lib_ctx_unlock @ 00a80c24
00a80c24	cbz x0,0x00a80c30
00a80c28	ldr x0,[x0]
00a80c2c	b 0x00c35690
00a80c30	stp x29,x30,[sp, #-0x10]!
00a80c34	adrp x0,0xd21000
00a80c38	adrp x1,0xa81000
00a80c3c	add x0,x0,#0xd5c
00a80c40	add x1,x1,#0x348
00a80c44	mov x29,sp
00a80c48	bl 0x00c34d60
00a80c4c	cbz w0,0x00a80c70
00a80c50	adrp x8,0xd21000
00a80c54	ldr w8,[x8, #0xd60]
00a80c58	mov x0,xzr
00a80c5c	cbz w8,0x00a80c74
00a80c60	adrp x0,0xd21000
00a80c64	add x0,x0,#0xd58
00a80c68	bl 0x00c38360
00a80c6c	b 0x00a80c74
00a80c70	mov x0,xzr
00a80c74	adrp x8,0xd21000
00a80c78	add x8,x8,#0xb90
00a80c7c	cmp x0,#0x0
00a80c80	csel x0,x8,x0,eq
00a80c84	ldp x29,x30,[sp], #0x10
00a80c88	ldr x0,[x0]
00a80c8c	b 0x00c35690
