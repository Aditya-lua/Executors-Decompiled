; FUN_0084f298 @ 0084f298
0084f298	adrp x8,0xd1b000
0084f29c	adrp x9,0xc4a000
0084f2a0	add x9,x9,#0x508
0084f2a4	ldr w8,[x8, #0x90]
0084f2a8	str x9,[x0]
0084f2ac	adrp x9,0xc49000
0084f2b0	add x9,x9,#0x5a8
0084f2b4	str w8,[x0, #0x8]
0084f2b8	ldr q0,[x1]
0084f2bc	str x9,[x0]
0084f2c0	str w2,[x0, #0x1c]
0084f2c4	stur q0,[x0, #0xc]
0084f2c8	str x3,[x0, #0x20]
0084f2cc	ret
