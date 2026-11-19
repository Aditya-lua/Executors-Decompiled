; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&> @ 0097ae44
0097ae44	sub sp,sp,#0x60
0097ae48	str x23,[sp, #0x20]
0097ae4c	stp x22,x21,[sp, #0x30]
0097ae50	stp x20,x19,[sp, #0x40]
0097ae54	stp x29,x30,[sp, #0x50]
0097ae58	add x29,sp,#0x50
0097ae5c	mrs x22,tpidr_el0
0097ae60	ldr x8,[x22, #0x28]
0097ae64	mov x19,x0
0097ae68	str x8,[sp, #0x18]
0097ae6c	mov x8,sp
0097ae70	bl 0x00c32fa0
0097ae74	mov x8,x19
0097ae78	ldr x9,[sp]
0097ae7c	ldr x23,[x8, #0x8]!
0097ae80	cbz x23,0x0097aec4
0097ae84	add x20,x9,#0x20
0097ae88	add x21,x19,#0x10
0097ae8c	b 0x0097ae94
0097ae90	mov x23,x8
0097ae94	add x2,x23,#0x20
0097ae98	mov x0,x21
0097ae9c	mov x1,x20
0097aea0	bl 0x00c331d0
0097aea4	tbz w0,#0x0,0x0097aeb4
0097aea8	ldr x8,[x23]
0097aeac	cbnz x8,0x0097ae90
0097aeb0	b 0x0097aecc
0097aeb4	ldr x8,[x23, #0x8]
0097aeb8	cbnz x8,0x0097ae90
0097aebc	add x8,x23,#0x8
0097aec0	b 0x0097aed0
0097aec4	mov x23,x8
0097aec8	b 0x0097aed0
0097aecc	mov x8,x23
0097aed0	ldr x1,[sp]
0097aed4	stp xzr,xzr,[x1]
0097aed8	str x23,[x1, #0x10]
0097aedc	str x1,[x8]
0097aee0	ldr x9,[x19]
0097aee4	ldr x9,[x9]
0097aee8	cbz x9,0x0097aef4
0097aeec	str x9,[x19]
0097aef0	ldr x1,[x8]
0097aef4	ldr x0,[x19, #0x8]
0097aef8	bl 0x00c30c90
0097aefc	ldr x8,[x19, #0x10]
0097af00	add x8,x8,#0x1
0097af04	str x8,[x19, #0x10]
0097af08	ldr x0,[sp]
0097af0c	ldr x8,[x22, #0x28]
0097af10	ldr x9,[sp, #0x18]
0097af14	cmp x8,x9
0097af18	b.ne 0x0097af34
0097af1c	ldp x29,x30,[sp, #0x50]
0097af20	ldp x20,x19,[sp, #0x40]
0097af24	ldp x22,x21,[sp, #0x30]
0097af28	ldr x23,[sp, #0x20]
0097af2c	add sp,sp,#0x60
0097af30	ret
0097af34	bl 0x00c2fec0
