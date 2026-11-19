; ossl_x448 @ 00a4a524
00a4a524	stp x29,x30,[sp, #-0x10]!
00a4a528	mov x8,x1
00a4a52c	mov x1,x2
00a4a530	mov x2,x8
00a4a534	mov x29,sp
00a4a538	bl 0x00a48b50
00a4a53c	cmn w0,#0x1
00a4a540	cset w0,eq
00a4a544	ldp x29,x30,[sp], #0x10
00a4a548	ret
