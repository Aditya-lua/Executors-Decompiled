; FUN_00959e24 @ 00959e24
00959e24	sub sp,sp,#0x60
00959e28	str x21,[sp, #0x30]
00959e2c	stp x20,x19,[sp, #0x40]
00959e30	stp x29,x30,[sp, #0x50]
00959e34	add x29,sp,#0x50
00959e38	mrs x21,tpidr_el0
00959e3c	ldr x8,[x21, #0x28]
00959e40	mov x20,x1
00959e44	mov x1,x0
00959e48	adrp x0,0xcb4000
00959e4c	str x8,[sp, #0x28]
00959e50	ldr x8,[x2]
00959e54	mov x19,x3
00959e58	mov w2,#0x10
00959e5c	add x3,sp,#0x18
00959e60	str x8,[sp, #0x18]
00959e64	ldr x8,[x20]
00959e68	mov w4,#0x10
00959e6c	add x5,sp,#0x8
00959e70	str x8,[sp, #0x20]
00959e74	ldr x0,[x0, #0xe58]
00959e78	bl 0x00923334
00959e7c	cbnz w0,0x00959e90
00959e80	ldur q0,[sp, #0x8]
00959e84	str q0,[x19]
00959e88	ldr x8,[x20]
00959e8c	str x8,[x19, #0x10]
00959e90	ldr x8,[x21, #0x28]
00959e94	ldr x9,[sp, #0x28]
00959e98	cmp x8,x9
00959e9c	b.ne 0x00959eb4
00959ea0	ldp x29,x30,[sp, #0x50]
00959ea4	ldp x20,x19,[sp, #0x40]
00959ea8	ldr x21,[sp, #0x30]
00959eac	add sp,sp,#0x60
00959eb0	ret
00959eb4	bl 0x00c2fec0
