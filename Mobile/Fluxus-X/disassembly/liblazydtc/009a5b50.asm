; ix::SocketTLSOptions::isUsingInMemoryCAs @ 009a5b50
009a5b50	stp x24,x23,[sp, #-0x40]!
009a5b54	stp x22,x21,[sp, #0x10]
009a5b58	stp x20,x19,[sp, #0x20]
009a5b5c	stp x29,x30,[sp, #0x30]
009a5b60	add x29,sp,#0x30
009a5b64	mov x9,x0
009a5b68	adrp x10,0xcb5000
009a5b6c	ldrb w8,[x9, #0x30]!
009a5b70	ldr x10,[x10]
009a5b74	ldr x19,[x10]
009a5b78	tbnz w8,#0x0,0x009a5b88
009a5b7c	add x23,x9,#0x1
009a5b80	lsr w22,w8,#0x1
009a5b84	b 0x009a5b8c
009a5b88	ldp x22,x23,[x0, #0x38]
009a5b8c	mov x0,x19
009a5b90	bl 0x00c2ff50
009a5b94	mov x20,x0
009a5b98	cbz x0,0x009a5c10
009a5b9c	cmp x22,x20
009a5ba0	add x24,x23,x22
009a5ba4	b.lt 0x009a5bf0
009a5ba8	ldrb w21,[x19]
009a5bac	mov x0,x23
009a5bb0	sub x8,x22,x20
009a5bb4	adds x2,x8,#0x1
009a5bb8	b.eq 0x009a5bf0
009a5bbc	mov w1,w21
009a5bc0	bl 0x00c300a0
009a5bc4	mov x22,x0
009a5bc8	cbz x0,0x009a5bf0
009a5bcc	mov x0,x22
009a5bd0	mov x1,x19
009a5bd4	mov x2,x20
009a5bd8	bl 0x00c300b0
009a5bdc	cbz w0,0x009a5bf4
009a5be0	add x0,x22,#0x1
009a5be4	sub x22,x24,x0
009a5be8	cmp x22,x20
009a5bec	b.ge 0x009a5bb0
009a5bf0	mov x22,x24
009a5bf4	cmp x22,x24
009a5bf8	sub x8,x22,x23
009a5bfc	cset w9,ne
009a5c00	cmn x8,#0x1
009a5c04	cset w8,ne
009a5c08	and w0,w8,w9
009a5c0c	b 0x009a5c14
009a5c10	mov w0,#0x1
009a5c14	ldp x29,x30,[sp, #0x30]
009a5c18	ldp x20,x19,[sp, #0x20]
009a5c1c	ldp x22,x21,[sp, #0x10]
009a5c20	ldp x24,x23,[sp], #0x40
009a5c24	ret
