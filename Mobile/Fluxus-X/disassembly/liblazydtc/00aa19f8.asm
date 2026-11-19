; ossl_provider_init_as_child @ 00aa19f8
00aa19f8	stp x22,x21,[sp, #-0x30]!
00aa19fc	stp x20,x19,[sp, #0x10]
00aa1a00	stp x29,x30,[sp, #0x20]
00aa1a04	add x29,sp,#0x20
00aa1a08	cbz x0,0x00aa1b54
00aa1a0c	mov x21,x2
00aa1a10	adrp x2,0xc6d000
00aa1a14	mov x22,x1
00aa1a18	add x2,x2,#0x498
00aa1a1c	mov w1,#0x12
00aa1a20	mov x19,x0
00aa1a24	bl 0x00c3b520
00aa1a28	cbz x0,0x00aa1b54
00aa1a2c	mov x8,x0
00aa1a30	adrp x17,0x76e000
00aa1a34	mov x20,x0
00aa1a38	add x13,x0,#0x18
00aa1a3c	add x11,x0,#0x20
00aa1a40	add x15,x0,#0x28
00aa1a44	add x14,x0,#0x30
00aa1a48	add x12,x0,#0x38
00aa1a4c	add x10,x0,#0x40
00aa1a50	add x9,x0,#0x48
00aa1a54	add x16,x21,#0x8
00aa1a58	str x22,[x8], #0x50
00aa1a5c	add x17,x17,#0x95c
00aa1a60	b 0x00aa1a68
00aa1a64	add x16,x16,#0x10
00aa1a68	ldur w0,[x16, #-0x8]
00aa1a6c	sub w18,w0,#0x69
00aa1a70	cmp w18,#0x6
00aa1a74	b.hi 0x00aa1a8c
00aa1a78	ldrsw x18,[x17, x18, LSL #0x2]
00aa1a7c	add x18,x18,x17
00aa1a80	br x18
00aa1a84	mov x18,x11
00aa1a88	b 0x00aa1acc
00aa1a8c	cmp w0,#0x4
00aa1a90	mov x18,x13
00aa1a94	b.eq 0x00aa1acc
00aa1a98	cbnz w0,0x00aa1a64
00aa1a9c	b 0x00aa1ad8
00aa1aa0	mov x18,x15
00aa1aa4	b 0x00aa1acc
00aa1aa8	mov x18,x14
00aa1aac	b 0x00aa1acc
00aa1ab0	mov x18,x12
00aa1ab4	b 0x00aa1acc
00aa1ab8	mov x18,x10
00aa1abc	b 0x00aa1acc
00aa1ac0	mov x18,x9
00aa1ac4	b 0x00aa1acc
00aa1ac8	mov x18,x8
00aa1acc	ldr x0,[x16]
00aa1ad0	str x0,[x18]
00aa1ad4	b 0x00aa1a64
00aa1ad8	ldr x13,[x13]
00aa1adc	cbz x13,0x00aa1b50
00aa1ae0	ldr x11,[x11]
00aa1ae4	cbz x11,0x00aa1b50
00aa1ae8	ldr x11,[x14]
00aa1aec	cbz x11,0x00aa1b50
00aa1af0	ldr x11,[x12]
00aa1af4	cbz x11,0x00aa1b50
00aa1af8	ldr x10,[x10]
00aa1afc	cbz x10,0x00aa1b50
00aa1b00	ldr x9,[x9]
00aa1b04	cbz x9,0x00aa1b50
00aa1b08	ldr x8,[x8]
00aa1b0c	cbz x8,0x00aa1b50
00aa1b10	bl 0x00c34d50
00aa1b14	str x0,[x20, #0x10]
00aa1b18	cbz x0,0x00aa1b54
00aa1b1c	ldr x8,[x20, #0x20]
00aa1b20	ldr x0,[x20]
00aa1b24	adrp x1,0xaa1000
00aa1b28	adrp x2,0xaa1000
00aa1b2c	adrp x3,0xaa1000
00aa1b30	add x1,x1,#0xb64
00aa1b34	add x2,x2,#0xc88
00aa1b38	add x3,x3,#0xd08
00aa1b3c	mov x4,x19
00aa1b40	blr x8
00aa1b44	cmp w0,#0x0
00aa1b48	cset w0,ne
00aa1b4c	b 0x00aa1b54
00aa1b50	mov w0,wzr
00aa1b54	ldp x29,x30,[sp, #0x20]
00aa1b58	ldp x20,x19,[sp, #0x10]
00aa1b5c	ldp x22,x21,[sp], #0x30
00aa1b60	ret
