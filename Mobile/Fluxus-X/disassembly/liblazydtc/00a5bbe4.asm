; ossl_is_partially_overlapping @ 00a5bbe4
00a5bbe4	sub x8,x0,x1
00a5bbe8	cmp w2,#0x0
00a5bbec	sxtw x9,w2
00a5bbf0	cset w10,gt
00a5bbf4	cmp x8,#0x0
00a5bbf8	cset w11,ne
00a5bbfc	cmp x8,x9
00a5bc00	neg x9,x9
00a5bc04	and w10,w10,w11
00a5bc08	cset w11,cc
00a5bc0c	cmp x8,x9
00a5bc10	cset w8,hi
00a5bc14	orr w8,w11,w8
00a5bc18	and w0,w10,w8
00a5bc1c	ret
