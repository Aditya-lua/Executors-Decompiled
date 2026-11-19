; FUN_00850e1c @ 00850e1c
00850e1c	adrp x8,0xd1b000
00850e20	adrp x9,0xc4a000
00850e24	add x9,x9,#0x508
00850e28	ldr w8,[x8, #0x270]
00850e2c	str x9,[x0]
00850e30	str w8,[x0, #0x8]
00850e34	adrp x8,0xc49000
00850e38	add x8,x8,#0xca8
00850e3c	ldr q0,[x1]
00850e40	str x8,[x0]
00850e44	str x2,[x0, #0x20]
00850e48	stur q0,[x0, #0xc]
00850e4c	ret
