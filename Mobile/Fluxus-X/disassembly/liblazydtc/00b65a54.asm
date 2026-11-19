; ossl_cipher_generic_block_final @ 00b65a54
00b65a54	str x25,[sp, #-0x50]!
00b65a58	stp x24,x23,[sp, #0x10]
00b65a5c	stp x22,x21,[sp, #0x20]
00b65a60	stp x20,x19,[sp, #0x30]
00b65a64	stp x29,x30,[sp, #0x40]
00b65a68	ldr x21,[x0, #0x58]
00b65a6c	add x29,sp,#0x40
00b65a70	mov x23,x3
00b65a74	mov x19,x2
00b65a78	mov x22,x0
00b65a7c	mov x20,x1
00b65a80	bl 0x00c41000
00b65a84	cbz w0,0x00b65af0
00b65a88	ldrb w8,[x22, #0x6c]
00b65a8c	tbnz w8,#0x3,0x00b65ab8
00b65a90	bl 0x00c342a0
00b65a94	adrp x0,0x2c4000
00b65a98	adrp x2,0x2dd000
00b65a9c	add x0,x0,#0x898
00b65aa0	add x2,x2,#0x52
00b65aa4	mov w1,#0x193
00b65aa8	bl 0x00c342b0
00b65aac	mov w0,#0x39
00b65ab0	mov w1,#0x72
00b65ab4	b 0x00b65ae4
00b65ab8	ldr w9,[x22, #0x70]
00b65abc	cbz w9,0x00b65b08
00b65ac0	bl 0x00c342a0
00b65ac4	adrp x0,0x2c4000
00b65ac8	adrp x2,0x2dd000
00b65acc	add x0,x0,#0x898
00b65ad0	add x2,x2,#0x52
00b65ad4	mov w1,#0x199
00b65ad8	bl 0x00c342b0
00b65adc	mov w0,#0x39
00b65ae0	mov w1,#0x66
00b65ae4	mov x2,xzr
00b65ae8	bl 0x00c342c0
00b65aec	mov w0,wzr
00b65af0	ldp x29,x30,[sp, #0x40]
00b65af4	ldp x20,x19,[sp, #0x30]
00b65af8	ldp x22,x21,[sp, #0x20]
00b65afc	ldp x24,x23,[sp, #0x10]
00b65b00	ldr x25,[sp], #0x50
00b65b04	ret
00b65b08	tbnz w8,#0x1,0x00b65b84
00b65b0c	mov x24,x22
00b65b10	ldr x9,[x24, #0x60]!
00b65b14	cmp x9,x21
00b65b18	b.ne 0x00b65bb4
00b65b1c	ldr x8,[x22, #0xa8]
00b65b20	add x25,x22,#0x10
00b65b24	mov x0,x22
00b65b28	mov x1,x25
00b65b2c	ldr x8,[x8, #0x8]
00b65b30	mov x2,x25
00b65b34	mov x3,x21
00b65b38	blr x8
00b65b3c	cbz w0,0x00b65c58
00b65b40	ldrb w8,[x22, #0x6c]
00b65b44	tbz w8,#0x0,0x00b65b5c
00b65b48	mov x0,x25
00b65b4c	mov x1,x24
00b65b50	mov x2,x21
00b65b54	bl 0x00c418a0
00b65b58	cbz w0,0x00b65af0
00b65b5c	ldr x2,[x24]
00b65b60	cmp x2,x23
00b65b64	b.ls 0x00b65c74
00b65b68	bl 0x00c342a0
00b65b6c	adrp x0,0x2c4000
00b65b70	adrp x2,0x2dd000
00b65b74	add x0,x0,#0x898
00b65b78	add x2,x2,#0x52
00b65b7c	mov w1,#0x1ca
00b65b80	b 0x00b65bf4
00b65b84	tbnz w8,#0x0,0x00b65bc4
00b65b88	ldr x8,[x22, #0x60]
00b65b8c	cbz x8,0x00b65bbc
00b65b90	cmp x8,x21
00b65b94	b.eq 0x00b65bd4
00b65b98	bl 0x00c342a0
00b65b9c	adrp x0,0x2c4000
00b65ba0	adrp x2,0x2dd000
00b65ba4	add x0,x0,#0x898
00b65ba8	add x2,x2,#0x52
00b65bac	mov w1,#0x1a4
00b65bb0	b 0x00b65c48
00b65bb4	tbnz w8,#0x0,0x00b65c30
00b65bb8	cbnz x9,0x00b65c30
00b65bbc	str xzr,[x19]
00b65bc0	b 0x00b65c8c
00b65bc4	add x0,x22,#0x10
00b65bc8	add x1,x22,#0x60
00b65bcc	mov x2,x21
00b65bd0	bl 0x00c41880
00b65bd4	cmp x21,x23
00b65bd8	b.ls 0x00b65c04
00b65bdc	bl 0x00c342a0
00b65be0	adrp x0,0x2c4000
00b65be4	adrp x2,0x2dd000
00b65be8	add x0,x0,#0x898
00b65bec	add x2,x2,#0x52
00b65bf0	mov w1,#0x1a9
00b65bf4	bl 0x00c342b0
00b65bf8	mov w0,#0x39
00b65bfc	mov w1,#0x6a
00b65c00	b 0x00b65ae4
00b65c04	ldr x8,[x22, #0xa8]
00b65c08	add x2,x22,#0x10
00b65c0c	mov x0,x22
00b65c10	mov x1,x20
00b65c14	ldr x8,[x8, #0x8]
00b65c18	mov x3,x21
00b65c1c	blr x8
00b65c20	cbz w0,0x00b65c94
00b65c24	str xzr,[x22, #0x60]
00b65c28	str x21,[x19]
00b65c2c	b 0x00b65c8c
00b65c30	bl 0x00c342a0
00b65c34	adrp x0,0x2c4000
00b65c38	adrp x2,0x2dd000
00b65c3c	add x0,x0,#0x898
00b65c40	add x2,x2,#0x52
00b65c44	mov w1,#0x1bb
00b65c48	bl 0x00c342b0
00b65c4c	mov w0,#0x39
00b65c50	mov w1,#0x6b
00b65c54	b 0x00b65ae4
00b65c58	bl 0x00c342a0
00b65c5c	adrp x0,0x2c4000
00b65c60	adrp x2,0x2dd000
00b65c64	add x0,x0,#0x898
00b65c68	add x2,x2,#0x52
00b65c6c	orr w1,wzr,#0x1c0
00b65c70	b 0x00b65ad8
00b65c74	mov x0,x20
00b65c78	mov x1,x25
00b65c7c	bl 0x00c2ffd0
00b65c80	ldr x8,[x24]
00b65c84	str x8,[x19]
00b65c88	str xzr,[x24]
00b65c8c	mov w0,#0x1
00b65c90	b 0x00b65af0
00b65c94	bl 0x00c342a0
00b65c98	adrp x0,0x2c4000
00b65c9c	adrp x2,0x2dd000
00b65ca0	add x0,x0,#0x898
00b65ca4	add x2,x2,#0x52
00b65ca8	mov w1,#0x1ad
00b65cac	b 0x00b65ad8
