; EVP_PKEY_fromdata_settable @ 00a74b34
00a74b34	stp x20,x19,[sp, #-0x20]!
00a74b38	stp x29,x30,[sp, #0x10]
00a74b3c	add x29,sp,#0x10
00a74b40	cbz x0,0x00a74b7c
00a74b44	ldr x8,[x0, #0x18]
00a74b48	mov x20,x0
00a74b4c	cbz x8,0x00a74b78
00a74b50	mov x0,x20
00a74b54	mov w19,w1
00a74b58	bl 0x00c3bfb0
00a74b5c	ldr x0,[x20, #0x20]
00a74b60	cbz x0,0x00a74b78
00a74b64	str wzr,[x20]
00a74b68	ldp x29,x30,[sp, #0x10]
00a74b6c	mov w1,w19
00a74b70	ldp x20,x19,[sp], #0x20
00a74b74	b 0x00c3d430
00a74b78	str wzr,[x20]
00a74b7c	bl 0x00c342a0
00a74b80	adrp x0,0x2d9000
00a74b84	adrp x2,0x2a2000
00a74b88	add x0,x0,#0xd3a
00a74b8c	add x2,x2,#0x47f
00a74b90	mov w1,#0x162
00a74b94	bl 0x00c342b0
00a74b98	orr w0,wzr,#0x6
00a74b9c	mov w1,#0x96
00a74ba0	mov x2,xzr
00a74ba4	bl 0x00c342c0
00a74ba8	ldp x29,x30,[sp, #0x10]
00a74bac	mov x0,xzr
00a74bb0	ldp x20,x19,[sp], #0x20
00a74bb4	ret
