; ix::WebSocket::setMaxWaitBetweenReconnectionRetries @ 0098d80c
0098d80c	str x21,[sp, #-0x30]!
0098d810	stp x20,x19,[sp, #0x10]
0098d814	stp x29,x30,[sp, #0x20]
0098d818	add x29,sp,#0x20
0098d81c	add x21,x0,#0x3a0
0098d820	mov x20,x0
0098d824	mov x0,x21
0098d828	mov w19,w1
0098d82c	bl 0x00c2ff10
0098d830	str w19,[x20, #0x43c]
0098d834	ldp x29,x30,[sp, #0x20]
0098d838	ldp x20,x19,[sp, #0x10]
0098d83c	mov x0,x21
0098d840	ldr x21,[sp], #0x30
0098d844	b 0x00c2ff20
