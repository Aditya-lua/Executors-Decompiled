; FUN_007fe1ec @ 007fe1ec
007fe1ec	sub sp,sp,#0x1f0
007fe1f0	stp x29,x30,[sp, #0x190]
007fe1f4	stp x28,x27,[sp, #0x1a0]
007fe1f8	stp x26,x25,[sp, #0x1b0]
007fe1fc	stp x24,x23,[sp, #0x1c0]
007fe200	stp x22,x21,[sp, #0x1d0]
007fe204	stp x20,x19,[sp, #0x1e0]
007fe208	add x29,sp,#0x190
007fe20c	mrs x21,tpidr_el0
007fe210	adrp x9,0x29c000
007fe214	add x9,x9,#0xa90
007fe218	ldr x8,[x21, #0x28]
007fe21c	ldr q0,[x9]
007fe220	mov x19,x0
007fe224	stur x8,[x29, #-0x10]
007fe228	adrp x8,0xcca000
007fe22c	add x8,x8,#0xb78
007fe230	str q0,[sp, #0x10]
007fe234	ldarb w8,[x8]
007fe238	tbz w8,#0x0,0x007fe45c
007fe23c	adrp x8,0xcca000
007fe240	ldrb w8,[x8, #0xb70]
007fe244	cmp w8,#0x1
007fe248	b.ne 0x007fe26c
007fe24c	adrp x8,0xcca000
007fe250	add x8,x8,#0xb60
007fe254	adrp x9,0x29c000
007fe258	ldr q0,[x8]
007fe25c	ldr q1,[x9, #0x520]
007fe260	strb wzr,[x8, #0x10]
007fe264	eor v0.16B,v0.16B,v1.16B
007fe268	str q0,[x8]
007fe26c	adrp x1,0xcca000
007fe270	add x1,x1,#0xb60
007fe274	add x0,sp,#0x30
007fe278	mov w2,#0x8
007fe27c	add x26,sp,#0x30
007fe280	bl 0x007fe518
007fe284	ldr x8,[sp, #0xb8]
007fe288	cbz x8,0x007fe3c8
007fe28c	str x21,[sp]
007fe290	adrp x20,0xcb4000
007fe294	add x8,sp,#0x10
007fe298	stp xzr,xzr,[sp, #0x10]
007fe29c	orr x27,x8,#0x1
007fe2a0	mov w28,#0x5
007fe2a4	ldr x20,[x20, #0x998]
007fe2a8	str xzr,[sp, #0x20]
007fe2ac	ldr x8,[sp, #0x30]
007fe2b0	ldur x9,[x8, #-0x18]
007fe2b4	add x8,sp,#0x8
007fe2b8	add x0,x26,x9
007fe2bc	bl 0x00c30070
007fe2c0	add x0,sp,#0x8
007fe2c4	mov x1,x20
007fe2c8	bl 0x00c30080
007fe2cc	ldr x8,[x0]
007fe2d0	ldr x8,[x8, #0x38]
007fe2d4	mov w1,#0xa
007fe2d8	blr x8
007fe2dc	mov w21,w0
007fe2e0	add x0,sp,#0x8
007fe2e4	bl 0x00c30090
007fe2e8	add x0,sp,#0x30
007fe2ec	add x1,sp,#0x10
007fe2f0	mov w2,w21
007fe2f4	bl 0x007fe708
007fe2f8	ldr x8,[x0]
007fe2fc	ldur x8,[x8, #-0x18]
007fe300	add x8,x0,x8
007fe304	ldrb w8,[x8, #0x20]
007fe308	tst w8,w28
007fe30c	b.ne 0x007fe3d0
007fe310	ldrb w8,[sp, #0x10]
007fe314	ldp x10,x9,[sp, #0x18]
007fe318	mov x0,x19
007fe31c	lsr x11,x8,#0x1
007fe320	tst w8,#0x1
007fe324	csel x21,x27,x9,eq
007fe328	csel x24,x11,x10,eq
007fe32c	bl 0x00c2ff50
007fe330	cbz x0,0x007fe3b0
007fe334	mov x22,x0
007fe338	cmp x24,x0
007fe33c	b.ge 0x007fe350
007fe340	mov x8,#-0x1
007fe344	cmn x8,#0x1
007fe348	b.eq 0x007fe2ac
007fe34c	b 0x007fe3b0
007fe350	ldrb w23,[x19]
007fe354	add x25,x21,x24
007fe358	mov x0,x21
007fe35c	sub x8,x24,x22
007fe360	adds x2,x8,#0x1
007fe364	b.cs 0x007fe340
007fe368	mov w1,w23
007fe36c	bl 0x00c300a0
007fe370	cbz x0,0x007fe340
007fe374	mov x1,x19
007fe378	mov x2,x22
007fe37c	mov x24,x0
007fe380	bl 0x00c300b0
007fe384	cbz w0,0x007fe39c
007fe388	add x0,x24,#0x1
007fe38c	sub x24,x25,x0
007fe390	cmp x24,x22
007fe394	b.ge 0x007fe35c
007fe398	b 0x007fe340
007fe39c	cmp x24,x25
007fe3a0	b.eq 0x007fe340
007fe3a4	sub x8,x24,x21
007fe3a8	cmn x8,#0x1
007fe3ac	b.eq 0x007fe2ac
007fe3b0	mov x0,x21
007fe3b4	mov x1,xzr
007fe3b8	mov w2,#0x10
007fe3bc	bl 0x00c300c0
007fe3c0	mov x19,x0
007fe3c4	b 0x007fe3d4
007fe3c8	mov x19,xzr
007fe3cc	b 0x007fe3f0
007fe3d0	mov x19,xzr
007fe3d4	ldr x21,[sp]
007fe3d8	ldrb w8,[sp, #0x10]
007fe3dc	tbz w8,#0x0,0x007fe3f0
007fe3e0	ldr x8,[sp, #0x10]
007fe3e4	ldr x0,[sp, #0x20]
007fe3e8	and x1,x8,#-0x2
007fe3ec	bl 0x00c2fe80
007fe3f0	adrp x20,0xcb4000
007fe3f4	add x0,x26,#0x10
007fe3f8	ldr x20,[x20, #0x9a0]
007fe3fc	ldr x8,[x20]
007fe400	ldr x9,[x20, #0x18]
007fe404	str x8,[sp, #0x30]
007fe408	ldur x8,[x8, #-0x18]
007fe40c	str x9,[x26, x8#0x0]
007fe410	bl 0x00c300d0
007fe414	add x0,sp,#0x30
007fe418	add x1,x20,#0x8
007fe41c	bl 0x00c300e0
007fe420	add x0,x26,#0xb8
007fe424	bl 0x00c300f0
007fe428	ldr x8,[x21, #0x28]
007fe42c	ldur x9,[x29, #-0x10]
007fe430	cmp x8,x9
007fe434	b.ne 0x007fe514
007fe438	mov x0,x19
007fe43c	ldp x20,x19,[sp, #0x1e0]
007fe440	ldp x22,x21,[sp, #0x1d0]
007fe444	ldp x24,x23,[sp, #0x1c0]
007fe448	ldp x26,x25,[sp, #0x1b0]
007fe44c	ldp x28,x27,[sp, #0x1a0]
007fe450	ldp x29,x30,[sp, #0x190]
007fe454	add sp,sp,#0x1f0
007fe458	ret
007fe45c	adrp x0,0xcca000
007fe460	add x0,x0,#0xb78
007fe464	bl 0x00c2fe90
007fe468	cbz w0,0x007fe23c
007fe46c	adrp x0,0xcca000
007fe470	add x0,x0,#0xb60
007fe474	add x1,sp,#0x10
007fe478	str x21,[sp]
007fe47c	bl 0x007fe674
007fe480	nop
007fe484	adr x0,0x7fe700
007fe488	adrp x1,0xcca000
007fe48c	add x1,x1,#0xb60
007fe490	adrp x2,0xc48000
007fe494	add x2,x2,#0x880
007fe498	bl 0x00c2fe70
007fe49c	adrp x0,0xcca000
007fe4a0	add x0,x0,#0xb78
007fe4a4	bl 0x00c2fea0
007fe4a8	ldr x21,[sp]
007fe4ac	b 0x007fe23c
007fe514	bl 0x00c2fec0
