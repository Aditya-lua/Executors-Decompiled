; OSSL_PARAM_set_BN @ 00a9f0dc
00a9f0dc	stp x20,x19,[sp, #-0x20]!
00a9f0e0	stp x29,x30,[sp, #0x10]
00a9f0e4	add x29,sp,#0x10
00a9f0e8	cbz x0,0x00a9f17c
00a9f0ec	mov x19,x1
00a9f0f0	mov x20,x0
00a9f0f4	str xzr,[x0, #0x20]
00a9f0f8	cbz x1,0x00a9f178
00a9f0fc	ldr w8,[x20, #0x8]
00a9f100	mov w0,wzr
00a9f104	cmp w8,#0x2
00a9f108	b.ne 0x00a9f17c
00a9f10c	mov x0,x19
00a9f110	bl 0x00c37f40
00a9f114	mov w8,w0
00a9f118	mov w0,wzr
00a9f11c	cbnz w8,0x00a9f17c
00a9f120	mov x0,x19
00a9f124	bl 0x00c322f0
00a9f128	add w8,w0,#0x7
00a9f12c	add w9,w0,#0xe
00a9f130	ldr x1,[x20, #0x10]
00a9f134	cmp w8,#0x0
00a9f138	csel w8,w9,w8,lt
00a9f13c	sbfx x8,x8,#0x3,#0x1d
00a9f140	cmp w9,#0xf
00a9f144	cinc x8,x8,cc
00a9f148	str x8,[x20, #0x20]
00a9f14c	cbz x1,0x00a9f188
00a9f150	ldr x2,[x20, #0x18]
00a9f154	mov w0,wzr
00a9f158	cmp x2,x8
00a9f15c	b.cc 0x00a9f17c
00a9f160	mov x0,x19
00a9f164	str x2,[x20, #0x20]
00a9f168	bl 0x00c38c90
00a9f16c	lsr w8,w0,#0x1f
00a9f170	eor w0,w8,#0x1
00a9f174	b 0x00a9f17c
00a9f178	mov w0,wzr
00a9f17c	ldp x29,x30,[sp, #0x10]
00a9f180	ldp x20,x19,[sp], #0x20
00a9f184	ret
00a9f188	mov w0,#0x1
00a9f18c	b 0x00a9f17c
