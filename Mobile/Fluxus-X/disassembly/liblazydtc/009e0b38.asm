; tls_process_initial_server_flight @ 009e0b38
009e0b38	str x19,[sp, #-0x20]!
009e0b3c	stp x29,x30,[sp, #0x10]
009e0b40	add x29,sp,#0x10
009e0b44	mov x19,x0
009e0b48	bl 0x009e0870
009e0b4c	cbz w0,0x009e0bfc
009e0b50	ldr w8,[x19, #0xa60]
009e0b54	cmn w8,#0x1
009e0b58	b.eq 0x009e0b7c
009e0b5c	ldr x9,[x19, #0x9a8]
009e0b60	ldr x8,[x9, #0x250]
009e0b64	cbz x8,0x009e0b7c
009e0b68	ldr x1,[x9, #0x258]
009e0b6c	mov x0,x19
009e0b70	blr x8
009e0b74	cbz w0,0x009e0ba0
009e0b78	tbnz w0,#0x1f,0x009e0bc8
009e0b7c	ldr x8,[x19, #0xb68]
009e0b80	cbz x8,0x009e0b98
009e0b84	mov x0,x19
009e0b88	bl 0x00c35e50
009e0b8c	cbnz w0,0x009e0b98
009e0b90	ldrb w8,[x19, #0x968]
009e0b94	tbnz w8,#0x0,0x009e0bfc
009e0b98	mov w0,#0x1
009e0b9c	b 0x009e0bfc
009e0ba0	bl 0x00c342a0
009e0ba4	adrp x0,0x2d7000
009e0ba8	adrp x2,0x2b9000
009e0bac	add x0,x0,#0xb1a
009e0bb0	add x2,x2,#0xa9b
009e0bb4	mov w1,#0xa8e
009e0bb8	bl 0x00c342b0
009e0bbc	mov w1,#0x71
009e0bc0	mov w2,#0x148
009e0bc4	b 0x009e0bec
009e0bc8	bl 0x00c342a0
009e0bcc	adrp x0,0x2d7000
009e0bd0	adrp x2,0x2b9000
009e0bd4	add x0,x0,#0xb1a
009e0bd8	add x2,x2,#0xa9b
009e0bdc	mov w1,#0xa93
009e0be0	bl 0x00c342b0
009e0be4	mov w1,#0x50
009e0be8	mov w2,#0x131
009e0bec	mov x0,x19
009e0bf0	mov x3,xzr
009e0bf4	bl 0x00c34410
009e0bf8	mov w0,wzr
009e0bfc	ldp x29,x30,[sp, #0x10]
009e0c00	ldr x19,[sp], #0x20
009e0c04	ret
