; X509_find_by_subject @ 00b09680
00b09680	stp x22,x21,[sp, #-0x30]!
00b09684	stp x20,x19,[sp, #0x10]
00b09688	stp x29,x30,[sp, #0x20]
00b0968c	add x29,sp,#0x20
00b09690	mov x19,x1
00b09694	mov x20,x0
00b09698	bl 0x00c325e0
00b0969c	cmp w0,#0x1
00b096a0	b.lt 0x00b096dc
00b096a4	mov w21,wzr
00b096a8	mov x0,x20
00b096ac	mov w1,w21
00b096b0	bl 0x00c32610
00b096b4	mov x22,x0
00b096b8	ldr x0,[x0, #0x48]
00b096bc	mov x1,x19
00b096c0	bl 0x00b08db0
00b096c4	cbz w0,0x00b096e0
00b096c8	mov x0,x20
00b096cc	add w21,w21,#0x1
00b096d0	bl 0x00c325e0
00b096d4	cmp w21,w0
00b096d8	b.lt 0x00b096a8
00b096dc	mov x22,xzr
00b096e0	ldp x29,x30,[sp, #0x20]
00b096e4	ldp x20,x19,[sp, #0x10]
00b096e8	mov x0,x22
00b096ec	ldp x22,x21,[sp], #0x30
00b096f0	ret
