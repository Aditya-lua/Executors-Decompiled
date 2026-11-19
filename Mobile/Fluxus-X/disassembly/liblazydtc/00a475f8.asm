; ossl_ed448_public_from_private @ 00a475f8
00a475f8	stp x29,x30,[sp, #-0x10]!
00a475fc	mov x29,sp
00a47600	bl 0x00a46df8
00a47604	cmn w0,#0x1
00a47608	cset w0,eq
00a4760c	ldp x29,x30,[sp], #0x10
00a47610	ret
