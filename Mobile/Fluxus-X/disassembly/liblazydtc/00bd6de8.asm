; FUN_00bd6de8 @ 00bd6de8
00bd6de8	paciasp
00bd6dec	sub sp,sp,#0x60
00bd6df0	stp x29,x30,[sp, #0x20]
00bd6df4	stp x24,x23,[sp, #0x30]
00bd6df8	stp x22,x21,[sp, #0x40]
00bd6dfc	stp x20,x19,[sp, #0x50]
00bd6e00	add x29,sp,#0x20
00bd6e04	mov x20,x1
00bd6e08	mov x19,x0
00bd6e0c	add x0,sp,#0x8
00bd6e10	mov x1,x19
00bd6e14	bl 0x00c44040
00bd6e18	ldrb w8,[sp, #0x8]
00bd6e1c	cmp w8,#0x1
00bd6e20	b.ne 0x00bd6ef0
00bd6e24	ldr x8,[x19]
00bd6e28	ldur x9,[x8, #-0x18]
00bd6e2c	sub x8,x29,#0x8
00bd6e30	add x0,x19,x9
00bd6e34	bl 0x00c30070
00bd6e38	adrp x1,0xcb5000
00bd6e3c	sub x0,x29,#0x8
00bd6e40	ldr x1,[x1, #0xbb0]
00bd6e44	bl 0x00c30080
00bd6e48	mov x21,x0
00bd6e4c	sub x0,x29,#0x8
00bd6e50	bl 0x00c30090
00bd6e54	ldr x8,[x19]
00bd6e58	ldur x8,[x8, #-0x18]
00bd6e5c	add x2,x19,x8
00bd6e60	ldr w3,[x2, #0x90]
00bd6e64	ldr x22,[x2, #0x28]
00bd6e68	cmn w3,#0x1
00bd6e6c	b.ne 0x00bd6eb8
00bd6e70	sub x8,x29,#0x8
00bd6e74	mov x0,x2
00bd6e78	mov x24,x2
00bd6e7c	bl 0x00c30070
00bd6e80	adrp x1,0xcb5000
00bd6e84	sub x0,x29,#0x8
00bd6e88	ldr x1,[x1, #0xb98]
00bd6e8c	bl 0x00c30080
00bd6e90	ldr x8,[x0]
00bd6e94	ldr x8,[x8, #0x58]
00bd6e98	mov w1,#0x20
00bd6e9c	blr x8
00bd6ea0	mov w23,w0
00bd6ea4	sub x0,x29,#0x8
00bd6ea8	bl 0x00c30090
00bd6eac	mov x2,x24
00bd6eb0	mov w3,w23
00bd6eb4	str w23,[x24, #0x90]
00bd6eb8	ldr x8,[x21]
00bd6ebc	ldr x8,[x8, #0x50]
00bd6ec0	mov x0,x21
00bd6ec4	mov x1,x22
00bd6ec8	mov x4,x20
00bd6ecc	blr x8
00bd6ed0	cbnz x0,0x00bd6ef0
00bd6ed4	ldr x8,[x19]
00bd6ed8	mov w9,#0x5
00bd6edc	ldur x8,[x8, #-0x18]
00bd6ee0	add x0,x19,x8
00bd6ee4	ldr w8,[x0, #0x20]
00bd6ee8	orr w1,w8,w9
00bd6eec	bl 0x00c30130
00bd6ef0	add x0,sp,#0x8
00bd6ef4	bl 0x00c44050
00bd6ef8	mov x0,x19
00bd6efc	ldp x20,x19,[sp, #0x50]
00bd6f00	ldp x22,x21,[sp, #0x40]
00bd6f04	ldp x24,x23,[sp, #0x30]
00bd6f08	ldp x29,x30,[sp, #0x20]
00bd6f0c	add sp,sp,#0x60
00bd6f10	autiasp
00bd6f14	ret
