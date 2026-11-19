; FUN_008503a4 @ 008503a4
008503a4	adrp x8,0xd1b000
008503a8	adrp x9,0xc4a000
008503ac	add x9,x9,#0x508
008503b0	ldr w8,[x8, #0x1d0]
008503b4	str x9,[x0]
008503b8	str w8,[x0, #0x8]
008503bc	adrp x8,0xc49000
008503c0	add x8,x8,#0xa40
008503c4	ldr q0,[x1]
008503c8	strb wzr,[x0, #0x1c]
008503cc	str x8,[x0]
008503d0	stp x2,x3,[x0, #0x20]
008503d4	stur q0,[x0, #0xc]
008503d8	strb w4,[x0, #0x30]
008503dc	stur x5,[x0, #0x34]
008503e0	ret
