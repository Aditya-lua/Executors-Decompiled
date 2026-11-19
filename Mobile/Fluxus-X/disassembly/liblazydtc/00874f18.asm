; FUN_00874f18 @ 00874f18
00874f18	sub sp,sp,#0x80
00874f1c	stp x29,x30,[sp, #0x60]
00874f20	str x19,[sp, #0x70]
00874f24	add x29,sp,#0x60
00874f28	mrs x19,tpidr_el0
00874f2c	movi v1.2D,#0x0
00874f30	add x1,sp,#0x8
00874f34	ldr x8,[x19, #0x28]
00874f38	add x2,sp,#0x30
00874f3c	stur x8,[x29, #-0x8]
00874f40	mov w8,#0x2
00874f44	str xzr,[sp, #0x50]
00874f48	stp q1,q1,[sp, #0x30]
00874f4c	str w8,[sp, #0x30]
00874f50	str d0,[sp, #0x38]
00874f54	str w8,[sp, #0x8]
00874f58	stp xzr,xzr,[sp, #0x20]
00874f5c	str xzr,[sp, #0x18]
00874f60	str d0,[sp, #0x10]
00874f64	bl 0x00874b84
00874f68	ldr x8,[x19, #0x28]
00874f6c	ldur x9,[x29, #-0x8]
00874f70	cmp x8,x9
00874f74	b.ne 0x00874f88
00874f78	ldp x29,x30,[sp, #0x60]
00874f7c	ldr x19,[sp, #0x70]
00874f80	add sp,sp,#0x80
00874f84	ret
00874f88	bl 0x00c2fec0
