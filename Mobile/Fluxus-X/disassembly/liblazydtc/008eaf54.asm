; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>::__count_unique<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 008eaf54
008eaf54	str x27,[sp, #-0x60]!
008eaf58	stp x26,x25,[sp, #0x10]
008eaf5c	stp x24,x23,[sp, #0x20]
008eaf60	stp x22,x21,[sp, #0x30]
008eaf64	stp x20,x19,[sp, #0x40]
008eaf68	stp x29,x30,[sp, #0x50]
008eaf6c	add x29,sp,#0x50
008eaf70	ldr x23,[x0, #0x8]
008eaf74	cbz x23,0x008eb028
008eaf78	ldrb w8,[x1]
008eaf7c	ldp x9,x10,[x1, #0x8]
008eaf80	mov w19,#0x1
008eaf84	lsr w11,w8,#0x1
008eaf88	tst w8,#0x1
008eaf8c	csel x24,x11,x9,eq
008eaf90	csinc x20,x10,x1,ne
008eaf94	mov x26,x23
008eaf98	ldrb w27,[x26, #0x20]!
008eaf9c	ldr x8,[x26, #0x8]
008eafa0	lsr w9,w27,#0x1
008eafa4	tst w27,#0x1
008eafa8	csel x25,x9,x8,eq
008eafac	cmp x25,x24
008eafb0	csel x21,x25,x24,cc
008eafb4	cbz x21,0x008eafe0
008eafb8	ldr x8,[x23, #0x30]
008eafbc	tst w27,#0x1
008eafc0	mov x0,x20
008eafc4	mov x2,x21
008eafc8	csinc x22,x8,x26,ne
008eafcc	mov x1,x22
008eafd0	bl 0x00c300b0
008eafd4	cbz w0,0x008eafe0
008eafd8	tbz w0,#0x1f,0x008eaff8
008eafdc	b 0x008eb020
008eafe0	cmp x24,x25
008eafe4	b.cc 0x008eb020
008eafe8	cbz x21,0x008eb014
008eafec	ldr x8,[x23, #0x30]
008eaff0	tst w27,#0x1
008eaff4	csinc x22,x8,x26,ne
008eaff8	mov x0,x22
008eaffc	mov x1,x20
008eb000	mov x2,x21
008eb004	bl 0x00c300b0
008eb008	cbz w0,0x008eb014
008eb00c	tbnz w0,#0x1f,0x008eb01c
008eb010	b 0x008eb02c
008eb014	cmp x25,x24
008eb018	b.cs 0x008eb02c
008eb01c	add x23,x23,#0x8
008eb020	ldr x23,[x23]
008eb024	cbnz x23,0x008eaf94
008eb028	mov x19,xzr
008eb02c	mov x0,x19
008eb030	ldp x29,x30,[sp, #0x50]
008eb034	ldp x20,x19,[sp, #0x40]
008eb038	ldp x22,x21,[sp, #0x30]
008eb03c	ldp x24,x23,[sp, #0x20]
008eb040	ldp x26,x25,[sp, #0x10]
008eb044	ldr x27,[sp], #0x60
008eb048	ret
