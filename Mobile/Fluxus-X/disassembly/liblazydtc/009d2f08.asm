; tls_construct_ctos_npn @ 009d2f08
009d2f08	stp x20,x19,[sp, #-0x20]!
009d2f0c	stp x29,x30,[sp, #0x10]
009d2f10	ldr x8,[x0, #0x9a8]
009d2f14	add x29,sp,#0x10
009d2f18	ldr x8,[x8, #0x2c8]
009d2f1c	cbz x8,0x009d2f38
009d2f20	ldr x8,[x0, #0x240]
009d2f24	mov x19,x0
009d2f28	mov x20,x1
009d2f2c	cbz x8,0x009d2f40
009d2f30	ldr x8,[x19, #0x2c8]
009d2f34	cbz x8,0x009d2f40
009d2f38	mov w0,#0x2
009d2f3c	b 0x009d2fa8
009d2f40	mov w1,#0x3374
009d2f44	mov w2,#0x2
009d2f48	mov x0,x20
009d2f4c	bl 0x00c343a0
009d2f50	cbz w0,0x009d2f70
009d2f54	mov w2,#0x2
009d2f58	mov x0,x20
009d2f5c	mov x1,xzr
009d2f60	bl 0x00c343a0
009d2f64	cbz w0,0x009d2f70
009d2f68	mov w0,#0x1
009d2f6c	b 0x009d2fa8
009d2f70	bl 0x00c342a0
009d2f74	adrp x0,0x2bf000
009d2f78	adrp x2,0x2c1000
009d2f7c	add x0,x0,#0x967
009d2f80	add x2,x2,#0x818
009d2f84	mov w1,#0x18f
009d2f88	bl 0x00c342b0
009d2f8c	mov w2,#0x103
009d2f90	mov w1,#0x50
009d2f94	movk w2,#0xc, LSL #16
009d2f98	mov x0,x19
009d2f9c	mov x3,xzr
009d2fa0	bl 0x00c34410
009d2fa4	mov w0,wzr
009d2fa8	ldp x29,x30,[sp, #0x10]
009d2fac	ldp x20,x19,[sp], #0x20
009d2fb0	ret
