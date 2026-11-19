; cpr::ThreadPool::DelThread @ 008fe3b8
008fe3b8	stp x26,x25,[sp, #-0x50]!
008fe3bc	stp x24,x23,[sp, #0x10]
008fe3c0	stp x22,x21,[sp, #0x20]
008fe3c4	stp x20,x19,[sp, #0x30]
008fe3c8	stp x29,x30,[sp, #0x40]
008fe3cc	add x29,sp,#0x40
008fe3d0	mov x20,x0
008fe3d4	mov x0,xzr
008fe3d8	mov x19,x1
008fe3dc	bl 0x00c30970
008fe3e0	add x21,x20,#0x50
008fe3e4	mov x22,x0
008fe3e8	mov x0,x21
008fe3ec	bl 0x00c2ff10
008fe3f0	add x8,x20,#0x28
008fe3f4	ldaxr x9,[x8]
008fe3f8	sub x9,x9,#0x1
008fe3fc	stlxr w10,x9,[x8]
008fe400	cbnz w10,0x008fe3f4
008fe404	add x8,x20,#0x30
008fe408	ldaxr x9,[x8]
008fe40c	sub x9,x9,#0x1
008fe410	stlxr w10,x9,[x8]
008fe414	cbnz w10,0x008fe408
008fe418	ldr x23,[x20, #0x40]
008fe41c	add x25,x20,#0x38
008fe420	cmp x25,x23
008fe424	b.eq 0x008fe4dc
008fe428	ldr w8,[x23, #0x28]
008fe42c	cbnz w8,0x008fe4ac
008fe430	ldr x8,[x23, #0x38]
008fe434	cmp x22,x8
008fe438	b.le 0x008fe4ac
008fe43c	ldr x0,[x23, #0x10]
008fe440	ldr x8,[x0]
008fe444	cbz x8,0x008fe4cc
008fe448	bl 0x00c31920
008fe44c	ldp x8,x26,[x23]
008fe450	str x26,[x8, #0x8]
008fe454	ldr x9,[x23, #0x8]
008fe458	str x8,[x9]
008fe45c	ldr x8,[x20, #0x48]
008fe460	sub x8,x8,#0x1
008fe464	str x8,[x20, #0x48]
008fe468	ldr x24,[x23, #0x18]
008fe46c	cbz x24,0x008fe4a0
008fe470	add x8,x24,#0x8
008fe474	ldaxr x9,[x8]
008fe478	sub x10,x9,#0x1
008fe47c	stlxr w11,x10,[x8]
008fe480	cbnz w11,0x008fe474
008fe484	cbnz x9,0x008fe4a0
008fe488	ldr x8,[x24]
008fe48c	mov x0,x24
008fe490	ldr x8,[x8, #0x10]
008fe494	blr x8
008fe498	mov x0,x24
008fe49c	bl 0x00c2ff00
008fe4a0	mov x0,x23
008fe4a4	bl 0x00c301d0
008fe4a8	b 0x008fe4d0
008fe4ac	ldr x0,[x23, #0x20]
008fe4b0	mov x1,x19
008fe4b4	bl 0x00c31930
008fe4b8	cbz w0,0x008fe4cc
008fe4bc	mov x0,xzr
008fe4c0	str wzr,[x23, #0x28]
008fe4c4	bl 0x00c30970
008fe4c8	str x0,[x23, #0x38]
008fe4cc	ldr x26,[x23, #0x8]
008fe4d0	cmp x25,x26
008fe4d4	mov x23,x26
008fe4d8	b.ne 0x008fe428
008fe4dc	mov x0,x21
008fe4e0	ldp x29,x30,[sp, #0x40]
008fe4e4	ldp x20,x19,[sp, #0x30]
008fe4e8	ldp x22,x21,[sp, #0x20]
008fe4ec	ldp x24,x23,[sp, #0x10]
008fe4f0	ldp x26,x25,[sp], #0x50
008fe4f4	b 0x00c2ff20
