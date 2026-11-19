; FUN_00bd1d38 @ 00bd1d38
00bd1d38	paciasp
00bd1d3c	sub sp,sp,#0x60
00bd1d40	stp x29,x30,[sp, #0x20]
00bd1d44	stp x24,x23,[sp, #0x30]
00bd1d48	stp x22,x21,[sp, #0x40]
00bd1d4c	stp x20,x19,[sp, #0x50]
00bd1d50	add x29,sp,#0x20
00bd1d54	mov x20,x1
00bd1d58	mov x19,x0
00bd1d5c	add x0,sp,#0x8
00bd1d60	mov x1,x19
00bd1d64	bl 0x00c43fa0
00bd1d68	ldrb w8,[sp, #0x8]
00bd1d6c	cmp w8,#0x1
00bd1d70	b.ne 0x00bd1e40
00bd1d74	ldr x8,[x19]
00bd1d78	ldur x9,[x8, #-0x18]
00bd1d7c	sub x8,x29,#0x8
00bd1d80	add x0,x19,x9
00bd1d84	bl 0x00c30070
00bd1d88	adrp x1,0xcb4000
00bd1d8c	sub x0,x29,#0x8
00bd1d90	ldr x1,[x1, #0xf40]
00bd1d94	bl 0x00c30080
00bd1d98	mov x21,x0
00bd1d9c	sub x0,x29,#0x8
00bd1da0	bl 0x00c30090
00bd1da4	ldr x8,[x19]
00bd1da8	ldur x8,[x8, #-0x18]
00bd1dac	add x2,x19,x8
00bd1db0	ldr w3,[x2, #0x90]
00bd1db4	ldr x22,[x2, #0x28]
00bd1db8	cmn w3,#0x1
00bd1dbc	b.ne 0x00bd1e08
00bd1dc0	sub x8,x29,#0x8
00bd1dc4	mov x0,x2
00bd1dc8	mov x24,x2
00bd1dcc	bl 0x00c30070
00bd1dd0	adrp x1,0xcb4000
00bd1dd4	sub x0,x29,#0x8
00bd1dd8	ldr x1,[x1, #0x998]
00bd1ddc	bl 0x00c30080
00bd1de0	ldr x8,[x0]
00bd1de4	ldr x8,[x8, #0x38]
00bd1de8	mov w1,#0x20
00bd1dec	blr x8
00bd1df0	mov w23,w0
00bd1df4	sub x0,x29,#0x8
00bd1df8	bl 0x00c30090
00bd1dfc	and w3,w23,#0xff
00bd1e00	mov x2,x24
00bd1e04	str w3,[x24, #0x90]
00bd1e08	ldr x8,[x21]
00bd1e0c	ldr x8,[x8, #0x50]
00bd1e10	mov x0,x21
00bd1e14	mov x1,x22
00bd1e18	mov x4,x20
00bd1e1c	blr x8
00bd1e20	cbnz x0,0x00bd1e40
00bd1e24	ldr x8,[x19]
00bd1e28	mov w9,#0x5
00bd1e2c	ldur x8,[x8, #-0x18]
00bd1e30	add x0,x19,x8
00bd1e34	ldr w8,[x0, #0x20]
00bd1e38	orr w1,w8,w9
00bd1e3c	bl 0x00c30130
00bd1e40	add x0,sp,#0x8
00bd1e44	bl 0x00c43fb0
00bd1e48	mov x0,x19
00bd1e4c	ldp x20,x19,[sp, #0x50]
00bd1e50	ldp x22,x21,[sp, #0x40]
00bd1e54	ldp x24,x23,[sp, #0x30]
00bd1e58	ldp x29,x30,[sp, #0x20]
00bd1e5c	add sp,sp,#0x60
00bd1e60	autiasp
00bd1e64	ret
