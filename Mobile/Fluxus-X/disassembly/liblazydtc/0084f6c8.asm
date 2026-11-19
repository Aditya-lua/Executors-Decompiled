; FUN_0084f6c8 @ 0084f6c8
0084f6c8	adrp x8,0xd1b000
0084f6cc	adrp x9,0xc4a000
0084f6d0	add x9,x9,#0x508
0084f6d4	ldr w8,[x8, #0xe0]
0084f6d8	str x9,[x0]
0084f6dc	str w8,[x0, #0x8]
0084f6e0	adrp x8,0xc49000
0084f6e4	add x8,x8,#0x6f8
0084f6e8	ldr q0,[x1]
0084f6ec	str x8,[x0]
0084f6f0	stp x2,x3,[x0, #0x20]
0084f6f4	stur q0,[x0, #0xc]
0084f6f8	str x4,[x0, #0x30]
0084f6fc	ret
