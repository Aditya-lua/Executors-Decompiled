; FUN_008b7190 @ 008b7190
008b7190	stp x29,x30,[sp, #-0x20]!
008b7194	str x19,[sp, #0x10]
008b7198	mov x29,sp
008b719c	cmp w1,#0x1
008b71a0	b.lt 0x008b71e0
008b71a4	ldr x8,[x0, #0x60]
008b71a8	mov x19,x0
008b71ac	ldr x0,[x8, #0x4c48]
008b71b0	bl 0x008bb19c
008b71b4	ldr w8,[x0, #0xc]
008b71b8	cmp w8,#0x5
008b71bc	b.lt 0x008b71e0
008b71c0	ldr x1,[x0]
008b71c4	ldrb w8,[x1, #0x2]
008b71c8	tst w8,#0x3
008b71cc	b.eq 0x008b71e0
008b71d0	ldr x0,[x19, #0x60]
008b71d4	ldr x19,[sp, #0x10]
008b71d8	ldp x29,x30,[sp], #0x20
008b71dc	b 0x008b61bc
008b71e0	ldr x19,[sp, #0x10]
008b71e4	ldp x29,x30,[sp], #0x20
008b71e8	ret
