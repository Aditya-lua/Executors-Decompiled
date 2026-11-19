; SSL_CTX_set_client_cert_engine @ 009c7f30
009c7f30	stp x20,x19,[sp, #-0x20]!
009c7f34	mov x20,x0
009c7f38	mov x0,x1
009c7f3c	stp x29,x30,[sp, #0x10]
009c7f40	add x29,sp,#0x10
009c7f44	mov x19,x1
009c7f48	bl 0x00c323b0
009c7f4c	cbz w0,0x009c7f68
009c7f50	mov x0,x19
009c7f54	bl 0x00c368d0
009c7f58	cbz x0,0x009c7f9c
009c7f5c	mov w0,#0x1
009c7f60	str x19,[x20, #0x200]
009c7f64	b 0x009c7fd4
009c7f68	bl 0x00c342a0
009c7f6c	adrp x0,0x2cb000
009c7f70	adrp x2,0x2a2000
009c7f74	add x0,x0,#0x5a7
009c7f78	add x2,x2,#0x63
009c7f7c	mov w1,#0x4f
009c7f80	bl 0x00c342b0
009c7f84	mov w1,#0x26
009c7f88	mov w0,#0x14
009c7f8c	movk w1,#0x8, LSL #16
009c7f90	mov x2,xzr
009c7f94	bl 0x00c342c0
009c7f98	b 0x009c7fd0
009c7f9c	bl 0x00c342a0
009c7fa0	adrp x0,0x2cb000
009c7fa4	adrp x2,0x2a2000
009c7fa8	add x0,x0,#0x5a7
009c7fac	add x2,x2,#0x63
009c7fb0	mov w1,#0x53
009c7fb4	bl 0x00c342b0
009c7fb8	mov w0,#0x14
009c7fbc	mov w1,#0x14b
009c7fc0	mov x2,xzr
009c7fc4	bl 0x00c342c0
009c7fc8	mov x0,x19
009c7fcc	bl 0x00c32360
009c7fd0	mov w0,wzr
009c7fd4	ldp x29,x30,[sp, #0x10]
009c7fd8	ldp x20,x19,[sp], #0x20
009c7fdc	ret
