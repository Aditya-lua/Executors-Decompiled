; ERR_lib_error_string @ 00a54af8
00a54af8	sub sp,sp,#0x30
00a54afc	str x19,[sp, #0x10]
00a54b00	mov x19,x0
00a54b04	adrp x0,0xd21000
00a54b08	adrp x1,0xa53000
00a54b0c	add x0,x0,#0xa30
00a54b10	add x1,x1,#0xf8c
00a54b14	stp x29,x30,[sp, #0x20]
00a54b18	add x29,sp,#0x20
00a54b1c	bl 0x00c34d60
00a54b20	mov w8,w0
00a54b24	mov x0,xzr
00a54b28	cbz w8,0x00a54b8c
00a54b2c	adrp x8,0xd21000
00a54b30	ldr w8,[x8, #0xa34]
00a54b34	cbz w8,0x00a54b8c
00a54b38	and x8,x19,#0x7f800000
00a54b3c	cmp w19,#0x0
00a54b40	adrp x19,0xd21000
00a54b44	ldr x0,[x19, #0xa20]
00a54b48	mov w9,#0x1000000
00a54b4c	csel x8,x9,x8,lt
00a54b50	str x8,[sp]
00a54b54	bl 0x00c35680
00a54b58	cbz w0,0x00a54b88
00a54b5c	adrp x8,0xd21000
00a54b60	ldr x0,[x8, #0xa28]
00a54b64	mov x1,sp
00a54b68	bl 0x00c34de0
00a54b6c	ldr x8,[x19, #0xa20]
00a54b70	mov x19,x0
00a54b74	mov x0,x8
00a54b78	bl 0x00c35690
00a54b7c	cbz x19,0x00a54b88
00a54b80	ldr x0,[x19, #0x8]
00a54b84	b 0x00a54b8c
00a54b88	mov x0,xzr
00a54b8c	ldp x29,x30,[sp, #0x20]
00a54b90	ldr x19,[sp, #0x10]
00a54b94	add sp,sp,#0x30
00a54b98	ret
