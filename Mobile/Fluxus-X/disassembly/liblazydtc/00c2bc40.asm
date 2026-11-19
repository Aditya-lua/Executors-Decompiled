; FUN_00c2bc40 @ 00c2bc40
00c2bc40	bti c
00c2bc44	adrp x16,0xd28000
00c2bc48	ldrb w16,[x16, #0xe0]
00c2bc4c	cbz w16,0x00c2bc58
00c2bc50	casal x0,x1,[x2]
00c2bc54	ret
00c2bc58	mov x16,x0
00c2bc5c	ldaxr x0,[x2]
00c2bc60	cmp x0,x16
00c2bc64	b.ne 0x00c2bc70
00c2bc68	stlxr w17,x1,[x2]
00c2bc6c	cbnz w17,0x00c2bc5c
00c2bc70	ret
