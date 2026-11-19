; EVP_KEYEXCH_settable_ctx_params @ 00a63edc
00a63edc	str x19,[sp, #-0x20]!
00a63ee0	stp x29,x30,[sp, #0x10]
00a63ee4	add x29,sp,#0x10
00a63ee8	cbz x0,0x00a63f18
00a63eec	ldr x8,[x0, #0x68]
00a63ef0	mov x19,x0
00a63ef4	cbz x8,0x00a63f18
00a63ef8	ldr x0,[x19, #0x18]
00a63efc	bl 0x00c3b680
00a63f00	ldr x2,[x19, #0x68]
00a63f04	ldp x29,x30,[sp, #0x10]
00a63f08	mov x1,x0
00a63f0c	mov x0,xzr
00a63f10	ldr x19,[sp], #0x20
00a63f14	br x2
00a63f18	ldp x29,x30,[sp, #0x10]
00a63f1c	mov x0,xzr
00a63f20	ldr x19,[sp], #0x20
00a63f24	ret
