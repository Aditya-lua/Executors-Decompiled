; FUN_008035ac @ 008035ac
008035ac	ldrb w8,[x0, #0x13]
008035b0	cmp w8,#0x1
008035b4	b.ne 0x00803600
008035b8	adrp x8,0x29c000
008035bc	ldr q0,[x0]
008035c0	ldrb w9,[x0, #0x10]
008035c4	ldrb w10,[x0, #0x11]
008035c8	ldr q1,[x8, #0x870]
008035cc	mov w11,#0xb1
008035d0	mov w8,#0x9d
008035d4	eor w9,w9,w11
008035d8	strb wzr,[x0, #0x13]
008035dc	eor w8,w10,w8
008035e0	ldrb w10,[x0, #0x12]
008035e4	eor v0.16B,v0.16B,v1.16B
008035e8	strb w9,[x0, #0x10]
008035ec	mov w9,#0x7b
008035f0	eor w9,w10,w9
008035f4	strb w8,[x0, #0x11]
008035f8	strb w9,[x0, #0x12]
008035fc	str q0,[x0]
00803600	ret
