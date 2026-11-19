; ix::WebSocket::setMinWaitBetweenReconnectionRetries @ 0098d848
0098d848	str x21,[sp, #-0x30]!
0098d84c	stp x20,x19,[sp, #0x10]
0098d850	stp x29,x30,[sp, #0x20]
0098d854	add x29,sp,#0x20
0098d858	add x21,x0,#0x3a0
0098d85c	mov x20,x0
0098d860	mov x0,x21
0098d864	mov w19,w1
0098d868	bl 0x00c2ff10
0098d86c	str w19,[x20, #0x440]
0098d870	ldp x29,x30,[sp, #0x20]
0098d874	ldp x20,x19,[sp, #0x10]
0098d878	mov x0,x21
0098d87c	ldr x21,[sp], #0x30
0098d880	b 0x00c2ff20
