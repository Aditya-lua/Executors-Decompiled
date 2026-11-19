; ossl_lib_ctx_onfree @ 00a817c8
00a817c8	stp x20,x19,[sp, #-0x20]!
00a817cc	mov x20,x1
00a817d0	adrp x1,0x2aa000
00a817d4	mov x19,x0
00a817d8	add x1,x1,#0x296
00a817dc	mov w0,#0x10
00a817e0	mov w2,#0x1e7
00a817e4	stp x29,x30,[sp, #0x10]
00a817e8	add x29,sp,#0x10
00a817ec	bl 0x00c32320
00a817f0	cbz x0,0x00a81808
00a817f4	str x20,[x0]
00a817f8	ldr x8,[x19, #0x1b8]
00a817fc	str x8,[x0, #0x8]
00a81800	str x0,[x19, #0x1b8]
00a81804	mov w0,#0x1
00a81808	ldp x29,x30,[sp, #0x10]
00a8180c	ldp x20,x19,[sp], #0x20
00a81810	ret
