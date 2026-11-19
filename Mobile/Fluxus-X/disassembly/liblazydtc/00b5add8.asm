; FUN_00b5add8 @ 00b5add8
00b5add8	stp x20,x19,[sp, #-0x20]!
00b5addc	stp x29,x30,[sp, #0x10]
00b5ade0	ldr x20,[x0, #0xf8]
00b5ade4	mov x19,x0
00b5ade8	mov w1,#0x40
00b5adec	add x29,sp,#0x10
00b5adf0	add x0,x20,#0x28
00b5adf4	bl 0x00c34750
00b5adf8	add x0,x20,#0x68
00b5adfc	mov w1,#0x40
00b5ae00	bl 0x00c34750
00b5ae04	ldp x29,x30,[sp, #0x10]
00b5ae08	mov x0,x19
00b5ae0c	ldp x20,x19,[sp], #0x20
00b5ae10	b 0x00c417f0
