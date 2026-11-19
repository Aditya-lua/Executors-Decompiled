; FUN_0083f620 @ 0083f620
0083f620	ldrb w8,[x0, #0x12]
0083f624	cmp w8,#0x1
0083f628	b.ne 0x0083f664
0083f62c	adrp x8,0x29c000
0083f630	ldr q0,[x0]
0083f634	ldrb w9,[x0, #0x10]
0083f638	ldr q1,[x8, #0xf90]
0083f63c	ldrb w10,[x0, #0x11]
0083f640	mov w8,#0x4d
0083f644	mov w11,#0x3b
0083f648	eor w8,w9,w8
0083f64c	strb wzr,[x0, #0x12]
0083f650	eor v0.16B,v0.16B,v1.16B
0083f654	eor w9,w10,w11
0083f658	strb w8,[x0, #0x10]
0083f65c	strb w9,[x0, #0x11]
0083f660	str q0,[x0]
0083f664	ret
