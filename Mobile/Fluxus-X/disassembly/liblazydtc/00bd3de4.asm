; FUN_00bd3de4 @ 00bd3de4
00bd3de4	paciasp
00bd3de8	sub sp,sp,#0x30
00bd3dec	stp x29,x30,[sp, #0x10]
00bd3df0	stp x20,x19,[sp, #0x20]
00bd3df4	add x29,sp,#0x10
00bd3df8	mov x19,x0
00bd3dfc	mov x20,x1
00bd3e00	add x0,sp,#0x8
00bd3e04	mov x1,x19
00bd3e08	mov w2,wzr
00bd3e0c	stur wzr,[x29, #-0x4]
00bd3e10	bl 0x00c44060
00bd3e14	ldrb w8,[sp, #0x8]
00bd3e18	cmp w8,#0x1
00bd3e1c	b.ne 0x00bd3e90
00bd3e20	ldr x8,[x19]
00bd3e24	ldur x9,[x8, #-0x18]
00bd3e28	mov x8,sp
00bd3e2c	add x0,x19,x9
00bd3e30	bl 0x00c30070
00bd3e34	adrp x1,0xcb5000
00bd3e38	mov x0,sp
00bd3e3c	ldr x1,[x1, #0xba0]
00bd3e40	bl 0x00c30080
00bd3e44	ldr x8,[x19]
00bd3e48	ldr x9,[x0]
00bd3e4c	ldur x8,[x8, #-0x18]
00bd3e50	add x3,x19,x8
00bd3e54	ldr x8,[x9, #0x48]
00bd3e58	ldr x1,[x3, #0x28]
00bd3e5c	sub x4,x29,#0x4
00bd3e60	mov x2,xzr
00bd3e64	mov x5,x20
00bd3e68	blr x8
00bd3e6c	mov x0,sp
00bd3e70	bl 0x00c30090
00bd3e74	ldr x8,[x19]
00bd3e78	ldur x8,[x8, #-0x18]
00bd3e7c	add x0,x19,x8
00bd3e80	ldur w8,[x29, #-0x4]
00bd3e84	ldr w9,[x0, #0x20]
00bd3e88	orr w1,w9,w8
00bd3e8c	bl 0x00c30130
00bd3e90	mov x0,x19
00bd3e94	ldp x20,x19,[sp, #0x20]
00bd3e98	ldp x29,x30,[sp, #0x10]
00bd3e9c	add sp,sp,#0x30
00bd3ea0	autiasp
00bd3ea4	ret
