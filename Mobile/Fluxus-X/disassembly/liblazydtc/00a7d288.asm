; ossl_ffc_params_copy @ 00a7d288
00a7d288	str x21,[sp, #-0x30]!
00a7d28c	stp x20,x19,[sp, #0x10]
00a7d290	stp x29,x30,[sp, #0x20]
00a7d294	ldr x21,[x1]
00a7d298	mov x19,x1
00a7d29c	mov x20,x0
00a7d2a0	add x29,sp,#0x20
00a7d2a4	cbz x21,0x00a7d2d8
00a7d2a8	mov w1,#0x2
00a7d2ac	mov x0,x21
00a7d2b0	bl 0x00c38ce0
00a7d2b4	cbz w0,0x00a7d2c8
00a7d2b8	mov w1,#0x1
00a7d2bc	mov x0,x21
00a7d2c0	bl 0x00c38ce0
00a7d2c4	cbz w0,0x00a7d2d8
00a7d2c8	mov x0,x21
00a7d2cc	bl 0x00c369a0
00a7d2d0	mov x21,x0
00a7d2d4	cbz x0,0x00a7d41c
00a7d2d8	ldr x0,[x20]
00a7d2dc	bl 0x00c322e0
00a7d2e0	str x21,[x20]
00a7d2e4	ldr x21,[x19, #0x10]
00a7d2e8	cbz x21,0x00a7d31c
00a7d2ec	mov w1,#0x2
00a7d2f0	mov x0,x21
00a7d2f4	bl 0x00c38ce0
00a7d2f8	cbz w0,0x00a7d30c
00a7d2fc	mov w1,#0x1
00a7d300	mov x0,x21
00a7d304	bl 0x00c38ce0
00a7d308	cbz w0,0x00a7d31c
00a7d30c	mov x0,x21
00a7d310	bl 0x00c369a0
00a7d314	mov x21,x0
00a7d318	cbz x0,0x00a7d41c
00a7d31c	ldr x0,[x20, #0x10]
00a7d320	bl 0x00c322e0
00a7d324	str x21,[x20, #0x10]
00a7d328	ldr x21,[x19, #0x8]
00a7d32c	cbz x21,0x00a7d360
00a7d330	mov w1,#0x2
00a7d334	mov x0,x21
00a7d338	bl 0x00c38ce0
00a7d33c	cbz w0,0x00a7d350
00a7d340	mov w1,#0x1
00a7d344	mov x0,x21
00a7d348	bl 0x00c38ce0
00a7d34c	cbz w0,0x00a7d360
00a7d350	mov x0,x21
00a7d354	bl 0x00c369a0
00a7d358	mov x21,x0
00a7d35c	cbz x0,0x00a7d41c
00a7d360	ldr x0,[x20, #0x8]
00a7d364	bl 0x00c322e0
00a7d368	str x21,[x20, #0x8]
00a7d36c	ldr x21,[x19, #0x18]
00a7d370	cbz x21,0x00a7d3a4
00a7d374	mov w1,#0x2
00a7d378	mov x0,x21
00a7d37c	bl 0x00c38ce0
00a7d380	cbz w0,0x00a7d394
00a7d384	mov w1,#0x1
00a7d388	mov x0,x21
00a7d38c	bl 0x00c38ce0
00a7d390	cbz w0,0x00a7d3a4
00a7d394	mov x0,x21
00a7d398	bl 0x00c369a0
00a7d39c	mov x21,x0
00a7d3a0	cbz x0,0x00a7d41c
00a7d3a4	ldr x0,[x20, #0x18]
00a7d3a8	bl 0x00c322e0
00a7d3ac	str x21,[x20, #0x18]
00a7d3b0	ldur q0,[x19, #0x48]
00a7d3b4	ldr x0,[x20, #0x20]
00a7d3b8	adrp x1,0x2a4000
00a7d3bc	add x1,x1,#0x111
00a7d3c0	mov w2,#0xbb
00a7d3c4	stur q0,[x20, #0x48]
00a7d3c8	bl 0x00c32310
00a7d3cc	ldr x8,[x19, #0x28]
00a7d3d0	str x8,[x20, #0x28]
00a7d3d4	ldr x0,[x19, #0x20]
00a7d3d8	cbz x0,0x00a7d3fc
00a7d3dc	ldr x1,[x19, #0x28]
00a7d3e0	adrp x2,0x2a4000
00a7d3e4	add x2,x2,#0x111
00a7d3e8	mov w3,#0xbe
00a7d3ec	bl 0x00c345f0
00a7d3f0	str x0,[x20, #0x20]
00a7d3f4	cbnz x0,0x00a7d400
00a7d3f8	b 0x00a7d41c
00a7d3fc	str xzr,[x20, #0x20]
00a7d400	ldr q0,[x19, #0x30]
00a7d404	mov w0,#0x1
00a7d408	str q0,[x20, #0x30]
00a7d40c	ldr w8,[x19, #0x40]
00a7d410	str w8,[x20, #0x40]
00a7d414	ldr w8,[x19, #0x58]
00a7d418	str w8,[x20, #0x58]
00a7d41c	ldp x29,x30,[sp, #0x20]
00a7d420	ldp x20,x19,[sp, #0x10]
00a7d424	ldr x21,[sp], #0x30
00a7d428	ret
