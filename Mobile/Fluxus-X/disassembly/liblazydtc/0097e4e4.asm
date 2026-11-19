; std::__ndk1::basic_istream<char,std::__ndk1::char_traits<char>>::read @ 0097e4e4
0097e4e4	str x21,[sp, #-0x30]!
0097e4e8	stp x20,x19,[sp, #0x10]
0097e4ec	stp x29,x30,[sp, #0x20]
0097e4f0	add x29,sp,#0x20
0097e4f4	ldr x8,[x0]
0097e4f8	str xzr,[x0, #0x8]
0097e4fc	mov x19,x0
0097e500	mov x20,x2
0097e504	ldur x8,[x8, #-0x18]
0097e508	mov x21,x1
0097e50c	add x0,x0,x8
0097e510	ldr w9,[x0, #0x20]
0097e514	cbz w9,0x0097e54c
0097e518	orr w1,w9,#0x4
0097e51c	bl 0x00c30130
0097e520	ldr x8,[x19]
0097e524	ldur x8,[x8, #-0x18]
0097e528	add x0,x19,x8
0097e52c	ldr w9,[x0, #0x20]
0097e530	orr w1,w9,#0x4
0097e534	bl 0x00c30130
0097e538	mov x0,x19
0097e53c	ldp x29,x30,[sp, #0x20]
0097e540	ldp x20,x19,[sp, #0x10]
0097e544	ldr x21,[sp], #0x30
0097e548	ret
0097e54c	ldr x0,[x0, #0x88]
0097e550	cbz x0,0x0097e56c
0097e554	bl 0x00c30e50
0097e558	ldr x8,[x19]
0097e55c	ldur x8,[x8, #-0x18]
0097e560	add x0,x19,x8
0097e564	ldr w9,[x0, #0x20]
0097e568	cbnz w9,0x0097e530
0097e56c	add x8,x19,x8
0097e570	ldr x0,[x8, #0x28]
0097e574	ldr x8,[x0]
0097e578	ldr x8,[x8, #0x40]
0097e57c	mov x1,x21
0097e580	mov x2,x20
0097e584	blr x8
0097e588	cmp x0,x20
0097e58c	str x0,[x19, #0x8]
0097e590	b.eq 0x0097e538
0097e594	ldr x8,[x19]
0097e598	ldur x8,[x8, #-0x18]
0097e59c	add x0,x19,x8
0097e5a0	ldr w8,[x0, #0x20]
0097e5a4	orr w1,w8,#0x6
0097e5a8	bl 0x00c30130
0097e5ac	b 0x0097e538
