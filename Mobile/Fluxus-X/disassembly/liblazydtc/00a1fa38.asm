; FUN_00a1fa38 @ 00a1fa38
00a1fa38	stp x20,x19,[sp, #-0x20]!
00a1fa3c	stp x29,x30,[sp, #0x10]
00a1fa40	mov x19,x0
00a1fa44	ldr x0,[x0, #0x20]
00a1fa48	mov x20,x1
00a1fa4c	add x29,sp,#0x10
00a1fa50	cbnz x0,0x00a1fa60
00a1fa54	bl 0x00c3a100
00a1fa58	str x0,[x19, #0x20]
00a1fa5c	cbz x0,0x00a1fa88
00a1fa60	ldr x8,[x20, #0x20]
00a1fa64	add x0,x0,#0x8
00a1fa68	add x1,x8,#0x8
00a1fa6c	bl 0x00c39c80
00a1fa70	cbz w0,0x00a1fa88
00a1fa74	ldr x8,[x19, #0x20]
00a1fa78	mov w0,#0x1
00a1fa7c	ldr x9,[x8, #0xc0]
00a1fa80	add x9,x9,#0x1
00a1fa84	str x9,[x8, #0xc0]
00a1fa88	ldp x29,x30,[sp, #0x10]
00a1fa8c	ldp x20,x19,[sp], #0x20
00a1fa90	ret
