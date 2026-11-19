; FUN_00c2b358 @ 00c2b358
00c2b358	bti c
00c2b35c	str q1,[sp, #-0x10]!
00c2b360	ldrb w8,[sp, #0xf]
00c2b364	eor w8,w8,#0x80
00c2b368	strb w8,[sp, #0xf]
00c2b36c	ldr q1,[sp], #0x10
00c2b370	b 0x00c2a8b4
