; OSSL_PARAM_BLD_push_time_t @ 00a9d398
00a9d398	str x19,[sp, #-0x20]!
00a9d39c	mov x19,x2
00a9d3a0	mov w2,#0x8
00a9d3a4	mov w3,#0x8
00a9d3a8	mov w4,#0x1
00a9d3ac	mov w5,wzr
00a9d3b0	stp x29,x30,[sp, #0x10]
00a9d3b4	add x29,sp,#0x10
00a9d3b8	bl 0x00a9d5b4
00a9d3bc	cbz x0,0x00a9d3c8
00a9d3c0	str x19,[x0, #0x30]
00a9d3c4	mov w0,#0x1
00a9d3c8	ldp x29,x30,[sp, #0x10]
00a9d3cc	ldr x19,[sp], #0x20
00a9d3d0	ret
