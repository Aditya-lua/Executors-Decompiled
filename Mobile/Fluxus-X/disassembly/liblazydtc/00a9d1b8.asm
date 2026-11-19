; OSSL_PARAM_BLD_push_uint @ 00a9d1b8
00a9d1b8	str x19,[sp, #-0x20]!
00a9d1bc	mov w19,w2
00a9d1c0	mov w2,#0x4
00a9d1c4	mov w3,#0x4
00a9d1c8	mov w4,#0x2
00a9d1cc	mov w5,wzr
00a9d1d0	stp x29,x30,[sp, #0x10]
00a9d1d4	add x29,sp,#0x10
00a9d1d8	bl 0x00a9d5b4
00a9d1dc	cbz x0,0x00a9d1e8
00a9d1e0	str w19,[x0, #0x30]
00a9d1e4	mov w0,#0x1
00a9d1e8	ldp x29,x30,[sp, #0x10]
00a9d1ec	ldr x19,[sp], #0x20
00a9d1f0	ret
