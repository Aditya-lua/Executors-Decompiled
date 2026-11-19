; ossl_ed448ph_sign @ 00a47564
00a47564	sub sp,sp,#0x20
00a47568	mov x8,x6
00a4756c	mov x9,x5
00a47570	mov x10,x2
00a47574	mov w5,#0x40
00a47578	mov w6,#0x1
00a4757c	stp x8,x7,[sp]
00a47580	mov x2,x4
00a47584	mov x4,x10
00a47588	mov x7,x9
00a4758c	stp x29,x30,[sp, #0x10]
00a47590	add x29,sp,#0x10
00a47594	bl 0x00a46ebc
00a47598	ldp x29,x30,[sp, #0x10]
00a4759c	cmn w0,#0x1
00a475a0	cset w0,eq
00a475a4	add sp,sp,#0x20
00a475a8	ret
