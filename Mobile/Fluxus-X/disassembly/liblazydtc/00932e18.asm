; FUN_00932e18 @ 00932e18
00932e18	sub sp,sp,#0x50
00932e1c	str x21,[sp, #0x20]
00932e20	stp x20,x19,[sp, #0x30]
00932e24	stp x29,x30,[sp, #0x40]
00932e28	add x29,sp,#0x40
00932e2c	mrs x21,tpidr_el0
00932e30	ldr x8,[x21, #0x28]
00932e34	mov x20,x3
00932e38	add x3,sp,#0x10
00932e3c	add x4,sp,#0xc
00932e40	mov x19,x0
00932e44	str x8,[sp, #0x18]
00932e48	bl 0x00935b84
00932e4c	str w0,[x20]
00932e50	cbz w0,0x00932e5c
00932e54	mov x0,#-0x1
00932e58	b 0x00932e78
00932e5c	ldrb w8,[sp, #0xc]
00932e60	cbz w8,0x00932e74
00932e64	add x8,x19,#0x1b1
00932e68	ldr w9,[x8]
00932e6c	orr w9,w9,#0x20
00932e70	str w9,[x8]
00932e74	ldr x0,[sp, #0x10]
00932e78	ldr x8,[x21, #0x28]
00932e7c	ldr x9,[sp, #0x18]
00932e80	cmp x8,x9
00932e84	b.ne 0x00932e9c
00932e88	ldp x29,x30,[sp, #0x40]
00932e8c	ldp x20,x19,[sp, #0x30]
00932e90	ldr x21,[sp, #0x20]
00932e94	add sp,sp,#0x50
00932e98	ret
00932e9c	bl 0x00c2fec0
