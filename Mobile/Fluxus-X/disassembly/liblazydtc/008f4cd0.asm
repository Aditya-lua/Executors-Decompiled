; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>::__construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,cpr::EncodedAuthentication>const&> @ 008f4cd0
008f4cd0	stp x26,x25,[sp, #-0x50]!
008f4cd4	stp x24,x23,[sp, #0x10]
008f4cd8	stp x22,x21,[sp, #0x20]
008f4cdc	stp x20,x19,[sp, #0x30]
008f4ce0	stp x29,x30,[sp, #0x40]
008f4ce4	add x29,sp,#0x40
008f4ce8	add x21,x0,#0x8
008f4cec	mov w0,#0x58
008f4cf0	mov x22,x1
008f4cf4	mov x19,x8
008f4cf8	bl 0x00c2fed0
008f4cfc	stp x0,x21,[x19]
008f4d00	mov x21,x0
008f4d04	strb wzr,[x19, #0x10]
008f4d08	str xzr,[x21, #0x20]!
008f4d0c	stp xzr,xzr,[x0, #0x28]
008f4d10	ldrb w8,[x22]
008f4d14	mov x20,x0
008f4d18	tbnz w8,#0x0,0x008f4d30
008f4d1c	ldr x8,[x22, #0x10]
008f4d20	str x8,[x21, #0x10]
008f4d24	ldr q0,[x22]
008f4d28	str q0,[x21]
008f4d2c	b 0x008f4d90
008f4d30	ldr x23,[x22, #0x8]
008f4d34	cmn x23,#0x10
008f4d38	b.cs 0x008f4e4c
008f4d3c	ldr x24,[x22, #0x10]
008f4d40	cmp x23,#0x17
008f4d44	b.cs 0x008f4d5c
008f4d48	lsl w8,w23,#0x1
008f4d4c	add x25,x20,#0x21
008f4d50	strb w8,[x20, #0x20]
008f4d54	cbnz x23,0x008f4d7c
008f4d58	b 0x008f4d8c
008f4d5c	add x8,x23,#0x10
008f4d60	and x26,x8,#-0x10
008f4d64	mov x0,x26
008f4d68	bl 0x00c2fed0
008f4d6c	orr x8,x26,#0x1
008f4d70	mov x25,x0
008f4d74	stp x23,x0,[x20, #0x28]
008f4d78	str x8,[x20, #0x20]
008f4d7c	mov x0,x25
008f4d80	mov x1,x24
008f4d84	mov x2,x23
008f4d88	bl 0x00c2ffd0
008f4d8c	strb wzr,[x25, x23]
008f4d90	adrp x8,0xcb4000
008f4d94	ldr x8,[x8, #0xcb0]
008f4d98	mov x0,x20
008f4d9c	str xzr,[x0, #0x40]!
008f4da0	stp xzr,xzr,[x0, #0x8]
008f4da4	add x8,x8,#0x10
008f4da8	stur x8,[x0, #-0x8]
008f4dac	mov x8,x22
008f4db0	ldrb w9,[x8, #0x20]!
008f4db4	tbnz w9,#0x0,0x008f4dcc
008f4db8	ldr x9,[x8, #0x10]
008f4dbc	str x9,[x0, #0x10]
008f4dc0	ldr q0,[x8]
008f4dc4	str q0,[x0]
008f4dc8	b 0x008f4e2c
008f4dcc	ldr x23,[x22, #0x28]
008f4dd0	cmn x23,#0x10
008f4dd4	b.cs 0x008f4e54
008f4dd8	ldr x22,[x22, #0x30]
008f4ddc	cmp x23,#0x17
008f4de0	b.cs 0x008f4df8
008f4de4	lsl w8,w23,#0x1
008f4de8	add x24,x20,#0x41
008f4dec	strb w8,[x20, #0x40]
008f4df0	cbnz x23,0x008f4e18
008f4df4	b 0x008f4e28
008f4df8	add x8,x23,#0x10
008f4dfc	and x25,x8,#-0x10
008f4e00	mov x0,x25
008f4e04	bl 0x00c2fed0
008f4e08	orr x8,x25,#0x1
008f4e0c	mov x24,x0
008f4e10	stp x23,x0,[x20, #0x48]
008f4e14	str x8,[x20, #0x40]
008f4e18	mov x0,x24
008f4e1c	mov x1,x22
008f4e20	mov x2,x23
008f4e24	bl 0x00c2ffd0
008f4e28	strb wzr,[x24, x23]
008f4e2c	mov w8,#0x1
008f4e30	strb w8,[x19, #0x10]
008f4e34	ldp x29,x30,[sp, #0x40]
008f4e38	ldp x20,x19,[sp, #0x30]
008f4e3c	ldp x22,x21,[sp, #0x20]
008f4e40	ldp x24,x23,[sp, #0x10]
008f4e44	ldp x26,x25,[sp], #0x50
008f4e48	ret
008f4e4c	mov x0,x21
008f4e50	bl 0x00c30ce0
008f4e54	bl 0x00c30ce0
