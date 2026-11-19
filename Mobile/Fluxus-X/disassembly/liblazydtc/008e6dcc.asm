; std::__ndk1::__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::__construct_node_hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&> @ 008e6dcc
008e6dcc	str x25,[sp, #-0x50]!
008e6dd0	stp x24,x23,[sp, #0x10]
008e6dd4	stp x22,x21,[sp, #0x20]
008e6dd8	stp x20,x19,[sp, #0x30]
008e6ddc	stp x29,x30,[sp, #0x40]
008e6de0	add x29,sp,#0x40
008e6de4	add x22,x0,#0x10
008e6de8	mov w0,#0x28
008e6dec	mov x23,x2
008e6df0	mov x20,x1
008e6df4	mov x19,x8
008e6df8	bl 0x00c2fed0
008e6dfc	mov x21,x0
008e6e00	stp x0,x22,[x19]
008e6e04	strb wzr,[x19, #0x10]
008e6e08	str xzr,[x0, #0x10]!
008e6e0c	stp xzr,xzr,[x21, #0x18]
008e6e10	ldrb w8,[x23]
008e6e14	tbnz w8,#0x0,0x008e6e2c
008e6e18	ldr x8,[x23, #0x10]
008e6e1c	str x8,[x0, #0x10]
008e6e20	ldr q0,[x23]
008e6e24	str q0,[x0]
008e6e28	b 0x008e6e8c
008e6e2c	ldr x22,[x23, #0x8]
008e6e30	cmn x22,#0x10
008e6e34	b.cs 0x008e6eb4
008e6e38	ldr x23,[x23, #0x10]
008e6e3c	cmp x22,#0x17
008e6e40	b.cs 0x008e6e58
008e6e44	lsl w8,w22,#0x1
008e6e48	add x24,x21,#0x11
008e6e4c	strb w8,[x21, #0x10]
008e6e50	cbnz x22,0x008e6e78
008e6e54	b 0x008e6e88
008e6e58	add x8,x22,#0x10
008e6e5c	and x25,x8,#-0x10
008e6e60	mov x0,x25
008e6e64	bl 0x00c2fed0
008e6e68	orr x8,x25,#0x1
008e6e6c	mov x24,x0
008e6e70	stp x22,x0,[x21, #0x18]
008e6e74	str x8,[x21, #0x10]
008e6e78	mov x0,x24
008e6e7c	mov x1,x23
008e6e80	mov x2,x22
008e6e84	bl 0x00c2ffd0
008e6e88	strb wzr,[x24, x22]
008e6e8c	ldr x8,[x19]
008e6e90	mov w9,#0x1
008e6e94	strb w9,[x19, #0x10]
008e6e98	stp xzr,x20,[x8]
008e6e9c	ldp x29,x30,[sp, #0x40]
008e6ea0	ldp x20,x19,[sp, #0x30]
008e6ea4	ldp x22,x21,[sp, #0x20]
008e6ea8	ldp x24,x23,[sp, #0x10]
008e6eac	ldr x25,[sp], #0x50
008e6eb0	ret
008e6eb4	bl 0x00c30ce0
