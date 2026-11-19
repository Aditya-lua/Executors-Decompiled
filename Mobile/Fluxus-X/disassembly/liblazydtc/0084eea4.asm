; FUN_0084eea4 @ 0084eea4
0084eea4	adrp x8,0xd1b000
0084eea8	adrp x9,0xc4a000
0084eeac	add x9,x9,#0x508
0084eeb0	ldr w8,[x8, #0x50]
0084eeb4	str x9,[x0]
0084eeb8	str w8,[x0, #0x8]
0084eebc	adrp x8,0xc49000
0084eec0	add x8,x8,#0x4c8
0084eec4	ldr q0,[x1]
0084eec8	str x8,[x0]
0084eecc	stur q0,[x0, #0xc]
0084eed0	ldr x8,[x3]
0084eed4	stp x2,x8,[x0, #0x20]
0084eed8	ldr q0,[x4]
0084eedc	str q0,[x0, #0x30]
0084eee0	ldr x8,[x5]
0084eee4	strb w6,[x0, #0x48]
0084eee8	strb w7,[x0, #0x49]
0084eeec	str x8,[x0, #0x40]
0084eef0	ret
