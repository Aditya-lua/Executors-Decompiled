; ix::WebSocket::setPingInterval @ 0098d5d4
0098d5d4	str x21,[sp, #-0x30]!
0098d5d8	stp x20,x19,[sp, #0x10]
0098d5dc	stp x29,x30,[sp, #0x20]
0098d5e0	add x29,sp,#0x20
0098d5e4	add x21,x0,#0x3a0
0098d5e8	mov x20,x0
0098d5ec	mov x0,x21
0098d5f0	mov w19,w1
0098d5f4	bl 0x00c2ff10
0098d5f8	str w19,[x20, #0x4a4]
0098d5fc	ldp x29,x30,[sp, #0x20]
0098d600	ldp x20,x19,[sp, #0x10]
0098d604	mov x0,x21
0098d608	ldr x21,[sp], #0x30
0098d60c	b 0x00c2ff20
