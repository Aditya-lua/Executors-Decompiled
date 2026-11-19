; FUN_0084ea10 @ 0084ea10
0084ea10	adrp x8,0xd1a000
0084ea14	adrp x9,0xc4a000
0084ea18	add x9,x9,#0x508
0084ea1c	ldr w8,[x8, #0xfa0]
0084ea20	str x9,[x0]
0084ea24	str w8,[x0, #0x8]
0084ea28	adrp x8,0xc49000
0084ea2c	add x8,x8,#0x260
0084ea30	ldr q0,[x1]
0084ea34	str x8,[x0]
0084ea38	stp x2,x3,[x0, #0x20]
0084ea3c	stur q0,[x0, #0xc]
0084ea40	ret
