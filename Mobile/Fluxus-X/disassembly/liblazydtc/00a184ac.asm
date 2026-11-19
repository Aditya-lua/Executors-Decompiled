; FUN_00a184ac @ 00a184ac
00a184ac	stp x29,x30,[sp, #-0x10]!
00a184b0	mov x29,sp
00a184b4	bl 0x00c342a0
00a184b8	adrp x0,0x2d1000
00a184bc	adrp x2,0x2ab000
00a184c0	add x0,x0,#0x784
00a184c4	add x2,x2,#0xec5
00a184c8	mov w1,#0x1b1
00a184cc	bl 0x00c342b0
00a184d0	mov w0,#0x5
00a184d4	mov w1,#0x7d
00a184d8	mov x2,xzr
00a184dc	bl 0x00c342c0
00a184e0	mov w0,wzr
00a184e4	ldp x29,x30,[sp], #0x10
00a184e8	ret
