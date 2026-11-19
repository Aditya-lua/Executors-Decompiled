; srp_generate_client_master_secret @ 009c8a44
009c8a44	str x25,[sp, #-0x50]!
009c8a48	stp x24,x23,[sp, #0x10]
009c8a4c	stp x22,x21,[sp, #0x20]
009c8a50	stp x20,x19,[sp, #0x30]
009c8a54	stp x29,x30,[sp, #0x40]
009c8a58	mov x20,x0
009c8a5c	ldr x0,[x0, #0xc10]
009c8a60	ldr x1,[x20, #0xbf8]
009c8a64	add x29,sp,#0x40
009c8a68	bl 0x00c36a40
009c8a6c	cbz w0,0x009c8b60
009c8a70	ldr x8,[x20, #0x9a8]
009c8a74	ldr x0,[x20, #0xc18]
009c8a78	ldr x1,[x20, #0xc10]
009c8a7c	ldr x2,[x20, #0xbf8]
009c8a80	ldr x3,[x8]
009c8a84	ldr x4,[x8, #0x440]
009c8a88	bl 0x00c36a10
009c8a8c	mov x19,x0
009c8a90	cbz x0,0x009c8b64
009c8a94	ldr x8,[x20, #0xbe8]
009c8a98	cbz x8,0x009c8b64
009c8a9c	ldr x1,[x20, #0xbd0]
009c8aa0	mov x0,x20
009c8aa4	blr x8
009c8aa8	mov x21,x0
009c8aac	cbz x0,0x009c8c38
009c8ab0	ldr x8,[x20, #0x9a8]
009c8ab4	ldr x0,[x20, #0xc08]
009c8ab8	ldr x1,[x20, #0xbf0]
009c8abc	mov x2,x21
009c8ac0	ldr x3,[x8]
009c8ac4	ldr x4,[x8, #0x440]
009c8ac8	bl 0x00c36a20
009c8acc	mov x22,x0
009c8ad0	cbz x0,0x009c8c00
009c8ad4	ldr x8,[x20, #0x9a8]
009c8ad8	ldr x0,[x20, #0xbf8]
009c8adc	ldr x1,[x20, #0xc10]
009c8ae0	ldr x2,[x20, #0xc00]
009c8ae4	ldr x4,[x20, #0xc20]
009c8ae8	ldr x6,[x8]
009c8aec	ldr x7,[x8, #0x440]
009c8af0	mov x3,x22
009c8af4	mov x5,x19
009c8af8	bl 0x00c369f0
009c8afc	cbz x0,0x009c8c00
009c8b00	mov x23,x0
009c8b04	bl 0x00c322f0
009c8b08	add w8,w0,#0x7
009c8b0c	add w9,w0,#0xe
009c8b10	cmp w8,#0x0
009c8b14	csel w8,w9,w8,lt
009c8b18	sbfx x24,x8,#0x3,#0x1d
009c8b1c	adrp x1,0x2af000
009c8b20	add x1,x1,#0xb86
009c8b24	mov w2,#0x16f
009c8b28	mov x0,x24
009c8b2c	bl 0x00c32320
009c8b30	cbz x0,0x009c8c78
009c8b34	mov x25,x0
009c8b38	mov x0,x23
009c8b3c	mov x1,x25
009c8b40	bl 0x00c36980
009c8b44	mov w3,#0x1
009c8b48	mov x0,x20
009c8b4c	mov x1,x25
009c8b50	mov x2,x24
009c8b54	bl 0x00c349b0
009c8b58	mov w20,w0
009c8b5c	b 0x009c8ba8
009c8b60	mov x19,xzr
009c8b64	bl 0x00c342a0
009c8b68	adrp x0,0x2af000
009c8b6c	adrp x2,0x2a7000
009c8b70	add x0,x0,#0xb86
009c8b74	add x2,x2,#0xb71
009c8b78	mov w1,#0x15a
009c8b7c	bl 0x00c342b0
009c8b80	mov w2,#0x103
009c8b84	mov w1,#0x50
009c8b88	movk w2,#0xc, LSL #16
009c8b8c	mov x0,x20
009c8b90	mov x3,xzr
009c8b94	bl 0x00c34410
009c8b98	mov x22,xzr
009c8b9c	mov x23,xzr
009c8ba0	mov w20,wzr
009c8ba4	mov x21,xzr
009c8ba8	mov x0,x23
009c8bac	bl 0x00c322e0
009c8bb0	mov x0,x22
009c8bb4	bl 0x00c322e0
009c8bb8	cbz x21,0x009c8bdc
009c8bbc	mov x0,x21
009c8bc0	bl 0x00c2ff50
009c8bc4	adrp x2,0x2af000
009c8bc8	mov x1,x0
009c8bcc	add x2,x2,#0xb86
009c8bd0	mov w3,#0x17a
009c8bd4	mov x0,x21
009c8bd8	bl 0x00c345e0
009c8bdc	mov x0,x19
009c8be0	bl 0x00c322e0
009c8be4	mov w0,w20
009c8be8	ldp x29,x30,[sp, #0x40]
009c8bec	ldp x20,x19,[sp, #0x30]
009c8bf0	ldp x22,x21,[sp, #0x20]
009c8bf4	ldp x24,x23,[sp, #0x10]
009c8bf8	ldr x25,[sp], #0x50
009c8bfc	ret
009c8c00	bl 0x00c342a0
009c8c04	adrp x0,0x2af000
009c8c08	adrp x2,0x2a7000
009c8c0c	add x0,x0,#0xb86
009c8c10	add x2,x2,#0xb71
009c8c14	mov w1,#0x16a
009c8c18	bl 0x00c342b0
009c8c1c	mov w2,#0x103
009c8c20	mov w1,#0x50
009c8c24	movk w2,#0xc, LSL #16
009c8c28	mov x0,x20
009c8c2c	mov x3,xzr
009c8c30	bl 0x00c34410
009c8c34	b 0x009c8c6c
009c8c38	bl 0x00c342a0
009c8c3c	adrp x0,0x2af000
009c8c40	adrp x2,0x2a7000
009c8c44	add x0,x0,#0xb86
009c8c48	add x2,x2,#0xb71
009c8c4c	mov w1,#0x160
009c8c50	bl 0x00c342b0
009c8c54	mov w1,#0x50
009c8c58	mov w2,#0xea
009c8c5c	mov x0,x20
009c8c60	mov x3,xzr
009c8c64	bl 0x00c34410
009c8c68	mov x22,xzr
009c8c6c	mov x23,xzr
009c8c70	mov w20,wzr
009c8c74	b 0x009c8ba8
009c8c78	bl 0x00c342a0
009c8c7c	adrp x0,0x2af000
009c8c80	adrp x2,0x2a7000
009c8c84	add x0,x0,#0xb86
009c8c88	add x2,x2,#0xb71
009c8c8c	mov w1,#0x170
009c8c90	bl 0x00c342b0
009c8c94	mov w8,#0x103
009c8c98	movk w8,#0xc, LSL #16
009c8c9c	sub w2,w8,#0x3
009c8ca0	mov w1,#0x50
009c8ca4	mov x0,x20
009c8ca8	mov x3,xzr
009c8cac	bl 0x00c34410
009c8cb0	mov w20,wzr
009c8cb4	b 0x009c8ba8
