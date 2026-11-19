; FUN_0084e270 @ 0084e270
0084e270	ldrb w8,[x0, #0xc]
0084e274	cmp w8,#0x1
0084e278	b.ne 0x0084e2b0
0084e27c	ldr s0,[x0, #0x8]
0084e280	adrp x8,0x29b000
0084e284	strb wzr,[x0, #0xc]
0084e288	ldr d1,[x8, #0x4e8]
0084e28c	adrp x8,0x29b000
0084e290	uxtl v0.8H,v0.8B
0084e294	ldr d2,[x8, #0x5c8]
0084e298	eor v0.8B,v0.8B,v1.8B
0084e29c	ldr d1,[x0]
0084e2a0	eor v1.8B,v1.8B,v2.8B
0084e2a4	uzp1 v0.8B,v0.8B,v0.8B
0084e2a8	str d1,[x0]
0084e2ac	str s0,[x0, #0x8]
0084e2b0	ret
