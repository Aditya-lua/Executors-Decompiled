; FUN_0084f460 @ 0084f460
0084f460	adrp x8,0xd1b000
0084f464	adrp x9,0xc4a000
0084f468	add x9,x9,#0x508
0084f46c	ldr w8,[x8, #0xc0]
0084f470	str x9,[x0]
0084f474	str w8,[x0, #0x8]
0084f478	adrp x8,0xc49000
0084f47c	add x8,x8,#0x650
0084f480	ldr q0,[x1]
0084f484	str x8,[x0]
0084f488	str x2,[x0, #0x20]
0084f48c	strb w3,[x0, #0x28]
0084f490	str x4,[x0, #0x30]
0084f494	stur q0,[x0, #0xc]
0084f498	strb w5,[x0, #0x38]
0084f49c	stp x6,xzr,[x0, #0x40]
0084f4a0	strb wzr,[x0, #0x50]
0084f4a4	strb wzr,[x0, #0x54]
0084f4a8	strb wzr,[x0, #0x64]
0084f4ac	strb wzr,[x0, #0x68]
0084f4b0	strb wzr,[x0, #0x78]
0084f4b4	ret
