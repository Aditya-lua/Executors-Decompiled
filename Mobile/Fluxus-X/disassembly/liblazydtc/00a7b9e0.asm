; EVP_SIGNATURE_gettable_ctx_params @ 00a7b9e0
00a7b9e0	str x19,[sp, #-0x20]!
00a7b9e4	stp x29,x30,[sp, #0x10]
00a7b9e8	add x29,sp,#0x10
00a7b9ec	cbz x0,0x00a7ba1c
00a7b9f0	ldr x8,[x0, #0xc0]
00a7b9f4	mov x19,x0
00a7b9f8	cbz x8,0x00a7ba1c
00a7b9fc	ldr x0,[x19, #0x18]
00a7ba00	bl 0x00c3b680
00a7ba04	ldr x2,[x19, #0xc0]
00a7ba08	ldp x29,x30,[sp, #0x10]
00a7ba0c	mov x1,x0
00a7ba10	mov x0,xzr
00a7ba14	ldr x19,[sp], #0x20
00a7ba18	br x2
00a7ba1c	ldp x29,x30,[sp, #0x10]
00a7ba20	mov x0,xzr
00a7ba24	ldr x19,[sp], #0x20
00a7ba28	ret
