; FUN_00b5a994 @ 00b5a994
00b5a994	stp x20,x19,[sp, #-0x20]!
00b5a998	stp x29,x30,[sp, #0x10]
00b5a99c	ldr x20,[x0, #0xf8]
00b5a9a0	mov x19,x0
00b5a9a4	mov w1,#0x40
00b5a9a8	add x29,sp,#0x10
00b5a9ac	add x0,x20,#0x28
00b5a9b0	bl 0x00c34750
00b5a9b4	add x0,x20,#0x68
00b5a9b8	mov w1,#0x40
00b5a9bc	bl 0x00c34750
00b5a9c0	ldp x29,x30,[sp, #0x10]
00b5a9c4	mov x0,x19
00b5a9c8	ldp x20,x19,[sp], #0x20
00b5a9cc	b 0x00c417f0
