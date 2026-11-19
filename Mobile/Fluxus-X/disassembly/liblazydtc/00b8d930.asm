; psa_custom_key_parameters_are_default @ 00b8d930
00b8d930	ldr w8,[x0]
00b8d934	cmp w8,#0x0
00b8d938	cset w8,eq
00b8d93c	cmp x1,#0x0
00b8d940	cset w9,eq
00b8d944	and w0,w9,w8
00b8d948	ret
