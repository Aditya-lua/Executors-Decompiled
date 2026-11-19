; std::__ndk1::__hash_table<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::hash<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::equal_to<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::rehash @ 008e65b8
008e65b8	str x21,[sp, #-0x30]!
008e65bc	stp x20,x19,[sp, #0x10]
008e65c0	stp x29,x30,[sp, #0x20]
008e65c4	add x29,sp,#0x20
008e65c8	mov x20,x1
008e65cc	subs x8,x1,#0x1
008e65d0	mov x19,x0
008e65d4	b.ne 0x008e65e0
008e65d8	mov w20,#0x2
008e65dc	b 0x008e65f4
008e65e0	tst x8,x20
008e65e4	b.eq 0x008e65f4
008e65e8	mov x0,x20
008e65ec	bl 0x00c301b0
008e65f0	mov x20,x0
008e65f4	ldr x21,[x19, #0x8]
008e65f8	cmp x20,x21
008e65fc	b.ls 0x008e6618
008e6600	mov x0,x19
008e6604	mov x1,x20
008e6608	ldp x29,x30,[sp, #0x20]
008e660c	ldp x20,x19,[sp, #0x10]
008e6610	ldr x21,[sp], #0x30
008e6614	b 0x00c30d10
008e6618	b.cs 0x008e668c
008e661c	cmp x21,#0x3
008e6620	mov w8,wzr
008e6624	b.cc 0x008e6634
008e6628	sub x8,x21,#0x1
008e662c	tst x8,x21
008e6630	cset w8,eq
008e6634	ldr x9,[x19, #0x18]
008e6638	ldr s0,[x19, #0x20]
008e663c	ucvtf s1,x9
008e6640	fdiv s0,s1,s0
008e6644	fcvtpu x0,s0
008e6648	cbz w8,0x008e6670
008e664c	cmp x0,#0x2
008e6650	b.cc 0x008e6674
008e6654	sub x8,x0,#0x1
008e6658	mov w9,#0x40
008e665c	clz x8,x8
008e6660	sub x8,x9,x8
008e6664	mov w9,#0x1
008e6668	lsl x0,x9,x8
008e666c	b 0x008e6674
008e6670	bl 0x00c301b0
008e6674	cmp x20,x0
008e6678	csel x1,x0,x20,cc
008e667c	cmp x1,x21
008e6680	b.cs 0x008e668c
008e6684	mov x0,x19
008e6688	b 0x008e6608
008e668c	ldp x29,x30,[sp, #0x20]
008e6690	ldp x20,x19,[sp, #0x10]
008e6694	ldr x21,[sp], #0x30
008e6698	ret
