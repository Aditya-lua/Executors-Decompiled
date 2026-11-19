; FUN_0084fc78 @ 0084fc78
0084fc78	adrp x8,0xd1b000
0084fc7c	adrp x9,0xc4a000
0084fc80	add x9,x9,#0x508
0084fc84	ldr w8,[x8, #0x130]
0084fc88	str x9,[x0]
0084fc8c	str w8,[x0, #0x8]
0084fc90	adrp x8,0xc49000
0084fc94	add x8,x8,#0x810
0084fc98	ldr q0,[x1]
0084fc9c	strb wzr,[x0, #0x1c]
0084fca0	str x8,[x0]
0084fca4	stur q0,[x0, #0xc]
0084fca8	ret
