; X509_REQ_add1_attr_by_txt @ 00b0c57c
00b0c57c	str x19,[sp, #-0x20]!
00b0c580	stp x29,x30,[sp, #0x10]
00b0c584	add x29,sp,#0x10
00b0c588	cbz x0,0x00b0c5a8
00b0c58c	mov x19,x0
00b0c590	add x0,x0,#0x30
00b0c594	bl 0x00c3d0d0
00b0c598	cbz x0,0x00b0c5dc
00b0c59c	mov w0,#0x1
00b0c5a0	str w0,[x19, #0x10]
00b0c5a4	b 0x00b0c5dc
00b0c5a8	bl 0x00c342a0
00b0c5ac	adrp x0,0x2a4000
00b0c5b0	adrp x2,0x2a0000
00b0c5b4	add x0,x0,#0xaf5
00b0c5b8	add x2,x2,#0xdbc
00b0c5bc	mov w1,#0x115
00b0c5c0	bl 0x00c342b0
00b0c5c4	mov w1,#0x102
00b0c5c8	mov w0,#0xb
00b0c5cc	movk w1,#0xc, LSL #16
00b0c5d0	mov x2,xzr
00b0c5d4	bl 0x00c342c0
00b0c5d8	mov w0,wzr
00b0c5dc	ldp x29,x30,[sp, #0x10]
00b0c5e0	ldr x19,[sp], #0x20
00b0c5e4	ret
