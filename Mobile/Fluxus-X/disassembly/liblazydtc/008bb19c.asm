; FUN_008bb19c @ 008bb19c
008bb19c	sub sp,sp,#0x40
008bb1a0	stp x29,x30,[sp, #0x20]
008bb1a4	stp x20,x19,[sp, #0x30]
008bb1a8	add x29,sp,#0x20
008bb1ac	ldr w9,[x0, #0x8]
008bb1b0	sub w8,w1,#0x1
008bb1b4	cmp w8,w9
008bb1b8	b.cs 0x008bb1c8
008bb1bc	ldr x9,[x0, #0x20]
008bb1c0	add x0,x9,w8, SXTW  #0x4
008bb1c4	b 0x008bb2e4
008bb1c8	adrp x8,0xd1f000
008bb1cc	add x8,x8,#0xc90
008bb1d0	ldr x9,[x0, #0x28]
008bb1d4	ldarb w8,[x8]
008bb1d8	adrp x19,0xd1f000
008bb1dc	tbz w8,#0x0,0x008bb2f4
008bb1e0	ldr x8,[x19, #0xc88]
008bb1e4	mov w19,#0x2ef0
008bb1e8	movk w19,#0x7f, LSL #16
008bb1ec	add x8,x8,x19
008bb1f0	add x8,x8,#0x810
008bb1f4	cmp x9,x8
008bb1f8	b.eq 0x008bb2c8
008bb1fc	scvtf d0,w1
008bb200	mov w10,#0xe995
008bb204	movk w10,#0x5bd1, LSL #16
008bb208	fmov x8,d0
008bb20c	ubfx x9,x8,#0x20,#0x1f
008bb210	eor w8,w8,w9, LSR #0x12
008bb214	mul w8,w8,w10
008bb218	eor w9,w9,w8, LSR #0x16
008bb21c	mul w9,w9,w10
008bb220	eor w8,w8,w9, LSR #0x11
008bb224	mul w8,w8,w10
008bb228	eor w8,w9,w8, LSR #0x13
008bb22c	ldrb w9,[x0, #0x5]
008bb230	mul w8,w8,w10
008bb234	mov w10,#0xffffffff
008bb238	lsl w9,w10,w9
008bb23c	ldr x10,[x0, #0x28]
008bb240	bic w8,w8,w9
008bb244	add x0,x10,x8, LSL #0x5
008bb248	ldr w8,[x0, #0x1c]
008bb24c	and w9,w8,#0xf
008bb250	cmp w9,#0x3
008bb254	b.ne 0x008bb264
008bb258	ldr d1,[x0, #0x10]
008bb25c	fcmp d1,d0
008bb260	b.eq 0x008bb2e4
008bb264	cmp w8,#0x10
008bb268	b.cc 0x008bb278
008bb26c	sbfx x8,x8,#0x4,#0x1c
008bb270	add x0,x0,x8, LSL #0x5
008bb274	b 0x008bb248
008bb278	adrp x8,0xd1f000
008bb27c	add x8,x8,#0x1e0
008bb280	ldarb w9,[x8]
008bb284	adrp x8,0xd1f000
008bb288	tbnz w9,#0x0,0x008bb2dc
008bb28c	adrp x0,0xd1f000
008bb290	add x0,x0,#0x1e0
008bb294	bl 0x00c2fe90
008bb298	adrp x8,0xd1f000
008bb29c	cbz w0,0x008bb2dc
008bb2a0	adrp x8,0xcca000
008bb2a4	ldr x0,[x8, #0x8c8]
008bb2a8	bl 0x007fe1ec
008bb2ac	adrp x20,0xd1f000
008bb2b0	str x0,[x20, #0x1d8]
008bb2b4	adrp x0,0xd1f000
008bb2b8	add x0,x0,#0x1e0
008bb2bc	bl 0x00c2fea0
008bb2c0	mov x8,x20
008bb2c4	b 0x008bb2dc
008bb2c8	adrp x8,0xd1f000
008bb2cc	add x8,x8,#0x1e0
008bb2d0	ldarb w8,[x8]
008bb2d4	tbz w8,#0x0,0x008bb350
008bb2d8	adrp x8,0xd1f000
008bb2dc	ldr x8,[x8, #0x1d8]
008bb2e0	add x0,x8,x19
008bb2e4	ldp x20,x19,[sp, #0x30]
008bb2e8	ldp x29,x30,[sp, #0x20]
008bb2ec	add sp,sp,#0x40
008bb2f0	ret
008bb2f4	adrp x8,0xd1f000
008bb2f8	add x8,x8,#0xc90
008bb2fc	stur x0,[x29, #-0x8]
008bb300	mov x0,x8
008bb304	str w1,[sp, #0xc]
008bb308	str x9,[sp, #0x10]
008bb30c	bl 0x00c2fe90
008bb310	ldr x9,[sp, #0x10]
008bb314	ldr w1,[sp, #0xc]
008bb318	mov w8,w0
008bb31c	ldur x0,[x29, #-0x8]
008bb320	cbz w8,0x008bb1e0
008bb324	adrp x8,0xcca000
008bb328	ldr x0,[x8, #0x8c8]
008bb32c	bl 0x007fe1ec
008bb330	str x0,[x19, #0xc88]
008bb334	adrp x0,0xd1f000
008bb338	add x0,x0,#0xc90
008bb33c	bl 0x00c2fea0
008bb340	ldur x0,[x29, #-0x8]
008bb344	ldr w1,[sp, #0xc]
008bb348	ldr x9,[sp, #0x10]
008bb34c	b 0x008bb1e0
008bb350	adrp x0,0xd1f000
008bb354	add x0,x0,#0x1e0
008bb358	bl 0x00c2fe90
008bb35c	cbz w0,0x008bb2d8
008bb360	adrp x8,0xcca000
008bb364	ldr x0,[x8, #0x8c8]
008bb368	bl 0x007fe1ec
008bb36c	adrp x8,0xd1f000
008bb370	str x0,[x8, #0x1d8]
008bb374	adrp x0,0xd1f000
008bb378	add x0,x0,#0x1e0
008bb37c	bl 0x00c2fea0
008bb380	b 0x008bb2d8
