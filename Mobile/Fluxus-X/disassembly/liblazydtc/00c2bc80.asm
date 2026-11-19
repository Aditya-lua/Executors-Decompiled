; FUN_00c2bc80 @ 00c2bc80
00c2bc80	bti c
00c2bc84	adrp x16,0xd28000
00c2bc88	ldrb w16,[x16, #0xe0]
00c2bc8c	cbz w16,0x00c2bc98
00c2bc90	swpal x0,x0,[x1]
00c2bc94	ret
00c2bc98	mov x16,x0
00c2bc9c	ldaxr x0,[x1]
00c2bca0	stlxr w17,x16,[x1]
00c2bca4	cbnz w17,0x00c2bc9c
00c2bca8	ret
