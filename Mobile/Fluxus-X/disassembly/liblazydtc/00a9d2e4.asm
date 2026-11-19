; OSSL_PARAM_BLD_push_int64 @ 00a9d2e4
00a9d2e4	str x19,[sp, #-0x20]!
00a9d2e8	mov x19,x2
00a9d2ec	mov w2,#0x8
00a9d2f0	mov w3,#0x8
00a9d2f4	mov w4,#0x1
00a9d2f8	mov w5,wzr
00a9d2fc	stp x29,x30,[sp, #0x10]
00a9d300	add x29,sp,#0x10
00a9d304	bl 0x00a9d5b4
00a9d308	cbz x0,0x00a9d314
00a9d30c	str x19,[x0, #0x30]
00a9d310	mov w0,#0x1
00a9d314	ldp x29,x30,[sp, #0x10]
00a9d318	ldr x19,[sp], #0x20
00a9d31c	ret
