; FUN_008b63c4 @ 008b63c4
008b63c4	ldrb w9,[x1, #0x2]
008b63c8	tst w9,#0x7
008b63cc	b.eq 0x008b63d4
008b63d0	ret
008b63d4	ldr x8,[x0, #0x60]
008b63d8	ldrb w10,[x8, #0x1]
008b63dc	sub w10,w10,#0x1
008b63e0	cmp w10,#0x2
008b63e4	b.hi 0x008b642c
008b63e8	orr w10,w9,#0x4
008b63ec	ldr x8,[x1, #0x8]
008b63f0	strb w10,[x1, #0x2]
008b63f4	ldr w10,[x8, #0xc]
008b63f8	cmp w10,#0x5
008b63fc	b.lt 0x008b63d0
008b6400	ldr x8,[x8]
008b6404	ldrb w10,[x8, #0x2]
008b6408	tst w10,#0x3
008b640c	b.eq 0x008b63d0
008b6410	ldr x0,[x0, #0x60]
008b6414	ldrb w10,[x0, #0x1]
008b6418	sub w10,w10,#0x1
008b641c	cmp w10,#0x2
008b6420	b.hi 0x008b6440
008b6424	mov x1,x8
008b6428	b 0x008b61bc
008b642c	ldrb w8,[x8, #0x2]
008b6430	and w8,w8,#0x3
008b6434	orr w8,w8,w9
008b6438	strb w8,[x1, #0x2]
008b643c	ret
008b6440	ldrb w8,[x0, #0x2]
008b6444	b 0x008b6430
