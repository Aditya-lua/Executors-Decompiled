; mbedtls_rsa_copy @ 00ba8b34
00ba8b34	str x21,[sp, #-0x30]!
00ba8b38	stp x20,x19,[sp, #0x10]
00ba8b3c	stp x29,x30,[sp, #0x20]
00ba8b40	add x29,sp,#0x20
00ba8b44	ldr x8,[x1, #0x8]
00ba8b48	mov x20,x1
00ba8b4c	mov x19,x0
00ba8b50	add x0,x0,#0x10
00ba8b54	add x1,x1,#0x10
00ba8b58	str x8,[x19, #0x8]
00ba8b5c	bl 0x00c41b60
00ba8b60	mov w21,w0
00ba8b64	cbnz w0,0x00ba8c58
00ba8b68	add x0,x19,#0x20
00ba8b6c	add x1,x20,#0x20
00ba8b70	bl 0x00c41b60
00ba8b74	mov w21,w0
00ba8b78	cbnz w0,0x00ba8c58
00ba8b7c	add x0,x19,#0x30
00ba8b80	add x1,x20,#0x30
00ba8b84	bl 0x00c41b60
00ba8b88	mov w21,w0
00ba8b8c	cbnz w0,0x00ba8c58
00ba8b90	add x0,x19,#0x40
00ba8b94	add x1,x20,#0x40
00ba8b98	bl 0x00c41b60
00ba8b9c	mov w21,w0
00ba8ba0	cbnz w0,0x00ba8c58
00ba8ba4	add x0,x19,#0x50
00ba8ba8	add x1,x20,#0x50
00ba8bac	bl 0x00c41b60
00ba8bb0	mov w21,w0
00ba8bb4	cbnz w0,0x00ba8c58
00ba8bb8	add x0,x19,#0x60
00ba8bbc	add x1,x20,#0x60
00ba8bc0	bl 0x00c41b60
00ba8bc4	mov w21,w0
00ba8bc8	cbnz w0,0x00ba8c58
00ba8bcc	add x0,x19,#0x70
00ba8bd0	add x1,x20,#0x70
00ba8bd4	bl 0x00c41b60
00ba8bd8	mov w21,w0
00ba8bdc	cbnz w0,0x00ba8c58
00ba8be0	add x0,x19,#0x80
00ba8be4	add x1,x20,#0x80
00ba8be8	bl 0x00c41b60
00ba8bec	mov w21,w0
00ba8bf0	cbnz w0,0x00ba8c58
00ba8bf4	add x0,x19,#0xa0
00ba8bf8	add x1,x20,#0xa0
00ba8bfc	bl 0x00c41b60
00ba8c00	mov w21,w0
00ba8c04	cbnz w0,0x00ba8c58
00ba8c08	add x0,x19,#0xb0
00ba8c0c	add x1,x20,#0xb0
00ba8c10	bl 0x00c41b60
00ba8c14	mov w21,w0
00ba8c18	cbnz w0,0x00ba8c58
00ba8c1c	add x0,x19,#0x90
00ba8c20	add x1,x20,#0x90
00ba8c24	bl 0x00c41b60
00ba8c28	mov w21,w0
00ba8c2c	cbnz w0,0x00ba8c58
00ba8c30	add x0,x19,#0xc0
00ba8c34	add x1,x20,#0xc0
00ba8c38	bl 0x00c41b60
00ba8c3c	mov w21,w0
00ba8c40	cbnz w0,0x00ba8c58
00ba8c44	add x0,x19,#0xd0
00ba8c48	add x1,x20,#0xd0
00ba8c4c	bl 0x00c41b60
00ba8c50	mov w21,w0
00ba8c54	cbz w0,0x00ba8c74
00ba8c58	mov x0,x19
00ba8c5c	bl 0x00c432d0
00ba8c60	ldp x29,x30,[sp, #0x20]
00ba8c64	ldp x20,x19,[sp, #0x10]
00ba8c68	mov w0,w21
00ba8c6c	ldr x21,[sp], #0x30
00ba8c70	ret
00ba8c74	ldr x8,[x20, #0xe0]
00ba8c78	str x8,[x19, #0xe0]
00ba8c7c	b 0x00ba8c60
