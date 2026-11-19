; FUN_00c17a90 @ 00c17a90
00c17a90	paciasp
00c17a94	sub sp,sp,#0x50
00c17a98	stp x29,x30,[sp, #0x20]
00c17a9c	str x21,[sp, #0x30]
00c17aa0	stp x20,x19,[sp, #0x40]
00c17aa4	add x29,sp,#0x20
00c17aa8	ldp x9,x10,[x0]
00c17aac	cmp x9,x10
00c17ab0	b.eq 0x00c17b98
00c17ab4	ldrb w8,[x9]
00c17ab8	cmp w8,#0x4c
00c17abc	b.ne 0x00c17b98
00c17ac0	add x11,x9,#0x1
00c17ac4	subs x12,x10,x11
00c17ac8	str x11,[x0]
00c17acc	b.eq 0x00c17b40
00c17ad0	ldrb w8,[x11]
00c17ad4	sub w13,w8,#0x41
00c17ad8	cmp w13,#0x38
00c17adc	b.hi 0x00c17b40
00c17ae0	adrp x14,0x78c000
00c17ae4	add x14,x14,#0x42e
00c17ae8	mov x8,xzr
00c17aec	adr x15,0xc17afc
00c17af0	ldrh w16,[x14, x13, LSL #0x1]
00c17af4	add x15,x15,x16, LSL #0x2
00c17af8	br x15
00c17afc	bti j
00c17b00	mov x19,x0
00c17b04	bl 0x00c10bfc
00c17b08	str x0,[sp, #0x10]
00c17b0c	cbz x0,0x00c17b98
00c17b10	ldp x8,x9,[x19]
00c17b14	cmp x8,x9
00c17b18	b.eq 0x00c17b98
00c17b1c	ldrb w9,[x8]
00c17b20	cmp w9,#0x45
00c17b24	b.ne 0x00c17b98
00c17b28	mov x0,x19
00c17b2c	add x8,x8,#0x1
00c17b30	add x1,sp,#0x10
00c17b34	str x8,[x19]
00c17b38	bl 0x00c1c7e0
00c17b3c	b 0x00c18408
00c17b40	bti j
00c17b44	mov x19,x0
00c17b48	bl 0x00c10bfc
00c17b4c	str x0,[x29, #0x18]
00c17b50	cbz x0,0x00c17b98
00c17b54	ldp x11,x10,[x19]
00c17b58	mov x0,x19
00c17b5c	cmp x11,x10
00c17b60	mov x9,x11
00c17b64	b.eq 0x00c17b80
00c17b68	ldrb w8,[x11]
00c17b6c	mov x9,x11
00c17b70	cmp w8,#0x6e
00c17b74	b.ne 0x00c17b80
00c17b78	add x9,x11,#0x1
00c17b7c	str x9,[x0]
00c17b80	cmp x10,x9
00c17b84	b.eq 0x00c17b98
00c17b88	ldrb w8,[x9]
00c17b8c	sub w8,w8,#0x3a
00c17b90	cmn w8,#0xa
00c17b94	b.cs 0x00c17bbc
00c17b98	mov x8,xzr
00c17b9c	bti j
00c17ba0	mov x0,x8
00c17ba4	ldp x20,x19,[sp, #0x40]
00c17ba8	ldr x21,[sp, #0x30]
00c17bac	ldp x29,x30,[sp, #0x20]
00c17bb0	add sp,sp,#0x50
00c17bb4	autiasp
00c17bb8	ret
00c17bbc	ldrb w8,[x9]
00c17bc0	sub w8,w8,#0x3a
00c17bc4	cmn w8,#0xa
00c17bc8	b.cc 0x00c17be4
00c17bcc	add x9,x9,#0x1
00c17bd0	cmp x9,x10
00c17bd4	str x9,[x0]
00c17bd8	b.ne 0x00c17bbc
00c17bdc	mov x12,x10
00c17be0	b 0x00c17be8
00c17be4	mov x12,x9
00c17be8	mov x8,xzr
00c17bec	subs x12,x12,x11
00c17bf0	stp x11,x12,[sp, #0x10]
00c17bf4	b.eq 0x00c17b9c
00c17bf8	cmp x9,x10
00c17bfc	b.eq 0x00c17b9c
00c17c00	ldrb w8,[x9]
00c17c04	cmp w8,#0x45
00c17c08	b.ne 0x00c17b98
00c17c0c	add x8,x9,#0x1
00c17c10	add x1,x29,#0x18
00c17c14	add x2,sp,#0x10
00c17c18	str x8,[x0]
00c17c1c	bl 0x00c1d14c
00c17c20	b 0x00c18408
00c17c24	bti j
00c17c28	add x8,x9,#0x2
00c17c2c	adrp x1,0x2b6000
00c17c30	add x1,x1,#0xbe1
00c17c34	mov w2,#0x5
00c17c38	b 0x00c183d8
00c17c3c	bti j
00c17c40	add x8,x9,#0x2
00c17c44	adrp x1,0x2b5000
00c17c48	add x1,x1,#0x54
00c17c4c	mov w2,#0x2
00c17c50	b 0x00c183d8
00c17c54	bti j
00c17c58	add x8,x9,#0x2
00c17c5c	adrp x1,0x2da000
00c17c60	add x1,x1,#0xdd8
00c17c64	b 0x00c18024
00c17c68	bti j
00c17c6c	add x19,x9,#0x2
00c17c70	sub x8,x10,x19
00c17c74	str x19,[x0]
00c17c78	cmp x8,#0x9
00c17c7c	b.cc 0x00c17b98
00c17c80	ldrb w8,[x9, #0x2]
00c17c84	sub w11,w8,#0x30
00c17c88	cmp w11,#0xa
00c17c8c	b.cc 0x00c17c9c
00c17c90	sub w8,w8,#0x61
00c17c94	cmp w8,#0x5
00c17c98	b.hi 0x00c17b98
00c17c9c	ldrb w8,[x9, #0x3]
00c17ca0	sub w11,w8,#0x30
00c17ca4	cmp w11,#0xa
00c17ca8	b.cc 0x00c17cb8
00c17cac	sub w8,w8,#0x61
00c17cb0	cmp w8,#0x5
00c17cb4	b.hi 0x00c17b98
00c17cb8	ldrb w8,[x9, #0x4]
00c17cbc	sub w11,w8,#0x30
00c17cc0	cmp w11,#0xa
00c17cc4	b.cc 0x00c17cd4
00c17cc8	sub w8,w8,#0x61
00c17ccc	cmp w8,#0x5
00c17cd0	b.hi 0x00c17b98
00c17cd4	ldrb w8,[x9, #0x5]
00c17cd8	sub w11,w8,#0x30
00c17cdc	cmp w11,#0xa
00c17ce0	b.cc 0x00c17cf0
00c17ce4	sub w8,w8,#0x61
00c17ce8	cmp w8,#0x5
00c17cec	b.hi 0x00c17b98
00c17cf0	ldrb w8,[x9, #0x6]
00c17cf4	sub w11,w8,#0x30
00c17cf8	cmp w11,#0xa
00c17cfc	b.cc 0x00c17d0c
00c17d00	sub w8,w8,#0x61
00c17d04	cmp w8,#0x5
00c17d08	b.hi 0x00c17b98
00c17d0c	ldrb w8,[x9, #0x7]
00c17d10	sub w11,w8,#0x30
00c17d14	cmp w11,#0xa
00c17d18	b.cc 0x00c17d28
00c17d1c	sub w8,w8,#0x61
00c17d20	cmp w8,#0x5
00c17d24	b.hi 0x00c17b98
00c17d28	ldrb w8,[x9, #0x8]
00c17d2c	str x0,[sp, #0x8]
00c17d30	sub w11,w8,#0x30
00c17d34	cmp w11,#0xa
00c17d38	b.cc 0x00c17d48
00c17d3c	sub w8,w8,#0x61
00c17d40	cmp w8,#0x5
00c17d44	b.hi 0x00c17b98
00c17d48	ldrb w8,[x9, #0x9]
00c17d4c	sub w11,w8,#0x30
00c17d50	cmp w11,#0xa
00c17d54	b.cc 0x00c17d64
00c17d58	sub w8,w8,#0x61
00c17d5c	cmp w8,#0x5
00c17d60	b.hi 0x00c17b98
00c17d64	add x8,x9,#0xa
00c17d68	cmp x8,x10
00c17d6c	ldr x10,[sp, #0x8]
00c17d70	str x8,[x10]
00c17d74	b.eq 0x00c17b98
00c17d78	ldrb w8,[x8]
00c17d7c	cmp w8,#0x45
00c17d80	b.ne 0x00c17b98
00c17d84	add x8,x9,#0xb
00c17d88	ldr x9,[sp, #0x8]
00c17d8c	ldr x20,[x9, #0x1330]
00c17d90	str x8,[x9]
00c17d94	ldr x8,[x20, #0x8]
00c17d98	sub x9,x8,#0xfd0
00c17d9c	cmn x9,#0xff1
00c17da0	b.hi 0x00c17dc4
00c17da4	mov w0,#0x1000
00c17da8	bl 0x00c308d0
00c17dac	cbz x0,0x00c18410
00c17db0	ldr x9,[sp, #0x8]
00c17db4	mov x8,xzr
00c17db8	stp x20,xzr,[x0]
00c17dbc	mov x20,x0
00c17dc0	str x0,[x9, #0x1330]
00c17dc4	add x9,x8,#0x20
00c17dc8	add x8,x20,x8
00c17dcc	adrp x10,0xcb2000
00c17dd0	add x10,x10,#0xa8
00c17dd4	str x9,[x20, #0x8]
00c17dd8	mov w11,#0x540
00c17ddc	str x10,[x8, #0x10]!
00c17de0	ldurh w9,[x8, #0x9]
00c17de4	mov w10,#0x4e
00c17de8	and w9,w9,#0xf000
00c17dec	strb w10,[x8, #0x8]
00c17df0	orr w9,w9,w11
00c17df4	sturh w9,[x8, #0x9]
00c17df8	mov w9,#0x8
00c17dfc	b 0x00c18114
00c17e00	bti j
00c17e04	cmp x12,#0x2
00c17e08	b.cc 0x00c17b98
00c17e0c	ldrh w8,[x11]
00c17e10	mov w11,#0x6e44
00c17e14	cmp w8,w11
00c17e18	b.ne 0x00c17b98
00c17e1c	add x8,x9,#0x3
00c17e20	cmp x8,x10
00c17e24	str x8,[x0]
00c17e28	b.eq 0x00c17e40
00c17e2c	ldrb w11,[x8]
00c17e30	cmp w11,#0x30
00c17e34	b.ne 0x00c17e40
00c17e38	add x8,x9,#0x4
00c17e3c	str x8,[x0]
00c17e40	cmp x8,x10
00c17e44	b.eq 0x00c17b98
00c17e48	ldrb w9,[x8]
00c17e4c	cmp w9,#0x45
00c17e50	b.ne 0x00c17b98
00c17e54	add x8,x8,#0x1
00c17e58	adrp x1,0x2d2000
00c17e5c	add x1,x1,#0xaf6
00c17e60	str x8,[x0]
00c17e64	ldp x20,x19,[sp, #0x40]
00c17e68	ldr x21,[sp, #0x30]
00c17e6c	ldp x29,x30,[sp, #0x20]
00c17e70	add sp,sp,#0x50
00c17e74	autiasp
00c17e78	b 0x00c1c880
00c17e7c	bti j
00c17e80	cmp x12,#0x2
00c17e84	b.cc 0x00c17b98
00c17e88	ldrh w8,[x11]
00c17e8c	mov w10,#0x5a5f
00c17e90	cmp w8,w10
00c17e94	b.ne 0x00c17b98
00c17e98	add x8,x9,#0x3
00c17e9c	mov x19,x0
00c17ea0	str x8,[x0]
00c17ea4	bl 0x00c10038
00c17ea8	mov x8,x0
00c17eac	cbz x0,0x00c17b9c
00c17eb0	ldp x10,x11,[x19]
00c17eb4	cmp x10,x11
00c17eb8	b.eq 0x00c17b98
00c17ebc	ldrb w11,[x10]
00c17ec0	cmp w11,#0x45
00c17ec4	b.ne 0x00c17b98
00c17ec8	add x10,x10,#0x1
00c17ecc	str x10,[x19]
00c17ed0	b 0x00c17b9c
00c17ed4	bti j
00c17ed8	add x8,x9,#0x2
00c17edc	adrp x1,0x2c6000
00c17ee0	add x1,x1,#0xa19
00c17ee4	mov w2,#0x3
00c17ee8	b 0x00c183d8
00c17eec	bti j
00c17ef0	add x8,x9,#0x2
00c17ef4	adrp x1,0x2ab000
00c17ef8	add x1,x1,#0x32c
00c17efc	mov x2,xzr
00c17f00	b 0x00c183d8
00c17f04	bti j
00c17f08	add x8,x9,#0x2
00c17f0c	adrp x1,0x29f000
00c17f10	add x1,x1,#0x1ab
00c17f14	mov w2,#0xe
00c17f18	b 0x00c183d8
00c17f1c	bti j
00c17f20	add x8,x9,#0x2
00c17f24	adrp x1,0x2ce000
00c17f28	add x1,x1,#0xbe3
00c17f2c	mov w2,#0xb
00c17f30	b 0x00c183d8
00c17f34	bti j
00c17f38	add x8,x9,#0x2
00c17f3c	adrp x1,0x2bc000
00c17f40	add x1,x1,#0xc00
00c17f44	mov w2,#0xd
00c17f48	b 0x00c183d8
00c17f4c	bti j
00c17f50	cmp x12,#0x2
00c17f54	b.cc 0x00c17b98
00c17f58	ldrb w8,[x9, #0x2]
00c17f5c	cmp w8,#0x6c
00c17f60	b.ne 0x00c17b98
00c17f64	mov x1,xzr
00c17f68	mov x19,x0
00c17f6c	bl 0x00c1c92c
00c17f70	str x0,[sp, #0x10]
00c17f74	cbz x0,0x00c17b98
00c17f78	ldp x8,x9,[x19]
00c17f7c	cmp x8,x9
00c17f80	b.eq 0x00c17b98
00c17f84	ldrb w9,[x8]
00c17f88	cmp w9,#0x45
00c17f8c	b.ne 0x00c17b98
00c17f90	mov x0,x19
00c17f94	add x8,x8,#0x1
00c17f98	add x1,sp,#0x10
00c17f9c	str x8,[x19]
00c17fa0	bl 0x00c1d0ac
00c17fa4	b 0x00c18408
00c17fa8	bti j
00c17fac	cmp x12,#0x3
00c17fb0	b.cc 0x00c17fd0
00c17fb4	ldrh w8,[x11]
00c17fb8	ldrb w10,[x11, #0x2]
00c17fbc	mov w11,#0x3062
00c17fc0	cmp w8,w11
00c17fc4	mov w8,#0x45
00c17fc8	ccmp w10,w8,#0x0,eq
00c17fcc	b.eq 0x00c183f4
00c17fd0	adrp x1,0x2ba000
00c17fd4	add x1,x1,#0xcc6
00c17fd8	mov w2,#0x3
00c17fdc	mov x19,x0
00c17fe0	bl 0x00c0ffd8
00c17fe4	tbz w0,#0x0,0x00c17b98
00c17fe8	mov w8,#0x1
00c17fec	add x1,sp,#0x10
00c17ff0	mov x0,x19
00c17ff4	str w8,[sp, #0x10]
00c17ff8	b 0x00c18404
00c17ffc	bti j
00c18000	add x8,x9,#0x2
00c18004	adrp x1,0x2bc000
00c18008	add x1,x1,#0xd2c
00c1800c	mov w2,#0x4
00c18010	b 0x00c183d8
00c18014	bti j
00c18018	add x8,x9,#0x2
00c1801c	adrp x1,0x2b5000
00c18020	add x1,x1,#0x52
00c18024	mov w2,#0x1
00c18028	b 0x00c183d8
00c1802c	bti j
00c18030	add x8,x9,#0x2
00c18034	adrp x1,0x2d6000
00c18038	add x1,x1,#0xedd
00c1803c	mov w2,#0x2
00c18040	b 0x00c183d8
00c18044	bti j
00c18048	add x19,x9,#0x2
00c1804c	sub x8,x10,x19
00c18050	str x19,[x0]
00c18054	cmp x8,#0x21
00c18058	b.cc 0x00c17b98
00c1805c	mov x11,xzr
00c18060	add x8,x9,#0x22
00c18064	ldrb w12,[x19, x11]
00c18068	sub w13,w12,#0x30
00c1806c	sub w12,w12,#0x61
00c18070	cmp w13,#0xa
00c18074	ccmp w12,#0x6,#0x0,cs
00c18078	b.cs 0x00c17b98
00c1807c	add x11,x11,#0x1
00c18080	cmp x11,#0x20
00c18084	b.ne 0x00c18064
00c18088	cmp x8,x10
00c1808c	str x8,[x0]
00c18090	b.eq 0x00c17b98
00c18094	ldrb w8,[x8]
00c18098	cmp w8,#0x45
00c1809c	b.ne 0x00c17b98
00c180a0	add x8,x9,#0x23
00c180a4	ldr x20,[x0, #0x1330]
00c180a8	str x8,[x0]
00c180ac	ldr x8,[x20, #0x8]
00c180b0	sub x9,x8,#0xfd0
00c180b4	cmn x9,#0xff1
00c180b8	b.hi 0x00c180dc
00c180bc	mov x21,x0
00c180c0	mov w0,#0x1000
00c180c4	bl 0x00c308d0
00c180c8	cbz x0,0x00c18410
00c180cc	mov x8,xzr
00c180d0	stp x20,xzr,[x0]
00c180d4	mov x20,x0
00c180d8	str x0,[x21, #0x1330]
00c180dc	add x9,x8,#0x20
00c180e0	add x8,x20,x8
00c180e4	adrp x10,0xcb2000
00c180e8	add x10,x10,#0x198
00c180ec	str x9,[x20, #0x8]
00c180f0	mov w11,#0x540
00c180f4	str x10,[x8, #0x10]!
00c180f8	ldurh w9,[x8, #0x9]
00c180fc	mov w10,#0x50
00c18100	and w9,w9,#0xf000
00c18104	strb w10,[x8, #0x8]
00c18108	orr w9,w9,w11
00c1810c	sturh w9,[x8, #0x9]
00c18110	mov w9,#0x20
00c18114	stp x19,x9,[x8, #0x10]
00c18118	b 0x00c17b9c
00c1811c	bti j
00c18120	add x19,x9,#0x2
00c18124	sub x8,x10,x19
00c18128	str x19,[x0]
00c1812c	cmp x8,#0x11
00c18130	b.cc 0x00c17b98
00c18134	ldrb w8,[x9, #0x2]
00c18138	sub w11,w8,#0x30
00c1813c	cmp w11,#0xa
00c18140	b.cc 0x00c18150
00c18144	sub w8,w8,#0x61
00c18148	cmp w8,#0x5
00c1814c	b.hi 0x00c17b98
00c18150	ldrb w8,[x9, #0x3]
00c18154	sub w11,w8,#0x30
00c18158	cmp w11,#0xa
00c1815c	b.cc 0x00c1816c
00c18160	sub w8,w8,#0x61
00c18164	cmp w8,#0x5
00c18168	b.hi 0x00c17b98
00c1816c	ldrb w8,[x9, #0x4]
00c18170	sub w11,w8,#0x30
00c18174	cmp w11,#0xa
00c18178	b.cc 0x00c18188
00c1817c	sub w8,w8,#0x61
00c18180	cmp w8,#0x5
00c18184	b.hi 0x00c17b98
00c18188	ldrb w8,[x9, #0x5]
00c1818c	sub w11,w8,#0x30
00c18190	cmp w11,#0xa
00c18194	b.cc 0x00c181a4
00c18198	sub w8,w8,#0x61
00c1819c	cmp w8,#0x5
00c181a0	b.hi 0x00c17b98
00c181a4	ldrb w8,[x9, #0x6]
00c181a8	sub w11,w8,#0x30
00c181ac	cmp w11,#0xa
00c181b0	b.cc 0x00c181c0
00c181b4	sub w8,w8,#0x61
00c181b8	cmp w8,#0x5
00c181bc	b.hi 0x00c17b98
00c181c0	ldrb w8,[x9, #0x7]
00c181c4	sub w11,w8,#0x30
00c181c8	cmp w11,#0xa
00c181cc	b.cc 0x00c181dc
00c181d0	sub w8,w8,#0x61
00c181d4	cmp w8,#0x5
00c181d8	b.hi 0x00c17b98
00c181dc	ldrb w8,[x9, #0x8]
00c181e0	str x0,[sp, #0x8]
00c181e4	sub w11,w8,#0x30
00c181e8	cmp w11,#0xa
00c181ec	b.cc 0x00c181fc
00c181f0	sub w8,w8,#0x61
00c181f4	cmp w8,#0x5
00c181f8	b.hi 0x00c17b98
00c181fc	ldrb w8,[x9, #0x9]
00c18200	sub w11,w8,#0x30
00c18204	cmp w11,#0xa
00c18208	b.cc 0x00c18218
00c1820c	sub w8,w8,#0x61
00c18210	cmp w8,#0x5
00c18214	b.hi 0x00c17b98
00c18218	ldrb w8,[x9, #0xa]
00c1821c	sub w11,w8,#0x30
00c18220	cmp w11,#0xa
00c18224	b.cc 0x00c18234
00c18228	sub w8,w8,#0x61
00c1822c	cmp w8,#0x5
00c18230	b.hi 0x00c17b98
00c18234	ldrb w8,[x9, #0xb]
00c18238	sub w11,w8,#0x30
00c1823c	cmp w11,#0xa
00c18240	b.cc 0x00c18250
00c18244	sub w8,w8,#0x61
00c18248	cmp w8,#0x5
00c1824c	b.hi 0x00c17b98
00c18250	ldrb w8,[x9, #0xc]
00c18254	sub w11,w8,#0x30
00c18258	cmp w11,#0xa
00c1825c	b.cc 0x00c1826c
00c18260	sub w8,w8,#0x61
00c18264	cmp w8,#0x5
00c18268	b.hi 0x00c17b98
00c1826c	ldrb w8,[x9, #0xd]
00c18270	sub w11,w8,#0x30
00c18274	cmp w11,#0xa
00c18278	b.cc 0x00c18288
00c1827c	sub w8,w8,#0x61
00c18280	cmp w8,#0x5
00c18284	b.hi 0x00c17b98
00c18288	ldrb w8,[x9, #0xe]
00c1828c	sub w11,w8,#0x30
00c18290	cmp w11,#0xa
00c18294	b.cc 0x00c182a4
00c18298	sub w8,w8,#0x61
00c1829c	cmp w8,#0x5
00c182a0	b.hi 0x00c17b98
00c182a4	ldrb w8,[x9, #0xf]
00c182a8	sub w11,w8,#0x30
00c182ac	cmp w11,#0xa
00c182b0	b.cc 0x00c182c0
00c182b4	sub w8,w8,#0x61
00c182b8	cmp w8,#0x5
00c182bc	b.hi 0x00c17b98
00c182c0	ldrb w8,[x9, #0x10]
00c182c4	sub w11,w8,#0x30
00c182c8	cmp w11,#0xa
00c182cc	b.cc 0x00c182dc
00c182d0	sub w8,w8,#0x61
00c182d4	cmp w8,#0x5
00c182d8	b.hi 0x00c17b98
00c182dc	ldrb w8,[x9, #0x11]
00c182e0	sub w11,w8,#0x30
00c182e4	cmp w11,#0xa
00c182e8	b.cc 0x00c182f8
00c182ec	sub w8,w8,#0x61
00c182f0	cmp w8,#0x5
00c182f4	b.hi 0x00c17b98
00c182f8	add x8,x9,#0x12
00c182fc	cmp x8,x10
00c18300	ldr x10,[sp, #0x8]
00c18304	str x8,[x10]
00c18308	b.eq 0x00c17b98
00c1830c	ldrb w8,[x8]
00c18310	cmp w8,#0x45
00c18314	b.ne 0x00c17b98
00c18318	add x8,x9,#0x13
00c1831c	ldr x9,[sp, #0x8]
00c18320	ldr x20,[x9, #0x1330]
00c18324	str x8,[x9]
00c18328	ldr x8,[x20, #0x8]
00c1832c	sub x9,x8,#0xfd0
00c18330	cmn x9,#0xff1
00c18334	b.hi 0x00c18358
00c18338	mov w0,#0x1000
00c1833c	bl 0x00c308d0
00c18340	cbz x0,0x00c18410
00c18344	ldr x9,[sp, #0x8]
00c18348	mov x8,xzr
00c1834c	stp x20,xzr,[x0]
00c18350	mov x20,x0
00c18354	str x0,[x9, #0x1330]
00c18358	add x9,x8,#0x20
00c1835c	add x8,x20,x8
00c18360	adrp x10,0xcb2000
00c18364	add x10,x10,#0x120
00c18368	str x9,[x20, #0x8]
00c1836c	mov w11,#0x540
00c18370	str x10,[x8, #0x10]!
00c18374	ldurh w9,[x8, #0x9]
00c18378	mov w10,#0x4f
00c1837c	and w9,w9,#0xf000
00c18380	strb w10,[x8, #0x8]
00c18384	orr w9,w9,w11
00c18388	sturh w9,[x8, #0x9]
00c1838c	mov w9,#0x10
00c18390	b 0x00c18114
00c18394	bti j
00c18398	add x8,x9,#0x2
00c1839c	adrp x1,0x2b6000
00c183a0	add x1,x1,#0xbe7
00c183a4	mov w2,#0x11
00c183a8	b 0x00c183d8
00c183ac	bti j
00c183b0	add x8,x9,#0x2
00c183b4	adrp x1,0x2a5000
00c183b8	add x1,x1,#0x11e
00c183bc	mov w2,#0x8
00c183c0	b 0x00c183d8
00c183c4	bti j
00c183c8	add x8,x9,#0x2
00c183cc	adrp x1,0x29f000
00c183d0	add x1,x1,#0x1a3
00c183d4	mov w2,#0x7
00c183d8	str x8,[x0]
00c183dc	ldp x20,x19,[sp, #0x40]
00c183e0	ldr x21,[sp, #0x30]
00c183e4	ldp x29,x30,[sp, #0x20]
00c183e8	add sp,sp,#0x50
00c183ec	autiasp
00c183f0	b 0x00c1c644
00c183f4	add x8,x9,#0x4
00c183f8	add x1,sp,#0x10
00c183fc	str wzr,[sp, #0x10]
00c18400	str x8,[x0]
00c18404	bl 0x00c1c738
00c18408	mov x8,x0
00c1840c	b 0x00c17b9c
00c18410	bl 0x00c2fff0
