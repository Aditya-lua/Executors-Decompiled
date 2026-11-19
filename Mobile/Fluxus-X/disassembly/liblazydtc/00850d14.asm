; FUN_00850d14 @ 00850d14
00850d14	adrp x8,0xd1b000
00850d18	adrp x9,0xc4a000
00850d1c	add x9,x9,#0x508
00850d20	ldr w8,[x8, #0x260]
00850d24	str x9,[x0]
00850d28	str w8,[x0, #0x8]
00850d2c	adrp x8,0xc49000
00850d30	add x8,x8,#0xc70
00850d34	ldr q0,[x1]
00850d38	str x8,[x0]
00850d3c	stur q0,[x0, #0xc]
00850d40	ldr q0,[x2]
00850d44	str q0,[x0, #0x20]
00850d48	ldr q0,[x3]
00850d4c	str q0,[x0, #0x30]
00850d50	ldr q0,[x4]
00850d54	str q0,[x0, #0x40]
00850d58	ldr q0,[x5]
00850d5c	ldr x8,[x5, #0x10]
00850d60	str q0,[x0, #0x50]
00850d64	str x8,[x0, #0x60]
00850d68	ldr q0,[x6]
00850d6c	str x7,[x0, #0x78]
00850d70	stur q0,[x0, #0x68]
00850d74	ret
