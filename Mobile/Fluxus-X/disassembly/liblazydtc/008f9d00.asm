; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,cpr::CaseInsensitiveCompare,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__emplace_unique_key_args<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::piecewise_construct_t_const&,std::__ndk1::tuple<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const&>,std::__ndk1::tuple<>> @ 008f9d00
008f9d00	sub sp,sp,#0x80
008f9d04	stp x28,x27,[sp, #0x20]
008f9d08	stp x26,x25,[sp, #0x30]
008f9d0c	stp x24,x23,[sp, #0x40]
008f9d10	stp x22,x21,[sp, #0x50]
008f9d14	stp x20,x19,[sp, #0x60]
008f9d18	stp x29,x30,[sp, #0x70]
008f9d1c	add x29,sp,#0x70
008f9d20	mrs x26,tpidr_el0
008f9d24	ldr x8,[x26, #0x28]
008f9d28	mov x27,x0
008f9d2c	mov x20,x4
008f9d30	mov x21,x3
008f9d34	str x8,[sp, #0x18]
008f9d38	ldr x28,[x27, #0x8]!
008f9d3c	mov x22,x2
008f9d40	mov x19,x0
008f9d44	mov x23,x1
008f9d48	cbz x28,0x008f9dac
008f9d4c	add x27,x19,#0x8
008f9d50	add x24,x19,#0x10
008f9d54	b 0x008f9d60
008f9d58	mov x27,x28
008f9d5c	mov x28,x8
008f9d60	add x25,x28,#0x20
008f9d64	mov x0,x24
008f9d68	mov x1,x23
008f9d6c	mov x2,x25
008f9d70	bl 0x00c30490
008f9d74	tbz w0,#0x0,0x008f9d84
008f9d78	ldr x8,[x28]
008f9d7c	cbnz x8,0x008f9d58
008f9d80	b 0x008f9dc0
008f9d84	mov x0,x24
008f9d88	mov x1,x25
008f9d8c	mov x2,x23
008f9d90	bl 0x00c30490
008f9d94	tbz w0,#0x0,0x008f9db0
008f9d98	mov x27,x28
008f9d9c	ldr x8,[x27, #0x8]!
008f9da0	cbz x8,0x008f9db0
008f9da4	mov x28,x8
008f9da8	b 0x008f9d60
008f9dac	mov x28,x27
008f9db0	ldr x0,[x27]
008f9db4	cbz x0,0x008f9dcc
008f9db8	mov x1,xzr
008f9dbc	b 0x008f9e24
008f9dc0	mov x27,x28
008f9dc4	ldr x0,[x27]
008f9dc8	cbnz x0,0x008f9db8
008f9dcc	mov x8,sp
008f9dd0	mov x0,x19
008f9dd4	mov x1,x22
008f9dd8	mov x2,x21
008f9ddc	mov x3,x20
008f9de0	bl 0x00c31680
008f9de4	ldr x1,[sp]
008f9de8	stp xzr,xzr,[x1]
008f9dec	str x28,[x1, #0x10]
008f9df0	str x1,[x27]
008f9df4	ldr x8,[x19]
008f9df8	ldr x8,[x8]
008f9dfc	cbz x8,0x008f9e08
008f9e00	str x8,[x19]
008f9e04	ldr x1,[x27]
008f9e08	ldr x0,[x19, #0x8]
008f9e0c	bl 0x00c30c90
008f9e10	ldr x8,[x19, #0x10]
008f9e14	mov w1,#0x1
008f9e18	add x8,x8,#0x1
008f9e1c	str x8,[x19, #0x10]
008f9e20	ldr x0,[sp]
008f9e24	ldr x8,[x26, #0x28]
008f9e28	ldr x9,[sp, #0x18]
008f9e2c	cmp x8,x9
008f9e30	b.ne 0x008f9e54
008f9e34	ldp x29,x30,[sp, #0x70]
008f9e38	ldp x20,x19,[sp, #0x60]
008f9e3c	ldp x22,x21,[sp, #0x50]
008f9e40	ldp x24,x23,[sp, #0x40]
008f9e44	ldp x26,x25,[sp, #0x30]
008f9e48	ldp x28,x27,[sp, #0x20]
008f9e4c	add sp,sp,#0x80
008f9e50	ret
008f9e54	bl 0x00c2fec0
