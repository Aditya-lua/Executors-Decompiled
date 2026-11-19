; ix::WebSocket::getMaxWaitBetweenReconnectionRetries @ 0098d884
0098d884	stp x20,x19,[sp, #-0x20]!
0098d888	stp x29,x30,[sp, #0x10]
0098d88c	add x29,sp,#0x10
0098d890	add x20,x0,#0x3a0
0098d894	mov x19,x0
0098d898	mov x0,x20
0098d89c	bl 0x00c2ff10
0098d8a0	ldr w19,[x19, #0x43c]
0098d8a4	mov x0,x20
0098d8a8	bl 0x00c2ff20
0098d8ac	ldp x29,x30,[sp, #0x10]
0098d8b0	mov w0,w19
0098d8b4	ldp x20,x19,[sp], #0x20
0098d8b8	ret
