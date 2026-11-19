; FUN_00b0fb7c @ 00b0fb7c
00b0fb7c	stp x29,x30,[sp, #-0x10]!
00b0fb80	mov x0,x2
00b0fb84	mov x29,sp
00b0fb88	bl 0x00c40aa0
00b0fb8c	cmp w0,#0x0
00b0fb90	cset w0,eq
00b0fb94	ldp x29,x30,[sp], #0x10
00b0fb98	ret
