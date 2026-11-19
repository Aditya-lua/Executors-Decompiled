; FUN_0084fdb8 @ 0084fdb8
0084fdb8	adrp x8,0xd1b000
0084fdbc	adrp x9,0xc4a000
0084fdc0	add x9,x9,#0x508
0084fdc4	ldr w8,[x8, #0x160]
0084fdc8	str x9,[x0]
0084fdcc	str w8,[x0, #0x8]
0084fdd0	adrp x8,0xc49000
0084fdd4	add x8,x8,#0x8b8
0084fdd8	ldr q0,[x1]
0084fddc	strb wzr,[x0, #0x1c]
0084fde0	str x8,[x0]
0084fde4	stur q0,[x0, #0xc]
0084fde8	str x2,[x0, #0x20]
0084fdec	ret
