; ix::WebSocket::getMinWaitBetweenReconnectionRetries @ 0098d8bc
0098d8bc	stp x20,x19,[sp, #-0x20]!
0098d8c0	stp x29,x30,[sp, #0x10]
0098d8c4	add x29,sp,#0x10
0098d8c8	add x20,x0,#0x3a0
0098d8cc	mov x19,x0
0098d8d0	mov x0,x20
0098d8d4	bl 0x00c2ff10
0098d8d8	ldr w19,[x19, #0x440]
0098d8dc	mov x0,x20
0098d8e0	bl 0x00c2ff20
0098d8e4	ldp x29,x30,[sp, #0x10]
0098d8e8	mov w0,w19
0098d8ec	ldp x20,x19,[sp], #0x20
0098d8f0	ret
