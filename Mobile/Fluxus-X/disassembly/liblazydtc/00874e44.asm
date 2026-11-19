; FUN_00874e44 @ 00874e44
00874e44	sub sp,sp,#0x80
00874e48	stp x29,x30,[sp, #0x60]
00874e4c	str x19,[sp, #0x70]
00874e50	add x29,sp,#0x60
00874e54	movi v0.2D,#0x0
00874e58	mrs x19,tpidr_el0
00874e5c	add x1,sp,#0x8
00874e60	ldr x8,[x19, #0x28]
00874e64	add x2,sp,#0x30
00874e68	stur x8,[x29, #-0x8]
00874e6c	str xzr,[sp, #0x50]
00874e70	str wzr,[sp, #0x8]
00874e74	stp q0,q0,[sp, #0x10]
00874e78	stp q0,q0,[sp, #0x30]
00874e7c	bl 0x00874b84
00874e80	ldr x8,[x19, #0x28]
00874e84	ldur x9,[x29, #-0x8]
00874e88	cmp x8,x9
00874e8c	b.ne 0x00874ea0
00874e90	ldp x29,x30,[sp, #0x60]
00874e94	ldr x19,[sp, #0x70]
00874e98	add sp,sp,#0x80
00874e9c	ret
00874ea0	bl 0x00c2fec0
