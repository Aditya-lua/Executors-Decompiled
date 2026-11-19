; OPENSSL_LH_strhash @ 00a7fd44
00a7fd44	cbz x0,0x00a7fd98
00a7fd48	ldrb w12,[x0]
00a7fd4c	cbz w12,0x00a7fd9c
00a7fd50	mov x8,xzr
00a7fd54	add x9,x0,#0x1
00a7fd58	mov w10,#0x100
00a7fd5c	mov w11,#0x20
00a7fd60	eor w14,w12,w12, LSR #0x2
00a7fd64	and w14,w14,#0xf
00a7fd68	and x13,x12,#0xff
00a7fd6c	ldrb w12,[x9], #0x1
00a7fd70	sub w15,w11,w14
00a7fd74	orr x13,x10,x13
00a7fd78	lsl w14,w8,w14
00a7fd7c	lsr x8,x8,x15
00a7fd80	orr w8,w8,w14
00a7fd84	mul x13,x13,x13
00a7fd88	add x10,x10,#0x100
00a7fd8c	eor x8,x8,x13
00a7fd90	cbnz w12,0x00a7fd60
00a7fd94	eor x0,x8,x8, LSR #0x10
00a7fd98	ret
00a7fd9c	mov x0,xzr
00a7fda0	ret
