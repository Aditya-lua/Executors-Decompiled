; FUN_00ac2320 @ 00ac2320
00ac2320	cbz x1,0x00ac233c
00ac2324	stp x29,x30,[sp, #-0x10]!
00ac2328	mov x0,x1
00ac232c	mov x29,sp
00ac2330	bl 0x00c2ff50
00ac2334	ldp x29,x30,[sp], #0x10
00ac2338	ret
00ac233c	mov w0,wzr
00ac2340	ret
