; mbedtls_oid_get_ec_grp @ 00ba9a08
00ba9a08	str x21,[sp, #-0x30]!
00ba9a0c	stp x20,x19,[sp, #0x10]
00ba9a10	stp x29,x30,[sp, #0x20]
00ba9a14	add x29,sp,#0x20
00ba9a18	mov x19,x1
00ba9a1c	cbz x0,0x00ba9b80
00ba9a20	ldr x8,[x0, #0x8]
00ba9a24	cmp x8,#0x5
00ba9a28	b.eq 0x00ba9a88
00ba9a2c	cmp x8,#0x9
00ba9a30	b.eq 0x00ba9b2c
00ba9a34	cmp x8,#0x8
00ba9a38	b.ne 0x00ba9b80
00ba9a3c	ldr x9,[x0, #0x10]
00ba9a40	mov x10,#0x862a
00ba9a44	movk x10,#0xce48, LSL #16
00ba9a48	movk x10,#0x33d, LSL #32
00ba9a4c	ldr x8,[x9]
00ba9a50	movk x10,#0x101, LSL #48
00ba9a54	cmp x8,x10
00ba9a58	adrp x8,0xcab000
00ba9a5c	add x8,x8,#0x730
00ba9a60	b.eq 0x00ba9bc4
00ba9a64	ldr x9,[x9]
00ba9a68	mov x10,#0x862a
00ba9a6c	movk x10,#0xce48, LSL #16
00ba9a70	movk x10,#0x33d, LSL #32
00ba9a74	movk x10,#0x701, LSL #48
00ba9a78	cmp x9,x10
00ba9a7c	b.ne 0x00ba9b80
00ba9a80	add x8,x8,#0x50
00ba9a84	b 0x00ba9bc4
00ba9a88	ldr x20,[x0, #0x10]
00ba9a8c	adrp x0,0x788000
00ba9a90	add x0,x0,#0x37d
00ba9a94	mov w2,#0x5
00ba9a98	mov x1,x20
00ba9a9c	bl 0x00c300b0
00ba9aa0	adrp x21,0xcab000
00ba9aa4	add x21,x21,#0x730
00ba9aa8	cbz w0,0x00ba9b88
00ba9aac	adrp x0,0x788000
00ba9ab0	add x0,x0,#0x383
00ba9ab4	mov w2,#0x5
00ba9ab8	mov x1,x20
00ba9abc	bl 0x00c300b0
00ba9ac0	cbz w0,0x00ba9b98
00ba9ac4	adrp x0,0x788000
00ba9ac8	add x0,x0,#0x389
00ba9acc	mov w2,#0x5
00ba9ad0	mov x1,x20
00ba9ad4	bl 0x00c300b0
00ba9ad8	cbz w0,0x00ba9ba8
00ba9adc	adrp x0,0x788000
00ba9ae0	add x0,x0,#0x38f
00ba9ae4	mov w2,#0x5
00ba9ae8	mov x1,x20
00ba9aec	bl 0x00c300b0
00ba9af0	cbz w0,0x00ba9bb8
00ba9af4	adrp x0,0x788000
00ba9af8	add x0,x0,#0x395
00ba9afc	mov w2,#0x5
00ba9b00	mov x1,x20
00ba9b04	bl 0x00c300b0
00ba9b08	cbz w0,0x00ba9bc0
00ba9b0c	adrp x0,0x788000
00ba9b10	add x0,x0,#0x39b
00ba9b14	mov w2,#0x5
00ba9b18	mov x1,x20
00ba9b1c	bl 0x00c300b0
00ba9b20	cbnz w0,0x00ba9b80
00ba9b24	add x8,x21,#0x118
00ba9b28	b 0x00ba9bc4
00ba9b2c	ldr x20,[x0, #0x10]
00ba9b30	adrp x0,0x2a3000
00ba9b34	add x0,x0,#0x401
00ba9b38	mov w2,#0x9
00ba9b3c	mov x1,x20
00ba9b40	bl 0x00c300b0
00ba9b44	adrp x21,0xcab000
00ba9b48	add x21,x21,#0x730
00ba9b4c	cbz w0,0x00ba9b90
00ba9b50	adrp x0,0x2b8000
00ba9b54	add x0,x0,#0xc56
00ba9b58	mov w2,#0x9
00ba9b5c	mov x1,x20
00ba9b60	bl 0x00c300b0
00ba9b64	cbz w0,0x00ba9ba0
00ba9b68	adrp x0,0x2ac000
00ba9b6c	add x0,x0,#0xce5
00ba9b70	mov w2,#0x9
00ba9b74	mov x1,x20
00ba9b78	bl 0x00c300b0
00ba9b7c	cbz w0,0x00ba9bb0
00ba9b80	mov w0,#0xffffffd2
00ba9b84	b 0x00ba9bd0
00ba9b88	add x8,x21,#0x28
00ba9b8c	b 0x00ba9bc4
00ba9b90	add x8,x21,#0x140
00ba9b94	b 0x00ba9bc4
00ba9b98	add x8,x21,#0x78
00ba9b9c	b 0x00ba9bc4
00ba9ba0	add x8,x21,#0x168
00ba9ba4	b 0x00ba9bc4
00ba9ba8	add x8,x21,#0xa0
00ba9bac	b 0x00ba9bc4
00ba9bb0	add x8,x21,#0x190
00ba9bb4	b 0x00ba9bc4
00ba9bb8	add x8,x21,#0xc8
00ba9bbc	b 0x00ba9bc4
00ba9bc0	add x8,x21,#0xf0
00ba9bc4	ldr w8,[x8, #0x20]
00ba9bc8	mov w0,wzr
00ba9bcc	str w8,[x19]
00ba9bd0	ldp x29,x30,[sp, #0x20]
00ba9bd4	ldp x20,x19,[sp, #0x10]
00ba9bd8	ldr x21,[sp], #0x30
00ba9bdc	ret
