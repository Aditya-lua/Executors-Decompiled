; FUN_0084f324 @ 0084f324
0084f324	adrp x8,0xd1b000
0084f328	adrp x9,0xc4a000
0084f32c	add x9,x9,#0x508
0084f330	ldr w8,[x8, #0xa0]
0084f334	str x9,[x0]
0084f338	str w8,[x0, #0x8]
0084f33c	adrp x8,0xc49000
0084f340	add x8,x8,#0x5e0
0084f344	ldr q0,[x1]
0084f348	str x8,[x0]
0084f34c	str w2,[x0, #0x1c]
0084f350	stur q0,[x0, #0xc]
0084f354	stp x3,x4,[x0, #0x20]
0084f358	ret
