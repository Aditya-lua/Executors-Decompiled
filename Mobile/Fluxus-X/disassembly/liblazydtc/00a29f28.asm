; ossl_ec_GF2m_simple_group_check_discriminant @ 00a29f28
00a29f28	stp x22,x21,[sp, #-0x30]!
00a29f2c	stp x20,x19,[sp, #0x10]
00a29f30	mov x19,x1
00a29f34	mov x21,x0
00a29f38	mov x20,xzr
00a29f3c	stp x29,x30,[sp, #0x20]
00a29f40	add x29,sp,#0x20
00a29f44	cbnz x1,0x00a29f58
00a29f48	bl 0x00c38a50
00a29f4c	mov x19,x0
00a29f50	mov x20,x0
00a29f54	cbz x0,0x00a29f94
00a29f58	mov x0,x19
00a29f5c	bl 0x00c38a90
00a29f60	mov x0,x19
00a29f64	bl 0x00c38a40
00a29f68	cbz x0,0x00a29fc4
00a29f6c	ldr x1,[x21, #0x68]
00a29f70	add x2,x21,#0x48
00a29f74	mov x22,x0
00a29f78	bl 0x00c38b50
00a29f7c	cbz w0,0x00a29fc4
00a29f80	mov x0,x22
00a29f84	bl 0x00c369b0
00a29f88	cmp w0,#0x0
00a29f8c	cset w21,eq
00a29f90	b 0x00a29fc8
00a29f94	bl 0x00c342a0
00a29f98	adrp x0,0x29e000
00a29f9c	adrp x2,0x2b5000
00a29fa0	add x0,x0,#0x82
00a29fa4	add x2,x2,#0xb73
00a29fa8	mov w1,#0xbf
00a29fac	bl 0x00c342b0
00a29fb0	mov w1,#0x100
00a29fb4	mov w0,#0x10
00a29fb8	movk w1,#0xc, LSL #16
00a29fbc	mov x2,xzr
00a29fc0	bl 0x00c342c0
00a29fc4	mov w21,wzr
00a29fc8	mov x0,x19
00a29fcc	bl 0x00c38a20
00a29fd0	mov x0,x20
00a29fd4	bl 0x00c38a30
00a29fd8	ldp x29,x30,[sp, #0x20]
00a29fdc	ldp x20,x19,[sp, #0x10]
00a29fe0	mov w0,w21
00a29fe4	ldp x22,x21,[sp], #0x30
00a29fe8	ret
