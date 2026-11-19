; ix::make_unique<ix::WebSocketMessage,ix::WebSocketMessageType,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int,ix::WebSocketErrorInfo&,ix::WebSocketOpenInfo,ix::WebSocketCloseInfo> @ 0098f3e4
0098f3e4	sub sp,sp,#0x140
0098f3e8	stp x28,x27,[sp, #0xe0]
0098f3ec	stp x26,x25,[sp, #0xf0]
0098f3f0	stp x24,x23,[sp, #0x100]
0098f3f4	stp x22,x21,[sp, #0x110]
0098f3f8	stp x20,x19,[sp, #0x120]
0098f3fc	stp x29,x30,[sp, #0x130]
0098f400	add x29,sp,#0x130
0098f404	mrs x23,tpidr_el0
0098f408	mov x27,x8
0098f40c	ldr x8,[x23, #0x28]
0098f410	mov x21,x0
0098f414	mov w0,#0xc8
0098f418	mov x22,x5
0098f41c	mov x25,x4
0098f420	mov x26,x3
0098f424	mov x20,x2
0098f428	mov x24,x1
0098f42c	stur x8,[x29, #-0x60]
0098f430	bl 0x00c2fed0
0098f434	ldr w8,[x26, #0x10]
0098f438	ldr w1,[x21]
0098f43c	ldrsw x21,[x20]
0098f440	add x10,sp,#0x90
0098f444	str w8,[sp, #0xa0]
0098f448	ldr q0,[x26]
0098f44c	stp xzr,xzr,[sp, #0xb0]
0098f450	str xzr,[sp, #0xa8]
0098f454	mov x8,x26
0098f458	str q0,[sp, #0x90]
0098f45c	ldrb w9,[x8, #0x18]!
0098f460	mov x19,x0
0098f464	add x0,x10,#0x18
0098f468	tbnz w9,#0x0,0x0098f480
0098f46c	ldr x9,[x8, #0x10]
0098f470	str x9,[x0, #0x10]
0098f474	ldr q0,[x8]
0098f478	str q0,[x0]
0098f47c	b 0x0098f508
0098f480	stp x23,x19,[sp, #0x10]
0098f484	mov x19,x24
0098f488	mov x24,x27
0098f48c	ldr x27,[x26, #0x20]
0098f490	cmn x27,#0x10
0098f494	b.cs 0x0098f648
0098f498	ldr x28,[x26, #0x28]
0098f49c	mov w23,w1
0098f4a0	cmp x27,#0x17
0098f4a4	b.cs 0x0098f4bc
0098f4a8	lsl w8,w27,#0x1
0098f4ac	add x20,x0,#0x1
0098f4b0	strb w8,[sp, #0xa8]
0098f4b4	cbnz x27,0x0098f4e4
0098f4b8	b 0x0098f4f4
0098f4bc	add x8,x27,#0x10
0098f4c0	str x21,[sp, #0x8]
0098f4c4	and x21,x8,#-0x10
0098f4c8	mov x0,x21
0098f4cc	bl 0x00c2fed0
0098f4d0	orr x8,x21,#0x1
0098f4d4	ldr x21,[sp, #0x8]
0098f4d8	mov x20,x0
0098f4dc	stp x27,x0,[sp, #0xb0]
0098f4e0	str x8,[sp, #0xa8]
0098f4e4	mov x0,x20
0098f4e8	mov x1,x28
0098f4ec	mov x2,x27
0098f4f0	bl 0x00c2ffd0
0098f4f4	strb wzr,[x20, x27]
0098f4f8	mov x27,x24
0098f4fc	mov x24,x19
0098f500	mov w1,w23
0098f504	ldp x23,x19,[sp, #0x10]
0098f508	ldrb w8,[x26, #0x30]
0098f50c	add x9,sp,#0x20
0098f510	add x9,x9,#0x20
0098f514	strb w8,[sp, #0xc0]
0098f518	ldr x8,[x25, #0x10]
0098f51c	str x8,[sp, #0x30]
0098f520	ldr q0,[x25]
0098f524	str q0,[sp, #0x20]
0098f528	ldr x8,[x25, #0x18]
0098f52c	stp xzr,xzr,[x25]
0098f530	str xzr,[x25, #0x10]
0098f534	str x8,[sp, #0x38]
0098f538	ldp x8,x10,[x25, #0x20]
0098f53c	stp x8,x10,[sp, #0x40]
0098f540	cbz x10,0x0098f55c
0098f544	str x9,[x8, #0x10]
0098f548	mov x8,x25
0098f54c	str xzr,[x8, #0x20]!
0098f550	stur x8,[x8, #-0x8]
0098f554	str xzr,[x8, #0x8]
0098f558	b 0x0098f560
0098f55c	str x9,[sp, #0x38]
0098f560	ldr x8,[x25, #0x40]
0098f564	str x8,[sp, #0x60]
0098f568	ldr q0,[x25, #0x30]
0098f56c	str q0,[sp, #0x50]
0098f570	stp xzr,xzr,[x25, #0x38]
0098f574	str xzr,[x25, #0x30]
0098f578	ldrh w8,[x22]
0098f57c	strh w8,[sp, #0x68]
0098f580	ldr x8,[x22, #0x18]
0098f584	str x8,[sp, #0x80]
0098f588	ldur q0,[x22, #0x8]
0098f58c	stur q0,[sp, #0x70]
0098f590	ldrb w8,[x22, #0x20]
0098f594	stp xzr,xzr,[x22, #0x10]
0098f598	str xzr,[x22, #0x8]
0098f59c	strb w8,[sp, #0x88]
0098f5a0	add x4,sp,#0x90
0098f5a4	add x5,sp,#0x20
0098f5a8	add x6,sp,#0x68
0098f5ac	mov x0,x19
0098f5b0	mov x2,x24
0098f5b4	mov x3,x21
0098f5b8	mov w7,wzr
0098f5bc	bl 0x00c337c0
0098f5c0	ldrb w8,[sp, #0x70]
0098f5c4	str x19,[x27]
0098f5c8	tbz w8,#0x0,0x0098f5d4
0098f5cc	ldr x0,[sp, #0x80]
0098f5d0	bl 0x00c301d0
0098f5d4	ldrb w8,[sp, #0x50]
0098f5d8	tbz w8,#0x0,0x0098f5e4
0098f5dc	ldr x0,[sp, #0x60]
0098f5e0	bl 0x00c301d0
0098f5e4	ldr x1,[sp, #0x40]
0098f5e8	add x8,sp,#0x20
0098f5ec	add x0,x8,#0x18
0098f5f0	bl 0x00c32fc0
0098f5f4	ldrb w8,[sp, #0x20]
0098f5f8	tbz w8,#0x0,0x0098f604
0098f5fc	ldr x0,[sp, #0x30]
0098f600	bl 0x00c301d0
0098f604	ldrb w8,[sp, #0xa8]
0098f608	tbz w8,#0x0,0x0098f614
0098f60c	ldr x0,[sp, #0xb8]
0098f610	bl 0x00c301d0
0098f614	ldr x8,[x23, #0x28]
0098f618	ldur x9,[x29, #-0x60]
0098f61c	cmp x8,x9
0098f620	b.ne 0x0098f644
0098f624	ldp x29,x30,[sp, #0x130]
0098f628	ldp x20,x19,[sp, #0x120]
0098f62c	ldp x22,x21,[sp, #0x110]
0098f630	ldp x24,x23,[sp, #0x100]
0098f634	ldp x26,x25,[sp, #0xf0]
0098f638	ldp x28,x27,[sp, #0xe0]
0098f63c	add sp,sp,#0x140
0098f640	ret
0098f644	bl 0x00c2fec0
0098f648	bl 0x00c30ce0
