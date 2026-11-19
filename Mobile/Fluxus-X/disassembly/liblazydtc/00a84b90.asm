; FUN_00a84b90 @ 00a84b90
00a84b90	stp x29,x30,[sp, #-0x10]!
00a84b94	mov x29,sp
00a84b98	bl 0x00c383a0
00a84b9c	cbz w0,0x00a84bb0
00a84ba0	adrp x9,0xd22000
00a84ba4	mov w8,#0x1
00a84ba8	strb w8,[x9, #0x1c]
00a84bac	b 0x00a84bb4
00a84bb0	mov w8,wzr
00a84bb4	adrp x9,0xd22000
00a84bb8	str w8,[x9, #0x6c]
00a84bbc	ldp x29,x30,[sp], #0x10
00a84bc0	ret
