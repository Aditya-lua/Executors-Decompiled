; EVP_CIPHER_gettable_ctx_params @ 00a5c890
00a5c890	str x19,[sp, #-0x20]!
00a5c894	stp x29,x30,[sp, #0x10]
00a5c898	add x29,sp,#0x10
00a5c89c	cbz x0,0x00a5c8d0
00a5c8a0	ldr x8,[x0, #0xf0]
00a5c8a4	mov x19,x0
00a5c8a8	cbz x8,0x00a5c8d0
00a5c8ac	mov x0,x19
00a5c8b0	bl 0x00c34bb0
00a5c8b4	bl 0x00c3b680
00a5c8b8	ldr x2,[x19, #0xf0]
00a5c8bc	ldp x29,x30,[sp, #0x10]
00a5c8c0	mov x1,x0
00a5c8c4	mov x0,xzr
00a5c8c8	ldr x19,[sp], #0x20
00a5c8cc	br x2
00a5c8d0	ldp x29,x30,[sp, #0x10]
00a5c8d4	mov x0,xzr
00a5c8d8	ldr x19,[sp], #0x20
00a5c8dc	ret
