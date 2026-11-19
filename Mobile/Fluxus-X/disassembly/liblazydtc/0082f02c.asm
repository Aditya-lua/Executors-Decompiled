; FUN_0082f02c @ 0082f02c
0082f02c	ldrb w8,[x0, #0x12]
0082f030	cmp w8,#0x1
0082f034	b.ne 0x0082f070
0082f038	adrp x8,0x29b000
0082f03c	ldr q0,[x0]
0082f040	ldrb w9,[x0, #0x10]
0082f044	ldr q1,[x8, #0xf90]
0082f048	ldrb w10,[x0, #0x11]
0082f04c	mov w8,#0x5f
0082f050	mov w11,#0x3d
0082f054	eor w8,w9,w8
0082f058	strb wzr,[x0, #0x12]
0082f05c	eor v0.16B,v0.16B,v1.16B
0082f060	eor w9,w10,w11
0082f064	strb w8,[x0, #0x10]
0082f068	strb w9,[x0, #0x11]
0082f06c	str q0,[x0]
0082f070	ret
