; ix::WebSocketPerMessageDeflateOptions::sanitizeClientMaxWindowBits @ 00992458
00992458	ldrb w8,[x0, #0x3]
0099245c	cmp w8,#0x8
00992460	b.ne 0x0099246c
00992464	mov w8,#0x9
00992468	strb w8,[x0, #0x3]
0099246c	ret
