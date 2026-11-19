; EVP_DigestSignFinal @ 00a67bcc
00a67bcc	sub sp,sp,#0x90
00a67bd0	stp x24,x23,[sp, #0x50]
00a67bd4	stp x22,x21,[sp, #0x60]
00a67bd8	stp x20,x19,[sp, #0x70]
00a67bdc	stp x29,x30,[sp, #0x80]
00a67be0	ldr x21,[x0, #0x28]
00a67be4	add x29,sp,#0x80
00a67be8	cbz x21,0x00a67cd4
00a67bec	ldr w8,[x21]
00a67bf0	mov x19,x2
00a67bf4	mov x22,x0
00a67bf8	mov x20,x1
00a67bfc	cmp w8,#0x80
00a67c00	b.ne 0x00a67c48
00a67c04	ldr x0,[x21, #0x30]
00a67c08	cbz x0,0x00a67c48
00a67c0c	ldr x8,[x21, #0x28]
00a67c10	cbz x8,0x00a67c48
00a67c14	cbz x20,0x00a67d9c
00a67c18	ldrb w9,[x22, #0x19]
00a67c1c	tbnz w9,#0x1,0x00a67ddc
00a67c20	mov x0,x21
00a67c24	bl 0x00c3c200
00a67c28	cbz x0,0x00a67d00
00a67c2c	mov x21,x0
00a67c30	ldp x8,x0,[x0, #0x28]
00a67c34	ldr x3,[x19]
00a67c38	mov x1,x20
00a67c3c	mov x2,x19
00a67c40	ldr x8,[x8, #0x78]
00a67c44	b 0x00a67d50
00a67c48	ldr x8,[x21, #0x78]
00a67c4c	cbz x8,0x00a67cd4
00a67c50	ldrb w9,[x21, #0xa0]
00a67c54	tbz w9,#0x0,0x00a67c74
00a67c58	ldr x8,[x8, #0xf8]
00a67c5c	mov x0,x21
00a67c60	mov x1,x22
00a67c64	blr x8
00a67c68	cbz w0,0x00a67d00
00a67c6c	ldrb w9,[x21, #0xa0]
00a67c70	ldr x8,[x21, #0x78]
00a67c74	and w9,w9,#0xfe
00a67c78	strb w9,[x21, #0xa0]
00a67c7c	ldrb w9,[x8, #0x4]
00a67c80	tbnz w9,#0x2,0x00a67d20
00a67c84	ldr x24,[x8, #0x78]
00a67c88	cbz x20,0x00a67d68
00a67c8c	str wzr,[sp, #0xc]
00a67c90	ldrb w8,[x22, #0x19]
00a67c94	tbnz w8,#0x1,0x00a67da4
00a67c98	bl 0x00c31fa0
00a67c9c	cbz x0,0x00a67d00
00a67ca0	mov x1,x22
00a67ca4	mov x23,x0
00a67ca8	bl 0x00c34bf0
00a67cac	cbz w0,0x00a67e50
00a67cb0	cbz x24,0x00a67e5c
00a67cb4	ldr x0,[x23, #0x28]
00a67cb8	mov x1,x20
00a67cbc	mov x2,x19
00a67cc0	mov x3,x23
00a67cc4	ldr x8,[x0, #0x78]
00a67cc8	ldr x8,[x8, #0x78]
00a67ccc	blr x8
00a67cd0	b 0x00a67e6c
00a67cd4	bl 0x00c342a0
00a67cd8	adrp x0,0x2c3000
00a67cdc	adrp x2,0x2b4000
00a67ce0	add x0,x0,#0xa2d
00a67ce4	add x2,x2,#0x2cb
00a67ce8	orr w1,wzr,#0x1f0
00a67cec	bl 0x00c342b0
00a67cf0	orr w0,wzr,#0x6
00a67cf4	mov w1,#0x86
00a67cf8	mov x2,xzr
00a67cfc	bl 0x00c342c0
00a67d00	mov w22,wzr
00a67d04	mov w0,w22
00a67d08	ldp x29,x30,[sp, #0x80]
00a67d0c	ldp x20,x19,[sp, #0x70]
00a67d10	ldp x22,x21,[sp, #0x60]
00a67d14	ldp x24,x23,[sp, #0x50]
00a67d18	add sp,sp,#0x90
00a67d1c	ret
00a67d20	cbz x20,0x00a67d8c
00a67d24	ldrb w9,[x22, #0x19]
00a67d28	tbnz w9,#0x1,0x00a67dc4
00a67d2c	mov x0,x21
00a67d30	bl 0x00c3c200
00a67d34	cbz x0,0x00a67d00
00a67d38	ldr x8,[x0, #0x78]
00a67d3c	mov x21,x0
00a67d40	mov x1,x20
00a67d44	mov x2,x19
00a67d48	ldr x8,[x8, #0x78]
00a67d4c	mov x3,x22
00a67d50	blr x8
00a67d54	mov w19,w0
00a67d58	mov x0,x21
00a67d5c	bl 0x00c34620
00a67d60	mov w0,w19
00a67d64	b 0x00a67d08
00a67d68	cbz x24,0x00a67e04
00a67d6c	mov x0,x21
00a67d70	mov x1,xzr
00a67d74	mov x2,x19
00a67d78	mov x3,x22
00a67d7c	blr x24
00a67d80	cmp w0,#0x1
00a67d84	b.ge 0x00a67ea0
00a67d88	b 0x00a67d00
00a67d8c	ldr x4,[x8, #0x78]
00a67d90	mov x0,x21
00a67d94	mov x1,xzr
00a67d98	b 0x00a67dd0
00a67d9c	mov x3,xzr
00a67da0	b 0x00a67de0
00a67da4	cbz x24,0x00a67e34
00a67da8	mov x0,x21
00a67dac	mov x1,x20
00a67db0	mov x2,x19
00a67db4	mov x3,x22
00a67db8	blr x24
00a67dbc	mov w22,w0
00a67dc0	b 0x00a67d04
00a67dc4	ldr x4,[x8, #0x78]
00a67dc8	mov x0,x21
00a67dcc	mov x1,x20
00a67dd0	mov x2,x19
00a67dd4	mov x3,x22
00a67dd8	b 0x00a67dec
00a67ddc	ldr x3,[x19]
00a67de0	ldr x4,[x8, #0x78]
00a67de4	mov x1,x20
00a67de8	mov x2,x19
00a67dec	ldp x29,x30,[sp, #0x80]
00a67df0	ldp x20,x19,[sp, #0x70]
00a67df4	ldp x22,x21,[sp, #0x60]
00a67df8	ldp x24,x23,[sp, #0x50]
00a67dfc	add sp,sp,#0x90
00a67e00	br x4
00a67e04	ldr x0,[x22, #0x8]
00a67e08	bl 0x00c34c20
00a67e0c	tbnz w0,#0x1f,0x00a67d00
00a67e10	sxtw x4,w0
00a67e14	mov x0,x21
00a67e18	mov x1,xzr
00a67e1c	mov x2,x19
00a67e20	mov x3,xzr
00a67e24	bl 0x00c3d700
00a67e28	cmp w0,#0x1
00a67e2c	b.ge 0x00a67ea0
00a67e30	b 0x00a67d00
00a67e34	add x1,sp,#0x10
00a67e38	add x2,sp,#0xc
00a67e3c	mov x0,x22
00a67e40	bl 0x00c31f60
00a67e44	mov w22,w0
00a67e48	cbz x24,0x00a67e7c
00a67e4c	b 0x00a67d04
00a67e50	mov x0,x23
00a67e54	bl 0x00c31f90
00a67e58	b 0x00a67d00
00a67e5c	add x1,sp,#0x10
00a67e60	add x2,sp,#0xc
00a67e64	mov x0,x23
00a67e68	bl 0x00c31f60
00a67e6c	mov w22,w0
00a67e70	mov x0,x23
00a67e74	bl 0x00c31f90
00a67e78	cbnz x24,0x00a67d04
00a67e7c	cbz w22,0x00a67d04
00a67e80	ldr w4,[sp, #0xc]
00a67e84	add x3,sp,#0x10
00a67e88	mov x0,x21
00a67e8c	mov x1,x20
00a67e90	mov x2,x19
00a67e94	bl 0x00c3d700
00a67e98	cmp w0,#0x0
00a67e9c	b.le 0x00a67d00
00a67ea0	mov w22,#0x1
00a67ea4	b 0x00a67d04
