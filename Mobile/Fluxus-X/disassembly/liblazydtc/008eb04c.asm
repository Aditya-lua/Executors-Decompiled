; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,cpr::EncodedAuthentication>>>::__find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 008eb04c
008eb04c	stp x28,x27,[sp, #-0x60]!
008eb050	stp x26,x25,[sp, #0x10]
008eb054	stp x24,x23,[sp, #0x20]
008eb058	stp x22,x21,[sp, #0x30]
008eb05c	stp x20,x19,[sp, #0x40]
008eb060	stp x29,x30,[sp, #0x50]
008eb064	add x29,sp,#0x50
008eb068	mov x20,x0
008eb06c	ldr x24,[x20, #0x8]!
008eb070	mov x19,x1
008eb074	cbz x24,0x008eb148
008eb078	ldrb w8,[x2]
008eb07c	ldp x9,x10,[x2, #0x8]
008eb080	add x20,x0,#0x8
008eb084	lsr w11,w8,#0x1
008eb088	tst w8,#0x1
008eb08c	csel x25,x11,x9,eq
008eb090	csinc x21,x10,x2,ne
008eb094	b 0x008eb09c
008eb098	mov x24,x8
008eb09c	mov x27,x24
008eb0a0	ldrb w28,[x27, #0x20]!
008eb0a4	ldr x8,[x27, #0x8]
008eb0a8	lsr w9,w28,#0x1
008eb0ac	tst w28,#0x1
008eb0b0	csel x26,x9,x8,eq
008eb0b4	cmp x26,x25
008eb0b8	csel x22,x26,x25,cc
008eb0bc	cbz x22,0x008eb0e8
008eb0c0	ldr x8,[x24, #0x30]
008eb0c4	tst w28,#0x1
008eb0c8	mov x0,x21
008eb0cc	mov x2,x22
008eb0d0	csinc x23,x8,x27,ne
008eb0d4	mov x1,x23
008eb0d8	bl 0x00c300b0
008eb0dc	cbz w0,0x008eb0e8
008eb0e0	tbnz w0,#0x1f,0x008eb0f0
008eb0e4	b 0x008eb110
008eb0e8	cmp x25,x26
008eb0ec	b.cs 0x008eb100
008eb0f0	ldr x8,[x24]
008eb0f4	cbz x8,0x008eb150
008eb0f8	mov x20,x24
008eb0fc	b 0x008eb098
008eb100	cbz x22,0x008eb12c
008eb104	ldr x8,[x24, #0x30]
008eb108	tst w28,#0x1
008eb10c	csinc x23,x8,x27,ne
008eb110	mov x0,x23
008eb114	mov x1,x21
008eb118	mov x2,x22
008eb11c	bl 0x00c300b0
008eb120	cbz w0,0x008eb12c
008eb124	tbnz w0,#0x1f,0x008eb134
008eb128	b 0x008eb140
008eb12c	cmp x26,x25
008eb130	b.cs 0x008eb140
008eb134	mov x20,x24
008eb138	ldr x8,[x20, #0x8]!
008eb13c	cbnz x8,0x008eb098
008eb140	str x24,[x19]
008eb144	b 0x008eb158
008eb148	str x20,[x19]
008eb14c	b 0x008eb158
008eb150	str x24,[x19]
008eb154	mov x20,x24
008eb158	mov x0,x20
008eb15c	ldp x29,x30,[sp, #0x50]
008eb160	ldp x20,x19,[sp, #0x40]
008eb164	ldp x22,x21,[sp, #0x30]
008eb168	ldp x24,x23,[sp, #0x20]
008eb16c	ldp x26,x25,[sp, #0x10]
008eb170	ldp x28,x27,[sp], #0x60
008eb174	ret
