; FUN_00b245d8 @ 00b245d8
00b245d8	stp x20,x19,[sp, #-0x20]!
00b245dc	mov x8,x1
00b245e0	add x20,x0,#0x2c0
00b245e4	stp x29,x30,[sp, #0x10]
00b245e8	mov x19,x0
00b245ec	str x20,[x0, #0x2b8]
00b245f0	lsl w1,w2,#0x3
00b245f4	mov x0,x8
00b245f8	mov x2,x20
00b245fc	add x29,sp,#0x10
00b24600	bl 0x00c37370
00b24604	adrp x2,0xcb5000
00b24608	ldr x2,[x2, #0x310]
00b2460c	add x0,x19,#0xf8
00b24610	mov x1,x20
00b24614	bl 0x00c3e390
00b24618	ldrb w8,[x19, #0x54]
00b2461c	str xzr,[x19, #0x2b0]
00b24620	mov w0,#0x1
00b24624	orr w8,w8,#0x4
00b24628	strb w8,[x19, #0x54]
00b2462c	ldp x29,x30,[sp, #0x10]
00b24630	ldp x20,x19,[sp], #0x20
00b24634	ret
