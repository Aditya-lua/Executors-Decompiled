; OSSL_PARAM_BLD_push_octet_ptr @ 00a9d8b0
00a9d8b0	str x19,[sp, #-0x20]!
00a9d8b4	lsr x9,x3,#0x1f
00a9d8b8	stp x29,x30,[sp, #0x10]
00a9d8bc	add x29,sp,#0x10
00a9d8c0	cbz x9,0x00a9d8f8
00a9d8c4	bl 0x00c342a0
00a9d8c8	adrp x0,0x29e000
00a9d8cc	adrp x2,0x2b8000
00a9d8d0	add x0,x0,#0x440
00a9d8d4	add x2,x2,#0x1e
00a9d8d8	mov w1,#0x12a
00a9d8dc	bl 0x00c342b0
00a9d8e0	orr w0,wzr,#0xf
00a9d8e4	orr w1,wzr,#0x70
00a9d8e8	mov x2,xzr
00a9d8ec	bl 0x00c342c0
00a9d8f0	mov w0,wzr
00a9d8f4	b 0x00a9d920
00a9d8f8	mov x8,x3
00a9d8fc	mov x19,x2
00a9d900	mov w3,#0x8
00a9d904	orr w4,wzr,#0x7
00a9d908	mov w2,w8
00a9d90c	mov w5,wzr
00a9d910	bl 0x00a9d5b4
00a9d914	cbz x0,0x00a9d920
00a9d918	str x19,[x0, #0x28]
00a9d91c	mov w0,#0x1
00a9d920	ldp x29,x30,[sp, #0x10]
00a9d924	ldr x19,[sp], #0x20
00a9d928	ret
