; __dynamic_cast @ 00c0e2cc
00c0e2cc	paciasp
00c0e2d0	sub sp,sp,#0xa0
00c0e2d4	stp x30,x25,[sp, #0x60]
00c0e2d8	stp x24,x23,[sp, #0x70]
00c0e2dc	stp x22,x21,[sp, #0x80]
00c0e2e0	stp x20,x19,[sp, #0x90]
00c0e2e4	ldr x8,[x0]
00c0e2e8	ldr x9,[x2, #0x8]
00c0e2ec	ldp x8,x20,[x8, #-0x10]
00c0e2f0	ldr x10,[x20, #0x8]
00c0e2f4	add x19,x0,x8
00c0e2f8	cmp x10,x9
00c0e2fc	b.eq 0x00c0e408
00c0e300	tbnz x3,#0x3f,0x00c0e390
00c0e304	sub x8,x0,x3
00c0e308	cmp x8,x19
00c0e30c	b.lt 0x00c0e390
00c0e310	movi v0.2D,#0x0
00c0e314	movi v1.2S,#0x1, LSL #24
00c0e318	mov w9,#0x1
00c0e31c	stp x20,x8,[sp, #0x8]
00c0e320	mov x21,x1
00c0e324	add x1,sp,#0x8
00c0e328	stp x2,x3,[sp, #0x18]
00c0e32c	mov x23,x0
00c0e330	mov x0,x20
00c0e334	str xzr,[sp, #0x48]
00c0e338	mov x24,x2
00c0e33c	mov x2,x19
00c0e340	stur q0,[sp, #0x38]
00c0e344	mov x25,x3
00c0e348	mov x3,x19
00c0e34c	stur q0,[sp, #0x28]
00c0e350	mov w4,#0x1
00c0e354	mov w5,wzr
00c0e358	str w9,[sp, #0x50]
00c0e35c	mov x22,x8
00c0e360	str s1,[sp, #0x54]
00c0e364	str xzr,[sp, #0x58]
00c0e368	ldr x9,[x20]
00c0e36c	ldr x9,[x9, #0x28]
00c0e370	blr x9
00c0e374	ldr w9,[sp, #0x38]
00c0e378	mov x0,x23
00c0e37c	mov x8,x22
00c0e380	mov x1,x21
00c0e384	mov x3,x25
00c0e388	mov x2,x24
00c0e38c	cbnz w9,0x00c0e4b8
00c0e390	movi v0.2D,#0x0
00c0e394	mov w8,#0x1
00c0e398	stp x2,x0,[sp, #0x8]
00c0e39c	stp x1,x3,[sp, #0x18]
00c0e3a0	add x1,sp,#0x8
00c0e3a4	mov x0,x20
00c0e3a8	strb w8,[sp, #0x57]
00c0e3ac	mov x2,x19
00c0e3b0	mov w3,#0x1
00c0e3b4	str xzr,[sp, #0x58]
00c0e3b8	mov w4,wzr
00c0e3bc	stur q0,[sp, #0x47]
00c0e3c0	stur q0,[sp, #0x28]
00c0e3c4	stur q0,[sp, #0x38]
00c0e3c8	ldr x8,[x20]
00c0e3cc	ldr x8,[x8, #0x30]
00c0e3d0	blr x8
00c0e3d4	ldr w9,[sp, #0x44]
00c0e3d8	cmp w9,#0x1
00c0e3dc	b.eq 0x00c0e414
00c0e3e0	mov x8,xzr
00c0e3e4	cbnz w9,0x00c0e4b8
00c0e3e8	ldp w9,w8,[sp, #0x3c]
00c0e3ec	ldr w10,[sp, #0x48]
00c0e3f0	cmp w8,#0x1
00c0e3f4	ldr x8,[sp, #0x30]
00c0e3f8	ccmp w9,#0x1,#0x0,eq
00c0e3fc	ccmp w10,#0x1,#0x0,eq
00c0e400	csel x8,x8,xzr,eq
00c0e404	b 0x00c0e4b8
00c0e408	tbnz x3,#0x3f,0x00c0e44c
00c0e40c	cmn x8,x3
00c0e410	b 0x00c0e4b4
00c0e414	ldr w8,[sp, #0x38]
00c0e418	cmp w8,#0x1
00c0e41c	b.eq 0x00c0e444
00c0e420	ldr w9,[sp, #0x48]
00c0e424	mov x8,xzr
00c0e428	cbnz w9,0x00c0e4b8
00c0e42c	ldr w9,[sp, #0x3c]
00c0e430	cmp w9,#0x1
00c0e434	b.ne 0x00c0e4b8
00c0e438	ldr w9,[sp, #0x40]
00c0e43c	cmp w9,#0x1
00c0e440	b.ne 0x00c0e4b8
00c0e444	ldr x8,[sp, #0x28]
00c0e448	b 0x00c0e4b8
00c0e44c	cmn x3,#0x2
00c0e450	b.ne 0x00c0e45c
00c0e454	mov x8,xzr
00c0e458	b 0x00c0e4b8
00c0e45c	movi v0.2D,#0x0
00c0e460	movi v1.2S,#0x1, LSL #24
00c0e464	mov w8,#0x1
00c0e468	str w8,[sp, #0x50]
00c0e46c	ldr x8,[x2]
00c0e470	mov w4,#0x1
00c0e474	str xzr,[sp, #0x48]
00c0e478	mov w5,wzr
00c0e47c	str xzr,[sp, #0x58]
00c0e480	stur q0,[sp, #0x28]
00c0e484	stur q0,[sp, #0x38]
00c0e488	str s1,[sp, #0x54]
00c0e48c	ldr x8,[x8, #0x28]
00c0e490	stp x2,x0,[sp, #0x8]
00c0e494	mov x0,x2
00c0e498	stp x1,x3,[sp, #0x18]
00c0e49c	add x1,sp,#0x8
00c0e4a0	mov x2,x19
00c0e4a4	mov x3,x19
00c0e4a8	blr x8
00c0e4ac	ldr w8,[sp, #0x38]
00c0e4b0	cmp w8,#0x1
00c0e4b4	csel x8,x19,xzr,eq
00c0e4b8	ldp x20,x19,[sp, #0x90]
00c0e4bc	mov x0,x8
00c0e4c0	ldp x22,x21,[sp, #0x80]
00c0e4c4	ldp x24,x23,[sp, #0x70]
00c0e4c8	ldp x30,x25,[sp, #0x60]
00c0e4cc	add sp,sp,#0xa0
00c0e4d0	autiasp
00c0e4d4	ret
