; tls_construct_stoc_server_name @ 009d8bd8
009d8bd8	stp x20,x19,[sp, #-0x20]!
009d8bdc	stp x29,x30,[sp, #0x10]
009d8be0	ldr w8,[x0, #0xb60]
009d8be4	add x29,sp,#0x10
009d8be8	cmp w8,#0x1
009d8bec	b.ne 0x009d8c58
009d8bf0	ldr w8,[x0, #0x4d0]
009d8bf4	mov x19,x0
009d8bf8	mov x20,x1
009d8bfc	cbz w8,0x009d8c28
009d8c00	ldr x8,[x19, #0x8]
009d8c04	ldr x9,[x8, #0xc0]
009d8c08	ldrb w9,[x9, #0x60]
009d8c0c	tbnz w9,#0x3,0x009d8c58
009d8c10	ldr w8,[x8]
009d8c14	mov w0,#0x2
009d8c18	cmp w8,#0x304
009d8c1c	b.lt 0x009d8c5c
009d8c20	cmp w8,#0x10, LSL #12
009d8c24	b.eq 0x009d8c5c
009d8c28	mov w2,#0x2
009d8c2c	mov x0,x20
009d8c30	mov x1,xzr
009d8c34	bl 0x00c343a0
009d8c38	cbz w0,0x009d8c68
009d8c3c	mov w2,#0x2
009d8c40	mov x0,x20
009d8c44	mov x1,xzr
009d8c48	bl 0x00c343a0
009d8c4c	cbz w0,0x009d8c68
009d8c50	mov w0,#0x1
009d8c54	b 0x009d8c5c
009d8c58	mov w0,#0x2
009d8c5c	ldp x29,x30,[sp, #0x10]
009d8c60	ldp x20,x19,[sp], #0x20
009d8c64	ret
009d8c68	bl 0x00c342a0
009d8c6c	adrp x0,0x2d7000
009d8c70	adrp x2,0x2d9000
009d8c74	add x0,x0,#0xae0
009d8c78	add x2,x2,#0x8e8
009d8c7c	mov w1,#0x4fe
009d8c80	bl 0x00c342b0
009d8c84	mov w2,#0x103
009d8c88	mov w1,#0x50
009d8c8c	movk w2,#0xc, LSL #16
009d8c90	mov x0,x19
009d8c94	mov x3,xzr
009d8c98	bl 0x00c34410
009d8c9c	mov w0,wzr
009d8ca0	b 0x009d8c5c
