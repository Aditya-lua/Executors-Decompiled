; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>::__construct_node<std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>,std::__ndk1::tuple<>> @ 008eb178
008eb178	stp x24,x23,[sp, #-0x40]!
008eb17c	stp x22,x21,[sp, #0x10]
008eb180	stp x20,x19,[sp, #0x20]
008eb184	stp x29,x30,[sp, #0x30]
008eb188	add x29,sp,#0x30
008eb18c	add x22,x0,#0x8
008eb190	mov w0,#0x58
008eb194	mov x21,x2
008eb198	mov x19,x8
008eb19c	bl 0x00c2fed0
008eb1a0	stp x0,x22,[x19]
008eb1a4	strb wzr,[x19, #0x10]
008eb1a8	ldr x8,[x21]
008eb1ac	mov x20,x0
008eb1b0	str xzr,[x0, #0x20]!
008eb1b4	stp xzr,xzr,[x20, #0x28]
008eb1b8	ldrb w9,[x8]
008eb1bc	tbnz w9,#0x0,0x008eb1d4
008eb1c0	ldr x9,[x8, #0x10]
008eb1c4	str x9,[x0, #0x10]
008eb1c8	ldr q0,[x8]
008eb1cc	str q0,[x0]
008eb1d0	b 0x008eb234
008eb1d4	ldr x21,[x8, #0x8]
008eb1d8	cmn x21,#0x10
008eb1dc	b.cs 0x008eb268
008eb1e0	ldr x22,[x8, #0x10]
008eb1e4	cmp x21,#0x17
008eb1e8	b.cs 0x008eb200
008eb1ec	lsl w8,w21,#0x1
008eb1f0	add x23,x20,#0x21
008eb1f4	strb w8,[x20, #0x20]
008eb1f8	cbnz x21,0x008eb220
008eb1fc	b 0x008eb230
008eb200	add x8,x21,#0x10
008eb204	and x24,x8,#-0x10
008eb208	mov x0,x24
008eb20c	bl 0x00c2fed0
008eb210	orr x8,x24,#0x1
008eb214	mov x23,x0
008eb218	stp x21,x0,[x20, #0x28]
008eb21c	str x8,[x20, #0x20]
008eb220	mov x0,x23
008eb224	mov x1,x22
008eb228	mov x2,x21
008eb22c	bl 0x00c2ffd0
008eb230	strb wzr,[x23, x21]
008eb234	adrp x8,0xcb4000
008eb238	ldr x8,[x8, #0xcb0]
008eb23c	mov w9,#0x1
008eb240	stp xzr,xzr,[x20, #0x48]
008eb244	strb w9,[x19, #0x10]
008eb248	add x8,x8,#0x10
008eb24c	stp x8,xzr,[x20, #0x38]
008eb250	strb wzr,[x20, #0x41]
008eb254	ldp x29,x30,[sp, #0x30]
008eb258	ldp x20,x19,[sp, #0x20]
008eb25c	ldp x22,x21,[sp, #0x10]
008eb260	ldp x24,x23,[sp], #0x40
008eb264	ret
008eb268	bl 0x00c30ce0
