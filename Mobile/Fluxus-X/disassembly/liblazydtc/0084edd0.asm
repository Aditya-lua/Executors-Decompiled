; FUN_0084edd0 @ 0084edd0
0084edd0	adrp x8,0xd1b000
0084edd4	adrp x9,0xc4a000
0084edd8	add x9,x9,#0x508
0084eddc	ldr w8,[x8, #0x40]
0084ede0	str x9,[x0]
0084ede4	str w8,[x0, #0x8]
0084ede8	adrp x8,0xc49000
0084edec	add x8,x8,#0x490
0084edf0	ldr q0,[x1]
0084edf4	str x8,[x0]
0084edf8	str x2,[x0, #0x20]
0084edfc	stur q0,[x0, #0xc]
0084ee00	ldr q0,[x6]
0084ee04	stur q0,[x0, #0x28]
0084ee08	ldr q0,[x3]
0084ee0c	strb w4,[x0, #0x48]
0084ee10	strb w5,[x0, #0x49]
0084ee14	stur q0,[x0, #0x38]
0084ee18	ldr q0,[x7]
0084ee1c	stur q0,[x0, #0x4c]
0084ee20	ret
