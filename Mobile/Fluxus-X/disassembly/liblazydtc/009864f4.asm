; std::__ndk1::shared_ptr<ix::DNSLookup>::make_shared<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&,int&> @ 009864f4
009864f4	str x25,[sp, #-0x50]!
009864f8	stp x24,x23,[sp, #0x10]
009864fc	stp x22,x21,[sp, #0x20]
00986500	stp x20,x19,[sp, #0x30]
00986504	stp x29,x30,[sp, #0x40]
00986508	add x29,sp,#0x40
0098650c	mov x23,x0
00986510	mov w0,#0xd0
00986514	mov x22,x1
00986518	mov x21,x8
0098651c	bl 0x00c2fed0
00986520	adrp x8,0xcb4000
00986524	ldr x8,[x8, #0xfb0]
00986528	adrp x9,0xcb4000
0098652c	ldr x9,[x9, #0xeb0]
00986530	mov x24,x0
00986534	mov x25,x0
00986538	mov x20,x0
0098653c	add x8,x8,#0x10
00986540	str xzr,[x24, #0x8]!
00986544	str xzr,[x25, #0x10]!
00986548	str x8,[x20], #0x18
0098654c	ldr w2,[x22]
00986550	ldr x3,[x9]
00986554	mov x19,x0
00986558	mov x0,x20
0098655c	mov x1,x23
00986560	bl 0x00c32ee0
00986564	ldr x0,[x19, #0x20]
00986568	stp x20,x19,[x21]
0098656c	cbz x0,0x0098657c
00986570	ldr x8,[x0, #0x8]
00986574	cmn x8,#0x1
00986578	b.ne 0x009865bc
0098657c	ldxr x8,[x24]
00986580	add x8,x8,#0x1
00986584	stxr w9,x8,[x24]
00986588	cbnz w9,0x0098657c
0098658c	ldxr x8,[x25]
00986590	add x8,x8,#0x1
00986594	stxr w9,x8,[x25]
00986598	cbnz w9,0x0098658c
0098659c	stp x20,x19,[x19, #0x18]
009865a0	cbz x0,0x009865a8
009865a4	bl 0x00c2ff00
009865a8	ldaxr x8,[x24]
009865ac	sub x9,x8,#0x1
009865b0	stlxr w10,x9,[x24]
009865b4	cbnz w10,0x009865a8
009865b8	cbz x8,0x009865d4
009865bc	ldp x29,x30,[sp, #0x40]
009865c0	ldp x20,x19,[sp, #0x30]
009865c4	ldp x22,x21,[sp, #0x20]
009865c8	ldp x24,x23,[sp, #0x10]
009865cc	ldr x25,[sp], #0x50
009865d0	ret
009865d4	ldr x8,[x19]
009865d8	mov x0,x19
009865dc	ldr x8,[x8, #0x10]
009865e0	blr x8
009865e4	mov x0,x19
009865e8	ldp x29,x30,[sp, #0x40]
009865ec	ldp x20,x19,[sp, #0x30]
009865f0	ldp x22,x21,[sp, #0x20]
009865f4	ldp x24,x23,[sp, #0x10]
009865f8	ldr x25,[sp], #0x50
009865fc	b 0x00c2ff00
