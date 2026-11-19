; FUN_0083e8f8 @ 0083e8f8
0083e8f8	ldrb w8,[x0, #0x1c]
0083e8fc	cmp w8,#0x1
0083e900	b.ne 0x0083e968
0083e904	adrp x8,0x29a000
0083e908	ldrb w9,[x0, #0x18]
0083e90c	ldrb w10,[x0, #0x19]
0083e910	ldr d0,[x8, #0xc38]
0083e914	mov w8,#0x73
0083e918	mov w11,#0x29
0083e91c	ldp d1,d2,[x0]
0083e920	eor w8,w9,w8
0083e924	ldr d3,[x0, #0x10]
0083e928	strb w8,[x0, #0x18]
0083e92c	ldrb w8,[x0, #0x1a]
0083e930	eor w9,w10,w11
0083e934	strb wzr,[x0, #0x1c]
0083e938	eor v1.8B,v1.8B,v0.8B
0083e93c	eor v2.8B,v2.8B,v0.8B
0083e940	strb w9,[x0, #0x19]
0083e944	eor v0.8B,v3.8B,v0.8B
0083e948	ldrb w9,[x0, #0x1b]
0083e94c	eor w8,w8,#0x7f
0083e950	strb w8,[x0, #0x1a]
0083e954	mov w8,#0x7b
0083e958	eor w8,w9,w8
0083e95c	stp d1,d2,[x0]
0083e960	str d0,[x0, #0x10]
0083e964	strb w8,[x0, #0x1b]
0083e968	ret
