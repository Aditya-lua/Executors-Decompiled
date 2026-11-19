; FUN_0084ebb0 @ 0084ebb0
0084ebb0	adrp x8,0xd1a000
0084ebb4	adrp x9,0xc4a000
0084ebb8	add x9,x9,#0x508
0084ebbc	ldr w8,[x8, #0xfd0]
0084ebc0	str x9,[x0]
0084ebc4	str w8,[x0, #0x8]
0084ebc8	adrp x8,0xc49000
0084ebcc	add x8,x8,#0x308
0084ebd0	ldr q0,[x1]
0084ebd4	str x8,[x0]
0084ebd8	stur q0,[x0, #0xc]
0084ebdc	ret
