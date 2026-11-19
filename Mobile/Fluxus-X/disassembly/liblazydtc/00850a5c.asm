; FUN_00850a5c @ 00850a5c
00850a5c	adrp x8,0xd1b000
00850a60	adrp x9,0xc4a000
00850a64	add x9,x9,#0x508
00850a68	ldr w8,[x8, #0x2c0]
00850a6c	str x9,[x0]
00850a70	str w8,[x0, #0x8]
00850a74	adrp x8,0xc49000
00850a78	add x8,x8,#0xbc8
00850a7c	ldr q0,[x1]
00850a80	strb wzr,[x0, #0x1c]
00850a84	str x8,[x0]
00850a88	stur q0,[x0, #0xc]
00850a8c	ldr q0,[x2]
00850a90	str q0,[x0, #0x20]
00850a94	ldr q0,[x3]
00850a98	str w4,[x0, #0x40]
00850a9c	str q0,[x0, #0x30]
00850aa0	ret
