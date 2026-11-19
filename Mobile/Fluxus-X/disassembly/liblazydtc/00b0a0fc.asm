; X509_add_ext @ 00b0a0fc
00b0a0fc	stp x29,x30,[sp, #-0x10]!
00b0a100	add x0,x0,#0x68
00b0a104	mov x29,sp
00b0a108	bl 0x00c3efc0
00b0a10c	cmp x0,#0x0
00b0a110	cset w0,ne
00b0a114	ldp x29,x30,[sp], #0x10
00b0a118	ret
