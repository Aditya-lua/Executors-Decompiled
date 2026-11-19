; FUN_00a8d25c @ 00a8d25c
00a8d25c	sub sp,sp,#0x80
00a8d260	stp x24,x23,[sp, #0x40]
00a8d264	stp x22,x21,[sp, #0x50]
00a8d268	stp x20,x19,[sp, #0x60]
00a8d26c	mov x20,x3
00a8d270	mov x23,x2
00a8d274	mov x21,x1
00a8d278	lsr x8,x3,#0x1e
00a8d27c	mov x19,x0
00a8d280	stp x28,x27,[sp, #0x20]
00a8d284	stp x26,x25,[sp, #0x30]
00a8d288	stp x29,x30,[sp, #0x70]
00a8d28c	add x29,sp,#0x70
00a8d290	cbz x8,0x00a8d318
00a8d294	orr x27,xzr,#-0x40000000
00a8d298	add x8,x20,x27
00a8d29c	and x28,x8,#-0x40000000
00a8d2a0	mov w26,#0x40000000
00a8d2a4	add x22,x28,x26
00a8d2a8	add x24,x19,#0x28
00a8d2ac	str x8,[sp, #0x8]
00a8d2b0	add x8,x23,x22
00a8d2b4	mov x25,x21
00a8d2b8	str x8,[sp, #0x10]
00a8d2bc	mov x0,x19
00a8d2c0	bl 0x00c3ceb0
00a8d2c4	str w0,[sp, #0x1c]
00a8d2c8	mov x0,x19
00a8d2cc	bl 0x00c3cea0
00a8d2d0	mov x3,x0
00a8d2d4	mov w2,#0x40000000
00a8d2d8	add x5,sp,#0x1c
00a8d2dc	mov x0,x23
00a8d2e0	mov x1,x25
00a8d2e4	mov x4,x24
00a8d2e8	bl 0x00c38430
00a8d2ec	ldr w1,[sp, #0x1c]
00a8d2f0	mov x0,x19
00a8d2f4	bl 0x00c3ced0
00a8d2f8	add x20,x20,x27
00a8d2fc	add x23,x23,x26
00a8d300	lsr x8,x20,#0x1e
00a8d304	add x25,x25,x26
00a8d308	cbnz x8,0x00a8d2bc
00a8d30c	ldp x8,x23,[sp, #0x8]
00a8d310	add x21,x21,x22
00a8d314	sub x20,x8,x28
00a8d318	cbz x20,0x00a8d358
00a8d31c	mov x0,x19
00a8d320	bl 0x00c3ceb0
00a8d324	str w0,[sp, #0x18]
00a8d328	mov x0,x19
00a8d32c	bl 0x00c3cea0
00a8d330	mov x3,x0
00a8d334	add x4,x19,#0x28
00a8d338	add x5,sp,#0x18
00a8d33c	mov x0,x23
00a8d340	mov x1,x21
00a8d344	mov x2,x20
00a8d348	bl 0x00c38430
00a8d34c	ldr w1,[sp, #0x18]
00a8d350	mov x0,x19
00a8d354	bl 0x00c3ced0
00a8d358	ldp x29,x30,[sp, #0x70]
00a8d35c	ldp x20,x19,[sp, #0x60]
00a8d360	ldp x22,x21,[sp, #0x50]
00a8d364	ldp x24,x23,[sp, #0x40]
00a8d368	ldp x26,x25,[sp, #0x30]
00a8d36c	ldp x28,x27,[sp, #0x20]
00a8d370	mov w0,#0x1
00a8d374	add sp,sp,#0x80
00a8d378	ret
