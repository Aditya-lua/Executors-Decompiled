; FUN_00b31b98 @ 00b31b98
00b31b98	stp x29,x30,[sp, #-0x10]!
00b31b9c	mov x29,sp
00b31ba0	bl 0x00c41000
00b31ba4	cbz w0,0x00b31bc0
00b31ba8	adrp x1,0x2dc000
00b31bac	add x1,x1,#0xe47
00b31bb0	orr w0,wzr,#0x60
00b31bb4	orr w2,wzr,#0x18
00b31bb8	ldp x29,x30,[sp], #0x10
00b31bbc	b 0x00c34250
00b31bc0	mov x0,xzr
00b31bc4	ldp x29,x30,[sp], #0x10
00b31bc8	ret
