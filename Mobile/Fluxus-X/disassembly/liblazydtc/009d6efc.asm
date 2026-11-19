; tls_parse_ctos_sig_algs_cert @ 009d6efc
009d6efc	sub sp,sp,#0x30
009d6f00	stp x20,x19,[sp, #0x10]
009d6f04	stp x29,x30,[sp, #0x20]
009d6f08	ldr x8,[x1, #0x8]
009d6f0c	mov x19,x0
009d6f10	add x29,sp,#0x20
009d6f14	subs x10,x8,#0x2
009d6f18	b.cc 0x009d6f58
009d6f1c	ldr x9,[x1]
009d6f20	ldrb w11,[x9]
009d6f24	ldrb w8,[x9, #0x1]
009d6f28	bfm x8,x11,#0x38,#0x7
009d6f2c	cmp x10,x8
009d6f30	b.ne 0x009d6f58
009d6f34	add x9,x9,#0x2
009d6f38	add x10,x9,x8
009d6f3c	stp x10,xzr,[x1]
009d6f40	stp x9,x8,[sp]
009d6f44	cbz x8,0x009d6f58
009d6f48	ldr w8,[x19, #0x4d0]
009d6f4c	cbz w8,0x009d6fa0
009d6f50	mov w20,#0x1
009d6f54	b 0x009d6f8c
009d6f58	bl 0x00c342a0
009d6f5c	adrp x0,0x2d7000
009d6f60	adrp x2,0x2a7000
009d6f64	add x0,x0,#0xae0
009d6f68	add x2,x2,#0xbe9
009d6f6c	mov w1,#0x10d
009d6f70	bl 0x00c342b0
009d6f74	mov w1,#0x32
009d6f78	mov w2,#0x6e
009d6f7c	mov x0,x19
009d6f80	mov x3,xzr
009d6f84	bl 0x00c34410
009d6f88	mov w20,wzr
009d6f8c	mov w0,w20
009d6f90	ldp x29,x30,[sp, #0x20]
009d6f94	ldp x20,x19,[sp, #0x10]
009d6f98	add sp,sp,#0x30
009d6f9c	ret
009d6fa0	mov x1,sp
009d6fa4	mov w2,#0x1
009d6fa8	mov x0,x19
009d6fac	mov w20,#0x1
009d6fb0	bl 0x00c36770
009d6fb4	cbnz w0,0x009d6f8c
009d6fb8	bl 0x00c342a0
009d6fbc	adrp x0,0x2d7000
009d6fc0	adrp x2,0x2a7000
009d6fc4	add x0,x0,#0xae0
009d6fc8	add x2,x2,#0xbe9
009d6fcc	mov w1,#0x112
009d6fd0	b 0x009d6f70
