; BN_set_params @ 00a01468
00a01468	tbnz w0,#0x1f,0x00a01480
00a0146c	cmp w0,#0x1f
00a01470	orr w8,wzr,#0x1f
00a01474	csel w8,w0,w8,lt
00a01478	adrp x9,0xd21000
00a0147c	str w8,[x9, #0x900]
00a01480	tbnz w1,#0x1f,0x00a01498
00a01484	cmp w1,#0x1f
00a01488	orr w8,wzr,#0x1f
00a0148c	csel w8,w1,w8,lt
00a01490	adrp x9,0xd21000
00a01494	str w8,[x9, #0x904]
00a01498	tbnz w2,#0x1f,0x00a014b0
00a0149c	cmp w2,#0x1f
00a014a0	orr w8,wzr,#0x1f
00a014a4	csel w8,w2,w8,lt
00a014a8	adrp x9,0xd21000
00a014ac	str w8,[x9, #0x908]
00a014b0	tbnz w3,#0x1f,0x00a014c8
00a014b4	cmp w3,#0x1f
00a014b8	orr w8,wzr,#0x1f
00a014bc	csel w8,w3,w8,lt
00a014c0	adrp x9,0xd21000
00a014c4	str w8,[x9, #0x90c]
00a014c8	ret
