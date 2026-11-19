; FUN_0084fa68 @ 0084fa68
0084fa68	adrp x8,0xd1b000
0084fa6c	adrp x9,0xc4a000
0084fa70	add x9,x9,#0x508
0084fa74	ldr w8,[x8, #0x110]
0084fa78	str x9,[x0]
0084fa7c	str w8,[x0, #0x8]
0084fa80	adrp x8,0xc49000
0084fa84	add x8,x8,#0x7a0
0084fa88	ldr q0,[x1]
0084fa8c	strb wzr,[x0, #0x1c]
0084fa90	str x8,[x0]
0084fa94	stp x2,x3,[x0, #0x20]
0084fa98	stur q0,[x0, #0xc]
0084fa9c	strb w4,[x0, #0x30]
0084faa0	ldr q0,[x5]
0084faa4	str xzr,[x0, #0x48]
0084faa8	strb wzr,[x0, #0x50]
0084faac	stur q0,[x0, #0x34]
0084fab0	strb wzr,[x0, #0x54]
0084fab4	strb wzr,[x0, #0x64]
0084fab8	strb wzr,[x0, #0x68]
0084fabc	strb wzr,[x0, #0x78]
0084fac0	ret
