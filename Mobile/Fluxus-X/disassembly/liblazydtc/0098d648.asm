; ix::WebSocket::enablePong @ 0098d648
0098d648	stp x20,x19,[sp, #-0x20]!
0098d64c	stp x29,x30,[sp, #0x10]
0098d650	add x29,sp,#0x10
0098d654	add x20,x0,#0x3a0
0098d658	mov x19,x0
0098d65c	mov x0,x20
0098d660	bl 0x00c2ff10
0098d664	mov w8,#0x1
0098d668	strb w8,[x19, #0x4a0]
0098d66c	ldp x29,x30,[sp, #0x10]
0098d670	mov x0,x20
0098d674	ldp x20,x19,[sp], #0x20
0098d678	b 0x00c2ff20
