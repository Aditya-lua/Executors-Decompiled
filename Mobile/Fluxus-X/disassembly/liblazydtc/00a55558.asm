; err_clear_last_constant_time @ 00a55558
00a55558	str x19,[sp, #-0x20]!
00a5555c	stp x29,x30,[sp, #0x10]
00a55560	add x29,sp,#0x10
00a55564	mov w19,w0
00a55568	bl 0x00a54260
00a5556c	cbz x0,0x00a555a8
00a55570	sub w8,w19,#0x1
00a55574	ldrsw x9,[x0, #0x380]
00a55578	bic w8,w8,w19
00a5557c	asr w8,w8,#0x1f
00a55580	str w8,[sp, #0x8]
00a55584	mvn w8,w8
00a55588	ldr w10,[sp, #0x8]
00a5558c	stur w8,[x29, #-0x4]
00a55590	ldur w8,[x29, #-0x4]
00a55594	lsl x9,x9,#0x2
00a55598	ldr w10,[x0, x9#0x0]
00a5559c	and w8,w8,#0x2
00a555a0	orr w8,w10,w8
00a555a4	str w8,[x0, x9#0x0]
00a555a8	ldp x29,x30,[sp, #0x10]
00a555ac	ldr x19,[sp], #0x20
00a555b0	ret
