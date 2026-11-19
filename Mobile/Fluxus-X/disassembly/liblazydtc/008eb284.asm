; cpr::Session::DoEasyPerform @ 008eb284
008eb284	sub sp,sp,#0x40
008eb288	str x21,[sp, #0x10]
008eb28c	stp x20,x19,[sp, #0x20]
008eb290	stp x29,x30,[sp, #0x30]
008eb294	add x29,sp,#0x30
008eb298	mrs x21,tpidr_el0
008eb29c	ldr x8,[x21, #0x28]
008eb2a0	str x8,[sp, #0x8]
008eb2a4	ldrb w8,[x0, #0x2a8]
008eb2a8	cbz w8,0x008eb334
008eb2ac	adrp x0,0xcb4000
008eb2b0	ldr x0,[x0, #0xd10]
008eb2b4	adrp x1,0x2db000
008eb2b8	add x1,x1,#0xa4
008eb2bc	mov w2,#0x52
008eb2c0	bl 0x00c30e90
008eb2c4	ldr x8,[x0]
008eb2c8	mov x19,x0
008eb2cc	ldur x8,[x8, #-0x18]
008eb2d0	add x0,x0,x8
008eb2d4	mov x8,sp
008eb2d8	bl 0x00c30070
008eb2dc	adrp x1,0xcb4000
008eb2e0	ldr x1,[x1, #0x998]
008eb2e4	mov x0,sp
008eb2e8	bl 0x00c30080
008eb2ec	ldr x8,[x0]
008eb2f0	ldr x8,[x8, #0x38]
008eb2f4	mov w1,#0xa
008eb2f8	blr x8
008eb2fc	mov w20,w0
008eb300	mov x0,sp
008eb304	bl 0x00c30090
008eb308	mov x0,x19
008eb30c	mov w1,w20
008eb310	bl 0x00c31510
008eb314	mov x0,x19
008eb318	bl 0x00c30e50
008eb31c	ldr x8,[x21, #0x28]
008eb320	ldr x9,[sp, #0x8]
008eb324	cmp x8,x9
008eb328	b.ne 0x008eb364
008eb32c	mov w0,#0x2
008eb330	b 0x008eb350
008eb334	ldr x8,[x0, #0x18]
008eb338	ldr x0,[x8]
008eb33c	bl 0x00c317b0
008eb340	ldr x8,[x21, #0x28]
008eb344	ldr x9,[sp, #0x8]
008eb348	cmp x8,x9
008eb34c	b.ne 0x008eb364
008eb350	ldp x29,x30,[sp, #0x30]
008eb354	ldp x20,x19,[sp, #0x20]
008eb358	ldr x21,[sp, #0x10]
008eb35c	add sp,sp,#0x40
008eb360	ret
008eb364	bl 0x00c2fec0
