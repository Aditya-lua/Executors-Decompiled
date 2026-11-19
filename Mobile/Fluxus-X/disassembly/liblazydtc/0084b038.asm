; FUN_0084b038 @ 0084b038
0084b038	sub sp,sp,#0x150
0084b03c	stp x29,x30,[sp, #0xf0]
0084b040	stp x28,x27,[sp, #0x100]
0084b044	stp x26,x25,[sp, #0x110]
0084b048	stp x24,x23,[sp, #0x120]
0084b04c	stp x22,x21,[sp, #0x130]
0084b050	stp x20,x19,[sp, #0x140]
0084b054	add x29,sp,#0xf0
0084b058	str w4,[sp, #0x3c]
0084b05c	movi v0.2D,#0x0
0084b060	str x2,[sp, #0x18]
0084b064	mrs x22,tpidr_el0
0084b068	ldr x8,[x22, #0x28]
0084b06c	stur x8,[x29, #-0x18]
0084b070	ldr x20,[x0, #0x28]
0084b074	stp q0,q0,[sp, #0x50]
0084b078	str q0,[sp, #0x40]
0084b07c	cbz x20,0x0084b1a4
0084b080	mov w23,w5
0084b084	mov x25,x3
0084b088	mov x24,x0
0084b08c	mov x21,x1
0084b090	add x19,sp,#0x78
0084b094	str wzr,[sp, #0x78]
0084b098	stp q0,q0,[sp, #0x80]
0084b09c	stp q0,q0,[sp, #0xa0]
0084b0a0	stur q0,[x19, #0x48]
0084b0a4	stur xzr,[x19, #0x55]
0084b0a8	add x0,sp,#0x40
0084b0ac	str x22,[sp, #0x8]
0084b0b0	bl 0x0084c130
0084b0b4	ldp x9,x8,[sp, #0x60]
0084b0b8	mov x26,#0xc30d
0084b0bc	movk x26,#0xc30, LSL #16
0084b0c0	mov w11,#0x2a
0084b0c4	ldr x10,[sp, #0x48]
0084b0c8	movk x26,#0x30c3, LSL #32
0084b0cc	mov w12,#0x60
0084b0d0	ldur q0,[sp, #0x88]
0084b0d4	add x8,x8,x9
0084b0d8	movk x26,#0xc30c, LSL #48
0084b0dc	ldur q1,[sp, #0x78]
0084b0e0	lsr x9,x8,#0x1
0084b0e4	str x25,[sp]
0084b0e8	umulh x9,x9,x26
0084b0ec	lsr x9,x9,#0x4
0084b0f0	msub x8,x9,x11,x8
0084b0f4	ldr x9,[x10, x9, LSL #0x3]
0084b0f8	nop
0084b0fc	madd x8,x8,x12,x9
0084b100	stp q1,q0,[x8]
0084b104	stp xzr,xzr,[x8, #0x28]
0084b108	str xzr,[x8, #0x20]
0084b10c	stp xzr,xzr,[sp, #0x98]
0084b110	str xzr,[sp, #0xa8]
0084b114	stp xzr,xzr,[x8, #0x38]
0084b118	str xzr,[x8, #0x48]
0084b11c	ldur x9,[x19, #0x55]
0084b120	ldr x10,[sp, #0xc8]
0084b124	stp xzr,xzr,[sp, #0xb0]
0084b128	str xzr,[sp, #0xc0]
0084b12c	stur x9,[x8, #0x55]
0084b130	str x10,[x8, #0x50]
0084b134	ldp x10,x8,[sp, #0x60]
0084b138	ldr x9,[sp, #0x48]
0084b13c	add x13,x8,x10
0084b140	add x8,x8,#0x1
0084b144	lsr x14,x13,#0x1
0084b148	str x8,[sp, #0x68]
0084b14c	umulh x14,x14,x26
0084b150	lsr x14,x14,#0x4
0084b154	msub x11,x14,x11,x13
0084b158	ldr x13,[x9, x14, LSL #0x3]
0084b15c	nop
0084b160	madd x11,x11,x12,x13
0084b164	mov x0,x11
0084b168	ldr x13,[x11, #0x40]
0084b16c	ldr x12,[x0, #0x38]!
0084b170	sub x14,x13,x12
0084b174	ldr w13,[x24, #0x20]
0084b178	str wzr,[x11]
0084b17c	asr x14,x14,#0x4
0084b180	stp x21,x21,[x11, #0x8]
0084b184	subs x1,x13,x14
0084b188	ldr x14,[sp, #0x18]
0084b18c	str x14,[x11, #0x18]
0084b190	b.ls 0x0084b1ac
0084b194	bl 0x00844cfc
0084b198	ldp x10,x8,[sp, #0x60]
0084b19c	ldr x9,[sp, #0x48]
0084b1a0	b 0x0084b1b8
0084b1a4	mov w19,wzr
0084b1a8	b 0x0084b684
0084b1ac	b.cs 0x0084b1b8
0084b1b0	add x12,x12,x13, LSL #0x4
0084b1b4	str x12,[x11, #0x40]
0084b1b8	add x10,x8,x10
0084b1bc	mov w27,#0x2a
0084b1c0	mov w28,#0x60
0084b1c4	sub x10,x10,#0x1
0084b1c8	mov w19,wzr
0084b1cc	mov w24,wzr
0084b1d0	lsr x11,x10,#0x1
0084b1d4	mov x22,xzr
0084b1d8	add x25,sp,#0x78
0084b1dc	str x21,[sp, #0x10]
0084b1e0	umulh x11,x11,x26
0084b1e4	lsr x11,x11,#0x4
0084b1e8	msub x10,x11,x27,x10
0084b1ec	ldr x9,[x9, x11, LSL #0x3]
0084b1f0	adrp x11,0x29c000
0084b1f4	ldr q0,[x11, #0x370]
0084b1f8	str q0,[sp, #0x20]
0084b1fc	nop
0084b200	madd x9,x10,x28,x9
0084b204	and w10,w23,#0x1
0084b208	strb w10,[x9, #0x5c]
0084b20c	ldr x10,[sp, #0x18]
0084b210	str x20,[x9, #0x50]
0084b214	sub x20,x10,x21
0084b218	ldr w10,[sp, #0x3c]
0084b21c	str w10,[x9, #0x58]
0084b220	b 0x0084b29c
0084b224	ldp q1,q0,[x23]
0084b228	stp xzr,xzr,[x8, #-0x38]
0084b22c	stur xzr,[x8, #-0x40]
0084b230	stp q1,q0,[x8, #-0x60]
0084b234	ldr q1,[sp, #0x20]
0084b238	ldr q0,[x23, #0x20]
0084b23c	stur q0,[x8, #-0x40]
0084b240	ldr x9,[x23, #0x30]
0084b244	stur x9,[x8, #-0x30]
0084b248	stp xzr,xzr,[x23, #0x20]
0084b24c	str xzr,[x23, #0x30]
0084b250	stp xzr,xzr,[x8, #-0x28]
0084b254	stur xzr,[x8, #-0x18]
0084b258	ldur q0,[x23, #0x38]
0084b25c	stur q0,[x8, #-0x28]
0084b260	ldr x9,[x23, #0x48]
0084b264	stur x9,[x8, #-0x18]
0084b268	ldur x9,[x21, #0x5]
0084b26c	ldr x10,[x21]
0084b270	stp xzr,xzr,[x23, #0x38]
0084b274	str xzr,[x23, #0x48]
0084b278	stur x9,[x8, #-0xb]
0084b27c	stur x10,[x8, #-0x10]
0084b280	ldr q0,[sp, #0x60]
0084b284	add v0.2D,v0.2D,v1.2D
0084b288	str q0,[sp, #0x60]
0084b28c	add x0,sp,#0x40
0084b290	bl 0x0084be60
0084b294	ldr x8,[sp, #0x68]
0084b298	cbz x8,0x0084b658
0084b29c	add w24,w24,#0x1
0084b2a0	tst w24,#0xfff
0084b2a4	b.ne 0x0084b2b4
0084b2a8	lsr w9,w24,#0xc
0084b2ac	cmp w9,w20
0084b2b0	b.ge 0x0084b764
0084b2b4	ldr x9,[sp, #0x60]
0084b2b8	ldr x10,[sp, #0x48]
0084b2bc	add x8,x8,x9
0084b2c0	sub x8,x8,#0x1
0084b2c4	lsr x9,x8,#0x1
0084b2c8	umulh x9,x9,x26
0084b2cc	lsr x9,x9,#0x4
0084b2d0	msub x8,x9,x27,x8
0084b2d4	ldr x9,[x10, x9, LSL #0x3]
0084b2d8	nop
0084b2dc	madd x23,x8,x28,x9
0084b2e0	mov x21,x23
0084b2e4	ldr x0,[x21, #0x50]!
0084b2e8	cbz x0,0x0084b2fc
0084b2ec	ldr x8,[x0]
0084b2f0	ldr x8,[x8, #0x10]
0084b2f4	mov x1,x23
0084b2f8	blr x8
0084b2fc	ldr w8,[x23]
0084b300	cmn w8,#0x3e3
0084b304	b.le 0x0084b324
0084b308	cmn w8,#0x3e1
0084b30c	b.gt 0x0084b390
0084b310	cmn w8,#0x3e2
0084b314	b.eq 0x0084b294
0084b318	cmn w8,#0x3e1
0084b31c	b.eq 0x0084b28c
0084b320	b 0x0084b77c
0084b324	cmn w8,#0x3e8
0084b328	b.eq 0x0084b3a4
0084b32c	cmn w8,#0x3e7
0084b330	b.eq 0x0084b294
0084b334	cmn w8,#0x3e3
0084b338	b.ne 0x0084b77c
0084b33c	ldr x8,[sp, #0x60]
0084b340	cbnz x8,0x0084b350
0084b344	add x0,sp,#0x40
0084b348	bl 0x0084c9ec
0084b34c	ldr x8,[sp, #0x60]
0084b350	lsr x9,x8,#0x1
0084b354	ldp x10,x11,[sp, #0x48]
0084b358	umulh x9,x9,x26
0084b35c	cmp x11,x10
0084b360	lsr x9,x9,#0x4
0084b364	msub x8,x9,x27,x8
0084b368	add x9,x10,x9, LSL #0x3
0084b36c	ldr x12,[x9]
0084b370	nop
0084b374	madd x8,x8,x28,x12
0084b378	csel x8,xzr,x8,eq
0084b37c	cmp x8,x12
0084b380	b.ne 0x0084b224
0084b384	ldur x8,[x9, #-0x8]
0084b388	add x8,x8,#0xfc0
0084b38c	b 0x0084b224
0084b390	cmn w8,#0x3e0
0084b394	b.eq 0x0084b4a4
0084b398	cmn w8,#0x3df
0084b39c	b.eq 0x0084b294
0084b3a0	b 0x0084b77c
0084b3a4	ldr w8,[sp, #0x3c]
0084b3a8	tbz w8,#0x5,0x0084b3bc
0084b3ac	ldr x8,[x23, #0x10]
0084b3b0	ldr x9,[sp, #0x10]
0084b3b4	cmp x8,x9
0084b3b8	b.eq 0x0084b28c
0084b3bc	ldr w8,[sp, #0x3c]
0084b3c0	tbz w8,#0xc,0x0084b3d4
0084b3c4	ldr x8,[x23, #0x10]
0084b3c8	ldr x9,[sp, #0x18]
0084b3cc	cmp x8,x9
0084b3d0	b.ne 0x0084b28c
0084b3d4	ldp x9,x8,[x23, #0x8]
0084b3d8	sub x8,x8,x9
0084b3dc	cmp x22,x8
0084b3e0	csel x9,x22,x8,gt
0084b3e4	tst w19,#0x1
0084b3e8	csel x22,x9,x8,ne
0084b3ec	cmp x22,x20
0084b3f0	b.ne 0x0084b5d4
0084b3f4	ldp x8,x9,[sp, #0x48]
0084b3f8	cmp x9,x8
0084b3fc	b.eq 0x0084b5ec
0084b400	ldp x10,x11,[sp, #0x60]
0084b404	add x11,x11,x10
0084b408	lsr x12,x10,#0x1
0084b40c	lsr x13,x11,#0x1
0084b410	umulh x12,x12,x26
0084b414	umulh x13,x13,x26
0084b418	lsr x12,x12,#0x4
0084b41c	lsr x13,x13,#0x4
0084b420	msub x10,x12,x27,x10
0084b424	add x19,x8,x12, LSL #0x3
0084b428	msub x11,x13,x27,x11
0084b42c	ldr x12,[x19]
0084b430	nop
0084b434	madd x22,x10,x28,x12
0084b438	ldr x10,[x8, x13, LSL #0x3]
0084b43c	nop
0084b440	madd x21,x11,x28,x10
0084b444	cmp x22,x21
0084b448	b.ne 0x0084b458
0084b44c	b 0x0084b5f0
0084b450	cmp x22,x21
0084b454	b.eq 0x0084b5e4
0084b458	ldr x0,[x22, #0x38]
0084b45c	cbz x0,0x0084b470
0084b460	ldr x8,[x22, #0x48]
0084b464	str x0,[x22, #0x40]
0084b468	sub x1,x8,x0
0084b46c	bl 0x00c2fe80
0084b470	ldr x0,[x22, #0x20]
0084b474	cbz x0,0x0084b488
0084b478	ldr x8,[x22, #0x30]
0084b47c	str x0,[x22, #0x28]
0084b480	sub x1,x8,x0
0084b484	bl 0x00c2fe80
0084b488	ldr x8,[x19]
0084b48c	add x22,x22,#0x60
0084b490	sub x8,x22,x8
0084b494	cmp x8,#0xfc0
0084b498	b.ne 0x0084b450
0084b49c	ldr x22,[x19, #0x8]!
0084b4a0	b 0x0084b450
0084b4a4	add x0,sp,#0x78
0084b4a8	mov x1,x23
0084b4ac	bl 0x00844534
0084b4b0	ldr x0,[x23, #0x50]
0084b4b4	ldr x8,[x0]
0084b4b8	ldr x8,[x8, #0x18]
0084b4bc	mov w1,#0x1
0084b4c0	mov x2,x23
0084b4c4	blr x8
0084b4c8	ldr x0,[sp, #0xc8]
0084b4cc	ldr x8,[x0]
0084b4d0	ldr x8,[x8, #0x18]
0084b4d4	add x2,sp,#0x78
0084b4d8	mov w1,wzr
0084b4dc	blr x8
0084b4e0	ldp x8,x9,[sp, #0x48]
0084b4e4	mov x10,#-0x1
0084b4e8	subs x9,x9,x8
0084b4ec	asr x9,x9,#0x3
0084b4f0	madd x9,x9,x27,x10
0084b4f4	ldp x10,x11,[sp, #0x60]
0084b4f8	csel x12,xzr,x9,eq
0084b4fc	add x9,x11,x10
0084b500	cmp x12,x9
0084b504	b.ne 0x0084b51c
0084b508	add x0,sp,#0x40
0084b50c	bl 0x0084c130
0084b510	ldp x9,x10,[sp, #0x60]
0084b514	ldr x8,[sp, #0x48]
0084b518	add x9,x10,x9
0084b51c	lsr x10,x9,#0x1
0084b520	ldur q0,[sp, #0x88]
0084b524	ldur q1,[sp, #0x78]
0084b528	umulh x10,x10,x26
0084b52c	lsr x10,x10,#0x4
0084b530	msub x9,x10,x27,x9
0084b534	ldr x8,[x8, x10, LSL #0x3]
0084b538	nop
0084b53c	madd x8,x9,x28,x8
0084b540	stp q1,q0,[x8]
0084b544	stp xzr,xzr,[x8, #0x28]
0084b548	str xzr,[x8, #0x20]
0084b54c	ldur q0,[sp, #0x98]
0084b550	str q0,[x8, #0x20]
0084b554	ldr x9,[sp, #0xa8]
0084b558	str x9,[x8, #0x30]
0084b55c	stp xzr,xzr,[x25, #0x20]
0084b560	stur xzr,[x25, #0x30]
0084b564	stp xzr,xzr,[x8, #0x38]
0084b568	str xzr,[x8, #0x48]
0084b56c	ldur q0,[sp, #0xb0]
0084b570	stur q0,[x8, #0x38]
0084b574	ldr x9,[sp, #0xc0]
0084b578	str x9,[x8, #0x48]
0084b57c	ldur x9,[x25, #0x55]
0084b580	ldur x10,[x25, #0x50]
0084b584	stp xzr,xzr,[x25, #0x38]
0084b588	stur xzr,[x25, #0x48]
0084b58c	stur x9,[x8, #0x55]
0084b590	str x10,[x8, #0x50]
0084b594	ldr x8,[sp, #0x68]
0084b598	ldr x0,[sp, #0xb0]
0084b59c	add x8,x8,#0x1
0084b5a0	str x8,[sp, #0x68]
0084b5a4	cbz x0,0x0084b5b8
0084b5a8	ldr x8,[sp, #0xc0]
0084b5ac	str x0,[sp, #0xb8]
0084b5b0	sub x1,x8,x0
0084b5b4	bl 0x00c2fe80
0084b5b8	ldr x0,[sp, #0x98]
0084b5bc	cbz x0,0x0084b294
0084b5c0	ldr x8,[sp, #0xa8]
0084b5c4	str x0,[sp, #0xa0]
0084b5c8	sub x1,x8,x0
0084b5cc	bl 0x00c2fe80
0084b5d0	b 0x0084b294
0084b5d4	add x0,sp,#0x40
0084b5d8	bl 0x0084be60
0084b5dc	mov w19,#0x1
0084b5e0	b 0x0084b294
0084b5e4	ldp x8,x9,[sp, #0x48]
0084b5e8	b 0x0084b5f0
0084b5ec	mov x9,x8
0084b5f0	sub x9,x9,x8
0084b5f4	str xzr,[sp, #0x68]
0084b5f8	asr x9,x9,#0x3
0084b5fc	cmp x9,#0x3
0084b600	b.cc 0x0084b62c
0084b604	ldr x0,[x8]
0084b608	mov w1,#0xfc0
0084b60c	bl 0x00c2fe80
0084b610	ldp x8,x9,[sp, #0x48]
0084b614	add x8,x8,#0x8
0084b618	sub x9,x9,x8
0084b61c	str x8,[sp, #0x48]
0084b620	asr x9,x9,#0x3
0084b624	cmp x9,#0x2
0084b628	b.hi 0x0084b604
0084b62c	cmp x9,#0x1
0084b630	b.eq 0x0084b644
0084b634	cmp x9,#0x2
0084b638	b.ne 0x0084b64c
0084b63c	mov w8,#0x2a
0084b640	b 0x0084b648
0084b644	mov w8,#0x15
0084b648	str x8,[sp, #0x60]
0084b64c	mov w19,#0x1
0084b650	mov x22,x20
0084b654	b 0x0084b294
0084b658	tbz w19,#0x0,0x0084b67c
0084b65c	ldr x8,[sp]
0084b660	ldr x10,[sp, #0x10]
0084b664	mov w19,#0x1
0084b668	ldr x8,[x8]
0084b66c	add x9,x10,x22
0084b670	stp x10,x9,[x8]
0084b674	strb w19,[x8, #0x10]
0084b678	b 0x0084b680
0084b67c	mov w19,wzr
0084b680	ldr x22,[sp, #0x8]
0084b684	ldp x20,x21,[sp, #0x48]
0084b688	str xzr,[sp, #0x68]
0084b68c	sub x8,x21,x20
0084b690	asr x8,x8,#0x3
0084b694	cmp x8,#0x3
0084b698	b.cc 0x0084b6c4
0084b69c	ldr x0,[x20]
0084b6a0	mov w1,#0xfc0
0084b6a4	bl 0x00c2fe80
0084b6a8	ldp x8,x21,[sp, #0x48]
0084b6ac	add x20,x8,#0x8
0084b6b0	sub x8,x21,x20
0084b6b4	str x20,[sp, #0x48]
0084b6b8	asr x8,x8,#0x3
0084b6bc	cmp x8,#0x2
0084b6c0	b.hi 0x0084b69c
0084b6c4	cmp x8,#0x1
0084b6c8	b.eq 0x0084b6dc
0084b6cc	cmp x8,#0x2
0084b6d0	b.ne 0x0084b6e4
0084b6d4	mov w8,#0x2a
0084b6d8	b 0x0084b6e0
0084b6dc	mov w8,#0x15
0084b6e0	str x8,[sp, #0x60]
0084b6e4	cmp x20,x21
0084b6e8	b.eq 0x0084b71c
0084b6ec	ldr x0,[x20], #0x8
0084b6f0	mov w1,#0xfc0
0084b6f4	bl 0x00c2fe80
0084b6f8	cmp x20,x21
0084b6fc	b.ne 0x0084b6ec
0084b700	ldp x9,x8,[sp, #0x48]
0084b704	subs x9,x9,x8
0084b708	b.eq 0x0084b71c
0084b70c	add x9,x9,#0x7
0084b710	and x9,x9,#-0x8
0084b714	add x8,x8,x9
0084b718	str x8,[sp, #0x50]
0084b71c	ldr x0,[sp, #0x40]
0084b720	cbz x0,0x0084b730
0084b724	ldr x8,[sp, #0x58]
0084b728	sub x1,x8,x0
0084b72c	bl 0x00c2fe80
0084b730	ldr x8,[x22, #0x28]
0084b734	ldur x9,[x29, #-0x18]
0084b738	cmp x8,x9
0084b73c	b.ne 0x0084b7e0
0084b740	mov w0,w19
0084b744	ldp x20,x19,[sp, #0x140]
0084b748	ldp x22,x21,[sp, #0x130]
0084b74c	ldp x24,x23,[sp, #0x120]
0084b750	ldp x26,x25,[sp, #0x110]
0084b754	ldp x28,x27,[sp, #0x100]
0084b758	ldp x29,x30,[sp, #0xf0]
0084b75c	add sp,sp,#0x150
0084b760	ret
0084b764	ldr x8,[sp, #0x8]
0084b768	ldr x8,[x8, #0x28]
0084b76c	ldur x9,[x29, #-0x18]
0084b770	cmp x8,x9
0084b774	b.ne 0x0084b7e0
0084b778	bl 0x008444e8
0084b77c	ldr x8,[sp, #0x8]
0084b780	ldr x8,[x8, #0x28]
0084b784	ldur x9,[x29, #-0x18]
0084b788	cmp x8,x9
0084b78c	b.ne 0x0084b7e0
0084b790	bl 0x008446b4
0084b794	b 0x0084b7b8
0084b7b8	mov x19,x0
0084b7bc	add x0,sp,#0x40
0084b7c0	bl 0x0084c0ac
0084b7c4	ldr x8,[sp, #0x8]
0084b7c8	ldr x8,[x8, #0x28]
0084b7cc	ldur x9,[x29, #-0x18]
0084b7d0	cmp x8,x9
0084b7d4	b.ne 0x0084b7e0
0084b7d8	mov x0,x19
0084b7dc	bl 0x00c2c090
0084b7e0	bl 0x00c2fec0
