; FUN_0084ece8 @ 0084ece8
0084ece8	adrp x8,0xd1b000
0084ecec	adrp x9,0xc4a000
0084ecf0	add x9,x9,#0x508
0084ecf4	ldr w8,[x8, #0x10]
0084ecf8	str x9,[x0]
0084ecfc	adrp x9,0xc49000
0084ed00	add x9,x9,#0x3e8
0084ed04	str w8,[x0, #0x8]
0084ed08	ldr q0,[x1]
0084ed0c	str x9,[x0]
0084ed10	str x2,[x0, #0x20]
0084ed14	stur q0,[x0, #0xc]
0084ed18	strb w3,[x0, #0x28]
0084ed1c	ret
