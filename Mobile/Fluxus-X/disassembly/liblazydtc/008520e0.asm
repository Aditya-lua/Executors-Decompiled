; FUN_008520e0 @ 008520e0
008520e0	adrp x8,0xd1e000
008520e4	ldr q0,[sp]
008520e8	ldr x9,[sp, #0x18]
008520ec	ldr w8,[x8, #0xb20]
008520f0	stur x1,[x0, #0x4]
008520f4	stp x2,x3,[x0, #0x10]
008520f8	str w8,[x0]
008520fc	ldr x8,[sp, #0x10]
00852100	stp x4,x5,[x0, #0x20]
00852104	str x6,[x0, #0x30]
00852108	str x7,[x0, #0x38]
0085210c	str q0,[x0, #0x40]
00852110	stp x8,x9,[x0, #0x50]
00852114	ret
