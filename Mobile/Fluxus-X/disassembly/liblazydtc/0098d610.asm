; ix::WebSocket::getPingInterval @ 0098d610
0098d610	stp x20,x19,[sp, #-0x20]!
0098d614	stp x29,x30,[sp, #0x10]
0098d618	add x29,sp,#0x10
0098d61c	add x20,x0,#0x3a0
0098d620	mov x19,x0
0098d624	mov x0,x20
0098d628	bl 0x00c2ff10
0098d62c	ldr w19,[x19, #0x4a4]
0098d630	mov x0,x20
0098d634	bl 0x00c2ff20
0098d638	ldp x29,x30,[sp, #0x10]
0098d63c	mov w0,w19
0098d640	ldp x20,x19,[sp], #0x20
0098d644	ret
