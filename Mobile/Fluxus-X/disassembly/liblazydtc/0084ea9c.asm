; FUN_0084ea9c @ 0084ea9c
0084ea9c	adrp x8,0xd1a000
0084eaa0	adrp x9,0xc4a000
0084eaa4	add x9,x9,#0x508
0084eaa8	ldr w8,[x8, #0xfb0]
0084eaac	str x9,[x0]
0084eab0	str w8,[x0, #0x8]
0084eab4	adrp x8,0xc49000
0084eab8	add x8,x8,#0x298
0084eabc	ldr q0,[x1]
0084eac0	str x8,[x0]
0084eac4	stp x2,x3,[x0, #0x20]
0084eac8	stur q0,[x0, #0xc]
0084eacc	ret
