; tls13_generate_secret @ 009c6a38
009c6a38	sub sp,sp,#0x1b0
009c6a3c	stp x20,x19,[sp, #0x190]
009c6a40	mov x19,x0
009c6a44	mov w8,#0x1
009c6a48	mov x0,x1
009c6a4c	stp x28,x27,[sp, #0x150]
009c6a50	stp x26,x25,[sp, #0x160]
009c6a54	stp x24,x23,[sp, #0x170]
009c6a58	stp x22,x21,[sp, #0x180]
009c6a5c	stp x29,x30,[sp, #0x1a0]
009c6a60	add x29,sp,#0x1a0
009c6a64	mov x21,x5
009c6a68	mov x24,x4
009c6a6c	mov x25,x3
009c6a70	mov x23,x2
009c6a74	mov x22,x1
009c6a78	str w8,[sp, #0x2c]
009c6a7c	bl 0x00c36230
009c6a80	ldr x9,[x19, #0x9a8]
009c6a84	adrp x1,0x2bb000
009c6a88	mov x26,x0
009c6a8c	add x1,x1,#0x87a
009c6a90	ldr x8,[x9]
009c6a94	ldr x2,[x9, #0x440]
009c6a98	mov x0,x8
009c6a9c	bl 0x00c36210
009c6aa0	mov x27,x0
009c6aa4	bl 0x00c361f0
009c6aa8	mov x20,x0
009c6aac	mov x0,x27
009c6ab0	bl 0x00c36220
009c6ab4	cbz x20,0x009c6c64
009c6ab8	mov x0,x22
009c6abc	bl 0x00c34c20
009c6ac0	tbnz w0,#0x1f,0x009c6c9c
009c6ac4	sxtw x22,w0
009c6ac8	adrp x0,0x2d7000
009c6acc	add x0,x0,#0xa76
009c6ad0	mov x8,sp
009c6ad4	add x1,sp,#0x2c
009c6ad8	bl 0x00c36260
009c6adc	ldr x8,[sp, #0x20]
009c6ae0	ldp q1,q0,[sp]
009c6ae4	adrp x0,0x29d000
009c6ae8	add x28,sp,#0x30
009c6aec	str x8,[sp, #0x50]
009c6af0	add x0,x0,#0xe2e
009c6af4	mov x8,sp
009c6af8	mov x1,x26
009c6afc	mov x2,xzr
009c6b00	stp q1,q0,[sp, #0x30]
009c6b04	add x27,x28,#0x50
009c6b08	bl 0x00c36280
009c6b0c	ldr x8,[sp, #0x20]
009c6b10	ldp q1,q0,[sp]
009c6b14	str x8,[sp, #0x78]
009c6b18	stur q0,[sp, #0x68]
009c6b1c	stur q1,[sp, #0x58]
009c6b20	cbz x25,0x009c6b54
009c6b24	adrp x0,0x74c000
009c6b28	add x0,x0,#0xe1c
009c6b2c	mov x8,sp
009c6b30	mov x1,x25
009c6b34	mov x2,x24
009c6b38	add x26,x28,#0x78
009c6b3c	bl 0x00c34c50
009c6b40	ldr x8,[sp, #0x20]
009c6b44	ldp q0,q1,[sp]
009c6b48	str x8,[x27, #0x20]
009c6b4c	stp q0,q1,[x27]
009c6b50	mov x27,x26
009c6b54	cbz x23,0x009c6b88
009c6b58	adrp x0,0x2a7000
009c6b5c	add x0,x0,#0xb6c
009c6b60	mov x8,sp
009c6b64	mov x1,x23
009c6b68	mov x2,x22
009c6b6c	add x24,x27,#0x28
009c6b70	bl 0x00c34c50
009c6b74	ldr x8,[sp, #0x20]
009c6b78	ldp q0,q1,[sp]
009c6b7c	str x8,[x27, #0x20]
009c6b80	stp q0,q1,[x27]
009c6b84	mov x27,x24
009c6b88	adrp x0,0x2cf000
009c6b8c	adrp x1,0x74c000
009c6b90	add x0,x0,#0x7cf
009c6b94	add x1,x1,#0xe20
009c6b98	mov x8,sp
009c6b9c	orr w2,wzr,#0x6
009c6ba0	bl 0x00c34c50
009c6ba4	ldr x8,[sp, #0x20]
009c6ba8	ldp q0,q1,[sp]
009c6bac	adrp x0,0x2cb000
009c6bb0	adrp x1,0x74c000
009c6bb4	str x8,[x27, #0x20]
009c6bb8	add x0,x0,#0x5a1
009c6bbc	add x1,x1,#0xe33
009c6bc0	mov x8,sp
009c6bc4	orr w2,wzr,#0x7
009c6bc8	stp q0,q1,[x27]
009c6bcc	bl 0x00c34c50
009c6bd0	ldr x8,[sp, #0x20]
009c6bd4	ldp q1,q0,[sp]
009c6bd8	str x8,[x27, #0x48]
009c6bdc	mov x8,sp
009c6be0	stur q0,[x27, #0x38]
009c6be4	stur q1,[x27, #0x28]
009c6be8	bl 0x00c34c40
009c6bec	ldr x8,[sp, #0x20]
009c6bf0	ldp q0,q1,[sp]
009c6bf4	add x3,sp,#0x30
009c6bf8	mov x0,x20
009c6bfc	mov x1,x21
009c6c00	mov x2,x22
009c6c04	str x8,[x27, #0x70]
009c6c08	stp q0,q1,[x27, #0x50]
009c6c0c	bl 0x00c36200
009c6c10	mov w21,w0
009c6c14	cmp w0,#0x0
009c6c18	b.gt 0x009c6c50
009c6c1c	bl 0x00c342a0
009c6c20	adrp x0,0x2b5000
009c6c24	adrp x2,0x2a5000
009c6c28	add x0,x0,#0x997
009c6c2c	add x2,x2,#0xb1a
009c6c30	mov w1,#0xd9
009c6c34	bl 0x00c342b0
009c6c38	mov w2,#0x103
009c6c3c	mov w1,#0x50
009c6c40	movk w2,#0xc, LSL #16
009c6c44	mov x0,x19
009c6c48	mov x3,xzr
009c6c4c	bl 0x00c34410
009c6c50	cmp w21,#0x0
009c6c54	mov x0,x20
009c6c58	cset w19,gt
009c6c5c	bl 0x00c361e0
009c6c60	b 0x009c6cdc
009c6c64	bl 0x00c342a0
009c6c68	adrp x0,0x2b5000
009c6c6c	adrp x2,0x2a5000
009c6c70	add x0,x0,#0x997
009c6c74	add x2,x2,#0xb1a
009c6c78	mov w1,#0xb7
009c6c7c	bl 0x00c342b0
009c6c80	mov w2,#0x103
009c6c84	mov w1,#0x50
009c6c88	movk w2,#0xc, LSL #16
009c6c8c	mov x0,x19
009c6c90	mov x3,xzr
009c6c94	bl 0x00c34410
009c6c98	b 0x009c6cd8
009c6c9c	bl 0x00c342a0
009c6ca0	adrp x0,0x2b5000
009c6ca4	adrp x2,0x2a5000
009c6ca8	add x0,x0,#0x997
009c6cac	add x2,x2,#0xb1a
009c6cb0	mov w1,#0xbe
009c6cb4	bl 0x00c342b0
009c6cb8	mov w2,#0x103
009c6cbc	mov w1,#0x50
009c6cc0	movk w2,#0xc, LSL #16
009c6cc4	mov x0,x19
009c6cc8	mov x3,xzr
009c6ccc	bl 0x00c34410
009c6cd0	mov x0,x20
009c6cd4	bl 0x00c361e0
009c6cd8	mov w19,wzr
009c6cdc	mov w0,w19
009c6ce0	ldp x29,x30,[sp, #0x1a0]
009c6ce4	ldp x20,x19,[sp, #0x190]
009c6ce8	ldp x22,x21,[sp, #0x180]
009c6cec	ldp x24,x23,[sp, #0x170]
009c6cf0	ldp x26,x25,[sp, #0x160]
009c6cf4	ldp x28,x27,[sp, #0x150]
009c6cf8	add sp,sp,#0x1b0
009c6cfc	ret
