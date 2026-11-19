; FUN_00830e6c @ 00830e6c
00830e6c	ldrb w8,[x0, #0x12]
00830e70	cmp w8,#0x1
00830e74	b.ne 0x00830eac
00830e78	adrp x8,0x29c000
00830e7c	ldr q0,[x0]
00830e80	ldrb w9,[x0, #0x10]
00830e84	ldr q1,[x8, #0xf80]
00830e88	ldrb w8,[x0, #0x11]
00830e8c	mov w10,#0x3b
00830e90	eor w9,w9,#0xbbbbbbbb
00830e94	strb wzr,[x0, #0x12]
00830e98	eor v0.16B,v0.16B,v1.16B
00830e9c	eor w8,w8,w10
00830ea0	strb w9,[x0, #0x10]
00830ea4	strb w8,[x0, #0x11]
00830ea8	str q0,[x0]
00830eac	ret
