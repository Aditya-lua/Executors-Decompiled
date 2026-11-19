; evp_pkey_free_legacy @ 00a6f0e0
00a6f0e0	str x19,[sp, #-0x20]!
00a6f0e4	stp x29,x30,[sp, #0x10]
00a6f0e8	mov x19,x0
00a6f0ec	ldr x0,[x0, #0x8]
00a6f0f0	add x29,sp,#0x10
00a6f0f4	str xzr,[sp, #0x8]
00a6f0f8	cbz x0,0x00a6f148
00a6f0fc	ldr x8,[x19, #0x28]
00a6f100	cbz x8,0x00a6f108
00a6f104	stp x8,xzr,[x19, #0x20]
00a6f108	ldr x8,[x0, #0xa8]
00a6f10c	cbz x8,0x00a6f118
00a6f110	mov x0,x19
00a6f114	blr x8
00a6f118	str xzr,[x19, #0x20]
00a6f11c	ldr x0,[sp, #0x8]
00a6f120	bl 0x00c32360
00a6f124	ldr x0,[x19, #0x10]
00a6f128	bl 0x00c32360
00a6f12c	ldr x0,[x19, #0x18]
00a6f130	str xzr,[x19, #0x10]
00a6f134	bl 0x00c32360
00a6f138	str xzr,[x19, #0x18]
00a6f13c	ldp x29,x30,[sp, #0x10]
00a6f140	ldr x19,[sp], #0x20
00a6f144	ret
00a6f148	ldr x8,[x19, #0x28]
00a6f14c	cbz x8,0x00a6f11c
00a6f150	ldr w1,[x19]
00a6f154	add x0,sp,#0x8
00a6f158	bl 0x00c37b20
00a6f15c	cbnz x0,0x00a6f0fc
00a6f160	b 0x00a6f11c
