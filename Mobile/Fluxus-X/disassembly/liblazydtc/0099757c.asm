; ix::WebSocketTransport::initTimePointsAfterConnect @ 0099757c
0099757c	stp x20,x19,[sp, #-0x20]!
00997580	stp x29,x30,[sp, #0x10]
00997584	add x29,sp,#0x10
00997588	add x20,x0,#0x2b0
0099758c	mov x19,x0
00997590	mov x0,x20
00997594	bl 0x00c2ff10
00997598	bl 0x00c31900
0099759c	str x0,[x19, #0x2d8]
009975a0	ldp x29,x30,[sp, #0x10]
009975a4	mov x0,x20
009975a8	ldp x20,x19,[sp], #0x20
009975ac	b 0x00c2ff20
