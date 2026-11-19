; FUN_00850eec @ 00850eec
00850eec	adrp x8,0xd1b000
00850ef0	adrp x9,0xc4a000
00850ef4	add x9,x9,#0x508
00850ef8	ldr w8,[x8, #0x290]
00850efc	str x9,[x0]
00850f00	str w8,[x0, #0x8]
00850f04	adrp x8,0xc49000
00850f08	add x8,x8,#0xd18
00850f0c	ldr q0,[x1]
00850f10	str x8,[x0]
00850f14	stur q0,[x0, #0xc]
00850f18	ldr q0,[x2]
00850f1c	str q0,[x0, #0x20]
00850f20	ret
