; FUN_00b93970 @ 00b93970
00b93970	stp x28,x27,[sp, #-0x60]!
00b93974	stp x26,x25,[sp, #0x10]
00b93978	stp x24,x23,[sp, #0x20]
00b9397c	stp x22,x21,[sp, #0x30]
00b93980	stp x20,x19,[sp, #0x40]
00b93984	stp x29,x30,[sp, #0x50]
00b93988	add x29,sp,#0x50
00b9398c	adrp x8,0xd26000
00b93990	ldr x9,[x8, #0x18]
00b93994	mov x24,x3
00b93998	mov x22,x4
00b9399c	mov x23,x3
00b939a0	add x9,x9,#0x1
00b939a4	str x9,[x8, #0x18]
00b939a8	ldr x8,[x24, #0x20]!
00b939ac	mov x27,x2
00b939b0	mov x20,x1
00b939b4	mov x21,x0
00b939b8	cbz x8,0x00b939f8
00b939bc	add x28,x27,#0x20
00b939c0	mov x0,x28
00b939c4	mov x1,xzr
00b939c8	add x19,x20,#0x10
00b939cc	add x26,x20,#0x20
00b939d0	bl 0x00c41b40
00b939d4	cbz w0,0x00b93a00
00b939d8	mov x0,x24
00b939dc	mov x1,xzr
00b939e0	bl 0x00c41b40
00b939e4	cbz w0,0x00b93a2c
00b939e8	mov w1,#0x1
00b939ec	mov x0,x24
00b939f0	bl 0x00c41b40
00b939f4	cbz w0,0x00b93a70
00b939f8	mov w0,#0xffffb080
00b939fc	b 0x00b93b34
00b93a00	mov x0,x20
00b93a04	mov x1,x23
00b93a08	bl 0x00c41b60
00b93a0c	cbnz w0,0x00b93b34
00b93a10	add x1,x23,#0x10
00b93a14	mov x0,x19
00b93a18	bl 0x00c41b60
00b93a1c	cbnz w0,0x00b93b34
00b93a20	mov x0,x26
00b93a24	mov x1,x24
00b93a28	b 0x00b93a54
00b93a2c	mov x0,x20
00b93a30	mov x1,x27
00b93a34	bl 0x00c41b60
00b93a38	cbnz w0,0x00b93b34
00b93a3c	add x1,x27,#0x10
00b93a40	mov x0,x19
00b93a44	bl 0x00c41b60
00b93a48	cbnz w0,0x00b93b34
00b93a4c	mov x0,x26
00b93a50	mov x1,x28
00b93a54	ldp x29,x30,[sp, #0x50]
00b93a58	ldp x20,x19,[sp, #0x40]
00b93a5c	ldp x22,x21,[sp, #0x30]
00b93a60	ldp x24,x23,[sp, #0x20]
00b93a64	ldp x26,x25,[sp, #0x10]
00b93a68	ldp x28,x27,[sp], #0x60
00b93a6c	b 0x00c41b60
00b93a70	mov x0,x21
00b93a74	mov x1,x22
00b93a78	mov x2,x28
00b93a7c	mov x3,x28
00b93a80	bl 0x00b953d4
00b93a84	cbnz w0,0x00b93b34
00b93a88	add x24,x22,#0x10
00b93a8c	mov x0,x21
00b93a90	mov x1,x24
00b93a94	mov x2,x22
00b93a98	mov x3,x28
00b93a9c	bl 0x00b953d4
00b93aa0	cbnz w0,0x00b93b34
00b93aa4	mov x0,x21
00b93aa8	mov x1,x22
00b93aac	mov x2,x22
00b93ab0	mov x3,x23
00b93ab4	bl 0x00b953d4
00b93ab8	cbnz w0,0x00b93b34
00b93abc	add x3,x23,#0x10
00b93ac0	mov x0,x21
00b93ac4	mov x1,x24
00b93ac8	mov x2,x24
00b93acc	bl 0x00b953d4
00b93ad0	cbnz w0,0x00b93b34
00b93ad4	mov x0,x22
00b93ad8	mov x1,x22
00b93adc	mov x2,x27
00b93ae0	bl 0x00c41d60
00b93ae4	cbnz w0,0x00b93b34
00b93ae8	add x23,x21,#0x8
00b93aec	ldrsh w8,[x22, #0x8]
00b93af0	tbz w8,#0x1f,0x00b93b1c
00b93af4	mov x0,x22
00b93af8	mov x1,xzr
00b93afc	bl 0x00c41b40
00b93b00	cbz w0,0x00b93b1c
00b93b04	mov x0,x22
00b93b08	mov x1,x22
00b93b0c	mov x2,x23
00b93b10	bl 0x00c41b20
00b93b14	cbz w0,0x00b93aec
00b93b18	b 0x00b93b34
00b93b1c	add x25,x27,#0x10
00b93b20	mov x0,x24
00b93b24	mov x1,x24
00b93b28	mov x2,x25
00b93b2c	bl 0x00c41d60
00b93b30	cbz w0,0x00b93b50
00b93b34	ldp x29,x30,[sp, #0x50]
00b93b38	ldp x20,x19,[sp, #0x40]
00b93b3c	ldp x22,x21,[sp, #0x30]
00b93b40	ldp x24,x23,[sp, #0x20]
00b93b44	ldp x26,x25,[sp, #0x10]
00b93b48	ldp x28,x27,[sp], #0x60
00b93b4c	ret
00b93b50	ldrsh w8,[x22, #0x18]
00b93b54	tbz w8,#0x1f,0x00b93b80
00b93b58	mov x0,x24
00b93b5c	mov x1,xzr
00b93b60	bl 0x00c41b40
00b93b64	cbz w0,0x00b93b80
00b93b68	mov x0,x24
00b93b6c	mov x1,x24
00b93b70	mov x2,x23
00b93b74	bl 0x00c41b20
00b93b78	cbz w0,0x00b93b50
00b93b7c	b 0x00b93b34
00b93b80	mov x0,x22
00b93b84	mov x1,xzr
00b93b88	bl 0x00c41b40
00b93b8c	cbz w0,0x00b93c40
00b93b90	mov x0,x21
00b93b94	mov x1,x26
00b93b98	mov x2,x28
00b93b9c	mov x3,x22
00b93ba0	bl 0x00b953d4
00b93ba4	cbnz w0,0x00b93b34
00b93ba8	add x26,x22,#0x20
00b93bac	mov x0,x21
00b93bb0	mov x1,x26
00b93bb4	mov x2,x22
00b93bb8	mov x3,x22
00b93bbc	bl 0x00b953d4
00b93bc0	cbnz w0,0x00b93b34
00b93bc4	add x28,x22,#0x30
00b93bc8	mov x0,x21
00b93bcc	mov x1,x28
00b93bd0	mov x2,x26
00b93bd4	mov x3,x22
00b93bd8	bl 0x00b953d4
00b93bdc	cbnz w0,0x00b93b34
00b93be0	mov x0,x21
00b93be4	mov x1,x26
00b93be8	mov x2,x26
00b93bec	mov x3,x27
00b93bf0	bl 0x00b953d4
00b93bf4	cbnz w0,0x00b93b34
00b93bf8	mov x0,x22
00b93bfc	mov x1,x26
00b93c00	bl 0x00c41b60
00b93c04	cbnz w0,0x00b93b34
00b93c08	mov w1,#0x1
00b93c0c	mov x0,x22
00b93c10	bl 0x00c41d00
00b93c14	cbnz w0,0x00b93b34
00b93c18	mov x0,x22
00b93c1c	mov x1,x23
00b93c20	bl 0x00c41b50
00b93c24	tbnz w0,#0x1f,0x00b93cc0
00b93c28	mov x0,x22
00b93c2c	mov x1,x22
00b93c30	mov x2,x23
00b93c34	bl 0x00c41d40
00b93c38	cbz w0,0x00b93c18
00b93c3c	b 0x00b93b34
00b93c40	mov x0,x24
00b93c44	mov x1,xzr
00b93c48	bl 0x00c41b40
00b93c4c	cbz w0,0x00b93c94
00b93c50	mov w1,#0x1
00b93c54	mov x0,x20
00b93c58	bl 0x00c41c40
00b93c5c	cbnz w0,0x00b93b34
00b93c60	mov w1,#0x1
00b93c64	mov x0,x19
00b93c68	bl 0x00c41c40
00b93c6c	cbnz w0,0x00b93b34
00b93c70	mov x0,x26
00b93c74	ldp x29,x30,[sp, #0x50]
00b93c78	ldp x20,x19,[sp, #0x40]
00b93c7c	ldp x22,x21,[sp, #0x30]
00b93c80	ldp x24,x23,[sp, #0x20]
00b93c84	ldp x26,x25,[sp, #0x10]
00b93c88	mov x1,xzr
00b93c8c	ldp x28,x27,[sp], #0x60
00b93c90	b 0x00c41c40
00b93c94	mov x0,x21
00b93c98	mov x1,x20
00b93c9c	mov x3,x22
00b93ca0	ldp x29,x30,[sp, #0x50]
00b93ca4	ldp x20,x19,[sp, #0x40]
00b93ca8	ldp x22,x21,[sp, #0x30]
00b93cac	ldp x24,x23,[sp, #0x20]
00b93cb0	ldp x26,x25,[sp, #0x10]
00b93cb4	mov x2,x27
00b93cb8	ldp x28,x27,[sp], #0x60
00b93cbc	b 0x00b954dc
00b93cc0	mov x0,x21
00b93cc4	mov x1,x20
00b93cc8	mov x2,x24
00b93ccc	mov x3,x24
00b93cd0	bl 0x00b953d4
00b93cd4	cbnz w0,0x00b93b34
00b93cd8	mov x0,x20
00b93cdc	mov x1,x20
00b93ce0	mov x2,x22
00b93ce4	bl 0x00c41d60
00b93ce8	cbnz w0,0x00b93b34
00b93cec	ldrsh w8,[x20, #0x8]
00b93cf0	tbz w8,#0x1f,0x00b93d1c
00b93cf4	mov x0,x20
00b93cf8	mov x1,xzr
00b93cfc	bl 0x00c41b40
00b93d00	cbz w0,0x00b93d1c
00b93d04	mov x0,x20
00b93d08	mov x1,x20
00b93d0c	mov x2,x23
00b93d10	bl 0x00c41b20
00b93d14	cbz w0,0x00b93cec
00b93d18	b 0x00b93b34
00b93d1c	mov x0,x20
00b93d20	mov x1,x20
00b93d24	mov x2,x28
00b93d28	bl 0x00c41d60
00b93d2c	cbnz w0,0x00b93b34
00b93d30	ldrsh w8,[x20, #0x8]
00b93d34	tbz w8,#0x1f,0x00b93d60
00b93d38	mov x0,x20
00b93d3c	mov x1,xzr
00b93d40	bl 0x00c41b40
00b93d44	cbz w0,0x00b93d60
00b93d48	mov x0,x20
00b93d4c	mov x1,x20
00b93d50	mov x2,x23
00b93d54	bl 0x00c41b20
00b93d58	cbz w0,0x00b93d30
00b93d5c	b 0x00b93b34
00b93d60	mov x0,x26
00b93d64	mov x1,x26
00b93d68	mov x2,x20
00b93d6c	bl 0x00c41d60
00b93d70	cbnz w0,0x00b93b34
00b93d74	ldrsh w8,[x22, #0x28]
00b93d78	tbz w8,#0x1f,0x00b93da4
00b93d7c	mov x0,x26
00b93d80	mov x1,xzr
00b93d84	bl 0x00c41b40
00b93d88	cbz w0,0x00b93da4
00b93d8c	mov x0,x26
00b93d90	mov x1,x26
00b93d94	mov x2,x23
00b93d98	bl 0x00c41b20
00b93d9c	cbz w0,0x00b93d74
00b93da0	b 0x00b93b34
00b93da4	mov x0,x21
00b93da8	mov x1,x26
00b93dac	mov x2,x26
00b93db0	mov x3,x24
00b93db4	bl 0x00b953d4
00b93db8	cbnz w0,0x00b93b34
00b93dbc	mov x0,x21
00b93dc0	mov x1,x28
00b93dc4	mov x2,x28
00b93dc8	mov x3,x25
00b93dcc	bl 0x00b953d4
00b93dd0	cbnz w0,0x00b93b34
00b93dd4	mov x0,x19
00b93dd8	mov x1,x26
00b93ddc	mov x2,x28
00b93de0	bl 0x00c41d60
00b93de4	cbnz w0,0x00b93b34
00b93de8	ldrsh w8,[x20, #0x18]
00b93dec	tbz w8,#0x1f,0x00b93e18
00b93df0	mov x0,x19
00b93df4	mov x1,xzr
00b93df8	bl 0x00c41b40
00b93dfc	cbz w0,0x00b93b34
00b93e00	mov x0,x19
00b93e04	mov x1,x19
00b93e08	mov x2,x23
00b93e0c	bl 0x00c41b20
00b93e10	cbz w0,0x00b93de8
00b93e14	b 0x00b93b34
00b93e18	mov w0,wzr
00b93e1c	b 0x00b93b34
