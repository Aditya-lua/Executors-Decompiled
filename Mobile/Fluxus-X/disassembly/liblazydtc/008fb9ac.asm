; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__count_unique<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 008fb9ac
008fb9ac	str x27,[sp, #-0x60]!
008fb9b0	stp x26,x25,[sp, #0x10]
008fb9b4	stp x24,x23,[sp, #0x20]
008fb9b8	stp x22,x21,[sp, #0x30]
008fb9bc	stp x20,x19,[sp, #0x40]
008fb9c0	stp x29,x30,[sp, #0x50]
008fb9c4	add x29,sp,#0x50
008fb9c8	ldr x23,[x0, #0x8]
008fb9cc	cbz x23,0x008fba80
008fb9d0	ldrb w8,[x1]
008fb9d4	ldp x9,x10,[x1, #0x8]
008fb9d8	mov w19,#0x1
008fb9dc	lsr w11,w8,#0x1
008fb9e0	tst w8,#0x1
008fb9e4	csel x24,x11,x9,eq
008fb9e8	csinc x20,x10,x1,ne
008fb9ec	mov x26,x23
008fb9f0	ldrb w27,[x26, #0x20]!
008fb9f4	ldr x8,[x26, #0x8]
008fb9f8	lsr w9,w27,#0x1
008fb9fc	tst w27,#0x1
008fba00	csel x25,x9,x8,eq
008fba04	cmp x25,x24
008fba08	csel x21,x25,x24,cc
008fba0c	cbz x21,0x008fba38
008fba10	ldr x8,[x23, #0x30]
008fba14	tst w27,#0x1
008fba18	mov x0,x20
008fba1c	mov x2,x21
008fba20	csinc x22,x8,x26,ne
008fba24	mov x1,x22
008fba28	bl 0x00c300b0
008fba2c	cbz w0,0x008fba38
008fba30	tbz w0,#0x1f,0x008fba50
008fba34	b 0x008fba78
008fba38	cmp x24,x25
008fba3c	b.cc 0x008fba78
008fba40	cbz x21,0x008fba6c
008fba44	ldr x8,[x23, #0x30]
008fba48	tst w27,#0x1
008fba4c	csinc x22,x8,x26,ne
008fba50	mov x0,x22
008fba54	mov x1,x20
008fba58	mov x2,x21
008fba5c	bl 0x00c300b0
008fba60	cbz w0,0x008fba6c
008fba64	tbnz w0,#0x1f,0x008fba74
008fba68	b 0x008fba84
008fba6c	cmp x25,x24
008fba70	b.cs 0x008fba84
008fba74	add x23,x23,#0x8
008fba78	ldr x23,[x23]
008fba7c	cbnz x23,0x008fb9ec
008fba80	mov x19,xzr
008fba84	mov x0,x19
008fba88	ldp x29,x30,[sp, #0x50]
008fba8c	ldp x20,x19,[sp, #0x40]
008fba90	ldp x22,x21,[sp, #0x30]
008fba94	ldp x24,x23,[sp, #0x20]
008fba98	ldp x26,x25,[sp, #0x10]
008fba9c	ldr x27,[sp], #0x60
008fbaa0	ret
