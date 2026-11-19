; FUN_00b2da40 @ 00b2da40
00b2da40	stp x29,x30,[sp, #-0x10]!
00b2da44	mov x29,sp
00b2da48	bl 0x00c41000
00b2da4c	cbz w0,0x00b2da68
00b2da50	adrp x1,0x2d2000
00b2da54	add x1,x1,#0x6f1
00b2da58	orr w0,wzr,#0xf0
00b2da5c	mov w2,#0x29
00b2da60	ldp x29,x30,[sp], #0x10
00b2da64	b 0x00c34250
00b2da68	mov x0,xzr
00b2da6c	ldp x29,x30,[sp], #0x10
00b2da70	ret
