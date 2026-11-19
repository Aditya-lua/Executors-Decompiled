; FUN_00b4d1d0 @ 00b4d1d0
00b4d1d0	str x23,[sp, #-0x40]!
00b4d1d4	stp x22,x21,[sp, #0x10]
00b4d1d8	stp x20,x19,[sp, #0x20]
00b4d1dc	stp x29,x30,[sp, #0x30]
00b4d1e0	add x29,sp,#0x30
00b4d1e4	cbz x0,0x00b4d488
00b4d1e8	mov x20,x1
00b4d1ec	cbz x1,0x00b4d484
00b4d1f0	adrp x1,0x2ce000
00b4d1f4	mov x19,x0
00b4d1f8	add x1,x1,#0xcd9
00b4d1fc	mov x0,x20
00b4d200	bl 0x00c36530
00b4d204	cbz x0,0x00b4d2bc
00b4d208	ldr w8,[x0, #0x8]
00b4d20c	cmp w8,#0x4
00b4d210	b.ne 0x00b4d25c
00b4d214	ldr x21,[x0, #0x10]
00b4d218	adrp x0,0x2c1000
00b4d21c	add x0,x0,#0x1ad
00b4d220	mov x1,x21
00b4d224	bl 0x00c35ee0
00b4d228	cbz w0,0x00b4d294
00b4d22c	adrp x0,0x2c9000
00b4d230	add x0,x0,#0xa44
00b4d234	mov x1,x21
00b4d238	bl 0x00c35ee0
00b4d23c	cbz w0,0x00b4d29c
00b4d240	adrp x0,0x2a6000
00b4d244	add x0,x0,#0x2d
00b4d248	mov x1,x21
00b4d24c	bl 0x00c35ee0
00b4d250	cbz w0,0x00b4d2a4
00b4d254	mov w8,#0xffffffff
00b4d258	str w8,[x19, #0x3c]
00b4d25c	bl 0x00c342a0
00b4d260	adrp x0,0x2b3000
00b4d264	adrp x2,0x2ac000
00b4d268	add x0,x0,#0x30
00b4d26c	add x2,x2,#0xb2a
00b4d270	mov w1,#0x1dc
00b4d274	bl 0x00c342b0
00b4d278	mov w1,#0x106
00b4d27c	mov w0,#0x39
00b4d280	movk w1,#0x8, LSL #16
00b4d284	mov x2,xzr
00b4d288	bl 0x00c342c0
00b4d28c	mov w0,wzr
00b4d290	b 0x00b4d488
00b4d294	mov x8,xzr
00b4d298	b 0x00b4d2a8
00b4d29c	mov w8,#0x1
00b4d2a0	b 0x00b4d2a8
00b4d2a4	mov w8,#0x2
00b4d2a8	adrp x9,0xc9e000
00b4d2ac	add x9,x9,#0x8f8
00b4d2b0	add x8,x9,x8, LSL #0x4
00b4d2b4	ldr w8,[x8, #0x8]
00b4d2b8	str w8,[x19, #0x3c]
00b4d2bc	adrp x1,0x2a7000
00b4d2c0	add x1,x1,#0xf40
00b4d2c4	mov x0,x20
00b4d2c8	bl 0x00c36530
00b4d2cc	cbz x0,0x00b4d2dc
00b4d2d0	add x1,x19,#0x38
00b4d2d4	bl 0x00c36510
00b4d2d8	cbz w0,0x00b4d488
00b4d2dc	adrp x1,0x2d9000
00b4d2e0	add x1,x1,#0xd90
00b4d2e4	mov x0,x20
00b4d2e8	bl 0x00c36530
00b4d2ec	cbz x0,0x00b4d2fc
00b4d2f0	add x1,x19,#0x40
00b4d2f4	bl 0x00c36510
00b4d2f8	cbz w0,0x00b4d488
00b4d2fc	adrp x1,0x2a4000
00b4d300	add x1,x1,#0x10a
00b4d304	mov x0,x20
00b4d308	bl 0x00c36530
00b4d30c	cbz x0,0x00b4d31c
00b4d310	add x1,x19,#0x44
00b4d314	bl 0x00c36510
00b4d318	cbz w0,0x00b4d488
00b4d31c	adrp x1,0x2bb000
00b4d320	add x1,x1,#0x864
00b4d324	mov x0,x20
00b4d328	bl 0x00c36530
00b4d32c	cbz x0,0x00b4d394
00b4d330	ldr w9,[x0, #0x8]
00b4d334	mov x8,x0
00b4d338	mov w0,wzr
00b4d33c	cmp w9,#0x5
00b4d340	b.ne 0x00b4d488
00b4d344	mov x23,x19
00b4d348	ldp x22,x21,[x8, #0x10]
00b4d34c	ldr x0,[x23, #0x28]!
00b4d350	adrp x2,0x2b3000
00b4d354	add x2,x2,#0x30
00b4d358	mov w3,#0x1c1
00b4d35c	ldr x1,[x23, #0x8]
00b4d360	bl 0x00c345e0
00b4d364	stp xzr,xzr,[x23]
00b4d368	cbz x22,0x00b4d394
00b4d36c	cbz x21,0x00b4d394
00b4d370	adrp x2,0x2b3000
00b4d374	add x2,x2,#0x30
00b4d378	mov w3,#0x1c5
00b4d37c	mov x0,x22
00b4d380	mov x1,x21
00b4d384	bl 0x00c345f0
00b4d388	str x0,[x23]
00b4d38c	cbz x0,0x00b4d488
00b4d390	str x21,[x19, #0x30]
00b4d394	adrp x1,0x2aa000
00b4d398	add x1,x1,#0x16b
00b4d39c	mov x0,x20
00b4d3a0	bl 0x00c36530
00b4d3a4	cbz x0,0x00b4d3b4
00b4d3a8	add x1,x19,#0x18
00b4d3ac	bl 0x00c3e920
00b4d3b0	cbz w0,0x00b4d488
00b4d3b4	adrp x1,0x2db000
00b4d3b8	add x1,x1,#0xfc2
00b4d3bc	mov x0,x20
00b4d3c0	bl 0x00c36530
00b4d3c4	cbz x0,0x00b4d3d4
00b4d3c8	add x1,x19,#0x20
00b4d3cc	bl 0x00c3e920
00b4d3d0	cbz w0,0x00b4d488
00b4d3d4	adrp x1,0x29d000
00b4d3d8	add x1,x1,#0xe2e
00b4d3dc	mov x0,x20
00b4d3e0	bl 0x00c36530
00b4d3e4	cbz x0,0x00b4d42c
00b4d3e8	ldr w8,[x0, #0x8]
00b4d3ec	mov x21,x0
00b4d3f0	mov w0,wzr
00b4d3f4	cmp w8,#0x4
00b4d3f8	b.ne 0x00b4d488
00b4d3fc	ldr x0,[x19, #0x48]
00b4d400	adrp x22,0x2b3000
00b4d404	add x22,x22,#0x30
00b4d408	mov w2,#0x1fb
00b4d40c	mov x1,x22
00b4d410	bl 0x00c32310
00b4d414	ldr x0,[x21, #0x10]
00b4d418	orr w2,wzr,#0x1fc
00b4d41c	mov x1,x22
00b4d420	bl 0x00c34600
00b4d424	str x0,[x19, #0x48]
00b4d428	cbz x0,0x00b4d488
00b4d42c	adrp x1,0x2d3000
00b4d430	add x1,x1,#0x7c2
00b4d434	mov x0,x20
00b4d438	bl 0x00c36530
00b4d43c	cbz x0,0x00b4d484
00b4d440	ldr w8,[x0, #0x8]
00b4d444	mov x20,x0
00b4d448	mov w0,wzr
00b4d44c	cmp w8,#0x4
00b4d450	b.ne 0x00b4d488
00b4d454	ldr x0,[x19, #0x50]
00b4d458	adrp x21,0x2b3000
00b4d45c	add x21,x21,#0x30
00b4d460	mov w2,#0x204
00b4d464	mov x1,x21
00b4d468	bl 0x00c32310
00b4d46c	ldr x0,[x20, #0x10]
00b4d470	mov w2,#0x205
00b4d474	mov x1,x21
00b4d478	bl 0x00c34600
00b4d47c	str x0,[x19, #0x50]
00b4d480	cbz x0,0x00b4d488
00b4d484	mov w0,#0x1
00b4d488	ldp x29,x30,[sp, #0x30]
00b4d48c	ldp x20,x19,[sp, #0x20]
00b4d490	ldp x22,x21,[sp, #0x10]
00b4d494	ldr x23,[sp], #0x40
00b4d498	ret
