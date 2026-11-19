; OSSL_PARAM_BLD_push_uint32 @ 00a9d2a8
00a9d2a8	str x19,[sp, #-0x20]!
00a9d2ac	mov w19,w2
00a9d2b0	mov w2,#0x4
00a9d2b4	mov w3,#0x4
00a9d2b8	mov w4,#0x2
00a9d2bc	mov w5,wzr
00a9d2c0	stp x29,x30,[sp, #0x10]
00a9d2c4	add x29,sp,#0x10
00a9d2c8	bl 0x00a9d5b4
00a9d2cc	cbz x0,0x00a9d2d8
00a9d2d0	str w19,[x0, #0x30]
00a9d2d4	mov w0,#0x1
00a9d2d8	ldp x29,x30,[sp, #0x10]
00a9d2dc	ldr x19,[sp], #0x20
00a9d2e0	ret
