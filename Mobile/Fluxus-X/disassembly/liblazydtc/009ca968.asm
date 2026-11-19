; SSL_rstate_string_long @ 009ca968
009ca968	ldr w8,[x0, #0xc64]
009ca96c	sub w8,w8,#0xf0
009ca970	cmp w8,#0x2
009ca974	b.hi 0x009ca988
009ca978	adrp x9,0xc58000
009ca97c	add x9,x9,#0x1b0
009ca980	ldr x0,[x9, w8, SXTW #0x3]
009ca984	ret
009ca988	adrp x0,0x2ab000
009ca98c	add x0,x0,#0x4b6
009ca990	ret
