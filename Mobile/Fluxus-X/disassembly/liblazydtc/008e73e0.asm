; cpr::CancellationCallback::operator() @ 008e73e0
008e73e0	sub sp,sp,#0x50
008e73e4	str x19,[sp, #0x30]
008e73e8	stp x29,x30,[sp, #0x40]
008e73ec	add x29,sp,#0x40
008e73f0	mrs x19,tpidr_el0
008e73f4	ldr x9,[x19, #0x28]
008e73f8	mov x8,x0
008e73fc	stur x9,[x29, #-0x18]
008e7400	ldr x9,[x0]
008e7404	ldarb w10,[x9]
008e7408	ldrb w9,[x0, #0x18]
008e740c	and w11,w10,#0x1
008e7410	orr w11,w9,w11
008e7414	cmp w11,#0x0
008e7418	cset w0,eq
008e741c	tbnz w10,#0x0,0x008e7460
008e7420	cbz w9,0x008e7460
008e7424	ldr x8,[x8, #0x10]
008e7428	ldr x9,[x8]
008e742c	stp x2,x1,[sp, #0x18]
008e7430	stp x4,x3,[sp, #0x8]
008e7434	str x9,[sp]
008e7438	ldr x0,[x8, #0x30]
008e743c	cbz x0,0x008e7488
008e7440	ldr x8,[x0]
008e7444	add x1,sp,#0x20
008e7448	add x2,sp,#0x18
008e744c	add x3,sp,#0x10
008e7450	ldr x8,[x8, #0x30]
008e7454	add x4,sp,#0x8
008e7458	mov x5,sp
008e745c	blr x8
008e7460	ldr x8,[x19, #0x28]
008e7464	ldur x9,[x29, #-0x18]
008e7468	cmp x8,x9
008e746c	b.ne 0x008e7484
008e7470	ldp x29,x30,[sp, #0x40]
008e7474	ldr x19,[sp, #0x30]
008e7478	and w0,w0,#0x1
008e747c	add sp,sp,#0x50
008e7480	ret
008e7484	bl 0x00c2fec0
008e7488	mov w0,#0x8
008e748c	bl 0x00c30000
008e7490	adrp x8,0xcb4000
008e7494	ldr x8,[x8, #0xb50]
008e7498	adrp x1,0xcb4000
008e749c	adrp x2,0xcb4000
008e74a0	add x8,x8,#0x10
008e74a4	str x8,[x0]
008e74a8	ldr x1,[x1, #0xb58]
008e74ac	ldr x2,[x2, #0xb38]
008e74b0	bl 0x00c30020
