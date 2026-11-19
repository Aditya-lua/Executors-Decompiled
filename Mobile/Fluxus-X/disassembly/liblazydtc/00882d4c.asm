; FUN_00882d4c @ 00882d4c
00882d4c	stp x29,x30,[sp, #-0x20]!
00882d50	str x19,[sp, #0x10]
00882d54	mov x29,sp
00882d58	mov x19,x0
00882d5c	ldr x0,[x0]
00882d60	cbz x0,0x00882d90
00882d64	bl 0x00c301d0
00882d68	ldr x0,[x19, #0x18]
00882d6c	str xzr,[x19]
00882d70	bl 0x00c301d0
00882d74	mov x0,xzr
00882d78	stp xzr,xzr,[x19, #0x8]
00882d7c	str xzr,[x19, #0x18]
00882d80	bl 0x00c301d0
00882d84	mov w8,#0x40
00882d88	str xzr,[x19, #0x20]
00882d8c	strb w8,[x19, #0x30]
00882d90	ldr x0,[x19, #0x18]
00882d94	ldr x19,[sp, #0x10]
00882d98	ldp x29,x30,[sp], #0x20
00882d9c	b 0x00c301d0
