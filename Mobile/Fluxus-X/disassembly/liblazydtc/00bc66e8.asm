; std::__ndk1::basic_string<wchar_t,std::__ndk1::char_traits<wchar_t>,std::__ndk1::allocator<wchar_t>>::push_back @ 00bc66e8
00bc66e8	paciasp
00bc66ec	stp x29,x30,[sp, #-0x30]!
00bc66f0	str x21,[sp, #0x10]
00bc66f4	stp x20,x19,[sp, #0x20]
00bc66f8	mov x29,sp
00bc66fc	ldrb w9,[x0]
00bc6700	mov x20,x0
00bc6704	mov w19,w1
00bc6708	tbnz w9,#0x0,0x00bc671c
00bc670c	cmp w9,#0x8
00bc6710	b.ne 0x00bc6764
00bc6714	mov w21,#0x4
00bc6718	b 0x00bc6730
00bc671c	ldp x9,x8,[x20]
00bc6720	and x9,x9,#-0x2
00bc6724	sub x21,x9,#0x1
00bc6728	cmp x8,x21
00bc672c	b.ne 0x00bc6754
00bc6730	mov x0,x20
00bc6734	mov x1,x21
00bc6738	mov w2,#0x1
00bc673c	mov x3,x21
00bc6740	mov x4,x21
00bc6744	mov x5,xzr
00bc6748	mov x6,xzr
00bc674c	bl 0x00c43d70
00bc6750	mov x8,x21
00bc6754	ldr x9,[x20, #0x10]
00bc6758	add x10,x8,#0x1
00bc675c	str x10,[x20, #0x8]
00bc6760	b 0x00bc6774
00bc6764	lsr x8,x9,#0x1
00bc6768	add w9,w9,#0x2
00bc676c	strb w9,[x20], #0x4
00bc6770	mov x9,x20
00bc6774	add x8,x9,x8, LSL #0x2
00bc6778	stp w19,wzr,[x8]
00bc677c	ldp x20,x19,[sp, #0x20]
00bc6780	ldr x21,[sp, #0x10]
00bc6784	ldp x29,x30,[sp], #0x30
00bc6788	autiasp
00bc678c	ret
