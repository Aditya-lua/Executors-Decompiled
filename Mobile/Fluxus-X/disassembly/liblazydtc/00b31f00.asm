; FUN_00b31f00 @ 00b31f00
00b31f00	stp x29,x30,[sp, #-0x10]!
00b31f04	mov x29,sp
00b31f08	bl 0x00c41000
00b31f0c	cbz w0,0x00b31f28
00b31f10	adrp x1,0x2c8000
00b31f14	add x1,x1,#0x64d
00b31f18	orr w0,wzr,#0x70
00b31f1c	mov w2,#0x45
00b31f20	ldp x29,x30,[sp], #0x10
00b31f24	b 0x00c34250
00b31f28	mov x0,xzr
00b31f2c	ldp x29,x30,[sp], #0x10
00b31f30	ret
