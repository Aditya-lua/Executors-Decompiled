; FUN_00b56e28 @ 00b56e28
00b56e28	stp x20,x19,[sp, #-0x20]!
00b56e2c	stp x29,x30,[sp, #0x10]
00b56e30	ldr x20,[x0, #0xf8]
00b56e34	mov x19,x0
00b56e38	mov w1,#0x20
00b56e3c	add x29,sp,#0x10
00b56e40	add x0,x20,#0x34
00b56e44	bl 0x00c34750
00b56e48	add x0,x20,#0x54
00b56e4c	mov w1,#0x10
00b56e50	bl 0x00c34750
00b56e54	add x0,x20,#0x64
00b56e58	mov w1,#0x10
00b56e5c	bl 0x00c34750
00b56e60	add x0,x20,#0x80
00b56e64	orr w1,wzr,#0x30
00b56e68	bl 0x00c34750
00b56e6c	str xzr,[x20, #0x78]
00b56e70	ldp x29,x30,[sp, #0x10]
00b56e74	mov x0,x19
00b56e78	ldp x20,x19,[sp], #0x20
00b56e7c	b 0x00c417f0
