; FUN_0081fd60 @ 0081fd60
0081fd60	ldrb w8,[x0, #0x15]
0081fd64	cmp w8,#0x1
0081fd68	b.ne 0x0081fdb0
0081fd6c	ldr s0,[x0, #0x10]
0081fd70	adrp x8,0x29a000
0081fd74	mov w9,#0x89
0081fd78	ldr d1,[x8, #0x498]
0081fd7c	adrp x8,0x29c000
0081fd80	strb wzr,[x0, #0x15]
0081fd84	uxtl v0.8H,v0.8B
0081fd88	ldr q2,[x8, #0x700]
0081fd8c	ldrb w8,[x0, #0x14]
0081fd90	eor w8,w8,w9
0081fd94	eor v0.8B,v0.8B,v1.8B
0081fd98	ldr q1,[x0]
0081fd9c	strb w8,[x0, #0x14]
0081fda0	eor v1.16B,v1.16B,v2.16B
0081fda4	uzp1 v0.8B,v0.8B,v0.8B
0081fda8	str q1,[x0]
0081fdac	str s0,[x0, #0x10]
0081fdb0	ret
