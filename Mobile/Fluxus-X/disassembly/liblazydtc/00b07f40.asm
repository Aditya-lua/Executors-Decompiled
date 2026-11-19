; ossl_x509at_add1_attr @ 00b07f40
00b07f40	str x21,[sp, #-0x30]!
00b07f44	stp x20,x19,[sp, #0x10]
00b07f48	stp x29,x30,[sp, #0x20]
00b07f4c	add x29,sp,#0x20
00b07f50	cbz x0,0x00b07fa4
00b07f54	ldr x19,[x0]
00b07f58	mov x21,x1
00b07f5c	mov x20,x0
00b07f60	cbnz x19,0x00b07f70
00b07f64	bl 0x00c34780
00b07f68	mov x19,x0
00b07f6c	cbz x0,0x00b07fdc
00b07f70	mov x0,x21
00b07f74	bl 0x00c3f7a0
00b07f78	mov x21,x0
00b07f7c	cbz x0,0x00b08010
00b07f80	mov x0,x19
00b07f84	mov x1,x21
00b07f88	bl 0x00c347a0
00b07f8c	cbz w0,0x00b07fe0
00b07f90	ldr x8,[x20]
00b07f94	cbnz x8,0x00b07f9c
00b07f98	str x19,[x20]
00b07f9c	mov x0,x19
00b07fa0	b 0x00b08030
00b07fa4	bl 0x00c342a0
00b07fa8	adrp x0,0x2ba000
00b07fac	adrp x2,0x2ce000
00b07fb0	add x0,x0,#0x8ba
00b07fb4	add x2,x2,#0x511
00b07fb8	mov w1,#0x51
00b07fbc	bl 0x00c342b0
00b07fc0	mov w8,#0x100
00b07fc4	movk w8,#0xc, LSL #16
00b07fc8	add w1,w8,#0x2
00b07fcc	mov w0,#0xb
00b07fd0	mov x2,xzr
00b07fd4	bl 0x00c342c0
00b07fd8	b 0x00b0802c
00b07fdc	mov x21,xzr
00b07fe0	bl 0x00c342a0
00b07fe4	adrp x0,0x2ba000
00b07fe8	adrp x2,0x2ce000
00b07fec	add x0,x0,#0x8ba
00b07ff0	add x2,x2,#0x511
00b07ff4	mov w1,#0x64
00b07ff8	bl 0x00c342b0
00b07ffc	mov w1,#0x100
00b08000	mov w0,#0xb
00b08004	movk w1,#0xc, LSL #16
00b08008	mov x2,xzr
00b0800c	bl 0x00c342c0
00b08010	mov x0,x21
00b08014	bl 0x00c3d9a0
00b08018	ldr x8,[x20]
00b0801c	mov x0,xzr
00b08020	cbnz x8,0x00b08030
00b08024	mov x0,x19
00b08028	bl 0x00c34770
00b0802c	mov x0,xzr
00b08030	ldp x29,x30,[sp, #0x20]
00b08034	ldp x20,x19,[sp, #0x10]
00b08038	ldr x21,[sp], #0x30
00b0803c	ret
