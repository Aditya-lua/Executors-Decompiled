; ssl_hmac_init @ 009c3ae0
009c3ae0	sub sp,sp,#0xb0
009c3ae4	stp x22,x21,[sp, #0x80]
009c3ae8	stp x20,x19,[sp, #0x90]
009c3aec	stp x29,x30,[sp, #0xa0]
009c3af0	ldr x8,[x0]
009c3af4	mov x19,x3
009c3af8	mov x20,x2
009c3afc	mov x21,x0
009c3b00	mov x22,x1
009c3b04	add x29,sp,#0xa0
009c3b08	cbz x8,0x009c3b78
009c3b0c	adrp x0,0x29d000
009c3b10	add x0,x0,#0xe2e
009c3b14	add x8,sp,#0x8
009c3b18	mov x1,x19
009c3b1c	mov x2,xzr
009c3b20	bl 0x00c36280
009c3b24	ldr x8,[sp, #0x28]
009c3b28	ldur q0,[sp, #0x18]
009c3b2c	ldur q1,[sp, #0x8]
009c3b30	str x8,[sp, #0x50]
009c3b34	add x8,sp,#0x8
009c3b38	stp q1,q0,[sp, #0x30]
009c3b3c	bl 0x00c34c40
009c3b40	ldr x8,[sp, #0x28]
009c3b44	ldur q0,[sp, #0x18]
009c3b48	ldur q1,[sp, #0x8]
009c3b4c	add x3,sp,#0x30
009c3b50	str x8,[sp, #0x78]
009c3b54	stur q0,[sp, #0x68]
009c3b58	stur q1,[sp, #0x58]
009c3b5c	ldr x0,[x21]
009c3b60	mov x1,x22
009c3b64	mov x2,x20
009c3b68	bl 0x00c363d0
009c3b6c	cbz w0,0x009c3b78
009c3b70	mov w0,#0x1
009c3b74	b 0x009c3b9c
009c3b78	ldr x8,[x21, #0x8]
009c3b7c	cbz x8,0x009c3b98
009c3b80	mov x0,x21
009c3b84	mov x1,x22
009c3b88	mov x2,x20
009c3b8c	mov x3,x19
009c3b90	bl 0x00c36650
009c3b94	b 0x009c3b9c
009c3b98	mov w0,wzr
009c3b9c	ldp x29,x30,[sp, #0xa0]
009c3ba0	ldp x20,x19,[sp, #0x90]
009c3ba4	ldp x22,x21,[sp, #0x80]
009c3ba8	add sp,sp,#0xb0
009c3bac	ret
