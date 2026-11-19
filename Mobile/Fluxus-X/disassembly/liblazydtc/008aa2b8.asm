; FUN_008aa2b8 @ 008aa2b8
008aa2b8	ldr x8,[x0, #0x50]
008aa2bc	ldr x9,[x0, #0x20]
008aa2c0	cmp x8,x9
008aa2c4	b.eq 0x008aa2d8
008aa2c8	ldr x8,[x8, #0x8]
008aa2cc	ldr x8,[x8]
008aa2d0	ldr x0,[x8, #0x10]!
008aa2d4	ret
008aa2d8	add x8,x0,#0x78
008aa2dc	ldr x0,[x8]
008aa2e0	ret
