; FUN_00850f90 @ 00850f90
00850f90	adrp x8,0xd1b000
00850f94	adrp x9,0xc4a000
00850f98	add x9,x9,#0x508
00850f9c	ldr w8,[x8, #0x2a0]
00850fa0	str x9,[x0]
00850fa4	str w8,[x0, #0x8]
00850fa8	adrp x8,0xc49000
00850fac	add x8,x8,#0xd50
00850fb0	ldr q0,[x1]
00850fb4	str x8,[x0]
00850fb8	stur q0,[x0, #0xc]
00850fbc	ldr q0,[x2]
00850fc0	str q0,[x0, #0x20]
00850fc4	ret
