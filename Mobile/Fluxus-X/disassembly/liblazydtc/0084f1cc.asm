; FUN_0084f1cc @ 0084f1cc
0084f1cc	adrp x8,0xd1b000
0084f1d0	adrp x9,0xc4a000
0084f1d4	add x9,x9,#0x508
0084f1d8	ldr w8,[x8, #0x80]
0084f1dc	str x9,[x0]
0084f1e0	str w8,[x0, #0x8]
0084f1e4	adrp x8,0xc49000
0084f1e8	add x8,x8,#0x570
0084f1ec	ldr q0,[x1]
0084f1f0	str x8,[x0]
0084f1f4	stur q0,[x0, #0xc]
0084f1f8	ldr q0,[x2]
0084f1fc	str q0,[x0, #0x20]
0084f200	ret
