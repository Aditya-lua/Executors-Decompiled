; FUN_0084fd10 @ 0084fd10
0084fd10	adrp x8,0xd1b000
0084fd14	adrp x9,0xc4a000
0084fd18	add x9,x9,#0x508
0084fd1c	ldr w8,[x8, #0x150]
0084fd20	str x9,[x0]
0084fd24	str w8,[x0, #0x8]
0084fd28	adrp x8,0xc49000
0084fd2c	add x8,x8,#0x880
0084fd30	ldr q0,[x1]
0084fd34	strb wzr,[x0, #0x1c]
0084fd38	str x8,[x0]
0084fd3c	stur q0,[x0, #0xc]
0084fd40	ldr q0,[x2]
0084fd44	str q0,[x0, #0x20]
0084fd48	ret
