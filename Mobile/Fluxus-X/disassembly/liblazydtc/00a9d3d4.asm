; OSSL_PARAM_BLD_push_double @ 00a9d3d4
00a9d3d4	str d8,[sp, #-0x20]!
00a9d3d8	mov w2,#0x8
00a9d3dc	mov w3,#0x8
00a9d3e0	orr w4,wzr,#0x3
00a9d3e4	mov w5,wzr
00a9d3e8	stp x29,x30,[sp, #0x10]
00a9d3ec	add x29,sp,#0x10
00a9d3f0	mov v8.16B,v0.16B
00a9d3f4	bl 0x00a9d5b4
00a9d3f8	cbz x0,0x00a9d404
00a9d3fc	str d8,[x0, #0x30]
00a9d400	mov w0,#0x1
00a9d404	ldp x29,x30,[sp, #0x10]
00a9d408	ldr d8,[sp], #0x20
00a9d40c	ret
