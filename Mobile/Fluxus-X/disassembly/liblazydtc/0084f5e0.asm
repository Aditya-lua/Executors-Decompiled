; FUN_0084f5e0 @ 0084f5e0
0084f5e0	adrp x8,0xd1b000
0084f5e4	adrp x9,0xc4a000
0084f5e8	add x9,x9,#0x508
0084f5ec	ldr w8,[x8, #0x2b0]
0084f5f0	str x9,[x0]
0084f5f4	str w8,[x0, #0x8]
0084f5f8	adrp x8,0xc49000
0084f5fc	add x8,x8,#0x688
0084f600	ldr q0,[x1]
0084f604	str x8,[x0]
0084f608	stur q0,[x0, #0xc]
0084f60c	ldr q0,[x2]
0084f610	str w3,[x0, #0x30]
0084f614	str q0,[x0, #0x20]
0084f618	ret
