; FUN_0084f804 @ 0084f804
0084f804	adrp x8,0xd1b000
0084f808	adrp x9,0xc4a000
0084f80c	add x9,x9,#0x508
0084f810	ldr w8,[x8, #0xf0]
0084f814	str x9,[x0]
0084f818	str w8,[x0, #0x8]
0084f81c	adrp x8,0xc49000
0084f820	add x8,x8,#0x730
0084f824	ldr q0,[x1]
0084f828	strb wzr,[x0, #0x1c]
0084f82c	str x8,[x0]
0084f830	stur q0,[x0, #0xc]
0084f834	ldr q0,[x2]
0084f838	strb w3,[x0, #0x30]
0084f83c	str q0,[x0, #0x20]
0084f840	ret
