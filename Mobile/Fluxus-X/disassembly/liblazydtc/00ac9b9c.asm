; EVP_RAND_settable_ctx_params @ 00ac9b9c
00ac9b9c	ldr x8,[x0, #0x98]
00ac9ba0	cbz x8,0x00ac9bd4
00ac9ba4	str x19,[sp, #-0x20]!
00ac9ba8	stp x29,x30,[sp, #0x10]
00ac9bac	mov x19,x0
00ac9bb0	ldr x0,[x0]
00ac9bb4	add x29,sp,#0x10
00ac9bb8	bl 0x00c3b680
00ac9bbc	ldr x2,[x19, #0x98]
00ac9bc0	ldp x29,x30,[sp, #0x10]
00ac9bc4	mov x1,x0
00ac9bc8	mov x0,xzr
00ac9bcc	ldr x19,[sp], #0x20
00ac9bd0	br x2
00ac9bd4	mov x0,xzr
00ac9bd8	ret
