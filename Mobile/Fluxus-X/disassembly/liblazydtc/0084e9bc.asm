; FUN_0084e9bc @ 0084e9bc
0084e9bc	adrp x8,0xd1a000
0084e9c0	adrp x9,0xc4a000
0084e9c4	add x9,x9,#0x508
0084e9c8	ldr w8,[x8, #0xf90]
0084e9cc	str x9,[x0]
0084e9d0	str w8,[x0, #0x8]
0084e9d4	adrp x8,0xc49000
0084e9d8	add x8,x8,#0x228
0084e9dc	ldr q0,[x1]
0084e9e0	str x8,[x0]
0084e9e4	str w2,[x0, #0x1c]
0084e9e8	stp x3,x4,[x0, #0x20]
0084e9ec	stur q0,[x0, #0xc]
0084e9f0	str x5,[x0, #0x30]
0084e9f4	ret
