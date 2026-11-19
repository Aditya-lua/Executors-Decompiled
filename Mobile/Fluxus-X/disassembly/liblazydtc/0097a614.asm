; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,ix::CaseInsensitiveLess,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 0097a614
0097a614	stp x26,x25,[sp, #-0x50]!
0097a618	stp x24,x23,[sp, #0x10]
0097a61c	stp x22,x21,[sp, #0x20]
0097a620	stp x20,x19,[sp, #0x30]
0097a624	stp x29,x30,[sp, #0x40]
0097a628	add x29,sp,#0x40
0097a62c	add x26,x0,#0x8
0097a630	mov x20,x4
0097a634	mov x21,x3
0097a638	mov x22,x1
0097a63c	mov x23,x0
0097a640	cmp x26,x1
0097a644	mov x19,x2
0097a648	b.eq 0x0097a668
0097a64c	add x24,x23,#0x10
0097a650	add x25,x22,#0x20
0097a654	mov x0,x24
0097a658	mov x1,x20
0097a65c	mov x2,x25
0097a660	bl 0x00c331d0
0097a664	tbz w0,#0x0,0x0097a690
0097a668	ldr x8,[x23]
0097a66c	cmp x8,x22
0097a670	b.eq 0x0097a6c0
0097a674	ldr x8,[x22]
0097a678	add x24,x23,#0x10
0097a67c	cbz x8,0x0097a6d4
0097a680	mov x25,x8
0097a684	ldr x8,[x8, #0x8]
0097a688	cbnz x8,0x0097a680
0097a68c	b 0x0097a6ec
0097a690	mov x0,x24
0097a694	mov x1,x25
0097a698	mov x2,x20
0097a69c	bl 0x00c331d0
0097a6a0	tbz w0,#0x0,0x0097a778
0097a6a4	mov x21,x22
0097a6a8	ldr x8,[x21, #0x8]!
0097a6ac	cbz x8,0x0097a784
0097a6b0	mov x25,x8
0097a6b4	ldr x8,[x8]
0097a6b8	cbnz x8,0x0097a6b0
0097a6bc	b 0x0097a7b0
0097a6c0	mov x21,x22
0097a6c4	mov x25,x22
0097a6c8	ldr x8,[x22]
0097a6cc	cbnz x8,0x0097a70c
0097a6d0	b 0x0097a7e0
0097a6d4	mov x25,x22
0097a6d8	mov x8,x25
0097a6dc	ldr x25,[x25, #0x10]
0097a6e0	ldr x9,[x25]
0097a6e4	cmp x9,x8
0097a6e8	b.eq 0x0097a6d8
0097a6ec	add x1,x25,#0x20
0097a6f0	mov x0,x24
0097a6f4	mov x2,x20
0097a6f8	bl 0x00c331d0
0097a6fc	tbz w0,#0x0,0x0097a718
0097a700	mov x21,x22
0097a704	ldr x8,[x22]
0097a708	cbz x8,0x0097a7e0
0097a70c	str x25,[x19]
0097a710	add x21,x25,#0x8
0097a714	b 0x0097a854
0097a718	ldr x25,[x26]
0097a71c	cbz x25,0x0097a84c
0097a720	add x21,x23,#0x8
0097a724	b 0x0097a72c
0097a728	mov x25,x8
0097a72c	add x22,x25,#0x20
0097a730	mov x0,x24
0097a734	mov x1,x20
0097a738	mov x2,x22
0097a73c	bl 0x00c331d0
0097a740	tbz w0,#0x0,0x0097a754
0097a744	ldr x8,[x25]
0097a748	cbz x8,0x0097a7d4
0097a74c	mov x21,x25
0097a750	b 0x0097a728
0097a754	mov x0,x24
0097a758	mov x1,x22
0097a75c	mov x2,x20
0097a760	bl 0x00c331d0
0097a764	tbz w0,#0x0,0x0097a844
0097a768	mov x21,x25
0097a76c	ldr x8,[x21, #0x8]!
0097a770	cbnz x8,0x0097a728
0097a774	b 0x0097a844
0097a778	str x22,[x19]
0097a77c	str x22,[x21]
0097a780	b 0x0097a854
0097a784	mov x8,x22
0097a788	ldr x25,[x8, #0x10]!
0097a78c	ldr x9,[x25]
0097a790	cmp x9,x22
0097a794	b.eq 0x0097a7b0
0097a798	ldr x9,[x8]
0097a79c	mov x8,x9
0097a7a0	ldr x25,[x8, #0x10]!
0097a7a4	ldr x10,[x25]
0097a7a8	cmp x10,x9
0097a7ac	b.ne 0x0097a798
0097a7b0	cmp x25,x26
0097a7b4	b.eq 0x0097a7cc
0097a7b8	add x2,x25,#0x20
0097a7bc	mov x0,x24
0097a7c0	mov x1,x20
0097a7c4	bl 0x00c331d0
0097a7c8	tbz w0,#0x0,0x0097a7e8
0097a7cc	ldr x8,[x22, #0x8]
0097a7d0	cbz x8,0x0097a7e0
0097a7d4	str x25,[x19]
0097a7d8	mov x21,x25
0097a7dc	b 0x0097a854
0097a7e0	str x22,[x19]
0097a7e4	b 0x0097a854
0097a7e8	ldr x25,[x26]
0097a7ec	cbz x25,0x0097a84c
0097a7f0	add x21,x23,#0x8
0097a7f4	b 0x0097a7fc
0097a7f8	mov x25,x8
0097a7fc	add x22,x25,#0x20
0097a800	mov x0,x24
0097a804	mov x1,x20
0097a808	mov x2,x22
0097a80c	bl 0x00c331d0
0097a810	tbz w0,#0x0,0x0097a824
0097a814	ldr x8,[x25]
0097a818	cbz x8,0x0097a7d4
0097a81c	mov x21,x25
0097a820	b 0x0097a7f8
0097a824	mov x0,x24
0097a828	mov x1,x22
0097a82c	mov x2,x20
0097a830	bl 0x00c331d0
0097a834	tbz w0,#0x0,0x0097a844
0097a838	mov x21,x25
0097a83c	ldr x8,[x21, #0x8]!
0097a840	cbnz x8,0x0097a7f8
0097a844	str x25,[x19]
0097a848	b 0x0097a854
0097a84c	str x26,[x19]
0097a850	mov x21,x26
0097a854	mov x0,x21
0097a858	ldp x29,x30,[sp, #0x40]
0097a85c	ldp x20,x19,[sp, #0x30]
0097a860	ldp x22,x21,[sp, #0x20]
0097a864	ldp x24,x23,[sp, #0x10]
0097a868	ldp x26,x25,[sp], #0x50
0097a86c	ret
