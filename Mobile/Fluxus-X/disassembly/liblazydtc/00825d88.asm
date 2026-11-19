; FUN_00825d88 @ 00825d88
00825d88	stp x29,x30,[sp, #-0x20]!
00825d8c	str x19,[sp, #0x10]
00825d90	mov x29,sp
00825d94	ldr x19,[x0]
00825d98	str xzr,[x0]
00825d9c	cbz x19,0x00825df0
00825da0	ldrb w8,[x0, #0x10]
00825da4	cmp w8,#0x1
00825da8	b.ne 0x00825ddc
00825dac	ldrb w8,[x19, #0x38]
00825db0	tbz w8,#0x0,0x00825dc4
00825db4	ldr x8,[x19, #0x38]
00825db8	ldr x0,[x19, #0x48]
00825dbc	and x1,x8,#-0x2
00825dc0	bl 0x00c2fe80
00825dc4	ldrb w8,[x19, #0x20]
00825dc8	tbz w8,#0x0,0x00825ddc
00825dcc	ldr x8,[x19, #0x20]
00825dd0	ldr x0,[x19, #0x30]
00825dd4	and x1,x8,#-0x2
00825dd8	bl 0x00c2fe80
00825ddc	mov x0,x19
00825de0	mov w1,#0x50
00825de4	ldr x19,[sp, #0x10]
00825de8	ldp x29,x30,[sp], #0x20
00825dec	b 0x00c2fe80
00825df0	ldr x19,[sp, #0x10]
00825df4	ldp x29,x30,[sp], #0x20
00825df8	ret
