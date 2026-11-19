; OSSL_PARAM_BLD_push_long @ 00a9d1f4
00a9d1f4	str x19,[sp, #-0x20]!
00a9d1f8	mov x19,x2
00a9d1fc	mov w2,#0x8
00a9d200	mov w3,#0x8
00a9d204	mov w4,#0x1
00a9d208	mov w5,wzr
00a9d20c	stp x29,x30,[sp, #0x10]
00a9d210	add x29,sp,#0x10
00a9d214	bl 0x00a9d5b4
00a9d218	cbz x0,0x00a9d224
00a9d21c	str x19,[x0, #0x30]
00a9d220	mov w0,#0x1
00a9d224	ldp x29,x30,[sp, #0x10]
00a9d228	ldr x19,[sp], #0x20
00a9d22c	ret
