; tls_construct_stoc_cookie @ 009d9aac
009d9aac	sub sp,sp,#0xa0
009d9ab0	stp x22,x21,[sp, #0x70]
009d9ab4	stp x20,x19,[sp, #0x80]
009d9ab8	stp x29,x30,[sp, #0x90]
009d9abc	ldrb w8,[x0, #0xa9]
009d9ac0	add x29,sp,#0x90
009d9ac4	tbnz w8,#0x3,0x009d9ad0
009d9ac8	mov w19,#0x2
009d9acc	b 0x009d9cb4
009d9ad0	ldr x8,[x0, #0x9a8]
009d9ad4	mov x19,x0
009d9ad8	ldr x8,[x8, #0xe0]
009d9adc	cbz x8,0x009d9c80
009d9ae0	mov x20,x1
009d9ae4	mov w1,#0x2c
009d9ae8	mov w2,#0x2
009d9aec	mov x0,x20
009d9af0	bl 0x00c343a0
009d9af4	cbz w0,0x009d9c54
009d9af8	mov w1,#0x2
009d9afc	mov x0,x20
009d9b00	bl 0x00c343b0
009d9b04	cbz w0,0x009d9c54
009d9b08	mov w1,#0x2
009d9b0c	mov x0,x20
009d9b10	bl 0x00c343b0
009d9b14	cbz w0,0x009d9c54
009d9b18	add x1,sp,#0x30
009d9b1c	mov x0,x20
009d9b20	bl 0x00c34370
009d9b24	cbz w0,0x009d9c54
009d9b28	mov w1,#0x1076
009d9b2c	add x2,sp,#0x48
009d9b30	mov x0,x20
009d9b34	bl 0x00c36c80
009d9b38	cbz w0,0x009d9c54
009d9b3c	mov w1,#0x1
009d9b40	mov w2,#0x2
009d9b44	mov x0,x20
009d9b48	bl 0x00c343a0
009d9b4c	cbz w0,0x009d9c54
009d9b50	mov w1,#0x304
009d9b54	mov w2,#0x2
009d9b58	mov x0,x20
009d9b5c	bl 0x00c343a0
009d9b60	cbz w0,0x009d9c54
009d9b64	ldrh w1,[x19, #0x4ae]
009d9b68	mov w2,#0x2
009d9b6c	mov x0,x20
009d9b70	bl 0x00c343a0
009d9b74	cbz w0,0x009d9c54
009d9b78	ldr x8,[x19, #0x8]
009d9b7c	ldr x0,[x19, #0x2e0]
009d9b80	add x2,sp,#0x28
009d9b84	mov x1,x20
009d9b88	ldr x8,[x8, #0x98]
009d9b8c	blr x8
009d9b90	cbz w0,0x009d9c54
009d9b94	ldr x8,[x19, #0x4b0]
009d9b98	mov w2,#0x1
009d9b9c	mov x0,x20
009d9ba0	cmp x8,#0x0
009d9ba4	cset w1,eq
009d9ba8	bl 0x00c343a0
009d9bac	cbz w0,0x009d9c54
009d9bb0	mov x0,xzr
009d9bb4	bl 0x00c30970
009d9bb8	mov x1,x0
009d9bbc	mov w2,#0x8
009d9bc0	mov x0,x20
009d9bc4	bl 0x00c343a0
009d9bc8	cbz w0,0x009d9c54
009d9bcc	mov w1,#0x2
009d9bd0	mov x0,x20
009d9bd4	bl 0x00c343b0
009d9bd8	cbz w0,0x009d9c54
009d9bdc	mov w1,#0x40
009d9be0	sub x2,x29,#0x28
009d9be4	mov x0,x20
009d9be8	bl 0x00c36c80
009d9bec	cbz w0,0x009d9c54
009d9bf0	mov x0,x19
009d9bf4	mov w1,wzr
009d9bf8	bl 0x00c345a0
009d9bfc	cbz w0,0x009d9cb0
009d9c00	ldur x1,[x29, #-0x28]
009d9c04	mov w2,#0x40
009d9c08	add x3,sp,#0x18
009d9c0c	mov x0,x19
009d9c10	bl 0x00c35dc0
009d9c14	cbz w0,0x009d9cb0
009d9c18	ldr x1,[sp, #0x18]
009d9c1c	sub x2,x29,#0x30
009d9c20	mov x0,x20
009d9c24	bl 0x00c36c40
009d9c28	cbz w0,0x009d9c38
009d9c2c	ldp x9,x8,[x29, #-0x30]
009d9c30	cmp x8,x9
009d9c34	b.eq 0x009d9ccc
009d9c38	bl 0x00c342a0
009d9c3c	adrp x0,0x2d7000
009d9c40	adrp x2,0x2b9000
009d9c44	add x0,x0,#0xae0
009d9c48	add x2,x2,#0xa81
009d9c4c	mov w1,#0x6ed
009d9c50	b 0x009d9c6c
009d9c54	bl 0x00c342a0
009d9c58	adrp x0,0x2d7000
009d9c5c	adrp x2,0x2b9000
009d9c60	add x0,x0,#0xae0
009d9c64	add x2,x2,#0xa81
009d9c68	mov w1,#0x6d9
009d9c6c	bl 0x00c342b0
009d9c70	mov w2,#0x103
009d9c74	mov w1,#0x50
009d9c78	movk w2,#0xc, LSL #16
009d9c7c	b 0x009d9ca4
009d9c80	bl 0x00c342a0
009d9c84	adrp x0,0x2d7000
009d9c88	adrp x2,0x2b9000
009d9c8c	add x0,x0,#0xae0
009d9c90	add x2,x2,#0xa81
009d9c94	mov w1,#0x6c6
009d9c98	bl 0x00c342b0
009d9c9c	mov w1,#0x50
009d9ca0	mov w2,#0x11f
009d9ca4	mov x0,x19
009d9ca8	mov x3,xzr
009d9cac	bl 0x00c34410
009d9cb0	mov w19,wzr
009d9cb4	mov w0,w19
009d9cb8	ldp x29,x30,[sp, #0x90]
009d9cbc	ldp x20,x19,[sp, #0x80]
009d9cc0	ldp x22,x21,[sp, #0x70]
009d9cc4	add sp,sp,#0xa0
009d9cc8	ret
009d9ccc	mov x0,x20
009d9cd0	bl 0x00c34350
009d9cd4	cbz w0,0x009d9c38
009d9cd8	mov w1,#0x1
009d9cdc	mov x0,x20
009d9ce0	bl 0x00c343b0
009d9ce4	cbz w0,0x009d9c38
009d9ce8	mov w1,#0x1000
009d9cec	sub x2,x29,#0x38
009d9cf0	mov x0,x20
009d9cf4	bl 0x00c36c80
009d9cf8	cbz w0,0x009d9c38
009d9cfc	ldr x8,[x19, #0x9a8]
009d9d00	ldur x1,[x29, #-0x38]
009d9d04	add x2,sp,#0x8
009d9d08	mov x0,x19
009d9d0c	ldr x8,[x8, #0xe0]
009d9d10	blr x8
009d9d14	cbz w0,0x009d9d54
009d9d18	ldr x1,[sp, #0x8]
009d9d1c	sub x2,x29,#0x40
009d9d20	mov x0,x20
009d9d24	bl 0x00c36c40
009d9d28	cbz w0,0x009d9d38
009d9d2c	ldp x9,x8,[x29, #-0x40]
009d9d30	cmp x8,x9
009d9d34	b.eq 0x009d9d7c
009d9d38	bl 0x00c342a0
009d9d3c	adrp x0,0x2d7000
009d9d40	adrp x2,0x2b9000
009d9d44	add x0,x0,#0xae0
009d9d48	add x2,x2,#0xa81
009d9d4c	mov w1,#0x6fc
009d9d50	b 0x009d9c6c
009d9d54	bl 0x00c342a0
009d9d58	adrp x0,0x2d7000
009d9d5c	adrp x2,0x2b9000
009d9d60	add x0,x0,#0xae0
009d9d64	add x2,x2,#0xa81
009d9d68	mov w1,#0x6f3
009d9d6c	bl 0x00c342b0
009d9d70	mov w1,#0x50
009d9d74	mov w2,#0x190
009d9d78	b 0x009d9ca4
009d9d7c	mov x0,x20
009d9d80	bl 0x00c34350
009d9d84	cbz w0,0x009d9d38
009d9d88	add x1,sp,#0x20
009d9d8c	mov x0,x20
009d9d90	bl 0x00c34370
009d9d94	cbz w0,0x009d9d38
009d9d98	mov w1,#0x20
009d9d9c	add x2,sp,#0x40
009d9da0	mov x0,x20
009d9da4	bl 0x00c36c80
009d9da8	cbz w0,0x009d9d38
009d9dac	ldr x8,[sp, #0x30]
009d9db0	ldr x9,[sp, #0x20]
009d9db4	mov w10,#0x20
009d9db8	str x10,[sp, #0x10]
009d9dbc	sub x8,x9,x8
009d9dc0	mov w9,#0x1057
009d9dc4	cmp x8,x9
009d9dc8	str x8,[sp, #0x20]
009d9dcc	b.cs 0x009d9eb8
009d9dd0	bl 0x00c31fa0
009d9dd4	ldr x8,[x19, #0x9a8]
009d9dd8	ldr x9,[x19, #0xb88]
009d9ddc	mov x21,x0
009d9de0	adrp x1,0x2c3000
009d9de4	ldr x0,[x8]
009d9de8	ldr x2,[x8, #0x440]
009d9dec	add x3,x9,#0x2d8
009d9df0	add x1,x1,#0x5d3
009d9df4	mov w4,#0x20
009d9df8	bl 0x00c36250
009d9dfc	mov x22,x0
009d9e00	cbz x21,0x009d9ed4
009d9e04	cbz x22,0x009d9ed4
009d9e08	ldr x8,[x19, #0x9a8]
009d9e0c	adrp x2,0x2a9000
009d9e10	add x2,x2,#0xb18
009d9e14	mov x0,x21
009d9e18	ldr x3,[x8]
009d9e1c	ldr x4,[x8, #0x440]
009d9e20	mov x1,xzr
009d9e24	mov x5,x22
009d9e28	mov x6,xzr
009d9e2c	bl 0x00c361d0
009d9e30	cmp w0,#0x1
009d9e34	b.lt 0x009d9f04
009d9e38	ldp x1,x3,[sp, #0x40]
009d9e3c	ldr x4,[sp, #0x20]
009d9e40	add x2,sp,#0x10
009d9e44	mov x0,x21
009d9e48	bl 0x00c36fb0
009d9e4c	cmp w0,#0x0
009d9e50	b.le 0x009d9f04
009d9e54	ldr x8,[sp, #0x20]
009d9e58	ldr x1,[sp, #0x10]
009d9e5c	mov w9,#0x1077
009d9e60	add x8,x1,x8
009d9e64	cmp x8,x9
009d9e68	b.cs 0x009d9f20
009d9e6c	add x2,sp,#0x38
009d9e70	mov x0,x20
009d9e74	bl 0x00c36c40
009d9e78	cbz w0,0x009d9e9c
009d9e7c	ldp x9,x8,[sp, #0x38]
009d9e80	cmp x8,x9
009d9e84	b.ne 0x009d9e9c
009d9e88	ldr x9,[sp, #0x20]
009d9e8c	ldr x10,[sp, #0x48]
009d9e90	sub x8,x8,x9
009d9e94	cmp x10,x8
009d9e98	b.eq 0x009d9f6c
009d9e9c	bl 0x00c342a0
009d9ea0	adrp x0,0x2d7000
009d9ea4	adrp x2,0x2b9000
009d9ea8	add x0,x0,#0xae0
009d9eac	add x2,x2,#0xa81
009d9eb0	mov w1,#0x724
009d9eb4	b 0x009d9f38
009d9eb8	bl 0x00c342a0
009d9ebc	adrp x0,0x2d7000
009d9ec0	adrp x2,0x2b9000
009d9ec4	add x0,x0,#0xae0
009d9ec8	add x2,x2,#0xa81
009d9ecc	mov w1,#0x703
009d9ed0	b 0x009d9c6c
009d9ed4	bl 0x00c342a0
009d9ed8	adrp x0,0x2d7000
009d9edc	adrp x2,0x2b9000
009d9ee0	add x0,x0,#0xae0
009d9ee4	add x2,x2,#0xa81
009d9ee8	mov w1,#0x70e
009d9eec	bl 0x00c342b0
009d9ef0	mov w8,#0x103
009d9ef4	movk w8,#0xc, LSL #16
009d9ef8	sub w2,w8,#0x3
009d9efc	mov w1,#0x50
009d9f00	b 0x009d9f48
009d9f04	bl 0x00c342a0
009d9f08	adrp x0,0x2d7000
009d9f0c	adrp x2,0x2b9000
009d9f10	add x0,x0,#0xae0
009d9f14	add x2,x2,#0xa81
009d9f18	mov w1,#0x716
009d9f1c	b 0x009d9f38
009d9f20	bl 0x00c342a0
009d9f24	adrp x0,0x2d7000
009d9f28	adrp x2,0x2b9000
009d9f2c	add x0,x0,#0xae0
009d9f30	add x2,x2,#0xa81
009d9f34	mov w1,#0x71b
009d9f38	bl 0x00c342b0
009d9f3c	mov w2,#0x103
009d9f40	mov w1,#0x50
009d9f44	movk w2,#0xc, LSL #16
009d9f48	mov x0,x19
009d9f4c	mov x3,xzr
009d9f50	bl 0x00c34410
009d9f54	mov w19,wzr
009d9f58	mov x0,x21
009d9f5c	bl 0x00c31f90
009d9f60	mov x0,x22
009d9f64	bl 0x00c32450
009d9f68	b 0x009d9cb4
009d9f6c	mov x0,x20
009d9f70	bl 0x00c34350
009d9f74	cbz w0,0x009d9e9c
009d9f78	mov x0,x20
009d9f7c	bl 0x00c34350
009d9f80	cbz w0,0x009d9e9c
009d9f84	mov w19,#0x1
009d9f88	b 0x009d9f58
