; d2i_RSA_PUBKEY @ 00b1d594
00b1d594	sub sp,sp,#0x40
00b1d598	stp x22,x21,[sp, #0x10]
00b1d59c	stp x20,x19,[sp, #0x20]
00b1d5a0	stp x29,x30,[sp, #0x30]
00b1d5a4	ldr x8,[x1]
00b1d5a8	mov x20,x1
00b1d5ac	mov x19,x0
00b1d5b0	add x1,sp,#0x8
00b1d5b4	mov w5,#0x1
00b1d5b8	mov x0,xzr
00b1d5bc	mov x3,xzr
00b1d5c0	mov x4,xzr
00b1d5c4	add x29,sp,#0x30
00b1d5c8	str x8,[sp, #0x8]
00b1d5cc	bl 0x00b1d214
00b1d5d0	cbz x0,0x00b1d608
00b1d5d4	mov x22,x0
00b1d5d8	bl 0x00c32470
00b1d5dc	mov x21,x0
00b1d5e0	mov x0,x22
00b1d5e4	bl 0x00c32450
00b1d5e8	cbz x21,0x00b1d60c
00b1d5ec	ldr x8,[sp, #0x8]
00b1d5f0	str x8,[x20]
00b1d5f4	cbz x19,0x00b1d60c
00b1d5f8	ldr x0,[x19]
00b1d5fc	bl 0x00c326d0
00b1d600	str x21,[x19]
00b1d604	b 0x00b1d60c
00b1d608	mov x21,xzr
00b1d60c	mov x0,x21
00b1d610	ldp x29,x30,[sp, #0x30]
00b1d614	ldp x20,x19,[sp, #0x20]
00b1d618	ldp x22,x21,[sp, #0x10]
00b1d61c	add sp,sp,#0x40
00b1d620	ret
