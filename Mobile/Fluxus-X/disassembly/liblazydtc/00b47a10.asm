; FUN_00b47a10 @ 00b47a10
00b47a10	stp x29,x30,[sp, #-0x10]!
00b47a14	mov x0,x1
00b47a18	adrp x1,0x2d7000
00b47a1c	add x1,x1,#0xe7d
00b47a20	mov x29,sp
00b47a24	bl 0x00c3e8c0
00b47a28	cbz x0,0x00b47a38
00b47a2c	mov x1,#-0x1
00b47a30	ldp x29,x30,[sp], #0x10
00b47a34	b 0x00c3e950
00b47a38	orr w0,wzr,#0xfffffffe
00b47a3c	ldp x29,x30,[sp], #0x10
00b47a40	ret
