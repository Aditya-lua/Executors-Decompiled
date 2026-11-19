; X509_CRL_add_ext @ 00b0a0ac
00b0a0ac	stp x29,x30,[sp, #-0x10]!
00b0a0b0	add x0,x0,#0x38
00b0a0b4	mov x29,sp
00b0a0b8	bl 0x00c3efc0
00b0a0bc	cmp x0,#0x0
00b0a0c0	cset w0,ne
00b0a0c4	ldp x29,x30,[sp], #0x10
00b0a0c8	ret
