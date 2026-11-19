; FUN_008b7ed0 @ 008b7ed0
008b7ed0	stp x29,x30,[sp, #-0x40]!
008b7ed4	stp x24,x23,[sp, #0x10]
008b7ed8	stp x22,x21,[sp, #0x20]
008b7edc	stp x20,x19,[sp, #0x30]
008b7ee0	mov x29,sp
008b7ee4	ldr x23,[x0, #0x60]
008b7ee8	mov w20,w3
008b7eec	mov x19,x2
008b7ef0	ldr x8,[x23, #0x650]
008b7ef4	cbnz x8,0x008b7ff0
008b7ef8	sub x8,x19,#0x1
008b7efc	cmp x8,#0x3ff
008b7f00	b.hi 0x008b7fa0
008b7f04	adrp x8,0xd1f000
008b7f08	add x8,x8,#0x638
008b7f0c	add x8,x8,x19
008b7f10	ldrsb x8,[x8, #0xa0]
008b7f14	tbnz x8,#0x3f,0x008b7fa0
008b7f18	strb wzr,[x1]
008b7f1c	adrp x9,0xd1f000
008b7f20	mov w11,#0x3450
008b7f24	ldrb w10,[x9, #0x5f8]
008b7f28	ldr x9,[x0, #0x60]
008b7f2c	ldr x12,[x4, #0x28]
008b7f30	mov w13,#0x3590
008b7f34	cmp w10,#0x0
008b7f38	mov w10,#0x4c8
008b7f3c	csel x10,x11,x10,ne
008b7f40	mov w11,#0x4b8
008b7f44	add x10,x9,x10
008b7f48	csel x11,x13,x11,ne
008b7f4c	cbnz x12,0x008b7f6c
008b7f50	ldr w13,[x4, #0x30]
008b7f54	tbz w13,#0x1f,0x008b7f6c
008b7f58	ldr x13,[x10, x8, LSL #0x3]
008b7f5c	str x13,[x4, #0x18]
008b7f60	cbz x13,0x008b7f68
008b7f64	str x4,[x13, #0x10]
008b7f68	str x4,[x10, x8, LSL #0x3]
008b7f6c	ldr w13,[x4, #0x34]
008b7f70	str x12,[x1, #0x8]
008b7f74	str x1,[x4, #0x28]
008b7f78	subs w12,w13,#0x1
008b7f7c	str w12,[x4, #0x34]
008b7f80	b.ne 0x008b7fac
008b7f84	ldp x13,x12,[x4, #0x10]
008b7f88	add x1,x9,x11
008b7f8c	cbz x12,0x008b7f94
008b7f90	str x13,[x12, #0x10]
008b7f94	cbz x13,0x008b7fdc
008b7f98	str x12,[x13, #0x18]
008b7f9c	b 0x008b7fa4
008b7fa0	add x1,x23,#0x4b8
008b7fa4	mov x2,x4
008b7fa8	bl 0x008b8010
008b7fac	add x8,x23,w20, UXTB  #0x3
008b7fb0	ldr x9,[x23, #0x10]
008b7fb4	ldr x10,[x8, #0x3848]
008b7fb8	sub x9,x9,x19
008b7fbc	str x9,[x23, #0x10]
008b7fc0	sub x9,x10,x19
008b7fc4	str x9,[x8, #0x3848]
008b7fc8	ldp x20,x19,[sp, #0x30]
008b7fcc	ldp x22,x21,[sp, #0x20]
008b7fd0	ldp x24,x23,[sp, #0x10]
008b7fd4	ldp x29,x30,[sp], #0x40
008b7fd8	ret
008b7fdc	ldr x9,[x10, x8, LSL #0x3]
008b7fe0	cmp x9,x4
008b7fe4	b.ne 0x008b7fa4
008b7fe8	str x12,[x10, x8, LSL #0x3]
008b7fec	b 0x008b7fa4
008b7ff0	mov x21,x0
008b7ff4	mov x22,x1
008b7ff8	mov x24,x4
008b7ffc	blr x8
008b8000	mov x1,x22
008b8004	mov x0,x21
008b8008	mov x4,x24
008b800c	b 0x008b7ef8
