; FUN_0084ed38 @ 0084ed38
0084ed38	adrp x8,0xd1b000
0084ed3c	adrp x9,0xc4a000
0084ed40	add x9,x9,#0x508
0084ed44	ldr w8,[x8, #0x20]
0084ed48	str x9,[x0]
0084ed4c	adrp x9,0xc49000
0084ed50	add x9,x9,#0x420
0084ed54	str w8,[x0, #0x8]
0084ed58	ldr q0,[x1]
0084ed5c	str x9,[x0]
0084ed60	stur q0,[x0, #0xc]
0084ed64	ldr x8,[x2]
0084ed68	str x8,[x0, #0x20]
0084ed6c	ret
