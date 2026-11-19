; EVP_PKEY_CTX_set_hkdf_mode @ 00a76b5c
00a76b5c	sub sp,sp,#0xb0
00a76b60	stp x29,x30,[sp, #0xa0]
00a76b64	add x29,sp,#0xa0
00a76b68	stp x20,x19,[sp, #0x90]
00a76b6c	stur w1,[x29, #-0x14]
00a76b70	cbz x0,0x00a76bec
00a76b74	ldr w8,[x0]
00a76b78	mov x19,x0
00a76b7c	cmp w8,#0x800
00a76b80	b.ne 0x00a76bec
00a76b84	ldr x8,[x19, #0x30]
00a76b88	mov w20,w1
00a76b8c	cbz x8,0x00a76c2c
00a76b90	tbnz w20,#0x1f,0x00a76c80
00a76b94	adrp x0,0x2d7000
00a76b98	add x0,x0,#0xa76
00a76b9c	add x8,sp,#0x8
00a76ba0	sub x1,x29,#0x14
00a76ba4	bl 0x00c36260
00a76ba8	ldr x8,[sp, #0x28]
00a76bac	ldur q0,[sp, #0x18]
00a76bb0	ldur q1,[sp, #0x8]
00a76bb4	str x8,[sp, #0x50]
00a76bb8	add x8,sp,#0x8
00a76bbc	stp q1,q0,[sp, #0x30]
00a76bc0	bl 0x00c34c40
00a76bc4	ldr x8,[sp, #0x28]
00a76bc8	ldur q0,[sp, #0x18]
00a76bcc	ldur q1,[sp, #0x8]
00a76bd0	add x1,sp,#0x30
00a76bd4	mov x0,x19
00a76bd8	str x8,[sp, #0x78]
00a76bdc	stur q0,[sp, #0x68]
00a76be0	stur q1,[sp, #0x58]
00a76be4	bl 0x00a75c0c
00a76be8	b 0x00a76c1c
00a76bec	bl 0x00c342a0
00a76bf0	adrp x0,0x2c3000
00a76bf4	adrp x2,0x2aa000
00a76bf8	add x0,x0,#0xa9f
00a76bfc	add x2,x2,#0x237
00a76c00	mov w1,#0x486
00a76c04	bl 0x00c342b0
00a76c08	orr w0,wzr,#0x6
00a76c0c	mov w1,#0x93
00a76c10	mov x2,xzr
00a76c14	bl 0x00c342c0
00a76c18	orr w0,wzr,#0xfffffffe
00a76c1c	ldp x29,x30,[sp, #0xa0]
00a76c20	ldp x20,x19,[sp, #0x90]
00a76c24	add sp,sp,#0xb0
00a76c28	ret
00a76c2c	bl 0x00c35250
00a76c30	bl 0x00c342a0
00a76c34	adrp x0,0x2c3000
00a76c38	adrp x2,0x2b0000
00a76c3c	add x0,x0,#0xa9f
00a76c40	add x2,x2,#0xb2
00a76c44	mov w1,#0x5f6
00a76c48	bl 0x00c342b0
00a76c4c	orr w0,wzr,#0x6
00a76c50	mov w1,#0x93
00a76c54	mov x2,xzr
00a76c58	bl 0x00c342c0
00a76c5c	bl 0x00c35240
00a76c60	mov w1,#0xffffffff
00a76c64	mov w2,#0x800
00a76c68	mov w3,#0x1007
00a76c6c	mov x0,x19
00a76c70	mov w4,w20
00a76c74	mov x5,xzr
00a76c78	bl 0x00a77554
00a76c7c	b 0x00a76c1c
00a76c80	bl 0x00c342a0
00a76c84	adrp x0,0x2c3000
00a76c88	adrp x2,0x2aa000
00a76c8c	add x0,x0,#0xa9f
00a76c90	add x2,x2,#0x237
00a76c94	mov w1,#0x492
00a76c98	bl 0x00c342b0
00a76c9c	orr w0,wzr,#0x6
00a76ca0	mov w1,#0xde
00a76ca4	mov x2,xzr
00a76ca8	bl 0x00c342c0
00a76cac	mov w0,wzr
00a76cb0	b 0x00a76c1c
