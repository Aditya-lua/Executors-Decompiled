; X509_ATTRIBUTE_get0_data @ 00b08a30
00b08a30	stp x20,x19,[sp, #-0x20]!
00b08a34	stp x29,x30,[sp, #0x10]
00b08a38	add x29,sp,#0x10
00b08a3c	cbz x0,0x00b08aa4
00b08a40	ldr x0,[x0, #0x8]
00b08a44	mov w19,w2
00b08a48	bl 0x00c32610
00b08a4c	cbz x0,0x00b08aa4
00b08a50	orr w8,w19,#0x4
00b08a54	cmp w8,#0x5
00b08a58	b.eq 0x00b08a74
00b08a5c	mov x20,x0
00b08a60	bl 0x00c372d0
00b08a64	cmp w0,w19
00b08a68	b.ne 0x00b08a74
00b08a6c	ldr x0,[x20, #0x8]
00b08a70	b 0x00b08aa4
00b08a74	bl 0x00c342a0
00b08a78	adrp x0,0x2ba000
00b08a7c	adrp x2,0x2b0000
00b08a80	add x0,x0,#0x8ba
00b08a84	add x2,x2,#0xa14
00b08a88	mov w1,#0x197
00b08a8c	bl 0x00c342b0
00b08a90	mov w0,#0xb
00b08a94	mov w1,#0x7a
00b08a98	mov x2,xzr
00b08a9c	bl 0x00c342c0
00b08aa0	mov x0,xzr
00b08aa4	ldp x29,x30,[sp, #0x10]
00b08aa8	ldp x20,x19,[sp], #0x20
00b08aac	ret
