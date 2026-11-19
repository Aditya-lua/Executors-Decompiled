; ssl_set_client_disabled @ 009c2b28
009c2b28	stp x20,x19,[sp, #-0x20]!
009c2b2c	mov x19,x0
009c2b30	mov w2,#0xe
009c2b34	add x0,x0,#0x3e0
009c2b38	add x20,x19,#0x3dc
009c2b3c	movi d0,#0x0
009c2b40	movk w2,#0x5, LSL #16
009c2b44	mov x1,x19
009c2b48	stp x29,x30,[sp, #0x10]
009c2b4c	add x29,sp,#0x10
009c2b50	str d0,[x20]
009c2b54	bl 0x009c2bcc
009c2b58	add x1,x19,#0x3e4
009c2b5c	add x2,x19,#0x3e8
009c2b60	mov x0,x19
009c2b64	mov x3,xzr
009c2b68	bl 0x00c365c0
009c2b6c	mov w8,w0
009c2b70	mov w0,wzr
009c2b74	cbnz w8,0x009c2ba0
009c2b78	ldr x8,[x19, #0x988]
009c2b7c	cbz x8,0x009c2bac
009c2b80	ldrb w8,[x19, #0xc48]
009c2b84	tbnz w8,#0x5,0x009c2b9c
009c2b88	adrp x8,0x29b000
009c2b8c	ldr d0,[x20]
009c2b90	ldr d1,[x8, #0x210]
009c2b94	orr v0.8B,v0.8B,v1.8B
009c2b98	str d0,[x20]
009c2b9c	mov w0,#0x1
009c2ba0	ldp x29,x30,[sp, #0x10]
009c2ba4	ldp x20,x19,[sp], #0x20
009c2ba8	ret
009c2bac	adrp x8,0x29a000
009c2bb0	ldr d0,[x20]
009c2bb4	ldr d1,[x8, #0x538]
009c2bb8	orr v0.8B,v0.8B,v1.8B
009c2bbc	str d0,[x20]
009c2bc0	ldrb w8,[x19, #0xc48]
009c2bc4	tbz w8,#0x5,0x009c2b88
009c2bc8	b 0x009c2b9c
