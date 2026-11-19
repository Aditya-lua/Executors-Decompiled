; FUN_00bd5d64 @ 00bd5d64
00bd5d64	paciasp
00bd5d68	sub sp,sp,#0x60
00bd5d6c	stp x29,x30,[sp, #0x10]
00bd5d70	str x25,[sp, #0x20]
00bd5d74	stp x24,x23,[sp, #0x30]
00bd5d78	stp x22,x21,[sp, #0x40]
00bd5d7c	stp x20,x19,[sp, #0x50]
00bd5d80	add x29,sp,#0x10
00bd5d84	mov w20,w1
00bd5d88	mov x19,x0
00bd5d8c	mov x0,sp
00bd5d90	mov x1,x19
00bd5d94	bl 0x00c44040
00bd5d98	ldrb w8,[sp]
00bd5d9c	cmp w8,#0x1
00bd5da0	b.ne 0x00bd5e94
00bd5da4	ldr x8,[x19]
00bd5da8	ldur x8,[x8, #-0x18]
00bd5dac	add x0,x19,x8
00bd5db0	ldr w24,[x0, #0x8]
00bd5db4	add x8,x29,#0x18
00bd5db8	bl 0x00c30070
00bd5dbc	adrp x1,0xcb5000
00bd5dc0	add x0,x29,#0x18
00bd5dc4	ldr x1,[x1, #0xbb0]
00bd5dc8	bl 0x00c30080
00bd5dcc	mov x21,x0
00bd5dd0	add x0,x29,#0x18
00bd5dd4	bl 0x00c30090
00bd5dd8	ldr x8,[x19]
00bd5ddc	ldur x8,[x8, #-0x18]
00bd5de0	add x2,x19,x8
00bd5de4	ldr w3,[x2, #0x90]
00bd5de8	ldr x22,[x2, #0x28]
00bd5dec	cmn w3,#0x1
00bd5df0	b.ne 0x00bd5e3c
00bd5df4	add x8,x29,#0x18
00bd5df8	mov x0,x2
00bd5dfc	mov x25,x2
00bd5e00	bl 0x00c30070
00bd5e04	adrp x1,0xcb5000
00bd5e08	add x0,x29,#0x18
00bd5e0c	ldr x1,[x1, #0xb98]
00bd5e10	bl 0x00c30080
00bd5e14	ldr x8,[x0]
00bd5e18	ldr x8,[x8, #0x58]
00bd5e1c	mov w1,#0x20
00bd5e20	blr x8
00bd5e24	mov w23,w0
00bd5e28	add x0,x29,#0x18
00bd5e2c	bl 0x00c30090
00bd5e30	mov x2,x25
00bd5e34	mov w3,w23
00bd5e38	str w23,[x25, #0x90]
00bd5e3c	mov w8,#0x4a
00bd5e40	and w8,w24,w8
00bd5e44	cmp w8,#0x40
00bd5e48	b.eq 0x00bd5e54
00bd5e4c	cmp w8,#0x8
00bd5e50	b.ne 0x00bd5e5c
00bd5e54	and x4,x20,#0xffff
00bd5e58	b 0x00bd5e60
00bd5e5c	sxth x4,w20
00bd5e60	ldr x8,[x21]
00bd5e64	ldr x8,[x8, #0x20]
00bd5e68	mov x0,x21
00bd5e6c	mov x1,x22
00bd5e70	blr x8
00bd5e74	cbnz x0,0x00bd5e94
00bd5e78	ldr x8,[x19]
00bd5e7c	mov w9,#0x5
00bd5e80	ldur x8,[x8, #-0x18]
00bd5e84	add x0,x19,x8
00bd5e88	ldr w8,[x0, #0x20]
00bd5e8c	orr w1,w8,w9
00bd5e90	bl 0x00c30130
00bd5e94	mov x0,sp
00bd5e98	bl 0x00c44050
00bd5e9c	mov x0,x19
00bd5ea0	ldp x20,x19,[sp, #0x50]
00bd5ea4	ldr x25,[sp, #0x20]
00bd5ea8	ldp x22,x21,[sp, #0x40]
00bd5eac	ldp x24,x23,[sp, #0x30]
00bd5eb0	ldp x29,x30,[sp, #0x10]
00bd5eb4	add sp,sp,#0x60
00bd5eb8	autiasp
00bd5ebc	ret
