; FUN_00c1d1f8 @ 00c1d1f8
00c1d1f8	paciasp
00c1d1fc	stp x29,x30,[sp, #-0x30]!
00c1d200	stp x22,x21,[sp, #0x10]
00c1d204	stp x20,x19,[sp, #0x20]
00c1d208	mov x29,sp
00c1d20c	ldr x8,[x0, #0x18]
00c1d210	mov x20,x0
00c1d214	mov x19,x1
00c1d218	cmp x8,#0x4
00c1d21c	b.cc 0x00c1d32c
00c1d220	ldp x8,x10,[x19, #0x8]
00c1d224	ldr w11,[x19, #0x20]
00c1d228	ldr x0,[x19]
00c1d22c	add w11,w11,#0x1
00c1d230	add x9,x8,#0x1
00c1d234	str w11,[x19, #0x20]
00c1d238	cmp x9,x10
00c1d23c	b.ls 0x00c1d268
00c1d240	lsl x9,x10,#0x1
00c1d244	add x8,x8,#0x3e1
00c1d248	cmp x9,x8
00c1d24c	csel x1,x9,x8,hi
00c1d250	str x1,[x19, #0x10]
00c1d254	bl 0x00c30950
00c1d258	str x0,[x19]
00c1d25c	cbz x0,0x00c1d4c0
00c1d260	ldr x8,[x19, #0x8]
00c1d264	add x9,x8,#0x1
00c1d268	str x9,[x19, #0x8]
00c1d26c	mov w9,#0x28
00c1d270	strb w9,[x0, x8]
00c1d274	ldr x21,[x20, #0x18]
00c1d278	ldr x8,[x19, #0x8]
00c1d27c	cbz x21,0x00c1d2d8
00c1d280	ldr x10,[x19, #0x10]
00c1d284	add x9,x8,x21
00c1d288	ldr x22,[x20, #0x10]
00c1d28c	ldr x0,[x19]
00c1d290	cmp x9,x10
00c1d294	b.ls 0x00c1d2bc
00c1d298	lsl x8,x10,#0x1
00c1d29c	add x9,x9,#0x3e0
00c1d2a0	cmp x8,x9
00c1d2a4	csel x1,x8,x9,hi
00c1d2a8	str x1,[x19, #0x10]
00c1d2ac	bl 0x00c30950
00c1d2b0	str x0,[x19]
00c1d2b4	cbz x0,0x00c1d4cc
00c1d2b8	ldr x8,[x19, #0x8]
00c1d2bc	add x0,x0,x8
00c1d2c0	mov x1,x22
00c1d2c4	mov x2,x21
00c1d2c8	bl 0x00c2ffd0
00c1d2cc	ldr x8,[x19, #0x8]
00c1d2d0	add x8,x8,x21
00c1d2d4	str x8,[x19, #0x8]
00c1d2d8	ldr w11,[x19, #0x20]
00c1d2dc	ldr x10,[x19, #0x10]
00c1d2e0	add x9,x8,#0x1
00c1d2e4	ldr x0,[x19]
00c1d2e8	sub w11,w11,#0x1
00c1d2ec	cmp x9,x10
00c1d2f0	str w11,[x19, #0x20]
00c1d2f4	b.ls 0x00c1d320
00c1d2f8	lsl x9,x10,#0x1
00c1d2fc	add x8,x8,#0x3e1
00c1d300	cmp x9,x8
00c1d304	csel x1,x9,x8,hi
00c1d308	str x1,[x19, #0x10]
00c1d30c	bl 0x00c30950
00c1d310	str x0,[x19]
00c1d314	cbz x0,0x00c1d4c8
00c1d318	ldr x8,[x19, #0x8]
00c1d31c	add x9,x8,#0x1
00c1d320	str x9,[x19, #0x8]
00c1d324	mov w9,#0x29
00c1d328	strb w9,[x0, x8]
00c1d32c	ldr x21,[x20, #0x20]
00c1d330	ldrb w8,[x21]
00c1d334	cmp w8,#0x6e
00c1d338	b.ne 0x00c1d3e8
00c1d33c	ldp x8,x10,[x19, #0x8]
00c1d340	ldr x0,[x19]
00c1d344	add x9,x8,#0x1
00c1d348	cmp x9,x10
00c1d34c	b.ls 0x00c1d378
00c1d350	lsl x9,x10,#0x1
00c1d354	add x8,x8,#0x3e1
00c1d358	cmp x9,x8
00c1d35c	csel x1,x9,x8,hi
00c1d360	str x1,[x19, #0x10]
00c1d364	bl 0x00c30950
00c1d368	str x0,[x19]
00c1d36c	cbz x0,0x00c1d4c4
00c1d370	ldr x8,[x19, #0x8]
00c1d374	add x9,x8,#0x1
00c1d378	str x9,[x19, #0x8]
00c1d37c	mov w9,#0x2d
00c1d380	strb w9,[x0, x8]
00c1d384	ldr x8,[x20, #0x28]
00c1d388	subs x21,x8,#0x1
00c1d38c	b.eq 0x00c1d444
00c1d390	ldp x8,x9,[x19, #0x8]
00c1d394	ldr x0,[x19]
00c1d398	ldr x22,[x20, #0x20]
00c1d39c	add x10,x8,x21
00c1d3a0	cmp x10,x9
00c1d3a4	b.ls 0x00c1d3cc
00c1d3a8	lsl x8,x9,#0x1
00c1d3ac	add x9,x10,#0x3e0
00c1d3b0	cmp x8,x9
00c1d3b4	csel x1,x8,x9,hi
00c1d3b8	str x1,[x19, #0x10]
00c1d3bc	bl 0x00c30950
00c1d3c0	str x0,[x19]
00c1d3c4	cbz x0,0x00c1d4d4
00c1d3c8	ldr x8,[x19, #0x8]
00c1d3cc	add x0,x0,x8
00c1d3d0	add x1,x22,#0x1
00c1d3d4	mov x2,x21
00c1d3d8	bl 0x00c2ffd0
00c1d3dc	ldr x8,[x19, #0x8]
00c1d3e0	add x8,x8,x21
00c1d3e4	b 0x00c1d440
00c1d3e8	ldr x22,[x20, #0x28]
00c1d3ec	cbz x22,0x00c1d444
00c1d3f0	ldp x8,x9,[x19, #0x8]
00c1d3f4	ldr x0,[x19]
00c1d3f8	add x10,x8,x22
00c1d3fc	cmp x10,x9
00c1d400	b.ls 0x00c1d428
00c1d404	lsl x8,x9,#0x1
00c1d408	add x9,x10,#0x3e0
00c1d40c	cmp x8,x9
00c1d410	csel x1,x8,x9,hi
00c1d414	str x1,[x19, #0x10]
00c1d418	bl 0x00c30950
00c1d41c	str x0,[x19]
00c1d420	cbz x0,0x00c1d4d0
00c1d424	ldr x8,[x19, #0x8]
00c1d428	add x0,x0,x8
00c1d42c	mov x1,x21
00c1d430	mov x2,x22
00c1d434	bl 0x00c2ffd0
00c1d438	ldr x8,[x19, #0x8]
00c1d43c	add x8,x8,x22
00c1d440	str x8,[x19, #0x8]
00c1d444	ldr x21,[x20, #0x18]
00c1d448	cmp x21,#0x3
00c1d44c	b.hi 0x00c1d4ac
00c1d450	cbz x21,0x00c1d4ac
00c1d454	ldp x8,x9,[x19, #0x8]
00c1d458	ldr x0,[x19]
00c1d45c	ldr x20,[x20, #0x10]
00c1d460	add x10,x8,x21
00c1d464	cmp x10,x9
00c1d468	b.ls 0x00c1d490
00c1d46c	lsl x8,x9,#0x1
00c1d470	add x9,x10,#0x3e0
00c1d474	cmp x8,x9
00c1d478	csel x1,x8,x9,hi
00c1d47c	str x1,[x19, #0x10]
00c1d480	bl 0x00c30950
00c1d484	str x0,[x19]
00c1d488	cbz x0,0x00c1d4d8
00c1d48c	ldr x8,[x19, #0x8]
00c1d490	add x0,x0,x8
00c1d494	mov x1,x20
00c1d498	mov x2,x21
00c1d49c	bl 0x00c2ffd0
00c1d4a0	ldr x8,[x19, #0x8]
00c1d4a4	add x8,x8,x21
00c1d4a8	str x8,[x19, #0x8]
00c1d4ac	ldp x20,x19,[sp, #0x20]
00c1d4b0	ldp x22,x21,[sp, #0x10]
00c1d4b4	ldp x29,x30,[sp], #0x30
00c1d4b8	autiasp
00c1d4bc	ret
00c1d4c0	bl 0x00c30b40
00c1d4c4	bl 0x00c30b40
00c1d4c8	bl 0x00c30b40
00c1d4cc	bl 0x00c30b40
00c1d4d0	bl 0x00c30b40
00c1d4d4	bl 0x00c30b40
00c1d4d8	bl 0x00c30b40
