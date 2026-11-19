; FUN_0084fac4 @ 0084fac4
0084fac4	adrp x8,0xd1b000
0084fac8	adrp x9,0xc4a000
0084facc	add x9,x9,#0x508
0084fad0	ldr w8,[x8, #0x110]
0084fad4	str x9,[x0]
0084fad8	ldr x9,[sp, #0x8]
0084fadc	str w8,[x0, #0x8]
0084fae0	adrp x8,0xc49000
0084fae4	add x8,x8,#0x7a0
0084fae8	ldr q0,[x1]
0084faec	strb wzr,[x0, #0x1c]
0084faf0	str x8,[x0]
0084faf4	ldr x8,[sp]
0084faf8	stur q0,[x0, #0xc]
0084fafc	stp x2,x3,[x0, #0x20]
0084fb00	strb w4,[x0, #0x30]
0084fb04	ldr q0,[x5]
0084fb08	str x6,[x0, #0x48]
0084fb0c	strb w7,[x0, #0x50]
0084fb10	stur q0,[x0, #0x34]
0084fb14	ldr q0,[x8]
0084fb18	ldr w8,[x8, #0x10]
0084fb1c	stur q0,[x0, #0x54]
0084fb20	str w8,[x0, #0x64]
0084fb24	ldr q0,[x9]
0084fb28	ldr w8,[x9, #0x10]
0084fb2c	stur q0,[x0, #0x68]
0084fb30	str w8,[x0, #0x78]
0084fb34	ret
