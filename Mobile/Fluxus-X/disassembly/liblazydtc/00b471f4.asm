; FUN_00b471f4 @ 00b471f4
00b471f4	stp x29,x30,[sp, #-0x10]!
00b471f8	mov x0,x1
00b471fc	adrp x1,0x2d7000
00b47200	add x1,x1,#0xe7d
00b47204	mov x29,sp
00b47208	bl 0x00c3e8c0
00b4720c	cbz x0,0x00b4721c
00b47210	mov x1,#-0x1
00b47214	ldp x29,x30,[sp], #0x10
00b47218	b 0x00c3e950
00b4721c	orr w0,wzr,#0xfffffffe
00b47220	ldp x29,x30,[sp], #0x10
00b47224	ret
