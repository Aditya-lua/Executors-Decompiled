; OSSL_PARAM_BLD_push_ulong @ 00a9d230
00a9d230	str x19,[sp, #-0x20]!
00a9d234	mov x19,x2
00a9d238	mov w2,#0x8
00a9d23c	mov w3,#0x8
00a9d240	mov w4,#0x2
00a9d244	mov w5,wzr
00a9d248	stp x29,x30,[sp, #0x10]
00a9d24c	add x29,sp,#0x10
00a9d250	bl 0x00a9d5b4
00a9d254	cbz x0,0x00a9d260
00a9d258	str x19,[x0, #0x30]
00a9d25c	mov w0,#0x1
00a9d260	ldp x29,x30,[sp, #0x10]
00a9d264	ldr x19,[sp], #0x20
00a9d268	ret
