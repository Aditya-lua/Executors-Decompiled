; ossl_sm2_decrypt @ 00b22a3c
00b22a3c	sub sp,sp,#0xd0
00b22a40	stp x29,x30,[sp, #0xc0]
00b22a44	add x29,sp,#0xc0
00b22a48	stp x28,x27,[sp, #0x70]
00b22a4c	stp x26,x25,[sp, #0x80]
00b22a50	stp x24,x23,[sp, #0x90]
00b22a54	stp x22,x21,[sp, #0xa0]
00b22a58	stp x20,x19,[sp, #0xb0]
00b22a5c	str x5,[sp, #0x60]
00b22a60	str x4,[sp, #0x50]
00b22a64	mov x21,x3
00b22a68	mov x28,x1
00b22a6c	mov x25,x0
00b22a70	stur x2,[x29, #-0x58]
00b22a74	bl 0x00c36880
00b22a78	mov x24,x0
00b22a7c	bl 0x00b220d0
00b22a80	mov x27,x0
00b22a84	mov x0,x28
00b22a88	bl 0x00c34c20
00b22a8c	mov w26,w0
00b22a90	mov x0,x25
00b22a94	bl 0x00c3ad30
00b22a98	mov x20,x0
00b22a9c	mov x0,x25
00b22aa0	bl 0x00c3ad20
00b22aa4	mov x19,xzr
00b22aa8	mov x8,xzr
00b22aac	mov x11,xzr
00b22ab0	mov x23,xzr
00b22ab4	str xzr,[sp, #0x58]
00b22ab8	cbz x27,0x00b22b58
00b22abc	cmp w26,#0x1
00b22ac0	mov x9,x23
00b22ac4	mov x10,x23
00b22ac8	b.lt 0x00b22bf0
00b22acc	ldr x8,[sp, #0x60]
00b22ad0	mov x22,x0
00b22ad4	ldr x0,[sp, #0x50]
00b22ad8	orr w1,wzr,#0xff
00b22adc	ldr x2,[x8]
00b22ae0	bl 0x00c301c0
00b22ae4	adrp x3,0xc8c000
00b22ae8	add x3,x3,#0xc88
00b22aec	sub x1,x29,#0x58
00b22af0	mov x0,xzr
00b22af4	mov x2,x21
00b22af8	bl 0x00c36150
00b22afc	mov x19,x0
00b22b00	cbz x0,0x00b22b64
00b22b04	ldr x8,[x19, #0x10]
00b22b08	str x19,[sp, #0x58]
00b22b0c	ldr w9,[x8]
00b22b10	cmp w9,w26
00b22b14	b.ne 0x00b22bac
00b22b18	ldr x9,[x19, #0x18]
00b22b1c	ldr x10,[sp, #0x60]
00b22b20	ldrsw x23,[x9]
00b22b24	ldr x10,[x10]
00b22b28	cmp x10,x23
00b22b2c	b.cs 0x00b22c98
00b22b30	bl 0x00c342a0
00b22b34	adrp x0,0x2c4000
00b22b38	adrp x2,0x2d0000
00b22b3c	add x0,x0,#0x55e
00b22b40	add x2,x2,#0x7c2
00b22b44	mov w1,#0x14e
00b22b48	bl 0x00c342b0
00b22b4c	mov w0,#0x35
00b22b50	mov w1,#0x6b
00b22b54	b 0x00b22bd0
00b22b58	mov x9,x23
00b22b5c	mov x10,x23
00b22b60	b 0x00b22bf0
00b22b64	bl 0x00c342a0
00b22b68	adrp x0,0x2c4000
00b22b6c	adrp x2,0x2d0000
00b22b70	add x0,x0,#0x55e
00b22b74	add x2,x2,#0x7c2
00b22b78	mov w1,#0x141
00b22b7c	bl 0x00c342b0
00b22b80	mov w0,#0x35
00b22b84	mov w1,#0x64
00b22b88	mov x2,xzr
00b22b8c	bl 0x00c342c0
00b22b90	str xzr,[sp, #0x58]
00b22b94	mov x23,xzr
00b22b98	mov x9,xzr
00b22b9c	mov x11,xzr
00b22ba0	mov x8,xzr
00b22ba4	mov x10,xzr
00b22ba8	b 0x00b22bf0
00b22bac	bl 0x00c342a0
00b22bb0	adrp x0,0x2c4000
00b22bb4	adrp x2,0x2d0000
00b22bb8	add x0,x0,#0x55e
00b22bbc	add x2,x2,#0x7c2
00b22bc0	mov w1,#0x146
00b22bc4	bl 0x00c342b0
00b22bc8	mov w0,#0x35
00b22bcc	mov w1,#0x68
00b22bd0	mov x2,xzr
00b22bd4	bl 0x00c342c0
00b22bd8	mov x23,xzr
00b22bdc	mov x9,xzr
00b22be0	mov x11,xzr
00b22be4	mov x8,xzr
00b22be8	mov x10,xzr
00b22bec	mov x19,xzr
00b22bf0	stp x10,x8,[sp, #0x40]
00b22bf4	ldr x8,[sp, #0x60]
00b22bf8	ldr x0,[sp, #0x50]
00b22bfc	mov w1,wzr
00b22c00	mov x24,x11
00b22c04	ldr x2,[x8]
00b22c08	mov x26,x9
00b22c0c	bl 0x00c301c0
00b22c10	mov w20,wzr
00b22c14	ldr x0,[sp, #0x40]
00b22c18	adrp x21,0x2c4000
00b22c1c	add x21,x21,#0x55e
00b22c20	mov w2,#0x1a4
00b22c24	mov x1,x21
00b22c28	bl 0x00c32310
00b22c2c	mov w2,#0x1a5
00b22c30	mov x0,x23
00b22c34	mov x1,x21
00b22c38	bl 0x00c32310
00b22c3c	mov w2,#0x1a6
00b22c40	mov x0,x26
00b22c44	mov x1,x21
00b22c48	bl 0x00c32310
00b22c4c	mov x0,x24
00b22c50	bl 0x00c3ab60
00b22c54	ldr x0,[sp, #0x48]
00b22c58	bl 0x00c38a30
00b22c5c	ldr x0,[sp, #0x58]
00b22c60	adrp x1,0xc8c000
00b22c64	add x1,x1,#0xc88
00b22c68	bl 0x00c36160
00b22c6c	mov x0,x19
00b22c70	bl 0x00c31f90
00b22c74	mov w0,w20
00b22c78	ldp x29,x30,[sp, #0xc0]
00b22c7c	ldp x20,x19,[sp, #0xb0]
00b22c80	ldp x22,x21,[sp, #0xa0]
00b22c84	ldp x24,x23,[sp, #0x90]
00b22c88	ldp x26,x25,[sp, #0x80]
00b22c8c	ldp x28,x27,[sp, #0x70]
00b22c90	add sp,sp,#0xd0
00b22c94	ret
00b22c98	ldr x9,[x9, #0x8]
00b22c9c	ldr x21,[x8, #0x8]
00b22ca0	mov x0,x20
00b22ca4	str x9,[sp, #0x38]
00b22ca8	bl 0x00c38a60
00b22cac	cbz x0,0x00b22e24
00b22cb0	mov x19,x0
00b22cb4	bl 0x00c38a90
00b22cb8	mov x0,x19
00b22cbc	bl 0x00c38a40
00b22cc0	str x0,[sp, #0x30]
00b22cc4	mov x0,x19
00b22cc8	str x19,[sp, #0x48]
00b22ccc	bl 0x00c38a40
00b22cd0	cbz x0,0x00b22e50
00b22cd4	str x21,[sp, #0x10]
00b22cd8	adrp x21,0x2c4000
00b22cdc	add x21,x21,#0x55e
00b22ce0	stp x23,x0,[sp, #0x20]
00b22ce4	mov w2,#0x161
00b22ce8	mov x0,x23
00b22cec	mov x1,x21
00b22cf0	bl 0x00c34250
00b22cf4	mov x19,x0
00b22cf8	lsl x0,x27,#0x1
00b22cfc	mov w2,#0x162
00b22d00	mov x1,x21
00b22d04	str x0,[sp, #0x18]
00b22d08	bl 0x00c34250
00b22d0c	sxtw x26,w26
00b22d10	mov x23,x0
00b22d14	mov w2,#0x163
00b22d18	mov x0,x26
00b22d1c	mov x1,x21
00b22d20	bl 0x00c34250
00b22d24	str x19,[sp, #0x40]
00b22d28	cbz x19,0x00b22e94
00b22d2c	cbz x23,0x00b22e94
00b22d30	cbz x0,0x00b22e94
00b22d34	str x26,[sp, #0x8]
00b22d38	mov x26,x0
00b22d3c	mov x0,x24
00b22d40	bl 0x00c3ab70
00b22d44	cbz x0,0x00b22f24
00b22d48	ldr x8,[sp, #0x58]
00b22d4c	ldr x19,[sp, #0x48]
00b22d50	mov x21,x0
00b22d54	mov x0,x24
00b22d58	ldp x2,x3,[x8]
00b22d5c	mov x1,x21
00b22d60	mov x4,x19
00b22d64	bl 0x00c3ae80
00b22d68	cbz w0,0x00b22ed8
00b22d6c	mov x0,x25
00b22d70	bl 0x00c3a7d0
00b22d74	mov x4,x0
00b22d78	mov x0,x24
00b22d7c	mov x1,x21
00b22d80	mov x2,xzr
00b22d84	mov x3,x21
00b22d88	mov x5,x19
00b22d8c	bl 0x00c3ae30
00b22d90	cbz w0,0x00b22ed8
00b22d94	ldp x3,x2,[sp, #0x28]
00b22d98	mov x0,x24
00b22d9c	mov x1,x21
00b22da0	mov x4,x19
00b22da4	bl 0x00c3ae70
00b22da8	cbz w0,0x00b22ed8
00b22dac	ldr x0,[sp, #0x30]
00b22db0	mov x1,x23
00b22db4	mov w2,w27
00b22db8	mov x24,x21
00b22dbc	bl 0x00c38c70
00b22dc0	tbnz w0,#0x1f,0x00b22f68
00b22dc4	ldr x0,[sp, #0x28]
00b22dc8	add x21,x23,x27
00b22dcc	mov x1,x21
00b22dd0	mov w2,w27
00b22dd4	bl 0x00c38c70
00b22dd8	tbnz w0,#0x1f,0x00b22f68
00b22ddc	ldr x0,[sp, #0x40]
00b22de0	ldp x3,x1,[sp, #0x18]
00b22de4	mov x2,x23
00b22de8	mov x4,xzr
00b22dec	mov x5,xzr
00b22df0	mov x6,x28
00b22df4	mov x7,x20
00b22df8	str x22,[sp]
00b22dfc	bl 0x00c3b170
00b22e00	cbz w0,0x00b22f68
00b22e04	ldr x8,[sp, #0x20]
00b22e08	cbz w8,0x00b230b8
00b22e0c	ldr x15,[sp, #0x40]
00b22e10	cmp w8,#0x1
00b22e14	b.ne 0x00b22fb0
00b22e18	mov x8,xzr
00b22e1c	mov w9,wzr
00b22e20	b 0x00b22fec
00b22e24	bl 0x00c342a0
00b22e28	adrp x0,0x2c4000
00b22e2c	adrp x2,0x2d0000
00b22e30	add x0,x0,#0x55e
00b22e34	add x2,x2,#0x7c2
00b22e38	mov w1,#0x154
00b22e3c	bl 0x00c342b0
00b22e40	mov w1,#0x100
00b22e44	mov w0,#0x35
00b22e48	movk w1,#0xc, LSL #16
00b22e4c	b 0x00b22bd0
00b22e50	bl 0x00c342a0
00b22e54	adrp x0,0x2c4000
00b22e58	adrp x2,0x2d0000
00b22e5c	add x0,x0,#0x55e
00b22e60	add x2,x2,#0x7c2
00b22e64	mov w1,#0x15d
00b22e68	bl 0x00c342b0
00b22e6c	mov w1,#0x3
00b22e70	mov w0,#0x35
00b22e74	movk w1,#0x8, LSL #16
00b22e78	mov x2,xzr
00b22e7c	bl 0x00c342c0
00b22e80	ldr x8,[sp, #0x48]
00b22e84	mov x23,xzr
00b22e88	mov x9,xzr
00b22e8c	mov x11,xzr
00b22e90	b 0x00b22be8
00b22e94	mov x19,x0
00b22e98	bl 0x00c342a0
00b22e9c	adrp x0,0x2c4000
00b22ea0	adrp x2,0x2d0000
00b22ea4	add x0,x0,#0x55e
00b22ea8	add x2,x2,#0x7c2
00b22eac	mov w1,#0x166
00b22eb0	bl 0x00c342b0
00b22eb4	mov w1,#0x100
00b22eb8	mov w0,#0x35
00b22ebc	movk w1,#0xc, LSL #16
00b22ec0	mov x2,xzr
00b22ec4	bl 0x00c342c0
00b22ec8	ldp x10,x8,[sp, #0x40]
00b22ecc	mov x9,x19
00b22ed0	mov x11,xzr
00b22ed4	b 0x00b22bec
00b22ed8	bl 0x00c342a0
00b22edc	adrp x0,0x2c4000
00b22ee0	adrp x2,0x2d0000
00b22ee4	add x0,x0,#0x55e
00b22ee8	add x2,x2,#0x7c2
00b22eec	mov w1,#0x175
00b22ef0	bl 0x00c342b0
00b22ef4	mov w8,#0x3
00b22ef8	movk w8,#0x8, LSL #16
00b22efc	add w1,w8,#0xd
00b22f00	mov w0,#0x35
00b22f04	mov x2,xzr
00b22f08	bl 0x00c342c0
00b22f0c	ldr x10,[sp, #0x40]
00b22f10	mov x8,x19
00b22f14	mov x19,xzr
00b22f18	mov x9,x26
00b22f1c	mov x11,x21
00b22f20	b 0x00b22bf0
00b22f24	bl 0x00c342a0
00b22f28	adrp x0,0x2c4000
00b22f2c	adrp x2,0x2d0000
00b22f30	add x0,x0,#0x55e
00b22f34	add x2,x2,#0x7c2
00b22f38	mov w1,#0x16c
00b22f3c	bl 0x00c342b0
00b22f40	mov w1,#0x100
00b22f44	mov w0,#0x35
00b22f48	movk w1,#0xc, LSL #16
00b22f4c	mov x2,xzr
00b22f50	bl 0x00c342c0
00b22f54	ldp x10,x8,[sp, #0x40]
00b22f58	mov x11,xzr
00b22f5c	mov x19,xzr
00b22f60	mov x9,x26
00b22f64	b 0x00b22bf0
00b22f68	bl 0x00c342a0
00b22f6c	adrp x0,0x2c4000
00b22f70	adrp x2,0x2d0000
00b22f74	add x0,x0,#0x55e
00b22f78	add x2,x2,#0x7c2
00b22f7c	mov w1,#0x17d
00b22f80	bl 0x00c342b0
00b22f84	mov w8,#0x100
00b22f88	movk w8,#0xc, LSL #16
00b22f8c	add w1,w8,#0x3
00b22f90	mov w0,#0x35
00b22f94	mov x2,xzr
00b22f98	bl 0x00c342c0
00b22f9c	mov x19,xzr
00b22fa0	ldp x10,x8,[sp, #0x40]
00b22fa4	mov x9,x26
00b22fa8	mov x11,x24
00b22fac	b 0x00b22bf0
00b22fb0	and x8,x8,#-0x2
00b22fb4	mov w9,wzr
00b22fb8	mov w10,wzr
00b22fbc	add x11,x15,#0x1
00b22fc0	mov x12,x8
00b22fc4	ldurb w13,[x11, #-0x1]
00b22fc8	ldrb w14,[x11], #0x2
00b22fcc	subs x12,x12,#0x2
00b22fd0	orr w9,w9,w13
00b22fd4	orr w10,w10,w14
00b22fd8	b.ne 0x00b22fc4
00b22fdc	ldr x11,[sp, #0x20]
00b22fe0	orr w9,w10,w9
00b22fe4	cmp x8,x11
00b22fe8	b.eq 0x00b23008
00b22fec	ldr x10,[sp, #0x20]
00b22ff0	sub x10,x10,x8
00b22ff4	add x8,x15,x8
00b22ff8	ldrb w11,[x8], #0x1
00b22ffc	subs x10,x10,#0x1
00b23000	orr w9,w9,w11
00b23004	b.ne 0x00b22ff8
00b23008	ldr x8,[sp, #0x20]
00b2300c	cbz w9,0x00b230b8
00b23010	ldp x15,x14,[sp, #0x38]
00b23014	and x8,x8,#0xffffffff
00b23018	cmp w8,#0x1f
00b2301c	mov x9,xzr
00b23020	b.ls 0x00b230e4
00b23024	ldr x13,[sp, #0x50]
00b23028	add x9,x15,x8
00b2302c	add x11,x14,x8
00b23030	add x10,x13,x8
00b23034	cmp x9,x13
00b23038	cset w9,hi
00b2303c	cmp x15,x10
00b23040	cset w12,cc
00b23044	cmp x11,x13
00b23048	and w11,w9,w12
00b2304c	cset w9,hi
00b23050	cmp x14,x10
00b23054	cset w10,cc
00b23058	tbnz w11,#0x0,0x00b230e0
00b2305c	and w10,w9,w10
00b23060	mov x9,xzr
00b23064	tbnz w10,#0x0,0x00b230e4
00b23068	ldr x12,[sp, #0x50]
00b2306c	and x9,x8,#0xffffffe0
00b23070	add x10,x15,#0x10
00b23074	add x11,x14,#0x10
00b23078	add x12,x12,#0x10
00b2307c	mov x13,x9
00b23080	ldp q0,q1,[x10, #-0x10]
00b23084	ldp q2,q3,[x11, #-0x10]
00b23088	add x10,x10,#0x20
00b2308c	add x11,x11,#0x20
00b23090	subs x13,x13,#0x20
00b23094	eor v0.16B,v2.16B,v0.16B
00b23098	eor v1.16B,v3.16B,v1.16B
00b2309c	stp q0,q1,[x12, #-0x10]
00b230a0	add x12,x12,#0x20
00b230a4	b.ne 0x00b23080
00b230a8	ldp x15,x14,[sp, #0x38]
00b230ac	cmp x9,x8
00b230b0	b.ne 0x00b230e4
00b230b4	b 0x00b23110
00b230b8	bl 0x00c342a0
00b230bc	adrp x0,0x2c4000
00b230c0	adrp x2,0x2d0000
00b230c4	add x0,x0,#0x55e
00b230c8	add x2,x2,#0x7c2
00b230cc	mov w1,#0x182
00b230d0	bl 0x00c342b0
00b230d4	mov w0,#0x35
00b230d8	mov w1,#0x68
00b230dc	b 0x00b22f94
00b230e0	mov x9,xzr
00b230e4	ldr x10,[sp, #0x50]
00b230e8	add x11,x14,x9
00b230ec	add x12,x15,x9
00b230f0	sub x8,x8,x9
00b230f4	add x10,x10,x9
00b230f8	ldrb w9,[x12], #0x1
00b230fc	ldrb w13,[x11], #0x1
00b23100	subs x8,x8,#0x1
00b23104	eor w9,w13,w9
00b23108	strb w9,[x10], #0x1
00b2310c	b.ne 0x00b230f8
00b23110	bl 0x00c31fa0
00b23114	mov x19,x0
00b23118	cbz x0,0x00b231e4
00b2311c	mov x0,x19
00b23120	mov x1,x28
00b23124	bl 0x00c32430
00b23128	cbz w0,0x00b231b4
00b2312c	mov x0,x19
00b23130	mov x1,x23
00b23134	mov x2,x27
00b23138	bl 0x00c31f80
00b2313c	cbz w0,0x00b231b4
00b23140	ldr x1,[sp, #0x50]
00b23144	ldr x2,[sp, #0x20]
00b23148	mov x0,x19
00b2314c	bl 0x00c31f80
00b23150	cbz w0,0x00b231b4
00b23154	mov x0,x19
00b23158	mov x1,x21
00b2315c	mov x2,x27
00b23160	bl 0x00c31f80
00b23164	cbz w0,0x00b231b4
00b23168	mov x0,x19
00b2316c	mov x1,x26
00b23170	mov x2,xzr
00b23174	bl 0x00c3c150
00b23178	cbz w0,0x00b231b4
00b2317c	ldp x2,x1,[sp, #0x8]
00b23180	mov x0,x26
00b23184	bl 0x00c362f0
00b23188	cbz w0,0x00b23218
00b2318c	bl 0x00c342a0
00b23190	adrp x0,0x2c4000
00b23194	adrp x2,0x2d0000
00b23198	add x0,x0,#0x55e
00b2319c	add x2,x2,#0x7c2
00b231a0	mov w1,#0x199
00b231a4	bl 0x00c342b0
00b231a8	mov w0,#0x35
00b231ac	mov w1,#0x66
00b231b0	b 0x00b2320c
00b231b4	bl 0x00c342a0
00b231b8	adrp x0,0x2c4000
00b231bc	adrp x2,0x2d0000
00b231c0	add x0,x0,#0x55e
00b231c4	add x2,x2,#0x7c2
00b231c8	mov w1,#0x194
00b231cc	bl 0x00c342b0
00b231d0	mov w8,#0x3
00b231d4	movk w8,#0x8, LSL #16
00b231d8	add w1,w8,#0x3
00b231dc	mov w0,#0x35
00b231e0	b 0x00b2320c
00b231e4	bl 0x00c342a0
00b231e8	adrp x0,0x2c4000
00b231ec	adrp x2,0x2d0000
00b231f0	add x0,x0,#0x55e
00b231f4	add x2,x2,#0x7c2
00b231f8	mov w1,#0x18b
00b231fc	bl 0x00c342b0
00b23200	mov w1,#0x100
00b23204	mov w0,#0x35
00b23208	movk w1,#0xc, LSL #16
00b2320c	mov x2,xzr
00b23210	bl 0x00c342c0
00b23214	b 0x00b22fa0
00b23218	ldr x8,[sp, #0x60]
00b2321c	ldr x9,[sp, #0x20]
00b23220	mov w20,#0x1
00b23224	str x9,[x8]
00b23228	b 0x00b22c14
