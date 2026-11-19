; mbedtls_entropy_free @ 00b76284
00b76284	str x19,[sp, #-0x20]!
00b76288	stp x29,x30,[sp, #0x10]
00b7628c	add x29,sp,#0x10
00b76290	mov x19,x0
00b76294	cbz x0,0x00b762c4
00b76298	ldr w8,[x19, #0x18]
00b7629c	cmn w8,#0x1
00b762a0	b.eq 0x00b762c4
00b762a4	mov x0,x19
00b762a8	bl 0x00c42830
00b762ac	add x0,x19,#0x20
00b762b0	mov w1,#0x320
00b762b4	str wzr,[x19, #0x1c]
00b762b8	bl 0x00c42220
00b762bc	mov w8,#0xffffffff
00b762c0	str w8,[x19, #0x18]
00b762c4	ldp x29,x30,[sp, #0x10]
00b762c8	ldr x19,[sp], #0x20
00b762cc	ret
