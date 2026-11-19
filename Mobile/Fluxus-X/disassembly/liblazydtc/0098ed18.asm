; ix::WebSocket::isConnected @ 0098ed18
0098ed18	stp x29,x30,[sp, #-0x10]!
0098ed1c	mov x29,sp
0098ed20	bl 0x00c33990
0098ed24	cmp w0,#0x3
0098ed28	b.hi 0x0098ed40
0098ed2c	and w8,w0,#0xf
0098ed30	cmp w8,#0x3
0098ed34	cset w0,eq
0098ed38	ldp x29,x30,[sp], #0x10
0098ed3c	ret
0098ed40	mov w0,wzr
0098ed44	ldp x29,x30,[sp], #0x10
0098ed48	ret
