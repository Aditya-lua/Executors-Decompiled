; PKCS12_add_friendlyname_uni @ 00abce04
00abce04	stp x29,x30,[sp, #-0x10]!
00abce08	mov w4,w2
00abce0c	mov x3,x1
00abce10	add x0,x0,#0x10
00abce14	mov w1,#0x9c
00abce18	mov w2,#0x1002
00abce1c	mov x29,sp
00abce20	bl 0x00c37f00
00abce24	cmp x0,#0x0
00abce28	cset w0,ne
00abce2c	ldp x29,x30,[sp], #0x10
00abce30	ret
