; FUN_00b5a1b0 @ 00b5a1b0
00b5a1b0	stp x20,x19,[sp, #-0x20]!
00b5a1b4	stp x29,x30,[sp, #0x10]
00b5a1b8	ldr x20,[x0, #0xf8]
00b5a1bc	mov x19,x0
00b5a1c0	mov w1,#0x6f
00b5a1c4	add x29,sp,#0x10
00b5a1c8	add x0,x20,#0x28
00b5a1cc	bl 0x00c34750
00b5a1d0	add x0,x20,#0x97
00b5a1d4	mov w1,#0x6f
00b5a1d8	bl 0x00c34750
00b5a1dc	add x0,x20,#0x106
00b5a1e0	mov w1,#0x6f
00b5a1e4	bl 0x00c34750
00b5a1e8	ldp x29,x30,[sp, #0x10]
00b5a1ec	mov x0,x19
00b5a1f0	ldp x20,x19,[sp], #0x20
00b5a1f4	b 0x00c417f0
