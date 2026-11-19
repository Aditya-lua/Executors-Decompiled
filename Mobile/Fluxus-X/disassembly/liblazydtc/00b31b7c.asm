; FUN_00b31b7c @ 00b31b7c
00b31b7c	stp x29,x30,[sp, #-0x10]!
00b31b80	mov x29,sp
00b31b84	bl 0x00c41000
00b31b88	cmp w0,#0x0
00b31b8c	cset w0,ne
00b31b90	ldp x29,x30,[sp], #0x10
00b31b94	ret
