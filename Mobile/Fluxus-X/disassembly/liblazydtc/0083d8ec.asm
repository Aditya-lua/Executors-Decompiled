; FUN_0083d8ec @ 0083d8ec
0083d8ec	ldrb w8,[x0, #0x16]
0083d8f0	cmp w8,#0x1
0083d8f4	b.ne 0x0083d94c
0083d8f8	ldr s0,[x0, #0x10]
0083d8fc	adrp x8,0x29b000
0083d900	ldr q2,[x0]
0083d904	ldr d1,[x8, #0x328]
0083d908	adrp x8,0x29c000
0083d90c	mov w9,#0xed
0083d910	uxtl v0.8H,v0.8B
0083d914	ldrb w10,[x0, #0x15]
0083d918	strb wzr,[x0, #0x16]
0083d91c	eor v0.8B,v0.8B,v1.8B
0083d920	ldr q1,[x8, #0x850]
0083d924	ldrb w8,[x0, #0x14]
0083d928	eor v1.16B,v2.16B,v1.16B
0083d92c	eor w8,w8,w9
0083d930	mov w9,#0x23
0083d934	uzp1 v0.8B,v0.8B,v0.8B
0083d938	eor w9,w10,w9
0083d93c	strb w8,[x0, #0x14]
0083d940	strb w9,[x0, #0x15]
0083d944	str q1,[x0]
0083d948	str s0,[x0, #0x10]
0083d94c	ret
