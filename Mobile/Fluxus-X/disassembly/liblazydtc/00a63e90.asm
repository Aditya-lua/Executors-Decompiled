; EVP_KEYEXCH_gettable_ctx_params @ 00a63e90
00a63e90	str x19,[sp, #-0x20]!
00a63e94	stp x29,x30,[sp, #0x10]
00a63e98	add x29,sp,#0x10
00a63e9c	cbz x0,0x00a63ecc
00a63ea0	ldr x8,[x0, #0x78]
00a63ea4	mov x19,x0
00a63ea8	cbz x8,0x00a63ecc
00a63eac	ldr x0,[x19, #0x18]
00a63eb0	bl 0x00c3b680
00a63eb4	ldr x2,[x19, #0x78]
00a63eb8	ldp x29,x30,[sp, #0x10]
00a63ebc	mov x1,x0
00a63ec0	mov x0,xzr
00a63ec4	ldr x19,[sp], #0x20
00a63ec8	br x2
00a63ecc	ldp x29,x30,[sp, #0x10]
00a63ed0	mov x0,xzr
00a63ed4	ldr x19,[sp], #0x20
00a63ed8	ret
