; ix::HttpServer::~HttpServer @ 0097c894
0097c894	str x19,[sp, #-0x20]!
0097c898	stp x29,x30,[sp, #0x10]
0097c89c	add x29,sp,#0x10
0097c8a0	adrp x8,0xcb4000
0097c8a4	mov x19,x0
0097c8a8	ldr x0,[x0, #0x310]
0097c8ac	ldr x8,[x8, #0xf60]
0097c8b0	add x9,x19,#0x2f0
0097c8b4	cmp x9,x0
0097c8b8	add x8,x8,#0x10
0097c8bc	str x8,[x19]
0097c8c0	b.eq 0x0097c8d4
0097c8c4	cbz x0,0x0097c8e0
0097c8c8	ldr x8,[x0]
0097c8cc	ldr x8,[x8, #0x28]
0097c8d0	b 0x0097c8dc
0097c8d4	ldr x8,[x0]
0097c8d8	ldr x8,[x8, #0x20]
0097c8dc	blr x8
0097c8e0	ldp x29,x30,[sp, #0x10]
0097c8e4	mov x0,x19
0097c8e8	ldr x19,[sp], #0x20
0097c8ec	b 0x00c333a0
