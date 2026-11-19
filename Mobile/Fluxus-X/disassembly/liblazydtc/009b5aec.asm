; SSL_CTX_set_cipher_list @ 009b5aec
009b5aec	str x21,[sp, #-0x30]!
009b5af0	stp x20,x19,[sp, #0x10]
009b5af4	stp x29,x30,[sp, #0x20]
009b5af8	mov x4,x1
009b5afc	ldr x1,[x0, #0x20]
009b5b00	ldr x5,[x0, #0x158]
009b5b04	add x2,x0,#0x10
009b5b08	add x3,x0,#0x18
009b5b0c	add x29,sp,#0x20
009b5b10	bl 0x00c353e0
009b5b14	cbz x0,0x009b5b98
009b5b18	mov x19,x0
009b5b1c	bl 0x00c325e0
009b5b20	cmp w0,#0x1
009b5b24	b.lt 0x009b5b68
009b5b28	mov w21,wzr
009b5b2c	mov w20,wzr
009b5b30	mov x0,x19
009b5b34	mov w1,w20
009b5b38	bl 0x00c32610
009b5b3c	ldr w8,[x0, #0x2c]
009b5b40	mov x0,x19
009b5b44	add w20,w20,#0x1
009b5b48	cmp w8,#0x304
009b5b4c	cinc w21,w21,lt
009b5b50	bl 0x00c325e0
009b5b54	cmp w20,w0
009b5b58	b.lt 0x009b5b30
009b5b5c	cbz w21,0x009b5b68
009b5b60	mov w0,#0x1
009b5b64	b 0x009b5b98
009b5b68	bl 0x00c342a0
009b5b6c	adrp x0,0x2c5000
009b5b70	adrp x2,0x2b1000
009b5b74	add x0,x0,#0x652
009b5b78	add x2,x2,#0xec5
009b5b7c	mov w1,#0xadb
009b5b80	bl 0x00c342b0
009b5b84	mov w0,#0x14
009b5b88	mov w1,#0xb9
009b5b8c	mov x2,xzr
009b5b90	bl 0x00c342c0
009b5b94	mov w0,wzr
009b5b98	ldp x29,x30,[sp, #0x20]
009b5b9c	ldp x20,x19,[sp, #0x10]
009b5ba0	ldr x21,[sp], #0x30
009b5ba4	ret
