; FUN_0084f3c4 @ 0084f3c4
0084f3c4	adrp x8,0xd1b000
0084f3c8	adrp x9,0xc4a000
0084f3cc	add x9,x9,#0x508
0084f3d0	ldr w8,[x8, #0xb0]
0084f3d4	str x9,[x0]
0084f3d8	str w8,[x0, #0x8]
0084f3dc	adrp x8,0xc49000
0084f3e0	add x8,x8,#0x618
0084f3e4	ldr q0,[x1]
0084f3e8	str x8,[x0]
0084f3ec	stp x2,x3,[x0, #0x20]
0084f3f0	stur q0,[x0, #0xc]
0084f3f4	ret
