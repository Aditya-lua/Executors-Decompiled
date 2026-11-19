; SSL_CTX_use_psk_identity_hint @ 009b7b34
009b7b34	stp x20,x19,[sp, #-0x20]!
009b7b38	mov x20,x1
009b7b3c	mov x19,x0
009b7b40	stp x29,x30,[sp, #0x10]
009b7b44	add x29,sp,#0x10
009b7b48	cbz x1,0x009b7b90
009b7b4c	mov x0,x20
009b7b50	bl 0x00c2ff50
009b7b54	cmp x0,#0x101
009b7b58	b.cc 0x009b7b90
009b7b5c	bl 0x00c342a0
009b7b60	adrp x0,0x2c5000
009b7b64	adrp x2,0x2c5000
009b7b68	add x0,x0,#0x652
009b7b6c	add x2,x2,#0x660
009b7b70	mov w1,#0x11ec
009b7b74	bl 0x00c342b0
009b7b78	mov w0,#0x14
009b7b7c	mov w1,#0x92
009b7b80	mov x2,xzr
009b7b84	bl 0x00c342c0
009b7b88	mov w0,wzr
009b7b8c	b 0x009b7bdc
009b7b90	ldr x8,[x19, #0x158]
009b7b94	adrp x1,0x2c5000
009b7b98	add x1,x1,#0x652
009b7b9c	mov w2,#0x11ef
009b7ba0	ldr x0,[x8, #0x200]
009b7ba4	bl 0x00c32310
009b7ba8	cbz x20,0x009b7bd0
009b7bac	adrp x1,0x2c5000
009b7bb0	add x1,x1,#0x652
009b7bb4	mov w2,#0x11f1
009b7bb8	mov x0,x20
009b7bbc	bl 0x00c34600
009b7bc0	ldr x8,[x19, #0x158]
009b7bc4	str x0,[x8, #0x200]
009b7bc8	cbnz x0,0x009b7bd8
009b7bcc	b 0x009b7bdc
009b7bd0	ldr x8,[x19, #0x158]
009b7bd4	str xzr,[x8, #0x200]
009b7bd8	mov w0,#0x1
009b7bdc	ldp x29,x30,[sp, #0x10]
009b7be0	ldp x20,x19,[sp], #0x20
009b7be4	ret
