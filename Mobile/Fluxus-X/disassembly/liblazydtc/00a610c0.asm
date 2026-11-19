; OSSL_ENCODER_settable_ctx_params @ 00a610c0
00a610c0	str x19,[sp, #-0x20]!
00a610c4	stp x29,x30,[sp, #0x10]
00a610c8	add x29,sp,#0x10
00a610cc	cbz x0,0x00a610f4
00a610d0	ldr x8,[x0, #0x60]
00a610d4	mov x19,x0
00a610d8	cbz x8,0x00a610f4
00a610dc	ldr x0,[x19]
00a610e0	bl 0x00c3b680
00a610e4	ldr x1,[x19, #0x60]
00a610e8	ldp x29,x30,[sp, #0x10]
00a610ec	ldr x19,[sp], #0x20
00a610f0	br x1
00a610f4	ldp x29,x30,[sp, #0x10]
00a610f8	mov x0,xzr
00a610fc	ldr x19,[sp], #0x20
00a61100	ret
