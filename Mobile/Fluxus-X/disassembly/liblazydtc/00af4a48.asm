; X509V3_set_nconf @ 00af4a48
00af4a48	cbz x0,0x00af4a5c
00af4a4c	adrp x8,0xcc9000
00af4a50	add x8,x8,#0x590
00af4a54	stp x8,x1,[x0, #0x28]
00af4a58	ret
00af4a5c	stp x29,x30,[sp, #-0x10]!
00af4a60	mov x29,sp
00af4a64	bl 0x00c342a0
00af4a68	adrp x0,0x2aa000
00af4a6c	adrp x2,0x2c0000
00af4a70	add x0,x0,#0x9f7
00af4a74	add x2,x2,#0x5f3
00af4a78	mov w1,#0x1b7
00af4a7c	bl 0x00c342b0
00af4a80	mov w1,#0x102
00af4a84	mov w0,#0x22
00af4a88	movk w1,#0xc, LSL #16
00af4a8c	mov x2,xzr
00af4a90	ldp x29,x30,[sp], #0x10
00af4a94	b 0x00c342c0
