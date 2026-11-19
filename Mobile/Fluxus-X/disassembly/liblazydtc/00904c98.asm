; FUN_00904c98 @ 00904c98
00904c98	stp x28,x23,[sp, #-0x40]!
00904c9c	stp x22,x21,[sp, #0x10]
00904ca0	stp x20,x19,[sp, #0x20]
00904ca4	stp x29,x30,[sp, #0x30]
00904ca8	add x29,sp,#0x30
00904cac	sub sp,sp,#0x920
00904cb0	stp q6,q7,[sp, #0x60]
00904cb4	stp q4,q5,[sp, #0x40]
00904cb8	stp q2,q3,[sp, #0x20]
00904cbc	stp q0,q1,[sp]
00904cc0	stp x6,x7,[sp, #0xa0]
00904cc4	stp x4,x5,[sp, #0x90]
00904cc8	stp x2,x3,[sp, #0x80]
00904ccc	mrs x21,tpidr_el0
00904cd0	ldr x8,[x21, #0x28]
00904cd4	mov x20,x1
00904cd8	mov x19,x0
00904cdc	stur x8,[x29, #-0x38]
00904ce0	cbz x0,0x00904db0
00904ce4	ldrb w8,[x19, #0xa85]
00904ce8	tbz w8,#0x4,0x00904db0
00904cec	ldr x8,[x19, #0x12a0]
00904cf0	cbz x8,0x00904d00
00904cf4	ldr w8,[x8, #0x8]
00904cf8	cmp w8,#0x1
00904cfc	b.lt 0x00904db0
00904d00	orr x8,xzr,#-0x7f00000080
00904d04	movk x8,#0xffd0
00904d08	add x9,x29,#0x10
00904d0c	mov x10,sp
00904d10	add x11,sp,#0x80
00904d14	str x8,[sp, #0xe8]
00904d18	str x9,[sp, #0xd0]
00904d1c	add x8,x10,#0x80
00904d20	add x9,x11,#0x30
00904d24	stp x9,x8,[sp, #0xd8]
00904d28	ldr x8,[x19, #0x12a0]
00904d2c	ldp q1,q0,[sp, #0xd0]
00904d30	stp q1,q0,[sp, #0xb0]
00904d34	cbz x8,0x00904d54
00904d38	ldr x3,[x8]
00904d3c	adrp x2,0x2a9000
00904d40	add x2,x2,#0x4a6
00904d44	add x0,sp,#0x114
00904d48	mov w1,#0x800
00904d4c	bl 0x00c31b70
00904d50	b 0x00904d58
00904d54	mov w0,wzr
00904d58	ldp q1,q0,[sp, #0xb0]
00904d5c	sxtw x22,w0
00904d60	add x23,sp,#0x114
00904d64	mov w9,#0x800
00904d68	add x8,x23,x22
00904d6c	sub w9,w9,w0
00904d70	sxtw x1,w9
00904d74	add x3,sp,#0xf0
00904d78	mov x0,x8
00904d7c	mov x2,x20
00904d80	stp q1,q0,[sp, #0xf0]
00904d84	bl 0x00c31b80
00904d88	add x8,x22,w0, SXTW 
00904d8c	sxtw x10,w8
00904d90	mov w9,#0xa
00904d94	add x3,x10,#0x1
00904d98	add x2,sp,#0x114
00904d9c	mov x0,x19
00904da0	mov w1,wzr
00904da4	strb w9,[x23, x8]
00904da8	strb wzr,[x23, x3]
00904dac	bl 0x00904a98
00904db0	ldr x8,[x21, #0x28]
00904db4	ldur x9,[x29, #-0x38]
00904db8	cmp x8,x9
00904dbc	b.ne 0x00904dd8
00904dc0	add sp,sp,#0x920
00904dc4	ldp x29,x30,[sp, #0x30]
00904dc8	ldp x20,x19,[sp, #0x20]
00904dcc	ldp x22,x21,[sp, #0x10]
00904dd0	ldp x28,x23,[sp], #0x40
00904dd4	ret
00904dd8	bl 0x00c2fec0
