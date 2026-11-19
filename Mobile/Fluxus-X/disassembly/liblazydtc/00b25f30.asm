; FUN_00b25f30 @ 00b25f30
00b25f30	stp x20,x19,[sp, #-0x20]!
00b25f34	mov x20,x0
00b25f38	mov x19,x1
00b25f3c	orr w2,wzr,#0x78
00b25f40	mov x0,x1
00b25f44	mov x1,x20
00b25f48	stp x29,x30,[sp, #0x10]
00b25f4c	add x29,sp,#0x10
00b25f50	bl 0x00c2ffd0
00b25f54	add x0,x19,#0x18
00b25f58	add x1,x20,#0x18
00b25f5c	stp xzr,xzr,[x19, #0x40]
00b25f60	str xzr,[x19, #0x38]
00b25f64	bl 0x00c3eda0
00b25f68	cbz w0,0x00b25f88
00b25f6c	ldr x0,[x19, #0x60]
00b25f70	cbz x0,0x00b25f78
00b25f74	bl 0x00c357e0
00b25f78	ldr x0,[x19, #0x58]
00b25f7c	cbz x0,0x00b25f84
00b25f80	bl 0x00c357e0
00b25f84	mov w0,#0x1
00b25f88	ldp x29,x30,[sp, #0x10]
00b25f8c	ldp x20,x19,[sp], #0x20
00b25f90	ret
