; FUN_0089cad0 @ 0089cad0
0089cad0	sub sp,sp,#0x30
0089cad4	stp x29,x30,[sp, #0x10]
0089cad8	stp x20,x19,[sp, #0x20]
0089cadc	add x29,sp,#0x10
0089cae0	mrs x20,tpidr_el0
0089cae4	mov x19,x0
0089cae8	ldr x8,[x20, #0x28]
0089caec	str x8,[sp, #0x8]
0089caf0	adrp x8,0xc4b000
0089caf4	add x8,x8,#0xe10
0089caf8	ldr x0,[x0, #0x80]
0089cafc	str x8,[x19]
0089cb00	cbz x0,0x0089cb30
0089cb04	bl 0x00c301d0
0089cb08	ldr x0,[x19, #0x98]
0089cb0c	str xzr,[x19, #0x80]
0089cb10	bl 0x00c301d0
0089cb14	mov x0,xzr
0089cb18	stp xzr,xzr,[x19, #0x88]
0089cb1c	str xzr,[x19, #0x98]
0089cb20	bl 0x00c301d0
0089cb24	mov w8,#0x40
0089cb28	str xzr,[x19, #0xa0]
0089cb2c	strb w8,[x19, #0xb0]
0089cb30	ldr x0,[x19, #0x98]
0089cb34	bl 0x00c301d0
0089cb38	ldr x0,[x19, #0x60]
0089cb3c	cbz x0,0x0089cb50
0089cb40	ldr x8,[x19, #0x70]
0089cb44	str x0,[x19, #0x68]
0089cb48	sub x1,x8,x0
0089cb4c	bl 0x00c2fe80
0089cb50	add x8,x19,#0x40
0089cb54	mov x0,sp
0089cb58	str x8,[sp]
0089cb5c	bl 0x0089cf40
0089cb60	mov x0,x19
0089cb64	mov w1,#0xc8
0089cb68	bl 0x00c2fe80
0089cb6c	ldr x8,[x20, #0x28]
0089cb70	ldr x9,[sp, #0x8]
0089cb74	cmp x8,x9
0089cb78	b.ne 0x0089cb8c
0089cb7c	ldp x20,x19,[sp, #0x20]
0089cb80	ldp x29,x30,[sp, #0x10]
0089cb84	add sp,sp,#0x30
0089cb88	ret
0089cb8c	bl 0x00c2fec0
