; FUN_00b52d60 @ 00b52d60
00b52d60	stp x20,x19,[sp, #-0x20]!
00b52d64	mov x19,x1
00b52d68	adrp x1,0x2d7000
00b52d6c	mov x20,x0
00b52d70	add x1,x1,#0xe7d
00b52d74	mov x0,x19
00b52d78	stp x29,x30,[sp, #0x10]
00b52d7c	add x29,sp,#0x10
00b52d80	bl 0x00c3e8c0
00b52d84	cbz x0,0x00b52d94
00b52d88	ldrb w1,[x20, #0xf0]
00b52d8c	bl 0x00c3e950
00b52d90	cbz w0,0x00b52db8
00b52d94	adrp x1,0x2dc000
00b52d98	add x1,x1,#0x8b
00b52d9c	mov x0,x19
00b52da0	bl 0x00c3e8c0
00b52da4	cbz x0,0x00b52db4
00b52da8	mov w1,#0x80
00b52dac	bl 0x00c3e950
00b52db0	cbz w0,0x00b52db8
00b52db4	mov w0,#0x1
00b52db8	ldp x29,x30,[sp, #0x10]
00b52dbc	ldp x20,x19,[sp], #0x20
00b52dc0	ret
