; FUN_00857d50 @ 00857d50
00857d50	stp x29,x30,[sp, #-0x40]!
00857d54	str x23,[sp, #0x10]
00857d58	stp x22,x21,[sp, #0x20]
00857d5c	stp x20,x19,[sp, #0x30]
00857d60	mov x29,sp
00857d64	ldp x9,x8,[x0, #0x1b8]
00857d68	mov x19,x0
00857d6c	sub x20,x8,x9
00857d70	bl 0x00859498
00857d74	ldp x9,x8,[x19, #0x1b8]
00857d78	ubfx x21,x20,#0x3,#0x20
00857d7c	mov x20,x0
00857d80	sub x8,x8,x9
00857d84	asr x8,x8,#0x3
00857d88	cmp x8,x21
00857d8c	b.ls 0x00857dc8
00857d90	ldr x9,[x19, #0x1b8]
00857d94	add x0,x19,#0x180
00857d98	sub x23,x8,#0x1
00857d9c	add x9,x9,x8, LSL #0x3
00857da0	ldur x1,[x9, #-0x8]
00857da4	ldr x22,[x1, #0x18]
00857da8	bl 0x0086e18c
00857dac	cmp x23,x21
00857db0	mov x8,x23
00857db4	str x22,[x0]
00857db8	b.hi 0x00857d90
00857dbc	ldp x9,x8,[x19, #0x1b8]
00857dc0	sub x8,x8,x9
00857dc4	asr x8,x8,#0x3
00857dc8	subs x1,x21,x8
00857dcc	b.ls 0x00857ddc
00857dd0	add x0,x19,#0x1b8
00857dd4	bl 0x00870174
00857dd8	b 0x00857de8
00857ddc	b.cs 0x00857de8
00857de0	add x8,x9,x21, LSL #0x3
00857de4	str x8,[x19, #0x1c0]
00857de8	ldr w8,[x19, #0x90]
00857dec	cbz w8,0x00857e00
00857df0	mov x0,x19
00857df4	mov w1,wzr
00857df8	mov x2,xzr
00857dfc	bl 0x00859330
00857e00	mov x0,x20
00857e04	ldp x20,x19,[sp, #0x30]
00857e08	ldr x23,[sp, #0x10]
00857e0c	ldp x22,x21,[sp, #0x20]
00857e10	ldp x29,x30,[sp], #0x40
00857e14	ret
