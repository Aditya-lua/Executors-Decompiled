; FUN_0084fcc4 @ 0084fcc4
0084fcc4	adrp x8,0xd1b000
0084fcc8	adrp x9,0xc4a000
0084fccc	add x9,x9,#0x508
0084fcd0	ldr w8,[x8, #0x140]
0084fcd4	str x9,[x0]
0084fcd8	str w8,[x0, #0x8]
0084fcdc	adrp x8,0xc49000
0084fce0	add x8,x8,#0x848
0084fce4	ldr q0,[x1]
0084fce8	strb wzr,[x0, #0x1c]
0084fcec	str x8,[x0]
0084fcf0	stur q0,[x0, #0xc]
0084fcf4	ret
