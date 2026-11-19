; mbedtls_mpi_core_lt_ct @ 00b836c0
00b836c0	mov x8,x0
00b836c4	mov x0,xzr
00b836c8	mov x10,xzr
00b836cc	mov x9,xzr
00b836d0	cbz x2,0x00b83738
00b836d4	sub x10,x2,#0x1
00b836d8	lsl x11,x10,#0x3
00b836dc	ldr x12,[x1, x11#0x0]
00b836e0	ldr x13,[x8, x11#0x0]
00b836e4	sub x10,x10,#0x1
00b836e8	cmn x10,#0x1
00b836ec	eor x14,x13,x12
00b836f0	sub x12,x12,x13
00b836f4	bic x12,x12,x14
00b836f8	and x14,x14,x13
00b836fc	orr x14,x12,x14
00b83700	asr x12,x14,#0x3f
00b83704	ldr x13,[x8, x11#0x0]
00b83708	ldr x11,[x1, x11#0x0]
00b8370c	orr x9,x12,x9
00b83710	eor x12,x11,x13
00b83714	sub x13,x13,x11
00b83718	bic x13,x13,x12
00b8371c	and x12,x12,x11
00b83720	orr x12,x13,x12
00b83724	asr x13,x12,#0x3f
00b83728	bic x11,x13,x9
00b8372c	orr x0,x11,x0
00b83730	orr x9,x13,x9
00b83734	b.ne 0x00b836d8
00b83738	ret
