; ix::SocketServer::onSetTerminatedCallback @ 0098aae8
0098aae8	stp x20,x19,[sp, #-0x20]!
0098aaec	stp x29,x30,[sp, #0x10]
0098aaf0	add x29,sp,#0x10
0098aaf4	add x20,x0,#0x210
0098aaf8	mov x19,x0
0098aafc	mov x0,x20
0098ab00	bl 0x00c2ff10
0098ab04	mov w8,#0x1
0098ab08	mov x0,x20
0098ab0c	strb w8,[x19, #0x238]
0098ab10	bl 0x00c2ff20
0098ab14	ldp x29,x30,[sp, #0x10]
0098ab18	add x0,x19,#0x1e0
0098ab1c	ldp x20,x19,[sp], #0x20
0098ab20	b 0x00c315f0
