; ossl_encoder_instance_free @ 00a62250
00a62250	cbz x0,0x00a62280
00a62254	str x19,[sp, #-0x20]!
00a62258	stp x29,x30,[sp, #0x10]
00a6225c	ldr x8,[x0]
00a62260	mov x19,x0
00a62264	add x29,sp,#0x10
00a62268	cbz x8,0x00a62284
00a6226c	ldr x8,[x8, #0x40]
00a62270	ldr x0,[x19, #0x8]
00a62274	blr x8
00a62278	ldr x0,[x19]
00a6227c	b 0x00a62288
00a62280	ret
00a62284	mov x0,xzr
00a62288	str xzr,[x19, #0x8]
00a6228c	bl 0x00c3b8d0
00a62290	str xzr,[x19]
00a62294	ldp x29,x30,[sp, #0x10]
00a62298	adrp x1,0x2a0000
00a6229c	add x1,x1,#0x26d
00a622a0	orr w2,wzr,#0xff
00a622a4	mov x0,x19
00a622a8	ldr x19,[sp], #0x20
00a622ac	b 0x00c32310
