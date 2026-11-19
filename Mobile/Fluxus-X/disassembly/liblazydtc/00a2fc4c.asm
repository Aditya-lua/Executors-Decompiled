; EC_KEY_set_default_method @ 00a2fc4c
00a2fc4c	adrp x8,0xc5c000
00a2fc50	add x8,x8,#0x120
00a2fc54	cmp x0,#0x0
00a2fc58	csel x8,x8,x0,eq
00a2fc5c	adrp x9,0xcc8000
00a2fc60	str x8,[x9, #0x978]
00a2fc64	ret
