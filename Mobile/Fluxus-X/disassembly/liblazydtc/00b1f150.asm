; X509_alias_set1 @ 00b1f150
00b1f150	stp x22,x21,[sp, #-0x30]!
00b1f154	mov x21,x0
00b1f158	stp x20,x19,[sp, #0x10]
00b1f15c	stp x29,x30,[sp, #0x20]
00b1f160	add x29,sp,#0x20
00b1f164	cbz x1,0x00b1f1c0
00b1f168	cbz x21,0x00b1f1e8
00b1f16c	ldr x22,[x21, #0x150]
00b1f170	mov w19,w2
00b1f174	mov x20,x1
00b1f178	cbnz x22,0x00b1f194
00b1f17c	adrp x0,0xc82000
00b1f180	add x0,x0,#0xc60
00b1f184	bl 0x00c372e0
00b1f188	mov x22,x0
00b1f18c	str x0,[x21, #0x150]
00b1f190	cbz x0,0x00b1f1ec
00b1f194	ldr x0,[x22, #0x10]
00b1f198	cbnz x0,0x00b1f1a8
00b1f19c	bl 0x00c381a0
00b1f1a0	str x0,[x22, #0x10]
00b1f1a4	cbz x0,0x00b1f1ec
00b1f1a8	mov x1,x20
00b1f1ac	mov w2,w19
00b1f1b0	ldp x29,x30,[sp, #0x20]
00b1f1b4	ldp x20,x19,[sp, #0x10]
00b1f1b8	ldp x22,x21,[sp], #0x30
00b1f1bc	b 0x00c378a0
00b1f1c0	cbz x21,0x00b1f1e0
00b1f1c4	ldr x8,[x21, #0x150]
00b1f1c8	cbz x8,0x00b1f1e0
00b1f1cc	ldr x0,[x8, #0x10]
00b1f1d0	cbz x0,0x00b1f1e0
00b1f1d4	bl 0x00c38190
00b1f1d8	ldr x8,[x21, #0x150]
00b1f1dc	str xzr,[x8, #0x10]
00b1f1e0	mov w0,#0x1
00b1f1e4	b 0x00b1f1ec
00b1f1e8	mov w0,wzr
00b1f1ec	ldp x29,x30,[sp, #0x20]
00b1f1f0	ldp x20,x19,[sp, #0x10]
00b1f1f4	ldp x22,x21,[sp], #0x30
00b1f1f8	ret
