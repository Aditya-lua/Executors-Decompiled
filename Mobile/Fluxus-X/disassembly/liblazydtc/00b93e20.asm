; FUN_00b93e20 @ 00b93e20
00b93e20	sub sp,sp,#0x60
00b93e24	stp x24,x23,[sp, #0x20]
00b93e28	stp x22,x21,[sp, #0x30]
00b93e2c	stp x20,x19,[sp, #0x40]
00b93e30	stp x29,x30,[sp, #0x50]
00b93e34	add x29,sp,#0x50
00b93e38	mrs x24,tpidr_el0
00b93e3c	ldr x8,[x24, #0x28]
00b93e40	add x19,x1,#0x20
00b93e44	mov x21,x1
00b93e48	mov x20,x0
00b93e4c	mov x0,x19
00b93e50	mov x1,xzr
00b93e54	str x8,[sp, #0x18]
00b93e58	bl 0x00c41b40
00b93e5c	cbz w0,0x00b93f10
00b93e60	add x0,sp,#0x8
00b93e64	bl 0x00c41c00
00b93e68	add x2,x20,#0x8
00b93e6c	add x0,sp,#0x8
00b93e70	mov x1,x19
00b93e74	bl 0x00c41c10
00b93e78	mov w23,w0
00b93e7c	cbnz w0,0x00b93f04
00b93e80	add x22,x21,#0x10
00b93e84	add x3,sp,#0x8
00b93e88	mov x0,x20
00b93e8c	mov x1,x22
00b93e90	mov x2,x22
00b93e94	bl 0x00b953d4
00b93e98	mov w23,w0
00b93e9c	cbnz w0,0x00b93f04
00b93ea0	add x1,sp,#0x8
00b93ea4	add x2,sp,#0x8
00b93ea8	add x3,sp,#0x8
00b93eac	mov x0,x20
00b93eb0	bl 0x00b953d4
00b93eb4	mov w23,w0
00b93eb8	cbnz w0,0x00b93f04
00b93ebc	add x3,sp,#0x8
00b93ec0	mov x0,x20
00b93ec4	mov x1,x21
00b93ec8	mov x2,x21
00b93ecc	bl 0x00b953d4
00b93ed0	mov w23,w0
00b93ed4	cbnz w0,0x00b93f04
00b93ed8	add x3,sp,#0x8
00b93edc	mov x0,x20
00b93ee0	mov x1,x22
00b93ee4	mov x2,x22
00b93ee8	bl 0x00b953d4
00b93eec	mov w23,w0
00b93ef0	cbnz w0,0x00b93f04
00b93ef4	mov w1,#0x1
00b93ef8	mov x0,x19
00b93efc	bl 0x00c41c40
00b93f00	mov w23,w0
00b93f04	add x0,sp,#0x8
00b93f08	bl 0x00c41bb0
00b93f0c	b 0x00b93f14
00b93f10	mov w23,wzr
00b93f14	ldr x8,[x24, #0x28]
00b93f18	ldr x9,[sp, #0x18]
00b93f1c	cmp x8,x9
00b93f20	b.ne 0x00b93f40
00b93f24	mov w0,w23
00b93f28	ldp x29,x30,[sp, #0x50]
00b93f2c	ldp x20,x19,[sp, #0x40]
00b93f30	ldp x22,x21,[sp, #0x30]
00b93f34	ldp x24,x23,[sp, #0x20]
00b93f38	add sp,sp,#0x60
00b93f3c	ret
00b93f40	bl 0x00c2fec0
