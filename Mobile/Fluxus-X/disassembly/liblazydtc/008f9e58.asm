; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,cpr::CaseInsensitiveCompare,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__construct_node<std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>,std::__ndk1::tuple<>> @ 008f9e58
008f9e58	stp x24,x23,[sp, #-0x40]!
008f9e5c	stp x22,x21,[sp, #0x10]
008f9e60	stp x20,x19,[sp, #0x20]
008f9e64	stp x29,x30,[sp, #0x30]
008f9e68	add x29,sp,#0x30
008f9e6c	add x22,x0,#0x8
008f9e70	mov w0,#0x50
008f9e74	mov x21,x2
008f9e78	mov x19,x8
008f9e7c	bl 0x00c2fed0
008f9e80	stp x0,x22,[x19]
008f9e84	strb wzr,[x19, #0x10]
008f9e88	ldr x8,[x21]
008f9e8c	mov x20,x0
008f9e90	str xzr,[x0, #0x20]!
008f9e94	stp xzr,xzr,[x20, #0x28]
008f9e98	ldrb w9,[x8]
008f9e9c	tbnz w9,#0x0,0x008f9eb4
008f9ea0	ldr x9,[x8, #0x10]
008f9ea4	str x9,[x0, #0x10]
008f9ea8	ldr q0,[x8]
008f9eac	str q0,[x0]
008f9eb0	b 0x008f9f14
008f9eb4	ldr x21,[x8, #0x8]
008f9eb8	cmn x21,#0x10
008f9ebc	b.cs 0x008f9f38
008f9ec0	ldr x22,[x8, #0x10]
008f9ec4	cmp x21,#0x17
008f9ec8	b.cs 0x008f9ee0
008f9ecc	lsl w8,w21,#0x1
008f9ed0	add x23,x20,#0x21
008f9ed4	strb w8,[x20, #0x20]
008f9ed8	cbnz x21,0x008f9f00
008f9edc	b 0x008f9f10
008f9ee0	add x8,x21,#0x10
008f9ee4	and x24,x8,#-0x10
008f9ee8	mov x0,x24
008f9eec	bl 0x00c2fed0
008f9ef0	orr x8,x24,#0x1
008f9ef4	mov x23,x0
008f9ef8	stp x21,x0,[x20, #0x28]
008f9efc	str x8,[x20, #0x20]
008f9f00	mov x0,x23
008f9f04	mov x1,x22
008f9f08	mov x2,x21
008f9f0c	bl 0x00c2ffd0
008f9f10	strb wzr,[x23, x21]
008f9f14	mov w8,#0x1
008f9f18	stp xzr,xzr,[x20, #0x40]
008f9f1c	str xzr,[x20, #0x38]
008f9f20	strb w8,[x19, #0x10]
008f9f24	ldp x29,x30,[sp, #0x30]
008f9f28	ldp x20,x19,[sp, #0x20]
008f9f2c	ldp x22,x21,[sp, #0x10]
008f9f30	ldp x24,x23,[sp], #0x40
008f9f34	ret
008f9f38	bl 0x00c30ce0
