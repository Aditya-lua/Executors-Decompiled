; FUN_0081fb30 @ 0081fb30
0081fb30	ldrb w8,[x0, #0x15]
0081fb34	cmp w8,#0x1
0081fb38	b.ne 0x0081fb80
0081fb3c	ldr s0,[x0, #0x10]
0081fb40	adrp x8,0x29a000
0081fb44	mov w9,#0x67
0081fb48	ldr d1,[x8, #0xca0]
0081fb4c	adrp x8,0x29c000
0081fb50	strb wzr,[x0, #0x15]
0081fb54	uxtl v0.8H,v0.8B
0081fb58	ldr q2,[x8, #0xd0]
0081fb5c	ldrb w8,[x0, #0x14]
0081fb60	eor w8,w8,w9
0081fb64	eor v0.8B,v0.8B,v1.8B
0081fb68	ldr q1,[x0]
0081fb6c	strb w8,[x0, #0x14]
0081fb70	eor v1.16B,v1.16B,v2.16B
0081fb74	uzp1 v0.8B,v0.8B,v0.8B
0081fb78	str q1,[x0]
0081fb7c	str s0,[x0, #0x10]
0081fb80	ret
