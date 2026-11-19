; std::__ndk1::__tree<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::__map_value_compare<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,std::__ndk1::less<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>,true>,std::__ndk1::allocator<std::__ndk1::__value_type<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>::__find_equal<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 008fb594
008fb594	sub sp,sp,#0x80
008fb598	stp x28,x27,[sp, #0x20]
008fb59c	stp x26,x25,[sp, #0x30]
008fb5a0	stp x24,x23,[sp, #0x40]
008fb5a4	stp x22,x21,[sp, #0x50]
008fb5a8	stp x20,x19,[sp, #0x60]
008fb5ac	stp x29,x30,[sp, #0x70]
008fb5b0	add x29,sp,#0x70
008fb5b4	add x8,x0,#0x8
008fb5b8	mov x21,x4
008fb5bc	mov x28,x1
008fb5c0	cmp x8,x1
008fb5c4	stp x3,x0,[sp, #0x8]
008fb5c8	str x8,[sp]
008fb5cc	str x2,[sp, #0x18]
008fb5d0	b.eq 0x008fb648
008fb5d4	mov x20,x28
008fb5d8	ldrb w19,[x20, #0x20]!
008fb5dc	ldrb w23,[x21]
008fb5e0	ldr x8,[x21, #0x8]
008fb5e4	ldr x9,[x20, #0x8]
008fb5e8	lsr w10,w19,#0x1
008fb5ec	tst w19,#0x1
008fb5f0	lsr w11,w23,#0x1
008fb5f4	csel x22,x10,x9,eq
008fb5f8	tst w23,#0x1
008fb5fc	csel x27,x11,x8,eq
008fb600	cmp x22,x27
008fb604	csel x24,x22,x27,cc
008fb608	cbz x24,0x008fb640
008fb60c	ldr x8,[x21, #0x10]
008fb610	ldr x9,[x28, #0x30]
008fb614	tst w23,#0x1
008fb618	mov x2,x24
008fb61c	csinc x26,x8,x21,ne
008fb620	tst w19,#0x1
008fb624	csinc x25,x9,x20,ne
008fb628	mov x0,x26
008fb62c	mov x1,x25
008fb630	bl 0x00c300b0
008fb634	cbz w0,0x008fb640
008fb638	tbnz w0,#0x1f,0x008fb648
008fb63c	b 0x008fb694
008fb640	cmp x27,x22
008fb644	b.cs 0x008fb678
008fb648	ldr x24,[sp, #0x10]
008fb64c	ldr x19,[x28]
008fb650	mov x23,x28
008fb654	ldr x8,[x24]
008fb658	cmp x8,x28
008fb65c	b.eq 0x008fb768
008fb660	cbz x19,0x008fb6c0
008fb664	mov x8,x19
008fb668	mov x23,x8
008fb66c	ldr x8,[x8, #0x8]
008fb670	cbnz x8,0x008fb668
008fb674	b 0x008fb6d8
008fb678	cbz x24,0x008fb78c
008fb67c	ldr x8,[x28, #0x30]
008fb680	ldr x9,[x21, #0x10]
008fb684	tst w19,#0x1
008fb688	csinc x25,x8,x20,ne
008fb68c	tst w23,#0x1
008fb690	csinc x26,x9,x21,ne
008fb694	mov x0,x25
008fb698	mov x1,x26
008fb69c	mov x2,x24
008fb6a0	bl 0x00c300b0
008fb6a4	cbz w0,0x008fb78c
008fb6a8	tbnz w0,#0x1f,0x008fb794
008fb6ac	ldr x8,[sp, #0x18]
008fb6b0	ldr x20,[sp, #0x8]
008fb6b4	str x28,[x8]
008fb6b8	str x28,[x20]
008fb6bc	b 0x008fb854
008fb6c0	mov x23,x28
008fb6c4	mov x8,x23
008fb6c8	ldr x23,[x23, #0x10]
008fb6cc	ldr x9,[x23]
008fb6d0	cmp x9,x8
008fb6d4	b.eq 0x008fb6c4
008fb6d8	mov x8,x23
008fb6dc	ldrb w9,[x8, #0x20]!
008fb6e0	ldrb w10,[x21]
008fb6e4	ldr x11,[x21, #0x8]
008fb6e8	ldr x13,[x8, #0x8]
008fb6ec	lsr w12,w10,#0x1
008fb6f0	tst w10,#0x1
008fb6f4	csel x20,x12,x11,eq
008fb6f8	lsr w11,w9,#0x1
008fb6fc	tst w9,#0x1
008fb700	csel x22,x11,x13,eq
008fb704	cmp x20,x22
008fb708	csel x2,x20,x22,cc
008fb70c	cbz x2,0x008fb760
008fb710	ldr x11,[x23, #0x30]
008fb714	ldr x12,[x21, #0x10]
008fb718	tst w9,#0x1
008fb71c	csinc x0,x11,x8,ne
008fb720	tst w10,#0x1
008fb724	csinc x1,x12,x21,ne
008fb728	bl 0x00c300b0
008fb72c	cbz w0,0x008fb760
008fb730	tbnz w0,#0x1f,0x008fb768
008fb734	mov x0,x24
008fb738	ldr x1,[sp, #0x18]
008fb73c	mov x2,x21
008fb740	ldp x29,x30,[sp, #0x70]
008fb744	ldp x20,x19,[sp, #0x60]
008fb748	ldp x22,x21,[sp, #0x50]
008fb74c	ldp x24,x23,[sp, #0x40]
008fb750	ldp x26,x25,[sp, #0x30]
008fb754	ldp x28,x27,[sp, #0x20]
008fb758	add sp,sp,#0x80
008fb75c	b 0x00c31130
008fb760	cmp x22,x20
008fb764	b.cs 0x008fb734
008fb768	cbz x19,0x008fb77c
008fb76c	ldr x8,[sp, #0x18]
008fb770	add x20,x23,#0x8
008fb774	str x23,[x8]
008fb778	b 0x008fb854
008fb77c	ldr x8,[sp, #0x18]
008fb780	mov x20,x28
008fb784	str x28,[x8]
008fb788	b 0x008fb854
008fb78c	cmp x22,x27
008fb790	b.cs 0x008fb6ac
008fb794	mov x20,x28
008fb798	ldr x8,[x20, #0x8]!
008fb79c	cbz x8,0x008fb7b0
008fb7a0	mov x24,x8
008fb7a4	ldr x8,[x8]
008fb7a8	cbnz x8,0x008fb7a0
008fb7ac	b 0x008fb7dc
008fb7b0	mov x8,x28
008fb7b4	ldr x24,[x8, #0x10]!
008fb7b8	ldr x9,[x24]
008fb7bc	cmp x9,x28
008fb7c0	b.eq 0x008fb7dc
008fb7c4	ldr x9,[x8]
008fb7c8	mov x8,x9
008fb7cc	ldr x24,[x8, #0x10]!
008fb7d0	ldr x10,[x24]
008fb7d4	cmp x10,x9
008fb7d8	b.ne 0x008fb7c4
008fb7dc	ldr x8,[sp]
008fb7e0	cmp x24,x8
008fb7e4	b.eq 0x008fb840
008fb7e8	mov x8,x24
008fb7ec	ldrb w9,[x8, #0x20]!
008fb7f0	ldr x10,[x8, #0x8]
008fb7f4	lsr w11,w9,#0x1
008fb7f8	tst w9,#0x1
008fb7fc	csel x19,x11,x10,eq
008fb800	cmp x19,x27
008fb804	csel x2,x19,x27,cc
008fb808	cbz x2,0x008fb838
008fb80c	ldr x10,[x21, #0x10]
008fb810	ldr x11,[x24, #0x30]
008fb814	tst w23,#0x1
008fb818	csinc x0,x10,x21,ne
008fb81c	tst w9,#0x1
008fb820	csinc x1,x11,x8,ne
008fb824	bl 0x00c300b0
008fb828	cbz w0,0x008fb838
008fb82c	tbnz w0,#0x1f,0x008fb840
008fb830	ldr x0,[sp, #0x10]
008fb834	b 0x008fb738
008fb838	cmp x27,x19
008fb83c	b.cs 0x008fb830
008fb840	ldr x8,[x28, #0x8]
008fb844	cbz x8,0x008fb878
008fb848	ldr x8,[sp, #0x18]
008fb84c	mov x20,x24
008fb850	str x24,[x8]
008fb854	mov x0,x20
008fb858	ldp x29,x30,[sp, #0x70]
008fb85c	ldp x20,x19,[sp, #0x60]
008fb860	ldp x22,x21,[sp, #0x50]
008fb864	ldp x24,x23,[sp, #0x40]
008fb868	ldp x26,x25,[sp, #0x30]
008fb86c	ldp x28,x27,[sp, #0x20]
008fb870	add sp,sp,#0x80
008fb874	ret
008fb878	ldr x8,[sp, #0x18]
008fb87c	b 0x008fb784
