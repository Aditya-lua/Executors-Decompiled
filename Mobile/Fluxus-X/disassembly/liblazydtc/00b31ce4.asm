; FUN_00b31ce4 @ 00b31ce4
00b31ce4	stp x29,x30,[sp, #-0x10]!
00b31ce8	mov x29,sp
00b31cec	bl 0x00c41000
00b31cf0	cbz w0,0x00b31d0c
00b31cf4	adrp x1,0x2c8000
00b31cf8	add x1,x1,#0x64d
00b31cfc	orr w0,wzr,#0x60
00b31d00	mov w2,#0x40
00b31d04	ldp x29,x30,[sp], #0x10
00b31d08	b 0x00c34250
00b31d0c	mov x0,xzr
00b31d10	ldp x29,x30,[sp], #0x10
00b31d14	ret
