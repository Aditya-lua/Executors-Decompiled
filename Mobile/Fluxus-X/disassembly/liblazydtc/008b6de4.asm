; FUN_008b6de4 @ 008b6de4
008b6de4	sub sp,sp,#0x60
008b6de8	stp x29,x30,[sp, #0x20]
008b6dec	stp x24,x23,[sp, #0x30]
008b6df0	stp x22,x21,[sp, #0x40]
008b6df4	stp x20,x19,[sp, #0x50]
008b6df8	add x29,sp,#0x20
008b6dfc	mrs x22,tpidr_el0
008b6e00	mov x20,x1
008b6e04	mov x21,x0
008b6e08	ldr x8,[x22, #0x28]
008b6e0c	add x1,sp,#0x10
008b6e10	add x2,sp,#0x8
008b6e14	add x3,sp,#0x4
008b6e18	mov x4,sp
008b6e1c	mov x0,x20
008b6e20	stur x8,[x29, #-0x8]
008b6e24	bl 0x008b8780
008b6e28	ldp x8,x19,[sp, #0x8]
008b6e2c	cmp x19,x8
008b6e30	b.eq 0x008b6ec0
008b6e34	ldr x8,[x21, #0x60]
008b6e38	ldrb w8,[x8, #0x2]
008b6e3c	eor w23,w8,#0x3
008b6e40	and w24,w8,#0x3
008b6e44	b 0x008b6e68
008b6e48	and w8,w8,#0xf8
008b6e4c	orr w8,w8,w24
008b6e50	strb w8,[x19, #0x2]
008b6e54	ldrsw x8,[sp]
008b6e58	ldr x9,[sp, #0x8]
008b6e5c	add x19,x19,x8
008b6e60	cmp x19,x9
008b6e64	b.eq 0x008b6eb8
008b6e68	ldrb w8,[x19]
008b6e6c	cbz w8,0x008b6e54
008b6e70	ldrb w8,[x19, #0x2]
008b6e74	eor w9,w8,#0x3
008b6e78	tst w9,w23
008b6e7c	b.ne 0x008b6e48
008b6e80	mov x0,x21
008b6e84	mov x1,x19
008b6e88	mov x2,x20
008b6e8c	bl 0x008b6448
008b6e90	ldr w8,[sp, #0x4]
008b6e94	subs w8,w8,#0x1
008b6e98	str w8,[sp, #0x4]
008b6e9c	b.ne 0x008b6e54
008b6ea0	ldr w8,[sp, #0x10]
008b6ea4	ldr w9,[sp]
008b6ea8	sub w8,w19,w8
008b6eac	sdiv w8,w8,w9
008b6eb0	add w0,w8,#0x1
008b6eb4	b 0x008b6ed0
008b6eb8	ldr x9,[sp, #0x10]
008b6ebc	b 0x008b6ec8
008b6ec0	ldr w8,[sp]
008b6ec4	mov x9,x19
008b6ec8	sub w9,w19,w9
008b6ecc	sdiv w0,w9,w8
008b6ed0	ldr x8,[x22, #0x28]
008b6ed4	ldur x9,[x29, #-0x8]
008b6ed8	cmp x8,x9
008b6edc	b.ne 0x008b6ef8
008b6ee0	ldp x20,x19,[sp, #0x50]
008b6ee4	ldp x22,x21,[sp, #0x40]
008b6ee8	ldp x24,x23,[sp, #0x30]
008b6eec	ldp x29,x30,[sp, #0x20]
008b6ef0	add sp,sp,#0x60
008b6ef4	ret
008b6ef8	bl 0x00c2fec0
