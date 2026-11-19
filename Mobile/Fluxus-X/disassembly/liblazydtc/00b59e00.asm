; FUN_00b59e00 @ 00b59e00
00b59e00	stp x20,x19,[sp, #-0x20]!
00b59e04	stp x29,x30,[sp, #0x10]
00b59e08	ldr x20,[x0, #0xf8]
00b59e0c	mov x19,x0
00b59e10	mov w1,#0x6f
00b59e14	add x29,sp,#0x10
00b59e18	add x0,x20,#0x28
00b59e1c	bl 0x00c34750
00b59e20	add x0,x20,#0x97
00b59e24	mov w1,#0x6f
00b59e28	bl 0x00c34750
00b59e2c	add x0,x20,#0x106
00b59e30	mov w1,#0x6f
00b59e34	bl 0x00c34750
00b59e38	ldp x29,x30,[sp, #0x10]
00b59e3c	mov x0,x19
00b59e40	ldp x20,x19,[sp], #0x20
00b59e44	b 0x00c417f0
