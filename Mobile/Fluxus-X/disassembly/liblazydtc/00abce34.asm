; PKCS12_add_CSPName_asc @ 00abce34
00abce34	stp x29,x30,[sp, #-0x10]!
00abce38	mov w4,w2
00abce3c	mov x3,x1
00abce40	add x0,x0,#0x10
00abce44	mov w1,#0x1a1
00abce48	mov w2,#0x1001
00abce4c	mov x29,sp
00abce50	bl 0x00c37f00
00abce54	cmp x0,#0x0
00abce58	cset w0,ne
00abce5c	ldp x29,x30,[sp], #0x10
00abce60	ret
