; OCSP_ONEREQ_add_ext @ 00ab0f24
00ab0f24	stp x29,x30,[sp, #-0x10]!
00ab0f28	add x0,x0,#0x8
00ab0f2c	mov x29,sp
00ab0f30	bl 0x00c3efc0
00ab0f34	cmp x0,#0x0
00ab0f38	cset w0,ne
00ab0f3c	ldp x29,x30,[sp], #0x10
00ab0f40	ret
