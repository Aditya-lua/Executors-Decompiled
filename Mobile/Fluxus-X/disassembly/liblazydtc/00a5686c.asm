; EVP_ASYM_CIPHER_settable_ctx_params @ 00a5686c
00a5686c	str x19,[sp, #-0x20]!
00a56870	stp x29,x30,[sp, #0x10]
00a56874	add x29,sp,#0x10
00a56878	cbz x0,0x00a568a8
00a5687c	ldr x8,[x0, #0x80]
00a56880	mov x19,x0
00a56884	cbz x8,0x00a568a8
00a56888	ldr x0,[x19, #0x18]
00a5688c	bl 0x00c3b680
00a56890	ldr x2,[x19, #0x80]
00a56894	ldp x29,x30,[sp, #0x10]
00a56898	mov x1,x0
00a5689c	mov x0,xzr
00a568a0	ldr x19,[sp], #0x20
00a568a4	br x2
00a568a8	ldp x29,x30,[sp, #0x10]
00a568ac	mov x0,xzr
00a568b0	ldr x19,[sp], #0x20
00a568b4	ret
