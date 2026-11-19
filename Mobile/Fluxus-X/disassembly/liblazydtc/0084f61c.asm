; FUN_0084f61c @ 0084f61c
0084f61c	adrp x8,0xd1b000
0084f620	adrp x9,0xc4a000
0084f624	add x9,x9,#0x508
0084f628	ldr w8,[x8, #0xd0]
0084f62c	str x9,[x0]
0084f630	str w8,[x0, #0x8]
0084f634	adrp x8,0xc49000
0084f638	add x8,x8,#0x6c0
0084f63c	ldr q0,[x1]
0084f640	str x8,[x0]
0084f644	stur q0,[x0, #0xc]
0084f648	ldr q0,[x2]
0084f64c	str q0,[x0, #0x20]
0084f650	ldr q0,[x3]
0084f654	str q0,[x0, #0x30]
0084f658	ret
