; FUN_0089c430 @ 0089c430
0089c430	sub sp,sp,#0x30
0089c434	stp x29,x30,[sp, #0x10]
0089c438	stp x20,x19,[sp, #0x20]
0089c43c	add x29,sp,#0x10
0089c440	mrs x20,tpidr_el0
0089c444	mov x19,x0
0089c448	ldr x8,[x20, #0x28]
0089c44c	str x8,[sp, #0x8]
0089c450	adrp x8,0xc4b000
0089c454	add x8,x8,#0xe10
0089c458	ldr x0,[x0, #0x80]
0089c45c	str x8,[x19]
0089c460	cbz x0,0x0089c490
0089c464	bl 0x00c301d0
0089c468	ldr x0,[x19, #0x98]
0089c46c	str xzr,[x19, #0x80]
0089c470	bl 0x00c301d0
0089c474	mov x0,xzr
0089c478	stp xzr,xzr,[x19, #0x88]
0089c47c	str xzr,[x19, #0x98]
0089c480	bl 0x00c301d0
0089c484	mov w8,#0x40
0089c488	str xzr,[x19, #0xa0]
0089c48c	strb w8,[x19, #0xb0]
0089c490	ldr x0,[x19, #0x98]
0089c494	bl 0x00c301d0
0089c498	ldr x0,[x19, #0x60]
0089c49c	cbz x0,0x0089c4b0
0089c4a0	ldr x8,[x19, #0x70]
0089c4a4	str x0,[x19, #0x68]
0089c4a8	sub x1,x8,x0
0089c4ac	bl 0x00c2fe80
0089c4b0	add x8,x19,#0x40
0089c4b4	mov x0,sp
0089c4b8	str x8,[sp]
0089c4bc	bl 0x0089cf40
0089c4c0	ldr x8,[x20, #0x28]
0089c4c4	ldr x9,[sp, #0x8]
0089c4c8	cmp x8,x9
0089c4cc	b.ne 0x0089c4e0
0089c4d0	ldp x20,x19,[sp, #0x20]
0089c4d4	ldp x29,x30,[sp, #0x10]
0089c4d8	add sp,sp,#0x30
0089c4dc	ret
0089c4e0	bl 0x00c2fec0
