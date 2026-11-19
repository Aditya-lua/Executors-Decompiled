; FUN_00850c24 @ 00850c24
00850c24	adrp x8,0xd1b000
00850c28	adrp x9,0xc4a000
00850c2c	add x9,x9,#0x508
00850c30	ldr w8,[x8, #0x250]
00850c34	str x9,[x0]
00850c38	str w8,[x0, #0x8]
00850c3c	adrp x8,0xc49000
00850c40	add x8,x8,#0xc38
00850c44	ldr q0,[x1]
00850c48	str x8,[x0]
00850c4c	stur q0,[x0, #0xc]
00850c50	ldr q0,[x2]
00850c54	str x3,[x0, #0x30]
00850c58	str q0,[x0, #0x20]
00850c5c	ret
