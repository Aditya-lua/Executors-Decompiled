; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,cpr::CaseInsensitiveCompare,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&> @ 008f9c0c
008f9c0c	sub sp,sp,#0x60
008f9c10	str x23,[sp, #0x20]
008f9c14	stp x22,x21,[sp, #0x30]
008f9c18	stp x20,x19,[sp, #0x40]
008f9c1c	stp x29,x30,[sp, #0x50]
008f9c20	add x29,sp,#0x50
008f9c24	mrs x22,tpidr_el0
008f9c28	ldr x8,[x22, #0x28]
008f9c2c	mov x19,x0
008f9c30	str x8,[sp, #0x18]
008f9c34	mov x8,sp
008f9c38	bl 0x008289b8
008f9c3c	mov x8,x19
008f9c40	ldr x9,[sp]
008f9c44	ldr x23,[x8, #0x8]!
008f9c48	cbz x23,0x008f9c8c
008f9c4c	add x20,x9,#0x20
008f9c50	add x21,x19,#0x10
008f9c54	b 0x008f9c5c
008f9c58	mov x23,x8
008f9c5c	add x2,x23,#0x20
008f9c60	mov x0,x21
008f9c64	mov x1,x20
008f9c68	bl 0x00c30490
008f9c6c	tbz w0,#0x0,0x008f9c7c
008f9c70	ldr x8,[x23]
008f9c74	cbnz x8,0x008f9c58
008f9c78	b 0x008f9c94
008f9c7c	ldr x8,[x23, #0x8]
008f9c80	cbnz x8,0x008f9c58
008f9c84	add x8,x23,#0x8
008f9c88	b 0x008f9c98
008f9c8c	mov x23,x8
008f9c90	b 0x008f9c98
008f9c94	mov x8,x23
008f9c98	ldr x1,[sp]
008f9c9c	stp xzr,xzr,[x1]
008f9ca0	str x23,[x1, #0x10]
008f9ca4	str x1,[x8]
008f9ca8	ldr x9,[x19]
008f9cac	ldr x9,[x9]
008f9cb0	cbz x9,0x008f9cbc
008f9cb4	str x9,[x19]
008f9cb8	ldr x1,[x8]
008f9cbc	ldr x0,[x19, #0x8]
008f9cc0	bl 0x00c30c90
008f9cc4	ldr x8,[x19, #0x10]
008f9cc8	add x8,x8,#0x1
008f9ccc	str x8,[x19, #0x10]
008f9cd0	ldr x0,[sp]
008f9cd4	ldr x8,[x22, #0x28]
008f9cd8	ldr x9,[sp, #0x18]
008f9cdc	cmp x8,x9
008f9ce0	b.ne 0x008f9cfc
008f9ce4	ldp x29,x30,[sp, #0x50]
008f9ce8	ldp x20,x19,[sp, #0x40]
008f9cec	ldp x22,x21,[sp, #0x30]
008f9cf0	ldr x23,[sp, #0x20]
008f9cf4	add sp,sp,#0x60
008f9cf8	ret
008f9cfc	bl 0x00c2fec0
