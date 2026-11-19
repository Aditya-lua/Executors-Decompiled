; FUN_0082e2e8 @ 0082e2e8
0082e2e8	ldrb w8,[x0, #0x14]
0082e2ec	cmp w8,#0x1
0082e2f0	b.ne 0x0082e328
0082e2f4	ldr s0,[x0, #0x10]
0082e2f8	adrp x8,0x29a000
0082e2fc	strb wzr,[x0, #0x14]
0082e300	ldr d1,[x8, #0x1a8]
0082e304	adrp x8,0x29c000
0082e308	uxtl v0.8H,v0.8B
0082e30c	ldr q2,[x8, #0xad0]
0082e310	eor v0.8B,v0.8B,v1.8B
0082e314	ldr q1,[x0]
0082e318	eor v1.16B,v1.16B,v2.16B
0082e31c	uzp1 v0.8B,v0.8B,v0.8B
0082e320	str q1,[x0]
0082e324	str s0,[x0, #0x10]
0082e328	ret
