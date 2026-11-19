; FUN_00ae1ac4 @ 00ae1ac4
00ae1ac4	sub sp,sp,#0xe0
00ae1ac8	stp x28,x27,[sp, #0x80]
00ae1acc	stp x26,x25,[sp, #0x90]
00ae1ad0	stp x24,x23,[sp, #0xa0]
00ae1ad4	stp x22,x21,[sp, #0xb0]
00ae1ad8	stp x20,x19,[sp, #0xc0]
00ae1adc	stp x29,x30,[sp, #0xd0]
00ae1ae0	str x0,[sp]
00ae1ae4	cbz x2,0x00ae2998
00ae1ae8	ldr x8,[sp]
00ae1aec	ldp x10,x11,[x8]
00ae1af0	ldp x12,x18,[x8, #0x10]
00ae1af4	ldp x24,x28,[x8, #0x20]
00ae1af8	ldp x13,x25,[x8, #0x30]
00ae1afc	stp x2,x13,[sp, #0x48]
00ae1b00	bic x16,x13,x24
00ae1b04	ldp x9,x13,[x1, #0x20]
00ae1b08	ror x17,x10,#0x1c
00ae1b0c	mov x2,x11
00ae1b10	and x11,x11,x10
00ae1b14	ldp x21,x22,[x1]
00ae1b18	mov x29,x10
00ae1b1c	ldp x23,x8,[x1, #0x10]
00ae1b20	ldp x4,x5,[x1, #0x30]
00ae1b24	ldp x6,x10,[x1, #0x40]
00ae1b28	ldp x3,x7,[x1, #0x50]
00ae1b2c	ldp x26,x30,[x1, #0x60]
00ae1b30	str x1,[sp, #0x40]
00ae1b34	ror x19,x24,#0xe
00ae1b38	ldp x14,x1,[x1, #0x70]
00ae1b3c	and x15,x28,x24
00ae1b40	eor x0,x12,x2
00ae1b44	eor x19,x19,x24, ROR #0x12
00ae1b48	eor x15,x16,x15
00ae1b4c	eor x16,x17,x29, ROR #0x22
00ae1b50	and x17,x0,x29
00ae1b54	eor x0,x19,x24, ROR #0x29
00ae1b58	rev x27,x9
00ae1b5c	mov x9,#0xae22
00ae1b60	add x0,x25,x0
00ae1b64	movk x9,#0xd728, LSL #16
00ae1b68	and x20,x12,x2
00ae1b6c	str x1,[sp, #0x68]
00ae1b70	rev x1,x21
00ae1b74	add x15,x0,x15
00ae1b78	movk x9,#0x2f98, LSL #32
00ae1b7c	eor x16,x16,x29, ROR #0x27
00ae1b80	eor x17,x17,x20
00ae1b84	str x25,[sp, #0x8]
00ae1b88	rev x25,x8
00ae1b8c	add x8,x15,x1
00ae1b90	movk x9,#0x428a, LSL #48
00ae1b94	add x17,x17,x16
00ae1b98	add x8,x8,x9
00ae1b9c	add x9,x8,x18
00ae1ba0	add x8,x17,x8
00ae1ba4	rev x0,x22
00ae1ba8	rev x22,x13
00ae1bac	rev x21,x4
00ae1bb0	rev x4,x7
00ae1bb4	rev x7,x14
00ae1bb8	and x13,x9,x24
00ae1bbc	bic x14,x28,x9
00ae1bc0	ror x15,x8,#0x1c
00ae1bc4	eor x13,x13,x14
00ae1bc8	eor x14,x15,x8, ROR #0x22
00ae1bcc	ldr x15,[sp, #0x50]
00ae1bd0	rev x19,x6
00ae1bd4	rev x6,x10
00ae1bd8	ror x10,x9,#0xe
00ae1bdc	eor x10,x10,x9, ROR #0x12
00ae1be0	eor x10,x10,x9, ROR #0x29
00ae1be4	add x13,x15,x13
00ae1be8	add x10,x13,x10
00ae1bec	mov x13,#0x65cd
00ae1bf0	movk x13,#0x23ef, LSL #16
00ae1bf4	str x18,[sp, #0x20]
00ae1bf8	and x18,x8,x2
00ae1bfc	movk x13,#0x4491, LSL #32
00ae1c00	and x17,x8,x29
00ae1c04	eor x11,x18,x11
00ae1c08	add x10,x10,x0
00ae1c0c	movk x13,#0x7137, LSL #48
00ae1c10	eor x14,x14,x8, ROR #0x27
00ae1c14	eor x11,x11,x17
00ae1c18	add x10,x10,x13
00ae1c1c	add x11,x14,x11
00ae1c20	add x13,x10,x12
00ae1c24	add x10,x11,x10
00ae1c28	ror x11,x13,#0xe
00ae1c2c	and x14,x13,x9
00ae1c30	bic x15,x24,x13
00ae1c34	str x12,[sp, #0x28]
00ae1c38	eor x11,x11,x13, ROR #0x12
00ae1c3c	eor x14,x14,x15
00ae1c40	mov x12,#0x3b2f
00ae1c44	eor x11,x11,x13, ROR #0x29
00ae1c48	add x14,x28,x14
00ae1c4c	movk x12,#0xec4d, LSL #16
00ae1c50	rev x23,x23
00ae1c54	str x0,[sp, #0x78]
00ae1c58	ror x17,x10,#0x1c
00ae1c5c	eor x0,x10,x8
00ae1c60	add x11,x14,x11
00ae1c64	movk x12,#0xfbcf, LSL #32
00ae1c68	and x18,x10,x8
00ae1c6c	eor x15,x17,x10, ROR #0x22
00ae1c70	and x17,x0,x29
00ae1c74	add x11,x11,x23
00ae1c78	movk x12,#0xb5c0, LSL #48
00ae1c7c	eor x15,x15,x10, ROR #0x27
00ae1c80	eor x17,x17,x18
00ae1c84	add x11,x11,x12
00ae1c88	add x14,x15,x17
00ae1c8c	add x15,x11,x2
00ae1c90	add x11,x14,x11
00ae1c94	ror x14,x15,#0xe
00ae1c98	and x17,x15,x13
00ae1c9c	bic x18,x9,x15
00ae1ca0	eor x17,x17,x18
00ae1ca4	eor x14,x14,x15, ROR #0x12
00ae1ca8	mov x12,#0xdbbc
00ae1cac	eor x14,x14,x15, ROR #0x29
00ae1cb0	add x17,x24,x17
00ae1cb4	movk x12,#0x8189, LSL #16
00ae1cb8	str x2,[sp, #0x30]
00ae1cbc	ror x0,x11,#0x1c
00ae1cc0	eor x2,x11,x10
00ae1cc4	add x14,x17,x14
00ae1cc8	movk x12,#0xdba5, LSL #32
00ae1ccc	str x1,[sp, #0x70]
00ae1cd0	and x1,x11,x10
00ae1cd4	eor x0,x0,x11, ROR #0x22
00ae1cd8	and x2,x2,x8
00ae1cdc	add x14,x14,x25
00ae1ce0	movk x12,#0xe9b5, LSL #48
00ae1ce4	eor x0,x0,x11, ROR #0x27
00ae1ce8	eor x1,x2,x1
00ae1cec	add x14,x14,x12
00ae1cf0	add x17,x0,x1
00ae1cf4	add x0,x14,x29
00ae1cf8	and x1,x0,x15
00ae1cfc	bic x2,x13,x0
00ae1d00	add x14,x17,x14
00ae1d04	eor x1,x1,x2
00ae1d08	ror x17,x0,#0xe
00ae1d0c	add x9,x9,x1
00ae1d10	eor x1,x14,x11
00ae1d14	mov x12,#0xb538
00ae1d18	and x2,x14,x11
00ae1d1c	and x1,x1,x10
00ae1d20	eor x17,x17,x0, ROR #0x12
00ae1d24	movk x12,#0xf348, LSL #16
00ae1d28	eor x1,x1,x2
00ae1d2c	ror x2,x14,#0x1c
00ae1d30	eor x17,x17,x0, ROR #0x29
00ae1d34	add x9,x9,x27
00ae1d38	movk x12,#0xc25b, LSL #32
00ae1d3c	eor x2,x2,x14, ROR #0x22
00ae1d40	add x9,x9,x17
00ae1d44	movk x12,#0x3956, LSL #48
00ae1d48	eor x2,x2,x14, ROR #0x27
00ae1d4c	add x9,x9,x12
00ae1d50	add x1,x2,x1
00ae1d54	add x8,x9,x8
00ae1d58	add x18,x15,x21
00ae1d5c	add x9,x1,x9
00ae1d60	and x1,x8,x0
00ae1d64	bic x15,x15,x8
00ae1d68	ror x17,x8,#0xe
00ae1d6c	eor x15,x1,x15
00ae1d70	mov x12,#0xd019
00ae1d74	add x13,x13,x15
00ae1d78	eor x15,x9,x14
00ae1d7c	eor x17,x17,x8, ROR #0x12
00ae1d80	movk x12,#0xb605, LSL #16
00ae1d84	and x1,x9,x14
00ae1d88	and x15,x15,x11
00ae1d8c	eor x17,x17,x8, ROR #0x29
00ae1d90	add x13,x13,x22
00ae1d94	movk x12,#0x11f1, LSL #32
00ae1d98	eor x15,x15,x1
00ae1d9c	ror x1,x9,#0x1c
00ae1da0	add x13,x13,x17
00ae1da4	movk x12,#0x59f1, LSL #48
00ae1da8	eor x1,x1,x9, ROR #0x22
00ae1dac	add x13,x13,x12
00ae1db0	rev x20,x5
00ae1db4	eor x1,x1,x9, ROR #0x27
00ae1db8	add x10,x13,x10
00ae1dbc	add x2,x0,x20
00ae1dc0	add x15,x1,x15
00ae1dc4	and x17,x10,x8
00ae1dc8	bic x0,x0,x10
00ae1dcc	add x13,x15,x13
00ae1dd0	ror x15,x10,#0xe
00ae1dd4	eor x17,x17,x0
00ae1dd8	mov x12,#0x4f9b
00ae1ddc	add x17,x18,x17
00ae1de0	eor x18,x13,x9
00ae1de4	eor x15,x15,x10, ROR #0x12
00ae1de8	movk x12,#0xaf19, LSL #16
00ae1dec	and x0,x13,x9
00ae1df0	and x18,x18,x14
00ae1df4	eor x15,x15,x10, ROR #0x29
00ae1df8	movk x12,#0x82a4, LSL #32
00ae1dfc	eor x18,x18,x0
00ae1e00	ror x0,x13,#0x1c
00ae1e04	add x15,x17,x15
00ae1e08	movk x12,#0x923f, LSL #48
00ae1e0c	eor x0,x0,x13, ROR #0x22
00ae1e10	add x15,x15,x12
00ae1e14	eor x0,x0,x13, ROR #0x27
00ae1e18	add x11,x15,x11
00ae1e1c	add x1,x8,x19
00ae1e20	add x18,x0,x18
00ae1e24	and x0,x11,x10
00ae1e28	bic x8,x8,x11
00ae1e2c	add x15,x18,x15
00ae1e30	ror x18,x11,#0xe
00ae1e34	eor x8,x0,x8
00ae1e38	mov x12,#0x8118
00ae1e3c	add x8,x2,x8
00ae1e40	eor x2,x15,x13
00ae1e44	eor x18,x18,x11, ROR #0x12
00ae1e48	movk x12,#0xda6d, LSL #16
00ae1e4c	and x0,x15,x13
00ae1e50	and x2,x2,x9
00ae1e54	eor x18,x18,x11, ROR #0x29
00ae1e58	movk x12,#0x5ed5, LSL #32
00ae1e5c	eor x0,x2,x0
00ae1e60	ror x2,x15,#0x1c
00ae1e64	add x8,x8,x18
00ae1e68	movk x12,#0xab1c, LSL #48
00ae1e6c	eor x2,x2,x15, ROR #0x22
00ae1e70	add x8,x8,x12
00ae1e74	eor x2,x2,x15, ROR #0x27
00ae1e78	add x14,x8,x14
00ae1e7c	add x17,x10,x6
00ae1e80	add x0,x2,x0
00ae1e84	and x2,x14,x11
00ae1e88	bic x10,x10,x14
00ae1e8c	add x8,x0,x8
00ae1e90	ror x0,x14,#0xe
00ae1e94	eor x10,x2,x10
00ae1e98	mov x12,#0x242
00ae1e9c	add x10,x1,x10
00ae1ea0	eor x1,x8,x15
00ae1ea4	eor x0,x0,x14, ROR #0x12
00ae1ea8	movk x12,#0xa303, LSL #16
00ae1eac	and x2,x8,x15
00ae1eb0	and x1,x1,x13
00ae1eb4	eor x0,x0,x14, ROR #0x29
00ae1eb8	movk x12,#0xaa98, LSL #32
00ae1ebc	eor x1,x1,x2
00ae1ec0	ror x2,x8,#0x1c
00ae1ec4	add x10,x10,x0
00ae1ec8	movk x12,#0xd807, LSL #48
00ae1ecc	eor x2,x2,x8, ROR #0x22
00ae1ed0	add x10,x10,x12
00ae1ed4	rev x5,x3
00ae1ed8	eor x2,x2,x8, ROR #0x27
00ae1edc	add x9,x10,x9
00ae1ee0	add x18,x11,x5
00ae1ee4	add x1,x2,x1
00ae1ee8	and x2,x9,x14
00ae1eec	bic x11,x11,x9
00ae1ef0	add x10,x1,x10
00ae1ef4	ror x1,x9,#0xe
00ae1ef8	eor x11,x2,x11
00ae1efc	mov x12,#0x6fbe
00ae1f00	add x11,x17,x11
00ae1f04	eor x17,x10,x8
00ae1f08	eor x1,x1,x9, ROR #0x12
00ae1f0c	movk x12,#0x4570, LSL #16
00ae1f10	and x2,x10,x8
00ae1f14	and x17,x17,x15
00ae1f18	eor x1,x1,x9, ROR #0x29
00ae1f1c	movk x12,#0x5b01, LSL #32
00ae1f20	eor x17,x17,x2
00ae1f24	ror x2,x10,#0x1c
00ae1f28	add x11,x11,x1
00ae1f2c	movk x12,#0x1283, LSL #48
00ae1f30	eor x2,x2,x10, ROR #0x22
00ae1f34	add x11,x11,x12
00ae1f38	eor x2,x2,x10, ROR #0x27
00ae1f3c	add x13,x11,x13
00ae1f40	add x0,x14,x4
00ae1f44	add x17,x2,x17
00ae1f48	and x2,x13,x9
00ae1f4c	bic x14,x14,x13
00ae1f50	add x11,x17,x11
00ae1f54	ror x17,x13,#0xe
00ae1f58	eor x14,x2,x14
00ae1f5c	mov x12,#0xb28c
00ae1f60	add x14,x18,x14
00ae1f64	eor x18,x11,x10
00ae1f68	eor x17,x17,x13, ROR #0x12
00ae1f6c	movk x12,#0x4ee4, LSL #16
00ae1f70	and x2,x11,x10
00ae1f74	and x18,x18,x8
00ae1f78	eor x17,x17,x13, ROR #0x29
00ae1f7c	movk x12,#0x85be, LSL #32
00ae1f80	eor x18,x18,x2
00ae1f84	ror x2,x11,#0x1c
00ae1f88	add x14,x14,x17
00ae1f8c	movk x12,#0x2431, LSL #48
00ae1f90	eor x2,x2,x11, ROR #0x22
00ae1f94	add x14,x14,x12
00ae1f98	rev x3,x26
00ae1f9c	eor x2,x2,x11, ROR #0x27
00ae1fa0	add x15,x14,x15
00ae1fa4	add x1,x9,x3
00ae1fa8	add x18,x2,x18
00ae1fac	and x2,x15,x13
00ae1fb0	bic x9,x9,x15
00ae1fb4	add x18,x18,x14
00ae1fb8	eor x9,x2,x9
00ae1fbc	ror x14,x15,#0xe
00ae1fc0	add x9,x0,x9
00ae1fc4	eor x0,x18,x11
00ae1fc8	mov x12,#0xb4e2
00ae1fcc	and x2,x18,x11
00ae1fd0	and x0,x0,x10
00ae1fd4	eor x14,x14,x15, ROR #0x12
00ae1fd8	movk x12,#0xd5ff, LSL #16
00ae1fdc	eor x0,x0,x2
00ae1fe0	ror x2,x18,#0x1c
00ae1fe4	eor x14,x14,x15, ROR #0x29
00ae1fe8	movk x12,#0x7dc3, LSL #32
00ae1fec	add x9,x9,x14
00ae1ff0	eor x14,x2,x18, ROR #0x22
00ae1ff4	movk x12,#0x550c, LSL #48
00ae1ff8	eor x14,x14,x18, ROR #0x27
00ae1ffc	add x9,x9,x12
00ae2000	rev x16,x30
00ae2004	add x14,x14,x0
00ae2008	add x8,x9,x8
00ae200c	add x17,x13,x16
00ae2010	add x0,x14,x9
00ae2014	and x14,x8,x15
00ae2018	bic x13,x13,x8
00ae201c	eor x13,x14,x13
00ae2020	add x13,x1,x13
00ae2024	eor x1,x0,x18
00ae2028	ror x9,x8,#0xe
00ae202c	and x14,x0,x18
00ae2030	and x1,x1,x11
00ae2034	mov x12,#0x896f
00ae2038	eor x14,x1,x14
00ae203c	ror x1,x0,#0x1c
00ae2040	eor x9,x9,x8, ROR #0x12
00ae2044	movk x12,#0xf27b, LSL #16
00ae2048	eor x1,x1,x0, ROR #0x22
00ae204c	eor x9,x9,x8, ROR #0x29
00ae2050	movk x12,#0x5d74, LSL #32
00ae2054	eor x1,x1,x0, ROR #0x27
00ae2058	add x9,x13,x9
00ae205c	movk x12,#0x72be, LSL #48
00ae2060	add x13,x1,x14
00ae2064	add x14,x9,x12
00ae2068	add x9,x14,x10
00ae206c	str x29,[sp, #0x38]
00ae2070	add x29,x13,x14
00ae2074	ror x10,x9,#0xe
00ae2078	and x13,x9,x8
00ae207c	bic x14,x15,x9
00ae2080	mov x12,#0x96b1
00ae2084	eor x13,x13,x14
00ae2088	eor x10,x10,x9, ROR #0x12
00ae208c	movk x12,#0x3b16, LSL #16
00ae2090	str x24,[sp, #0x18]
00ae2094	add x24,x15,x7
00ae2098	ror x15,x29,#0x1c
00ae209c	add x13,x17,x13
00ae20a0	eor x17,x29,x0
00ae20a4	eor x10,x10,x9, ROR #0x29
00ae20a8	movk x12,#0xb1fe, LSL #32
00ae20ac	and x14,x29,x0
00ae20b0	eor x15,x15,x29, ROR #0x22
00ae20b4	and x17,x17,x18
00ae20b8	add x10,x13,x10
00ae20bc	movk x12,#0x80de, LSL #48
00ae20c0	eor x15,x15,x29, ROR #0x27
00ae20c4	eor x14,x17,x14
00ae20c8	add x10,x10,x12
00ae20cc	add x13,x15,x14
00ae20d0	add x14,x10,x11
00ae20d4	add x26,x13,x10
00ae20d8	ror x10,x14,#0xe
00ae20dc	and x11,x14,x9
00ae20e0	bic x13,x8,x14
00ae20e4	mov x12,#0x1235
00ae20e8	eor x11,x11,x13
00ae20ec	eor x10,x10,x14, ROR #0x12
00ae20f0	movk x12,#0x25c7, LSL #16
00ae20f4	add x11,x24,x11
00ae20f8	eor x10,x10,x14, ROR #0x29
00ae20fc	movk x12,#0x6a7, LSL #32
00ae2100	add x10,x11,x10
00ae2104	movk x12,#0x9bdc, LSL #48
00ae2108	ror x15,x26,#0x1c
00ae210c	eor x17,x26,x29
00ae2110	add x10,x10,x12
00ae2114	ldr x12,[sp, #0x68]
00ae2118	and x13,x26,x29
00ae211c	eor x15,x15,x26, ROR #0x22
00ae2120	and x11,x17,x0
00ae2124	eor x15,x15,x26, ROR #0x27
00ae2128	eor x11,x11,x13
00ae212c	add x11,x15,x11
00ae2130	add x15,x10,x18
00ae2134	add x24,x11,x10
00ae2138	and x10,x15,x14
00ae213c	bic x11,x9,x15
00ae2140	rev x30,x12
00ae2144	eor x10,x10,x11
00ae2148	add x8,x8,x30
00ae214c	add x8,x8,x10
00ae2150	ror x10,x15,#0xe
00ae2154	eor x10,x10,x15, ROR #0x12
00ae2158	eor x10,x10,x15, ROR #0x29
00ae215c	add x8,x8,x10
00ae2160	ror x10,x24,#0x1c
00ae2164	and x11,x24,x17
00ae2168	eor x10,x10,x24, ROR #0x22
00ae216c	eor x11,x11,x13
00ae2170	eor x10,x10,x24, ROR #0x27
00ae2174	add x10,x10,x11
00ae2178	adrp x11,0x775000
00ae217c	add x11,x11,#0xcd0
00ae2180	add x17,x11,#0xf8
00ae2184	mov x11,#0x2694
00ae2188	movk x11,#0xcf69, LSL #16
00ae218c	movk x11,#0xf174, LSL #32
00ae2190	movk x11,#0xc19b, LSL #48
00ae2194	add x8,x8,x11
00ae2198	add x0,x8,x0
00ae219c	add x11,x10,x8
00ae21a0	mov w8,#0x10
00ae21a4	str x28,[sp, #0x10]
00ae21a8	str x8,[sp, #0x68]
00ae21ac	and x12,x15,x0
00ae21b0	bic x13,x14,x0
00ae21b4	ror x8,x11,#0x1c
00ae21b8	eor x18,x26,x24
00ae21bc	eor x28,x13,x12
00ae21c0	and x12,x26,x24
00ae21c4	and x13,x18,x11
00ae21c8	eor x8,x8,x11, ROR #0x22
00ae21cc	ror x10,x0,#0xe
00ae21d0	eor x18,x13,x12
00ae21d4	eor x8,x8,x11, ROR #0x27
00ae21d8	eor x10,x10,x0, ROR #0x12
00ae21dc	add x8,x18,x8
00ae21e0	ror x1,x23,#0x8
00ae21e4	eor x10,x10,x0, ROR #0x29
00ae21e8	str x8,[sp, #0x60]
00ae21ec	ror x8,x25,#0x8
00ae21f0	add x13,x10,x9
00ae21f4	eor x9,x1,x23, LSR #0x7
00ae21f8	eor x8,x8,x25, LSR #0x7
00ae21fc	eor x10,x9,x23, ROR #0x1
00ae2200	add x9,x23,x4
00ae2204	eor x8,x8,x25, ROR #0x1
00ae2208	add x23,x9,x8
00ae220c	ror x8,x27,#0x8
00ae2210	eor x8,x8,x27, LSR #0x7
00ae2214	add x9,x25,x3
00ae2218	eor x8,x8,x27, ROR #0x1
00ae221c	add x25,x9,x8
00ae2220	ror x8,x22,#0x8
00ae2224	eor x8,x8,x22, LSR #0x7
00ae2228	add x9,x27,x16
00ae222c	eor x8,x8,x22, ROR #0x1
00ae2230	add x27,x9,x8
00ae2234	ror x8,x21,#0x8
00ae2238	eor x8,x8,x21, LSR #0x7
00ae223c	add x9,x22,x7
00ae2240	eor x8,x8,x21, ROR #0x1
00ae2244	add x22,x9,x8
00ae2248	ror x8,x20,#0x8
00ae224c	eor x8,x8,x20, LSR #0x7
00ae2250	add x9,x21,x30
00ae2254	eor x8,x8,x20, ROR #0x1
00ae2258	add x21,x9,x8
00ae225c	ror x8,x19,#0x8
00ae2260	eor x8,x8,x19, LSR #0x7
00ae2264	eor x8,x8,x19, ROR #0x1
00ae2268	add x20,x8,x20
00ae226c	ror x8,x6,#0x8
00ae2270	eor x8,x8,x6, LSR #0x7
00ae2274	eor x8,x8,x6, ROR #0x1
00ae2278	ror x2,x7,#0x3d
00ae227c	add x19,x8,x19
00ae2280	ror x8,x5,#0x8
00ae2284	eor x9,x2,x7, LSR #0x6
00ae2288	eor x8,x8,x5, LSR #0x7
00ae228c	eor x9,x9,x7, ROR #0x13
00ae2290	eor x8,x8,x5, ROR #0x1
00ae2294	ror x12,x30,#0x3d
00ae2298	add x9,x6,x9
00ae229c	add x6,x8,x6
00ae22a0	ror x8,x4,#0x8
00ae22a4	eor x12,x12,x30, LSR #0x6
00ae22a8	eor x8,x8,x4, LSR #0x7
00ae22ac	eor x12,x12,x30, ROR #0x13
00ae22b0	eor x18,x8,x4, ROR #0x1
00ae22b4	add x8,x5,x12
00ae22b8	add x5,x18,x5
00ae22bc	ror x18,x16,#0x8
00ae22c0	ror x12,x3,#0x8
00ae22c4	eor x18,x18,x16, LSR #0x7
00ae22c8	eor x12,x12,x3, LSR #0x7
00ae22cc	eor x18,x18,x16, ROR #0x1
00ae22d0	eor x12,x12,x3, ROR #0x1
00ae22d4	add x3,x18,x3
00ae22d8	ror x18,x7,#0x8
00ae22dc	eor x18,x18,x7, LSR #0x7
00ae22e0	eor x18,x18,x7, ROR #0x1
00ae22e4	add x16,x18,x16
00ae22e8	ror x18,x30,#0x8
00ae22ec	eor x18,x18,x30, LSR #0x7
00ae22f0	eor x18,x18,x30, ROR #0x1
00ae22f4	add x18,x18,x7
00ae22f8	str x18,[sp, #0x58]
00ae22fc	ldp x18,x2,[sp, #0x70]
00ae2300	add x13,x13,x28
00ae2304	add x12,x12,x4
00ae2308	and x1,x24,x11
00ae230c	add x9,x9,x18
00ae2310	ror x18,x2,#0x8
00ae2314	eor x18,x18,x2, LSR #0x7
00ae2318	eor x18,x18,x2, ROR #0x1
00ae231c	add x7,x9,x18
00ae2320	ldp x9,x18,[x17, #-0x78]
00ae2324	add x8,x8,x2
00ae2328	ldr x2,[sp, #0x60]
00ae232c	add x28,x8,x10
00ae2330	add x8,x13,x7
00ae2334	add x8,x8,x9
00ae2338	add x13,x28,x14
00ae233c	ror x14,x7,#0x3d
00ae2340	ldp x9,x10,[x17, #-0x68]
00ae2344	add x13,x13,x18
00ae2348	add x18,x8,x29
00ae234c	add x8,x2,x8
00ae2350	ror x2,x28,#0x3d
00ae2354	eor x14,x14,x7, LSR #0x6
00ae2358	eor x14,x14,x7, ROR #0x13
00ae235c	eor x2,x2,x28, LSR #0x6
00ae2360	add x23,x23,x14
00ae2364	eor x2,x2,x28, ROR #0x13
00ae2368	add x25,x25,x2
00ae236c	bic x4,x15,x18
00ae2370	add x15,x23,x15
00ae2374	add x15,x15,x9
00ae2378	add x9,x25,x0
00ae237c	and x2,x18,x0
00ae2380	add x10,x9,x10
00ae2384	ror x9,x18,#0xe
00ae2388	eor x2,x2,x4
00ae238c	eor x9,x9,x18, ROR #0x12
00ae2390	add x13,x13,x2
00ae2394	eor x9,x9,x18, ROR #0x29
00ae2398	and x4,x8,x24
00ae239c	add x9,x13,x9
00ae23a0	ror x13,x8,#0x1c
00ae23a4	eor x1,x4,x1
00ae23a8	and x4,x8,x11
00ae23ac	eor x13,x13,x8, ROR #0x22
00ae23b0	eor x1,x1,x4
00ae23b4	eor x13,x13,x8, ROR #0x27
00ae23b8	add x13,x13,x1
00ae23bc	ror x1,x23,#0x3d
00ae23c0	eor x1,x1,x23, LSR #0x6
00ae23c4	ldp x2,x4,[x17, #-0x58]
00ae23c8	add x26,x9,x26
00ae23cc	eor x1,x1,x23, ROR #0x13
00ae23d0	add x9,x13,x9
00ae23d4	ror x13,x25,#0x3d
00ae23d8	add x27,x27,x1
00ae23dc	and x1,x26,x18
00ae23e0	bic x0,x0,x26
00ae23e4	eor x13,x13,x25, LSR #0x6
00ae23e8	eor x0,x1,x0
00ae23ec	eor x13,x13,x25, ROR #0x13
00ae23f0	add x1,x18,x27
00ae23f4	add x15,x15,x0
00ae23f8	eor x0,x9,x8
00ae23fc	add x22,x22,x13
00ae2400	ror x13,x26,#0xe
00ae2404	add x1,x1,x2
00ae2408	and x2,x9,x8
00ae240c	and x0,x0,x11
00ae2410	eor x0,x0,x2
00ae2414	ror x2,x9,#0x1c
00ae2418	eor x13,x13,x26, ROR #0x12
00ae241c	eor x13,x13,x26, ROR #0x29
00ae2420	eor x2,x2,x9, ROR #0x22
00ae2424	add x13,x15,x13
00ae2428	eor x2,x2,x9, ROR #0x27
00ae242c	add x0,x2,x0
00ae2430	add x24,x13,x24
00ae2434	ror x15,x27,#0x3d
00ae2438	add x13,x0,x13
00ae243c	and x0,x24,x26
00ae2440	bic x18,x18,x24
00ae2444	eor x15,x15,x27, LSR #0x6
00ae2448	eor x18,x0,x18
00ae244c	eor x15,x15,x27, ROR #0x13
00ae2450	add x10,x10,x18
00ae2454	eor x18,x13,x9
00ae2458	ror x14,x7,#0x8
00ae245c	ror x2,x22,#0x3d
00ae2460	add x21,x21,x15
00ae2464	and x0,x13,x9
00ae2468	and x18,x18,x8
00ae246c	eor x14,x14,x7, LSR #0x7
00ae2470	eor x2,x2,x22, LSR #0x6
00ae2474	eor x18,x18,x0
00ae2478	ror x0,x21,#0x3d
00ae247c	eor x14,x14,x7, ROR #0x1
00ae2480	str x7,[sp, #0x70]
00ae2484	add x7,x20,x7
00ae2488	eor x2,x2,x22, ROR #0x13
00ae248c	eor x0,x0,x21, LSR #0x6
00ae2490	add x20,x7,x2
00ae2494	add x7,x19,x28
00ae2498	eor x0,x0,x21, ROR #0x13
00ae249c	add x19,x7,x0
00ae24a0	ror x0,x20,#0x3d
00ae24a4	eor x0,x0,x20, LSR #0x6
00ae24a8	add x6,x6,x23
00ae24ac	eor x0,x0,x20, ROR #0x13
00ae24b0	add x6,x6,x0
00ae24b4	ror x0,x24,#0xe
00ae24b8	eor x0,x0,x24, ROR #0x12
00ae24bc	eor x0,x0,x24, ROR #0x29
00ae24c0	add x10,x10,x0
00ae24c4	ror x0,x13,#0x1c
00ae24c8	eor x0,x0,x13, ROR #0x22
00ae24cc	eor x0,x0,x13, ROR #0x27
00ae24d0	add x4,x4,x22
00ae24d4	add x18,x0,x18
00ae24d8	add x11,x10,x11
00ae24dc	str x28,[sp, #0x78]
00ae24e0	add x28,x4,x26
00ae24e4	add x10,x18,x10
00ae24e8	and x18,x11,x24
00ae24ec	bic x4,x26,x11
00ae24f0	eor x18,x18,x4
00ae24f4	ror x4,x6,#0x3d
00ae24f8	ror x0,x19,#0x3d
00ae24fc	eor x4,x4,x6, LSR #0x6
00ae2500	add x12,x12,x27
00ae2504	eor x0,x0,x19, LSR #0x6
00ae2508	eor x4,x4,x6, ROR #0x13
00ae250c	add x18,x1,x18
00ae2510	eor x1,x10,x13
00ae2514	add x5,x5,x25
00ae2518	eor x0,x0,x19, ROR #0x13
00ae251c	add x4,x12,x4
00ae2520	and x12,x10,x13
00ae2524	and x1,x1,x9
00ae2528	add x5,x5,x0
00ae252c	ror x0,x11,#0xe
00ae2530	eor x12,x1,x12
00ae2534	ror x1,x10,#0x1c
00ae2538	eor x0,x0,x11, ROR #0x12
00ae253c	eor x1,x1,x10, ROR #0x22
00ae2540	eor x0,x0,x11, ROR #0x29
00ae2544	eor x1,x1,x10, ROR #0x27
00ae2548	add x18,x18,x0
00ae254c	add x12,x1,x12
00ae2550	add x8,x18,x8
00ae2554	add x12,x12,x18
00ae2558	ror x18,x5,#0x3d
00ae255c	ldp x15,x2,[x17, #-0x48]
00ae2560	eor x18,x18,x5, LSR #0x6
00ae2564	add x3,x3,x22
00ae2568	eor x18,x18,x5, ROR #0x13
00ae256c	add x3,x3,x18
00ae2570	ror x18,x4,#0x3d
00ae2574	eor x18,x18,x4, LSR #0x6
00ae2578	add x15,x15,x21
00ae257c	add x16,x16,x21
00ae2580	eor x18,x18,x4, ROR #0x13
00ae2584	add x15,x15,x24
00ae2588	add x16,x16,x18
00ae258c	and x18,x8,x11
00ae2590	bic x24,x24,x8
00ae2594	eor x26,x12,x10
00ae2598	eor x18,x18,x24
00ae259c	and x24,x12,x10
00ae25a0	and x26,x26,x13
00ae25a4	eor x24,x26,x24
00ae25a8	ror x26,x8,#0xe
00ae25ac	eor x26,x26,x8, ROR #0x12
00ae25b0	add x18,x28,x18
00ae25b4	eor x26,x26,x8, ROR #0x29
00ae25b8	add x18,x18,x26
00ae25bc	ror x26,x12,#0x1c
00ae25c0	eor x26,x26,x12, ROR #0x22
00ae25c4	eor x26,x26,x12, ROR #0x27
00ae25c8	add x24,x26,x24
00ae25cc	add x9,x18,x9
00ae25d0	add x18,x24,x18
00ae25d4	ror x24,x16,#0x3d
00ae25d8	add x14,x14,x30
00ae25dc	eor x24,x24,x16, LSR #0x6
00ae25e0	add x2,x2,x20
00ae25e4	add x14,x14,x19
00ae25e8	eor x24,x24,x16, ROR #0x13
00ae25ec	add x2,x2,x11
00ae25f0	add x30,x14,x24
00ae25f4	and x24,x9,x8
00ae25f8	bic x11,x11,x9
00ae25fc	eor x11,x24,x11
00ae2600	add x11,x15,x11
00ae2604	eor x15,x18,x12
00ae2608	ldp x0,x1,[x17, #-0x38]
00ae260c	ror x14,x9,#0xe
00ae2610	and x24,x18,x12
00ae2614	and x15,x15,x10
00ae2618	eor x15,x15,x24
00ae261c	ror x24,x18,#0x1c
00ae2620	eor x14,x14,x9, ROR #0x12
00ae2624	eor x24,x24,x18, ROR #0x22
00ae2628	eor x14,x14,x9, ROR #0x29
00ae262c	eor x24,x24,x18, ROR #0x27
00ae2630	add x11,x11,x14
00ae2634	add x14,x24,x15
00ae2638	add x0,x0,x19
00ae263c	add x13,x11,x13
00ae2640	add x0,x0,x8
00ae2644	add x11,x14,x11
00ae2648	and x14,x13,x9
00ae264c	bic x8,x8,x13
00ae2650	eor x8,x14,x8
00ae2654	add x8,x2,x8
00ae2658	eor x2,x11,x18
00ae265c	and x14,x11,x18
00ae2660	and x2,x2,x12
00ae2664	eor x14,x2,x14
00ae2668	ror x2,x13,#0xe
00ae266c	eor x2,x2,x13, ROR #0x12
00ae2670	eor x2,x2,x13, ROR #0x29
00ae2674	add x8,x8,x2
00ae2678	ror x2,x11,#0x1c
00ae267c	eor x2,x2,x11, ROR #0x22
00ae2680	add x1,x1,x6
00ae2684	eor x2,x2,x11, ROR #0x27
00ae2688	add x10,x8,x10
00ae268c	add x1,x1,x9
00ae2690	add x14,x2,x14
00ae2694	and x2,x10,x13
00ae2698	bic x9,x9,x10
00ae269c	add x8,x14,x8
00ae26a0	eor x9,x2,x9
00ae26a4	add x9,x0,x9
00ae26a8	eor x0,x8,x11
00ae26ac	ldp x15,x24,[x17, #-0x28]
00ae26b0	ror x14,x10,#0xe
00ae26b4	and x2,x8,x11
00ae26b8	and x0,x0,x18
00ae26bc	eor x0,x0,x2
00ae26c0	ror x2,x8,#0x1c
00ae26c4	eor x14,x14,x10, ROR #0x12
00ae26c8	eor x2,x2,x8, ROR #0x22
00ae26cc	eor x14,x14,x10, ROR #0x29
00ae26d0	eor x2,x2,x8, ROR #0x27
00ae26d4	add x9,x9,x14
00ae26d8	add x14,x2,x0
00ae26dc	add x15,x15,x5
00ae26e0	add x12,x9,x12
00ae26e4	add x15,x15,x13
00ae26e8	add x9,x14,x9
00ae26ec	and x14,x12,x10
00ae26f0	bic x13,x13,x12
00ae26f4	eor x13,x14,x13
00ae26f8	add x13,x1,x13
00ae26fc	eor x1,x9,x8
00ae2700	and x14,x9,x8
00ae2704	and x1,x1,x11
00ae2708	eor x14,x1,x14
00ae270c	ror x1,x12,#0xe
00ae2710	eor x1,x1,x12, ROR #0x12
00ae2714	eor x1,x1,x12, ROR #0x29
00ae2718	add x13,x13,x1
00ae271c	ror x1,x9,#0x1c
00ae2720	eor x1,x1,x9, ROR #0x22
00ae2724	eor x1,x1,x9, ROR #0x27
00ae2728	add x14,x1,x14
00ae272c	add x24,x24,x4
00ae2730	add x18,x13,x18
00ae2734	add x24,x24,x10
00ae2738	add x13,x14,x13
00ae273c	and x14,x18,x12
00ae2740	bic x10,x10,x18
00ae2744	eor x10,x14,x10
00ae2748	ldr x7,[sp, #0x58]
00ae274c	add x10,x15,x10
00ae2750	eor x15,x13,x9
00ae2754	and x14,x13,x9
00ae2758	and x15,x15,x8
00ae275c	ror x26,x3,#0x3d
00ae2760	eor x14,x15,x14
00ae2764	ror x15,x18,#0xe
00ae2768	eor x26,x26,x3, LSR #0x6
00ae276c	eor x15,x15,x18, ROR #0x12
00ae2770	add x7,x7,x20
00ae2774	eor x26,x26,x3, ROR #0x13
00ae2778	eor x15,x15,x18, ROR #0x29
00ae277c	add x7,x7,x26
00ae2780	ldp x0,x2,[x17, #-0x18]
00ae2784	add x10,x10,x15
00ae2788	ror x15,x13,#0x1c
00ae278c	ldr x26,[sp, #0x68]
00ae2790	eor x15,x15,x13, ROR #0x22
00ae2794	eor x15,x15,x13, ROR #0x27
00ae2798	add x14,x15,x14
00ae279c	add x26,x26,#0x10
00ae27a0	add x0,x0,x3
00ae27a4	add x2,x2,x16
00ae27a8	add x11,x10,x11
00ae27ac	add x10,x14,x10
00ae27b0	str x26,[sp, #0x68]
00ae27b4	cmp x26,#0x50
00ae27b8	add x0,x0,x12
00ae27bc	add x26,x2,x18
00ae27c0	and x14,x11,x18
00ae27c4	bic x12,x12,x11
00ae27c8	eor x2,x10,x13
00ae27cc	eor x12,x14,x12
00ae27d0	and x14,x10,x13
00ae27d4	and x2,x2,x9
00ae27d8	eor x14,x2,x14
00ae27dc	ror x2,x11,#0xe
00ae27e0	eor x2,x2,x11, ROR #0x12
00ae27e4	add x12,x24,x12
00ae27e8	eor x2,x2,x11, ROR #0x29
00ae27ec	add x12,x12,x2
00ae27f0	ror x2,x10,#0x1c
00ae27f4	eor x2,x2,x10, ROR #0x22
00ae27f8	eor x2,x2,x10, ROR #0x27
00ae27fc	add x8,x12,x8
00ae2800	ldr x15,[x17]
00ae2804	add x14,x2,x14
00ae2808	and x2,x8,x11
00ae280c	bic x18,x18,x8
00ae2810	add x12,x14,x12
00ae2814	eor x18,x2,x18
00ae2818	add x18,x0,x18
00ae281c	eor x0,x12,x10
00ae2820	ldur x1,[x17, #-0x8]
00ae2824	ror x14,x8,#0xe
00ae2828	and x2,x12,x10
00ae282c	and x0,x0,x13
00ae2830	add x15,x15,x30
00ae2834	eor x0,x0,x2
00ae2838	ror x2,x12,#0x1c
00ae283c	eor x14,x14,x8, ROR #0x12
00ae2840	add x28,x15,x8
00ae2844	eor x15,x2,x12, ROR #0x22
00ae2848	eor x14,x14,x8, ROR #0x29
00ae284c	eor x15,x15,x12, ROR #0x27
00ae2850	add x14,x18,x14
00ae2854	add x1,x1,x7
00ae2858	add x15,x15,x0
00ae285c	add x9,x14,x9
00ae2860	add x1,x1,x11
00ae2864	add x29,x15,x14
00ae2868	ror x14,x9,#0xe
00ae286c	and x15,x9,x8
00ae2870	bic x11,x11,x9
00ae2874	ror x18,x29,#0x1c
00ae2878	eor x11,x15,x11
00ae287c	eor x0,x29,x12
00ae2880	eor x14,x14,x9, ROR #0x12
00ae2884	and x15,x29,x12
00ae2888	add x11,x26,x11
00ae288c	eor x18,x18,x29, ROR #0x22
00ae2890	and x0,x0,x10
00ae2894	eor x14,x14,x9, ROR #0x29
00ae2898	eor x18,x18,x29, ROR #0x27
00ae289c	eor x15,x0,x15
00ae28a0	add x11,x11,x14
00ae28a4	add x15,x18,x15
00ae28a8	add x14,x11,x13
00ae28ac	add x26,x15,x11
00ae28b0	ror x11,x14,#0xe
00ae28b4	and x13,x14,x9
00ae28b8	bic x8,x8,x14
00ae28bc	ror x15,x26,#0x1c
00ae28c0	eor x8,x13,x8
00ae28c4	eor x13,x26,x29
00ae28c8	eor x11,x11,x14, ROR #0x12
00ae28cc	and x18,x26,x29
00ae28d0	eor x15,x15,x26, ROR #0x22
00ae28d4	add x8,x1,x8
00ae28d8	and x0,x13,x12
00ae28dc	eor x11,x11,x14, ROR #0x29
00ae28e0	eor x15,x15,x26, ROR #0x27
00ae28e4	eor x0,x0,x18
00ae28e8	add x8,x8,x11
00ae28ec	add x11,x15,x0
00ae28f0	add x15,x8,x10
00ae28f4	add x24,x11,x8
00ae28f8	and x10,x15,x14
00ae28fc	bic x11,x9,x15
00ae2900	ror x8,x15,#0xe
00ae2904	eor x10,x10,x11
00ae2908	ror x11,x24,#0x1c
00ae290c	and x13,x24,x13
00ae2910	eor x8,x8,x15, ROR #0x12
00ae2914	eor x11,x11,x24, ROR #0x22
00ae2918	eor x13,x13,x18
00ae291c	eor x8,x8,x15, ROR #0x29
00ae2920	add x10,x28,x10
00ae2924	eor x11,x11,x24, ROR #0x27
00ae2928	add x8,x10,x8
00ae292c	add x10,x11,x13
00ae2930	add x0,x8,x12
00ae2934	add x11,x10,x8
00ae2938	add x17,x17,#0x80
00ae293c	b.cc 0x00ae21ac
00ae2940	ldr x10,[sp, #0x38]
00ae2944	ldp x2,x13,[sp, #0x48]
00ae2948	ldp x25,x28,[sp, #0x8]
00ae294c	ldr x8,[sp]
00ae2950	add x10,x11,x10
00ae2954	ldp x12,x11,[sp, #0x28]
00ae2958	add x28,x15,x28
00ae295c	add x13,x14,x13
00ae2960	add x25,x9,x25
00ae2964	add x11,x24,x11
00ae2968	ldp x24,x18,[sp, #0x18]
00ae296c	add x12,x26,x12
00ae2970	stp x10,x11,[x8]
00ae2974	stp x13,x25,[x8, #0x30]
00ae2978	add x18,x29,x18
00ae297c	add x24,x0,x24
00ae2980	stp x12,x18,[x8, #0x10]
00ae2984	stp x24,x28,[x8, #0x20]
00ae2988	ldr x1,[sp, #0x40]
00ae298c	subs x2,x2,#0x1
00ae2990	add x1,x1,#0x80
00ae2994	b.ne 0x00ae1afc
00ae2998	ldp x29,x30,[sp, #0xd0]
00ae299c	ldp x20,x19,[sp, #0xc0]
00ae29a0	ldp x22,x21,[sp, #0xb0]
00ae29a4	ldp x24,x23,[sp, #0xa0]
00ae29a8	ldp x26,x25,[sp, #0x90]
00ae29ac	ldp x28,x27,[sp, #0x80]
00ae29b0	add sp,sp,#0xe0
00ae29b4	ret
