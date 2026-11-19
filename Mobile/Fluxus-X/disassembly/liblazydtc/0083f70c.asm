; FUN_0083f70c @ 0083f70c
0083f70c	ldrb w8,[x0, #0x12]
0083f710	cmp w8,#0x1
0083f714	b.ne 0x0083f750
0083f718	adrp x8,0x29c000
0083f71c	ldr q0,[x0]
0083f720	ldrb w9,[x0, #0x10]
0083f724	ldr q1,[x8, #0x790]
0083f728	ldrb w10,[x0, #0x11]
0083f72c	mov w8,#0x79
0083f730	mov w11,#0x4f
0083f734	eor w8,w9,w8
0083f738	strb wzr,[x0, #0x12]
0083f73c	eor v0.16B,v0.16B,v1.16B
0083f740	eor w9,w10,w11
0083f744	strb w8,[x0, #0x10]
0083f748	strb w9,[x0, #0x11]
0083f74c	str q0,[x0]
0083f750	ret
