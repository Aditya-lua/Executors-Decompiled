; FUN_0084ed88 @ 0084ed88
0084ed88	adrp x8,0xd1b000
0084ed8c	adrp x9,0xc4a000
0084ed90	add x9,x9,#0x508
0084ed94	ldr w8,[x8, #0x30]
0084ed98	str x9,[x0]
0084ed9c	str w8,[x0, #0x8]
0084eda0	adrp x8,0xc49000
0084eda4	add x8,x8,#0x458
0084eda8	ldr q0,[x1]
0084edac	str x8,[x0]
0084edb0	stur q0,[x0, #0xc]
0084edb4	ret
