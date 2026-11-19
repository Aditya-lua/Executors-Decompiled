; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 008fb880
008fb880	stp x28,x27,[sp, #-0x60]!
008fb884	stp x26,x25,[sp, #0x10]
008fb888	stp x24,x23,[sp, #0x20]
008fb88c	stp x22,x21,[sp, #0x30]
008fb890	stp x20,x19,[sp, #0x40]
008fb894	stp x29,x30,[sp, #0x50]
008fb898	add x29,sp,#0x50
008fb89c	mov x20,x0
008fb8a0	ldr x24,[x20, #0x8]!
008fb8a4	mov x19,x1
008fb8a8	cbz x24,0x008fb97c
008fb8ac	ldrb w8,[x2]
008fb8b0	ldp x9,x10,[x2, #0x8]
008fb8b4	add x20,x0,#0x8
008fb8b8	lsr w11,w8,#0x1
008fb8bc	tst w8,#0x1
008fb8c0	csel x25,x11,x9,eq
008fb8c4	csinc x21,x10,x2,ne
008fb8c8	b 0x008fb8d0
008fb8cc	mov x24,x8
008fb8d0	mov x27,x24
008fb8d4	ldrb w28,[x27, #0x20]!
008fb8d8	ldr x8,[x27, #0x8]
008fb8dc	lsr w9,w28,#0x1
008fb8e0	tst w28,#0x1
008fb8e4	csel x26,x9,x8,eq
008fb8e8	cmp x26,x25
008fb8ec	csel x22,x26,x25,cc
008fb8f0	cbz x22,0x008fb91c
008fb8f4	ldr x8,[x24, #0x30]
008fb8f8	tst w28,#0x1
008fb8fc	mov x0,x21
008fb900	mov x2,x22
008fb904	csinc x23,x8,x27,ne
008fb908	mov x1,x23
008fb90c	bl 0x00c300b0
008fb910	cbz w0,0x008fb91c
008fb914	tbnz w0,#0x1f,0x008fb924
008fb918	b 0x008fb944
008fb91c	cmp x25,x26
008fb920	b.cs 0x008fb934
008fb924	ldr x8,[x24]
008fb928	cbz x8,0x008fb984
008fb92c	mov x20,x24
008fb930	b 0x008fb8cc
008fb934	cbz x22,0x008fb960
008fb938	ldr x8,[x24, #0x30]
008fb93c	tst w28,#0x1
008fb940	csinc x23,x8,x27,ne
008fb944	mov x0,x23
008fb948	mov x1,x21
008fb94c	mov x2,x22
008fb950	bl 0x00c300b0
008fb954	cbz w0,0x008fb960
008fb958	tbnz w0,#0x1f,0x008fb968
008fb95c	b 0x008fb974
008fb960	cmp x26,x25
008fb964	b.cs 0x008fb974
008fb968	mov x20,x24
008fb96c	ldr x8,[x20, #0x8]!
008fb970	cbnz x8,0x008fb8cc
008fb974	str x24,[x19]
008fb978	b 0x008fb98c
008fb97c	str x20,[x19]
008fb980	b 0x008fb98c
008fb984	str x24,[x19]
008fb988	mov x20,x24
008fb98c	mov x0,x20
008fb990	ldp x29,x30,[sp, #0x50]
008fb994	ldp x20,x19,[sp, #0x40]
008fb998	ldp x22,x21,[sp, #0x30]
008fb99c	ldp x24,x23,[sp, #0x20]
008fb9a0	ldp x26,x25,[sp, #0x10]
008fb9a4	ldp x28,x27,[sp], #0x60
008fb9a8	ret
