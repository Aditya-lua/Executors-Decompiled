; FUN_00ac1e54 @ 00ac1e54
00ac1e54	stp x20,x19,[sp, #-0x20]!
00ac1e58	stp x29,x30,[sp, #0x10]
00ac1e5c	add x29,sp,#0x10
00ac1e60	mov x19,x2
00ac1e64	mov w20,w1
00ac1e68	bl 0x00c35620
00ac1e6c	cbz x0,0x00ac1e84
00ac1e70	ldp x29,x30,[sp, #0x10]
00ac1e74	mov w1,w20
00ac1e78	mov x2,x19
00ac1e7c	ldp x20,x19,[sp], #0x20
00ac1e80	b 0x00c38450
00ac1e84	ldp x29,x30,[sp, #0x10]
00ac1e88	ldp x20,x19,[sp], #0x20
00ac1e8c	ret
