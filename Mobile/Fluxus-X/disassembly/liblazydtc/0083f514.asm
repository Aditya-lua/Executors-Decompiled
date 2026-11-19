; FUN_0083f514 @ 0083f514
0083f514	ldrb w8,[x0, #0x11]
0083f518	cmp w8,#0x1
0083f51c	b.ne 0x0083f548
0083f520	adrp x8,0x29c000
0083f524	ldr q0,[x0]
0083f528	mov w9,#0x93
0083f52c	ldr q1,[x8, #0xbc0]
0083f530	ldrb w8,[x0, #0x10]
0083f534	strb wzr,[x0, #0x11]
0083f538	eor v0.16B,v0.16B,v1.16B
0083f53c	eor w8,w8,w9
0083f540	strb w8,[x0, #0x10]
0083f544	str q0,[x0]
0083f548	ret
