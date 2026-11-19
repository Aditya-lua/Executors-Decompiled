; mbedtls_mpi_lt_mpi_ct @ 00b7d1c4
00b7d1c4	sub sp,sp,#0x50
00b7d1c8	stp x22,x21,[sp, #0x20]
00b7d1cc	stp x20,x19,[sp, #0x30]
00b7d1d0	stp x29,x30,[sp, #0x40]
00b7d1d4	add x29,sp,#0x40
00b7d1d8	mrs x20,tpidr_el0
00b7d1dc	ldr x8,[x20, #0x28]
00b7d1e0	mov x19,x2
00b7d1e4	str x8,[sp, #0x18]
00b7d1e8	ldrh w8,[x0, #0xa]
00b7d1ec	ldrh w9,[x1, #0xa]
00b7d1f0	cmp w8,w9
00b7d1f4	b.ne 0x00b7d274
00b7d1f8	ldrh w8,[x0, #0x8]
00b7d1fc	add x11,sp,#0x8
00b7d200	ubfx w9,w8,#0x1,#0x1
00b7d204	neg x8,x9
00b7d208	orr x9,x8,x9
00b7d20c	asr x9,x9,#0x3f
00b7d210	ldrh w8,[x1, #0x8]
00b7d214	and x12,x9,#0x1
00b7d218	eor x13,x12,#0x1
00b7d21c	ubfx w10,w8,#0x1,#0x1
00b7d220	neg x8,x10
00b7d224	orr x10,x8,x10
00b7d228	asr x10,x10,#0x3f
00b7d22c	ldr x8,[x0]
00b7d230	eor w21,w10,w9
00b7d234	and w22,w21,w9
00b7d238	str x8,[sp, #0x8]
00b7d23c	ldr x8,[x1]
00b7d240	str x8,[sp, #0x10]
00b7d244	ldr x8,[x11, x12, LSL #0x3]
00b7d248	ldr x1,[x11, x13, LSL #0x3]
00b7d24c	ldrh w2,[x0, #0xa]
00b7d250	mov x0,x8
00b7d254	bl 0x00c41e60
00b7d258	mov x8,x0
00b7d25c	bic w8,w8,w21
00b7d260	orr w8,w8,w22
00b7d264	mov w0,wzr
00b7d268	and w8,w8,#0x1
00b7d26c	str w8,[x19]
00b7d270	b 0x00b7d278
00b7d274	orr w0,wzr,#0xfffffffc
00b7d278	ldr x8,[x20, #0x28]
00b7d27c	ldr x9,[sp, #0x18]
00b7d280	cmp x8,x9
00b7d284	b.ne 0x00b7d29c
00b7d288	ldp x29,x30,[sp, #0x40]
00b7d28c	ldp x20,x19,[sp, #0x30]
00b7d290	ldp x22,x21,[sp, #0x20]
00b7d294	add sp,sp,#0x50
00b7d298	ret
00b7d29c	bl 0x00c2fec0
