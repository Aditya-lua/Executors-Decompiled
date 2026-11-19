; FUN_0084fbd4 @ 0084fbd4
0084fbd4	adrp x8,0xd1b000
0084fbd8	adrp x9,0xc4a000
0084fbdc	add x9,x9,#0x508
0084fbe0	ldr w8,[x8, #0x120]
0084fbe4	str x9,[x0]
0084fbe8	str w8,[x0, #0x8]
0084fbec	adrp x8,0xc49000
0084fbf0	add x8,x8,#0x7d8
0084fbf4	ldr q0,[x1]
0084fbf8	strb wzr,[x0, #0x1c]
0084fbfc	str x8,[x0]
0084fc00	stp x2,x3,[x0, #0x20]
0084fc04	stur q0,[x0, #0xc]
0084fc08	strb w4,[x0, #0x30]
0084fc0c	ret
