; ix::WebSocket::getSubProtocols @ 0098e340
0098e340	stp x20,x19,[sp, #-0x20]!
0098e344	stp x29,x30,[sp, #0x10]
0098e348	add x29,sp,#0x10
0098e34c	add x20,x0,#0x3a0
0098e350	mov x19,x0
0098e354	mov x0,x20
0098e358	bl 0x00c2ff10
0098e35c	mov x0,x20
0098e360	add x19,x19,#0x4d0
0098e364	bl 0x00c2ff20
0098e368	ldp x29,x30,[sp, #0x10]
0098e36c	mov x0,x19
0098e370	ldp x20,x19,[sp], #0x20
0098e374	ret
