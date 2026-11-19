; FUN_0084e514 @ 0084e514
0084e514	ldrb w8,[x0, #0x9]
0084e518	cmp w8,#0x1
0084e51c	b.ne 0x0084e544
0084e520	adrp x8,0x29b000
0084e524	ldr d0,[x0]
0084e528	strb wzr,[x0, #0x9]
0084e52c	ldr d1,[x8, #0x3c8]
0084e530	ldrb w8,[x0, #0x8]
0084e534	eor v0.8B,v0.8B,v1.8B
0084e538	eor w8,w8,#0xffffffbf
0084e53c	strb w8,[x0, #0x8]
0084e540	str d0,[x0]
0084e544	ret
