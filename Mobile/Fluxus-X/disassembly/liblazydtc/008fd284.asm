; std::__ndk1::vector<cpr::File,std::__ndk1::allocator<cpr::File>>::__emplace_back_slow_path<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&> @ 008fd284
008fd284	sub sp,sp,#0x80
008fd288	stp x28,x27,[sp, #0x20]
008fd28c	stp x26,x25,[sp, #0x30]
008fd290	stp x24,x23,[sp, #0x40]
008fd294	stp x22,x21,[sp, #0x50]
008fd298	stp x20,x19,[sp, #0x60]
008fd29c	stp x29,x30,[sp, #0x70]
008fd2a0	add x29,sp,#0x70
008fd2a4	mrs x25,tpidr_el0
008fd2a8	ldr x8,[x25, #0x28]
008fd2ac	orr x9,xzr,#-0x5555555555555556
008fd2b0	movk x9,#0xaaab
008fd2b4	orr x27,xzr,#0x5555555555555555
008fd2b8	str x8,[sp, #0x18]
008fd2bc	ldp x20,x23,[x0]
008fd2c0	movk x27,#0x555, LSL #48
008fd2c4	mov x19,x0
008fd2c8	mov x21,x1
008fd2cc	sub x8,x23,x20
008fd2d0	asr x8,x8,#0x4
008fd2d4	mul x26,x8,x9
008fd2d8	add x8,x26,#0x1
008fd2dc	cmp x8,x27
008fd2e0	b.hi 0x008fd4cc
008fd2e4	ldr x10,[x19, #0x10]
008fd2e8	sub x10,x10,x20
008fd2ec	asr x10,x10,#0x4
008fd2f0	mul x9,x10,x9
008fd2f4	orr x10,xzr,#-0x5555555555555556
008fd2f8	movk x10,#0xaaa9
008fd2fc	movk x10,#0x2aa, LSL #48
008fd300	cmp x9,x10
008fd304	b.hi 0x008fd318
008fd308	lsl x9,x9,#0x1
008fd30c	cmp x9,x8
008fd310	csel x27,x8,x9,cc
008fd314	cbz x27,0x008fd4c0
008fd318	add x8,x27,x27, LSL #0x1
008fd31c	lsl x0,x8,#0x4
008fd320	bl 0x00c2fed0
008fd324	mov x22,x0
008fd328	mov x28,x0
008fd32c	stp xzr,xzr,[sp, #0x8]
008fd330	str xzr,[sp]
008fd334	ldrb w8,[x21]
008fd338	tbnz w8,#0x0,0x008fd350
008fd33c	ldr x8,[x21, #0x10]
008fd340	str x8,[sp, #0x10]
008fd344	ldr q0,[x21]
008fd348	str q0,[sp]
008fd34c	b 0x008fd3b8
008fd350	ldr x20,[x21, #0x8]
008fd354	cmn x20,#0x10
008fd358	b.cs 0x008fd4d8
008fd35c	ldr x21,[x21, #0x10]
008fd360	cmp x20,#0x17
008fd364	b.cs 0x008fd380
008fd368	mov x9,sp
008fd36c	lsl w8,w20,#0x1
008fd370	orr x23,x9,#0x1
008fd374	strb w8,[sp]
008fd378	cbnz x20,0x008fd3a0
008fd37c	b 0x008fd3b0
008fd380	add x8,x20,#0x10
008fd384	and x24,x8,#-0x10
008fd388	mov x0,x24
008fd38c	bl 0x00c2fed0
008fd390	orr x8,x24,#0x1
008fd394	mov x23,x0
008fd398	stp x20,x0,[sp, #0x8]
008fd39c	str x8,[sp]
008fd3a0	mov x0,x23
008fd3a4	mov x1,x21
008fd3a8	mov x2,x20
008fd3ac	bl 0x00c2ffd0
008fd3b0	strb wzr,[x23, x20]
008fd3b4	ldp x20,x23,[x19]
008fd3b8	ldr x10,[sp, #0x10]
008fd3bc	orr w9,wzr,#0x30
008fd3c0	madd x8,x27,x9,x28
008fd3c4	madd x9,x26,x9,x28
008fd3c8	str x10,[x9, #0x10]
008fd3cc	ldr q0,[sp]
008fd3d0	orr w10,wzr,#0x30
008fd3d4	madd x10,x26,x10,x28
008fd3d8	cmp x23,x20
008fd3dc	str q0,[x9]
008fd3e0	stp xzr,xzr,[x10, #0x20]
008fd3e4	stp xzr,xzr,[x10, #0x18]
008fd3e8	strb wzr,[x9, #0x1f]
008fd3ec	sturh wzr,[x9, #0x1d]
008fd3f0	stur wzr,[x9, #0x19]
008fd3f4	str xzr,[x10, #0x28]
008fd3f8	add x10,x9,#0x30
008fd3fc	b.eq 0x008fd444
008fd400	ldur x11,[x23, #-0x20]
008fd404	stur x11,[x9, #-0x20]
008fd408	ldur q0,[x23, #-0x30]
008fd40c	stur q0,[x9, #-0x30]
008fd410	ldur x11,[x23, #-0x8]
008fd414	stp xzr,xzr,[x23, #-0x28]
008fd418	stur xzr,[x23, #-0x30]
008fd41c	stur x11,[x9, #-0x8]
008fd420	ldur q0,[x23, #-0x18]
008fd424	stur q0,[x9, #-0x18]
008fd428	stp xzr,xzr,[x23, #-0x18]
008fd42c	stur xzr,[x23, #-0x8]
008fd430	sub x23,x23,#0x30
008fd434	cmp x20,x23
008fd438	sub x9,x9,#0x30
008fd43c	b.ne 0x008fd400
008fd440	ldp x20,x23,[x19]
008fd444	cmp x23,x20
008fd448	stp x9,x10,[x19]
008fd44c	str x8,[x19, #0x10]
008fd450	b.eq 0x008fd484
008fd454	ldurb w8,[x23, #-0x18]
008fd458	tbz w8,#0x0,0x008fd464
008fd45c	ldur x0,[x23, #-0x8]
008fd460	bl 0x00c301d0
008fd464	ldurb w8,[x23, #-0x30]
008fd468	sub x19,x23,#0x30
008fd46c	tbz w8,#0x0,0x008fd478
008fd470	ldur x0,[x23, #-0x20]
008fd474	bl 0x00c301d0
008fd478	cmp x20,x19
008fd47c	mov x23,x19
008fd480	b.ne 0x008fd454
008fd484	cbz x20,0x008fd490
008fd488	mov x0,x20
008fd48c	bl 0x00c301d0
008fd490	ldr x8,[x25, #0x28]
008fd494	ldr x9,[sp, #0x18]
008fd498	cmp x8,x9
008fd49c	b.ne 0x008fd4d4
008fd4a0	ldp x29,x30,[sp, #0x70]
008fd4a4	ldp x20,x19,[sp, #0x60]
008fd4a8	ldp x22,x21,[sp, #0x50]
008fd4ac	ldp x24,x23,[sp, #0x40]
008fd4b0	ldp x26,x25,[sp, #0x30]
008fd4b4	ldp x28,x27,[sp, #0x20]
008fd4b8	add sp,sp,#0x80
008fd4bc	ret
008fd4c0	mov x22,xzr
008fd4c4	mov x28,xzr
008fd4c8	b 0x008fd32c
008fd4cc	mov x0,x19
008fd4d0	bl 0x00c30bd0
008fd4d4	bl 0x00c2fec0
008fd4d8	mov x0,sp
008fd4dc	bl 0x00c30ce0
