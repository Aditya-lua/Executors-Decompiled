; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__emplace_multi<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>const&> @ 008f4544
008f4544	sub sp,sp,#0x70
008f4548	str x25,[sp, #0x20]
008f454c	stp x24,x23,[sp, #0x30]
008f4550	stp x22,x21,[sp, #0x40]
008f4554	stp x20,x19,[sp, #0x50]
008f4558	stp x29,x30,[sp, #0x60]
008f455c	add x29,sp,#0x60
008f4560	mrs x22,tpidr_el0
008f4564	ldr x8,[x22, #0x28]
008f4568	mov x19,x0
008f456c	str x8,[sp, #0x18]
008f4570	mov x8,sp
008f4574	bl 0x00c31140
008f4578	mov x8,x19
008f457c	ldr x20,[sp]
008f4580	ldr x23,[x8, #0x8]!
008f4584	cbz x23,0x008f4610
008f4588	ldrb w8,[x20, #0x20]
008f458c	ldp x10,x11,[x20, #0x28]
008f4590	add x9,x20,#0x20
008f4594	lsr w12,w8,#0x1
008f4598	tst w8,#0x1
008f459c	csel x24,x12,x10,eq
008f45a0	csinc x21,x11,x9,ne
008f45a4	b 0x008f45ac
008f45a8	mov x23,x8
008f45ac	mov x8,x23
008f45b0	ldrb w9,[x8, #0x20]!
008f45b4	ldr x10,[x8, #0x8]
008f45b8	lsr w11,w9,#0x1
008f45bc	tst w9,#0x1
008f45c0	csel x25,x11,x10,eq
008f45c4	cmp x25,x24
008f45c8	csel x2,x25,x24,cc
008f45cc	cbz x2,0x008f45f8
008f45d0	ldr x10,[x23, #0x30]
008f45d4	tst w9,#0x1
008f45d8	mov x0,x21
008f45dc	csinc x1,x10,x8,ne
008f45e0	bl 0x00c300b0
008f45e4	cbz w0,0x008f45f8
008f45e8	tbnz w0,#0x1f,0x008f4600
008f45ec	ldr x8,[x23, #0x8]
008f45f0	cbnz x8,0x008f45a8
008f45f4	b 0x008f4618
008f45f8	cmp x24,x25
008f45fc	b.cs 0x008f45ec
008f4600	ldr x8,[x23]
008f4604	cbnz x8,0x008f45a8
008f4608	mov x8,x23
008f460c	b 0x008f461c
008f4610	mov x23,x8
008f4614	b 0x008f461c
008f4618	add x8,x23,#0x8
008f461c	stp xzr,xzr,[x20]
008f4620	str x23,[x20, #0x10]
008f4624	str x20,[x8]
008f4628	ldr x9,[x19]
008f462c	ldr x9,[x9]
008f4630	cbz x9,0x008f463c
008f4634	str x9,[x19]
008f4638	ldr x20,[x8]
008f463c	ldr x0,[x19, #0x8]
008f4640	mov x1,x20
008f4644	bl 0x00c30c90
008f4648	ldr x8,[x19, #0x10]
008f464c	add x8,x8,#0x1
008f4650	str x8,[x19, #0x10]
008f4654	ldr x0,[sp]
008f4658	ldr x8,[x22, #0x28]
008f465c	ldr x9,[sp, #0x18]
008f4660	cmp x8,x9
008f4664	b.ne 0x008f4684
008f4668	ldp x29,x30,[sp, #0x60]
008f466c	ldp x20,x19,[sp, #0x50]
008f4670	ldp x22,x21,[sp, #0x40]
008f4674	ldp x24,x23,[sp, #0x30]
008f4678	ldr x25,[sp, #0x20]
008f467c	add sp,sp,#0x70
008f4680	ret
008f4684	bl 0x00c2fec0
