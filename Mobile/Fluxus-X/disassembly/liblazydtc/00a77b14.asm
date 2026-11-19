; EVP_PKEY_CTX_md @ 00a77b14
00a77b14	str x21,[sp, #-0x30]!
00a77b18	stp x20,x19,[sp, #0x10]
00a77b1c	stp x29,x30,[sp, #0x20]
00a77b20	add x29,sp,#0x20
00a77b24	cbz x3,0x00a77b68
00a77b28	mov x21,x0
00a77b2c	mov x0,x3
00a77b30	mov w19,w2
00a77b34	mov w20,w1
00a77b38	bl 0x00c35310
00a77b3c	cbz x0,0x00a77b68
00a77b40	mov w2,w20
00a77b44	mov w3,w19
00a77b48	ldp x29,x30,[sp, #0x20]
00a77b4c	ldp x20,x19,[sp, #0x10]
00a77b50	mov x5,x0
00a77b54	mov w1,#0xffffffff
00a77b58	mov x0,x21
00a77b5c	mov w4,wzr
00a77b60	ldr x21,[sp], #0x30
00a77b64	b 0x00a763fc
00a77b68	bl 0x00c342a0
00a77b6c	adrp x0,0x2c3000
00a77b70	adrp x2,0x2cb000
00a77b74	add x0,x0,#0xa9f
00a77b78	add x2,x2,#0x9e1
00a77b7c	mov w1,#0x699
00a77b80	bl 0x00c342b0
00a77b84	orr w0,wzr,#0x6
00a77b88	mov w1,#0x98
00a77b8c	mov x2,xzr
00a77b90	bl 0x00c342c0
00a77b94	ldp x29,x30,[sp, #0x20]
00a77b98	ldp x20,x19,[sp, #0x10]
00a77b9c	mov w0,wzr
00a77ba0	ldr x21,[sp], #0x30
00a77ba4	ret
