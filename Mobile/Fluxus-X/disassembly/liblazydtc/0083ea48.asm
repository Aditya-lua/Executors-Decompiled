; FUN_0083ea48 @ 0083ea48
0083ea48	ldrb w8,[x0, #0x1c]
0083ea4c	cmp w8,#0x1
0083ea50	b.ne 0x0083eabc
0083ea54	adrp x8,0x29a000
0083ea58	ldrb w9,[x0, #0x18]
0083ea5c	ldrb w10,[x0, #0x19]
0083ea60	ldr d0,[x8, #0x9a0]
0083ea64	mov w8,#0xa7
0083ea68	mov w11,#0x75
0083ea6c	ldp d1,d2,[x0]
0083ea70	eor w8,w9,w8
0083ea74	eor w9,w10,w11
0083ea78	ldr d3,[x0, #0x10]
0083ea7c	strb w8,[x0, #0x18]
0083ea80	ldrb w8,[x0, #0x1a]
0083ea84	strb w9,[x0, #0x19]
0083ea88	mov w9,#0xb1
0083ea8c	eor v1.8B,v1.8B,v0.8B
0083ea90	eor v2.8B,v2.8B,v0.8B
0083ea94	eor v0.8B,v3.8B,v0.8B
0083ea98	eor w8,w8,w9
0083ea9c	ldrb w9,[x0, #0x1b]
0083eaa0	strb wzr,[x0, #0x1c]
0083eaa4	strb w8,[x0, #0x1a]
0083eaa8	mov w8,#0xd
0083eaac	eor w8,w9,w8
0083eab0	stp d1,d2,[x0]
0083eab4	str d0,[x0, #0x10]
0083eab8	strb w8,[x0, #0x1b]
0083eabc	ret
