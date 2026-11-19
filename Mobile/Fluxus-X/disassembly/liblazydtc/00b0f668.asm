; X509_STORE_CTX_free @ 00b0f668
00b0f668	cbz x0,0x00b0f70c
00b0f66c	stp x20,x19,[sp, #-0x20]!
00b0f670	stp x29,x30,[sp, #0x10]
00b0f674	ldr x8,[x0, #0x88]
00b0f678	mov x19,x0
00b0f67c	add x29,sp,#0x10
00b0f680	cbz x8,0x00b0f690
00b0f684	mov x0,x19
00b0f688	blr x8
00b0f68c	str xzr,[x19, #0x88]
00b0f690	ldr x0,[x19, #0x20]
00b0f694	cbz x0,0x00b0f6a8
00b0f698	ldr x8,[x19, #0xd8]
00b0f69c	cbnz x8,0x00b0f6a4
00b0f6a0	bl 0x00c35b90
00b0f6a4	str xzr,[x19, #0x20]
00b0f6a8	ldr x0,[x19, #0xa0]
00b0f6ac	bl 0x00c40610
00b0f6b0	str xzr,[x19, #0xa0]
00b0f6b4	adrp x1,0xcb4000
00b0f6b8	ldr x0,[x19, #0x98]
00b0f6bc	ldr x1,[x1, #0xd88]
00b0f6c0	bl 0x00c32600
00b0f6c4	add x2,x19,#0xe0
00b0f6c8	mov w0,#0x5
00b0f6cc	mov x1,x19
00b0f6d0	str xzr,[x19, #0x98]
00b0f6d4	bl 0x00c356c0
00b0f6d8	ldr x0,[x19, #0x108]
00b0f6dc	adrp x20,0x2a0000
00b0f6e0	add x20,x20,#0xe02
00b0f6e4	mov w2,#0x90d
00b0f6e8	mov x1,x20
00b0f6ec	stp xzr,xzr,[x19, #0xe0]
00b0f6f0	bl 0x00c32310
00b0f6f4	ldp x29,x30,[sp, #0x10]
00b0f6f8	mov w2,#0x90e
00b0f6fc	mov x0,x19
00b0f700	mov x1,x20
00b0f704	ldp x20,x19,[sp], #0x20
00b0f708	b 0x00c32310
00b0f70c	ret
