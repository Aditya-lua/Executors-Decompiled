; X509v3_addr_inherits @ 00af7b24
00af7b24	stp x20,x19,[sp, #-0x20]!
00af7b28	stp x29,x30,[sp, #0x10]
00af7b2c	add x29,sp,#0x10
00af7b30	cbz x0,0x00af7b80
00af7b34	mov x19,x0
00af7b38	bl 0x00c325e0
00af7b3c	cmp w0,#0x1
00af7b40	b.lt 0x00af7b74
00af7b44	mov w20,wzr
00af7b48	mov x0,x19
00af7b4c	mov w1,w20
00af7b50	bl 0x00c32610
00af7b54	ldr x8,[x0, #0x8]
00af7b58	ldr w8,[x8]
00af7b5c	cbz w8,0x00af7b7c
00af7b60	mov x0,x19
00af7b64	add w20,w20,#0x1
00af7b68	bl 0x00c325e0
00af7b6c	cmp w20,w0
00af7b70	b.lt 0x00af7b48
00af7b74	mov w0,wzr
00af7b78	b 0x00af7b80
00af7b7c	mov w0,#0x1
00af7b80	ldp x29,x30,[sp, #0x10]
00af7b84	ldp x20,x19,[sp], #0x20
00af7b88	ret
