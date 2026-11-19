; EC_GROUP_set_curve_name @ 00a30e84
00a30e84	cmp w1,#0x0
00a30e88	cset w8,ne
00a30e8c	stp w1,w8,[x0, #0x20]
00a30e90	ret
