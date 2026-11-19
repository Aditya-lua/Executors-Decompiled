; tls_parse_ctos_server_name @ 009d696c
009d696c	stp x22,x21,[sp, #-0x30]!
009d6970	stp x20,x19,[sp, #0x10]
009d6974	stp x29,x30,[sp, #0x20]
009d6978	ldr x8,[x1, #0x8]
009d697c	mov x19,x0
009d6980	add x29,sp,#0x20
009d6984	subs x10,x8,#0x2
009d6988	b.cc 0x009d6a34
009d698c	ldr x8,[x1]
009d6990	ldrb w11,[x8]
009d6994	ldrb w9,[x8, #0x1]
009d6998	bfm x9,x11,#0x38,#0x7
009d699c	cmp x10,x9
009d69a0	b.ne 0x009d6a34
009d69a4	add x10,x8,#0x2
009d69a8	add x11,x10,x9
009d69ac	stp x11,xzr,[x1]
009d69b0	cbz x9,0x009d6a34
009d69b4	sub x11,x9,#0x1
009d69b8	cmp x11,#0x2
009d69bc	b.cc 0x009d6a78
009d69c0	ldrb w10,[x10]
009d69c4	cbnz w10,0x009d6a78
009d69c8	ldrb w10,[x8, #0x3]
009d69cc	ldrb w20,[x8, #0x4]
009d69d0	sub x9,x9,#0x3
009d69d4	bfm x20,x10,#0x38,#0x7
009d69d8	cmp x9,x20
009d69dc	b.ne 0x009d6a78
009d69e0	ldr w9,[x19, #0x4d0]
009d69e4	add x21,x8,#0x5
009d69e8	cbz w9,0x009d6a10
009d69ec	ldr x8,[x19, #0x8]
009d69f0	ldr x9,[x8, #0xc0]
009d69f4	ldrb w9,[x9, #0x60]
009d69f8	tbnz w9,#0x3,0x009d6a94
009d69fc	ldr w8,[x8]
009d6a00	cmp w8,#0x304
009d6a04	b.lt 0x009d6a94
009d6a08	cmp w8,#0x10, LSL #12
009d6a0c	b.eq 0x009d6a94
009d6a10	cmp x20,#0x100
009d6a14	b.cc 0x009d6ad0
009d6a18	bl 0x00c342a0
009d6a1c	adrp x0,0x2d7000
009d6a20	adrp x2,0x2a3000
009d6a24	add x0,x0,#0xae0
009d6a28	add x2,x2,#0xd3a
009d6a2c	mov w1,#0x83
009d6a30	b 0x009d6afc
009d6a34	bl 0x00c342a0
009d6a38	adrp x0,0x2d7000
009d6a3c	adrp x2,0x2a3000
009d6a40	add x0,x0,#0xae0
009d6a44	add x2,x2,#0xd3a
009d6a48	mov w1,#0x67
009d6a4c	bl 0x00c342b0
009d6a50	mov w1,#0x32
009d6a54	mov w2,#0x6e
009d6a58	mov x0,x19
009d6a5c	mov x3,xzr
009d6a60	bl 0x00c34410
009d6a64	mov w0,wzr
009d6a68	ldp x29,x30,[sp, #0x20]
009d6a6c	ldp x20,x19,[sp, #0x10]
009d6a70	ldp x22,x21,[sp], #0x30
009d6a74	ret
009d6a78	bl 0x00c342a0
009d6a7c	adrp x0,0x2d7000
009d6a80	adrp x2,0x2a3000
009d6a84	add x0,x0,#0xae0
009d6a88	add x2,x2,#0xd3a
009d6a8c	mov w1,#0x79
009d6a90	b 0x009d6a4c
009d6a94	ldr x8,[x19, #0x918]
009d6a98	ldr x22,[x8, #0x330]
009d6a9c	cbz x22,0x009d6b08
009d6aa0	mov x0,x22
009d6aa4	bl 0x00c2ff50
009d6aa8	cmp x20,x0
009d6aac	mov w8,wzr
009d6ab0	b.ne 0x009d6b0c
009d6ab4	mov x0,x21
009d6ab8	mov x1,x22
009d6abc	mov x2,x20
009d6ac0	bl 0x00c362f0
009d6ac4	cmp w0,#0x0
009d6ac8	cset w8,eq
009d6acc	b 0x009d6b0c
009d6ad0	mov x0,x21
009d6ad4	mov w1,wzr
009d6ad8	mov x2,x20
009d6adc	bl 0x00c300a0
009d6ae0	cbz x0,0x009d6b18
009d6ae4	bl 0x00c342a0
009d6ae8	adrp x0,0x2d7000
009d6aec	adrp x2,0x2a3000
009d6af0	add x0,x0,#0xae0
009d6af4	add x2,x2,#0xd3a
009d6af8	mov w1,#0x88
009d6afc	bl 0x00c342b0
009d6b00	orr w1,wzr,#0x70
009d6b04	b 0x009d6a54
009d6b08	mov w8,wzr
009d6b0c	mov w0,#0x1
009d6b10	str w8,[x19, #0xb60]
009d6b14	b 0x009d6a68
009d6b18	ldr x0,[x19, #0xa58]
009d6b1c	adrp x1,0x2d7000
009d6b20	add x1,x1,#0xae0
009d6b24	mov w2,#0x90
009d6b28	bl 0x00c32310
009d6b2c	adrp x22,0x2d1000
009d6b30	add x22,x22,#0x573
009d6b34	mov w2,#0x1e3
009d6b38	mov x0,xzr
009d6b3c	mov x1,x22
009d6b40	str xzr,[x19, #0xa58]
009d6b44	bl 0x00c32310
009d6b48	mov w3,#0x1e6
009d6b4c	mov x0,x21
009d6b50	mov x1,x20
009d6b54	mov x2,x22
009d6b58	bl 0x00c36180
009d6b5c	str x0,[x19, #0xa58]
009d6b60	cbz x0,0x009d6b70
009d6b64	mov w0,#0x1
009d6b68	str w0,[x19, #0xb60]
009d6b6c	b 0x009d6a68
009d6b70	bl 0x00c342a0
009d6b74	adrp x0,0x2d7000
009d6b78	adrp x2,0x2a3000
009d6b7c	add x0,x0,#0xae0
009d6b80	add x2,x2,#0xd3a
009d6b84	mov w1,#0x93
009d6b88	bl 0x00c342b0
009d6b8c	mov w2,#0x103
009d6b90	mov w1,#0x50
009d6b94	movk w2,#0xc, LSL #16
009d6b98	b 0x009d6a58
