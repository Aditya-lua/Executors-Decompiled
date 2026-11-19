; std::__ndk1::__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::__construct_node<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&> @ 008f5360
008f5360	sub sp,sp,#0x60
008f5364	str x25,[sp, #0x10]
008f5368	stp x24,x23,[sp, #0x20]
008f536c	stp x22,x21,[sp, #0x30]
008f5370	stp x20,x19,[sp, #0x40]
008f5374	stp x29,x30,[sp, #0x50]
008f5378	add x29,sp,#0x50
008f537c	mrs x25,tpidr_el0
008f5380	mov x19,x8
008f5384	ldr x8,[x25, #0x28]
008f5388	add x21,x0,#0x10
008f538c	mov w0,#0x28
008f5390	mov x22,x1
008f5394	str x8,[sp, #0x8]
008f5398	bl 0x00c2fed0
008f539c	mov x20,x0
008f53a0	stp x0,x21,[x19]
008f53a4	strb wzr,[x19, #0x10]
008f53a8	str xzr,[x0, #0x10]!
008f53ac	stp xzr,xzr,[x20, #0x18]
008f53b0	ldrb w8,[x22]
008f53b4	tbnz w8,#0x0,0x008f53cc
008f53b8	ldr x8,[x22, #0x10]
008f53bc	str x8,[x0, #0x10]
008f53c0	ldr q0,[x22]
008f53c4	str q0,[x0]
008f53c8	b 0x008f542c
008f53cc	ldr x21,[x22, #0x8]
008f53d0	cmn x21,#0x10
008f53d4	b.cs 0x008f5490
008f53d8	ldr x22,[x22, #0x10]
008f53dc	cmp x21,#0x17
008f53e0	b.cs 0x008f53f8
008f53e4	lsl w8,w21,#0x1
008f53e8	add x23,x20,#0x11
008f53ec	strb w8,[x20, #0x10]
008f53f0	cbnz x21,0x008f5418
008f53f4	b 0x008f5428
008f53f8	add x8,x21,#0x10
008f53fc	and x24,x8,#-0x10
008f5400	mov x0,x24
008f5404	bl 0x00c2fed0
008f5408	orr x8,x24,#0x1
008f540c	mov x23,x0
008f5410	stp x21,x0,[x20, #0x18]
008f5414	str x8,[x20, #0x10]
008f5418	mov x0,x23
008f541c	mov x1,x22
008f5420	mov x2,x21
008f5424	bl 0x00c2ffd0
008f5428	strb wzr,[x23, x21]
008f542c	ldr x20,[x19]
008f5430	mov w8,#0x1
008f5434	strb w8,[x19, #0x10]
008f5438	ldrb w8,[x20, #0x10]
008f543c	ldp x9,x10,[x20, #0x18]
008f5440	add x11,x20,#0x11
008f5444	tst w8,#0x1
008f5448	lsr w12,w8,#0x1
008f544c	csel x1,x11,x10,eq
008f5450	csel x2,x12,x9,eq
008f5454	mov x0,sp
008f5458	bl 0x00c30d50
008f545c	stp xzr,x0,[x20]
008f5460	ldr x8,[x25, #0x28]
008f5464	ldr x9,[sp, #0x8]
008f5468	cmp x8,x9
008f546c	b.ne 0x008f548c
008f5470	ldp x29,x30,[sp, #0x50]
008f5474	ldp x20,x19,[sp, #0x40]
008f5478	ldp x22,x21,[sp, #0x30]
008f547c	ldp x24,x23,[sp, #0x20]
008f5480	ldr x25,[sp, #0x10]
008f5484	add sp,sp,#0x60
008f5488	ret
008f548c	bl 0x00c2fec0
008f5490	bl 0x00c30ce0
