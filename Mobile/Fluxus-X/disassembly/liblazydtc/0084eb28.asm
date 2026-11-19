; FUN_0084eb28 @ 0084eb28
0084eb28	adrp x8,0xd1a000
0084eb2c	adrp x9,0xc4a000
0084eb30	add x9,x9,#0x508
0084eb34	ldr w8,[x8, #0xfc0]
0084eb38	str x9,[x0]
0084eb3c	str w8,[x0, #0x8]
0084eb40	adrp x8,0xc49000
0084eb44	add x8,x8,#0x2d0
0084eb48	ldr q0,[x1]
0084eb4c	str x8,[x0]
0084eb50	str x2,[x0, #0x20]
0084eb54	stur q0,[x0, #0xc]
0084eb58	ret
