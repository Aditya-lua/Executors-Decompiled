; FUN_00a84a64 @ 00a84a64
00a84a64	stp x29,x30,[sp, #-0x10]!
00a84a68	adrp x0,0xcb5000
00a84a6c	ldr x0,[x0, #0x660]
00a84a70	mov x29,sp
00a84a74	bl 0x007fbc54
00a84a78	cmp w0,#0x0
00a84a7c	cset w8,eq
00a84a80	adrp x9,0xd22000
00a84a84	str w8,[x9, #0x34]
00a84a88	ldp x29,x30,[sp], #0x10
00a84a8c	ret
