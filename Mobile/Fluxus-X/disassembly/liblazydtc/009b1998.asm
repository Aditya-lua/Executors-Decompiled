; SSL_clear @ 009b1998
009b1998	stp x20,x19,[sp, #-0x20]!
009b199c	stp x29,x30,[sp, #0x10]
009b19a0	ldr x8,[x0, #0x8]
009b19a4	add x29,sp,#0x10
009b19a8	cbz x8,0x009b1a38
009b19ac	mov x19,x0
009b19b0	bl 0x00c35d50
009b19b4	cbz w0,0x009b19c4
009b19b8	ldr x0,[x19, #0x918]
009b19bc	bl 0x00c32870
009b19c0	str xzr,[x19, #0x918]
009b19c4	ldr x0,[x19, #0x920]
009b19c8	bl 0x00c32870
009b19cc	ldr x0,[x19, #0x928]
009b19d0	adrp x1,0x2c5000
009b19d4	add x1,x1,#0x652
009b19d8	mov w2,#0x255
009b19dc	str xzr,[x19, #0x920]
009b19e0	add x20,x19,#0x928
009b19e4	bl 0x00c32310
009b19e8	movi v0.2D,#0x0
009b19ec	str wzr,[x19, #0x8e8]
009b19f0	str xzr,[x19, #0x1d78]
009b19f4	str wzr,[x19, #0x980]
009b19f8	str wzr,[x19, #0x4d0]
009b19fc	str wzr,[x19, #0x44]
009b1a00	str q0,[x20]
009b1a04	ldr w8,[x19, #0xba0]
009b1a08	cbz w8,0x009b1a74
009b1a0c	bl 0x00c342a0
009b1a10	adrp x0,0x2c5000
009b1a14	adrp x2,0x2b3000
009b1a18	add x0,x0,#0x652
009b1a1c	add x2,x2,#0xdab
009b1a20	mov w1,#0x260
009b1a24	bl 0x00c342b0
009b1a28	mov w1,#0x103
009b1a2c	mov w0,#0x14
009b1a30	movk w1,#0xc, LSL #16
009b1a34	b 0x009b1a5c
009b1a38	bl 0x00c342a0
009b1a3c	adrp x0,0x2c5000
009b1a40	adrp x2,0x2b3000
009b1a44	add x0,x0,#0x652
009b1a48	add x2,x2,#0xdab
009b1a4c	mov w1,#0x24b
009b1a50	bl 0x00c342b0
009b1a54	mov w0,#0x14
009b1a58	mov w1,#0xbc
009b1a5c	mov x2,xzr
009b1a60	bl 0x00c342c0
009b1a64	mov w0,wzr
009b1a68	ldp x29,x30,[sp, #0x10]
009b1a6c	ldp x20,x19,[sp], #0x20
009b1a70	ret
009b1a74	mov x0,x19
009b1a78	bl 0x00c35cd0
009b1a7c	ldr x8,[x19, #0x8]
009b1a80	ldr x0,[x19, #0x88]
009b1a84	mov w9,#0x1
009b1a88	ldr w8,[x8]
009b1a8c	str w9,[x19, #0x28]
009b1a90	str w8,[x19]
009b1a94	str w8,[x19, #0xa0c]
009b1a98	bl 0x00c35660
009b1a9c	mov x0,x19
009b1aa0	str xzr,[x19, #0x88]
009b1aa4	bl 0x009b1b60
009b1aa8	ldr x0,[x19, #0xbc8]
009b1aac	mov w8,#0xffffffff
009b1ab0	str wzr,[x19, #0xa08]
009b1ab4	str w8,[x19, #0xba4]
009b1ab8	bl 0x00c31f90
009b1abc	add x8,x19,#0x50c
009b1ac0	movi d0,#-0x1
009b1ac4	str xzr,[x19, #0xbc8]
009b1ac8	str d0,[x8]
009b1acc	ldr x0,[x19, #0x500]
009b1ad0	bl 0x00c31a90
009b1ad4	add x8,x19,#0x4f8
009b1ad8	movi v0.2D,#0x0
009b1adc	str q0,[x8]
009b1ae0	ldr x0,[x19, #0x4d8]
009b1ae4	mov x1,xzr
009b1ae8	bl 0x00c35040
009b1aec	ldr x0,[x19, #0x1da8]
009b1af0	adrp x1,0x2c5000
009b1af4	add x1,x1,#0x652
009b1af8	mov w2,#0x27f
009b1afc	bl 0x00c32310
009b1b00	mov w8,#0x1da8
009b1b04	movi v0.2D,#0x0
009b1b08	str q0,[x19,x8]
009b1b0c	ldr x9,[x19, #0x9a8]
009b1b10	ldr x8,[x19, #0x8]
009b1b14	ldr x9,[x9, #0x8]
009b1b18	cmp x8,x9
009b1b1c	b.eq 0x009b1b40
009b1b20	ldr x8,[x8, #0x20]
009b1b24	mov x0,x19
009b1b28	blr x8
009b1b2c	ldr x8,[x19, #0x9a8]
009b1b30	ldr x8,[x8, #0x8]
009b1b34	str x8,[x19, #0x8]
009b1b38	ldr x8,[x8, #0x10]
009b1b3c	b 0x009b1b44
009b1b40	ldr x8,[x8, #0x18]
009b1b44	mov x0,x19
009b1b48	blr x8
009b1b4c	cbz w0,0x009b1a68
009b1b50	add x0,x19,#0xc58
009b1b54	bl 0x00c358c0
009b1b58	mov w0,#0x1
009b1b5c	b 0x009b1a68
