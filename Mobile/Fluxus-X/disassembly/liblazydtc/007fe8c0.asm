; FUN_007fe8c0 @ 007fe8c0
007fe8c0	ldrb w8,[x0, #0x11]
007fe8c4	cmp w8,#0x1
007fe8c8	b.ne 0x007fe8f4
007fe8cc	adrp x8,0x29c000
007fe8d0	ldr q0,[x0]
007fe8d4	mov w9,#0x45
007fe8d8	ldr q1,[x8, #0x520]
007fe8dc	ldrb w8,[x0, #0x10]
007fe8e0	strb wzr,[x0, #0x11]
007fe8e4	eor v0.16B,v0.16B,v1.16B
007fe8e8	eor w8,w8,w9
007fe8ec	strb w8,[x0, #0x10]
007fe8f0	str q0,[x0]
007fe8f4	ret
