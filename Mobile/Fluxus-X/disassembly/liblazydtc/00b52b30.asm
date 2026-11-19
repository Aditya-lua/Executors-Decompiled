; FUN_00b52b30 @ 00b52b30
00b52b30	stp x20,x19,[sp, #-0x20]!
00b52b34	stp x29,x30,[sp, #0x10]
00b52b38	add x29,sp,#0x10
00b52b3c	mov x19,x0
00b52b40	bl 0x00c41000
00b52b44	cbz w0,0x00b52b78
00b52b48	adrp x1,0x2a1000
00b52b4c	add x1,x1,#0x6b
00b52b50	mov w0,#0x170
00b52b54	mov w2,#0x41
00b52b58	bl 0x00c34250
00b52b5c	mov x20,x0
00b52b60	cbz x0,0x00b52b7c
00b52b64	mov w2,#0x170
00b52b68	mov x0,x20
00b52b6c	mov x1,x19
00b52b70	bl 0x00c2ffd0
00b52b74	b 0x00b52b7c
00b52b78	mov x20,xzr
00b52b7c	ldp x29,x30,[sp, #0x10]
00b52b80	mov x0,x20
00b52b84	ldp x20,x19,[sp], #0x20
00b52b88	ret
