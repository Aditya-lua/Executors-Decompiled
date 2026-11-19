; OCSP_SINGLERESP_add_ext @ 00ab0fe4
00ab0fe4	stp x29,x30,[sp, #-0x10]!
00ab0fe8	add x0,x0,#0x20
00ab0fec	mov x29,sp
00ab0ff0	bl 0x00c3efc0
00ab0ff4	cmp x0,#0x0
00ab0ff8	cset w0,ne
00ab0ffc	ldp x29,x30,[sp], #0x10
00ab1000	ret
