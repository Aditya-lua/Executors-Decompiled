; FUN_008b2c3c @ 008b2c3c
008b2c3c	ldr x8,[x1, #0x30]
008b2c40	and x9,x2,#0xff
008b2c44	ldr q0,[x3]
008b2c48	str q0,[x8,x9, lsl #4]
008b2c4c	ldr w8,[x3, #0xc]
008b2c50	cmp w8,#0x5
008b2c54	b.lt 0x008b2c74
008b2c58	ldrb w8,[x1, #0x2]
008b2c5c	tbz w8,#0x2,0x008b2c74
008b2c60	ldr x2,[x3]
008b2c64	ldrb w8,[x2, #0x2]
008b2c68	tst w8,#0x3
008b2c6c	b.eq 0x008b2c74
008b2c70	b 0x008b6188
008b2c74	ret
