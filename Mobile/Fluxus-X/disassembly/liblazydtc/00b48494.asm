; FUN_00b48494 @ 00b48494
00b48494	stp x29,x30,[sp, #-0x10]!
00b48498	mov x0,x1
00b4849c	adrp x1,0x2d7000
00b484a0	add x1,x1,#0xe7d
00b484a4	mov x29,sp
00b484a8	bl 0x00c3e8c0
00b484ac	cbz x0,0x00b484bc
00b484b0	mov x1,#-0x1
00b484b4	ldp x29,x30,[sp], #0x10
00b484b8	b 0x00c3e950
00b484bc	orr w0,wzr,#0xfffffffe
00b484c0	ldp x29,x30,[sp], #0x10
00b484c4	ret
