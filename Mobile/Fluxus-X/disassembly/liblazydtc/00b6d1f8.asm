; mbedtls_chachapoly_finish @ 00b6d1f8
00b6d1f8	sub sp,sp,#0x50
00b6d1fc	str x21,[sp, #0x20]
00b6d200	stp x20,x19,[sp, #0x30]
00b6d204	stp x29,x30,[sp, #0x40]
00b6d208	add x29,sp,#0x40
00b6d20c	mrs x21,tpidr_el0
00b6d210	ldr x8,[x21, #0x28]
00b6d214	mov x20,x0
00b6d218	mov x19,x1
00b6d21c	str x8,[sp, #0x18]
00b6d220	ldr w8,[x0, #0xe8]
00b6d224	cbz w8,0x00b6d2b4
00b6d228	cmp w8,#0x2
00b6d22c	b.eq 0x00b6d248
00b6d230	cmp w8,#0x1
00b6d234	b.ne 0x00b6d274
00b6d238	ldr w8,[x20, #0xd8]
00b6d23c	ands w8,w8,#0xf
00b6d240	b.ne 0x00b6d254
00b6d244	b 0x00b6d274
00b6d248	ldr w8,[x20, #0xe0]
00b6d24c	ands w8,w8,#0xf
00b6d250	b.eq 0x00b6d274
00b6d254	mov w9,#0x10
00b6d258	add x0,x20,#0x88
00b6d25c	sub w2,w9,w8
00b6d260	add x1,sp,#0x8
00b6d264	stur xzr,[sp, #0xf]
00b6d268	str xzr,[sp, #0x8]
00b6d26c	bl 0x00c42290
00b6d270	cbnz w0,0x00b6d2b8
00b6d274	ldr x8,[x20, #0xd8]
00b6d278	orr w9,wzr,#0x3
00b6d27c	str w9,[x20, #0xe8]
00b6d280	add x1,sp,#0x8
00b6d284	str x8,[sp, #0x8]
00b6d288	ldr x8,[x20, #0xe0]
00b6d28c	add x20,x20,#0x88
00b6d290	mov w2,#0x10
00b6d294	mov x0,x20
00b6d298	str x8,[sp, #0x10]
00b6d29c	bl 0x00c42290
00b6d2a0	cbnz w0,0x00b6d2b8
00b6d2a4	mov x0,x20
00b6d2a8	mov x1,x19
00b6d2ac	bl 0x00c42250
00b6d2b0	b 0x00b6d2b8
00b6d2b4	mov w0,#0xffffffac
00b6d2b8	ldr x8,[x21, #0x28]
00b6d2bc	ldr x9,[sp, #0x18]
00b6d2c0	cmp x8,x9
00b6d2c4	b.ne 0x00b6d2dc
00b6d2c8	ldp x29,x30,[sp, #0x40]
00b6d2cc	ldp x20,x19,[sp, #0x30]
00b6d2d0	ldr x21,[sp, #0x20]
00b6d2d4	add sp,sp,#0x50
00b6d2d8	ret
00b6d2dc	bl 0x00c2fec0
