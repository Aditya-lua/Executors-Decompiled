; ssl3_ctx_ctrl @ 009a891c
009a891c	stp x22,x21,[sp, #-0x30]!
009a8920	sub w8,w1,#0x3
009a8924	stp x20,x19,[sp, #0x10]
009a8928	mov x20,x0
009a892c	cmp w8,#0x87
009a8930	mov x0,xzr
009a8934	stp x29,x30,[sp, #0x20]
009a8938	add x29,sp,#0x20
009a893c	b.hi 0x009a8e10
009a8940	adrp x9,0x74a000
009a8944	add x9,x9,#0xe08
009a8948	ldrsw x8,[x9, x8, LSL #0x2]
009a894c	mov x19,x3
009a8950	mov x21,x2
009a8954	add x8,x8,x9
009a8958	br x8
009a895c	cbz x19,0x009a8d70
009a8960	cmp x21,#0x50
009a8964	b.ne 0x009a8d78
009a8968	cmp w1,#0x3b
009a896c	add x8,x20,#0x228
009a8970	b.ne 0x009a8e20
009a8974	ldr q0,[x19]
009a8978	mov w0,#0x1
009a897c	str q0,[x8]
009a8980	ldr x8,[x20, #0x238]
009a8984	ldr q0,[x19, #0x20]
009a8988	str q0,[x8, #0x10]
009a898c	ldr q0,[x19, #0x10]
009a8990	str q0,[x8]
009a8994	ldr x8,[x20, #0x238]
009a8998	ldr q0,[x19, #0x40]
009a899c	str q0,[x8, #0x30]
009a89a0	ldr q0,[x19, #0x30]
009a89a4	str q0,[x8, #0x20]
009a89a8	b 0x009a8e10
009a89ac	cbz x19,0x009a8da0
009a89b0	mov x0,x19
009a89b4	bl 0x00c34950
009a89b8	cbz x0,0x009a8e7c
009a89bc	mov x19,x0
009a89c0	mov x0,x20
009a89c4	mov x1,x19
009a89c8	bl 0x00c347e0
009a89cc	cbnz w0,0x009a8e74
009a89d0	mov x0,x19
009a89d4	bl 0x00c32450
009a89d8	mov x0,xzr
009a89dc	b 0x009a8e10
009a89e0	cbz x19,0x009a8dbc
009a89e4	add x0,x20,#0x280
009a89e8	add x1,x20,#0x278
009a89ec	mov x2,x19
009a89f0	bl 0x00c34a60
009a89f4	b 0x009a8e0c
009a89f8	bl 0x00c342a0
009a89fc	adrp x0,0x2a3000
009a8a00	adrp x2,0x2db000
009a8a04	add x0,x0,#0xa43
009a8a08	add x2,x2,#0x7c1
009a8a0c	mov w1,#0xed4
009a8a10	bl 0x00c342b0
009a8a14	mov w8,#0x100
009a8a18	movk w8,#0xc, LSL #16
009a8a1c	add w1,w8,#0x1
009a8a20	b 0x009a8eec
009a8a24	ldr x0,[x20, #0x110]
009a8a28	cbnz x0,0x009a8a38
009a8a2c	bl 0x00c34780
009a8a30	str x0,[x20, #0x110]
009a8a34	cbz x0,0x009a8e98
009a8a38	mov x1,x19
009a8a3c	bl 0x00c347a0
009a8a40	cbnz w0,0x009a8e74
009a8a44	bl 0x00c342a0
009a8a48	adrp x0,0x2a3000
009a8a4c	adrp x2,0x2db000
009a8a50	add x0,x0,#0xa43
009a8a54	add x2,x2,#0x7c1
009a8a58	mov w1,#0xf77
009a8a5c	b 0x009a8eb0
009a8a60	str x19,[x20, #0x220]
009a8a64	mov w0,#0x1
009a8a68	b 0x009a8e10
009a8a6c	str x19,[x20, #0x258]
009a8a70	mov w0,#0x1
009a8a74	b 0x009a8e10
009a8a78	str w21,[x20, #0x260]
009a8a7c	mov w0,#0x1
009a8a80	b 0x009a8e10
009a8a84	ldr x8,[x20, #0x390]
009a8a88	str x19,[x20, #0x318]
009a8a8c	mov w0,#0x1
009a8a90	orr x8,x8,#0x20
009a8a94	str x8,[x20, #0x390]
009a8a98	b 0x009a8e10
009a8a9c	ldr x8,[x20, #0x390]
009a8aa0	ldr x0,[x20, #0x338]
009a8aa4	adrp x1,0x2a3000
009a8aa8	add x1,x1,#0xa43
009a8aac	orr x8,x8,#0x20
009a8ab0	mov w2,#0xf25
009a8ab4	str x8,[x20, #0x390]
009a8ab8	bl 0x00c32310
009a8abc	str xzr,[x20, #0x338]
009a8ac0	cbz x19,0x009a8e74
009a8ac4	mov x0,x19
009a8ac8	bl 0x00c2ff50
009a8acc	sub x8,x0,#0x1
009a8ad0	cmp x8,#0xff
009a8ad4	b.cc 0x009a8e58
009a8ad8	bl 0x00c342a0
009a8adc	adrp x0,0x2a3000
009a8ae0	adrp x2,0x2db000
009a8ae4	add x0,x0,#0xa43
009a8ae8	add x2,x2,#0x7c1
009a8aec	mov w1,#0xf2a
009a8af0	bl 0x00c342b0
009a8af4	mov w0,#0x14
009a8af8	mov w1,#0x165
009a8afc	b 0x009a8ef0
009a8b00	str w21,[x20, #0x388]
009a8b04	mov w0,#0x1
009a8b08	b 0x009a8e10
009a8b0c	ldr x0,[x20, #0x380]
009a8b10	adrp x8,0x9a8000
009a8b14	add x8,x8,#0xf00
009a8b18	str x8,[x20, #0x330]
009a8b1c	cbz x0,0x009a8b30
009a8b20	adrp x1,0x2a3000
009a8b24	add x1,x1,#0xa43
009a8b28	mov w2,#0xf36
009a8b2c	bl 0x00c32310
009a8b30	adrp x1,0x2a3000
009a8b34	add x1,x1,#0xa43
009a8b38	mov w2,#0xf37
009a8b3c	mov x0,x19
009a8b40	bl 0x00c34600
009a8b44	str x0,[x20, #0x380]
009a8b48	cbnz x0,0x009a8e74
009a8b4c	bl 0x00c342a0
009a8b50	adrp x0,0x2a3000
009a8b54	adrp x2,0x2db000
009a8b58	add x0,x0,#0xa43
009a8b5c	add x2,x2,#0x7c1
009a8b60	mov w1,#0xf38
009a8b64	b 0x009a8edc
009a8b68	ldr x8,[x20, #0x110]
009a8b6c	cbnz x21,0x009a8d3c
009a8b70	cbnz x8,0x009a8d3c
009a8b74	ldr x8,[x20, #0x158]
009a8b78	ldr x8,[x8]
009a8b7c	ldr x8,[x8, #0x10]
009a8b80	b 0x009a8d3c
009a8b84	adrp x1,0xcb4000
009a8b88	ldr x0,[x20, #0x110]
009a8b8c	ldr x1,[x1, #0xd88]
009a8b90	bl 0x00c32600
009a8b94	str xzr,[x20, #0x110]
009a8b98	mov w0,#0x1
009a8b9c	b 0x009a8e10
009a8ba0	cbz x21,0x009a8de8
009a8ba4	mov x0,xzr
009a8ba8	mov x1,x20
009a8bac	mov x2,x19
009a8bb0	bl 0x00c34900
009a8bb4	b 0x009a8e0c
009a8bb8	cbz x21,0x009a8dfc
009a8bbc	mov x0,xzr
009a8bc0	mov x1,x20
009a8bc4	mov x2,x19
009a8bc8	bl 0x00c348c0
009a8bcc	b 0x009a8e0c
009a8bd0	add x0,x20,#0x280
009a8bd4	add x1,x20,#0x278
009a8bd8	mov x2,x19
009a8bdc	mov x3,x21
009a8be0	bl 0x00c34b10
009a8be4	b 0x009a8e0c
009a8be8	add x1,x20,#0x280
009a8bec	add x2,x20,#0x278
009a8bf0	mov x0,x20
009a8bf4	mov x3,x19
009a8bf8	bl 0x00c34b20
009a8bfc	b 0x009a8e0c
009a8c00	ldr x0,[x20, #0x158]
009a8c04	mov x1,x19
009a8c08	mov x2,x21
009a8c0c	mov w3,wzr
009a8c10	bl 0x00c34b30
009a8c14	b 0x009a8e0c
009a8c18	ldr x0,[x20, #0x158]
009a8c1c	mov x1,x19
009a8c20	mov w2,wzr
009a8c24	bl 0x00c34b40
009a8c28	b 0x009a8e0c
009a8c2c	ldr x0,[x20, #0x158]
009a8c30	mov w3,#0x1
009a8c34	mov x1,x19
009a8c38	mov x2,x21
009a8c3c	bl 0x00c34b30
009a8c40	b 0x009a8e0c
009a8c44	ldr x0,[x20, #0x158]
009a8c48	mov w2,#0x1
009a8c4c	mov x1,x19
009a8c50	bl 0x00c34b40
009a8c54	b 0x009a8e0c
009a8c58	ldr x20,[x20, #0x158]
009a8c5c	adrp x1,0x2a3000
009a8c60	add x1,x1,#0xa43
009a8c64	mov w2,#0x111e
009a8c68	ldr x0,[x20, #0x188]
009a8c6c	bl 0x00c32310
009a8c70	mov w0,#0x1
009a8c74	stp xzr,xzr,[x20, #0x188]
009a8c78	cbz x21,0x009a8e10
009a8c7c	cbz x19,0x009a8e10
009a8c80	cmp x21,#0xff
009a8c84	mov x0,xzr
009a8c88	b.hi 0x009a8e10
009a8c8c	adrp x2,0x2a3000
009a8c90	add x2,x2,#0xa43
009a8c94	mov w3,#0x1125
009a8c98	mov x0,x19
009a8c9c	mov x1,x21
009a8ca0	add x22,x20,#0x188
009a8ca4	bl 0x00c345f0
009a8ca8	str x0,[x22]
009a8cac	cbz x0,0x009a8e10
009a8cb0	str x21,[x20, #0x190]
009a8cb4	mov w0,#0x1
009a8cb8	b 0x009a8e10
009a8cbc	mov x0,xzr
009a8cc0	mov x1,x20
009a8cc4	mov w2,w21
009a8cc8	bl 0x00c348a0
009a8ccc	b 0x009a8e0c
009a8cd0	ldr x0,[x20, #0x158]
009a8cd4	mov x1,x19
009a8cd8	mov w2,wzr
009a8cdc	b 0x009a8cec
009a8ce0	ldr x0,[x20, #0x158]
009a8ce4	mov w2,#0x1
009a8ce8	mov x1,x19
009a8cec	mov w3,w21
009a8cf0	bl 0x00c34910
009a8cf4	b 0x009a8e0c
009a8cf8	ldr x0,[x20, #0x158]
009a8cfc	mov x1,x19
009a8d00	bl 0x00c348e0
009a8d04	b 0x009a8e0c
009a8d08	ldr x0,[x20, #0x158]
009a8d0c	mov x1,x21
009a8d10	bl 0x00c34920
009a8d14	b 0x009a8e0c
009a8d18	ldr x8,[x20, #0x158]
009a8d1c	mov w0,#0x1
009a8d20	str w21,[x8, #0x18]
009a8d24	b 0x009a8e10
009a8d28	ldrsw x0,[x20, #0x260]
009a8d2c	b 0x009a8e10
009a8d30	ldr x8,[x20, #0x250]
009a8d34	b 0x009a8d3c
009a8d38	ldr x8,[x20, #0x258]
009a8d3c	str x8,[x19]
009a8d40	mov w0,#0x1
009a8d44	b 0x009a8e10
009a8d48	ldr x0,[x20, #0x158]
009a8d4c	mov x1,x19
009a8d50	mov w2,wzr
009a8d54	bl 0x00c348d0
009a8d58	b 0x009a8e0c
009a8d5c	ldr x0,[x20, #0x158]
009a8d60	mov w2,#0x1
009a8d64	mov x1,x19
009a8d68	bl 0x00c348d0
009a8d6c	b 0x009a8e0c
009a8d70	mov w0,#0x50
009a8d74	b 0x009a8e10
009a8d78	bl 0x00c342a0
009a8d7c	adrp x0,0x2a3000
009a8d80	adrp x2,0x2db000
009a8d84	add x0,x0,#0xa43
009a8d88	add x2,x2,#0x7c1
009a8d8c	mov w1,#0xef4
009a8d90	bl 0x00c342b0
009a8d94	mov w0,#0x14
009a8d98	mov w1,#0x145
009a8d9c	b 0x009a8ef0
009a8da0	bl 0x00c342a0
009a8da4	adrp x0,0x2a3000
009a8da8	adrp x2,0x2db000
009a8dac	add x0,x0,#0xa43
009a8db0	add x2,x2,#0x7c1
009a8db4	mov w1,#0xec4
009a8db8	b 0x009a8dd4
009a8dbc	bl 0x00c342a0
009a8dc0	adrp x0,0x2a3000
009a8dc4	adrp x2,0x2db000
009a8dc8	add x0,x0,#0xa43
009a8dcc	add x2,x2,#0x7c1
009a8dd0	mov w1,#0xedf
009a8dd4	bl 0x00c342b0
009a8dd8	mov w8,#0x100
009a8ddc	movk w8,#0xc, LSL #16
009a8de0	add w1,w8,#0x2
009a8de4	b 0x009a8eec
009a8de8	mov x0,xzr
009a8dec	mov x1,x20
009a8df0	mov x2,x19
009a8df4	bl 0x00c348f0
009a8df8	b 0x009a8e0c
009a8dfc	mov x0,xzr
009a8e00	mov x1,x20
009a8e04	mov x2,x19
009a8e08	bl 0x00c348b0
009a8e0c	sxtw x0,w0
009a8e10	ldp x29,x30,[sp, #0x20]
009a8e14	ldp x20,x19,[sp, #0x10]
009a8e18	ldp x22,x21,[sp], #0x30
009a8e1c	ret
009a8e20	ldr q0,[x8]
009a8e24	mov w0,#0x1
009a8e28	str q0,[x19]
009a8e2c	ldr x8,[x20, #0x238]
009a8e30	ldr q0,[x8, #0x10]
009a8e34	str q0,[x19, #0x20]
009a8e38	ldr q0,[x8]
009a8e3c	str q0,[x19, #0x10]
009a8e40	ldr x8,[x20, #0x238]
009a8e44	ldr q0,[x8, #0x30]
009a8e48	str q0,[x19, #0x40]
009a8e4c	ldr q0,[x8, #0x20]
009a8e50	str q0,[x19, #0x30]
009a8e54	b 0x009a8e10
009a8e58	adrp x1,0x2a3000
009a8e5c	add x1,x1,#0xa43
009a8e60	mov w2,#0xf2d
009a8e64	mov x0,x19
009a8e68	bl 0x00c34600
009a8e6c	str x0,[x20, #0x338]
009a8e70	cbz x0,0x009a8ec4
009a8e74	mov w0,#0x1
009a8e78	b 0x009a8e10
009a8e7c	bl 0x00c342a0
009a8e80	adrp x0,0x2a3000
009a8e84	adrp x2,0x2db000
009a8e88	add x0,x0,#0xa43
009a8e8c	add x2,x2,#0x7c1
009a8e90	mov w1,#0xec9
009a8e94	b 0x009a8eb0
009a8e98	bl 0x00c342a0
009a8e9c	adrp x0,0x2a3000
009a8ea0	adrp x2,0x2db000
009a8ea4	add x0,x0,#0xa43
009a8ea8	add x2,x2,#0x7c1
009a8eac	mov w1,#0xf72
009a8eb0	bl 0x00c342b0
009a8eb4	mov w1,#0x100
009a8eb8	mov w0,#0x14
009a8ebc	movk w1,#0xc, LSL #16
009a8ec0	b 0x009a8ef0
009a8ec4	bl 0x00c342a0
009a8ec8	adrp x0,0x2a3000
009a8ecc	adrp x2,0x2db000
009a8ed0	add x0,x0,#0xa43
009a8ed4	add x2,x2,#0x7c1
009a8ed8	mov w1,#0xf2e
009a8edc	bl 0x00c342b0
009a8ee0	mov w8,#0x100
009a8ee4	movk w8,#0xc, LSL #16
009a8ee8	add w1,w8,#0x3
009a8eec	mov w0,#0x14
009a8ef0	mov x2,xzr
009a8ef4	bl 0x00c342c0
009a8ef8	mov x0,xzr
009a8efc	b 0x009a8e10
