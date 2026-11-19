; BN_set_negative @ 00a02974
00a02974	cbz w1,0x00a0298c
00a02978	ldr w8,[x0, #0x8]
00a0297c	cbz w8,0x00a0298c
00a02980	mov w8,#0x1
00a02984	str w8,[x0, #0x10]
00a02988	ret
00a0298c	str wzr,[x0, #0x10]
00a02990	ret
