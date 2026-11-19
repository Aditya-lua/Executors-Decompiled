; evp_cipher_param_to_asn1_ex @ 00a5e2ac
00a5e2ac	sub sp,sp,#0xd0
00a5e2b0	stp x29,x30,[sp, #0xc0]
00a5e2b4	add x29,sp,#0xc0
00a5e2b8	stp x20,x19,[sp, #0xb0]
00a5e2bc	stur x1,[x29, #-0x18]
00a5e2c0	ldr x8,[x0]
00a5e2c4	mov x20,x1
00a5e2c8	mov x19,x0
00a5e2cc	ldr x9,[x8, #0x40]
00a5e2d0	cbz x9,0x00a5e320
00a5e2d4	mov x0,x19
00a5e2d8	mov x1,x20
00a5e2dc	blr x9
00a5e2e0	mov w19,w0
00a5e2e4	cmn w0,#0x2
00a5e2e8	b.ne 0x00a5e4b4
00a5e2ec	bl 0x00c342a0
00a5e2f0	adrp x0,0x2a0000
00a5e2f4	adrp x2,0x2a7000
00a5e2f8	add x0,x0,#0x246
00a5e2fc	add x2,x2,#0xf85
00a5e300	mov w1,#0xa3
00a5e304	bl 0x00c342b0
00a5e308	orr w0,wzr,#0x6
00a5e30c	mov w1,#0x6b
00a5e310	mov x2,xzr
00a5e314	bl 0x00c342c0
00a5e318	mov w19,#0xffffffff
00a5e31c	b 0x00a5e4f0
00a5e320	ldr x9,[x8, #0x10]
00a5e324	tbnz w9,#0x18,0x00a5e3a0
00a5e328	mov w10,#0x7
00a5e32c	movk w10,#0xf, LSL #16
00a5e330	and w9,w9,w10
00a5e334	cmp w9,#0x10, LSL #12
00a5e338	b.le 0x00a5e480
00a5e33c	orr w10,wzr,#0x10001
00a5e340	cmp w9,w10
00a5e344	b.eq 0x00a5e2ec
00a5e348	mov w10,#0x3
00a5e34c	movk w10,#0x1, LSL #16
00a5e350	cmp w9,w10
00a5e354	b.eq 0x00a5e2ec
00a5e358	mov w10,#0x2
00a5e35c	movk w10,#0x1, LSL #16
00a5e360	cmp w9,w10
00a5e364	b.ne 0x00a5e490
00a5e368	ldr x0,[x8, #0x78]
00a5e36c	cbz x0,0x00a5e520
00a5e370	ldr w1,[x8, #0x60]
00a5e374	adrp x3,0x2c5000
00a5e378	add x3,x3,#0xa79
00a5e37c	mov x2,xzr
00a5e380	bl 0x00c3bf70
00a5e384	cbz w0,0x00a5e398
00a5e388	mov w1,#0x5
00a5e38c	mov x0,x20
00a5e390	mov x2,xzr
00a5e394	bl 0x00c37a60
00a5e398	mov w19,#0x1
00a5e39c	b 0x00a5e4f0
00a5e3a0	ldr x8,[x8, #0x78]
00a5e3a4	cbz x8,0x00a5e2ec
00a5e3a8	adrp x0,0x2b7000
00a5e3ac	add x0,x0,#0xcaa
00a5e3b0	add x8,sp,#0x8
00a5e3b4	mov x1,xzr
00a5e3b8	mov x2,xzr
00a5e3bc	bl 0x00c34c50
00a5e3c0	ldr x8,[sp, #0x28]
00a5e3c4	ldur q0,[sp, #0x18]
00a5e3c8	ldur q1,[sp, #0x8]
00a5e3cc	str x8,[sp, #0x50]
00a5e3d0	add x8,sp,#0x8
00a5e3d4	stp q1,q0,[sp, #0x30]
00a5e3d8	bl 0x00c34c40
00a5e3dc	ldr x8,[sp, #0x28]
00a5e3e0	ldur q0,[sp, #0x18]
00a5e3e4	ldur q1,[sp, #0x8]
00a5e3e8	add x1,sp,#0x30
00a5e3ec	mov x0,x19
00a5e3f0	str x8,[sp, #0x78]
00a5e3f4	stur q0,[sp, #0x68]
00a5e3f8	stur q1,[sp, #0x58]
00a5e3fc	bl 0x00c36d50
00a5e400	cbz w0,0x00a5e4b0
00a5e404	add x0,sp,#0x30
00a5e408	bl 0x00c3d030
00a5e40c	cbz w0,0x00a5e4a0
00a5e410	ldr x0,[sp, #0x50]
00a5e414	cbz x0,0x00a5e4a0
00a5e418	adrp x1,0x2a0000
00a5e41c	add x1,x1,#0x246
00a5e420	mov w2,#0x90
00a5e424	bl 0x00c32320
00a5e428	cbz x0,0x00a5e4a0
00a5e42c	ldr x8,[sp, #0x50]
00a5e430	mov x20,x0
00a5e434	stp x0,x8,[sp, #0x40]
00a5e438	add x0,sp,#0x30
00a5e43c	bl 0x00c3d040
00a5e440	add x1,sp,#0x30
00a5e444	mov x0,x19
00a5e448	str x20,[sp, #0x8]
00a5e44c	bl 0x00c36d50
00a5e450	cbz w0,0x00a5e558
00a5e454	add x0,sp,#0x30
00a5e458	bl 0x00c3d030
00a5e45c	mov w19,#0xffffffff
00a5e460	cbz w0,0x00a5e55c
00a5e464	ldr x2,[sp, #0x50]
00a5e468	sub x0,x29,#0x18
00a5e46c	add x1,sp,#0x8
00a5e470	bl 0x00c381b0
00a5e474	cmp x0,#0x0
00a5e478	cneg w19,w19,ne
00a5e47c	b 0x00a5e55c
00a5e480	cmp w9,#0x6
00a5e484	b.eq 0x00a5e504
00a5e488	cmp w9,#0x7
00a5e48c	b.eq 0x00a5e2ec
00a5e490	mov x0,x19
00a5e494	mov x1,x20
00a5e498	bl 0x00a5e9b0
00a5e49c	b 0x00a5e2e0
00a5e4a0	mov w19,#0xffffffff
00a5e4a4	cmp w19,#0x0
00a5e4a8	b.gt 0x00a5e4f0
00a5e4ac	b 0x00a5e4bc
00a5e4b0	mov w19,#0xffffffff
00a5e4b4	cmp w19,#0x0
00a5e4b8	b.gt 0x00a5e4f0
00a5e4bc	bl 0x00c342a0
00a5e4c0	adrp x0,0x2a0000
00a5e4c4	adrp x2,0x2a7000
00a5e4c8	add x0,x0,#0x246
00a5e4cc	add x2,x2,#0xf85
00a5e4d0	mov w1,#0xa5
00a5e4d4	bl 0x00c342b0
00a5e4d8	orr w0,wzr,#0x6
00a5e4dc	mov w1,#0x7a
00a5e4e0	mov x2,xzr
00a5e4e4	bl 0x00c342c0
00a5e4e8	cmn w19,#0x2
00a5e4ec	b.le 0x00a5e318
00a5e4f0	mov w0,w19
00a5e4f4	ldp x29,x30,[sp, #0xc0]
00a5e4f8	ldp x20,x19,[sp, #0xb0]
00a5e4fc	add sp,sp,#0xd0
00a5e500	ret
00a5e504	cbz x20,0x00a5e550
00a5e508	mov w19,wzr
00a5e50c	cbz x2,0x00a5e4bc
00a5e510	ldp w3,w1,[x2, #0x10]
00a5e514	mov x0,x20
00a5e518	bl 0x00c37dc0
00a5e51c	b 0x00a5e2e0
00a5e520	ldr x2,[x8, #0x68]
00a5e524	cbnz x2,0x00a5e534
00a5e528	ldr w0,[x8]
00a5e52c	bl 0x00c324f0
00a5e530	mov x2,x0
00a5e534	adrp x3,0x2c5000
00a5e538	add x3,x3,#0xa79
00a5e53c	mov x0,xzr
00a5e540	mov w1,wzr
00a5e544	bl 0x00c3bf70
00a5e548	cbnz w0,0x00a5e388
00a5e54c	b 0x00a5e398
00a5e550	mov w19,wzr
00a5e554	b 0x00a5e4bc
00a5e558	mov w19,#0xffffffff
00a5e55c	adrp x1,0x2a0000
00a5e560	add x1,x1,#0x246
00a5e564	mov w2,#0x9b
00a5e568	mov x0,x20
00a5e56c	bl 0x00c32310
00a5e570	cmp w19,#0x0
00a5e574	b.gt 0x00a5e4f0
00a5e578	b 0x00a5e4bc
