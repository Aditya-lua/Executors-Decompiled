; FUN_0082c200 @ 0082c200
0082c200	ldrb w8,[x0, #0x15]
0082c204	cmp w8,#0x1
0082c208	b.ne 0x0082c250
0082c20c	ldr s0,[x0, #0x10]
0082c210	adrp x8,0x29b000
0082c214	mov w9,#0xa1
0082c218	ldr d1,[x8, #0x120]
0082c21c	adrp x8,0x29c000
0082c220	strb wzr,[x0, #0x15]
0082c224	uxtl v0.8H,v0.8B
0082c228	ldr q2,[x8, #0xd40]
0082c22c	ldrb w8,[x0, #0x14]
0082c230	eor w8,w8,w9
0082c234	eor v0.8B,v0.8B,v1.8B
0082c238	ldr q1,[x0]
0082c23c	strb w8,[x0, #0x14]
0082c240	eor v1.16B,v1.16B,v2.16B
0082c244	uzp1 v0.8B,v0.8B,v0.8B
0082c248	str q1,[x0]
0082c24c	str s0,[x0, #0x10]
0082c250	ret
