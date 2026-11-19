; EVP_CIPHER_settable_ctx_params @ 00a5c0b0
00a5c0b0	str x19,[sp, #-0x20]!
00a5c0b4	stp x29,x30,[sp, #0x10]
00a5c0b8	add x29,sp,#0x10
00a5c0bc	cbz x0,0x00a5c0f0
00a5c0c0	ldr x8,[x0, #0xf8]
00a5c0c4	mov x19,x0
00a5c0c8	cbz x8,0x00a5c0f0
00a5c0cc	mov x0,x19
00a5c0d0	bl 0x00c34bb0
00a5c0d4	bl 0x00c3b680
00a5c0d8	ldr x2,[x19, #0xf8]
00a5c0dc	ldp x29,x30,[sp, #0x10]
00a5c0e0	mov x1,x0
00a5c0e4	mov x0,xzr
00a5c0e8	ldr x19,[sp], #0x20
00a5c0ec	br x2
00a5c0f0	ldp x29,x30,[sp, #0x10]
00a5c0f4	mov x0,xzr
00a5c0f8	ldr x19,[sp], #0x20
00a5c0fc	ret
