; ossl_blake2s_param_init @ 00b2fbd4
00b2fbd4	mov w8,#0x20
00b2fbd8	movk w8,#0x101, LSL #16
00b2fbdc	stur xzr,[x0, #0x14]
00b2fbe0	stur xzr,[x0, #0xc]
00b2fbe4	str wzr,[x0, #0x1c]
00b2fbe8	str w8,[x0]
00b2fbec	stur xzr,[x0, #0x4]
00b2fbf0	ret
