; std::__ndk1::__tree<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<cpr::AcceptEncodingMethods,std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<cpr::AcceptEncodingMethods>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<cpr::AcceptEncodingMethods,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__construct_node<std::__ndk1::pair<cpr::AcceptEncodingMethods_const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&> @ 008e6314
008e6314	stp x24,x23,[sp, #-0x40]!
008e6318	stp x22,x21,[sp, #0x10]
008e631c	stp x20,x19,[sp, #0x20]
008e6320	stp x29,x30,[sp, #0x30]
008e6324	add x29,sp,#0x30
008e6328	add x21,x0,#0x8
008e632c	mov w0,#0x40
008e6330	mov x22,x1
008e6334	mov x19,x8
008e6338	bl 0x00c2fed0
008e633c	stp x0,x21,[x19]
008e6340	strb wzr,[x19, #0x10]
008e6344	ldr w8,[x22]
008e6348	mov x20,x0
008e634c	str w8,[x0, #0x20]
008e6350	str xzr,[x0, #0x28]!
008e6354	stp xzr,xzr,[x20, #0x30]
008e6358	mov x8,x22
008e635c	ldrb w9,[x8, #0x8]!
008e6360	tbnz w9,#0x0,0x008e6378
008e6364	ldr x9,[x8, #0x10]
008e6368	str x9,[x0, #0x10]
008e636c	ldr q0,[x8]
008e6370	str q0,[x0]
008e6374	b 0x008e63d8
008e6378	ldr x21,[x22, #0x10]
008e637c	cmn x21,#0x10
008e6380	b.cs 0x008e63f4
008e6384	ldr x22,[x22, #0x18]
008e6388	cmp x21,#0x17
008e638c	b.cs 0x008e63a4
008e6390	lsl w8,w21,#0x1
008e6394	add x23,x20,#0x29
008e6398	strb w8,[x20, #0x28]
008e639c	cbnz x21,0x008e63c4
008e63a0	b 0x008e63d4
008e63a4	add x8,x21,#0x10
008e63a8	and x24,x8,#-0x10
008e63ac	mov x0,x24
008e63b0	bl 0x00c2fed0
008e63b4	orr x8,x24,#0x1
008e63b8	mov x23,x0
008e63bc	stp x21,x0,[x20, #0x30]
008e63c0	str x8,[x20, #0x28]
008e63c4	mov x0,x23
008e63c8	mov x1,x22
008e63cc	mov x2,x21
008e63d0	bl 0x00c2ffd0
008e63d4	strb wzr,[x23, x21]
008e63d8	mov w8,#0x1
008e63dc	strb w8,[x19, #0x10]
008e63e0	ldp x29,x30,[sp, #0x30]
008e63e4	ldp x20,x19,[sp, #0x20]
008e63e8	ldp x22,x21,[sp, #0x10]
008e63ec	ldp x24,x23,[sp], #0x40
008e63f0	ret
008e63f4	bl 0x00c30ce0
