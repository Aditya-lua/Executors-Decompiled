; EVP_KEM_settable_ctx_params @ 00a654b0
00a654b0	str x19,[sp, #-0x20]!
00a654b4	stp x29,x30,[sp, #0x10]
00a654b8	add x29,sp,#0x10
00a654bc	cbz x0,0x00a654ec
00a654c0	ldr x8,[x0, #0x80]
00a654c4	mov x19,x0
00a654c8	cbz x8,0x00a654ec
00a654cc	ldr x0,[x19, #0x18]
00a654d0	bl 0x00c3b680
00a654d4	ldr x2,[x19, #0x80]
00a654d8	ldp x29,x30,[sp, #0x10]
00a654dc	mov x1,x0
00a654e0	mov x0,xzr
00a654e4	ldr x19,[sp], #0x20
00a654e8	br x2
00a654ec	ldp x29,x30,[sp, #0x10]
00a654f0	mov x0,xzr
00a654f4	ldr x19,[sp], #0x20
00a654f8	ret
