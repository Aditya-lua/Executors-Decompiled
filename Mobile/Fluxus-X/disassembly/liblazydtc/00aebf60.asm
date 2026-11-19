; FUN_00aebf60 @ 00aebf60
00aebf60	stp x29,x30,[sp, #-0x10]!
00aebf64	mov x29,sp
00aebf68	bl 0x00c34d50
00aebf6c	adrp x8,0xd22000
00aebf70	cmp x0,#0x0
00aebf74	str x0,[x8, #0x310]
00aebf78	cset w8,ne
00aebf7c	adrp x9,0xd22000
00aebf80	str w8,[x9, #0x30c]
00aebf84	ldp x29,x30,[sp], #0x10
00aebf88	ret
