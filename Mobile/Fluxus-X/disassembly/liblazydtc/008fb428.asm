; std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::operator[] @ 008fb428
008fb428	sub sp,sp,#0x60
008fb42c	stp x26,x25,[sp, #0x10]
008fb430	stp x24,x23,[sp, #0x20]
008fb434	stp x22,x21,[sp, #0x30]
008fb438	stp x20,x19,[sp, #0x40]
008fb43c	stp x29,x30,[sp, #0x50]
008fb440	add x29,sp,#0x50
008fb444	mrs x26,tpidr_el0
008fb448	ldr x8,[x26, #0x28]
008fb44c	mov x23,x1
008fb450	mov x1,sp
008fb454	mov x2,x23
008fb458	mov x20,x0
008fb45c	str x8,[sp, #0x8]
008fb460	bl 0x00c31130
008fb464	ldr x19,[x0]
008fb468	mov x21,x0
008fb46c	cbnz x19,0x008fb548
008fb470	mov w0,#0x50
008fb474	bl 0x00c2fed0
008fb478	mov x19,x0
008fb47c	str xzr,[x0, #0x20]!
008fb480	stp xzr,xzr,[x19, #0x28]
008fb484	ldrb w8,[x23]
008fb488	tbnz w8,#0x0,0x008fb4a0
008fb48c	ldr x8,[x23, #0x10]
008fb490	str x8,[x0, #0x10]
008fb494	ldr q0,[x23]
008fb498	str q0,[x0]
008fb49c	b 0x008fb500
008fb4a0	ldr x22,[x23, #0x8]
008fb4a4	cmn x22,#0x10
008fb4a8	b.cs 0x008fb57c
008fb4ac	ldr x23,[x23, #0x10]
008fb4b0	cmp x22,#0x17
008fb4b4	b.cs 0x008fb4cc
008fb4b8	lsl w8,w22,#0x1
008fb4bc	add x24,x19,#0x21
008fb4c0	strb w8,[x19, #0x20]
008fb4c4	cbnz x22,0x008fb4ec
008fb4c8	b 0x008fb4fc
008fb4cc	add x8,x22,#0x10
008fb4d0	and x25,x8,#-0x10
008fb4d4	mov x0,x25
008fb4d8	bl 0x00c2fed0
008fb4dc	orr x8,x25,#0x1
008fb4e0	mov x24,x0
008fb4e4	stp x22,x0,[x19, #0x28]
008fb4e8	str x8,[x19, #0x20]
008fb4ec	mov x0,x24
008fb4f0	mov x1,x23
008fb4f4	mov x2,x22
008fb4f8	bl 0x00c2ffd0
008fb4fc	strb wzr,[x24, x22]
008fb500	ldr x8,[sp]
008fb504	stp xzr,xzr,[x19, #0x40]
008fb508	str xzr,[x19, #0x38]
008fb50c	stp xzr,xzr,[x19]
008fb510	str x8,[x19, #0x10]
008fb514	str x19,[x21]
008fb518	ldr x8,[x20]
008fb51c	ldr x8,[x8]
008fb520	cbz x8,0x008fb530
008fb524	str x8,[x20]
008fb528	ldr x1,[x21]
008fb52c	b 0x008fb534
008fb530	mov x1,x19
008fb534	ldr x0,[x20, #0x8]
008fb538	bl 0x00c30c90
008fb53c	ldr x8,[x20, #0x10]
008fb540	add x8,x8,#0x1
008fb544	str x8,[x20, #0x10]
008fb548	ldr x8,[x26, #0x28]
008fb54c	ldr x9,[sp, #0x8]
008fb550	cmp x8,x9
008fb554	b.ne 0x008fb578
008fb558	add x0,x19,#0x38
008fb55c	ldp x29,x30,[sp, #0x50]
008fb560	ldp x20,x19,[sp, #0x40]
008fb564	ldp x22,x21,[sp, #0x30]
008fb568	ldp x24,x23,[sp, #0x20]
008fb56c	ldp x26,x25,[sp, #0x10]
008fb570	add sp,sp,#0x60
008fb574	ret
008fb578	bl 0x00c2fec0
008fb57c	bl 0x00c30ce0
