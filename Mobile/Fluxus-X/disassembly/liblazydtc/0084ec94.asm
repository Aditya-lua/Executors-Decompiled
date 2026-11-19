; FUN_0084ec94 @ 0084ec94
0084ec94	adrp x8,0xd1b000
0084ec98	adrp x9,0xc4a000
0084ec9c	add x9,x9,#0x508
0084eca0	ldr w8,[x8]
0084eca4	str x9,[x0]
0084eca8	str w8,[x0, #0x8]
0084ecac	adrp x8,0xc49000
0084ecb0	add x8,x8,#0x3b0
0084ecb4	ldr q0,[x1]
0084ecb8	str x8,[x0]
0084ecbc	stur q0,[x0, #0xc]
0084ecc0	ldr q0,[x2]
0084ecc4	str w3,[x0, #0x30]
0084ecc8	str q0,[x0, #0x20]
0084eccc	ret
