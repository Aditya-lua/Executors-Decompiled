; OSSL_PARAM_BLD_push_int32 @ 00a9d26c
00a9d26c	str x19,[sp, #-0x20]!
00a9d270	mov w19,w2
00a9d274	mov w2,#0x4
00a9d278	mov w3,#0x4
00a9d27c	mov w4,#0x1
00a9d280	mov w5,wzr
00a9d284	stp x29,x30,[sp, #0x10]
00a9d288	add x29,sp,#0x10
00a9d28c	bl 0x00a9d5b4
00a9d290	cbz x0,0x00a9d29c
00a9d294	str w19,[x0, #0x30]
00a9d298	mov w0,#0x1
00a9d29c	ldp x29,x30,[sp, #0x10]
00a9d2a0	ldr x19,[sp], #0x20
00a9d2a4	ret
