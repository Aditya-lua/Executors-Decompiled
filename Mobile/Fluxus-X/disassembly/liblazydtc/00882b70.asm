; FUN_00882b70 @ 00882b70
00882b70	stp x29,x30,[sp, #-0x20]!
00882b74	str x19,[sp, #0x10]
00882b78	mov x29,sp
00882b7c	mov x19,x0
00882b80	ldr x0,[x0]
00882b84	cbz x0,0x00882bb4
00882b88	bl 0x00c301d0
00882b8c	ldr x0,[x19, #0x18]
00882b90	str xzr,[x19]
00882b94	bl 0x00c301d0
00882b98	mov x0,xzr
00882b9c	stp xzr,xzr,[x19, #0x8]
00882ba0	str xzr,[x19, #0x18]
00882ba4	bl 0x00c301d0
00882ba8	mov w8,#0x40
00882bac	str xzr,[x19, #0x20]
00882bb0	strb w8,[x19, #0x30]
00882bb4	ldr x0,[x19, #0x18]
00882bb8	ldr x19,[sp, #0x10]
00882bbc	ldp x29,x30,[sp], #0x20
00882bc0	b 0x00c301d0
