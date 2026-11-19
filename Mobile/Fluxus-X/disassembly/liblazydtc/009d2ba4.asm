; tls_construct_ctos_sig_algs @ 009d2ba4
009d2ba4	str x21,[sp, #-0x30]!
009d2ba8	stp x20,x19,[sp, #0x10]
009d2bac	stp x29,x30,[sp, #0x20]
009d2bb0	ldr x8,[x0, #0x8]
009d2bb4	mov x19,x0
009d2bb8	mov x20,x1
009d2bbc	add x29,sp,#0x20
009d2bc0	ldr x8,[x8, #0xc0]
009d2bc4	ldrb w9,[x8, #0x60]
009d2bc8	ldr w8,[x0, #0xa0c]
009d2bcc	tbnz w9,#0x3,0x009d2be0
009d2bd0	cmp w8,#0x302
009d2bd4	b.gt 0x009d2bf8
009d2bd8	mov w0,#0x2
009d2bdc	b 0x009d2cb0
009d2be0	cmp w8,#0x100
009d2be4	mov w0,#0x2
009d2be8	b.eq 0x009d2cb0
009d2bec	mov w9,#0xfefd
009d2bf0	cmp w8,w9
009d2bf4	b.gt 0x009d2cb0
009d2bf8	mov w1,#0x1
009d2bfc	add x2,sp,#0x8
009d2c00	mov x0,x19
009d2c04	bl 0x00c366d0
009d2c08	mov x21,x0
009d2c0c	mov w1,#0xd
009d2c10	mov w2,#0x2
009d2c14	mov x0,x20
009d2c18	bl 0x00c343a0
009d2c1c	cbz w0,0x009d2c78
009d2c20	mov w1,#0x2
009d2c24	mov x0,x20
009d2c28	bl 0x00c343b0
009d2c2c	cbz w0,0x009d2c78
009d2c30	mov w1,#0x2
009d2c34	mov x0,x20
009d2c38	bl 0x00c343b0
009d2c3c	cbz w0,0x009d2c78
009d2c40	ldr x2,[sp, #0x8]
009d2c44	mov x0,x19
009d2c48	mov x1,x20
009d2c4c	mov x3,x21
009d2c50	bl 0x00c366c0
009d2c54	cbz w0,0x009d2c78
009d2c58	mov x0,x20
009d2c5c	bl 0x00c34350
009d2c60	cbz w0,0x009d2c78
009d2c64	mov x0,x20
009d2c68	bl 0x00c34350
009d2c6c	cbz w0,0x009d2c78
009d2c70	mov w0,#0x1
009d2c74	b 0x009d2cb0
009d2c78	bl 0x00c342a0
009d2c7c	adrp x0,0x2bf000
009d2c80	adrp x2,0x2d9000
009d2c84	add x0,x0,#0x967
009d2c88	add x2,x2,#0x896
009d2c8c	mov w1,#0x13a
009d2c90	bl 0x00c342b0
009d2c94	mov w2,#0x103
009d2c98	mov w1,#0x50
009d2c9c	movk w2,#0xc, LSL #16
009d2ca0	mov x0,x19
009d2ca4	mov x3,xzr
009d2ca8	bl 0x00c34410
009d2cac	mov w0,wzr
009d2cb0	ldp x29,x30,[sp, #0x20]
009d2cb4	ldp x20,x19,[sp, #0x10]
009d2cb8	ldr x21,[sp], #0x30
009d2cbc	ret
