; FUN_0080eba8 @ 0080eba8
0080eba8	ldrb w8,[x0, #0x11]
0080ebac	cmp w8,#0x1
0080ebb0	b.ne 0x0080ebdc
0080ebb4	adrp x8,0x29c000
0080ebb8	ldr q0,[x0]
0080ebbc	mov w9,#0x5f
0080ebc0	ldr q1,[x8, #0x800]
0080ebc4	ldrb w8,[x0, #0x10]
0080ebc8	strb wzr,[x0, #0x11]
0080ebcc	eor v0.16B,v0.16B,v1.16B
0080ebd0	eor w8,w8,w9
0080ebd4	strb w8,[x0, #0x10]
0080ebd8	str q0,[x0]
0080ebdc	ret
