; std::uncaught_exception @ 00bc25b8
00bc25b8	paciasp
00bc25bc	stp x29,x30,[sp, #-0x10]!
00bc25c0	mov x29,sp
00bc25c4	bl 0x00c43c00
00bc25c8	cmp w0,#0x0
00bc25cc	cset w0,gt
00bc25d0	ldp x29,x30,[sp], #0x10
00bc25d4	autiasp
00bc25d8	ret
