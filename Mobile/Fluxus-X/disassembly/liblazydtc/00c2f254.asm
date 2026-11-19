; FUN_00c2f254 @ 00c2f254
00c2f254	paciasp
00c2f258	stp x29,x30,[sp, #-0x60]!
00c2f25c	stp x28,x27,[sp, #0x10]
00c2f260	stp x26,x25,[sp, #0x20]
00c2f264	stp x24,x23,[sp, #0x30]
00c2f268	stp x22,x21,[sp, #0x40]
00c2f26c	stp x20,x19,[sp, #0x50]
00c2f270	mov x29,sp
00c2f274	sub sp,sp,#0x6a0
00c2f278	mov w21,w3
00c2f27c	mov x19,x2
00c2f280	mov x22,x1
00c2f284	mov x20,x0
00c2f288	cbz w3,0x00c2f2ac
00c2f28c	ldp x2,x3,[x19, #0x10]
00c2f290	add x5,sp,#0x48
00c2f294	ldr x0,[x20, #0x8]
00c2f298	add x6,sp,#0x10
00c2f29c	mov x1,x22
00c2f2a0	add x4,x2,w21, UXTW 
00c2f2a4	bl 0x00c2f784
00c2f2a8	tbnz w0,#0x0,0x00c2f3c4
00c2f2ac	ldr x2,[x19, #0x20]
00c2f2b0	cbz x2,0x00c2f2d0
00c2f2b4	ldr x0,[x20, #0x8]
00c2f2b8	ldr w3,[x19, #0x28]
00c2f2bc	add x4,sp,#0x48
00c2f2c0	add x5,sp,#0x10
00c2f2c4	mov x1,x22
00c2f2c8	bl 0x00c2f94c
00c2f2cc	tbnz w0,#0x0,0x00c2f3c4
00c2f2d0	ldr x23,[x19]
00c2f2d4	nop
00c2f2d8	adr x0,0xd280f4
00c2f2dc	bl 0x00c3ed40
00c2f2e0	adrp x8,0xcca000
00c2f2e4	adrp x9,0xcca000
00c2f2e8	ldr x8,[x8, #0x6a0]
00c2f2ec	ldr x9,[x9, #0x6a8]
00c2f2f0	cmp x8,x9
00c2f2f4	b.cs 0x00c2f398
00c2f2f8	cmn x23,#0x1
00c2f2fc	b.ne 0x00c2f310
00c2f300	b 0x00c2f344
00c2f304	add x8,x8,#0x20
00c2f308	cmp x8,x9
00c2f30c	b.cs 0x00c2f398
00c2f310	ldr x10,[x8]
00c2f314	cmp x23,x10
00c2f318	b.ne 0x00c2f304
00c2f31c	ldr x10,[x8, #0x8]
00c2f320	cmp x10,x22
00c2f324	b.hi 0x00c2f304
00c2f328	ldr x10,[x8, #0x10]
00c2f32c	cmp x22,x10
00c2f330	b.cs 0x00c2f304
00c2f334	b 0x00c2f35c
00c2f338	add x8,x8,#0x20
00c2f33c	cmp x8,x9
00c2f340	b.cs 0x00c2f398
00c2f344	ldr x10,[x8, #0x8]
00c2f348	cmp x10,x22
00c2f34c	b.hi 0x00c2f338
00c2f350	ldr x10,[x8, #0x10]
00c2f354	cmp x22,x10
00c2f358	b.cs 0x00c2f338
00c2f35c	ldr x23,[x8, #0x18]
00c2f360	nop
00c2f364	adr x0,0xd280f4
00c2f368	bl 0x00c3ed50
00c2f36c	cbz x23,0x00c2f3a4
00c2f370	ldp x2,x3,[x19, #0x10]
00c2f374	add x5,sp,#0x48
00c2f378	ldr x0,[x20, #0x8]
00c2f37c	add x6,sp,#0x10
00c2f380	mov x1,x22
00c2f384	mov x4,x23
00c2f388	bl 0x00c2f784
00c2f38c	tbz w0,#0x0,0x00c2f3a4
00c2f390	mov w24,wzr
00c2f394	b 0x00c2f3c8
00c2f398	nop
00c2f39c	adr x0,0xd280f4
00c2f3a0	bl 0x00c3ed50
00c2f3a4	ldp x2,x3,[x19, #0x10]
00c2f3a8	add x5,sp,#0x48
00c2f3ac	ldr x0,[x20, #0x8]
00c2f3b0	add x6,sp,#0x10
00c2f3b4	mov x1,x22
00c2f3b8	mov x4,xzr
00c2f3bc	bl 0x00c2f784
00c2f3c0	tbz w0,#0x0,0x00c2f500
00c2f3c4	mov w24,#0x1
00c2f3c8	ldr x25,[x19]
00c2f3cc	add x0,sp,#0x78
00c2f3d0	mov w1,wzr
00c2f3d4	mov w2,#0x620
00c2f3d8	bl 0x00c301c0
00c2f3dc	ldr x0,[x20, #0x8]
00c2f3e0	add x1,sp,#0x48
00c2f3e4	add x2,sp,#0x10
00c2f3e8	add x5,sp,#0x78
00c2f3ec	mov x3,x22
00c2f3f0	mov w4,#0x4
00c2f3f4	bl 0x00c2d520
00c2f3f8	tbz w0,#0x0,0x00c2f500
00c2f3fc	ldur q0,[sp, #0x68]
00c2f400	add x8,x20,#0x228
00c2f404	ldr x9,[sp, #0x30]
00c2f408	ldr x22,[sp, #0x60]
00c2f40c	cmp w21,#0x0
00c2f410	mov w0,#0x1
00c2f414	str q0,[x8]
00c2f418	ldr w8,[sp, #0x88]
00c2f41c	str x9,[x20, #0x238]
00c2f420	eor w9,w24,#0x1
00c2f424	str x8,[x20, #0x240]
00c2f428	mov w8,#0x3000000
00c2f42c	str w8,[x20, #0x250]
00c2f430	ldp x23,x8,[sp, #0x48]
00c2f434	str x22,[x20, #0x220]
00c2f438	str xzr,[x20, #0x248]
00c2f43c	str w8,[x20, #0x254]
00c2f440	csinc w8,w9,wzr,eq
00c2f444	str x23,[x20, #0x258]
00c2f448	str x25,[x20, #0x260]
00c2f44c	tbnz w8,#0x0,0x00c2f504
00c2f450	ldr x8,[x19, #0x20]
00c2f454	cbnz x8,0x00c2f504
00c2f458	ldr x24,[x19]
00c2f45c	nop
00c2f460	adr x0,0xd280f4
00c2f464	str q0,[sp]
00c2f468	bl 0x00c3ed60
00c2f46c	adrp x25,0xcca000
00c2f470	adrp x26,0xcca000
00c2f474	ldr x8,[x25, #0x6a8]
00c2f478	ldr x9,[x26, #0x6b0]
00c2f47c	cmp x8,x9
00c2f480	b.cc 0x00c2f4d4
00c2f484	adrp x27,0xcca000
00c2f488	ldr x21,[x27, #0x6a0]
00c2f48c	sub x19,x9,x21
00c2f490	lsl x0,x19,#0x2
00c2f494	asr x28,x19,#0x3
00c2f498	bl 0x00c308d0
00c2f49c	mov x1,x21
00c2f4a0	mov x2,x19
00c2f4a4	mov x20,x0
00c2f4a8	bl 0x00c2ffd0
00c2f4ac	nop
00c2f4b0	adr x8,0xd28130
00c2f4b4	cmp x21,x8
00c2f4b8	b.eq 0x00c2f4c4
00c2f4bc	mov x0,x21
00c2f4c0	bl 0x00c30960
00c2f4c4	add x9,x20,x28, LSL #0x5
00c2f4c8	add x8,x20,x19
00c2f4cc	str x20,[x27, #0x6a0]
00c2f4d0	str x9,[x26, #0x6b0]
00c2f4d4	ldr q0,[sp]
00c2f4d8	stp x24,x22,[x8]
00c2f4dc	nop
00c2f4e0	adr x0,0xd280f4
00c2f4e4	str x23,[x8, #0x18]
00c2f4e8	str d0,[x8, #0x10]
00c2f4ec	add x8,x8,#0x20
00c2f4f0	str x8,[x25, #0x6a8]
00c2f4f4	bl 0x00c3ed50
00c2f4f8	mov w0,#0x1
00c2f4fc	b 0x00c2f504
00c2f500	mov w0,wzr
00c2f504	add sp,sp,#0x6a0
00c2f508	ldp x20,x19,[sp, #0x50]
00c2f50c	ldp x22,x21,[sp, #0x40]
00c2f510	ldp x24,x23,[sp, #0x30]
00c2f514	ldp x26,x25,[sp, #0x20]
00c2f518	ldp x28,x27,[sp, #0x10]
00c2f51c	ldp x29,x30,[sp], #0x60
00c2f520	autiasp
00c2f524	ret
