; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&> @ 0097a870
0097a870	stp x26,x25,[sp, #-0x50]!
0097a874	stp x24,x23,[sp, #0x10]
0097a878	stp x22,x21,[sp, #0x20]
0097a87c	stp x20,x19,[sp, #0x30]
0097a880	stp x29,x30,[sp, #0x40]
0097a884	add x29,sp,#0x40
0097a888	add x21,x0,#0x8
0097a88c	mov w0,#0x50
0097a890	mov x22,x1
0097a894	mov x19,x8
0097a898	bl 0x00c2fed0
0097a89c	stp x0,x21,[x19]
0097a8a0	mov x21,x0
0097a8a4	strb wzr,[x19, #0x10]
0097a8a8	str xzr,[x21, #0x20]!
0097a8ac	stp xzr,xzr,[x0, #0x28]
0097a8b0	ldrb w8,[x22]
0097a8b4	mov x20,x0
0097a8b8	tbnz w8,#0x0,0x0097a8d0
0097a8bc	ldr x8,[x22, #0x10]
0097a8c0	str x8,[x21, #0x10]
0097a8c4	ldr q0,[x22]
0097a8c8	str q0,[x21]
0097a8cc	b 0x0097a930
0097a8d0	ldr x23,[x22, #0x8]
0097a8d4	cmn x23,#0x10
0097a8d8	b.cs 0x0097a9dc
0097a8dc	ldr x24,[x22, #0x10]
0097a8e0	cmp x23,#0x17
0097a8e4	b.cs 0x0097a8fc
0097a8e8	lsl w8,w23,#0x1
0097a8ec	add x25,x20,#0x21
0097a8f0	strb w8,[x20, #0x20]
0097a8f4	cbnz x23,0x0097a91c
0097a8f8	b 0x0097a92c
0097a8fc	add x8,x23,#0x10
0097a900	and x26,x8,#-0x10
0097a904	mov x0,x26
0097a908	bl 0x00c2fed0
0097a90c	orr x8,x26,#0x1
0097a910	mov x25,x0
0097a914	stp x23,x0,[x20, #0x28]
0097a918	str x8,[x20, #0x20]
0097a91c	mov x0,x25
0097a920	mov x1,x24
0097a924	mov x2,x23
0097a928	bl 0x00c2ffd0
0097a92c	strb wzr,[x25, x23]
0097a930	mov x0,x20
0097a934	str xzr,[x0, #0x38]!
0097a938	stp xzr,xzr,[x0, #0x8]
0097a93c	mov x8,x22
0097a940	ldrb w9,[x8, #0x18]!
0097a944	tbnz w9,#0x0,0x0097a95c
0097a948	ldr x9,[x8, #0x10]
0097a94c	str x9,[x0, #0x10]
0097a950	ldr q0,[x8]
0097a954	str q0,[x0]
0097a958	b 0x0097a9bc
0097a95c	ldr x23,[x22, #0x20]
0097a960	cmn x23,#0x10
0097a964	b.cs 0x0097a9e4
0097a968	ldr x22,[x22, #0x28]
0097a96c	cmp x23,#0x17
0097a970	b.cs 0x0097a988
0097a974	lsl w8,w23,#0x1
0097a978	add x24,x20,#0x39
0097a97c	strb w8,[x20, #0x38]
0097a980	cbnz x23,0x0097a9a8
0097a984	b 0x0097a9b8
0097a988	add x8,x23,#0x10
0097a98c	and x25,x8,#-0x10
0097a990	mov x0,x25
0097a994	bl 0x00c2fed0
0097a998	orr x8,x25,#0x1
0097a99c	mov x24,x0
0097a9a0	stp x23,x0,[x20, #0x40]
0097a9a4	str x8,[x20, #0x38]
0097a9a8	mov x0,x24
0097a9ac	mov x1,x22
0097a9b0	mov x2,x23
0097a9b4	bl 0x00c2ffd0
0097a9b8	strb wzr,[x24, x23]
0097a9bc	mov w8,#0x1
0097a9c0	strb w8,[x19, #0x10]
0097a9c4	ldp x29,x30,[sp, #0x40]
0097a9c8	ldp x20,x19,[sp, #0x30]
0097a9cc	ldp x22,x21,[sp, #0x20]
0097a9d0	ldp x24,x23,[sp, #0x10]
0097a9d4	ldp x26,x25,[sp], #0x50
0097a9d8	ret
0097a9dc	mov x0,x21
0097a9e0	bl 0x00c30ce0
0097a9e4	bl 0x00c30ce0
