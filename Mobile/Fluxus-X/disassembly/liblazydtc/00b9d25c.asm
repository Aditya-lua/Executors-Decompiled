; mbedtls_psa_ffdh_generate_key @ 00b9d25c
00b9d25c	sub sp,sp,#0x80
00b9d260	str x25,[sp, #0x30]
00b9d264	stp x24,x23,[sp, #0x40]
00b9d268	stp x22,x21,[sp, #0x50]
00b9d26c	stp x20,x19,[sp, #0x60]
00b9d270	stp x29,x30,[sp, #0x70]
00b9d274	add x29,sp,#0x70
00b9d278	mrs x24,tpidr_el0
00b9d27c	ldr x8,[x24, #0x28]
00b9d280	add x0,sp,#0x8
00b9d284	mov x19,x3
00b9d288	mov x20,x2
00b9d28c	mov x23,x1
00b9d290	str x8,[sp, #0x28]
00b9d294	bl 0x00c41c00
00b9d298	add x0,sp,#0x18
00b9d29c	bl 0x00c41c00
00b9d2a0	sub x9,x20,#0x100
00b9d2a4	ror x8,x9,#0x7
00b9d2a8	cmp x8,#0x6
00b9d2ac	b.hi 0x00b9d2c0
00b9d2b0	ubfx x9,x9,#0x7,#0x8
00b9d2b4	mov w10,#0x57
00b9d2b8	lsr w9,w10,w9
00b9d2bc	tbnz w9,#0x0,0x00b9d320
00b9d2c0	mov w25,wzr
00b9d2c4	mov w22,#0xffffff92
00b9d2c8	mov w21,#0xffffff79
00b9d2cc	add x0,sp,#0x8
00b9d2d0	bl 0x00c41bb0
00b9d2d4	add x0,sp,#0x18
00b9d2d8	bl 0x00c41bb0
00b9d2dc	cbz w25,0x00b9d2f0
00b9d2e0	cbz w22,0x00b9d2f0
00b9d2e4	mov w0,w22
00b9d2e8	bl 0x00c42bf0
00b9d2ec	mov w21,w0
00b9d2f0	ldr x8,[x24, #0x28]
00b9d2f4	ldr x9,[sp, #0x28]
00b9d2f8	cmp x8,x9
00b9d2fc	b.ne 0x00b9d3d8
00b9d300	mov w0,w21
00b9d304	ldp x29,x30,[sp, #0x70]
00b9d308	ldp x20,x19,[sp, #0x60]
00b9d30c	ldp x22,x21,[sp, #0x50]
00b9d310	ldp x24,x23,[sp, #0x40]
00b9d314	ldr x25,[sp, #0x30]
00b9d318	add sp,sp,#0x80
00b9d31c	ret
00b9d320	adrp x9,0xcab000
00b9d324	adrp x10,0x787000
00b9d328	lsl x8,x8,#0x3
00b9d32c	add x9,x9,#0x3d0
00b9d330	add x10,x10,#0x4f0
00b9d334	ldr x1,[x9, x8#0x0]
00b9d338	ldr x2,[x10, x8#0x0]
00b9d33c	add x0,sp,#0x8
00b9d340	bl 0x00c41ca0
00b9d344	cbz w0,0x00b9d360
00b9d348	bl 0x00c42bf0
00b9d34c	mov w21,w0
00b9d350	cbz w0,0x00b9d360
00b9d354	mov w25,wzr
00b9d358	mov w22,#0xffffff92
00b9d35c	b 0x00b9d2cc
00b9d360	adrp x3,0xcb5000
00b9d364	ldr x3,[x3, #0xac0]
00b9d368	add x0,sp,#0x18
00b9d36c	orr w1,wzr,#0x3
00b9d370	add x2,sp,#0x8
00b9d374	mov x4,xzr
00b9d378	bl 0x00c41c90
00b9d37c	mov w22,w0
00b9d380	cbz w0,0x00b9d390
00b9d384	mov w21,wzr
00b9d388	mov w25,#0x1
00b9d38c	b 0x00b9d2cc
00b9d390	add x0,sp,#0x18
00b9d394	add x1,sp,#0x18
00b9d398	mov w2,#0x1
00b9d39c	mov w25,#0x1
00b9d3a0	bl 0x00c41d50
00b9d3a4	mov w22,w0
00b9d3a8	cbz w0,0x00b9d3b4
00b9d3ac	mov w21,wzr
00b9d3b0	b 0x00b9d2cc
00b9d3b4	add x0,sp,#0x18
00b9d3b8	mov x1,x23
00b9d3bc	mov x2,x20
00b9d3c0	bl 0x00c41d80
00b9d3c4	mov w22,w0
00b9d3c8	cbnz w0,0x00b9d384
00b9d3cc	mov w21,wzr
00b9d3d0	str x20,[x19]
00b9d3d4	b 0x00b9d388
00b9d3d8	bl 0x00c2fec0
