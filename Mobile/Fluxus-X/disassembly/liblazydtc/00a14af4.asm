; SCT_CTX_verify @ 00a14af4
00a14af4	sub sp,sp,#0x40
00a14af8	stp x22,x21,[sp, #0x10]
00a14afc	mov x21,x0
00a14b00	mov x0,x1
00a14b04	stp x20,x19,[sp, #0x20]
00a14b08	stp x29,x30,[sp, #0x30]
00a14b0c	add x29,sp,#0x30
00a14b10	mov x19,x1
00a14b14	bl 0x00c39850
00a14b18	cbz w0,0x00a14b70
00a14b1c	ldr x8,[x21]
00a14b20	cbz x8,0x00a14b70
00a14b24	ldr w8,[x19, #0x58]
00a14b28	cmn w8,#0x1
00a14b2c	b.eq 0x00a14b70
00a14b30	cmp w8,#0x1
00a14b34	b.ne 0x00a14b40
00a14b38	ldr x8,[x21, #0x18]
00a14b3c	cbz x8,0x00a14b70
00a14b40	ldr w8,[x19]
00a14b44	cbz w8,0x00a14bb8
00a14b48	bl 0x00c342a0
00a14b4c	adrp x0,0x2bf000
00a14b50	adrp x2,0x2b7000
00a14b54	add x0,x0,#0xadb
00a14b58	add x2,x2,#0x956
00a14b5c	mov w1,#0x6c
00a14b60	bl 0x00c342b0
00a14b64	mov w0,#0x32
00a14b68	mov w1,#0x73
00a14b6c	b 0x00a14b94
00a14b70	bl 0x00c342a0
00a14b74	adrp x0,0x2bf000
00a14b78	adrp x2,0x2b7000
00a14b7c	add x0,x0,#0xadb
00a14b80	add x2,x2,#0x956
00a14b84	mov w1,#0x68
00a14b88	bl 0x00c342b0
00a14b8c	mov w0,#0x32
00a14b90	mov w1,#0x6a
00a14b94	mov x2,xzr
00a14b98	bl 0x00c342c0
00a14b9c	mov w19,wzr
00a14ba0	mov w0,w19
00a14ba4	ldp x29,x30,[sp, #0x30]
00a14ba8	ldp x20,x19,[sp, #0x20]
00a14bac	ldp x22,x21,[sp, #0x10]
00a14bb0	add sp,sp,#0x40
00a14bb4	ret
00a14bb8	ldr x2,[x19, #0x20]
00a14bbc	ldr x8,[x21, #0x10]
00a14bc0	cmp x2,x8
00a14bc4	b.ne 0x00a14bd8
00a14bc8	ldr x0,[x19, #0x18]
00a14bcc	ldr x1,[x21, #0x8]
00a14bd0	bl 0x00c300b0
00a14bd4	cbz w0,0x00a14c00
00a14bd8	bl 0x00c342a0
00a14bdc	adrp x0,0x2bf000
00a14be0	adrp x2,0x2b7000
00a14be4	add x0,x0,#0xadb
00a14be8	add x2,x2,#0x956
00a14bec	mov w1,#0x71
00a14bf0	bl 0x00c342b0
00a14bf4	mov w0,#0x32
00a14bf8	mov w1,#0x72
00a14bfc	b 0x00a14b94
00a14c00	ldr x8,[x19, #0x28]
00a14c04	ldr x9,[x21, #0x48]
00a14c08	cmp x8,x9
00a14c0c	b.ls 0x00a14c38
00a14c10	bl 0x00c342a0
00a14c14	adrp x0,0x2bf000
00a14c18	adrp x2,0x2b7000
00a14c1c	add x0,x0,#0xadb
00a14c20	add x2,x2,#0x956
00a14c24	mov w1,#0x75
00a14c28	bl 0x00c342b0
00a14c2c	mov w0,#0x32
00a14c30	mov w1,#0x74
00a14c34	b 0x00a14b94
00a14c38	bl 0x00c31fa0
00a14c3c	mov x20,x0
00a14c40	cbz x0,0x00a14dec
00a14c44	ldp x3,x4,[x21, #0x50]
00a14c48	ldr x5,[x21]
00a14c4c	adrp x2,0x2a9000
00a14c50	add x2,x2,#0xb18
00a14c54	mov x0,x20
00a14c58	mov x1,xzr
00a14c5c	mov x6,xzr
00a14c60	bl 0x00c370e0
00a14c64	cbz w0,0x00a14dec
00a14c68	ldr w8,[x19, #0x58]
00a14c6c	cmn w8,#0x1
00a14c70	b.eq 0x00a14dec
00a14c74	cmp w8,#0x1
00a14c78	b.ne 0x00a14c84
00a14c7c	ldr x9,[x21, #0x18]
00a14c80	cbz x9,0x00a14dec
00a14c84	ldr w9,[x19]
00a14c88	strb wzr,[sp, #0x5]
00a14c8c	add x1,sp,#0x4
00a14c90	orr w2,wzr,#0xc
00a14c94	strb w9,[sp, #0x4]
00a14c98	ldr x9,[x19, #0x28]
00a14c9c	mov x0,x20
00a14ca0	strb w8,[sp, #0xf]
00a14ca4	lsr x10,x9,#0x38
00a14ca8	strb w10,[sp, #0x6]
00a14cac	lsr x10,x9,#0x30
00a14cb0	strb w10,[sp, #0x7]
00a14cb4	lsr x10,x9,#0x28
00a14cb8	strb w10,[sp, #0x8]
00a14cbc	lsr x10,x9,#0x20
00a14cc0	strb w10,[sp, #0x9]
00a14cc4	lsr x10,x9,#0x18
00a14cc8	strb w10,[sp, #0xa]
00a14ccc	lsr x10,x9,#0x10
00a14cd0	strb w10,[sp, #0xb]
00a14cd4	lsr x10,x9,#0x8
00a14cd8	strb w10,[sp, #0xc]
00a14cdc	lsr w10,w8,#0x8
00a14ce0	strb w9,[sp, #0xd]
00a14ce4	strb w10,[sp, #0xe]
00a14ce8	bl 0x00c31f80
00a14cec	cbz w0,0x00a14dec
00a14cf0	ldr w8,[x19, #0x58]
00a14cf4	cbz w8,0x00a14d1c
00a14cf8	ldp x1,x2,[x21, #0x18]
00a14cfc	mov x0,x20
00a14d00	bl 0x00c31f80
00a14d04	cbz w0,0x00a14dec
00a14d08	add x8,x21,#0x38
00a14d0c	add x9,x21,#0x40
00a14d10	ldr x21,[x8]
00a14d14	cbnz x21,0x00a14d2c
00a14d18	b 0x00a14dec
00a14d1c	add x8,x21,#0x28
00a14d20	add x9,x21,#0x30
00a14d24	ldr x21,[x8]
00a14d28	cbz x21,0x00a14dec
00a14d2c	ldr x22,[x9]
00a14d30	add x1,sp,#0x4
00a14d34	orr w2,wzr,#0x3
00a14d38	mov x0,x20
00a14d3c	lsr x8,x22,#0x10
00a14d40	lsr x9,x22,#0x8
00a14d44	strb w8,[sp, #0x4]
00a14d48	strb w9,[sp, #0x5]
00a14d4c	strb w22,[sp, #0x6]
00a14d50	bl 0x00c31f80
00a14d54	cbz w0,0x00a14dec
00a14d58	mov x0,x20
00a14d5c	mov x1,x21
00a14d60	mov x2,x22
00a14d64	bl 0x00c31f80
00a14d68	cbz w0,0x00a14dec
00a14d6c	ldr x8,[x19, #0x38]
00a14d70	add x1,sp,#0x4
00a14d74	mov w2,#0x2
00a14d78	mov x0,x20
00a14d7c	lsr x9,x8,#0x8
00a14d80	strb w9,[sp, #0x4]
00a14d84	strb w8,[sp, #0x5]
00a14d88	bl 0x00c31f80
00a14d8c	cbz w0,0x00a14dec
00a14d90	ldr x2,[x19, #0x38]
00a14d94	cbz x2,0x00a14da8
00a14d98	ldr x1,[x19, #0x30]
00a14d9c	mov x0,x20
00a14da0	bl 0x00c31f80
00a14da4	cbz w0,0x00a14dec
00a14da8	ldp x1,x2,[x19, #0x48]
00a14dac	mov x0,x20
00a14db0	bl 0x00c37270
00a14db4	mov w19,w0
00a14db8	cbnz w0,0x00a14df0
00a14dbc	bl 0x00c342a0
00a14dc0	adrp x0,0x2bf000
00a14dc4	adrp x2,0x2b7000
00a14dc8	add x0,x0,#0xadb
00a14dcc	add x2,x2,#0x956
00a14dd0	mov w1,#0x88
00a14dd4	bl 0x00c342b0
00a14dd8	mov w0,#0x32
00a14ddc	mov w1,#0x6b
00a14de0	mov x2,xzr
00a14de4	bl 0x00c342c0
00a14de8	b 0x00a14df0
00a14dec	mov w19,wzr
00a14df0	mov x0,x20
00a14df4	bl 0x00c31f90
00a14df8	b 0x00a14ba0
