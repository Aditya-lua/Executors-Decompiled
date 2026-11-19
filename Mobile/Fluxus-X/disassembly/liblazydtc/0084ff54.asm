; FUN_0084ff54 @ 0084ff54
0084ff54	adrp x8,0xd1b000
0084ff58	adrp x9,0xc4a000
0084ff5c	add x9,x9,#0x508
0084ff60	ldr w8,[x8, #0x180]
0084ff64	str x9,[x0]
0084ff68	str w8,[x0, #0x8]
0084ff6c	adrp x8,0xc49000
0084ff70	add x8,x8,#0x928
0084ff74	ldr q0,[x1]
0084ff78	str x8,[x0]
0084ff7c	ldr x8,[sp]
0084ff80	strb wzr,[x0, #0x1c]
0084ff84	stur q0,[x0, #0xc]
0084ff88	stp x2,x3,[x0, #0x20]
0084ff8c	stp x4,x5,[x0, #0x30]
0084ff90	str x6,[x0, #0x40]
0084ff94	strb w7,[x0, #0x48]
0084ff98	ldr q0,[x8]
0084ff9c	stur q0,[x0, #0x4c]
0084ffa0	ret
