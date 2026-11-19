; FUN_00852e10 @ 00852e10
00852e10	sub sp,sp,#0x60
00852e14	stp x29,x30,[sp, #0x20]
00852e18	str x23,[sp, #0x30]
00852e1c	stp x22,x21,[sp, #0x40]
00852e20	stp x20,x19,[sp, #0x50]
00852e24	add x29,sp,#0x20
00852e28	mrs x21,tpidr_el0
00852e2c	adrp x9,0x29c000
00852e30	mov x19,x0
00852e34	ldr x8,[x21, #0x28]
00852e38	ldr q0,[x9, #0x50]
00852e3c	mov x20,x1
00852e40	stur x8,[x29, #-0x8]
00852e44	str xzr,[x0]
00852e48	str xzr,[x0, #0x18]
00852e4c	stur q0,[x0, #0x8]
00852e50	mov w0,#0x10
00852e54	bl 0x00c2fed0
00852e58	ldr x8,[x19, #0x10]
00852e5c	mov w1,wzr
00852e60	mov w3,#0x10
00852e64	str x0,[x19, #0x18]
00852e68	lsl x2,x8,#0x3
00852e6c	bl 0x00c306e0
00852e70	mov w8,#0x40
00852e74	stp xzr,xzr,[x19, #0x20]
00852e78	strb w8,[x19, #0x30]
00852e7c	mov w0,#0x800
00852e80	bl 0x00c2fed0
00852e84	mov x22,xzr
00852e88	mov w8,#0x80
00852e8c	mov w9,#0x39
00852e90	adrp x23,0xc4a000
00852e94	add x23,x23,#0x540
00852e98	str x0,[x19]
00852e9c	str x8,[x19, #0x20]
00852ea0	strb w9,[x19, #0x30]
00852ea4	str x20,[x19, #0x38]
00852ea8	ldr x0,[x23, x22, LSL #0x3]
00852eac	str x0,[sp, #0x8]
00852eb0	bl 0x00c2ff50
00852eb4	add w8,w22,#0x123
00852eb8	stp w0,w8,[sp, #0x10]
00852ebc	add x1,sp,#0x8
00852ec0	mov x0,x19
00852ec4	bl 0x00855340
00852ec8	add x1,sp,#0x8
00852ecc	mov x0,x19
00852ed0	bl 0x0085546c
00852ed4	add x22,x22,#0x1
00852ed8	cmp x22,#0x15
00852edc	b.ne 0x00852ea8
00852ee0	ldr x8,[x21, #0x28]
00852ee4	ldur x9,[x29, #-0x8]
00852ee8	cmp x8,x9
00852eec	b.ne 0x00852f40
00852ef0	ldp x20,x19,[sp, #0x50]
00852ef4	ldr x23,[sp, #0x30]
00852ef8	ldp x22,x21,[sp, #0x40]
00852efc	ldp x29,x30,[sp, #0x20]
00852f00	add sp,sp,#0x60
00852f04	ret
00852f40	bl 0x00c2fec0
