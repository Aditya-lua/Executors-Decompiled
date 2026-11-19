; mbedtls_oid_get_md_hmac @ 00baa058
00baa058	str x21,[sp, #-0x30]!
00baa05c	stp x20,x19,[sp, #0x10]
00baa060	stp x29,x30,[sp, #0x20]
00baa064	add x29,sp,#0x20
00baa068	mov x19,x1
00baa06c	cbz x0,0x00baa1ac
00baa070	ldr x8,[x0, #0x8]
00baa074	cmp x8,#0x9
00baa078	b.eq 0x00baa140
00baa07c	cmp x8,#0x8
00baa080	b.ne 0x00baa1ac
00baa084	ldr x9,[x0, #0x10]
00baa088	mov x10,#0x862a
00baa08c	movk x10,#0x8648, LSL #16
00baa090	movk x10,#0xdf7, LSL #32
00baa094	ldr x8,[x9]
00baa098	movk x10,#0x702, LSL #48
00baa09c	cmp x8,x10
00baa0a0	adrp x8,0xcac000
00baa0a4	add x8,x8,#0x208
00baa0a8	b.eq 0x00baa1f0
00baa0ac	ldr x10,[x9]
00baa0b0	mov x11,#0x862a
00baa0b4	movk x11,#0x8648, LSL #16
00baa0b8	movk x11,#0xdf7, LSL #32
00baa0bc	movk x11,#0x802, LSL #48
00baa0c0	cmp x10,x11
00baa0c4	b.eq 0x00baa1bc
00baa0c8	ldr x10,[x9]
00baa0cc	mov x11,#0x862a
00baa0d0	movk x11,#0x8648, LSL #16
00baa0d4	movk x11,#0xdf7, LSL #32
00baa0d8	movk x11,#0x902, LSL #48
00baa0dc	cmp x10,x11
00baa0e0	b.eq 0x00baa1cc
00baa0e4	ldr x10,[x9]
00baa0e8	mov x11,#0x862a
00baa0ec	movk x11,#0x8648, LSL #16
00baa0f0	movk x11,#0xdf7, LSL #32
00baa0f4	movk x11,#0xa02, LSL #48
00baa0f8	cmp x10,x11
00baa0fc	b.eq 0x00baa1dc
00baa100	ldr x10,[x9]
00baa104	mov x11,#0x862a
00baa108	movk x11,#0x8648, LSL #16
00baa10c	movk x11,#0xdf7, LSL #32
00baa110	movk x11,#0xb02, LSL #48
00baa114	cmp x10,x11
00baa118	b.eq 0x00baa1ec
00baa11c	ldr x9,[x9]
00baa120	mov x10,#0x62b
00baa124	movk x10,#0x501, LSL #16
00baa128	movk x10,#0x805, LSL #32
00baa12c	movk x10,#0x401, LSL #48
00baa130	cmp x9,x10
00baa134	b.ne 0x00baa1ac
00baa138	add x8,x8,#0x168
00baa13c	b 0x00baa1f0
00baa140	ldr x20,[x0, #0x10]
00baa144	adrp x0,0x2d2000
00baa148	add x0,x0,#0x9f2
00baa14c	mov w2,#0x9
00baa150	mov x1,x20
00baa154	bl 0x00c300b0
00baa158	adrp x21,0xcac000
00baa15c	add x21,x21,#0x208
00baa160	cbz w0,0x00baa1b4
00baa164	adrp x0,0x2c4000
00baa168	add x0,x0,#0x94f
00baa16c	mov w2,#0x9
00baa170	mov x1,x20
00baa174	bl 0x00c300b0
00baa178	cbz w0,0x00baa1c4
00baa17c	adrp x0,0x2d4000
00baa180	add x0,x0,#0xb0a
00baa184	mov w2,#0x9
00baa188	mov x1,x20
00baa18c	bl 0x00c300b0
00baa190	cbz w0,0x00baa1d4
00baa194	adrp x0,0x2a1000
00baa198	add x0,x0,#0x358
00baa19c	mov w2,#0x9
00baa1a0	mov x1,x20
00baa1a4	bl 0x00c300b0
00baa1a8	cbz w0,0x00baa1e4
00baa1ac	mov w0,#0xffffffd2
00baa1b0	b 0x00baa1fc
00baa1b4	add x8,x21,#0xc8
00baa1b8	b 0x00baa1f0
00baa1bc	add x8,x8,#0x28
00baa1c0	b 0x00baa1f0
00baa1c4	add x8,x21,#0xf0
00baa1c8	b 0x00baa1f0
00baa1cc	add x8,x8,#0x50
00baa1d0	b 0x00baa1f0
00baa1d4	add x8,x21,#0x118
00baa1d8	b 0x00baa1f0
00baa1dc	add x8,x8,#0x78
00baa1e0	b 0x00baa1f0
00baa1e4	add x8,x21,#0x140
00baa1e8	b 0x00baa1f0
00baa1ec	add x8,x8,#0xa0
00baa1f0	ldr w8,[x8, #0x20]
00baa1f4	mov w0,wzr
00baa1f8	str w8,[x19]
00baa1fc	ldp x29,x30,[sp, #0x20]
00baa200	ldp x20,x19,[sp, #0x10]
00baa204	ldr x21,[sp], #0x30
00baa208	ret
