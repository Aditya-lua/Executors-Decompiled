; FUN_0082ed5c @ 0082ed5c
0082ed5c	ldrb w8,[x0, #0x11]
0082ed60	cmp w8,#0x1
0082ed64	b.ne 0x0082ed90
0082ed68	adrp x8,0x29c000
0082ed6c	ldr q0,[x0]
0082ed70	mov w9,#0x5d
0082ed74	ldr q1,[x8, #0xf0]
0082ed78	ldrb w8,[x0, #0x10]
0082ed7c	strb wzr,[x0, #0x11]
0082ed80	eor v0.16B,v0.16B,v1.16B
0082ed84	eor w8,w8,w9
0082ed88	strb w8,[x0, #0x10]
0082ed8c	str q0,[x0]
0082ed90	ret
