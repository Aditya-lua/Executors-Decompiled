; GENERAL_NAME_set0_value @ 00af5140
00af5140	cmp w1,#0x8
00af5144	b.hi 0x00af514c
00af5148	str x2,[x0, #0x8]
00af514c	str w1,[x0]
00af5150	ret
