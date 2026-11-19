; PKCS12_add_friendlyname_utf8 @ 00abcdd4
00abcdd4	stp x29,x30,[sp, #-0x10]!
00abcdd8	mov w4,w2
00abcddc	mov x3,x1
00abcde0	add x0,x0,#0x10
00abcde4	mov w1,#0x9c
00abcde8	mov w2,#0x1000
00abcdec	mov x29,sp
00abcdf0	bl 0x00c37f00
00abcdf4	cmp x0,#0x0
00abcdf8	cset w0,ne
00abcdfc	ldp x29,x30,[sp], #0x10
00abce00	ret
