; FUN_00b559e8 @ 00b559e8
00b559e8	stp x29,x30,[sp, #-0x10]!
00b559ec	adrp x1,0x2d7000
00b559f0	add x1,x1,#0xe7d
00b559f4	mov x29,sp
00b559f8	bl 0x00c3e8c0
00b559fc	cbz x0,0x00b55a0c
00b55a00	mov w1,#0x10
00b55a04	ldp x29,x30,[sp], #0x10
00b55a08	b 0x00c3e950
00b55a0c	mov w0,#0x1
00b55a10	ldp x29,x30,[sp], #0x10
00b55a14	ret
