; FUN_00850d78 @ 00850d78
00850d78	stp x29,x30,[sp, #-0x30]!
00850d7c	stp x22,x21,[sp, #0x10]
00850d80	stp x20,x19,[sp, #0x20]
00850d84	mov x29,sp
00850d88	ldr x8,[x1]
00850d8c	mov x20,x0
00850d90	mov x19,x1
00850d94	mov x0,x1
00850d98	mov x1,x20
00850d9c	ldr x8,[x8, #0x1a8]
00850da0	blr x8
00850da4	tbz w0,#0x0,0x00850e0c
00850da8	ldr x8,[x20, #0x58]
00850dac	cbz x8,0x00850dd4
00850db0	ldr x21,[x20, #0x50]
00850db4	lsl x22,x8,#0x3
00850db8	ldr x0,[x21], #0x8
00850dbc	mov x1,x19
00850dc0	ldr x8,[x0]
00850dc4	ldr x8,[x8]
00850dc8	blr x8
00850dcc	subs x22,x22,#0x8
00850dd0	b.ne 0x00850db8
00850dd4	ldr x0,[x20, #0x60]
00850dd8	cbz x0,0x00850dec
00850ddc	ldr x8,[x0]
00850de0	mov x1,x19
00850de4	ldr x8,[x8]
00850de8	blr x8
00850dec	ldr x0,[x20, #0x78]
00850df0	ldr x8,[x0]
00850df4	ldr x2,[x8]
00850df8	mov x1,x19
00850dfc	ldp x20,x19,[sp, #0x20]
00850e00	ldp x22,x21,[sp, #0x10]
00850e04	ldp x29,x30,[sp], #0x30
00850e08	br x2
00850e0c	ldp x20,x19,[sp, #0x20]
00850e10	ldp x22,x21,[sp, #0x10]
00850e14	ldp x29,x30,[sp], #0x30
00850e18	ret
