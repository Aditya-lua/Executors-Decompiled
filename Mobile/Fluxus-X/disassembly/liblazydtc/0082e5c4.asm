; FUN_0082e5c4 @ 0082e5c4
0082e5c4	ldrb w8,[x0, #0x14]
0082e5c8	cmp w8,#0x1
0082e5cc	b.ne 0x0082e604
0082e5d0	ldr s0,[x0, #0x10]
0082e5d4	adrp x8,0x29a000
0082e5d8	strb wzr,[x0, #0x14]
0082e5dc	ldr d1,[x8, #0x748]
0082e5e0	adrp x8,0x29c000
0082e5e4	uxtl v0.8H,v0.8B
0082e5e8	ldr q2,[x8, #0xe00]
0082e5ec	eor v0.8B,v0.8B,v1.8B
0082e5f0	ldr q1,[x0]
0082e5f4	eor v1.16B,v1.16B,v2.16B
0082e5f8	uzp1 v0.8B,v0.8B,v0.8B
0082e5fc	str q1,[x0]
0082e600	str s0,[x0, #0x10]
0082e604	ret
