; ix::SocketServer::wait @ 0098a5c4
0098a5c4	sub sp,sp,#0x40
0098a5c8	stp x20,x19,[sp, #0x20]
0098a5cc	stp x29,x30,[sp, #0x30]
0098a5d0	add x29,sp,#0x30
0098a5d4	mrs x20,tpidr_el0
0098a5d8	ldr x8,[x20, #0x28]
0098a5dc	mov x19,x0
0098a5e0	add x0,x0,#0xf8
0098a5e4	mov w9,#0x1
0098a5e8	str x8,[sp, #0x18]
0098a5ec	str x0,[sp, #0x8]
0098a5f0	strb w9,[sp, #0x10]
0098a5f4	bl 0x00c2ff10
0098a5f8	add x0,x19,#0xc8
0098a5fc	add x1,sp,#0x8
0098a600	bl 0x00c33250
0098a604	ldrb w8,[sp, #0x10]
0098a608	cbz w8,0x0098a614
0098a60c	ldr x0,[sp, #0x8]
0098a610	bl 0x00c2ff20
0098a614	ldr x8,[x20, #0x28]
0098a618	ldr x9,[sp, #0x18]
0098a61c	cmp x8,x9
0098a620	b.ne 0x0098a634
0098a624	ldp x29,x30,[sp, #0x30]
0098a628	ldp x20,x19,[sp, #0x20]
0098a62c	add sp,sp,#0x40
0098a630	ret
0098a634	bl 0x00c2fec0
