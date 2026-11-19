; DES_check_key_parity @ 00a17580
00a17580	ldrb w8,[x0]
00a17584	ldrb w9,[x0, #0x1]
00a17588	ldrb w10,[x0, #0x2]
00a1758c	ldrb w11,[x0, #0x7]
00a17590	eor w8,w8,w8, LSR #0x4
00a17594	eor w9,w9,w9, LSR #0x4
00a17598	eor w8,w8,w8, LSR #0x2
00a1759c	eor w9,w9,w9, LSR #0x2
00a175a0	eor w8,w8,w8, LSR #0x1
00a175a4	eor w9,w9,w9, LSR #0x1
00a175a8	and w8,w9,w8
00a175ac	ldrb w9,[x0, #0x3]
00a175b0	eor w10,w10,w10, LSR #0x4
00a175b4	eor w10,w10,w10, LSR #0x2
00a175b8	eor w10,w10,w10, LSR #0x1
00a175bc	and w8,w10,w8
00a175c0	ldrb w10,[x0, #0x4]
00a175c4	eor w9,w9,w9, LSR #0x4
00a175c8	eor w9,w9,w9, LSR #0x2
00a175cc	eor w9,w9,w9, LSR #0x1
00a175d0	and w8,w8,w9
00a175d4	ldrb w9,[x0, #0x5]
00a175d8	eor w10,w10,w10, LSR #0x4
00a175dc	eor w10,w10,w10, LSR #0x2
00a175e0	eor w10,w10,w10, LSR #0x1
00a175e4	and w8,w10,w8
00a175e8	ldrb w10,[x0, #0x6]
00a175ec	eor w9,w9,w9, LSR #0x4
00a175f0	eor w9,w9,w9, LSR #0x2
00a175f4	eor w9,w9,w9, LSR #0x1
00a175f8	and w8,w9,w8
00a175fc	eor w9,w10,w10, LSR #0x4
00a17600	eor w10,w11,w11, LSR #0x4
00a17604	eor w9,w9,w9, LSR #0x2
00a17608	eor w10,w10,w10, LSR #0x2
00a1760c	eor w9,w9,w9, LSR #0x1
00a17610	and w8,w9,w8
00a17614	eor w9,w10,w10, LSR #0x1
00a17618	and w8,w8,w9
00a1761c	and w0,w8,#0x1
00a17620	ret
