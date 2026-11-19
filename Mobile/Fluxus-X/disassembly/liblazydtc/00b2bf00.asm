; FUN_00b2bf00 @ 00b2bf00
00b2bf00	stp x29,x30,[sp, #-0x10]!
00b2bf04	mov x29,sp
00b2bf08	bl 0x00c41000
00b2bf0c	cmp w0,#0x0
00b2bf10	cset w0,ne
00b2bf14	ldp x29,x30,[sp], #0x10
00b2bf18	ret
