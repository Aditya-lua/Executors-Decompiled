; OSSL_PARAM_BLD_push_int @ 00a9d17c
00a9d17c	str x19,[sp, #-0x20]!
00a9d180	mov w19,w2
00a9d184	mov w2,#0x4
00a9d188	mov w3,#0x4
00a9d18c	mov w4,#0x1
00a9d190	mov w5,wzr
00a9d194	stp x29,x30,[sp, #0x10]
00a9d198	add x29,sp,#0x10
00a9d19c	bl 0x00a9d5b4
00a9d1a0	cbz x0,0x00a9d1ac
00a9d1a4	str w19,[x0, #0x30]
00a9d1a8	mov w0,#0x1
00a9d1ac	ldp x29,x30,[sp, #0x10]
00a9d1b0	ldr x19,[sp], #0x20
00a9d1b4	ret
