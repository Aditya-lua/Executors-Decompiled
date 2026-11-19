; FUN_008b63a4 @ 008b63a4
008b63a4	ldrb w8,[x1, #0x2]
008b63a8	ldr x9,[x0, #0x60]
008b63ac	and w8,w8,#0xfffffffb
008b63b0	strb w8,[x1, #0x2]
008b63b4	ldr x8,[x9, #0x60]
008b63b8	str x8,[x2]
008b63bc	str x1,[x9, #0x60]
008b63c0	ret
