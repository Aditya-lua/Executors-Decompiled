; FUN_00a11ef0 @ 00a11ef0
00a11ef0	str x27,[sp, #-0x60]!
00a11ef4	stp x20,x19,[sp, #0x40]
00a11ef8	adrp x20,0xd21000
00a11efc	ldr x0,[x20, #0x968]
00a11f00	stp x26,x25,[sp, #0x10]
00a11f04	stp x24,x23,[sp, #0x20]
00a11f08	stp x22,x21,[sp, #0x30]
00a11f0c	stp x29,x30,[sp, #0x50]
00a11f10	add x29,sp,#0x50
00a11f14	cbz x0,0x00a11fe4
00a11f18	adrp x21,0xd21000
00a11f1c	ldr x8,[x21, #0x970]
00a11f20	cbz x8,0x00a11fcc
00a11f24	adrp x19,0x2ab000
00a11f28	mov x22,xzr
00a11f2c	orr w23,wzr,#0x18
00a11f30	add x19,x19,#0xe93
00a11f34	b 0x00a11f40
00a11f38	ldr x0,[x20, #0x968]
00a11f3c	nop
00a11f40	madd x24,x22,x23,x0
00a11f44	ldr x0,[x24]
00a11f48	mov w2,#0x31
00a11f4c	mov x1,x19
00a11f50	bl 0x00c32310
00a11f54	ldr x8,[x24, #0x10]!
00a11f58	mov x25,x24
00a11f5c	ldr x0,[x25, #-0x8]!
00a11f60	cbz x8,0x00a11fac
00a11f64	mov x26,xzr
00a11f68	mov x27,xzr
00a11f6c	ldr x0,[x0, x26#0x0]
00a11f70	mov w2,#0x33
00a11f74	mov x1,x19
00a11f78	bl 0x00c32310
00a11f7c	ldr x8,[x25]
00a11f80	mov w2,#0x34
00a11f84	mov x1,x19
00a11f88	add x8,x8,x26
00a11f8c	ldr x0,[x8, #0x8]
00a11f90	bl 0x00c32310
00a11f94	ldr x8,[x24]
00a11f98	ldr x0,[x25]
00a11f9c	add x27,x27,#0x1
00a11fa0	add x26,x26,#0x10
00a11fa4	cmp x27,x8
00a11fa8	b.cc 0x00a11f6c
00a11fac	mov w2,#0x36
00a11fb0	mov x1,x19
00a11fb4	bl 0x00c32310
00a11fb8	ldr x8,[x21, #0x970]
00a11fbc	add x22,x22,#0x1
00a11fc0	cmp x22,x8
00a11fc4	b.cc 0x00a11f38
00a11fc8	ldr x0,[x20, #0x968]
00a11fcc	adrp x1,0x2ab000
00a11fd0	add x1,x1,#0xe93
00a11fd4	orr w2,wzr,#0x38
00a11fd8	bl 0x00c32310
00a11fdc	str xzr,[x20, #0x968]
00a11fe0	str xzr,[x21, #0x970]
00a11fe4	ldp x29,x30,[sp, #0x50]
00a11fe8	ldp x20,x19,[sp, #0x40]
00a11fec	ldp x22,x21,[sp, #0x30]
00a11ff0	ldp x24,x23,[sp, #0x20]
00a11ff4	ldp x26,x25,[sp, #0x10]
00a11ff8	ldr x27,[sp], #0x60
00a11ffc	ret
