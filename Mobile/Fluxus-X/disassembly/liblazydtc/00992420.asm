; ix::WebSocketPerMessageDeflateOptions::WebSocketPerMessageDeflateOptions @ 00992420
00992420	and w8,w4,#0xff
00992424	and w9,w1,#0x1
00992428	and w10,w2,#0x1
0099242c	and w11,w3,#0x1
00992430	cmp w8,#0x8
00992434	strb w4,[x0, #0x3]
00992438	strb w9,[x0]
0099243c	strb w10,[x0, #0x1]
00992440	strb w11,[x0, #0x2]
00992444	strb w5,[x0, #0x4]
00992448	b.ne 0x00992454
0099244c	mov w8,#0x9
00992450	strb w8,[x0, #0x3]
00992454	ret
