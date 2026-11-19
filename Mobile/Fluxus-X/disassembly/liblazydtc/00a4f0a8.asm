; OSSL_DECODER_settable_ctx_params @ 00a4f0a8
00a4f0a8	str x19,[sp, #-0x20]!
00a4f0ac	stp x29,x30,[sp, #0x10]
00a4f0b0	add x29,sp,#0x10
00a4f0b4	cbz x0,0x00a4f0dc
00a4f0b8	ldr x8,[x0, #0x60]
00a4f0bc	mov x19,x0
00a4f0c0	cbz x8,0x00a4f0dc
00a4f0c4	ldr x0,[x19]
00a4f0c8	bl 0x00c3b680
00a4f0cc	ldr x1,[x19, #0x60]
00a4f0d0	ldp x29,x30,[sp, #0x10]
00a4f0d4	ldr x19,[sp], #0x20
00a4f0d8	br x1
00a4f0dc	ldp x29,x30,[sp, #0x10]
00a4f0e0	mov x0,xzr
00a4f0e4	ldr x19,[sp], #0x20
00a4f0e8	ret
