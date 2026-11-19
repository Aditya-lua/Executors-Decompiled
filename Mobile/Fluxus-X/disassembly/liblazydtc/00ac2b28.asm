; PKCS7_add_signer @ 00ac2b28
00ac2b28	stp x24,x23,[sp, #-0x40]!
00ac2b2c	stp x22,x21,[sp, #0x10]
00ac2b30	stp x20,x19,[sp, #0x20]
00ac2b34	stp x29,x30,[sp, #0x30]
00ac2b38	mov x20,x0
00ac2b3c	ldr x0,[x0, #0x18]
00ac2b40	add x29,sp,#0x30
00ac2b44	mov x19,x1
00ac2b48	bl 0x00c37750
00ac2b4c	cmp w0,#0x18
00ac2b50	b.eq 0x00ac2b5c
00ac2b54	cmp w0,#0x16
00ac2b58	b.ne 0x00ac2be4
00ac2b5c	ldr x9,[x20, #0x20]
00ac2b60	ldr x10,[x19, #0x10]
00ac2b64	add x8,x9,#0x20
00ac2b68	ldr x22,[x9, #0x8]!
00ac2b6c	ldr x21,[x8]
00ac2b70	ldr x23,[x10]
00ac2b74	mov x0,x22
00ac2b78	bl 0x00c325e0
00ac2b7c	cmp w0,#0x1
00ac2b80	b.lt 0x00ac2bb8
00ac2b84	mov w24,wzr
00ac2b88	mov x0,x22
00ac2b8c	mov w1,w24
00ac2b90	bl 0x00c32610
00ac2b94	ldr x1,[x0]
00ac2b98	mov x0,x23
00ac2b9c	bl 0x00c37ab0
00ac2ba0	cbz w0,0x00ac2c78
00ac2ba4	mov x0,x22
00ac2ba8	add w24,w24,#0x1
00ac2bac	bl 0x00c325e0
00ac2bb0	cmp w24,w0
00ac2bb4	b.lt 0x00ac2b88
00ac2bb8	bl 0x00c38250
00ac2bbc	mov x24,x0
00ac2bc0	cbz x0,0x00ac2c0c
00ac2bc4	bl 0x00c37a40
00ac2bc8	str x0,[x24, #0x8]
00ac2bcc	cbz x0,0x00ac2c0c
00ac2bd0	mov x0,x23
00ac2bd4	bl 0x00c37750
00ac2bd8	cbz w0,0x00ac2c4c
00ac2bdc	bl 0x00c37740
00ac2be0	b 0x00ac2c54
00ac2be4	bl 0x00c342a0
00ac2be8	adrp x0,0x2ce000
00ac2bec	adrp x2,0x2d6000
00ac2bf0	add x0,x0,#0x1ca
00ac2bf4	add x2,x2,#0x4ea
00ac2bf8	mov w1,#0xcf
00ac2bfc	bl 0x00c342b0
00ac2c00	mov w0,#0x21
00ac2c04	mov w1,#0x71
00ac2c08	b 0x00ac2c3c
00ac2c0c	mov x0,x24
00ac2c10	bl 0x00c38240
00ac2c14	bl 0x00c342a0
00ac2c18	adrp x0,0x2ce000
00ac2c1c	adrp x2,0x2d6000
00ac2c20	add x0,x0,#0x1ca
00ac2c24	add x2,x2,#0x4ea
00ac2c28	mov w1,#0xe3
00ac2c2c	bl 0x00c342b0
00ac2c30	mov w1,#0x100
00ac2c34	mov w0,#0x21
00ac2c38	movk w1,#0xc, LSL #16
00ac2c3c	mov x2,xzr
00ac2c40	bl 0x00c342c0
00ac2c44	mov w0,wzr
00ac2c48	b 0x00ac2c9c
00ac2c4c	mov x0,x23
00ac2c50	bl 0x00c37730
00ac2c54	ldr x8,[x24, #0x8]
00ac2c58	mov w9,#0x5
00ac2c5c	str x0,[x24]
00ac2c60	str w9,[x8]
00ac2c64	cbz x0,0x00ac2cb0
00ac2c68	mov x0,x22
00ac2c6c	mov x1,x24
00ac2c70	bl 0x00c347a0
00ac2c74	cbz w0,0x00ac2cb0
00ac2c78	add x8,x20,#0x28
00ac2c7c	cmp x20,#0x0
00ac2c80	csel x8,xzr,x8,eq
00ac2c84	mov x0,x21
00ac2c88	mov x1,x19
00ac2c8c	str x8,[x19, #0x40]
00ac2c90	bl 0x00c347a0
00ac2c94	cmp w0,#0x0
00ac2c98	cset w0,ne
00ac2c9c	ldp x29,x30,[sp, #0x30]
00ac2ca0	ldp x20,x19,[sp, #0x20]
00ac2ca4	ldp x22,x21,[sp, #0x10]
00ac2ca8	ldp x24,x23,[sp], #0x40
00ac2cac	ret
00ac2cb0	mov x0,x24
00ac2cb4	bl 0x00c38240
00ac2cb8	b 0x00ac2c44
