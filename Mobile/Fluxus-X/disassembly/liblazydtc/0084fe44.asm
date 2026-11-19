; FUN_0084fe44 @ 0084fe44
0084fe44	adrp x8,0xd1b000
0084fe48	adrp x9,0xc4a000
0084fe4c	add x9,x9,#0x508
0084fe50	ldr w8,[x8, #0x170]
0084fe54	str x9,[x0]
0084fe58	str w8,[x0, #0x8]
0084fe5c	adrp x8,0xc49000
0084fe60	add x8,x8,#0x8f0
0084fe64	ldr q0,[x1]
0084fe68	strb wzr,[x0, #0x1c]
0084fe6c	str x8,[x0]
0084fe70	stur q0,[x0, #0xc]
0084fe74	ldr q0,[x2]
0084fe78	str q0,[x0, #0x20]
0084fe7c	ldr q0,[x3]
0084fe80	strb w5,[x0, #0x40]
0084fe84	strb wzr,[x0, #0x41]
0084fe88	strb wzr,[x0, #0x44]
0084fe8c	strb wzr,[x0, #0x54]
0084fe90	str q0,[x0, #0x30]
0084fe94	ldr q0,[x4]
0084fe98	ldr w8,[x4, #0x10]
0084fe9c	stur q0,[x0, #0x58]
0084fea0	str w8,[x0, #0x68]
0084fea4	ret
