; FUN_00b4a2bc @ 00b4a2bc
00b4a2bc	stp x29,x30,[sp, #-0x10]!
00b4a2c0	mov x0,x1
00b4a2c4	adrp x1,0x2d7000
00b4a2c8	add x1,x1,#0xe7d
00b4a2cc	mov x29,sp
00b4a2d0	bl 0x00c3e8c0
00b4a2d4	cbz x0,0x00b4a2e4
00b4a2d8	mov x1,#-0x1
00b4a2dc	ldp x29,x30,[sp], #0x10
00b4a2e0	b 0x00c3e950
00b4a2e4	orr w0,wzr,#0xfffffffe
00b4a2e8	ldp x29,x30,[sp], #0x10
00b4a2ec	ret
