; PEM_read_RSAPrivateKey @ 00ab4a48
00ab4a48	str x21,[sp, #-0x30]!
00ab4a4c	stp x20,x19,[sp, #0x10]
00ab4a50	mov x19,x1
00ab4a54	mov x1,xzr
00ab4a58	stp x29,x30,[sp, #0x20]
00ab4a5c	add x29,sp,#0x20
00ab4a60	bl 0x00c3f210
00ab4a64	cbz x0,0x00ab4a94
00ab4a68	mov x21,x0
00ab4a6c	bl 0x00c32470
00ab4a70	mov x20,x0
00ab4a74	mov x0,x21
00ab4a78	bl 0x00c32450
00ab4a7c	cbz x20,0x00ab4a98
00ab4a80	cbz x19,0x00ab4a98
00ab4a84	ldr x0,[x19]
00ab4a88	bl 0x00c326d0
00ab4a8c	str x20,[x19]
00ab4a90	b 0x00ab4a98
00ab4a94	mov x20,xzr
00ab4a98	mov x0,x20
00ab4a9c	ldp x29,x30,[sp, #0x20]
00ab4aa0	ldp x20,x19,[sp, #0x10]
00ab4aa4	ldr x21,[sp], #0x30
00ab4aa8	ret
