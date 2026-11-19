; FUN_00b9ee70 @ 00b9ee70
00b9ee70	sub sp,sp,#0x60
00b9ee74	str x23,[sp, #0x20]
00b9ee78	stp x22,x21,[sp, #0x30]
00b9ee7c	stp x20,x19,[sp, #0x40]
00b9ee80	stp x29,x30,[sp, #0x50]
00b9ee84	add x29,sp,#0x50
00b9ee88	mrs x23,tpidr_el0
00b9ee8c	ldr x8,[x23, #0x28]
00b9ee90	mov x20,x1
00b9ee94	mov x22,x0
00b9ee98	add x0,sp,#0x8
00b9ee9c	mov w1,#0x10
00b9eea0	mov x19,x2
00b9eea4	str x8,[sp, #0x18]
00b9eea8	bl 0x00c42220
00b9eeac	ldr x8,[x22]
00b9eeb0	cbz x8,0x00b9eec0
00b9eeb4	ldr w8,[x8, #0x8]
00b9eeb8	and x21,x8,#0x1f
00b9eebc	b 0x00b9eec4
00b9eec0	mov x21,xzr
00b9eec4	add x1,sp,#0x8
00b9eec8	add x3,sp,#0x8
00b9eecc	mov x4,sp
00b9eed0	mov x0,x22
00b9eed4	mov x2,x21
00b9eed8	bl 0x00c42180
00b9eedc	mov w22,w0
00b9eee0	cbnz w0,0x00b9efe8
00b9eee4	cmp w21,#0x10
00b9eee8	b.eq 0x00b9eefc
00b9eeec	cmp w21,#0x8
00b9eef0	b.ne 0x00b9ef80
00b9eef4	mov w10,#0x1b
00b9eef8	b 0x00b9ef00
00b9eefc	mov w10,#0x87
00b9ef00	sub x8,x21,#0x4
00b9ef04	mov w9,wzr
00b9ef08	add x11,sp,#0x8
00b9ef0c	mov x12,x8
00b9ef10	ldr w13,[x11, x12#0x0]
00b9ef14	add x14,x12,#0x4
00b9ef18	sub x15,x12,#0x4
00b9ef1c	cmp x14,#0x7
00b9ef20	rev w13,w13
00b9ef24	orr w9,w9,w13, LSL #0x1
00b9ef28	lsr w13,w13,#0x1f
00b9ef2c	rev w9,w9
00b9ef30	str w9,[x20, x12#0x0]
00b9ef34	mov x12,x15
00b9ef38	mov w9,w13
00b9ef3c	b.gt 0x00b9ef10
00b9ef40	ldrb w11,[sp, #0x8]
00b9ef44	sub x9,x21,#0x1
00b9ef48	cmp w21,#0x10
00b9ef4c	lsr w11,w11,#0x7
00b9ef50	neg x12,x11
00b9ef54	orr x11,x12,x11
00b9ef58	asr x11,x11,#0x3f
00b9ef5c	ldrb w12,[x20, x9]
00b9ef60	and w10,w10,w11
00b9ef64	eor w10,w10,w12
00b9ef68	strb w10,[x20, x9]
00b9ef6c	b.eq 0x00b9ef88
00b9ef70	cmp w21,#0x8
00b9ef74	b.ne 0x00b9ef80
00b9ef78	mov w10,#0x1b
00b9ef7c	b 0x00b9ef8c
00b9ef80	mov w22,#0xffff9f00
00b9ef84	b 0x00b9efe8
00b9ef88	mov w10,#0x87
00b9ef8c	mov w11,wzr
00b9ef90	ldr w12,[x20, x8#0x0]
00b9ef94	add x13,x8,#0x4
00b9ef98	sub x14,x8,#0x4
00b9ef9c	cmp x13,#0x7
00b9efa0	rev w12,w12
00b9efa4	orr w11,w11,w12, LSL #0x1
00b9efa8	lsr w12,w12,#0x1f
00b9efac	rev w11,w11
00b9efb0	str w11,[x19, x8#0x0]
00b9efb4	mov x8,x14
00b9efb8	mov w11,w12
00b9efbc	b.gt 0x00b9ef90
00b9efc0	ldrb w8,[x20]
00b9efc4	mov w22,wzr
00b9efc8	lsr w8,w8,#0x7
00b9efcc	neg x11,x8
00b9efd0	orr x8,x11,x8
00b9efd4	asr x8,x8,#0x3f
00b9efd8	ldrb w11,[x19, x9]
00b9efdc	and w8,w10,w8
00b9efe0	eor w8,w8,w11
00b9efe4	strb w8,[x19, x9]
00b9efe8	add x0,sp,#0x8
00b9efec	mov w1,#0x10
00b9eff0	bl 0x00c42220
00b9eff4	ldr x8,[x23, #0x28]
00b9eff8	ldr x9,[sp, #0x18]
00b9effc	cmp x8,x9
00b9f000	b.ne 0x00b9f020
00b9f004	mov w0,w22
00b9f008	ldp x29,x30,[sp, #0x50]
00b9f00c	ldp x20,x19,[sp, #0x40]
00b9f010	ldp x22,x21,[sp, #0x30]
00b9f014	ldr x23,[sp, #0x20]
00b9f018	add sp,sp,#0x60
00b9f01c	ret
00b9f020	bl 0x00c2fec0
