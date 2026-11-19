; cpr::ThreadPool::AddThread @ 008fe234
008fe234	str x25,[sp, #-0x50]!
008fe238	stp x24,x23,[sp, #0x10]
008fe23c	stp x22,x21,[sp, #0x20]
008fe240	stp x20,x19,[sp, #0x30]
008fe244	stp x29,x30,[sp, #0x40]
008fe248	add x29,sp,#0x40
008fe24c	add x20,x0,#0x50
008fe250	mov x21,x0
008fe254	mov x0,x20
008fe258	mov x22,x1
008fe25c	bl 0x00c2ff10
008fe260	add x8,x21,#0x28
008fe264	ldaxr x9,[x8]
008fe268	add x9,x9,#0x1
008fe26c	stlxr w10,x9,[x8]
008fe270	cbnz w10,0x008fe264
008fe274	mov w0,#0x20
008fe278	bl 0x00c2fed0
008fe27c	str xzr,[x0, #0x10]
008fe280	adrp x8,0xcb4000
008fe284	ldr x8,[x8, #0xd70]
008fe288	mov x24,x0
008fe28c	str xzr,[x24, #0x8]!
008fe290	str x22,[x0, #0x18]
008fe294	add x8,x8,#0x10
008fe298	str x8,[x0]
008fe29c	ldr x25,[x22]
008fe2a0	mov x19,x0
008fe2a4	mov x0,xzr
008fe2a8	bl 0x00c30970
008fe2ac	mov x23,x0
008fe2b0	mov w0,#0x40
008fe2b4	bl 0x00c2fed0
008fe2b8	add x8,x21,#0x38
008fe2bc	stp x22,x19,[x0, #0x10]
008fe2c0	ldxr x9,[x24]
008fe2c4	add x9,x9,#0x1
008fe2c8	stxr w10,x9,[x24]
008fe2cc	cbnz w10,0x008fe2c0
008fe2d0	mov w9,#0x1
008fe2d4	str x25,[x0, #0x20]
008fe2d8	stp x23,xzr,[x0, #0x30]
008fe2dc	str x8,[x0, #0x8]
008fe2e0	str w9,[x0, #0x28]
008fe2e4	ldr x8,[x21, #0x38]
008fe2e8	str x8,[x0]
008fe2ec	str x0,[x8, #0x8]
008fe2f0	ldr x8,[x21, #0x48]
008fe2f4	str x0,[x21, #0x38]
008fe2f8	mov x0,x20
008fe2fc	add x8,x8,#0x1
008fe300	str x8,[x21, #0x48]
008fe304	bl 0x00c2ff20
008fe308	ldaxr x8,[x24]
008fe30c	sub x9,x8,#0x1
008fe310	stlxr w10,x9,[x24]
008fe314	cbnz w10,0x008fe308
008fe318	cbz x8,0x008fe334
008fe31c	ldp x29,x30,[sp, #0x40]
008fe320	ldp x20,x19,[sp, #0x30]
008fe324	ldp x22,x21,[sp, #0x20]
008fe328	ldp x24,x23,[sp, #0x10]
008fe32c	ldr x25,[sp], #0x50
008fe330	ret
008fe334	ldr x8,[x19]
008fe338	mov x0,x19
008fe33c	ldr x8,[x8, #0x10]
008fe340	blr x8
008fe344	mov x0,x19
008fe348	ldp x29,x30,[sp, #0x40]
008fe34c	ldp x20,x19,[sp, #0x30]
008fe350	ldp x22,x21,[sp, #0x20]
008fe354	ldp x24,x23,[sp, #0x10]
008fe358	ldr x25,[sp], #0x50
008fe35c	b 0x00c2ff00
