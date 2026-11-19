; err_unshelve_state @ 00a54f24
00a54f24	cmn x0,#0x1
00a54f28	b.eq 0x00a54f3c
00a54f2c	mov x1,x0
00a54f30	adrp x0,0xd21000
00a54f34	add x0,x0,#0xa1c
00a54f38	b 0x00c38380
00a54f3c	ret
