; tls_setup_handshake @ 009e29a4
009e29a4	stp x24,x23,[sp, #-0x40]!
009e29a8	stp x22,x21,[sp, #0x10]
009e29ac	stp x20,x19,[sp, #0x20]
009e29b0	stp x29,x30,[sp, #0x30]
009e29b4	add x29,sp,#0x30
009e29b8	mov x19,x0
009e29bc	bl 0x00c345d0
009e29c0	cbz w0,0x009e2c90
009e29c4	add x8,x19,#0xa28
009e29c8	movi v0.2D,#0x0
009e29cc	str q0,[x8]
009e29d0	ldr x8,[x19, #0x8]
009e29d4	strh wzr,[x19, #0xa40]
009e29d8	str xzr,[x19, #0xa38]
009e29dc	ldr w8,[x8]
009e29e0	cmp w8,#0x10, LSL #12
009e29e4	b.eq 0x009e2a08
009e29e8	orr w9,wzr,#0x1ffff
009e29ec	cmp w8,w9
009e29f0	b.ne 0x009e2ab4
009e29f4	adrp x8,0xc58000
009e29f8	add x8,x8,#0x828
009e29fc	ldr w9,[x8]
009e2a00	cbnz w9,0x009e2a18
009e2a04	b 0x009e2a84
009e2a08	adrp x8,0xc58000
009e2a0c	add x8,x8,#0x798
009e2a10	ldr w9,[x8]
009e2a14	cbz w9,0x009e2a84
009e2a18	mov w21,wzr
009e2a1c	mov w22,wzr
009e2a20	add x23,x8,#0x18
009e2a24	mov w24,#0x1
009e2a28	ldur x8,[x23, #-0x10]
009e2a2c	cbz x8,0x009e2a58
009e2a30	blr x8
009e2a34	mov x20,x0
009e2a38	mov x0,x19
009e2a3c	mov x1,x20
009e2a40	bl 0x009e4f38
009e2a44	cbz w0,0x009e2a68
009e2a48	mov w24,#0x1
009e2a4c	ldr w8,[x23], #0x18
009e2a50	cbnz w8,0x009e2a28
009e2a54	b 0x009e2a80
009e2a58	mov w24,#0x1
009e2a5c	ldr w8,[x23], #0x18
009e2a60	cbnz w8,0x009e2a28
009e2a64	b 0x009e2a80
009e2a68	ldr w21,[x20]
009e2a6c	cmp w24,#0x0
009e2a70	mov w24,wzr
009e2a74	csel w22,w22,w21,eq
009e2a78	ldr w8,[x23], #0x18
009e2a7c	cbnz w8,0x009e2a28
009e2a80	cbnz w22,0x009e2abc
009e2a84	bl 0x00c342a0
009e2a88	adrp x0,0x2bb000
009e2a8c	adrp x2,0x2af000
009e2a90	add x0,x0,#0x912
009e2a94	add x2,x2,#0xbdb
009e2a98	mov w1,#0x68
009e2a9c	bl 0x00c342b0
009e2aa0	mov w1,#0x46
009e2aa4	mov w2,#0xbf
009e2aa8	mov x0,x19
009e2aac	mov x3,xzr
009e2ab0	b 0x009e2c88
009e2ab4	ldr w21,[x19]
009e2ab8	mov w22,w21
009e2abc	ldr x8,[x19, #0x9a8]
009e2ac0	ldr x8,[x8, #0x588]
009e2ac4	cbz x8,0x009e2b9c
009e2ac8	ldr w8,[x19, #0x38]
009e2acc	cbz w8,0x009e2bc4
009e2ad0	mov x0,x19
009e2ad4	bl 0x00c35380
009e2ad8	mov x20,x0
009e2adc	bl 0x00c325e0
009e2ae0	cmp w0,#0x1
009e2ae4	b.lt 0x009e2b6c
009e2ae8	cmp w22,#0x100
009e2aec	orr w23,wzr,#0xff00
009e2af0	mov w21,wzr
009e2af4	csel w24,w23,w22,eq
009e2af8	mov x0,x20
009e2afc	mov w1,w21
009e2b00	bl 0x00c32610
009e2b04	ldr x8,[x19, #0x8]
009e2b08	ldr x8,[x8, #0xc0]
009e2b0c	ldrb w8,[x8, #0x60]
009e2b10	tbnz w8,#0x3,0x009e2b30
009e2b14	ldr w8,[x0, #0x2c]
009e2b18	cmp w22,w8
009e2b1c	b.lt 0x009e2b58
009e2b20	ldr w8,[x0, #0x30]
009e2b24	cmp w22,w8
009e2b28	b.gt 0x009e2b58
009e2b2c	b 0x009e2ce8
009e2b30	ldr w8,[x0, #0x34]
009e2b34	cmp w8,#0x100
009e2b38	csel w8,w23,w8,eq
009e2b3c	cmp w24,w8
009e2b40	b.gt 0x009e2b58
009e2b44	ldr w8,[x0, #0x38]
009e2b48	cmp w8,#0x100
009e2b4c	csel w8,w23,w8,eq
009e2b50	cmp w24,w8
009e2b54	b.ge 0x009e2ce8
009e2b58	mov x0,x20
009e2b5c	add w21,w21,#0x1
009e2b60	bl 0x00c325e0
009e2b64	cmp w21,w0
009e2b68	b.lt 0x009e2af8
009e2b6c	bl 0x00c342a0
009e2b70	adrp x0,0x2bb000
009e2b74	adrp x2,0x2af000
009e2b78	add x0,x0,#0x912
009e2b7c	add x2,x2,#0xbdb
009e2b80	mov w1,#0xaa
009e2b84	bl 0x00c342b0
009e2b88	adrp x3,0x2c1000
009e2b8c	add x3,x3,#0x8cc
009e2b90	mov w1,#0x28
009e2b94	mov w2,#0xb5
009e2b98	b 0x009e2c84
009e2b9c	ldr x8,[x19, #0x8]
009e2ba0	ldr x8,[x8, #0xc0]
009e2ba4	ldrb w8,[x8, #0x60]
009e2ba8	tbnz w8,#0x3,0x009e2bf0
009e2bac	cmp w22,#0x302
009e2bb0	b.le 0x009e2c58
009e2bb4	cmp w21,#0x302
009e2bb8	b.gt 0x009e2ac8
009e2bbc	mov w2,#0x303
009e2bc0	b 0x009e2c18
009e2bc4	ldr x8,[x19, #0x240]
009e2bc8	cbz x8,0x009e2ca4
009e2bcc	ldr x8,[x19, #0x2c8]
009e2bd0	cbz x8,0x009e2ca4
009e2bd4	ldr x8,[x19, #0xb88]
009e2bd8	add x8,x8,#0x7c
009e2bdc	ldxr w9,[x8]
009e2be0	add w9,w9,#0x1
009e2be4	stxr w10,w9,[x8]
009e2be8	cbnz w10,0x009e2bdc
009e2bec	b 0x009e2cbc
009e2bf0	cmp w22,#0x100
009e2bf4	b.eq 0x009e2c58
009e2bf8	mov w8,#0xfefe
009e2bfc	cmp w22,w8
009e2c00	b.gt 0x009e2c58
009e2c04	cmp w21,#0x100
009e2c08	mov w2,#0xfefd
009e2c0c	b.eq 0x009e2c18
009e2c10	cmp w21,w2
009e2c14	b.le 0x009e2ac8
009e2c18	mov w1,#0x7b
009e2c1c	mov x0,x19
009e2c20	mov x3,xzr
009e2c24	bl 0x00c328a0
009e2c28	cbnz w0,0x009e2ac8
009e2c2c	bl 0x00c342a0
009e2c30	adrp x0,0x2bb000
009e2c34	adrp x2,0x2af000
009e2c38	add x0,x0,#0x912
009e2c3c	add x2,x2,#0xbdb
009e2c40	mov w1,#0x8d
009e2c44	bl 0x00c342b0
009e2c48	mov w2,#0x103
009e2c4c	mov w1,#0x28
009e2c50	movk w2,#0xc, LSL #16
009e2c54	b 0x009e2aa8
009e2c58	bl 0x00c342a0
009e2c5c	adrp x0,0x2bb000
009e2c60	adrp x2,0x2af000
009e2c64	add x0,x0,#0x912
009e2c68	add x2,x2,#0xbdb
009e2c6c	mov w1,#0x79
009e2c70	bl 0x00c342b0
009e2c74	adrp x3,0x2c1000
009e2c78	add x3,x3,#0x901
009e2c7c	mov w1,#0x28
009e2c80	mov w2,#0x129
009e2c84	mov x0,x19
009e2c88	bl 0x00c34410
009e2c8c	mov w0,wzr
009e2c90	ldp x29,x30,[sp, #0x30]
009e2c94	ldp x20,x19,[sp, #0x20]
009e2c98	ldp x22,x21,[sp, #0x10]
009e2c9c	ldp x24,x23,[sp], #0x40
009e2ca0	ret
009e2ca4	ldr x8,[x19, #0xb88]
009e2ca8	add x8,x8,#0x78
009e2cac	ldxr w9,[x8]
009e2cb0	add w9,w9,#0x1
009e2cb4	stxr w10,w9,[x8]
009e2cb8	cbnz w10,0x009e2cac
009e2cbc	ldr x8,[x19, #0x8]
009e2cc0	movi v0.2D,#0x0
009e2cc4	stp q0,q0,[x19, #0x160]
009e2cc8	str wzr,[x19, #0x4d0]
009e2ccc	str wzr,[x19, #0x2f0]
009e2cd0	ldr x8,[x8, #0xc0]
009e2cd4	mov w0,#0x1
009e2cd8	ldrb w8,[x8, #0x60]
009e2cdc	tbz w8,#0x3,0x009e2c90
009e2ce0	str w0,[x19, #0x78]
009e2ce4	b 0x009e2c90
009e2ce8	ldr x8,[x19, #0x240]
009e2cec	cbz x8,0x009e2d1c
009e2cf0	ldr x8,[x19, #0x2c8]
009e2cf4	cbz x8,0x009e2d1c
009e2cf8	ldr x8,[x19, #0x9a8]
009e2cfc	add x8,x8,#0x88
009e2d00	ldxr w9,[x8]
009e2d04	add w9,w9,#0x1
009e2d08	stxr w10,w9,[x8]
009e2d0c	cbnz w10,0x009e2d00
009e2d10	str wzr,[x19, #0x348]
009e2d14	mov w0,#0x1
009e2d18	b 0x009e2c90
009e2d1c	ldr x8,[x19, #0xb88]
009e2d20	mov w0,#0x1
009e2d24	add x8,x8,#0x84
009e2d28	ldxr w9,[x8]
009e2d2c	add w9,w9,#0x1
009e2d30	stxr w10,w9,[x8]
009e2d34	cbnz w10,0x009e2d28
009e2d38	b 0x009e2c90
