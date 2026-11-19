; FUN_00a8b340 @ 00a8b340
00a8b340	stp x24,x23,[sp, #-0x40]!
00a8b344	stp x22,x21,[sp, #0x10]
00a8b348	stp x20,x19,[sp, #0x20]
00a8b34c	stp x29,x30,[sp, #0x30]
00a8b350	add x29,sp,#0x30
00a8b354	mov x20,x3
00a8b358	mov x23,x2
00a8b35c	mov x22,x1
00a8b360	mov x21,x0
00a8b364	bl 0x00c3cea0
00a8b368	ldr w8,[x0, #0x118]
00a8b36c	cbz w8,0x00a8b508
00a8b370	ldr w8,[x0, #0x2ec]
00a8b374	mov x19,x0
00a8b378	tbnz w8,#0x1f,0x00a8b400
00a8b37c	mov x0,x21
00a8b380	bl 0x00c3cea0
00a8b384	mov x19,x0
00a8b388	cmp x22,x23
00a8b38c	mov w0,#0xffffffff
00a8b390	b.ne 0x00a8b50c
00a8b394	subs x22,x20,#0x18
00a8b398	b.cc 0x00a8b50c
00a8b39c	mov x0,x21
00a8b3a0	bl 0x00c3cec0
00a8b3a4	cmp w0,#0x0
00a8b3a8	mov w8,#0x13
00a8b3ac	orr w9,wzr,#0x18
00a8b3b0	csel w1,w9,w8,eq
00a8b3b4	mov w2,#0x8
00a8b3b8	mov x0,x21
00a8b3bc	mov x3,x23
00a8b3c0	bl 0x00c361b0
00a8b3c4	cmp w0,#0x0
00a8b3c8	b.le 0x00a8b3ec
00a8b3cc	mov x0,x21
00a8b3d0	add x24,x19,#0x120
00a8b3d4	bl 0x00c3ce90
00a8b3d8	ldrsw x2,[x19, #0x2ec]
00a8b3dc	mov x1,x0
00a8b3e0	mov x0,x24
00a8b3e4	bl 0x00c3e330
00a8b3e8	cbz w0,0x00a8b478
00a8b3ec	mov w0,#0xffffffff
00a8b3f0	mov w8,#0xffffffff
00a8b3f4	str wzr,[x19, #0x11c]
00a8b3f8	str w8,[x19, #0x2ec]
00a8b3fc	b 0x00a8b50c
00a8b400	ldr w8,[x19, #0x11c]
00a8b404	cbz w8,0x00a8b508
00a8b408	cbz x23,0x00a8b43c
00a8b40c	cbz x22,0x00a8b4b8
00a8b410	mov x0,x21
00a8b414	bl 0x00c3cec0
00a8b418	mov w8,w0
00a8b41c	add x0,x19,#0x120
00a8b420	mov x1,x23
00a8b424	mov x2,x22
00a8b428	mov x3,x20
00a8b42c	cbz w8,0x00a8b4d0
00a8b430	bl 0x00c3e360
00a8b434	cbnz w0,0x00a8b508
00a8b438	b 0x00a8b4d8
00a8b43c	mov x0,x21
00a8b440	bl 0x00c3cec0
00a8b444	cbz w0,0x00a8b4e0
00a8b448	mov x0,x21
00a8b44c	add x20,x19,#0x120
00a8b450	bl 0x00c3ce90
00a8b454	mov x1,x0
00a8b458	mov w2,#0x10
00a8b45c	mov x0,x20
00a8b460	mov w21,#0x10
00a8b464	bl 0x00c3e3b0
00a8b468	mov w0,wzr
00a8b46c	str w21,[x19, #0x2e4]
00a8b470	str wzr,[x19, #0x11c]
00a8b474	b 0x00a8b50c
00a8b478	mov x0,x21
00a8b47c	add x23,x23,#0x8
00a8b480	bl 0x00c3cec0
00a8b484	cbz w0,0x00a8b520
00a8b488	mov x0,x24
00a8b48c	mov x1,x23
00a8b490	mov x2,x23
00a8b494	mov x3,x22
00a8b498	bl 0x00c3e360
00a8b49c	cbnz w0,0x00a8b3ec
00a8b4a0	add x1,x23,x22
00a8b4a4	mov w2,#0x10
00a8b4a8	mov x0,x24
00a8b4ac	bl 0x00c3e3b0
00a8b4b0	mov w0,w20
00a8b4b4	b 0x00a8b3f0
00a8b4b8	add x0,x19,#0x120
00a8b4bc	mov x1,x23
00a8b4c0	mov x2,x20
00a8b4c4	bl 0x00c3e330
00a8b4c8	cbnz w0,0x00a8b508
00a8b4cc	b 0x00a8b4d8
00a8b4d0	bl 0x00c3e340
00a8b4d4	cbnz w0,0x00a8b508
00a8b4d8	mov w0,w20
00a8b4dc	b 0x00a8b50c
00a8b4e0	ldr w8,[x19, #0x2e4]
00a8b4e4	tbnz w8,#0x1f,0x00a8b508
00a8b4e8	mov x0,x21
00a8b4ec	add x20,x19,#0x120
00a8b4f0	bl 0x00c3ce90
00a8b4f4	ldrsw x2,[x19, #0x2e4]
00a8b4f8	mov x1,x0
00a8b4fc	mov x0,x20
00a8b500	bl 0x00c3e380
00a8b504	cbz w0,0x00a8b470
00a8b508	mov w0,#0xffffffff
00a8b50c	ldp x29,x30,[sp, #0x30]
00a8b510	ldp x20,x19,[sp, #0x20]
00a8b514	ldp x22,x21,[sp, #0x10]
00a8b518	ldp x24,x23,[sp], #0x40
00a8b51c	ret
00a8b520	mov x0,x24
00a8b524	mov x1,x23
00a8b528	mov x2,x23
00a8b52c	mov x3,x22
00a8b530	bl 0x00c3e340
00a8b534	cbnz w0,0x00a8b3ec
00a8b538	mov x0,x21
00a8b53c	bl 0x00c3ce90
00a8b540	mov x1,x0
00a8b544	mov w2,#0x10
00a8b548	mov x0,x24
00a8b54c	bl 0x00c3e3b0
00a8b550	mov x0,x21
00a8b554	bl 0x00c3ce90
00a8b558	add x1,x23,x22
00a8b55c	mov w2,#0x10
00a8b560	bl 0x00c362f0
00a8b564	cbz w0,0x00a8b578
00a8b568	mov x0,x23
00a8b56c	mov x1,x22
00a8b570	bl 0x00c34750
00a8b574	b 0x00a8b3ec
00a8b578	mov w0,w22
00a8b57c	b 0x00a8b3f0
