; psa_generate_key_internal @ 00b8f0ac
00b8f0ac	stp x26,x25,[sp, #-0x50]!
00b8f0b0	stp x24,x23,[sp, #0x10]
00b8f0b4	stp x22,x21,[sp, #0x20]
00b8f0b8	stp x20,x19,[sp, #0x30]
00b8f0bc	stp x29,x30,[sp, #0x40]
00b8f0c0	add x29,sp,#0x40
00b8f0c4	ldrh w24,[x0]
00b8f0c8	mov x20,x5
00b8f0cc	mov x19,x4
00b8f0d0	and w8,w24,#0x7000
00b8f0d4	cmp w8,#0x2, LSL #12
00b8f0d8	b.eq 0x00b8f0e4
00b8f0dc	cmp w8,#0x1, LSL #12
00b8f0e0	b.ne 0x00b8f148
00b8f0e4	adrp x8,0xd25000
00b8f0e8	add x8,x8,#0xb10
00b8f0ec	ldrb w9,[x8, #0x1]
00b8f0f0	mov w0,#0xffffff77
00b8f0f4	cmp w9,#0x2
00b8f0f8	b.ne 0x00b8f240
00b8f0fc	ldrb w9,[x8]
00b8f100	cmp w9,#0x7
00b8f104	b.ne 0x00b8f240
00b8f108	cbz x20,0x00b8f210
00b8f10c	mov w25,#0x400
00b8f110	add x21,x8,#0x358
00b8f114	mov x26,x20
00b8f118	mov x22,x19
00b8f11c	cmp x26,#0x400
00b8f120	csel x23,x26,x25,cc
00b8f124	mov x0,x21
00b8f128	mov x1,x22
00b8f12c	mov x2,x23
00b8f130	bl 0x00c303a0
00b8f134	cbnz w0,0x00b8f1c0
00b8f138	subs x26,x26,x23
00b8f13c	add x22,x22,x23
00b8f140	b.ne 0x00b8f11c
00b8f144	b 0x00b8f1c8
00b8f148	mov w8,#0x7001
00b8f14c	cmp w24,w8
00b8f150	b.ne 0x00b8f180
00b8f154	mov x1,x2
00b8f158	mov x2,x3
00b8f15c	mov x3,x19
00b8f160	mov x4,x20
00b8f164	ldp x29,x30,[sp, #0x40]
00b8f168	ldp x20,x19,[sp, #0x30]
00b8f16c	ldp x22,x21,[sp, #0x20]
00b8f170	ldp x24,x23,[sp, #0x10]
00b8f174	mov x5,x6
00b8f178	ldp x26,x25,[sp], #0x50
00b8f17c	b 0x00c43130
00b8f180	and w8,w24,#0xff00
00b8f184	mov w9,#0x7200
00b8f188	cmp w8,w9
00b8f18c	b.eq 0x00b8f218
00b8f190	mov w9,#0x7100
00b8f194	cmp w8,w9
00b8f198	b.ne 0x00b8f23c
00b8f19c	mov x1,x19
00b8f1a0	mov x2,x20
00b8f1a4	ldp x29,x30,[sp, #0x40]
00b8f1a8	ldp x20,x19,[sp, #0x30]
00b8f1ac	ldp x22,x21,[sp, #0x20]
00b8f1b0	ldp x24,x23,[sp, #0x10]
00b8f1b4	mov x3,x6
00b8f1b8	ldp x26,x25,[sp], #0x50
00b8f1bc	b 0x00c42f60
00b8f1c0	bl 0x00c42bf0
00b8f1c4	cbnz w0,0x00b8f240
00b8f1c8	cmp x20,#0x8
00b8f1cc	b.cc 0x00b8f210
00b8f1d0	mov w8,#0x2301
00b8f1d4	cmp w24,w8
00b8f1d8	mov w0,wzr
00b8f1dc	b.ne 0x00b8f240
00b8f1e0	mov x0,x19
00b8f1e4	bl 0x00c424a0
00b8f1e8	cmp x20,#0x10
00b8f1ec	mov w0,wzr
00b8f1f0	b.cc 0x00b8f240
00b8f1f4	add x0,x19,#0x8
00b8f1f8	bl 0x00c424a0
00b8f1fc	cmp x20,#0x18
00b8f200	mov w0,wzr
00b8f204	b.cc 0x00b8f240
00b8f208	add x0,x19,#0x10
00b8f20c	bl 0x00c424a0
00b8f210	mov w0,wzr
00b8f214	b 0x00b8f240
00b8f218	mov x1,x19
00b8f21c	mov x2,x20
00b8f220	ldp x29,x30,[sp, #0x40]
00b8f224	ldp x20,x19,[sp, #0x30]
00b8f228	ldp x22,x21,[sp, #0x20]
00b8f22c	ldp x24,x23,[sp, #0x10]
00b8f230	mov x3,x6
00b8f234	ldp x26,x25,[sp], #0x50
00b8f238	b 0x00c42fb0
00b8f23c	mov w0,#0xffffff7a
00b8f240	ldp x29,x30,[sp, #0x40]
00b8f244	ldp x20,x19,[sp, #0x30]
00b8f248	ldp x22,x21,[sp, #0x20]
00b8f24c	ldp x24,x23,[sp, #0x10]
00b8f250	ldp x26,x25,[sp], #0x50
00b8f254	ret
