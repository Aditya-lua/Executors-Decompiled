; FUN_0083f54c @ 0083f54c
0083f54c	ldrb w8,[x0, #0x14]
0083f550	cmp w8,#0x1
0083f554	b.ne 0x0083f58c
0083f558	ldr s0,[x0, #0x10]
0083f55c	adrp x8,0x29b000
0083f560	strb wzr,[x0, #0x14]
0083f564	ldr d1,[x8, #0x6f8]
0083f568	adrp x8,0x29c000
0083f56c	uxtl v0.8H,v0.8B
0083f570	ldr q2,[x8, #0xe20]
0083f574	eor v0.8B,v0.8B,v1.8B
0083f578	ldr q1,[x0]
0083f57c	eor v1.16B,v1.16B,v2.16B
0083f580	uzp1 v0.8B,v0.8B,v0.8B
0083f584	str q1,[x0]
0083f588	str s0,[x0, #0x10]
0083f58c	ret
