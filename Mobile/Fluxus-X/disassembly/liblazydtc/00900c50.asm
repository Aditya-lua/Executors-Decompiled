; cpr::DebugCallback::operator() @ 00900c50
00900c50	sub sp,sp,#0x50
00900c54	str x19,[sp, #0x30]
00900c58	stp x29,x30,[sp, #0x40]
00900c5c	add x29,sp,#0x40
00900c60	mrs x19,tpidr_el0
00900c64	ldr x8,[x19, #0x28]
00900c68	stur x8,[x29, #-0x18]
00900c6c	ldr x8,[x2, #0x10]
00900c70	str x8,[sp, #0x10]
00900c74	ldr q0,[x2]
00900c78	str q0,[sp]
00900c7c	stp xzr,xzr,[x2, #0x8]
00900c80	str xzr,[x2]
00900c84	ldr x8,[x0]
00900c88	stur w1,[x29, #-0x1c]
00900c8c	str x8,[sp, #0x18]
00900c90	ldr x0,[x0, #0x30]
00900c94	cbz x0,0x00900ce0
00900c98	ldr x8,[x0]
00900c9c	ldr x8,[x8, #0x30]
00900ca0	sub x1,x29,#0x1c
00900ca4	mov x2,sp
00900ca8	add x3,sp,#0x18
00900cac	blr x8
00900cb0	ldrb w8,[sp]
00900cb4	tbz w8,#0x0,0x00900cc0
00900cb8	ldr x0,[sp, #0x10]
00900cbc	bl 0x00c301d0
00900cc0	ldr x8,[x19, #0x28]
00900cc4	ldur x9,[x29, #-0x18]
00900cc8	cmp x8,x9
00900ccc	b.ne 0x00900d0c
00900cd0	ldp x29,x30,[sp, #0x40]
00900cd4	ldr x19,[sp, #0x30]
00900cd8	add sp,sp,#0x50
00900cdc	ret
00900ce0	mov w0,#0x8
00900ce4	bl 0x00c30000
00900ce8	adrp x8,0xcb4000
00900cec	ldr x8,[x8, #0xb50]
00900cf0	add x8,x8,#0x10
00900cf4	str x8,[x0]
00900cf8	adrp x1,0xcb4000
00900cfc	adrp x2,0xcb4000
00900d00	ldr x1,[x1, #0xb58]
00900d04	ldr x2,[x2, #0xb38]
00900d08	bl 0x00c30020
00900d0c	bl 0x00c2fec0
