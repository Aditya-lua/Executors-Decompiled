; SSL_CTX_set_ssl_version @ 009b1bcc
009b1bcc	stp x22,x21,[sp, #-0x30]!
009b1bd0	stp x20,x19,[sp, #0x10]
009b1bd4	stp x29,x30,[sp, #0x20]
009b1bd8	add x29,sp,#0x20
009b1bdc	mov x19,x0
009b1be0	str x1,[x0, #0x8]
009b1be4	bl 0x00c351d0
009b1be8	mov x1,x0
009b1bec	mov x0,x19
009b1bf0	bl 0x00c32780
009b1bf4	cbz w0,0x009b1c3c
009b1bf8	ldr x20,[x19, #0x20]
009b1bfc	add x21,x19,#0x10
009b1c00	add x22,x19,#0x18
009b1c04	bl 0x00c351c0
009b1c08	ldr x5,[x19, #0x158]
009b1c0c	mov x4,x0
009b1c10	mov x0,x19
009b1c14	mov x1,x20
009b1c18	mov x2,x21
009b1c1c	mov x3,x22
009b1c20	bl 0x00c353e0
009b1c24	cbz x0,0x009b1c58
009b1c28	bl 0x00c325e0
009b1c2c	cmp w0,#0x0
009b1c30	b.le 0x009b1c58
009b1c34	mov w0,#0x1
009b1c38	b 0x009b1c88
009b1c3c	bl 0x00c342a0
009b1c40	adrp x0,0x2c5000
009b1c44	adrp x2,0x2d9000
009b1c48	add x0,x0,#0x652
009b1c4c	add x2,x2,#0x788
009b1c50	mov w1,#0x29f
009b1c54	b 0x009b1c70
009b1c58	bl 0x00c342a0
009b1c5c	adrp x0,0x2c5000
009b1c60	adrp x2,0x2d9000
009b1c64	add x0,x0,#0x652
009b1c68	add x2,x2,#0x788
009b1c6c	mov w1,#0x2a8
009b1c70	bl 0x00c342b0
009b1c74	mov w0,#0x14
009b1c78	mov w1,#0xe6
009b1c7c	mov x2,xzr
009b1c80	bl 0x00c342c0
009b1c84	mov w0,wzr
009b1c88	ldp x29,x30,[sp, #0x20]
009b1c8c	ldp x20,x19,[sp, #0x10]
009b1c90	ldp x22,x21,[sp], #0x30
009b1c94	ret
