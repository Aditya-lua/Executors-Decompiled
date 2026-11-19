; std::__ndk1::codecvt<wchar_t,char,mbstate_t>::do_out @ 00bfe148
00bfe148	paciasp
00bfe14c	sub sp,sp,#0x90
00bfe150	stp x29,x30,[sp, #0x30]
00bfe154	stp x28,x27,[sp, #0x40]
00bfe158	stp x26,x25,[sp, #0x50]
00bfe15c	stp x24,x23,[sp, #0x60]
00bfe160	stp x22,x21,[sp, #0x70]
00bfe164	stp x20,x19,[sp, #0x80]
00bfe168	add x29,sp,#0x30
00bfe16c	mov x20,x7
00bfe170	mov x23,x6
00bfe174	mov x26,x5
00bfe178	mov x19,x3
00bfe17c	mov x24,x2
00bfe180	mov x25,x1
00bfe184	cmp x2,x3
00bfe188	mov x22,x2
00bfe18c	stp x0,x4,[sp, #0x8]
00bfe190	b.eq 0x00bfe1b0
00bfe194	mov x22,x24
00bfe198	ldr w8,[x22]
00bfe19c	cbz w8,0x00bfe1b0
00bfe1a0	add x22,x22,#0x4
00bfe1a4	cmp x22,x19
00bfe1a8	b.ne 0x00bfe198
00bfe1ac	mov x22,x19
00bfe1b0	ldr x8,[sp, #0x10]
00bfe1b4	cmp x24,x19
00bfe1b8	str x26,[x20]
00bfe1bc	str x24,[x8]
00bfe1c0	b.ne 0x00bfe1d8
00bfe1c4	b 0x00bfe3b0
00bfe1c8	mov x22,x8
00bfe1cc	ldr x26,[x20]
00bfe1d0	cmp x24,x19
00bfe1d4	b.eq 0x00bfe3b0
00bfe1d8	cmp x26,x23
00bfe1dc	b.eq 0x00bfe3b0
00bfe1e0	sub x9,x22,x24
00bfe1e4	ldr x8,[x25]
00bfe1e8	sub x21,x23,x26
00bfe1ec	asr x27,x9,#0x2
00bfe1f0	ldr x9,[sp, #0x8]
00bfe1f4	stur x8,[x29, #-0x10]
00bfe1f8	ldr x0,[x9, #0x10]
00bfe1fc	bl 0x00c43880
00bfe200	mov x28,x0
00bfe204	stur x0,[x29, #-0x8]
00bfe208	ldr x1,[sp, #0x10]
00bfe20c	mov x0,x26
00bfe210	mov x2,x27
00bfe214	mov x3,x21
00bfe218	mov x4,x25
00bfe21c	bl 0x00c43be0
00bfe220	mov x27,x0
00bfe224	cbz x28,0x00bfe230
00bfe228	mov x0,x28
00bfe22c	bl 0x00c43880
00bfe230	cbz x27,0x00bfe31c
00bfe234	cmn x27,#0x1
00bfe238	b.eq 0x00bfe324
00bfe23c	ldr x8,[x20]
00bfe240	add x26,x8,x27
00bfe244	cmp x26,x23
00bfe248	str x26,[x20]
00bfe24c	b.eq 0x00bfe3a8
00bfe250	cmp x22,x19
00bfe254	b.eq 0x00bfe304
00bfe258	ldr x8,[sp, #0x8]
00bfe25c	ldr x0,[x8, #0x10]
00bfe260	bl 0x00c43880
00bfe264	mov x26,x0
00bfe268	stur x0,[x29, #-0x8]
00bfe26c	sub x0,x29,#0x14
00bfe270	mov w1,wzr
00bfe274	mov x2,x25
00bfe278	bl 0x00c43b80
00bfe27c	mov x24,x0
00bfe280	cbz x26,0x00bfe28c
00bfe284	mov x0,x26
00bfe288	bl 0x00c43880
00bfe28c	cmn x24,#0x1
00bfe290	b.eq 0x00bfe3dc
00bfe294	ldr x8,[x20]
00bfe298	sub x8,x23,x8
00bfe29c	cmp x24,x8
00bfe2a0	b.hi 0x00bfe31c
00bfe2a4	cbz x24,0x00bfe2c8
00bfe2a8	sub x8,x29,#0x14
00bfe2ac	ldr x9,[x20]
00bfe2b0	ldrb w10,[x8], #0x1
00bfe2b4	subs x24,x24,#0x1
00bfe2b8	add x11,x9,#0x1
00bfe2bc	str x11,[x20]
00bfe2c0	strb w10,[x9]
00bfe2c4	b.ne 0x00bfe2ac
00bfe2c8	ldr x9,[sp, #0x10]
00bfe2cc	mov x22,x19
00bfe2d0	ldr x8,[x9]
00bfe2d4	add x24,x8,#0x4
00bfe2d8	cmp x24,x19
00bfe2dc	mov x8,x24
00bfe2e0	str x24,[x9]
00bfe2e4	b.eq 0x00bfe1cc
00bfe2e8	ldr w9,[x8]
00bfe2ec	cbz w9,0x00bfe1c8
00bfe2f0	add x8,x8,#0x4
00bfe2f4	cmp x8,x19
00bfe2f8	b.ne 0x00bfe2e8
00bfe2fc	mov x22,x19
00bfe300	b 0x00bfe1cc
00bfe304	ldr x8,[sp, #0x10]
00bfe308	mov x22,x19
00bfe30c	ldr x24,[x8]
00bfe310	cmp x24,x19
00bfe314	b.ne 0x00bfe1d8
00bfe318	b 0x00bfe3b0
00bfe31c	mov w0,#0x1
00bfe320	b 0x00bfe3b8
00bfe324	ldr x8,[sp, #0x10]
00bfe328	str x26,[x20]
00bfe32c	ldr x8,[x8]
00bfe330	cmp x24,x8
00bfe334	b.eq 0x00bfe398
00bfe338	ldr x8,[sp, #0x8]
00bfe33c	ldr w21,[x24]
00bfe340	ldr x0,[x8, #0x10]
00bfe344	bl 0x00c43880
00bfe348	mov x22,x0
00bfe34c	stur x0,[x29, #-0x8]
00bfe350	sub x2,x29,#0x10
00bfe354	mov x0,x26
00bfe358	mov w1,w21
00bfe35c	bl 0x00c43b80
00bfe360	mov x23,x0
00bfe364	cbz x22,0x00bfe370
00bfe368	mov x0,x22
00bfe36c	bl 0x00c43880
00bfe370	cmn x23,#0x1
00bfe374	b.eq 0x00bfe398
00bfe378	ldr x8,[x20]
00bfe37c	add x24,x24,#0x4
00bfe380	add x26,x8,x23
00bfe384	ldr x8,[sp, #0x10]
00bfe388	str x26,[x20]
00bfe38c	ldr x8,[x8]
00bfe390	cmp x24,x8
00bfe394	b.ne 0x00bfe338
00bfe398	ldr x8,[sp, #0x10]
00bfe39c	mov w0,#0x2
00bfe3a0	str x24,[x8]
00bfe3a4	b 0x00bfe3b8
00bfe3a8	ldr x8,[sp, #0x10]
00bfe3ac	ldr x24,[x8]
00bfe3b0	cmp x24,x19
00bfe3b4	cset w0,ne
00bfe3b8	ldp x20,x19,[sp, #0x80]
00bfe3bc	ldp x22,x21,[sp, #0x70]
00bfe3c0	ldp x24,x23,[sp, #0x60]
00bfe3c4	ldp x26,x25,[sp, #0x50]
00bfe3c8	ldp x28,x27,[sp, #0x40]
00bfe3cc	ldp x29,x30,[sp, #0x30]
00bfe3d0	add sp,sp,#0x90
00bfe3d4	autiasp
00bfe3d8	ret
00bfe3dc	mov w0,#0x2
00bfe3e0	b 0x00bfe3b8
