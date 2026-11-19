; FUN_008158bc @ 008158bc
008158bc	ldrb w8,[x0, #0x11]
008158c0	cmp w8,#0x1
008158c4	b.ne 0x008158ec
008158c8	adrp x8,0x29b000
008158cc	ldr q0,[x0]
008158d0	strb wzr,[x0, #0x11]
008158d4	ldr q1,[x8, #0xf80]
008158d8	ldrb w8,[x0, #0x10]
008158dc	eor v0.16B,v0.16B,v1.16B
008158e0	eor w8,w8,#0x99999999
008158e4	strb w8,[x0, #0x10]
008158e8	str q0,[x0]
008158ec	ret
