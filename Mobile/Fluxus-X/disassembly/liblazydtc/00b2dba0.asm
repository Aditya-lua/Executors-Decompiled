; ossl_blake2b_param_init @ 00b2dba0
00b2dba0	mov w8,#0x40
00b2dba4	movk w8,#0x101, LSL #16
00b2dba8	stur xzr,[x0, #0x34]
00b2dbac	stur xzr,[x0, #0x2c]
00b2dbb0	stur xzr,[x0, #0x24]
00b2dbb4	stur xzr,[x0, #0x1c]
00b2dbb8	stur xzr,[x0, #0x14]
00b2dbbc	stur xzr,[x0, #0xc]
00b2dbc0	str wzr,[x0, #0x3c]
00b2dbc4	str w8,[x0]
00b2dbc8	stur xzr,[x0, #0x4]
00b2dbcc	ret
