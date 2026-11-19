; std::__ndk1::promise<cpr::Response>::~promise @ 008f59bc
008f59bc	sub sp,sp,#0x70
008f59c0	str x21,[sp, #0x40]
008f59c4	stp x20,x19,[sp, #0x50]
008f59c8	stp x29,x30,[sp, #0x60]
008f59cc	add x29,sp,#0x60
008f59d0	mrs x21,tpidr_el0
008f59d4	ldr x8,[x21, #0x28]
008f59d8	mov x19,x0
008f59dc	stur x8,[x29, #-0x28]
008f59e0	ldr x8,[x0]
008f59e4	cbz x8,0x008f5a78
008f59e8	ldrb w9,[x8, #0x70]
008f59ec	tbnz w9,#0x0,0x008f5a50
008f59f0	str xzr,[sp, #0x30]
008f59f4	ldr x20,[x8, #0x10]
008f59f8	add x0,sp,#0x30
008f59fc	bl 0x00c31450
008f5a00	cbnz x20,0x008f5a50
008f5a04	ldr x20,[x19]
008f5a08	ldr x8,[x20, #0x8]
008f5a0c	cmp x8,#0x1
008f5a10	b.lt 0x008f5a50
008f5a14	bl 0x00c315c0
008f5a18	mov x2,x0
008f5a1c	add x0,sp,#0x8
008f5a20	mov w1,#0x4
008f5a24	bl 0x00c314d0
008f5a28	add x8,sp,#0x28
008f5a2c	add x0,sp,#0x8
008f5a30	bl 0x00c31790
008f5a34	add x1,sp,#0x28
008f5a38	mov x0,x20
008f5a3c	bl 0x00c315d0
008f5a40	add x0,sp,#0x28
008f5a44	bl 0x00c31450
008f5a48	add x0,sp,#0x8
008f5a4c	bl 0x00c314e0
008f5a50	ldr x0,[x19]
008f5a54	add x8,x0,#0x8
008f5a58	ldaxr x9,[x8]
008f5a5c	sub x10,x9,#0x1
008f5a60	stlxr w11,x10,[x8]
008f5a64	cbnz w11,0x008f5a58
008f5a68	cbnz x9,0x008f5a78
008f5a6c	ldr x8,[x0]
008f5a70	ldr x8,[x8, #0x10]
008f5a74	blr x8
008f5a78	ldr x8,[x21, #0x28]
008f5a7c	ldur x9,[x29, #-0x28]
008f5a80	cmp x8,x9
008f5a84	b.ne 0x008f5a9c
008f5a88	ldp x29,x30,[sp, #0x60]
008f5a8c	ldp x20,x19,[sp, #0x50]
008f5a90	ldr x21,[sp, #0x40]
008f5a94	add sp,sp,#0x70
008f5a98	ret
008f5a9c	bl 0x00c2fec0
