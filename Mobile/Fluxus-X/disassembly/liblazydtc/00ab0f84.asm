; OCSP_BASICRESP_add_ext @ 00ab0f84
00ab0f84	stp x29,x30,[sp, #-0x10]!
00ab0f88	add x0,x0,#0x28
00ab0f8c	mov x29,sp
00ab0f90	bl 0x00c3efc0
00ab0f94	cmp x0,#0x0
00ab0f98	cset w0,ne
00ab0f9c	ldp x29,x30,[sp], #0x10
00ab0fa0	ret
