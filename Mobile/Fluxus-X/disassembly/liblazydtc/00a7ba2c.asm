; EVP_SIGNATURE_settable_ctx_params @ 00a7ba2c
00a7ba2c	str x19,[sp, #-0x20]!
00a7ba30	stp x29,x30,[sp, #0x10]
00a7ba34	add x29,sp,#0x10
00a7ba38	cbz x0,0x00a7ba68
00a7ba3c	ldr x8,[x0, #0xd0]
00a7ba40	mov x19,x0
00a7ba44	cbz x8,0x00a7ba68
00a7ba48	ldr x0,[x19, #0x18]
00a7ba4c	bl 0x00c3b680
00a7ba50	ldr x2,[x19, #0xd0]
00a7ba54	ldp x29,x30,[sp, #0x10]
00a7ba58	mov x1,x0
00a7ba5c	mov x0,xzr
00a7ba60	ldr x19,[sp], #0x20
00a7ba64	br x2
00a7ba68	ldp x29,x30,[sp, #0x10]
00a7ba6c	mov x0,xzr
00a7ba70	ldr x19,[sp], #0x20
00a7ba74	ret
