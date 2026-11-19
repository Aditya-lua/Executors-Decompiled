; FUN_00873b4c @ 00873b4c
00873b4c	stp x29,x30,[sp, #-0x20]!
00873b50	str x19,[sp, #0x10]
00873b54	mov x29,sp
00873b58	mov x19,x0
00873b5c	ldr x0,[x0]
00873b60	cbz x0,0x00873b90
00873b64	bl 0x00c301d0
00873b68	ldr x0,[x19, #0x18]
00873b6c	str xzr,[x19]
00873b70	bl 0x00c301d0
00873b74	mov x0,xzr
00873b78	stp xzr,xzr,[x19, #0x8]
00873b7c	str xzr,[x19, #0x18]
00873b80	bl 0x00c301d0
00873b84	mov w8,#0x40
00873b88	str xzr,[x19, #0x20]
00873b8c	strb w8,[x19, #0x30]
00873b90	ldr x0,[x19, #0x18]
00873b94	ldr x19,[sp, #0x10]
00873b98	ldp x29,x30,[sp], #0x20
00873b9c	b 0x00c301d0
