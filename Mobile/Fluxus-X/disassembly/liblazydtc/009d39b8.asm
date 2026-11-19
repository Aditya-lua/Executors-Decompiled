; tls_construct_ctos_early_data @ 009d39b8
009d39b8	stp x28,x23,[sp, #-0x40]!
009d39bc	stp x22,x21,[sp, #0x10]
009d39c0	stp x20,x19,[sp, #0x20]
009d39c4	stp x29,x30,[sp, #0x30]
009d39c8	add x29,sp,#0x30
009d39cc	sub sp,sp,#0x330
009d39d0	add x23,sp,#0x210
009d39d4	stp xzr,xzr,[x23, #0x8]
009d39d8	str xzr,[x23]
009d39dc	ldr w8,[x0, #0x8e8]
009d39e0	mov x20,x1
009d39e4	mov x19,x0
009d39e8	mov x1,xzr
009d39ec	cmp w8,#0x1
009d39f0	b.ne 0x009d3a00
009d39f4	mov x0,x19
009d39f8	bl 0x00c34a10
009d39fc	mov x1,x0
009d3a00	ldr x8,[x19, #0x9a0]
009d3a04	cbz x8,0x009d3a64
009d3a08	add x2,sp,#0x220
009d3a0c	add x3,sp,#0x218
009d3a10	add x4,sp,#0x210
009d3a14	mov x0,x19
009d3a18	blr x8
009d3a1c	ldr x8,[x23]
009d3a20	cbz w0,0x009d3a34
009d3a24	cbz x8,0x009d3a64
009d3a28	ldr w9,[x8]
009d3a2c	cmp w9,#0x304
009d3a30	b.eq 0x009d3b68
009d3a34	mov x0,x8
009d3a38	bl 0x00c32870
009d3a3c	bl 0x00c342a0
009d3a40	adrp x0,0x2bf000
009d3a44	adrp x2,0x2d7000
009d3a48	add x0,x0,#0x967
009d3a4c	add x2,x2,#0xac2
009d3a50	mov w1,#0x2f8
009d3a54	bl 0x00c342b0
009d3a58	mov w1,#0x50
009d3a5c	mov w2,#0xdb
009d3a60	b 0x009d3c4c
009d3a64	ldr x21,[x19, #0x988]
009d3a68	cbz x21,0x009d3b68
009d3a6c	add x0,sp,#0x22c
009d3a70	mov w2,#0x101
009d3a74	mov w1,wzr
009d3a78	bl 0x00c301c0
009d3a7c	add x2,sp,#0x22c
009d3a80	mov w3,#0x100
009d3a84	add x4,sp,#0x10
009d3a88	mov w5,#0x200
009d3a8c	mov x0,x19
009d3a90	mov x1,xzr
009d3a94	blr x21
009d3a98	cmp w0,#0x201
009d3a9c	b.cc 0x009d3ac4
009d3aa0	bl 0x00c342a0
009d3aa4	adrp x0,0x2bf000
009d3aa8	adrp x2,0x2d7000
009d3aac	add x0,x0,#0x967
009d3ab0	add x2,x2,#0xac2
009d3ab4	mov w1,#0x306
009d3ab8	bl 0x00c342b0
009d3abc	mov w1,#0x28
009d3ac0	b 0x009d3c44
009d3ac4	mov w21,w0
009d3ac8	cbz w21,0x009d3b68
009d3acc	mov w8,#0x113
009d3ad0	add x0,sp,#0x22c
009d3ad4	strh w8,[sp, #0xc]
009d3ad8	add x22,sp,#0x22c
009d3adc	bl 0x00c2ff50
009d3ae0	cmp x0,#0x101
009d3ae4	str x0,[x23, #0x8]
009d3ae8	b.cc 0x009d3b08
009d3aec	bl 0x00c342a0
009d3af0	adrp x0,0x2bf000
009d3af4	adrp x2,0x2d7000
009d3af8	add x0,x0,#0x967
009d3afc	add x2,x2,#0xac2
009d3b00	mov w1,#0x30e
009d3b04	b 0x009d3c3c
009d3b08	add x1,sp,#0xc
009d3b0c	mov x0,x19
009d3b10	str x22,[x23, #0x10]
009d3b14	bl 0x00c351e0
009d3b18	cbz x0,0x009d3da8
009d3b1c	mov x22,x0
009d3b20	bl 0x00c360a0
009d3b24	str x0,[x23]
009d3b28	cbz x0,0x009d3ce8
009d3b2c	add x1,sp,#0x10
009d3b30	mov x2,x21
009d3b34	bl 0x00c359e0
009d3b38	cbz w0,0x009d3ce8
009d3b3c	ldr x0,[x23]
009d3b40	mov x1,x22
009d3b44	bl 0x00c360b0
009d3b48	cbz w0,0x009d3ce8
009d3b4c	ldr x0,[x23]
009d3b50	mov w1,#0x304
009d3b54	bl 0x00c360c0
009d3b58	cbz w0,0x009d3ce8
009d3b5c	add x0,sp,#0x10
009d3b60	mov x1,x21
009d3b64	bl 0x00c34750
009d3b68	ldr x0,[x19, #0x920]
009d3b6c	bl 0x00c32870
009d3b70	ldr x8,[x23]
009d3b74	str x8,[x19, #0x920]
009d3b78	cbz x8,0x009d3bb4
009d3b7c	ldr x0,[x19, #0x928]
009d3b80	adrp x21,0x2bf000
009d3b84	add x21,x21,#0x967
009d3b88	mov w2,#0x32e
009d3b8c	mov x1,x21
009d3b90	bl 0x00c32310
009d3b94	ldp x1,x0,[x23, #0x8]
009d3b98	mov w3,#0x32f
009d3b9c	mov x2,x21
009d3ba0	bl 0x00c345f0
009d3ba4	str x0,[x19, #0x928]
009d3ba8	cbz x0,0x009d3c20
009d3bac	ldr x8,[x23, #0x8]
009d3bb0	str x8,[x19, #0x930]
009d3bb4	ldr w8,[x19, #0x84]
009d3bb8	cmp w8,#0x2
009d3bbc	b.ne 0x009d3cdc
009d3bc0	ldr x8,[x19, #0x918]
009d3bc4	ldr x10,[x23]
009d3bc8	ldr w9,[x8, #0x354]
009d3bcc	cbz w9,0x009d3cd0
009d3bd0	cmp w9,#0x0
009d3bd4	csel x21,x10,x8,eq
009d3bd8	ldr w8,[x21, #0x354]
009d3bdc	str w8,[x19, #0x1d40]
009d3be0	ldr x1,[x21, #0x330]
009d3be4	cbz x1,0x009d3c74
009d3be8	ldr x0,[x19, #0xa58]
009d3bec	cbz x0,0x009d3bf8
009d3bf0	bl 0x00c301f0
009d3bf4	cbz w0,0x009d3c74
009d3bf8	bl 0x00c342a0
009d3bfc	adrp x0,0x2bf000
009d3c00	adrp x2,0x2d7000
009d3c04	add x0,x0,#0x967
009d3c08	add x2,x2,#0xac2
009d3c0c	mov w1,#0x346
009d3c10	bl 0x00c342b0
009d3c14	mov w1,#0x50
009d3c18	mov w2,#0xe7
009d3c1c	b 0x009d3c4c
009d3c20	str xzr,[x19, #0x930]
009d3c24	bl 0x00c342a0
009d3c28	adrp x0,0x2bf000
009d3c2c	adrp x2,0x2d7000
009d3c30	add x0,x0,#0x967
009d3c34	add x2,x2,#0xac2
009d3c38	mov w1,#0x332
009d3c3c	bl 0x00c342b0
009d3c40	mov w1,#0x50
009d3c44	mov w2,#0x103
009d3c48	movk w2,#0xc, LSL #16
009d3c4c	mov x0,x19
009d3c50	mov x3,xzr
009d3c54	bl 0x00c34410
009d3c58	mov w0,wzr
009d3c5c	add sp,sp,#0x330
009d3c60	ldp x29,x30,[sp, #0x30]
009d3c64	ldp x20,x19,[sp, #0x20]
009d3c68	ldp x22,x21,[sp, #0x10]
009d3c6c	ldp x28,x23,[sp], #0x40
009d3c70	ret
009d3c74	ldr x0,[x19, #0xb08]
009d3c78	ldr x8,[x21, #0x358]
009d3c7c	cbz x0,0x009d3d2c
009d3c80	cbz x8,0x009d3d4c
009d3c84	ldr x22,[x19, #0xb10]
009d3c88	tbnz x22,#0x3f,0x009d3dec
009d3c8c	cbz x22,0x009d3dc4
009d3c90	ldrb w2,[x0], #0x1
009d3c94	sub x8,x22,#0x1
009d3c98	subs x22,x8,x2
009d3c9c	b.cc 0x009d3dc4
009d3ca0	ldr x9,[x21, #0x360]
009d3ca4	mov w8,wzr
009d3ca8	add x23,x0,x2
009d3cac	cmp x9,x2
009d3cb0	b.ne 0x009d3cc4
009d3cb4	ldr x1,[x21, #0x358]
009d3cb8	bl 0x00c362f0
009d3cbc	cmp w0,#0x0
009d3cc0	cset w8,eq
009d3cc4	mov x0,x23
009d3cc8	cbz w8,0x009d3c8c
009d3ccc	b 0x009d3d4c
009d3cd0	cbz x10,0x009d3cdc
009d3cd4	ldr w11,[x10, #0x354]
009d3cd8	cbnz w11,0x009d3bd0
009d3cdc	str wzr,[x19, #0x1d40]
009d3ce0	mov w0,#0x2
009d3ce4	b 0x009d3c5c
009d3ce8	bl 0x00c342a0
009d3cec	adrp x0,0x2bf000
009d3cf0	adrp x2,0x2d7000
009d3cf4	add x0,x0,#0x967
009d3cf8	add x2,x2,#0xac2
009d3cfc	mov w1,#0x322
009d3d00	bl 0x00c342b0
009d3d04	mov w2,#0x103
009d3d08	mov w1,#0x50
009d3d0c	movk w2,#0xc, LSL #16
009d3d10	mov x0,x19
009d3d14	mov x3,xzr
009d3d18	bl 0x00c34410
009d3d1c	add x0,sp,#0x10
009d3d20	mov x1,x21
009d3d24	bl 0x00c34750
009d3d28	b 0x009d3c58
009d3d2c	cbz x8,0x009d3d4c
009d3d30	bl 0x00c342a0
009d3d34	adrp x0,0x2bf000
009d3d38	adrp x2,0x2d7000
009d3d3c	add x0,x0,#0x967
009d3d40	add x2,x2,#0xac2
009d3d44	mov w1,#0x34c
009d3d48	b 0x009d3ddc
009d3d4c	mov w1,#0x2a
009d3d50	mov w2,#0x2
009d3d54	mov x0,x20
009d3d58	bl 0x00c343a0
009d3d5c	cbz w0,0x009d3d8c
009d3d60	mov w1,#0x2
009d3d64	mov x0,x20
009d3d68	bl 0x00c343b0
009d3d6c	cbz w0,0x009d3d8c
009d3d70	mov x0,x20
009d3d74	bl 0x00c34350
009d3d78	cbz w0,0x009d3d8c
009d3d7c	movi v0.2S,#0x1
009d3d80	mov w0,#0x1
009d3d84	str d0,[x19, #0xb30]
009d3d88	b 0x009d3c5c
009d3d8c	bl 0x00c342a0
009d3d90	adrp x0,0x2bf000
009d3d94	adrp x2,0x2d7000
009d3d98	add x0,x0,#0x967
009d3d9c	add x2,x2,#0xac2
009d3da0	mov w1,#0x36d
009d3da4	b 0x009d3c3c
009d3da8	bl 0x00c342a0
009d3dac	adrp x0,0x2bf000
009d3db0	adrp x2,0x2d7000
009d3db4	add x0,x0,#0x967
009d3db8	add x2,x2,#0xac2
009d3dbc	mov w1,#0x319
009d3dc0	b 0x009d3c3c
009d3dc4	bl 0x00c342a0
009d3dc8	adrp x0,0x2bf000
009d3dcc	adrp x2,0x2d7000
009d3dd0	add x0,x0,#0x967
009d3dd4	add x2,x2,#0xac2
009d3dd8	mov w1,#0x365
009d3ddc	bl 0x00c342b0
009d3de0	mov w1,#0x50
009d3de4	mov w2,#0xde
009d3de8	b 0x009d3c4c
009d3dec	bl 0x00c342a0
009d3df0	adrp x0,0x2bf000
009d3df4	adrp x2,0x2d7000
009d3df8	add x0,x0,#0x967
009d3dfc	add x2,x2,#0xac2
009d3e00	mov w1,#0x359
009d3e04	b 0x009d3c3c
