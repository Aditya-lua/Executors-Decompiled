; ix::WebSocketServer::getConnectedClientsCount @ 009943e4
009943e4	stp x20,x19,[sp, #-0x20]!
009943e8	stp x29,x30,[sp, #0x10]
009943ec	add x29,sp,#0x10
009943f0	add x20,x0,#0x2b0
009943f4	mov x19,x0
009943f8	mov x0,x20
009943fc	bl 0x00c2ff10
00994400	ldr x19,[x19, #0x2e8]
00994404	mov x0,x20
00994408	bl 0x00c2ff20
0099440c	ldp x29,x30,[sp, #0x10]
00994410	mov x0,x19
00994414	ldp x20,x19,[sp], #0x20
00994418	ret
