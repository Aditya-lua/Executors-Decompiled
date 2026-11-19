; ix::WebSocket::setTLSOptions @ 0098d3c0
0098d3c0	str x21,[sp, #-0x30]!
0098d3c4	stp x20,x19,[sp, #0x10]
0098d3c8	stp x29,x30,[sp, #0x20]
0098d3cc	add x29,sp,#0x20
0098d3d0	add x19,x0,#0x3a0
0098d3d4	mov x21,x0
0098d3d8	mov x0,x19
0098d3dc	mov x20,x1
0098d3e0	bl 0x00c2ff10
0098d3e4	add x0,x21,#0x318
0098d3e8	mov x1,x20
0098d3ec	bl 0x00c33050
0098d3f0	mov x0,x19
0098d3f4	ldp x29,x30,[sp, #0x20]
0098d3f8	ldp x20,x19,[sp, #0x10]
0098d3fc	ldr x21,[sp], #0x30
0098d400	b 0x00c2ff20
