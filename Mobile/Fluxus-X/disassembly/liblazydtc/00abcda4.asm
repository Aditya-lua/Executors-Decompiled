; PKCS12_add_friendlyname_asc @ 00abcda4
00abcda4	stp x29,x30,[sp, #-0x10]!
00abcda8	mov w4,w2
00abcdac	mov x3,x1
00abcdb0	add x0,x0,#0x10
00abcdb4	mov w1,#0x9c
00abcdb8	mov w2,#0x1001
00abcdbc	mov x29,sp
00abcdc0	bl 0x00c37f00
00abcdc4	cmp x0,#0x0
00abcdc8	cset w0,ne
00abcdcc	ldp x29,x30,[sp], #0x10
00abcdd0	ret
