; std::__ndk1::shared_ptr<ix::HttpResponse>::make_shared<int,char_const(&)[10],ix::HttpErrorCode,std::__ndk1::map<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,ix::CaseInsensitiveLess,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>const,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>>,std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>> @ 0097f4f0
0097f4f0	sub sp,sp,#0xb0
0097f4f4	stp x28,x27,[sp, #0x50]
0097f4f8	stp x26,x25,[sp, #0x60]
0097f4fc	stp x24,x23,[sp, #0x70]
0097f500	stp x22,x21,[sp, #0x80]
0097f504	stp x20,x19,[sp, #0x90]
0097f508	stp x29,x30,[sp, #0xa0]
0097f50c	add x29,sp,#0xa0
0097f510	mrs x21,tpidr_el0
0097f514	mov x20,x8
0097f518	ldr x8,[x21, #0x28]
0097f51c	mov x24,x0
0097f520	mov w0,#0x98
0097f524	mov x28,x4
0097f528	mov x22,x3
0097f52c	mov x23,x2
0097f530	mov x25,x1
0097f534	str x8,[sp, #0x48]
0097f538	bl 0x00c2fed0
0097f53c	str xzr,[x0, #0x10]
0097f540	adrp x8,0xcb4000
0097f544	ldr x8,[x8, #0xf48]
0097f548	mov x19,x0
0097f54c	add x8,x8,#0x10
0097f550	stp x8,xzr,[x0]
0097f554	ldr w24,[x24]
0097f558	mov x0,x25
0097f55c	stp xzr,xzr,[sp, #0x30]
0097f560	str xzr,[sp, #0x40]
0097f564	bl 0x00c2ff50
0097f568	mov x26,x0
0097f56c	cmn x0,#0x10
0097f570	b.cs 0x0097f680
0097f574	cmp x26,#0x17
0097f578	b.cs 0x0097f594
0097f57c	add x9,sp,#0x30
0097f580	lsl w8,w26,#0x1
0097f584	orr x27,x9,#0x1
0097f588	strb w8,[sp, #0x30]
0097f58c	cbnz x26,0x0097f5e4
0097f590	b 0x0097f5f4
0097f594	add x8,x26,#0x10
0097f598	str x20,[sp, #0x10]
0097f59c	mov x20,x21
0097f5a0	mov w21,w24
0097f5a4	mov x24,x23
0097f5a8	mov x23,x22
0097f5ac	mov x22,x28
0097f5b0	and x28,x8,#-0x10
0097f5b4	mov x0,x28
0097f5b8	bl 0x00c2fed0
0097f5bc	orr x8,x28,#0x1
0097f5c0	mov x28,x22
0097f5c4	mov x22,x23
0097f5c8	mov x23,x24
0097f5cc	mov w24,w21
0097f5d0	mov x21,x20
0097f5d4	ldr x20,[sp, #0x10]
0097f5d8	mov x27,x0
0097f5dc	stp x26,x0,[sp, #0x38]
0097f5e0	str x8,[sp, #0x30]
0097f5e4	mov x0,x27
0097f5e8	mov x1,x25
0097f5ec	mov x2,x26
0097f5f0	bl 0x00c2ffd0
0097f5f4	add x25,x19,#0x18
0097f5f8	strb wzr,[x27, x26]
0097f5fc	stp xzr,xzr,[sp, #0x18]
0097f600	str xzr,[sp, #0x28]
0097f604	add x2,sp,#0x30
0097f608	add x6,sp,#0x18
0097f60c	mov x0,x25
0097f610	mov w1,w24
0097f614	mov x3,x23
0097f618	mov x4,x22
0097f61c	mov x5,x28
0097f620	mov x7,xzr
0097f624	str xzr,[sp]
0097f628	bl 0x00c33030
0097f62c	ldrb w8,[sp, #0x18]
0097f630	tbz w8,#0x0,0x0097f63c
0097f634	ldr x0,[sp, #0x28]
0097f638	bl 0x00c301d0
0097f63c	ldrb w8,[sp, #0x30]
0097f640	tbz w8,#0x0,0x0097f64c
0097f644	ldr x0,[sp, #0x40]
0097f648	bl 0x00c301d0
0097f64c	stp x25,x19,[x20]
0097f650	ldr x8,[x21, #0x28]
0097f654	ldr x9,[sp, #0x48]
0097f658	cmp x8,x9
0097f65c	b.ne 0x0097f688
0097f660	ldp x29,x30,[sp, #0xa0]
0097f664	ldp x20,x19,[sp, #0x90]
0097f668	ldp x22,x21,[sp, #0x80]
0097f66c	ldp x24,x23,[sp, #0x70]
0097f670	ldp x26,x25,[sp, #0x60]
0097f674	ldp x28,x27,[sp, #0x50]
0097f678	add sp,sp,#0xb0
0097f67c	ret
0097f680	add x0,sp,#0x30
0097f684	bl 0x00c30ce0
0097f688	bl 0x00c2fec0
