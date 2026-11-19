; ossl_cipher_hw_tdes_cbc @ 00b2d26c
00b2d26c	sub sp,sp,#0x90
00b2d270	stp x28,x27,[sp, #0x30]
00b2d274	stp x26,x25,[sp, #0x40]
00b2d278	stp x24,x23,[sp, #0x50]
00b2d27c	stp x22,x21,[sp, #0x60]
00b2d280	stp x20,x19,[sp, #0x70]
00b2d284	stp x29,x30,[sp, #0x80]
00b2d288	ldr x8,[x0, #0x240]
00b2d28c	mov x19,x3
00b2d290	mov x22,x2
00b2d294	mov x21,x0
00b2d298	add x29,sp,#0x80
00b2d29c	cbz x8,0x00b2d2b8
00b2d2a0	add x3,x21,#0xc0
00b2d2a4	add x4,x21,#0x20
00b2d2a8	mov x0,x22
00b2d2ac	mov x2,x19
00b2d2b0	blr x8
00b2d2b4	b 0x00b2d37c
00b2d2b8	lsr x8,x19,#0x1e
00b2d2bc	cbz x8,0x00b2d354
00b2d2c0	orr x23,xzr,#-0x40000000
00b2d2c4	add x8,x19,x23
00b2d2c8	str x8,[sp, #0x18]
00b2d2cc	and x8,x8,#-0x40000000
00b2d2d0	mov w20,#0x40000000
00b2d2d4	str x8,[sp, #0x10]
00b2d2d8	add x8,x8,x20
00b2d2dc	add x24,x21,#0xc0
00b2d2e0	add x25,x21,#0x140
00b2d2e4	add x26,x21,#0x1c0
00b2d2e8	add x27,x21,#0x20
00b2d2ec	str x8,[sp, #0x8]
00b2d2f0	add x8,x22,x8
00b2d2f4	mov x28,x1
00b2d2f8	stp x8,x1,[sp, #0x20]
00b2d2fc	ldrb w8,[x21, #0x6c]
00b2d300	mov w2,#0x40000000
00b2d304	mov x0,x22
00b2d308	mov x1,x28
00b2d30c	ubfx w7,w8,#0x1,#0x1
00b2d310	mov x3,x24
00b2d314	mov x4,x25
00b2d318	mov x5,x26
00b2d31c	mov x6,x27
00b2d320	bl 0x00c399f0
00b2d324	add x19,x19,x23
00b2d328	add x22,x22,x20
00b2d32c	lsr x8,x19,#0x1e
00b2d330	add x28,x28,x20
00b2d334	cbnz x8,0x00b2d2fc
00b2d338	ldp x9,x8,[sp, #0x10]
00b2d33c	ldp x0,x1,[sp, #0x20]
00b2d340	sub x19,x8,x9
00b2d344	ldr x8,[sp, #0x8]
00b2d348	add x1,x1,x8
00b2d34c	cbnz x19,0x00b2d35c
00b2d350	b 0x00b2d37c
00b2d354	mov x0,x22
00b2d358	cbz x19,0x00b2d37c
00b2d35c	ldrb w8,[x21, #0x6c]
00b2d360	add x3,x21,#0xc0
00b2d364	add x4,x21,#0x140
00b2d368	add x5,x21,#0x1c0
00b2d36c	add x6,x21,#0x20
00b2d370	ubfx w7,w8,#0x1,#0x1
00b2d374	mov x2,x19
00b2d378	bl 0x00c399f0
00b2d37c	ldp x29,x30,[sp, #0x80]
00b2d380	ldp x20,x19,[sp, #0x70]
00b2d384	ldp x22,x21,[sp, #0x60]
00b2d388	ldp x24,x23,[sp, #0x50]
00b2d38c	ldp x26,x25,[sp, #0x40]
00b2d390	ldp x28,x27,[sp, #0x30]
00b2d394	mov w0,#0x1
00b2d398	add sp,sp,#0x90
00b2d39c	ret
