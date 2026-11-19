; ix::WebSocket::disablePong @ 0098d67c
0098d67c	stp x20,x19,[sp, #-0x20]!
0098d680	stp x29,x30,[sp, #0x10]
0098d684	add x29,sp,#0x10
0098d688	add x20,x0,#0x3a0
0098d68c	mov x19,x0
0098d690	mov x0,x20
0098d694	bl 0x00c2ff10
0098d698	strb wzr,[x19, #0x4a0]
0098d69c	ldp x29,x30,[sp, #0x10]
0098d6a0	mov x0,x20
0098d6a4	ldp x20,x19,[sp], #0x20
0098d6a8	b 0x00c2ff20
