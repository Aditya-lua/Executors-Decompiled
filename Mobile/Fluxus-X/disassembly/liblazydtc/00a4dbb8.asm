; FUN_00a4dbb8 @ 00a4dbb8
00a4dbb8	stp x20,x19,[sp, #-0x20]!
00a4dbbc	stp x29,x30,[sp, #0x10]
00a4dbc0	add x29,sp,#0x10
00a4dbc4	mov x20,x1
00a4dbc8	mov x19,x0
00a4dbcc	bl 0x00c3b410
00a4dbd0	cbz w0,0x00a4dbe4
00a4dbd4	mov x0,x20
00a4dbd8	mov x1,x19
00a4dbdc	bl 0x00c347a0
00a4dbe0	cbz w0,0x00a4dbf0
00a4dbe4	ldp x29,x30,[sp, #0x10]
00a4dbe8	ldp x20,x19,[sp], #0x20
00a4dbec	ret
00a4dbf0	ldp x29,x30,[sp, #0x10]
00a4dbf4	mov x0,x19
00a4dbf8	ldp x20,x19,[sp], #0x20
00a4dbfc	b 0x00c3b3c0
