; ix::WebSocket::getReadyState @ 0098ed4c
0098ed4c	stp x29,x30,[sp, #-0x10]!
0098ed50	mov x29,sp
0098ed54	bl 0x00c33990
0098ed58	cmp w0,#0x3
0098ed5c	b.hi 0x0098ed74
0098ed60	adrp x8,0x29c000
0098ed64	add x8,x8,#0x7d0
0098ed68	ldr w0,[x8, w0, SXTW #0x2]
0098ed6c	ldp x29,x30,[sp], #0x10
0098ed70	ret
0098ed74	orr w0,wzr,#0x3
0098ed78	ldp x29,x30,[sp], #0x10
0098ed7c	ret
