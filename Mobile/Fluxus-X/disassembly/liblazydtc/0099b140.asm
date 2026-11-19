; ix::WebSocketHandshake::insensitiveStringCompare @ 0099b140
0099b140	stp x29,x30,[sp, #-0x10]!
0099b144	mov x29,sp
0099b148	mov x0,x1
0099b14c	mov x1,x2
0099b150	bl 0x00c33740
0099b154	mvn w8,w0
0099b158	and w0,w8,#0x1
0099b15c	ldp x29,x30,[sp], #0x10
0099b160	ret
