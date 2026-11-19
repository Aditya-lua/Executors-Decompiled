; ix::HttpServer::~HttpServer @ 0097c8f0
0097c8f0	str x19,[sp, #-0x20]!
0097c8f4	stp x29,x30,[sp, #0x10]
0097c8f8	add x29,sp,#0x10
0097c8fc	adrp x8,0xcb4000
0097c900	mov x19,x0
0097c904	ldr x0,[x0, #0x310]
0097c908	ldr x8,[x8, #0xf60]
0097c90c	add x9,x19,#0x2f0
0097c910	cmp x9,x0
0097c914	add x8,x8,#0x10
0097c918	str x8,[x19]
0097c91c	b.eq 0x0097c930
0097c920	cbz x0,0x0097c93c
0097c924	ldr x8,[x0]
0097c928	ldr x8,[x8, #0x28]
0097c92c	b 0x0097c938
0097c930	ldr x8,[x0]
0097c934	ldr x8,[x8, #0x20]
0097c938	blr x8
0097c93c	mov x0,x19
0097c940	bl 0x00c333a0
0097c944	ldp x29,x30,[sp, #0x10]
0097c948	mov x0,x19
0097c94c	ldr x19,[sp], #0x20
0097c950	b 0x00c301d0
