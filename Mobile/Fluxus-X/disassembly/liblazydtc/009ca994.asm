; SSL_rstate_string @ 009ca994
009ca994	ldr w8,[x0, #0xc64]
009ca998	sub w8,w8,#0xf0
009ca99c	cmp w8,#0x2
009ca9a0	b.hi 0x009ca9b4
009ca9a4	adrp x9,0xc58000
009ca9a8	add x9,x9,#0x1d0
009ca9ac	ldr x0,[x9, w8, SXTW #0x3]
009ca9b0	ret
009ca9b4	adrp x0,0x2ab000
009ca9b8	add x0,x0,#0x4b6
009ca9bc	ret
