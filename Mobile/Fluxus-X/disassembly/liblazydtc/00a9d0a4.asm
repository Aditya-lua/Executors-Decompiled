; OSSL_PARAM_BLD_new @ 00a9d0a4
00a9d0a4	str x19,[sp, #-0x20]!
00a9d0a8	adrp x1,0x29e000
00a9d0ac	add x1,x1,#0x440
00a9d0b0	orr w0,wzr,#0x18
00a9d0b4	mov w2,#0x5d
00a9d0b8	stp x29,x30,[sp, #0x10]
00a9d0bc	add x29,sp,#0x10
00a9d0c0	bl 0x00c34250
00a9d0c4	mov x19,x0
00a9d0c8	cbz x0,0x00a9d0f0
00a9d0cc	bl 0x00c34780
00a9d0d0	str x0,[x19, #0x10]
00a9d0d4	cbnz x0,0x00a9d0f0
00a9d0d8	adrp x1,0x29e000
00a9d0dc	add x1,x1,#0x440
00a9d0e0	mov w2,#0x62
00a9d0e4	mov x0,x19
00a9d0e8	bl 0x00c32310
00a9d0ec	mov x19,xzr
00a9d0f0	ldp x29,x30,[sp, #0x10]
00a9d0f4	mov x0,x19
00a9d0f8	ldr x19,[sp], #0x20
00a9d0fc	ret
