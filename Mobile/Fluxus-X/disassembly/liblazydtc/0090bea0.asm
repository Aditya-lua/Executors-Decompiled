; FUN_0090bea0 @ 0090bea0
0090bea0	sub sp,sp,#0x60
0090bea4	stp x24,x23,[sp, #0x20]
0090bea8	stp x22,x21,[sp, #0x30]
0090beac	stp x20,x19,[sp, #0x40]
0090beb0	stp x29,x30,[sp, #0x50]
0090beb4	add x29,sp,#0x50
0090beb8	mrs x23,tpidr_el0
0090bebc	ldr x8,[x23, #0x28]
0090bec0	mov w20,w2
0090bec4	mov x21,x1
0090bec8	mov x19,xzr
0090becc	str x8,[sp, #0x18]
0090bed0	ldr x24,[x0, #0x10]
0090bed4	stp xzr,xzr,[sp, #0x8]
0090bed8	mov x22,xzr
0090bedc	ldrb w8,[x24, #0x84]
0090bee0	tbz w8,#0x0,0x0090bf54
0090bee4	ldr x0,[x24, #0x60]
0090bee8	cbz x0,0x0090bf4c
0090beec	ldr x8,[x0]
0090bef0	add x4,sp,#0x8
0090bef4	mov x1,x21
0090bef8	mov w2,w20
0090befc	ldr x8,[x8, #0x70]
0090bf00	mov x3,xzr
0090bf04	blr x8
0090bf08	mov x19,xzr
0090bf0c	mov x22,xzr
0090bf10	cbnz w0,0x0090bf54
0090bf14	ldr x0,[sp, #0x8]
0090bf18	cbnz x0,0x0090bf2c
0090bf1c	ldr w8,[sp, #0x10]
0090bf20	mov x19,xzr
0090bf24	mov x22,xzr
0090bf28	cbz w8,0x0090bf54
0090bf2c	ldr x1,[sp, #0x10]
0090bf30	mov x2,xzr
0090bf34	mov x3,xzr
0090bf38	bl 0x00941e38
0090bf3c	cmp x0,#0x1
0090bf40	b.lt 0x0090bf4c
0090bf44	ldp x19,x22,[sp, #0x8]
0090bf48	b 0x0090bf54
0090bf4c	mov x19,xzr
0090bf50	mov x22,xzr
0090bf54	stp xzr,xzr,[sp, #0x8]
0090bf58	ldrb w8,[x24, #0x54]
0090bf5c	tbz w8,#0x0,0x0090bfb4
0090bf60	ldr x0,[x24, #0x30]
0090bf64	cbz x0,0x0090bfb4
0090bf68	ldr x8,[x0]
0090bf6c	add x4,sp,#0x8
0090bf70	mov x1,x21
0090bf74	mov w2,w20
0090bf78	ldr x8,[x8, #0x70]
0090bf7c	mov x3,xzr
0090bf80	blr x8
0090bf84	cbnz w0,0x0090bfb4
0090bf88	ldr x0,[sp, #0x8]
0090bf8c	cbnz x0,0x0090bf98
0090bf90	ldr w8,[sp, #0x10]
0090bf94	cbz w8,0x0090bfb4
0090bf98	ldr x1,[sp, #0x10]
0090bf9c	mov x2,x19
0090bfa0	mov x3,x22
0090bfa4	bl 0x00941e38
0090bfa8	cmp x0,#0x1
0090bfac	b.lt 0x0090bfb4
0090bfb0	ldp x19,x22,[sp, #0x8]
0090bfb4	ldr x8,[x23, #0x28]
0090bfb8	ldr x9,[sp, #0x18]
0090bfbc	cmp x8,x9
0090bfc0	b.ne 0x0090bfe4
0090bfc4	mov x0,x19
0090bfc8	mov x1,x22
0090bfcc	ldp x29,x30,[sp, #0x50]
0090bfd0	ldp x20,x19,[sp, #0x40]
0090bfd4	ldp x22,x21,[sp, #0x30]
0090bfd8	ldp x24,x23,[sp, #0x20]
0090bfdc	add sp,sp,#0x60
0090bfe0	ret
0090bfe4	bl 0x00c2fec0
