; psa_mac_abort @ 00b883f4
00b883f4	str x19,[sp, #-0x20]!
00b883f8	stp x29,x30,[sp, #0x10]
00b883fc	add x29,sp,#0x10
00b88400	mov x19,x0
00b88404	ldr w0,[x0]
00b88408	cbz w0,0x00b88438
00b8840c	cmp w0,#0x1
00b88410	b.ne 0x00b88420
00b88414	add x0,x19,#0x8
00b88418	bl 0x00c43040
00b8841c	b 0x00b88424
00b88420	mov w0,#0xffffff79
00b88424	ldrb w8,[x19, #0x5]
00b88428	strb wzr,[x19, #0x4]
00b8842c	str wzr,[x19]
00b88430	and w8,w8,#0xfe
00b88434	strb w8,[x19, #0x5]
00b88438	ldp x29,x30,[sp, #0x10]
00b8843c	ldr x19,[sp], #0x20
00b88440	ret
