; std::__ndk1::stoul @ 00bc8314
00bc8314	paciasp
00bc8318	sub sp,sp,#0x70
00bc831c	stp x29,x30,[sp, #0x30]
00bc8320	str x23,[sp, #0x40]
00bc8324	stp x22,x21,[sp, #0x50]
00bc8328	stp x20,x19,[sp, #0x60]
00bc832c	add x29,sp,#0x30
00bc8330	mov w8,#0xa
00bc8334	ldrb w9,[x0]
00bc8338	ldr x10,[x0, #0x10]
00bc833c	strb w8,[sp]
00bc8340	mov w8,#0x7473
00bc8344	mov w21,w2
00bc8348	movk w8,#0x756f, LSL #16
00bc834c	tst w9,#0x1
00bc8350	mov x19,x1
00bc8354	stur w8,[sp, #0x1]
00bc8358	mov w8,#0x6c
00bc835c	sturh w8,[sp, #0x5]
00bc8360	add x8,x0,#0x4
00bc8364	str xzr,[x29, #0x18]
00bc8368	csel x20,x8,x10,eq
00bc836c	bl 0x00c30710
00bc8370	ldr w23,[x0]
00bc8374	mov x22,x0
00bc8378	str wzr,[x0]
00bc837c	add x1,x29,#0x18
00bc8380	mov x0,x20
00bc8384	mov w2,w21
00bc8388	bl 0x00c439f0
00bc838c	ldr w8,[x22]
00bc8390	str w23,[x22]
00bc8394	cmp w8,#0x22
00bc8398	b.eq 0x00bc83e0
00bc839c	ldr x8,[x29, #0x18]
00bc83a0	subs x8,x8,x20
00bc83a4	b.eq 0x00bc8424
00bc83a8	mov x21,x0
00bc83ac	cbz x19,0x00bc83b8
00bc83b0	asr x8,x8,#0x2
00bc83b4	str x8,[x19]
00bc83b8	mov x0,sp
00bc83bc	bl 0x00c43db0
00bc83c0	mov x0,x21
00bc83c4	ldp x20,x19,[sp, #0x60]
00bc83c8	ldr x23,[sp, #0x40]
00bc83cc	ldp x22,x21,[sp, #0x50]
00bc83d0	ldp x29,x30,[sp, #0x30]
00bc83d4	add sp,sp,#0x70
00bc83d8	autiasp
00bc83dc	ret
00bc83e0	mov w9,#0x7473
00bc83e4	mov w8,#0x26
00bc83e8	str xzr,[sp, #0x28]
00bc83ec	movk w9,#0x756f, LSL #16
00bc83f0	strb w8,[sp, #0x18]
00bc83f4	mov w8,#0x6c
00bc83f8	stur w9,[sp, #0x19]
00bc83fc	adrp x9,0x2ce000
00bc8400	add x9,x9,#0xb11
00bc8404	ldr x10,[x9]
00bc8408	strb w8,[sp, #0x1d]
00bc840c	ldur x8,[x9, #0x6]
00bc8410	add x9,sp,#0x18
00bc8414	stur x10,[sp, #0x1e]
00bc8418	stur x8,[sp, #0x24]
00bc841c	orr x0,x9,#0x1
00bc8420	bl 0x0080c8d0
00bc8424	mov w9,#0x7473
00bc8428	mov w8,#0x28
00bc842c	str xzr,[sp, #0x28]
00bc8430	movk w9,#0x756f, LSL #16
00bc8434	strb w8,[sp, #0x18]
00bc8438	mov w8,#0x6c
00bc843c	stur w9,[sp, #0x19]
00bc8440	adrp x9,0x2ac000
00bc8444	add x9,x9,#0xd16
00bc8448	ldr x10,[x9]
00bc844c	strb w8,[sp, #0x1d]
00bc8450	ldur x8,[x9, #0x7]
00bc8454	add x9,sp,#0x18
00bc8458	stur x10,[sp, #0x1e]
00bc845c	stur x8,[sp, #0x25]
00bc8460	orr x0,x9,#0x1
00bc8464	bl 0x00bcab04
00bc8468	b 0x00bc846c
00bc846c	mov x19,x0
00bc8470	add x0,sp,#0x18
00bc8474	bl 0x00c43db0
00bc8478	b 0x00bc8480
00bc8480	mov x0,sp
00bc8484	bl 0x00c43db0
00bc8488	mov x0,x19
00bc848c	bl 0x00c2c090
