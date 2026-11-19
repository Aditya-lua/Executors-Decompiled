; mbedtls_cipher_cmac @ 00b9f078
00b9f078	sub sp,sp,#0xc0
00b9f07c	stp x26,x25,[sp, #0x70]
00b9f080	stp x24,x23,[sp, #0x80]
00b9f084	stp x22,x21,[sp, #0x90]
00b9f088	stp x20,x19,[sp, #0xa0]
00b9f08c	stp x29,x30,[sp, #0xb0]
00b9f090	add x29,sp,#0xb0
00b9f094	mrs x26,tpidr_el0
00b9f098	ldr x8,[x26, #0x28]
00b9f09c	mov x19,x5
00b9f0a0	mov x20,x4
00b9f0a4	mov x21,x3
00b9f0a8	mov x23,x2
00b9f0ac	mov x24,x1
00b9f0b0	mov x25,x0
00b9f0b4	mov w22,#0xffff9f00
00b9f0b8	stur x8,[x29, #-0x48]
00b9f0bc	cbz x0,0x00b9f190
00b9f0c0	cbz x24,0x00b9f190
00b9f0c4	cbz x21,0x00b9f190
00b9f0c8	cbz x19,0x00b9f190
00b9f0cc	add x0,sp,#0x8
00b9f0d0	bl 0x00c30260
00b9f0d4	add x0,sp,#0x8
00b9f0d8	mov x1,x25
00b9f0dc	bl 0x00c30280
00b9f0e0	mov w22,w0
00b9f0e4	cbnz w0,0x00b9f188
00b9f0e8	ldr x8,[sp, #0x8]
00b9f0ec	cbz x8,0x00b9f184
00b9f0f0	add x0,sp,#0x8
00b9f0f4	mov w3,#0x1
00b9f0f8	mov x1,x24
00b9f0fc	mov w2,w23
00b9f100	bl 0x00c302a0
00b9f104	mov w22,w0
00b9f108	cbnz w0,0x00b9f188
00b9f10c	ldr x8,[sp, #0x8]
00b9f110	cbz x8,0x00b9f184
00b9f114	ldrb w8,[x8, #0xa]
00b9f118	mov w22,#0xffff9f00
00b9f11c	cmp w8,#0x24
00b9f120	b.hi 0x00b9f188
00b9f124	mov w9,#0x1
00b9f128	lsl x8,x9,x8
00b9f12c	mov x9,#0x1000000010
00b9f130	movk x9,#0x1c
00b9f134	tst x8,x9
00b9f138	b.eq 0x00b9f188
00b9f13c	mov w0,#0x1
00b9f140	mov w1,#0x28
00b9f144	bl 0x00c30a30
00b9f148	cbz x0,0x00b9f1c0
00b9f14c	mov w1,#0x10
00b9f150	str x0,[sp, #0x60]
00b9f154	bl 0x00c42220
00b9f158	add x0,sp,#0x8
00b9f15c	mov x1,x21
00b9f160	mov x2,x20
00b9f164	bl 0x00c42450
00b9f168	mov w22,w0
00b9f16c	cbnz w0,0x00b9f188
00b9f170	add x0,sp,#0x8
00b9f174	mov x1,x19
00b9f178	bl 0x00c42430
00b9f17c	mov w22,w0
00b9f180	b 0x00b9f188
00b9f184	mov w22,#0xffff9f00
00b9f188	add x0,sp,#0x8
00b9f18c	bl 0x00c30290
00b9f190	ldr x8,[x26, #0x28]
00b9f194	ldur x9,[x29, #-0x48]
00b9f198	cmp x8,x9
00b9f19c	b.ne 0x00b9f1c8
00b9f1a0	mov w0,w22
00b9f1a4	ldp x29,x30,[sp, #0xb0]
00b9f1a8	ldp x20,x19,[sp, #0xa0]
00b9f1ac	ldp x22,x21,[sp, #0x90]
00b9f1b0	ldp x24,x23,[sp, #0x80]
00b9f1b4	ldp x26,x25,[sp, #0x70]
00b9f1b8	add sp,sp,#0xc0
00b9f1bc	ret
00b9f1c0	mov w22,#0xffff9e80
00b9f1c4	b 0x00b9f188
00b9f1c8	bl 0x00c2fec0
