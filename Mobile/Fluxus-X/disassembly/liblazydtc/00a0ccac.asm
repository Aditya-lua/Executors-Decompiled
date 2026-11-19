; FUN_00a0ccac @ 00a0ccac
00a0ccac	stp x29,x30,[sp, #-0x10]!
00a0ccb0	mov x29,sp
00a0ccb4	bl 0x00c39510
00a0ccb8	bl 0x00c39580
00a0ccbc	adrp x8,0xd21000
00a0ccc0	mov w9,#0x1
00a0ccc4	strb w9,[x8, #0x93c]
00a0ccc8	ldp x29,x30,[sp], #0x10
00a0cccc	ret
