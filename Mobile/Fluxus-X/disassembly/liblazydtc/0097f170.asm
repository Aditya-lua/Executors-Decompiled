; std::__ndk1::basic_filebuf<char,std::__ndk1::char_traits<char>>::overflow @ 0097f170
0097f170	sub sp,sp,#0x80
0097f174	stp x28,x27,[sp, #0x20]
0097f178	stp x26,x25,[sp, #0x30]
0097f17c	stp x24,x23,[sp, #0x40]
0097f180	stp x22,x21,[sp, #0x50]
0097f184	stp x20,x19,[sp, #0x60]
0097f188	stp x29,x30,[sp, #0x70]
0097f18c	add x29,sp,#0x70
0097f190	mrs x24,tpidr_el0
0097f194	ldr x8,[x24, #0x28]
0097f198	mov x20,x0
0097f19c	mov w19,w1
0097f1a0	str x8,[sp, #0x18]
0097f1a4	ldr x8,[x0, #0x78]
0097f1a8	cbz x8,0x0097f38c
0097f1ac	ldrb w8,[x20, #0x9c]
0097f1b0	tbnz w8,#0x4,0x0097f1d8
0097f1b4	ldr x8,[x20, #0x60]
0097f1b8	stp xzr,xzr,[x20, #0x10]
0097f1bc	str xzr,[x20, #0x20]
0097f1c0	cmp x8,#0x9
0097f1c4	b.cc 0x0097f1f0
0097f1c8	ldrb w9,[x20, #0xa2]
0097f1cc	cbz w9,0x0097f214
0097f1d0	ldr x2,[x20, #0x40]
0097f1d4	b 0x0097f218
0097f1d8	mov x25,x20
0097f1dc	ldr x2,[x25, #0x28]!
0097f1e0	mov x27,x25
0097f1e4	ldr x26,[x27, #0x10]!
0097f1e8	mov x28,x2
0097f1ec	b 0x0097f23c
0097f1f0	mov x25,x20
0097f1f4	str xzr,[x25, #0x28]!
0097f1f8	mov x27,x25
0097f1fc	mov x2,xzr
0097f200	mov x26,xzr
0097f204	mov x28,xzr
0097f208	str xzr,[x27, #0x10]!
0097f20c	str xzr,[x25, #0x8]
0097f210	b 0x0097f234
0097f214	ldp x2,x8,[x20, #0x68]
0097f218	add x8,x2,x8
0097f21c	sub x26,x8,#0x1
0097f220	add x25,x20,#0x28
0097f224	stp x2,x2,[x20, #0x28]
0097f228	add x27,x20,#0x38
0097f22c	str x26,[x20, #0x38]
0097f230	mov x28,x2
0097f234	mov w8,#0x10
0097f238	str w8,[x20, #0x9c]
0097f23c	ldr x3,[x20, #0x30]
0097f240	cmn w19,#0x1
0097f244	b.eq 0x0097f26c
0097f248	cbnz x3,0x0097f25c
0097f24c	add x3,sp,#0x14
0097f250	orr x8,x3,#0x1
0097f254	stp x3,x3,[x20, #0x28]
0097f258	str x8,[x20, #0x38]
0097f25c	strb w19,[x3]
0097f260	ldp x2,x8,[x20, #0x28]
0097f264	add x3,x8,#0x1
0097f268	str x3,[x20, #0x30]
0097f26c	subs x21,x3,x2
0097f270	b.eq 0x0097f2a4
0097f274	ldrb w8,[x20, #0xa2]
0097f278	cbz w8,0x0097f2b0
0097f27c	ldr x3,[x20, #0x78]
0097f280	mov w1,#0x1
0097f284	mov x0,x2
0097f288	mov x2,x21
0097f28c	bl 0x00c308f0
0097f290	cmp x0,x21
0097f294	b.ne 0x0097f38c
0097f298	str x28,[x20, #0x30]
0097f29c	str x28,[x25]
0097f2a0	str x26,[x27]
0097f2a4	cmn w19,#0x1
0097f2a8	csel w0,wzr,w19,eq
0097f2ac	b 0x0097f390
0097f2b0	ldr x5,[x20, #0x40]
0097f2b4	str x5,[sp, #0x8]
0097f2b8	ldr x0,[x20, #0x80]
0097f2bc	cbz x0,0x0097f364
0097f2c0	ldr x8,[x0]
0097f2c4	ldr x9,[x20, #0x60]
0097f2c8	add x21,x20,#0x88
0097f2cc	ldr x8,[x8, #0x18]
0097f2d0	b 0x0097f2e4
0097f2d4	ldr x8,[x0]
0097f2d8	ldr x5,[x20, #0x40]
0097f2dc	ldr x9,[x20, #0x60]
0097f2e0	ldr x8,[x8, #0x18]
0097f2e4	add x6,x5,x9
0097f2e8	mov x4,sp
0097f2ec	add x7,sp,#0x8
0097f2f0	mov x1,x21
0097f2f4	blr x8
0097f2f8	ldr x9,[sp]
0097f2fc	ldr x8,[x20, #0x28]
0097f300	mov w22,w0
0097f304	cmp x9,x8
0097f308	b.eq 0x0097f38c
0097f30c	cmp w22,#0x3
0097f310	b.eq 0x0097f3c0
0097f314	cmp w22,#0x1
0097f318	b.hi 0x0097f38c
0097f31c	ldr x8,[sp, #0x8]
0097f320	ldr x0,[x20, #0x40]
0097f324	ldr x3,[x20, #0x78]
0097f328	mov w1,#0x1
0097f32c	sub x23,x8,x0
0097f330	mov x2,x23
0097f334	bl 0x00c308f0
0097f338	cmp x0,x23
0097f33c	b.ne 0x0097f38c
0097f340	cmp w22,#0x1
0097f344	b.ne 0x0097f298
0097f348	ldr x2,[sp]
0097f34c	ldr x3,[x20, #0x30]
0097f350	str x2,[x25]
0097f354	str x3,[x27]
0097f358	ldr x0,[x20, #0x80]
0097f35c	str x3,[x20, #0x30]
0097f360	cbnz x0,0x0097f2d4
0097f364	mov w0,#0x8
0097f368	bl 0x00c30000
0097f36c	mov x19,x0
0097f370	bl 0x00c333c0
0097f374	adrp x1,0xcb4000
0097f378	adrp x2,0xcb4000
0097f37c	ldr x1,[x1, #0xf80]
0097f380	ldr x2,[x2, #0xf78]
0097f384	mov x0,x19
0097f388	bl 0x00c30020
0097f38c	mov w0,#0xffffffff
0097f390	ldr x8,[x24, #0x28]
0097f394	ldr x9,[sp, #0x18]
0097f398	cmp x8,x9
0097f39c	b.ne 0x0097f3d8
0097f3a0	ldp x29,x30,[sp, #0x70]
0097f3a4	ldp x20,x19,[sp, #0x60]
0097f3a8	ldp x22,x21,[sp, #0x50]
0097f3ac	ldp x24,x23,[sp, #0x40]
0097f3b0	ldp x26,x25,[sp, #0x30]
0097f3b4	ldp x28,x27,[sp, #0x20]
0097f3b8	add sp,sp,#0x80
0097f3bc	ret
0097f3c0	ldr x9,[x20, #0x30]
0097f3c4	ldr x3,[x20, #0x78]
0097f3c8	mov w1,#0x1
0097f3cc	mov x0,x8
0097f3d0	sub x21,x9,x8
0097f3d4	b 0x0097f288
0097f3d8	bl 0x00c2fec0
