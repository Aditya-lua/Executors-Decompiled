; ix::SocketServer::getConnectionsThreadsCount @ 0098aaa8
0098aaa8	stp x20,x19,[sp, #-0x20]!
0098aaac	stp x29,x30,[sp, #0x10]
0098aab0	add x29,sp,#0x10
0098aab4	add x20,x0,#0xa0
0098aab8	mov x19,x0
0098aabc	mov x0,x20
0098aac0	bl 0x00c2ff10
0098aac4	ldr x19,[x19, #0x98]
0098aac8	mov x0,x20
0098aacc	bl 0x00c2ff20
0098aad0	ldp x29,x30,[sp, #0x10]
0098aad4	mov x0,x19
0098aad8	ldp x20,x19,[sp], #0x20
0098aadc	ret
