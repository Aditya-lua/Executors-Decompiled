; ossl_do_blob_header @ 00b34a28
00b34a28	stp x29,x30,[sp, #-0x10]!
00b34a2c	cmp w1,#0x10
00b34a30	mov w8,wzr
00b34a34	mov x29,sp
00b34a38	b.cc 0x00b34b70
00b34a3c	ldr x9,[x0]
00b34a40	ldrb w8,[x9]
00b34a44	cmp w8,#0x7
00b34a48	b.eq 0x00b34a68
00b34a4c	cmp w8,#0x6
00b34a50	mov w8,wzr
00b34a54	b.ne 0x00b34b70
00b34a58	ldr w8,[x5]
00b34a5c	cbz w8,0x00b34b40
00b34a60	mov w8,#0x1
00b34a64	b 0x00b34aa0
00b34a68	ldr w8,[x5]
00b34a6c	cmp w8,#0x1
00b34a70	mov w8,wzr
00b34a74	b.ne 0x00b34aa0
00b34a78	bl 0x00c342a0
00b34a7c	adrp x0,0x29e000
00b34a80	adrp x2,0x2b0000
00b34a84	add x0,x0,#0xe1c
00b34a88	add x2,x2,#0xda2
00b34a8c	mov w1,#0xb3
00b34a90	bl 0x00c342b0
00b34a94	mov w0,#0x9
00b34a98	orr w1,wzr,#0x78
00b34a9c	b 0x00b34b64
00b34aa0	str w8,[x5]
00b34aa4	ldrb w8,[x9, #0x1]
00b34aa8	cmp w8,#0x2
00b34aac	b.ne 0x00b34b18
00b34ab0	ldr w8,[x9, #0x8]
00b34ab4	mov w10,#0x5351
00b34ab8	movk w10,#0x3241, LSL #16
00b34abc	str w8,[x2]
00b34ac0	ldr w8,[x9, #0xc]
00b34ac4	str w8,[x3]
00b34ac8	ldr w8,[x2]
00b34acc	cmp w8,w10
00b34ad0	b.gt 0x00b34b7c
00b34ad4	mov w10,#0x5352
00b34ad8	movk w10,#0x3141, LSL #16
00b34adc	cmp w8,w10
00b34ae0	b.eq 0x00b34af4
00b34ae4	mov w10,#0x5344
00b34ae8	movk w10,#0x3153, LSL #16
00b34aec	cmp w8,w10
00b34af0	b.ne 0x00b34c28
00b34af4	ldr w10,[x5]
00b34af8	cbnz w10,0x00b34bc4
00b34afc	bl 0x00c342a0
00b34b00	adrp x0,0x29e000
00b34b04	adrp x2,0x2b0000
00b34b08	add x0,x0,#0xe1c
00b34b0c	add x2,x2,#0xda2
00b34b10	mov w1,#0xcc
00b34b14	b 0x00b34b58
00b34b18	bl 0x00c342a0
00b34b1c	adrp x0,0x29e000
00b34b20	adrp x2,0x2b0000
00b34b24	add x0,x0,#0xe1c
00b34b28	add x2,x2,#0xda2
00b34b2c	mov w1,#0xbf
00b34b30	bl 0x00c342b0
00b34b34	mov w0,#0x9
00b34b38	mov w1,#0x75
00b34b3c	b 0x00b34b64
00b34b40	bl 0x00c342a0
00b34b44	adrp x0,0x29e000
00b34b48	adrp x2,0x2b0000
00b34b4c	add x0,x0,#0xe1c
00b34b50	add x2,x2,#0xda2
00b34b54	mov w1,#0xab
00b34b58	bl 0x00c342b0
00b34b5c	mov w0,#0x9
00b34b60	mov w1,#0x77
00b34b64	mov x2,xzr
00b34b68	bl 0x00c342c0
00b34b6c	mov w8,wzr
00b34b70	mov w0,w8
00b34b74	ldp x29,x30,[sp], #0x10
00b34b78	ret
00b34b7c	mov w10,#0x5352
00b34b80	movk w10,#0x3241, LSL #16
00b34b84	cmp w8,w10
00b34b88	b.eq 0x00b34b9c
00b34b8c	mov w10,#0x5344
00b34b90	movk w10,#0x3253, LSL #16
00b34b94	cmp w8,w10
00b34b98	b.ne 0x00b34c28
00b34b9c	ldr w10,[x5]
00b34ba0	cmp w10,#0x1
00b34ba4	b.ne 0x00b34bc4
00b34ba8	bl 0x00c342a0
00b34bac	adrp x0,0x29e000
00b34bb0	adrp x2,0x2b0000
00b34bb4	add x0,x0,#0xe1c
00b34bb8	add x2,x2,#0xda2
00b34bbc	mov w1,#0xd4
00b34bc0	b 0x00b34a90
00b34bc4	mov w10,#0x5351
00b34bc8	movk w10,#0x3241, LSL #16
00b34bcc	cmp w8,w10
00b34bd0	b.gt 0x00b34bf8
00b34bd4	mov w10,#0x5352
00b34bd8	movk w10,#0x3141, LSL #16
00b34bdc	cmp w8,w10
00b34be0	b.eq 0x00b34c44
00b34be4	mov w10,#0x5344
00b34be8	movk w10,#0x3153, LSL #16
00b34bec	cmp w8,w10
00b34bf0	b.eq 0x00b34c18
00b34bf4	b 0x00b34c90
00b34bf8	mov w10,#0x5352
00b34bfc	movk w10,#0x3241, LSL #16
00b34c00	cmp w8,w10
00b34c04	b.eq 0x00b34c44
00b34c08	mov w10,#0x5344
00b34c0c	movk w10,#0x3253, LSL #16
00b34c10	cmp w8,w10
00b34c14	b.ne 0x00b34c90
00b34c18	ldr w8,[x4]
00b34c1c	cbz w8,0x00b34cc4
00b34c20	mov w8,#0x1
00b34c24	b 0x00b34c7c
00b34c28	bl 0x00c342a0
00b34c2c	adrp x0,0x29e000
00b34c30	adrp x2,0x2b0000
00b34c34	add x0,x0,#0xe1c
00b34c38	add x2,x2,#0xda2
00b34c3c	mov w1,#0xda
00b34c40	b 0x00b34ca8
00b34c44	ldr w8,[x4]
00b34c48	cmp w8,#0x1
00b34c4c	mov w8,wzr
00b34c50	b.ne 0x00b34c7c
00b34c54	bl 0x00c342a0
00b34c58	adrp x0,0x29e000
00b34c5c	adrp x2,0x2b0000
00b34c60	add x0,x0,#0xe1c
00b34c64	add x2,x2,#0xda2
00b34c68	mov w1,#0xeb
00b34c6c	bl 0x00c342b0
00b34c70	mov w0,#0x9
00b34c74	mov w1,#0x84
00b34c78	b 0x00b34b64
00b34c7c	add x9,x9,#0x10
00b34c80	str w8,[x4]
00b34c84	mov w8,#0x1
00b34c88	str x9,[x0]
00b34c8c	b 0x00b34b70
00b34c90	bl 0x00c342a0
00b34c94	adrp x0,0x29e000
00b34c98	adrp x2,0x2b0000
00b34c9c	add x0,x0,#0xe1c
00b34ca0	add x2,x2,#0xda2
00b34ca4	mov w1,#0xf2
00b34ca8	bl 0x00c342b0
00b34cac	mov w0,#0x9
00b34cb0	mov w1,#0x74
00b34cb4	mov x2,xzr
00b34cb8	bl 0x00c342c0
00b34cbc	mov w8,#0xffffffff
00b34cc0	b 0x00b34b70
00b34cc4	bl 0x00c342a0
00b34cc8	adrp x0,0x29e000
00b34ccc	adrp x2,0x2b0000
00b34cd0	add x0,x0,#0xe1c
00b34cd4	add x2,x2,#0xda2
00b34cd8	mov w1,#0xe3
00b34cdc	bl 0x00c342b0
00b34ce0	mov w0,#0x9
00b34ce4	mov w1,#0x83
00b34ce8	b 0x00b34b64
