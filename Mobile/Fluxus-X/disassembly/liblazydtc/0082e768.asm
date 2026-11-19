; FUN_0082e768 @ 0082e768
0082e768	ldrb w8,[x0, #0x14]
0082e76c	cmp w8,#0x1
0082e770	b.ne 0x0082e7a8
0082e774	ldr s0,[x0, #0x10]
0082e778	adrp x8,0x29b000
0082e77c	strb wzr,[x0, #0x14]
0082e780	ldr d1,[x8, #0x358]
0082e784	adrp x8,0x29c000
0082e788	uxtl v0.8H,v0.8B
0082e78c	ldr q2,[x8, #0x610]
0082e790	eor v0.8B,v0.8B,v1.8B
0082e794	ldr q1,[x0]
0082e798	eor v1.16B,v1.16B,v2.16B
0082e79c	uzp1 v0.8B,v0.8B,v0.8B
0082e7a0	str q1,[x0]
0082e7a4	str s0,[x0, #0x10]
0082e7a8	ret
