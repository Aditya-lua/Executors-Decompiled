; FUN_00a6d2f4 @ 00a6d2f4
00a6d2f4	sub sp,sp,#0x60
00a6d2f8	cmp x1,#0x0
00a6d2fc	add x8,sp,#0x8
00a6d300	stp x20,x19,[sp, #0x40]
00a6d304	cset w9,eq
00a6d308	csel x20,x8,xzr,eq
00a6d30c	cmp w2,#0x0
00a6d310	cset w8,eq
00a6d314	stp x26,x25,[sp, #0x10]
00a6d318	stp x24,x23,[sp, #0x20]
00a6d31c	stp x22,x21,[sp, #0x30]
00a6d320	mov x22,x5
00a6d324	mov w24,w4
00a6d328	mov x25,x3
00a6d32c	mov w21,w2
00a6d330	mov x23,x1
00a6d334	mov x19,x0
00a6d338	and w8,w9,w8
00a6d33c	stp x29,x30,[sp, #0x50]
00a6d340	add x29,sp,#0x50
00a6d344	str x1,[sp, #0x8]
00a6d348	tbnz w8,#0x0,0x00a6d37c
00a6d34c	cbz x22,0x00a6d37c
00a6d350	bl 0x00c342a0
00a6d354	adrp x0,0x2c1000
00a6d358	adrp x2,0x2bb000
00a6d35c	add x0,x0,#0xcf9
00a6d360	add x2,x2,#0xcb5
00a6d364	mov w1,#0x5e2
00a6d368	bl 0x00c342b0
00a6d36c	mov w1,#0x103
00a6d370	orr w0,wzr,#0x6
00a6d374	movk w1,#0xc, LSL #16
00a6d378	b 0x00a6d450
00a6d37c	cbz x19,0x00a6d3e0
00a6d380	ldr x8,[x19, #0x20]
00a6d384	cbnz x8,0x00a6d390
00a6d388	ldr x8,[x19, #0x68]
00a6d38c	cbz x8,0x00a6d4ec
00a6d390	mov w1,#0x1
00a6d394	mov x0,x19
00a6d398	bl 0x00c3d2e0
00a6d39c	mov x0,x19
00a6d3a0	bl 0x00a6f0e0
00a6d3a4	mov x26,x19
00a6d3a8	ldr x0,[x26, #0x60]!
00a6d3ac	cbz x0,0x00a6d3c4
00a6d3b0	ldr x1,[x19, #0x68]
00a6d3b4	bl 0x00c3b730
00a6d3b8	ldr x0,[x19, #0x60]
00a6d3bc	bl 0x00c36350
00a6d3c0	stp xzr,xzr,[x26]
00a6d3c4	str wzr,[x19]
00a6d3c8	ldr x0,[x19, #0x10]
00a6d3cc	bl 0x00c32360
00a6d3d0	ldr x0,[x19, #0x18]
00a6d3d4	str xzr,[x19, #0x10]
00a6d3d8	bl 0x00c32360
00a6d3dc	str xzr,[x19, #0x18]
00a6d3e0	cbz x25,0x00a6d400
00a6d3e4	mov x0,x20
00a6d3e8	mov x1,x25
00a6d3ec	mov w2,w24
00a6d3f0	bl 0x00c352c0
00a6d3f4	mov x24,x0
00a6d3f8	cbz x19,0x00a6d418
00a6d3fc	b 0x00a6d424
00a6d400	cbz w21,0x00a6d4a4
00a6d404	mov x0,x20
00a6d408	mov w1,w21
00a6d40c	bl 0x00c37b20
00a6d410	mov x24,x0
00a6d414	cbnz x19,0x00a6d424
00a6d418	cbnz x23,0x00a6d424
00a6d41c	ldr x0,[sp, #0x8]
00a6d420	bl 0x00c32360
00a6d424	cbnz x22,0x00a6d478
00a6d428	cbnz x24,0x00a6d478
00a6d42c	bl 0x00c342a0
00a6d430	adrp x0,0x2c1000
00a6d434	adrp x2,0x2bb000
00a6d438	add x0,x0,#0xcf9
00a6d43c	add x2,x2,#0xcb5
00a6d440	mov w1,#0x615
00a6d444	bl 0x00c342b0
00a6d448	orr w0,wzr,#0x6
00a6d44c	mov w1,#0x9c
00a6d450	mov x2,xzr
00a6d454	bl 0x00c342c0
00a6d458	mov w0,wzr
00a6d45c	ldp x29,x30,[sp, #0x50]
00a6d460	ldp x20,x19,[sp, #0x40]
00a6d464	ldp x22,x21,[sp, #0x30]
00a6d468	ldp x24,x23,[sp, #0x20]
00a6d46c	ldp x26,x25,[sp, #0x10]
00a6d470	add sp,sp,#0x60
00a6d474	ret
00a6d478	cbz x19,0x00a6d4e4
00a6d47c	cbz x22,0x00a6d4b0
00a6d480	mov x0,x22
00a6d484	bl 0x00c3b6f0
00a6d488	cbz w0,0x00a6d50c
00a6d48c	str x22,[x19, #0x60]
00a6d490	stp w21,w21,[x19]
00a6d494	cbz x24,0x00a6d4c0
00a6d498	cbnz w21,0x00a6d4c8
00a6d49c	ldr w8,[x24]
00a6d4a0	b 0x00a6d4c4
00a6d4a4	mov x24,xzr
00a6d4a8	cbz x19,0x00a6d418
00a6d4ac	b 0x00a6d424
00a6d4b0	str xzr,[x19, #0x60]
00a6d4b4	stp w21,w21,[x19]
00a6d4b8	str x24,[x19, #0x8]
00a6d4bc	cbnz x24,0x00a6d498
00a6d4c0	mov w8,#0xffffffff
00a6d4c4	str w8,[x19]
00a6d4c8	ldr x0,[sp, #0x8]
00a6d4cc	cbnz x20,0x00a6d4e0
00a6d4d0	cbz x0,0x00a6d4e0
00a6d4d4	bl 0x00c323b0
00a6d4d8	cbz w0,0x00a6d528
00a6d4dc	ldr x0,[sp, #0x8]
00a6d4e0	str x0,[x19, #0x10]
00a6d4e4	mov w0,#0x1
00a6d4e8	b 0x00a6d45c
00a6d4ec	ldr w8,[x19]
00a6d4f0	cbz w8,0x00a6d3c8
00a6d4f4	ldr w8,[x19, #0x4]
00a6d4f8	cmp w8,w21
00a6d4fc	b.ne 0x00a6d3c8
00a6d500	ldr x8,[x19, #0x8]
00a6d504	cbnz x8,0x00a6d4e4
00a6d508	b 0x00a6d3c8
00a6d50c	bl 0x00c342a0
00a6d510	adrp x0,0x2c1000
00a6d514	adrp x2,0x2bb000
00a6d518	add x0,x0,#0xcf9
00a6d51c	add x2,x2,#0xcb5
00a6d520	mov w1,#0x61b
00a6d524	b 0x00a6d368
00a6d528	bl 0x00c342a0
00a6d52c	adrp x0,0x2c1000
00a6d530	adrp x2,0x2bb000
00a6d534	add x0,x0,#0xcf9
00a6d538	add x2,x2,#0xcb5
00a6d53c	mov w1,#0x63d
00a6d540	bl 0x00c342b0
00a6d544	orr w0,wzr,#0x6
00a6d548	mov w1,#0x86
00a6d54c	b 0x00a6d450
