; ossl_decoder_instance_free @ 00a4d67c
00a4d67c	cbz x0,0x00a4d6ac
00a4d680	str x19,[sp, #-0x20]!
00a4d684	stp x29,x30,[sp, #0x10]
00a4d688	ldr x8,[x0]
00a4d68c	mov x19,x0
00a4d690	add x29,sp,#0x10
00a4d694	cbz x8,0x00a4d6b0
00a4d698	ldr x8,[x8, #0x40]
00a4d69c	ldr x0,[x19, #0x8]
00a4d6a0	blr x8
00a4d6a4	ldr x0,[x19]
00a4d6a8	b 0x00a4d6b4
00a4d6ac	ret
00a4d6b0	mov x0,xzr
00a4d6b4	str xzr,[x19, #0x8]
00a4d6b8	bl 0x00c3b3c0
00a4d6bc	str xzr,[x19]
00a4d6c0	ldp x29,x30,[sp, #0x10]
00a4d6c4	adrp x1,0x2bd000
00a4d6c8	add x1,x1,#0x9db
00a4d6cc	mov w2,#0x118
00a4d6d0	mov x0,x19
00a4d6d4	ldr x19,[sp], #0x20
00a4d6d8	b 0x00c32310
