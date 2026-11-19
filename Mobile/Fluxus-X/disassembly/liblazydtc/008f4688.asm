; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__construct_node<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&> @ 008f4688
008f4688	stp x26,x25,[sp, #-0x50]!
008f468c	stp x24,x23,[sp, #0x10]
008f4690	stp x22,x21,[sp, #0x20]
008f4694	stp x20,x19,[sp, #0x30]
008f4698	stp x29,x30,[sp, #0x40]
008f469c	add x29,sp,#0x40
008f46a0	add x21,x0,#0x8
008f46a4	mov w0,#0x50
008f46a8	mov x22,x1
008f46ac	mov x19,x8
008f46b0	bl 0x00c2fed0
008f46b4	stp x0,x21,[x19]
008f46b8	mov x21,x0
008f46bc	strb wzr,[x19, #0x10]
008f46c0	str xzr,[x21, #0x20]!
008f46c4	stp xzr,xzr,[x0, #0x28]
008f46c8	ldrb w8,[x22]
008f46cc	mov x20,x0
008f46d0	tbnz w8,#0x0,0x008f46e8
008f46d4	ldr x8,[x22, #0x10]
008f46d8	str x8,[x21, #0x10]
008f46dc	ldr q0,[x22]
008f46e0	str q0,[x21]
008f46e4	b 0x008f4748
008f46e8	ldr x23,[x22, #0x8]
008f46ec	cmn x23,#0x10
008f46f0	b.cs 0x008f47f4
008f46f4	ldr x24,[x22, #0x10]
008f46f8	cmp x23,#0x17
008f46fc	b.cs 0x008f4714
008f4700	lsl w8,w23,#0x1
008f4704	add x25,x20,#0x21
008f4708	strb w8,[x20, #0x20]
008f470c	cbnz x23,0x008f4734
008f4710	b 0x008f4744
008f4714	add x8,x23,#0x10
008f4718	and x26,x8,#-0x10
008f471c	mov x0,x26
008f4720	bl 0x00c2fed0
008f4724	orr x8,x26,#0x1
008f4728	mov x25,x0
008f472c	stp x23,x0,[x20, #0x28]
008f4730	str x8,[x20, #0x20]
008f4734	mov x0,x25
008f4738	mov x1,x24
008f473c	mov x2,x23
008f4740	bl 0x00c2ffd0
008f4744	strb wzr,[x25, x23]
008f4748	mov x0,x20
008f474c	str xzr,[x0, #0x38]!
008f4750	stp xzr,xzr,[x0, #0x8]
008f4754	mov x8,x22
008f4758	ldrb w9,[x8, #0x18]!
008f475c	tbnz w9,#0x0,0x008f4774
008f4760	ldr x9,[x8, #0x10]
008f4764	str x9,[x0, #0x10]
008f4768	ldr q0,[x8]
008f476c	str q0,[x0]
008f4770	b 0x008f47d4
008f4774	ldr x23,[x22, #0x20]
008f4778	cmn x23,#0x10
008f477c	b.cs 0x008f47fc
008f4780	ldr x22,[x22, #0x28]
008f4784	cmp x23,#0x17
008f4788	b.cs 0x008f47a0
008f478c	lsl w8,w23,#0x1
008f4790	add x24,x20,#0x39
008f4794	strb w8,[x20, #0x38]
008f4798	cbnz x23,0x008f47c0
008f479c	b 0x008f47d0
008f47a0	add x8,x23,#0x10
008f47a4	and x25,x8,#-0x10
008f47a8	mov x0,x25
008f47ac	bl 0x00c2fed0
008f47b0	orr x8,x25,#0x1
008f47b4	mov x24,x0
008f47b8	stp x23,x0,[x20, #0x40]
008f47bc	str x8,[x20, #0x38]
008f47c0	mov x0,x24
008f47c4	mov x1,x22
008f47c8	mov x2,x23
008f47cc	bl 0x00c2ffd0
008f47d0	strb wzr,[x24, x23]
008f47d4	mov w8,#0x1
008f47d8	strb w8,[x19, #0x10]
008f47dc	ldp x29,x30,[sp, #0x40]
008f47e0	ldp x20,x19,[sp, #0x30]
008f47e4	ldp x22,x21,[sp, #0x20]
008f47e8	ldp x24,x23,[sp, #0x10]
008f47ec	ldp x26,x25,[sp], #0x50
008f47f0	ret
008f47f4	mov x0,x21
008f47f8	bl 0x00c30ce0
008f47fc	bl 0x00c30ce0
