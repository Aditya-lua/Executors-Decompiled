; psa_aead_generate_nonce @ 00b8c264
00b8c264	sub sp,sp,#0x90
00b8c268	stp x28,x27,[sp, #0x30]
00b8c26c	stp x26,x25,[sp, #0x40]
00b8c270	stp x24,x23,[sp, #0x50]
00b8c274	stp x22,x21,[sp, #0x60]
00b8c278	stp x20,x19,[sp, #0x70]
00b8c27c	stp x29,x30,[sp, #0x80]
00b8c280	add x29,sp,#0x80
00b8c284	mrs x28,tpidr_el0
00b8c288	ldr x8,[x28, #0x28]
00b8c28c	mov x24,x3
00b8c290	mov x23,x2
00b8c294	mov x19,x1
00b8c298	mov x22,x0
00b8c29c	str x8,[sp, #0x28]
00b8c2a0	cbz x2,0x00b8c2d4
00b8c2a4	mov w1,#0x1
00b8c2a8	mov x0,x23
00b8c2ac	bl 0x00c30a30
00b8c2b0	mov x20,x0
00b8c2b4	mov x21,x23
00b8c2b8	cbnz x0,0x00b8c2e0
00b8c2bc	mov x19,xzr
00b8c2c0	mov x21,xzr
00b8c2c4	mov w23,#0xffffff73
00b8c2c8	ldr w8,[x22]
00b8c2cc	cbnz w8,0x00b8c4c8
00b8c2d0	b 0x00b8c4e8
00b8c2d4	mov x21,xzr
00b8c2d8	mov x20,xzr
00b8c2dc	mov x19,xzr
00b8c2e0	str xzr,[x24]
00b8c2e4	ldr w8,[x22]
00b8c2e8	cbz w8,0x00b8c33c
00b8c2ec	ldrb w8,[x22, #0x20]
00b8c2f0	and w8,w8,#0x11111111
00b8c2f4	cmp w8,#0x10
00b8c2f8	b.ne 0x00b8c348
00b8c2fc	ldrh w8,[x22, #0x8]
00b8c300	mov w9,#0x7700
00b8c304	mov w10,#0x2400
00b8c308	and w9,w8,w9
00b8c30c	cmp w9,w10
00b8c310	b.ne 0x00b8c358
00b8c314	ldr w8,[x22, #0x4]
00b8c318	mov w9,#0x100
00b8c31c	movk w9,#0x540, LSL #16
00b8c320	and w8,w8,#0xffc07fff
00b8c324	cmp w8,w9
00b8c328	b.ne 0x00b8c37c
00b8c32c	mov w10,#0xd
00b8c330	cmp x10,x23
00b8c334	b.hi 0x00b8c394
00b8c338	b 0x00b8c3a4
00b8c33c	mov w23,#0xffffff77
00b8c340	cbnz x20,0x00b8c4ec
00b8c344	b 0x00b8c514
00b8c348	mov w23,#0xffffff77
00b8c34c	ldr w8,[x22]
00b8c350	cbnz w8,0x00b8c4c8
00b8c354	b 0x00b8c4e8
00b8c358	mov w9,#0x2004
00b8c35c	cmp w8,w9
00b8c360	mov x10,xzr
00b8c364	b.ne 0x00b8c3a4
00b8c368	ldr w8,[x22, #0x4]
00b8c36c	mov w9,#0x500
00b8c370	movk w9,#0x500, LSL #16
00b8c374	and w8,w8,#0xffc07fff
00b8c378	b 0x00b8c380
00b8c37c	add w9,w9,#0x100
00b8c380	cmp w8,w9
00b8c384	orr w8,wzr,#0xc
00b8c388	csel x10,x8,xzr,eq
00b8c38c	cmp x10,x23
00b8c390	b.ls 0x00b8c3a4
00b8c394	mov w23,#0xffffff76
00b8c398	ldr w8,[x22]
00b8c39c	cbnz w8,0x00b8c4c8
00b8c3a0	b 0x00b8c4e8
00b8c3a4	adrp x8,0xd25000
00b8c3a8	add x8,x8,#0xb10
00b8c3ac	ldrb w9,[x8, #0x1]
00b8c3b0	mov w23,#0xffffff77
00b8c3b4	cmp w9,#0x2
00b8c3b8	b.ne 0x00b8c4c0
00b8c3bc	ldrb w9,[x8]
00b8c3c0	cmp w9,#0x7
00b8c3c4	b.ne 0x00b8c4c0
00b8c3c8	stp x10,x21,[sp, #0x8]
00b8c3cc	cbz x10,0x00b8c428
00b8c3d0	ldr x21,[sp, #0x8]
00b8c3d4	add x23,sp,#0x18
00b8c3d8	mov w25,#0x400
00b8c3dc	add x26,x8,#0x358
00b8c3e0	cmp x21,#0x400
00b8c3e4	csel x27,x21,x25,cc
00b8c3e8	mov x0,x26
00b8c3ec	mov x1,x23
00b8c3f0	mov x2,x27
00b8c3f4	bl 0x00c303a0
00b8c3f8	cbnz w0,0x00b8c40c
00b8c3fc	subs x21,x21,x27
00b8c400	add x23,x23,x27
00b8c404	b.ne 0x00b8c3e0
00b8c408	b 0x00b8c428
00b8c40c	bl 0x00c42bf0
00b8c410	mov w23,w0
00b8c414	cbz w0,0x00b8c428
00b8c418	ldr x21,[sp, #0x10]
00b8c41c	ldr w8,[x22]
00b8c420	cbnz w8,0x00b8c4c8
00b8c424	b 0x00b8c4e8
00b8c428	ldr w8,[x22]
00b8c42c	cbz w8,0x00b8c484
00b8c430	ldrb w9,[x22, #0x20]
00b8c434	tbnz w9,#0x0,0x00b8c494
00b8c438	ldr w9,[x22, #0x4]
00b8c43c	ldr x21,[sp, #0x10]
00b8c440	mov w10,#0x500
00b8c444	movk w10,#0x500, LSL #16
00b8c448	and w9,w9,#0xffc07fff
00b8c44c	cmp w9,w10
00b8c450	b.eq 0x00b8c548
00b8c454	ldr x25,[sp, #0x8]
00b8c458	mov w10,#0x100
00b8c45c	movk w10,#0x540, LSL #16
00b8c460	cmp w9,w10
00b8c464	b.eq 0x00b8c55c
00b8c468	mov w10,#0x200
00b8c46c	movk w10,#0x540, LSL #16
00b8c470	mov w23,#0xffffff79
00b8c474	cmp w9,w10
00b8c478	b.ne 0x00b8c49c
00b8c47c	cbnz x25,0x00b8c56c
00b8c480	b 0x00b8c49c
00b8c484	ldr x21,[sp, #0x10]
00b8c488	mov w23,#0xffffff77
00b8c48c	cbnz x20,0x00b8c4ec
00b8c490	b 0x00b8c514
00b8c494	ldr x21,[sp, #0x10]
00b8c498	mov w23,#0xffffff77
00b8c49c	cbz w8,0x00b8c4c0
00b8c4a0	cmp w8,#0x1
00b8c4a4	b.ne 0x00b8c4b0
00b8c4a8	add x0,x22,#0x28
00b8c4ac	bl 0x00c42db0
00b8c4b0	mov w2,#0x1d8
00b8c4b4	mov x0,x22
00b8c4b8	mov w1,wzr
00b8c4bc	bl 0x00c301c0
00b8c4c0	ldr w8,[x22]
00b8c4c4	cbz w8,0x00b8c4e8
00b8c4c8	cmp w8,#0x1
00b8c4cc	b.ne 0x00b8c4d8
00b8c4d0	add x0,x22,#0x28
00b8c4d4	bl 0x00c42db0
00b8c4d8	mov w2,#0x1d8
00b8c4dc	mov x0,x22
00b8c4e0	mov w1,wzr
00b8c4e4	bl 0x00c301c0
00b8c4e8	cbz x20,0x00b8c514
00b8c4ec	cbz x19,0x00b8c510
00b8c4f0	cbz x21,0x00b8c504
00b8c4f4	mov x0,x19
00b8c4f8	mov x1,x20
00b8c4fc	mov x2,x21
00b8c500	bl 0x00c2ffd0
00b8c504	mov x0,x20
00b8c508	bl 0x00c30960
00b8c50c	b 0x00b8c514
00b8c510	mov w23,#0xffffff69
00b8c514	ldr x8,[x28, #0x28]
00b8c518	ldr x9,[sp, #0x28]
00b8c51c	cmp x8,x9
00b8c520	b.ne 0x00b8c5c0
00b8c524	mov w0,w23
00b8c528	ldp x29,x30,[sp, #0x80]
00b8c52c	ldp x20,x19,[sp, #0x70]
00b8c530	ldp x22,x21,[sp, #0x60]
00b8c534	ldp x24,x23,[sp, #0x50]
00b8c538	ldp x26,x25,[sp, #0x40]
00b8c53c	ldp x28,x27,[sp, #0x30]
00b8c540	add sp,sp,#0x90
00b8c544	ret
00b8c548	ldr x25,[sp, #0x8]
00b8c54c	mov w23,#0xffffff79
00b8c550	cmp x25,#0xc
00b8c554	b.eq 0x00b8c56c
00b8c558	b 0x00b8c49c
00b8c55c	sub x9,x25,#0x7
00b8c560	cmp x9,#0x6
00b8c564	mov w23,#0xffffff79
00b8c568	b.hi 0x00b8c49c
00b8c56c	cmp w8,#0x1
00b8c570	b.ne 0x00b8c49c
00b8c574	add x0,x22,#0x28
00b8c578	add x1,sp,#0x18
00b8c57c	mov x2,x25
00b8c580	bl 0x00c42e20
00b8c584	mov w23,w0
00b8c588	cbz w0,0x00b8c598
00b8c58c	ldr w8,[x22]
00b8c590	cbnz w8,0x00b8c4a0
00b8c594	b 0x00b8c4c0
00b8c598	ldrb w8,[x22, #0x20]
00b8c59c	add x1,sp,#0x18
00b8c5a0	mov x0,x20
00b8c5a4	mov x2,x25
00b8c5a8	orr w8,w8,#0x1
00b8c5ac	strb w8,[x22, #0x20]
00b8c5b0	bl 0x00c2ffd0
00b8c5b4	str x25,[x24]
00b8c5b8	cbnz x20,0x00b8c4ec
00b8c5bc	b 0x00b8c514
00b8c5c0	bl 0x00c2fec0
