; FUN_00b460b4 @ 00b460b4
00b460b4	stp x29,x30,[sp, #-0x10]!
00b460b8	mov x0,x1
00b460bc	adrp x1,0x2d7000
00b460c0	add x1,x1,#0xe7d
00b460c4	mov x29,sp
00b460c8	bl 0x00c3e8c0
00b460cc	cbz x0,0x00b460dc
00b460d0	mov x1,#-0x1
00b460d4	ldp x29,x30,[sp], #0x10
00b460d8	b 0x00c3e950
00b460dc	orr w0,wzr,#0xfffffffe
00b460e0	ldp x29,x30,[sp], #0x10
00b460e4	ret
