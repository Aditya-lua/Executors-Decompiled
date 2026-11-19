; FUN_0084ec44 @ 0084ec44
0084ec44	adrp x8,0xd1a000
0084ec48	adrp x9,0xc4a000
0084ec4c	add x9,x9,#0x508
0084ec50	ldr w8,[x8, #0xff0]
0084ec54	str x9,[x0]
0084ec58	adrp x9,0xc49000
0084ec5c	add x9,x9,#0x378
0084ec60	str w8,[x0, #0x8]
0084ec64	ldr q1,[x1]
0084ec68	str x9,[x0]
0084ec6c	str d0,[x0, #0x20]
0084ec70	stur q1,[x0, #0xc]
0084ec74	str w2,[x0, #0x28]
0084ec78	ret
