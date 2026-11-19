; SCT_set_source @ 00a14284
00a14284	sub w8,w1,#0x1
00a14288	cmp w8,#0x2
00a1428c	stp w1,wzr,[x0, #0x5c]
00a14290	b.hi 0x00a142a8
00a14294	adrp x9,0x752000
00a14298	add x9,x9,#0x6c4
00a1429c	ldr w8,[x9, w8, SXTW #0x2]
00a142a0	str wzr,[x0, #0x60]
00a142a4	str w8,[x0, #0x58]
00a142a8	mov w0,#0x1
00a142ac	ret
