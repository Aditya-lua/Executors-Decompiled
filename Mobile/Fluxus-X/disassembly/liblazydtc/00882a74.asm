; FUN_00882a74 @ 00882a74
00882a74	stp x29,x30,[sp, #-0x20]!
00882a78	str x19,[sp, #0x10]
00882a7c	mov x29,sp
00882a80	mov x19,x0
00882a84	ldr x0,[x0]
00882a88	cbz x0,0x00882ab8
00882a8c	bl 0x00c301d0
00882a90	ldr x0,[x19, #0x18]
00882a94	str xzr,[x19]
00882a98	bl 0x00c301d0
00882a9c	mov x0,xzr
00882aa0	stp xzr,xzr,[x19, #0x8]
00882aa4	str xzr,[x19, #0x18]
00882aa8	bl 0x00c301d0
00882aac	mov w8,#0x40
00882ab0	str xzr,[x19, #0x20]
00882ab4	strb w8,[x19, #0x30]
00882ab8	ldr x0,[x19, #0x18]
00882abc	ldr x19,[sp, #0x10]
00882ac0	ldp x29,x30,[sp], #0x20
00882ac4	b 0x00c301d0
