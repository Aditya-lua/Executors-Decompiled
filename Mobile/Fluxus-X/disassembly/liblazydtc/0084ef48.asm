; FUN_0084ef48 @ 0084ef48
0084ef48	adrp x8,0xd1b000
0084ef4c	adrp x9,0xc4a000
0084ef50	add x9,x9,#0x508
0084ef54	ldr w8,[x8, #0x60]
0084ef58	str x9,[x0]
0084ef5c	str w8,[x0, #0x8]
0084ef60	adrp x8,0xc49000
0084ef64	add x8,x8,#0x500
0084ef68	ldr q0,[x1]
0084ef6c	str x8,[x0]
0084ef70	stp x2,x3,[x0, #0x20]
0084ef74	stur q0,[x0, #0xc]
0084ef78	ret
