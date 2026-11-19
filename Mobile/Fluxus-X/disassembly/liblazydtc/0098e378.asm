; ix::make_unique<ix::WebSocketMessage,ix::WebSocketMessageType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int,ix::WebSocketErrorInfo,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo> @ 0098e378
0098e378	sub sp,sp,#0x120
0098e37c	stp x28,x27,[sp, #0xc0]
0098e380	stp x26,x25,[sp, #0xd0]
0098e384	stp x24,x23,[sp, #0xe0]
0098e388	stp x22,x21,[sp, #0xf0]
0098e38c	stp x20,x19,[sp, #0x100]
0098e390	stp x29,x30,[sp, #0x110]
0098e394	add x29,sp,#0x110
0098e398	mrs x27,tpidr_el0
0098e39c	mov x20,x8
0098e3a0	ldr x8,[x27, #0x28]
0098e3a4	mov x26,x0
0098e3a8	mov w0,#0xc8
0098e3ac	mov x22,x5
0098e3b0	mov x23,x4
0098e3b4	mov x24,x3
0098e3b8	mov x25,x2
0098e3bc	mov x21,x1
0098e3c0	stur x8,[x29, #-0x60]
0098e3c4	bl 0x00c2fed0
0098e3c8	ldr w8,[x24, #0x10]
0098e3cc	ldr w1,[x26]
0098e3d0	ldrsw x3,[x25]
0098e3d4	mov x9,sp
0098e3d8	str w8,[sp, #0x80]
0098e3dc	ldr q0,[x24]
0098e3e0	mov x19,x0
0098e3e4	add x9,x9,#0x20
0098e3e8	str q0,[sp, #0x70]
0098e3ec	ldr x8,[x24, #0x28]
0098e3f0	str x8,[sp, #0x98]
0098e3f4	ldur q0,[x24, #0x18]
0098e3f8	stur q0,[sp, #0x88]
0098e3fc	ldrb w8,[x24, #0x30]
0098e400	stp xzr,xzr,[x24, #0x18]
0098e404	str xzr,[x24, #0x28]
0098e408	strb w8,[sp, #0xa0]
0098e40c	ldr x8,[x23, #0x10]
0098e410	str x8,[sp, #0x10]
0098e414	ldr q0,[x23]
0098e418	str q0,[sp]
0098e41c	ldr x8,[x23, #0x18]
0098e420	stp xzr,xzr,[x23]
0098e424	str xzr,[x23, #0x10]
0098e428	str x8,[sp, #0x18]
0098e42c	ldp x8,x10,[x23, #0x20]
0098e430	stp x8,x10,[sp, #0x20]
0098e434	cbz x10,0x0098e450
0098e438	str x9,[x8, #0x10]
0098e43c	mov x8,x23
0098e440	str xzr,[x8, #0x20]!
0098e444	stur x8,[x8, #-0x8]
0098e448	str xzr,[x8, #0x8]
0098e44c	b 0x0098e454
0098e450	str x9,[sp, #0x18]
0098e454	ldr x8,[x23, #0x40]
0098e458	str x8,[sp, #0x40]
0098e45c	ldr q0,[x23, #0x30]
0098e460	str q0,[sp, #0x30]
0098e464	stp xzr,xzr,[x23, #0x38]
0098e468	str xzr,[x23, #0x30]
0098e46c	ldrh w8,[x22]
0098e470	strh w8,[sp, #0x48]
0098e474	ldr x8,[x22, #0x18]
0098e478	str x8,[sp, #0x60]
0098e47c	ldur q0,[x22, #0x8]
0098e480	stur q0,[sp, #0x50]
0098e484	ldrb w8,[x22, #0x20]
0098e488	stp xzr,xzr,[x22, #0x10]
0098e48c	str xzr,[x22, #0x8]
0098e490	strb w8,[sp, #0x68]
0098e494	add x4,sp,#0x70
0098e498	mov x5,sp
0098e49c	add x6,sp,#0x48
0098e4a0	mov x0,x19
0098e4a4	mov x2,x21
0098e4a8	mov w7,wzr
0098e4ac	bl 0x00c337c0
0098e4b0	ldrb w8,[sp, #0x50]
0098e4b4	str x19,[x20]
0098e4b8	tbz w8,#0x0,0x0098e4c4
0098e4bc	ldr x0,[sp, #0x60]
0098e4c0	bl 0x00c301d0
0098e4c4	ldrb w8,[sp, #0x30]
0098e4c8	tbz w8,#0x0,0x0098e4d4
0098e4cc	ldr x0,[sp, #0x40]
0098e4d0	bl 0x00c301d0
0098e4d4	ldr x1,[sp, #0x20]
0098e4d8	mov x8,sp
0098e4dc	add x0,x8,#0x18
0098e4e0	bl 0x00c32fc0
0098e4e4	ldrb w8,[sp]
0098e4e8	tbz w8,#0x0,0x0098e4f4
0098e4ec	ldr x0,[sp, #0x10]
0098e4f0	bl 0x00c301d0
0098e4f4	ldrb w8,[sp, #0x88]
0098e4f8	tbz w8,#0x0,0x0098e504
0098e4fc	ldr x0,[sp, #0x98]
0098e500	bl 0x00c301d0
0098e504	ldr x8,[x27, #0x28]
0098e508	ldur x9,[x29, #-0x60]
0098e50c	cmp x8,x9
0098e510	b.ne 0x0098e534
0098e514	ldp x29,x30,[sp, #0x110]
0098e518	ldp x20,x19,[sp, #0x100]
0098e51c	ldp x22,x21,[sp, #0xf0]
0098e520	ldp x24,x23,[sp, #0xe0]
0098e524	ldp x26,x25,[sp, #0xd0]
0098e528	ldp x28,x27,[sp, #0xc0]
0098e52c	add sp,sp,#0x120
0098e530	ret
0098e534	bl 0x00c2fec0
