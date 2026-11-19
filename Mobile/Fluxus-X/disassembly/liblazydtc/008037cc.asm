; FUN_008037cc @ 008037cc
008037cc	ldrb w8,[x0, #0x11]
008037d0	cmp w8,#0x1
008037d4	b.ne 0x00803800
008037d8	adrp x8,0x29d000
008037dc	ldr q0,[x0]
008037e0	mov w9,#0xc5
008037e4	ldr q1,[x8, #0x1c0]
008037e8	ldrb w8,[x0, #0x10]
008037ec	strb wzr,[x0, #0x11]
008037f0	eor v0.16B,v0.16B,v1.16B
008037f4	eor w8,w8,w9
008037f8	strb w8,[x0, #0x10]
008037fc	str q0,[x0]
00803800	ret
