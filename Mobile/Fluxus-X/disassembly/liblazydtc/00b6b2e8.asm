; mbedtls_ccm_set_lengths @ 00b6b2e8
00b6b2e8	lsr x8,x1,#0x8
00b6b2ec	cmp x8,#0xfe
00b6b2f0	b.hi 0x00b6b320
00b6b2f4	cmp x3,#0x2
00b6b2f8	b.eq 0x00b6b320
00b6b2fc	cmp x3,#0x10
00b6b300	b.hi 0x00b6b320
00b6b304	tbnz w3,#0x0,0x00b6b320
00b6b308	ldr w8,[x0, #0xa8]
00b6b30c	stp x2,x1,[x0, #0x20]
00b6b310	stp x3,xzr,[x0, #0x30]
00b6b314	orr w8,w8,#0x2
00b6b318	str w8,[x0, #0xa8]
00b6b31c	b 0x00b6b1c8
00b6b320	orr w0,wzr,#0xfffffff3
00b6b324	ret
