; DH_free @ 00a1f0ac
00a1f0ac	str x19,[sp, #-0x20]!
00a1f0b0	stp x29,x30,[sp, #0x10]
00a1f0b4	add x29,sp,#0x10
00a1f0b8	cbz x0,0x00a1f0e8
00a1f0bc	mov x19,x0
00a1f0c0	add x9,x0,#0x90
00a1f0c4	ldxr w8,[x9]
00a1f0c8	subs w10,w8,#0x1
00a1f0cc	stxr w11,w10,[x9]
00a1f0d0	cbnz w11,0x00a1f0c4
00a1f0d4	b.ne 0x00a1f0e0
00a1f0d8	dmb ISHLD
00a1f0dc	b 0x00a1f0f4
00a1f0e0	cmp w8,#0x1
00a1f0e4	b.le 0x00a1f0f4
00a1f0e8	ldp x29,x30,[sp, #0x10]
00a1f0ec	ldr x19,[sp], #0x20
00a1f0f0	ret
00a1f0f4	ldr x8,[x19, #0xb8]
00a1f0f8	cbz x8,0x00a1f10c
00a1f0fc	ldr x8,[x8, #0x28]
00a1f100	cbz x8,0x00a1f10c
00a1f104	mov x0,x19
00a1f108	blr x8
00a1f10c	ldr x0,[x19, #0xa8]
00a1f110	bl 0x00c32360
00a1f114	add x2,x19,#0x98
00a1f118	orr w0,wzr,#0x6
00a1f11c	mov x1,x19
00a1f120	bl 0x00c356c0
00a1f124	ldr x0,[x19, #0xc0]
00a1f128	bl 0x00c34d40
00a1f12c	add x0,x19,#0x8
00a1f130	bl 0x00c3a040
00a1f134	ldr x0,[x19, #0x70]
00a1f138	bl 0x00c322e0
00a1f13c	ldr x0,[x19, #0x78]
00a1f140	bl 0x00c322e0
00a1f144	ldp x29,x30,[sp, #0x10]
00a1f148	adrp x1,0x2db000
00a1f14c	add x1,x1,#0xe57
00a1f150	mov w2,#0xa0
00a1f154	mov x0,x19
00a1f158	ldr x19,[sp], #0x20
00a1f15c	b 0x00c32310
