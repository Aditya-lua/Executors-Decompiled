; FUN_008b6188 @ 008b6188
008b6188	ldr x0,[x0, #0x60]
008b618c	ldrb w8,[x0, #0x1]
008b6190	sub w8,w8,#0x1
008b6194	cmp w8,#0x2
008b6198	b.hi 0x008b61a4
008b619c	mov x1,x2
008b61a0	b 0x008b61bc
008b61a4	ldrb w8,[x1, #0x2]
008b61a8	ldrb w9,[x0, #0x2]
008b61ac	and w8,w8,#0xf8
008b61b0	bfxil w8,w9,#0x0,#0x2
008b61b4	strb w8,[x1, #0x2]
008b61b8	ret
