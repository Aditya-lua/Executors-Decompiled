; std::__ndk1::shared_ptr<ix::HttpResponse>::make_shared<int,char_const(&)[3],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>&,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&> @ 0097f6d0
0097f6d0	sub sp,sp,#0xb0
0097f6d4	stp x28,x27,[sp, #0x50]
0097f6d8	stp x26,x25,[sp, #0x60]
0097f6dc	stp x24,x23,[sp, #0x70]
0097f6e0	stp x22,x21,[sp, #0x80]
0097f6e4	stp x20,x19,[sp, #0x90]
0097f6e8	stp x29,x30,[sp, #0xa0]
0097f6ec	add x29,sp,#0xa0
0097f6f0	mrs x21,tpidr_el0
0097f6f4	mov x20,x8
0097f6f8	ldr x8,[x21, #0x28]
0097f6fc	mov x24,x0
0097f700	mov w0,#0x98
0097f704	mov x28,x4
0097f708	mov x22,x3
0097f70c	mov x23,x2
0097f710	mov x25,x1
0097f714	str x8,[sp, #0x48]
0097f718	bl 0x00c2fed0
0097f71c	str xzr,[x0, #0x10]
0097f720	adrp x8,0xcb4000
0097f724	ldr x8,[x8, #0xf48]
0097f728	mov x19,x0
0097f72c	add x8,x8,#0x10
0097f730	stp x8,xzr,[x0]
0097f734	ldr w24,[x24]
0097f738	mov x0,x25
0097f73c	stp xzr,xzr,[sp, #0x30]
0097f740	str xzr,[sp, #0x40]
0097f744	bl 0x00c2ff50
0097f748	mov x26,x0
0097f74c	cmn x0,#0x10
0097f750	b.cs 0x0097f860
0097f754	cmp x26,#0x17
0097f758	b.cs 0x0097f774
0097f75c	add x9,sp,#0x30
0097f760	lsl w8,w26,#0x1
0097f764	orr x27,x9,#0x1
0097f768	strb w8,[sp, #0x30]
0097f76c	cbnz x26,0x0097f7c4
0097f770	b 0x0097f7d4
0097f774	add x8,x26,#0x10
0097f778	str x20,[sp, #0x10]
0097f77c	mov x20,x21
0097f780	mov w21,w24
0097f784	mov x24,x23
0097f788	mov x23,x22
0097f78c	mov x22,x28
0097f790	and x28,x8,#-0x10
0097f794	mov x0,x28
0097f798	bl 0x00c2fed0
0097f79c	orr x8,x28,#0x1
0097f7a0	mov x28,x22
0097f7a4	mov x22,x23
0097f7a8	mov x23,x24
0097f7ac	mov w24,w21
0097f7b0	mov x21,x20
0097f7b4	ldr x20,[sp, #0x10]
0097f7b8	mov x27,x0
0097f7bc	stp x26,x0,[sp, #0x38]
0097f7c0	str x8,[sp, #0x30]
0097f7c4	mov x0,x27
0097f7c8	mov x1,x25
0097f7cc	mov x2,x26
0097f7d0	bl 0x00c2ffd0
0097f7d4	add x25,x19,#0x18
0097f7d8	strb wzr,[x27, x26]
0097f7dc	stp xzr,xzr,[sp, #0x18]
0097f7e0	str xzr,[sp, #0x28]
0097f7e4	add x2,sp,#0x30
0097f7e8	add x6,sp,#0x18
0097f7ec	mov x0,x25
0097f7f0	mov w1,w24
0097f7f4	mov x3,x23
0097f7f8	mov x4,x22
0097f7fc	mov x5,x28
0097f800	mov x7,xzr
0097f804	str xzr,[sp]
0097f808	bl 0x00c33030
0097f80c	ldrb w8,[sp, #0x18]
0097f810	tbz w8,#0x0,0x0097f81c
0097f814	ldr x0,[sp, #0x28]
0097f818	bl 0x00c301d0
0097f81c	ldrb w8,[sp, #0x30]
0097f820	tbz w8,#0x0,0x0097f82c
0097f824	ldr x0,[sp, #0x40]
0097f828	bl 0x00c301d0
0097f82c	stp x25,x19,[x20]
0097f830	ldr x8,[x21, #0x28]
0097f834	ldr x9,[sp, #0x48]
0097f838	cmp x8,x9
0097f83c	b.ne 0x0097f868
0097f840	ldp x29,x30,[sp, #0xa0]
0097f844	ldp x20,x19,[sp, #0x90]
0097f848	ldp x22,x21,[sp, #0x80]
0097f84c	ldp x24,x23,[sp, #0x70]
0097f850	ldp x26,x25,[sp, #0x60]
0097f854	ldp x28,x27,[sp, #0x50]
0097f858	add sp,sp,#0xb0
0097f85c	ret
0097f860	add x0,sp,#0x30
0097f864	bl 0x00c30ce0
0097f868	bl 0x00c2fec0
