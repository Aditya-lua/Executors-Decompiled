; FUN_00bd8de0 @ 00bd8de0
00bd8de0	paciasp
00bd8de4	stp x29,x30,[sp, #-0x40]!
00bd8de8	str x23,[sp, #0x10]
00bd8dec	stp x22,x21,[sp, #0x20]
00bd8df0	stp x20,x19,[sp, #0x30]
00bd8df4	mov x29,sp
00bd8df8	adrp x8,0xcb4000
00bd8dfc	mov x20,x0
00bd8e00	mov x19,x0
00bd8e04	ldr x8,[x8, #0xa08]
00bd8e08	mov x21,x1
00bd8e0c	add x22,x8,#0x10
00bd8e10	str x22,[x20, #0xa8]!
00bd8e14	add x0,x20,#0x8
00bd8e18	add x23,x20,#0x68
00bd8e1c	str xzr,[x20, #0x68]
00bd8e20	bl 0x00c30480
00bd8e24	movi v0.2D,#0x0
00bd8e28	adrp x8,0xcad000
00bd8e2c	add x8,x8,#0x2d0
00bd8e30	str x8,[x20]
00bd8e34	mov w8,#0xffffffff
00bd8e38	add x0,x29,#0x18
00bd8e3c	add x1,x20,#0x8
00bd8e40	str x21,[x20, #0x40]
00bd8e44	str x23,[x20, #0x50]
00bd8e48	stp q0,q0,[x20, #0x20]
00bd8e4c	str q0,[x20, #0x10]
00bd8e50	str w8,[x20, #0x5c]
00bd8e54	strb wzr,[x20, #0x60]
00bd8e58	bl 0x00c30660
00bd8e5c	ldr x8,[x20]
00bd8e60	ldr x8,[x8, #0x10]
00bd8e64	add x1,x29,#0x18
00bd8e68	mov x0,x20
00bd8e6c	blr x8
00bd8e70	add x0,x29,#0x18
00bd8e74	bl 0x00c30090
00bd8e78	adrp x8,0xcb5000
00bd8e7c	mov x21,x19
00bd8e80	ldr x8,[x8, #0xb68]
00bd8e84	str xzr,[x19, #0x40]
00bd8e88	add x9,x8,#0x40
00bd8e8c	add x8,x8,#0x18
00bd8e90	str x9,[x21, #0x10]!
00bd8e94	stp x8,xzr,[x19]
00bd8e98	mov x0,x21
00bd8e9c	mov x1,x20
00bd8ea0	bl 0x00c30100
00bd8ea4	mov w8,#0xffffffff
00bd8ea8	str xzr,[x19, #0x98]
00bd8eac	str w8,[x19, #0xa0]
00bd8eb0	ldp x20,x19,[sp, #0x30]
00bd8eb4	ldr x23,[sp, #0x10]
00bd8eb8	ldp x22,x21,[sp, #0x20]
00bd8ebc	ldp x29,x30,[sp], #0x40
00bd8ec0	autiasp
00bd8ec4	ret
