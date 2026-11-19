; tls_construct_stoc_renegotiate @ 009d8af4
009d8af4	stp x20,x19,[sp, #-0x20]!
009d8af8	stp x29,x30,[sp, #0x10]
009d8afc	ldr w8,[x0, #0x480]
009d8b00	add x29,sp,#0x10
009d8b04	cbz w8,0x009d8bc8
009d8b08	mov x20,x1
009d8b0c	mov x19,x0
009d8b10	mov w1,#0xff01
009d8b14	mov w2,#0x2
009d8b18	mov x0,x20
009d8b1c	bl 0x00c343a0
009d8b20	cbz w0,0x009d8b8c
009d8b24	mov w1,#0x2
009d8b28	mov x0,x20
009d8b2c	bl 0x00c343b0
009d8b30	cbz w0,0x009d8b8c
009d8b34	mov w1,#0x1
009d8b38	mov x0,x20
009d8b3c	bl 0x00c343b0
009d8b40	cbz w0,0x009d8b8c
009d8b44	ldr x2,[x19, #0x430]
009d8b48	add x1,x19,#0x3f0
009d8b4c	mov x0,x20
009d8b50	bl 0x00c34390
009d8b54	cbz w0,0x009d8b8c
009d8b58	ldr x2,[x19, #0x478]
009d8b5c	add x1,x19,#0x438
009d8b60	mov x0,x20
009d8b64	bl 0x00c34390
009d8b68	cbz w0,0x009d8b8c
009d8b6c	mov x0,x20
009d8b70	bl 0x00c34350
009d8b74	cbz w0,0x009d8b8c
009d8b78	mov x0,x20
009d8b7c	bl 0x00c34350
009d8b80	cbz w0,0x009d8b8c
009d8b84	mov w0,#0x1
009d8b88	b 0x009d8bcc
009d8b8c	bl 0x00c342a0
009d8b90	adrp x0,0x2d7000
009d8b94	adrp x2,0x2d9000
009d8b98	add x0,x0,#0xae0
009d8b9c	add x2,x2,#0x8c9
009d8ba0	mov w1,#0x4e7
009d8ba4	bl 0x00c342b0
009d8ba8	mov w2,#0x103
009d8bac	mov w1,#0x50
009d8bb0	movk w2,#0xc, LSL #16
009d8bb4	mov x0,x19
009d8bb8	mov x3,xzr
009d8bbc	bl 0x00c34410
009d8bc0	mov w0,wzr
009d8bc4	b 0x009d8bcc
009d8bc8	mov w0,#0x2
009d8bcc	ldp x29,x30,[sp, #0x10]
009d8bd0	ldp x20,x19,[sp], #0x20
009d8bd4	ret
