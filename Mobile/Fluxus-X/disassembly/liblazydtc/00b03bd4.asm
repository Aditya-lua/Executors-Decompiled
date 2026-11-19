; i2v_GENERAL_NAME @ 00b03bd4
00b03bd4	str x28,[sp, #-0x30]!
00b03bd8	stp x20,x19,[sp, #0x10]
00b03bdc	stp x29,x30,[sp, #0x20]
00b03be0	add x29,sp,#0x20
00b03be4	sub sp,sp,#0x240
00b03be8	sub x20,x29,#0x28
00b03bec	str x2,[x20]
00b03bf0	ldr w8,[x1]
00b03bf4	cmp w8,#0x8
00b03bf8	b.hi 0x00b03d60
00b03bfc	adrp x9,0x77b000
00b03c00	add x9,x9,#0x758
00b03c04	ldrsw x8,[x9, x8, LSL #0x2]
00b03c08	mov x19,x1
00b03c0c	add x8,x8,x9
00b03c10	br x8
00b03c14	ldr x8,[x19, #0x8]
00b03c18	ldr x0,[x8]
00b03c1c	bl 0x00c37750
00b03c20	sub w8,w0,#0x4b8
00b03c24	cmp w8,#0x3
00b03c28	b.hi 0x00b03d80
00b03c2c	adrp x9,0x77b000
00b03c30	add x9,x9,#0x77c
00b03c34	ldrsw x8,[x9, x8, LSL #0x2]
00b03c38	add x8,x8,x9
00b03c3c	br x8
00b03c40	ldr x8,[x19, #0x8]
00b03c44	mov x0,xzr
00b03c48	ldr x8,[x8, #0x8]
00b03c4c	ldr w9,[x8]
00b03c50	cmp w9,#0xc
00b03c54	b.ne 0x00b03d6c
00b03c58	ldr x8,[x8, #0x8]
00b03c5c	adrp x0,0x2d2000
00b03c60	add x0,x0,#0x4bd
00b03c64	b 0x00b03cd4
00b03c68	ldr x8,[x19, #0x8]
00b03c6c	adrp x0,0x29e000
00b03c70	add x0,x0,#0xbd8
00b03c74	b 0x00b03cd4
00b03c78	ldr x0,[x19, #0x8]
00b03c7c	add x1,sp,#0xc
00b03c80	mov w2,#0x100
00b03c84	bl 0x00c40ae0
00b03c88	cbz x0,0x00b03d6c
00b03c8c	adrp x0,0x2d8000
00b03c90	add x0,x0,#0x915
00b03c94	b 0x00b03d50
00b03c98	ldr x8,[x19, #0x8]
00b03c9c	adrp x0,0x2d2000
00b03ca0	add x0,x0,#0x471
00b03ca4	b 0x00b03cd4
00b03ca8	adrp x0,0x2ba000
00b03cac	add x0,x0,#0x863
00b03cb0	b 0x00b03cbc
00b03cb4	adrp x0,0x2ac000
00b03cb8	add x0,x0,#0x894
00b03cbc	adrp x1,0x2ce000
00b03cc0	add x1,x1,#0x4db
00b03cc4	b 0x00b03d54
00b03cc8	ldr x8,[x19, #0x8]
00b03ccc	adrp x0,0x2a0000
00b03cd0	add x0,x0,#0xd7a
00b03cd4	ldr x1,[x8, #0x8]
00b03cd8	ldrsw x2,[x8]
00b03cdc	sub x3,x29,#0x28
00b03ce0	bl 0x00c40b10
00b03ce4	cbnz w0,0x00b03d60
00b03ce8	b 0x00b03d68
00b03cec	ldr x8,[x19, #0x8]
00b03cf0	ldr x0,[x8, #0x8]
00b03cf4	ldr w1,[x8]
00b03cf8	bl 0x00c409c0
00b03cfc	mov x19,x0
00b03d00	cbz x0,0x00b03d1c
00b03d04	adrp x0,0x2d6000
00b03d08	add x0,x0,#0x711
00b03d0c	sub x2,x29,#0x28
00b03d10	mov x1,x19
00b03d14	bl 0x00c408c0
00b03d18	cbnz w0,0x00b03d20
00b03d1c	str xzr,[x20]
00b03d20	adrp x1,0x2bc000
00b03d24	add x1,x1,#0x63d
00b03d28	mov w2,#0xc3
00b03d2c	mov x0,x19
00b03d30	bl 0x00c32310
00b03d34	b 0x00b03d60
00b03d38	ldr x2,[x19, #0x8]
00b03d3c	add x0,sp,#0xc
00b03d40	mov w1,#0x100
00b03d44	bl 0x00c32dc0
00b03d48	adrp x0,0x2ba000
00b03d4c	add x0,x0,#0x86c
00b03d50	add x1,sp,#0xc
00b03d54	sub x2,x29,#0x28
00b03d58	bl 0x00c408c0
00b03d5c	cbz w0,0x00b03d68
00b03d60	ldr x0,[x20]
00b03d64	b 0x00b03d6c
00b03d68	mov x0,xzr
00b03d6c	add sp,sp,#0x240
00b03d70	ldp x29,x30,[sp, #0x20]
00b03d74	ldp x20,x19,[sp, #0x10]
00b03d78	ldr x28,[sp], #0x30
00b03d7c	ret
00b03d80	cmp w0,#0x289
00b03d84	b.ne 0x00b03e28
00b03d88	ldr x8,[x19, #0x8]
00b03d8c	mov x0,xzr
00b03d90	ldr x8,[x8, #0x8]
00b03d94	ldr w9,[x8]
00b03d98	cmp w9,#0xc
00b03d9c	b.ne 0x00b03d6c
00b03da0	ldr x8,[x8, #0x8]
00b03da4	adrp x0,0x2c0000
00b03da8	add x0,x0,#0x68d
00b03dac	b 0x00b03cd4
00b03db0	ldr x8,[x19, #0x8]
00b03db4	mov x0,xzr
00b03db8	ldr x8,[x8, #0x8]
00b03dbc	ldr w9,[x8]
00b03dc0	cmp w9,#0xc
00b03dc4	b.ne 0x00b03d6c
00b03dc8	ldr x8,[x8, #0x8]
00b03dcc	adrp x0,0x29e000
00b03dd0	add x0,x0,#0xbc3
00b03dd4	b 0x00b03cd4
00b03dd8	ldr x8,[x19, #0x8]
00b03ddc	mov x0,xzr
00b03de0	ldr x8,[x8, #0x8]
00b03de4	ldr w9,[x8]
00b03de8	cmp w9,#0x16
00b03dec	b.ne 0x00b03d6c
00b03df0	ldr x8,[x8, #0x8]
00b03df4	adrp x0,0x2a2000
00b03df8	add x0,x0,#0xe3b
00b03dfc	b 0x00b03cd4
00b03e00	ldr x8,[x19, #0x8]
00b03e04	mov x0,xzr
00b03e08	ldr x8,[x8, #0x8]
00b03e0c	ldr w9,[x8]
00b03e10	cmp w9,#0xc
00b03e14	b.ne 0x00b03d6c
00b03e18	ldr x8,[x8, #0x8]
00b03e1c	adrp x0,0x2d0000
00b03e20	add x0,x0,#0x500
00b03e24	b 0x00b03cd4
00b03e28	ldr x8,[x19, #0x8]
00b03e2c	add x0,sp,#0xc
00b03e30	mov w1,#0x100
00b03e34	mov w3,wzr
00b03e38	ldr x2,[x8]
00b03e3c	bl 0x00c32500
00b03e40	cmp w0,#0x1
00b03e44	b.lt 0x00b03e64
00b03e48	adrp x2,0x2aa000
00b03e4c	add x2,x2,#0xaf5
00b03e50	add x0,sp,#0x10c
00b03e54	mov w1,#0x12c
00b03e58	add x3,sp,#0xc
00b03e5c	bl 0x00c34d30
00b03e60	b 0x00b03e78
00b03e64	adrp x1,0x2a6000
00b03e68	add x1,x1,#0x8c3
00b03e6c	add x0,sp,#0x10c
00b03e70	mov w2,#0x12c
00b03e74	bl 0x00c387f0
00b03e78	ldr x8,[x19, #0x8]
00b03e7c	ldr x8,[x8, #0x8]
00b03e80	ldr w9,[x8]
00b03e84	cmp w9,#0x16
00b03e88	b.ne 0x00b03eb4
00b03e8c	ldr x8,[x8, #0x8]
00b03e90	add x0,sp,#0x10c
00b03e94	sub x3,x29,#0x28
00b03e98	ldr x1,[x8, #0x8]
00b03e9c	ldrsw x2,[x8]
00b03ea0	bl 0x00c40b10
00b03ea4	cbnz w0,0x00b03d60
00b03ea8	ldr x8,[x19, #0x8]
00b03eac	ldr x8,[x8, #0x8]
00b03eb0	ldr w9,[x8]
00b03eb4	cmp w9,#0xc
00b03eb8	b.ne 0x00b03ed8
00b03ebc	ldr x8,[x8, #0x8]
00b03ec0	add x0,sp,#0x10c
00b03ec4	sub x3,x29,#0x28
00b03ec8	ldr x1,[x8, #0x8]
00b03ecc	ldrsw x2,[x8]
00b03ed0	bl 0x00c40b10
00b03ed4	cbnz w0,0x00b03d60
00b03ed8	adrp x1,0x2ce000
00b03edc	add x1,x1,#0x4db
00b03ee0	add x0,sp,#0x10c
00b03ee4	b 0x00b03d54
