; OCSP_RESPONSE_print @ 00ab1b50
00ab1b50	stp x28,x27,[sp, #-0x60]!
00ab1b54	stp x26,x25,[sp, #0x10]
00ab1b58	stp x24,x23,[sp, #0x20]
00ab1b5c	stp x22,x21,[sp, #0x30]
00ab1b60	stp x20,x19,[sp, #0x40]
00ab1b64	stp x29,x30,[sp, #0x50]
00ab1b68	ldr x22,[x1, #0x8]
00ab1b6c	mov x19,x1
00ab1b70	adrp x1,0x2a0000
00ab1b74	add x1,x1,#0xab9
00ab1b78	add x29,sp,#0x50
00ab1b7c	mov x21,x2
00ab1b80	mov x20,x0
00ab1b84	bl 0x00c32260
00ab1b88	cmp w0,#0x1
00ab1b8c	b.lt 0x00ab1ca4
00ab1b90	ldr x0,[x19]
00ab1b94	bl 0x00c37540
00ab1b98	mov x3,x0
00ab1b9c	cmp x0,#0x6
00ab1ba0	b.hi 0x00ab1bb4
00ab1ba4	and x8,x3,#0xff
00ab1ba8	mov w9,#0x6f
00ab1bac	lsr w8,w9,w8
00ab1bb0	tbnz w8,#0x0,0x00ab1bc0
00ab1bb4	adrp x2,0x2a2000
00ab1bb8	add x2,x2,#0xb33
00ab1bbc	b 0x00ab1bd0
00ab1bc0	adrp x8,0xc7a000
00ab1bc4	add x8,x8,#0xc00
00ab1bc8	ldr x8,[x8, x3, LSL #0x3]
00ab1bcc	ldr x2,[x8, #0x8]
00ab1bd0	adrp x1,0x2b4000
00ab1bd4	add x1,x1,#0x7d3
00ab1bd8	mov x0,x20
00ab1bdc	bl 0x00c32250
00ab1be0	cmp w0,#0x1
00ab1be4	b.lt 0x00ab1ca4
00ab1be8	cbz x22,0x00ab1cd4
00ab1bec	adrp x1,0x29e000
00ab1bf0	add x1,x1,#0x874
00ab1bf4	mov x0,x20
00ab1bf8	bl 0x00c32260
00ab1bfc	cmp w0,#0x1
00ab1c00	b.lt 0x00ab1ca4
00ab1c04	ldr x1,[x22]
00ab1c08	mov x0,x20
00ab1c0c	bl 0x00c32da0
00ab1c10	cmp w0,#0x1
00ab1c14	b.lt 0x00ab1ca4
00ab1c18	ldr x0,[x22]
00ab1c1c	bl 0x00c37750
00ab1c20	cmp w0,#0x16d
00ab1c24	b.ne 0x00ab1cdc
00ab1c28	mov x0,x19
00ab1c2c	bl 0x00c325a0
00ab1c30	mov x19,x0
00ab1c34	cbz x0,0x00ab1fc0
00ab1c38	ldr x0,[x19]
00ab1c3c	bl 0x00c37580
00ab1c40	adrp x1,0x2dc000
00ab1c44	mov x3,x0
00ab1c48	add x2,x0,#0x1
00ab1c4c	add x1,x1,#0x7e0
00ab1c50	mov x0,x20
00ab1c54	bl 0x00c32250
00ab1c58	cmp w0,#0x1
00ab1c5c	b.lt 0x00ab1fc0
00ab1c60	adrp x1,0x2ce000
00ab1c64	add x1,x1,#0x118
00ab1c68	mov x0,x20
00ab1c6c	bl 0x00c32260
00ab1c70	cmp w0,#0x1
00ab1c74	b.lt 0x00ab1fc0
00ab1c78	ldr w8,[x19, #0x8]
00ab1c7c	cmp w8,#0x1
00ab1c80	b.eq 0x00ab1cf4
00ab1c84	cbnz w8,0x00ab1d04
00ab1c88	ldr x1,[x19, #0x10]
00ab1c8c	mov w3,#0x31f
00ab1c90	movk w3,#0x82, LSL #16
00ab1c94	mov x0,x20
00ab1c98	mov w2,wzr
00ab1c9c	bl 0x00c32bd0
00ab1ca0	b 0x00ab1d04
00ab1ca4	mov w21,wzr
00ab1ca8	mov x19,xzr
00ab1cac	mov x0,x19
00ab1cb0	bl 0x00c32510
00ab1cb4	mov w0,w21
00ab1cb8	ldp x29,x30,[sp, #0x50]
00ab1cbc	ldp x20,x19,[sp, #0x40]
00ab1cc0	ldp x22,x21,[sp, #0x30]
00ab1cc4	ldp x24,x23,[sp, #0x20]
00ab1cc8	ldp x26,x25,[sp, #0x10]
00ab1ccc	ldp x28,x27,[sp], #0x60
00ab1cd0	ret
00ab1cd4	mov w21,#0x1
00ab1cd8	b 0x00ab1cb4
00ab1cdc	adrp x1,0x2cb000
00ab1ce0	add x1,x1,#0xf5f
00ab1ce4	mov x0,x20
00ab1ce8	bl 0x00c32260
00ab1cec	mov w21,#0x1
00ab1cf0	b 0x00ab1cb4
00ab1cf4	ldr x1,[x19, #0x10]
00ab1cf8	mov x0,x20
00ab1cfc	mov w2,wzr
00ab1d00	bl 0x00c37de0
00ab1d04	adrp x1,0x2c6000
00ab1d08	add x1,x1,#0x86
00ab1d0c	mov x0,x20
00ab1d10	bl 0x00c32250
00ab1d14	cmp w0,#0x1
00ab1d18	b.lt 0x00ab1fc0
00ab1d1c	ldr x1,[x19, #0x18]
00ab1d20	mov x0,x20
00ab1d24	bl 0x00c374d0
00ab1d28	cbz w0,0x00ab1fc0
00ab1d2c	adrp x1,0x2ca000
00ab1d30	add x1,x1,#0x1c9
00ab1d34	mov x0,x20
00ab1d38	bl 0x00c32250
00ab1d3c	cmp w0,#0x1
00ab1d40	b.lt 0x00ab1fc0
00ab1d44	ldr x0,[x19, #0x20]
00ab1d48	bl 0x00c325e0
00ab1d4c	cmp w0,#0x1
00ab1d50	b.lt 0x00ab1f28
00ab1d54	adrp x25,0x2a2000
00ab1d58	adrp x23,0x2a4000
00ab1d5c	adrp x26,0x2a6000
00ab1d60	adrp x27,0x2c4000
00ab1d64	mov w22,wzr
00ab1d68	add x25,x25,#0xb33
00ab1d6c	add x23,x23,#0x7f1
00ab1d70	add x26,x26,#0x6a4
00ab1d74	add x27,x27,#0xdae
00ab1d78	ldr x0,[x19, #0x20]
00ab1d7c	mov w1,w22
00ab1d80	bl 0x00c32610
00ab1d84	cbz x0,0x00ab1f14
00ab1d88	ldr x0,[x19, #0x20]
00ab1d8c	mov w1,w22
00ab1d90	bl 0x00c32610
00ab1d94	ldr x1,[x0]
00ab1d98	mov x24,x0
00ab1d9c	mov w2,#0x4
00ab1da0	mov x0,x20
00ab1da4	bl 0x00ab1a58
00ab1da8	ldr x28,[x24, #0x8]
00ab1dac	mov x2,x25
00ab1db0	ldrsw x8,[x28]
00ab1db4	cmp w8,#0x2
00ab1db8	b.hi 0x00ab1dcc
00ab1dbc	adrp x9,0xc7a000
00ab1dc0	add x9,x9,#0xc40
00ab1dc4	ldr x8,[x9, x8, LSL #0x3]
00ab1dc8	ldr x2,[x8, #0x8]
00ab1dcc	mov x0,x20
00ab1dd0	mov x1,x23
00ab1dd4	bl 0x00c32250
00ab1dd8	cmp w0,#0x1
00ab1ddc	b.lt 0x00ab1fc0
00ab1de0	ldr w8,[x28]
00ab1de4	cmp w8,#0x1
00ab1de8	b.ne 0x00ab1e70
00ab1dec	ldr x28,[x28, #0x8]
00ab1df0	adrp x1,0x2d4000
00ab1df4	mov x0,x20
00ab1df8	add x1,x1,#0x252
00ab1dfc	bl 0x00c32250
00ab1e00	cmp w0,#0x1
00ab1e04	b.lt 0x00ab1fc0
00ab1e08	ldr x1,[x28]
00ab1e0c	mov x0,x20
00ab1e10	bl 0x00c374d0
00ab1e14	cbz w0,0x00ab1fc0
00ab1e18	ldr x0,[x28, #0x8]
00ab1e1c	cbz x0,0x00ab1e70
00ab1e20	bl 0x00c37540
00ab1e24	mov x3,x0
00ab1e28	cmp x0,#0x8
00ab1e2c	mov x2,x25
00ab1e30	b.hi 0x00ab1e58
00ab1e34	and x8,x3,#0xffff
00ab1e38	mov w9,#0x17f
00ab1e3c	lsr w8,w9,w8
00ab1e40	mov x2,x25
00ab1e44	tbz w8,#0x0,0x00ab1e58
00ab1e48	adrp x8,0xc7a000
00ab1e4c	add x8,x8,#0xc60
00ab1e50	ldr x8,[x8, x3, LSL #0x3]
00ab1e54	ldr x2,[x8, #0x8]
00ab1e58	adrp x1,0x29e000
00ab1e5c	mov x0,x20
00ab1e60	add x1,x1,#0x888
00ab1e64	bl 0x00c32250
00ab1e68	cmp w0,#0x1
00ab1e6c	b.lt 0x00ab1fc0
00ab1e70	mov x0,x20
00ab1e74	mov x1,x26
00ab1e78	bl 0x00c32250
00ab1e7c	cmp w0,#0x1
00ab1e80	b.lt 0x00ab1fc0
00ab1e84	ldr x1,[x24, #0x10]
00ab1e88	mov x0,x20
00ab1e8c	bl 0x00c374d0
00ab1e90	cbz w0,0x00ab1fc0
00ab1e94	ldr x8,[x24, #0x18]
00ab1e98	cbz x8,0x00ab1ec4
00ab1e9c	adrp x1,0x2ba000
00ab1ea0	mov x0,x20
00ab1ea4	add x1,x1,#0x5b9
00ab1ea8	bl 0x00c32250
00ab1eac	cmp w0,#0x1
00ab1eb0	b.lt 0x00ab1fc0
00ab1eb4	ldr x1,[x24, #0x18]
00ab1eb8	mov x0,x20
00ab1ebc	bl 0x00c374d0
00ab1ec0	cbz w0,0x00ab1fc0
00ab1ec4	mov w2,#0x1
00ab1ec8	mov x0,x20
00ab1ecc	mov x1,x27
00ab1ed0	bl 0x00c34240
00ab1ed4	cmp w0,#0x1
00ab1ed8	b.lt 0x00ab1fc0
00ab1edc	ldr x2,[x24, #0x20]
00ab1ee0	adrp x1,0x2a4000
00ab1ee4	mov w4,#0x8
00ab1ee8	mov x0,x20
00ab1eec	add x1,x1,#0x805
00ab1ef0	mov x3,x21
00ab1ef4	bl 0x00c3f080
00ab1ef8	cbz w0,0x00ab1fc0
00ab1efc	mov w2,#0x1
00ab1f00	mov x0,x20
00ab1f04	mov x1,x27
00ab1f08	bl 0x00c34240
00ab1f0c	cmp w0,#0x1
00ab1f10	b.lt 0x00ab1fc0
00ab1f14	ldr x0,[x19, #0x20]
00ab1f18	add w22,w22,#0x1
00ab1f1c	bl 0x00c325e0
00ab1f20	cmp w22,w0
00ab1f24	b.lt 0x00ab1d78
00ab1f28	ldr x2,[x19, #0x28]
00ab1f2c	adrp x1,0x2a4000
00ab1f30	add x1,x1,#0x820
00ab1f34	mov w4,#0x4
00ab1f38	mov x0,x20
00ab1f3c	mov x3,x21
00ab1f40	bl 0x00c3f080
00ab1f44	cbz w0,0x00ab1fc0
00ab1f48	ldr x2,[x19, #0x40]
00ab1f4c	add x1,x19,#0x30
00ab1f50	mov x0,x20
00ab1f54	bl 0x00c3f0a0
00ab1f58	cmp w0,#0x1
00ab1f5c	b.lt 0x00ab1fc0
00ab1f60	ldr x0,[x19, #0x48]
00ab1f64	bl 0x00c325e0
00ab1f68	cmp w0,#0x1
00ab1f6c	b.lt 0x00ab1fc8
00ab1f70	mov w22,wzr
00ab1f74	mov w21,#0x1
00ab1f78	ldr x0,[x19, #0x48]
00ab1f7c	mov w1,w22
00ab1f80	bl 0x00c32610
00ab1f84	mov x1,x0
00ab1f88	mov x0,x20
00ab1f8c	bl 0x00c3f090
00ab1f90	ldr x0,[x19, #0x48]
00ab1f94	mov w1,w22
00ab1f98	bl 0x00c32610
00ab1f9c	mov x1,x0
00ab1fa0	mov x0,x20
00ab1fa4	bl 0x00c32660
00ab1fa8	ldr x0,[x19, #0x48]
00ab1fac	add w22,w22,#0x1
00ab1fb0	bl 0x00c325e0
00ab1fb4	cmp w22,w0
00ab1fb8	b.lt 0x00ab1f78
00ab1fbc	b 0x00ab1cac
00ab1fc0	mov w21,wzr
00ab1fc4	b 0x00ab1cac
00ab1fc8	mov w21,#0x1
00ab1fcc	b 0x00ab1cac
