; X509_ATTRIBUTE_set1_object @ 00b08b30
00b08b30	stp x20,x19,[sp, #-0x20]!
00b08b34	mov x19,x0
00b08b38	mov w0,wzr
00b08b3c	stp x29,x30,[sp, #0x10]
00b08b40	add x29,sp,#0x10
00b08b44	cbz x19,0x00b08b6c
00b08b48	mov x20,x1
00b08b4c	cbz x1,0x00b08b6c
00b08b50	ldr x0,[x19]
00b08b54	bl 0x00c37660
00b08b58	mov x0,x20
00b08b5c	bl 0x00c37730
00b08b60	cmp x0,#0x0
00b08b64	str x0,[x19]
00b08b68	cset w0,ne
00b08b6c	ldp x29,x30,[sp, #0x10]
00b08b70	ldp x20,x19,[sp], #0x20
00b08b74	ret
