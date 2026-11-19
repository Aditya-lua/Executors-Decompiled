; FUN_009fa140 @ 009fa140
009fa140	sub sp,sp,#0x50
009fa144	stp x24,x23,[sp, #0x10]
009fa148	stp x22,x21,[sp, #0x20]
009fa14c	stp x20,x19,[sp, #0x30]
009fa150	stp x29,x30,[sp, #0x40]
009fa154	ldr x23,[x0, #0x40]
009fa158	sub w8,w1,#0x1
009fa15c	mov x20,x3
009fa160	mov x21,x0
009fa164	cmp w8,#0x1c
009fa168	mov x19,x2
009fa16c	add x29,sp,#0x40
009fa170	b.hi 0x009fa1a4
009fa174	adrp x9,0x74e000
009fa178	add x9,x9,#0x2ac
009fa17c	ldrsw x8,[x9, x8, LSL #0x2]
009fa180	add x8,x8,x9
009fa184	br x8
009fa188	movi d0,#0x0
009fa18c	str d0,[x23, #0x10]
009fa190	str d0,[x23, #0x20]
009fa194	ldr x0,[x21, #0x48]
009fa198	cbz x0,0x009fa59c
009fa19c	mov w1,#0x1
009fa1a0	b 0x009fa464
009fa1a4	sub w8,w1,#0x65
009fa1a8	cmp w8,#0x15
009fa1ac	b.hi 0x009fa338
009fa1b0	adrp x9,0x74e000
009fa1b4	add x9,x9,#0x320
009fa1b8	ldrsw x8,[x9, x8, LSL #0x2]
009fa1bc	add x8,x8,x9
009fa1c0	br x8
009fa1c4	ldr x8,[x21, #0x48]
009fa1c8	cbz x8,0x009fa59c
009fa1cc	orr w1,wzr,#0xf
009fa1d0	mov x0,x21
009fa1d4	bl 0x00c32190
009fa1d8	ldr x0,[x21, #0x48]
009fa1dc	mov w1,#0x65
009fa1e0	mov x2,x19
009fa1e4	mov x3,x20
009fa1e8	bl 0x00c321a0
009fa1ec	mov x19,x0
009fa1f0	mov x0,x21
009fa1f4	bl 0x00c38460
009fa1f8	mov x0,x19
009fa1fc	b 0x009fa5a4
009fa200	ldr w8,[x23, #0x10]
009fa204	mov x22,xzr
009fa208	cmp w8,#0x0
009fa20c	b.gt 0x009fa5a0
009fa210	ldr x0,[x21, #0x48]
009fa214	mov w1,#0x2
009fa218	b 0x009fa464
009fa21c	ldrsw x22,[x23, #0x20]
009fa220	b 0x009fa5a0
009fa224	ldrsw x22,[x23, #0x10]
009fa228	cbnz w22,0x009fa5a0
009fa22c	ldr x0,[x21, #0x48]
009fa230	cbz x0,0x009fa59c
009fa234	mov w1,#0xa
009fa238	b 0x009fa464
009fa23c	ldr x0,[x21, #0x48]
009fa240	cbz x0,0x009fa59c
009fa244	ldr w8,[x23, #0x20]
009fa248	cmp w8,#0x1
009fa24c	b.ge 0x009fa264
009fa250	b 0x009fa460
009fa254	ldp w9,w8,[x23, #0x20]
009fa258	add w8,w8,w22
009fa25c	sub w9,w9,w22
009fa260	stp w9,w8,[x23, #0x20]
009fa264	orr w1,wzr,#0xf
009fa268	mov x0,x21
009fa26c	bl 0x00c32190
009fa270	ldr w2,[x23, #0x20]
009fa274	cmp w2,#0x0
009fa278	b.le 0x009fa458
009fa27c	ldr x8,[x23, #0x18]
009fa280	ldrsw x9,[x23, #0x24]
009fa284	ldr x0,[x21, #0x48]
009fa288	add x1,x8,x9
009fa28c	bl 0x00c34240
009fa290	mov w22,w0
009fa294	mov x0,x21
009fa298	bl 0x00c38460
009fa29c	cmp w22,#0x0
009fa2a0	b.gt 0x009fa254
009fa2a4	sxtw x22,w22
009fa2a8	b 0x009fa5a0
009fa2ac	ldrsw x2,[x23]
009fa2b0	mov w1,#0x75
009fa2b4	mov x0,x20
009fa2b8	mov w3,wzr
009fa2bc	bl 0x00c35600
009fa2c0	cmp x0,#0x1
009fa2c4	b.lt 0x009fa59c
009fa2c8	ldrsw x2,[x23, #0x4]
009fa2cc	mov w1,#0x75
009fa2d0	mov w3,#0x1
009fa2d4	mov x0,x20
009fa2d8	mov w22,#0x1
009fa2dc	bl 0x00c35600
009fa2e0	cmp x0,#0x0
009fa2e4	b.gt 0x009fa5a0
009fa2e8	b 0x009fa59c
009fa2ec	ldrsw x22,[x23, #0x20]
009fa2f0	cbnz w22,0x009fa5a0
009fa2f4	ldr x0,[x21, #0x48]
009fa2f8	cbz x0,0x009fa59c
009fa2fc	mov w1,#0xd
009fa300	b 0x009fa464
009fa304	add x1,sp,#0xc
009fa308	mov x0,x21
009fa30c	mov w2,wzr
009fa310	bl 0x009f9ea0
009fa314	ldpsw x8,x10,[x23, #0x10]
009fa318	ldr x9,[x23, #0x8]
009fa31c	mov x0,x20
009fa320	cmp x8,x19
009fa324	csel x22,x8,x19,lt
009fa328	add x1,x9,x10
009fa32c	mov x2,x22
009fa330	bl 0x00c2ffd0
009fa334	b 0x009fa5a0
009fa338	ldr x0,[x21, #0x48]
009fa33c	cbnz x0,0x009fa464
009fa340	b 0x009fa59c
009fa344	ldrsw x8,[x23, #0x10]
009fa348	cmp w8,#0x1
009fa34c	b.lt 0x009fa59c
009fa350	ldr x10,[x23, #0x8]
009fa354	ldrsw x11,[x23, #0x14]
009fa358	mov x9,xzr
009fa35c	cmp w8,#0x1
009fa360	mov x22,xzr
009fa364	b.eq 0x009fa3ac
009fa368	and x9,x8,#-0x2
009fa36c	add x14,x10,x11
009fa370	mov x12,xzr
009fa374	mov x13,xzr
009fa378	add x14,x14,#0x1
009fa37c	mov x15,x9
009fa380	ldurb w16,[x14, #-0x1]
009fa384	ldrb w17,[x14], #0x2
009fa388	cmp w16,#0xa
009fa38c	cinc x12,x12,eq
009fa390	cmp w17,#0xa
009fa394	cinc x13,x13,eq
009fa398	subs x15,x15,#0x2
009fa39c	b.ne 0x009fa380
009fa3a0	cmp x9,x8
009fa3a4	add x22,x13,x12
009fa3a8	b.eq 0x009fa5a0
009fa3ac	add x10,x10,x11
009fa3b0	ldrb w11,[x10, x9]
009fa3b4	add x9,x9,#0x1
009fa3b8	cmp w11,#0xa
009fa3bc	cinc x22,x22,eq
009fa3c0	cmp x9,x8
009fa3c4	b.lt 0x009fa3b0
009fa3c8	b 0x009fa5a0
009fa3cc	cbz x20,0x009fa44c
009fa3d0	ldr w8,[x20]
009fa3d4	cbz w8,0x009fa484
009fa3d8	ldr w24,[x23]
009fa3dc	b 0x009fa450
009fa3e0	ldrsw x8,[x23]
009fa3e4	cmp x8,x19
009fa3e8	b.ge 0x009fa42c
009fa3ec	cmp x19,#0x1
009fa3f0	b.lt 0x009fa59c
009fa3f4	adrp x1,0x2ad000
009fa3f8	add x1,x1,#0xa16
009fa3fc	mov w2,#0x124
009fa400	mov x0,x19
009fa404	bl 0x00c32320
009fa408	cbz x0,0x009fa56c
009fa40c	mov x21,x0
009fa410	ldr x0,[x23, #0x8]
009fa414	adrp x1,0x2ad000
009fa418	add x1,x1,#0xa16
009fa41c	mov w2,#0x127
009fa420	bl 0x00c32310
009fa424	str x21,[x23, #0x8]
009fa428	b 0x009fa430
009fa42c	ldr x21,[x23, #0x8]
009fa430	sxtw x2,w19
009fa434	mov x0,x21
009fa438	mov x1,x20
009fa43c	stp w19,wzr,[x23, #0x10]
009fa440	bl 0x00c2ffd0
009fa444	mov w22,#0x1
009fa448	b 0x009fa5a0
009fa44c	mov w24,w19
009fa450	mov w22,w19
009fa454	b 0x009fa48c
009fa458	str xzr,[x23, #0x20]
009fa45c	ldr x0,[x21, #0x48]
009fa460	mov w1,#0xb
009fa464	mov x2,x19
009fa468	mov x3,x20
009fa46c	ldp x29,x30,[sp, #0x40]
009fa470	ldp x20,x19,[sp, #0x30]
009fa474	ldp x22,x21,[sp, #0x20]
009fa478	ldp x24,x23,[sp, #0x10]
009fa47c	add sp,sp,#0x50
009fa480	b 0x00c321a0
009fa484	ldr w22,[x23, #0x4]
009fa488	mov w24,w19
009fa48c	ldr x21,[x23, #0x8]
009fa490	ldr x20,[x23, #0x18]
009fa494	cmp w24,#0x1, LSL #12
009fa498	b.le 0x009fa4cc
009fa49c	ldr w8,[x23]
009fa4a0	cmp w24,w8
009fa4a4	b.eq 0x009fa4cc
009fa4a8	cmp x19,#0x1
009fa4ac	b.lt 0x009fa59c
009fa4b0	adrp x1,0x2ad000
009fa4b4	add x1,x1,#0xa16
009fa4b8	mov w2,#0x143
009fa4bc	mov x0,x19
009fa4c0	bl 0x00c32320
009fa4c4	mov x21,x0
009fa4c8	cbz x0,0x009fa56c
009fa4cc	cmp w22,#0x1, LSL #12
009fa4d0	b.le 0x009fa4fc
009fa4d4	ldr w8,[x23, #0x4]
009fa4d8	cmp w22,w8
009fa4dc	b.eq 0x009fa4fc
009fa4e0	adrp x1,0x2ad000
009fa4e4	add x1,x1,#0xa16
009fa4e8	mov w2,#0x148
009fa4ec	mov x0,x19
009fa4f0	bl 0x00c32320
009fa4f4	mov x20,x0
009fa4f8	cbz x0,0x009fa54c
009fa4fc	ldr x0,[x23, #0x8]
009fa500	cmp x0,x21
009fa504	b.eq 0x009fa520
009fa508	adrp x1,0x2ad000
009fa50c	add x1,x1,#0xa16
009fa510	mov w2,#0x150
009fa514	bl 0x00c32310
009fa518	stp x21,xzr,[x23, #0x8]
009fa51c	str w24,[x23]
009fa520	ldr x0,[x23, #0x18]
009fa524	cmp x0,x20
009fa528	b.eq 0x009fa544
009fa52c	adrp x1,0x2ad000
009fa530	add x1,x1,#0xa16
009fa534	mov w2,#0x157
009fa538	bl 0x00c32310
009fa53c	stp x20,xzr,[x23, #0x18]
009fa540	str w22,[x23, #0x4]
009fa544	mov w22,#0x1
009fa548	b 0x009fa5a0
009fa54c	ldr x8,[x23, #0x8]
009fa550	cmp x21,x8
009fa554	b.eq 0x009fa56c
009fa558	adrp x1,0x2ad000
009fa55c	add x1,x1,#0xa16
009fa560	mov w2,#0x14b
009fa564	mov x0,x21
009fa568	bl 0x00c32310
009fa56c	bl 0x00c342a0
009fa570	adrp x0,0x2ad000
009fa574	adrp x2,0x2bb000
009fa578	add x0,x0,#0xa16
009fa57c	add x2,x2,#0x9cc
009fa580	mov w1,#0x199
009fa584	bl 0x00c342b0
009fa588	mov w1,#0x100
009fa58c	mov w0,#0x20
009fa590	movk w1,#0xc, LSL #16
009fa594	mov x2,xzr
009fa598	bl 0x00c342c0
009fa59c	mov x22,xzr
009fa5a0	mov x0,x22
009fa5a4	ldp x29,x30,[sp, #0x40]
009fa5a8	ldp x20,x19,[sp, #0x30]
009fa5ac	ldp x22,x21,[sp, #0x20]
009fa5b0	ldp x24,x23,[sp, #0x10]
009fa5b4	add sp,sp,#0x50
009fa5b8	ret
