; ossl_DER_w_RSASSA_PSS_params @ 00b64a24
00b64a24	stp x28,x27,[sp, #-0x60]!
00b64a28	stp x26,x25,[sp, #0x10]
00b64a2c	stp x24,x23,[sp, #0x20]
00b64a30	stp x22,x21,[sp, #0x30]
00b64a34	stp x20,x19,[sp, #0x40]
00b64a38	stp x29,x30,[sp, #0x50]
00b64a3c	add x29,sp,#0x50
00b64a40	cbz x2,0x00b64b3c
00b64a44	mov x20,x0
00b64a48	mov x0,x2
00b64a4c	mov x23,x2
00b64a50	mov w19,w1
00b64a54	bl 0x00c3fb80
00b64a58	mov w8,w0
00b64a5c	mov w0,wzr
00b64a60	cbnz w8,0x00b64b40
00b64a64	mov x0,x23
00b64a68	bl 0x00c3fb70
00b64a6c	mov w21,w0
00b64a70	mov x0,x23
00b64a74	bl 0x00c3fba0
00b64a78	mov w26,w0
00b64a7c	mov x0,x23
00b64a80	bl 0x00c3fd30
00b64a84	tbnz w26,#0x1f,0x00b64ae8
00b64a88	cmp w0,#0x1
00b64a8c	b.ne 0x00b64b10
00b64a90	mov x0,xzr
00b64a94	bl 0x00c3fb70
00b64a98	mov w22,w0
00b64a9c	mov x0,xzr
00b64aa0	bl 0x00c3fba0
00b64aa4	mov w27,w0
00b64aa8	mov x0,xzr
00b64aac	bl 0x00c3fd30
00b64ab0	cmp w21,#0x445
00b64ab4	mov w28,w0
00b64ab8	b.gt 0x00b64b5c
00b64abc	sub w8,w21,#0x2a0
00b64ac0	cmp w8,#0x3
00b64ac4	b.hi 0x00b64b7c
00b64ac8	adrp x9,0x77c000
00b64acc	add x9,x9,#0x660
00b64ad0	ldrsw x8,[x9, x8, LSL #0x2]
00b64ad4	add x8,x8,x9
00b64ad8	br x8
00b64adc	adrp x24,0xcb5000
00b64ae0	ldr x24,[x24, #0xa58]
00b64ae4	b 0x00b64bc4
00b64ae8	bl 0x00c342a0
00b64aec	adrp x0,0x2cc000
00b64af0	adrp x2,0x2a6000
00b64af4	add x0,x0,#0x814
00b64af8	add x2,x2,#0xcfd
00b64afc	mov w1,#0x135
00b64b00	bl 0x00c342b0
00b64b04	mov w0,#0x4
00b64b08	mov w1,#0x96
00b64b0c	b 0x00b64b34
00b64b10	bl 0x00c342a0
00b64b14	adrp x0,0x2cc000
00b64b18	adrp x2,0x2a6000
00b64b1c	add x0,x0,#0x814
00b64b20	add x2,x2,#0xcfd
00b64b24	mov w1,#0x139
00b64b28	bl 0x00c342b0
00b64b2c	mov w0,#0x4
00b64b30	mov w1,#0x8b
00b64b34	mov x2,xzr
00b64b38	bl 0x00c342c0
00b64b3c	mov w0,wzr
00b64b40	ldp x29,x30,[sp, #0x50]
00b64b44	ldp x20,x19,[sp, #0x40]
00b64b48	ldp x22,x21,[sp, #0x30]
00b64b4c	ldp x24,x23,[sp, #0x20]
00b64b50	ldp x26,x25,[sp, #0x10]
00b64b54	ldp x28,x27,[sp], #0x60
00b64b58	ret
00b64b5c	cmp w21,#0x446
00b64b60	b.eq 0x00b64bbc
00b64b64	cmp w21,#0x447
00b64b68	mov w0,wzr
00b64b6c	b.ne 0x00b64b40
00b64b70	adrp x24,0xcb5000
00b64b74	ldr x24,[x24, #0xa78]
00b64b78	b 0x00b64bc4
00b64b7c	cmp w21,#0x40
00b64b80	mov w0,wzr
00b64b84	b.ne 0x00b64b40
00b64b88	adrp x24,0xcb5000
00b64b8c	ldr x24,[x24, #0xa48]
00b64b90	mov w25,#0xb
00b64b94	b 0x00b64bc8
00b64b98	adrp x24,0xcb5000
00b64b9c	ldr x24,[x24, #0xa60]
00b64ba0	b 0x00b64bc4
00b64ba4	adrp x24,0xcb5000
00b64ba8	ldr x24,[x24, #0xa68]
00b64bac	b 0x00b64bc4
00b64bb0	adrp x24,0xcb5000
00b64bb4	ldr x24,[x24, #0xa50]
00b64bb8	b 0x00b64bc4
00b64bbc	adrp x24,0xcb5000
00b64bc0	ldr x24,[x24, #0xa70]
00b64bc4	orr w25,wzr,#0xf
00b64bc8	mov x0,x20
00b64bcc	mov w1,w19
00b64bd0	bl 0x00c3e050
00b64bd4	cbz w0,0x00b64b40
00b64bd8	cmp w28,#0x1
00b64bdc	b.eq 0x00b64bf4
00b64be0	orr w1,wzr,#0x3
00b64be4	mov w2,#0x1
00b64be8	mov x0,x20
00b64bec	bl 0x00c3e0b0
00b64bf0	cbz w0,0x00b64b40
00b64bf4	cmp w26,w27
00b64bf8	b.eq 0x00b64c10
00b64bfc	mov w1,#0x2
00b64c00	mov x0,x20
00b64c04	mov w2,w26
00b64c08	bl 0x00c3e0b0
00b64c0c	cbz w0,0x00b64b40
00b64c10	mov x0,x23
00b64c14	bl 0x00c3fd10
00b64c18	cmp w0,#0x38f
00b64c1c	mov w0,wzr
00b64c20	b.ne 0x00b64b40
00b64c24	mov x0,x23
00b64c28	bl 0x00c3fb90
00b64c2c	cmp w0,#0x445
00b64c30	b.gt 0x00b64c68
00b64c34	sub w8,w0,#0x2a0
00b64c38	cmp w8,#0x3
00b64c3c	b.hi 0x00b64c88
00b64c40	adrp x9,0x77c000
00b64c44	add x9,x9,#0x670
00b64c48	ldrsw x8,[x9, x8, LSL #0x2]
00b64c4c	adrp x2,0x77c000
00b64c50	add x2,x2,#0x6e5
00b64c54	add x8,x8,x9
00b64c58	br x8
00b64c5c	adrp x2,0x77c000
00b64c60	add x2,x2,#0x701
00b64c64	b 0x00b64cb8
00b64c68	cmp w0,#0x446
00b64c6c	b.eq 0x00b64cb0
00b64c70	cmp w0,#0x447
00b64c74	mov w0,wzr
00b64c78	b.ne 0x00b64b40
00b64c7c	adrp x2,0x77c000
00b64c80	add x2,x2,#0x771
00b64c84	b 0x00b64cb8
00b64c88	cmp w0,#0x40
00b64c8c	mov w0,wzr
00b64c90	b.eq 0x00b64ccc
00b64c94	b 0x00b64b40
00b64c98	adrp x2,0x77c000
00b64c9c	add x2,x2,#0x71d
00b64ca0	b 0x00b64cb8
00b64ca4	adrp x2,0x77c000
00b64ca8	add x2,x2,#0x739
00b64cac	b 0x00b64cb8
00b64cb0	adrp x2,0x77c000
00b64cb4	add x2,x2,#0x755
00b64cb8	mov w1,#0x1
00b64cbc	orr w3,wzr,#0x1c
00b64cc0	mov x0,x20
00b64cc4	bl 0x00c3e0a0
00b64cc8	cbz w0,0x00b64b40
00b64ccc	cmp w21,w22
00b64cd0	b.eq 0x00b64cec
00b64cd4	mov x0,x20
00b64cd8	mov w1,wzr
00b64cdc	mov x2,x24
00b64ce0	mov x3,x25
00b64ce4	bl 0x00c3e0a0
00b64ce8	cbz w0,0x00b64b40
00b64cec	mov x0,x20
00b64cf0	mov w1,w19
00b64cf4	bl 0x00c3e060
00b64cf8	cmp w0,#0x0
00b64cfc	cset w0,ne
00b64d00	b 0x00b64b40
