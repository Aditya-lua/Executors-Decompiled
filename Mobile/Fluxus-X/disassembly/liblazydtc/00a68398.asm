; EVP_MAC_CTX_free @ 00a68398
00a68398	cbz x0,0x00a683e0
00a6839c	str x19,[sp, #-0x20]!
00a683a0	stp x29,x30,[sp, #0x10]
00a683a4	mov x19,x0
00a683a8	ldp x8,x0,[x0]
00a683ac	add x29,sp,#0x10
00a683b0	ldr x8,[x8, #0x40]
00a683b4	blr x8
00a683b8	ldr x0,[x19]
00a683bc	str xzr,[x19, #0x8]
00a683c0	bl 0x00c363c0
00a683c4	ldp x29,x30,[sp, #0x10]
00a683c8	adrp x1,0x2a6000
00a683cc	add x1,x1,#0x18
00a683d0	orr w2,wzr,#0x30
00a683d4	mov x0,x19
00a683d8	ldr x19,[sp], #0x20
00a683dc	b 0x00c32310
00a683e0	ret
