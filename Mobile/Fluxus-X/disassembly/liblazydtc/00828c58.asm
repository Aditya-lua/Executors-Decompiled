; FUN_00828c58 @ 00828c58
00828c58	sub sp,sp,#0x70
00828c5c	stp x29,x30,[sp, #0x30]
00828c60	stp x24,x23,[sp, #0x40]
00828c64	stp x22,x21,[sp, #0x50]
00828c68	stp x20,x19,[sp, #0x60]
00828c6c	add x29,sp,#0x30
00828c70	mrs x22,tpidr_el0
00828c74	mov x21,x3
00828c78	mov x4,x2
00828c7c	ldr x8,[x22, #0x28]
00828c80	add x2,sp,#0x8
00828c84	mov x3,sp
00828c88	mov x19,x0
00828c8c	stur x8,[x29, #-0x8]
00828c90	bl 0x00828d84
00828c94	ldr x20,[x0]
00828c98	cbz x20,0x00828ca4
00828c9c	mov x1,xzr
00828ca0	b 0x00828d30
00828ca4	mov x23,x0
00828ca8	mov w0,#0x40
00828cac	add x24,x19,#0x8
00828cb0	bl 0x00c2fed0
00828cb4	mov x8,x21
00828cb8	ldr w9,[x21]
00828cbc	mov x20,x0
00828cc0	ldrb w10,[x8, #0x8]!
00828cc4	stp x0,x24,[sp, #0x10]
00828cc8	str xzr,[sp, #0x20]
00828ccc	str w9,[x0, #0x20]
00828cd0	tbnz w10,#0x0,0x00828ce8
00828cd4	ldr q0,[x8]
00828cd8	ldr x8,[x8, #0x10]
00828cdc	stur q0,[x20, #0x28]
00828ce0	stur x8,[x20, #0x38]
00828ce4	b 0x00828cf4
00828ce8	ldp x2,x1,[x21, #0x10]
00828cec	add x0,x20,#0x28
00828cf0	bl 0x007ff40c
00828cf4	ldr x8,[x19]
00828cf8	stp xzr,xzr,[x20]
00828cfc	ldr x9,[sp, #0x8]
00828d00	str x20,[x23]
00828d04	ldr x8,[x8]
00828d08	str x9,[x20, #0x10]
00828d0c	cbz x8,0x00828d14
00828d10	str x8,[x19]
00828d14	ldr x0,[x19, #0x8]
00828d18	mov x1,x20
00828d1c	bl 0x00825dfc
00828d20	ldr x8,[x19, #0x10]
00828d24	mov w1,#0x1
00828d28	add x8,x8,#0x1
00828d2c	str x8,[x19, #0x10]
00828d30	ldr x8,[x22, #0x28]
00828d34	ldur x9,[x29, #-0x8]
00828d38	cmp x8,x9
00828d3c	b.ne 0x00828d80
00828d40	mov x0,x20
00828d44	ldp x20,x19,[sp, #0x60]
00828d48	ldp x22,x21,[sp, #0x50]
00828d4c	ldp x24,x23,[sp, #0x40]
00828d50	ldp x29,x30,[sp, #0x30]
00828d54	add sp,sp,#0x70
00828d58	ret
00828d80	bl 0x00c2fec0
