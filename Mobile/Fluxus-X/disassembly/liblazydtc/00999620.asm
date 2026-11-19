; std::__ndk1::list<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>,std::__ndk1::allocator<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>>>::emplace_back<std::__ndk1::basic_string<char,std::__ndk1::char_traits<char>,std::__ndk1::allocator<char>>&> @ 00999620
00999620	stp x24,x23,[sp, #-0x40]!
00999624	stp x22,x21,[sp, #0x10]
00999628	stp x20,x19,[sp, #0x20]
0099962c	stp x29,x30,[sp, #0x30]
00999630	add x29,sp,#0x30
00999634	mov x20,x0
00999638	mov w0,#0x28
0099963c	mov x22,x1
00999640	bl 0x00c2fed0
00999644	mov x19,x0
00999648	str xzr,[x0]
0099964c	str xzr,[x0, #0x10]!
00999650	stp xzr,xzr,[x19, #0x18]
00999654	ldrb w8,[x22]
00999658	tbnz w8,#0x0,0x00999670
0099965c	ldr x8,[x22, #0x10]
00999660	str x8,[x0, #0x10]
00999664	ldr q0,[x22]
00999668	str q0,[x0]
0099966c	b 0x009996d0
00999670	ldr x21,[x22, #0x8]
00999674	cmn x21,#0x10
00999678	b.cs 0x00999700
0099967c	ldr x22,[x22, #0x10]
00999680	cmp x21,#0x17
00999684	b.cs 0x0099969c
00999688	lsl w8,w21,#0x1
0099968c	add x23,x19,#0x11
00999690	strb w8,[x19, #0x10]
00999694	cbnz x21,0x009996bc
00999698	b 0x009996cc
0099969c	add x8,x21,#0x10
009996a0	and x24,x8,#-0x10
009996a4	mov x0,x24
009996a8	bl 0x00c2fed0
009996ac	orr x8,x24,#0x1
009996b0	mov x23,x0
009996b4	stp x21,x0,[x19, #0x18]
009996b8	str x8,[x19, #0x10]
009996bc	mov x0,x23
009996c0	mov x1,x22
009996c4	mov x2,x21
009996c8	bl 0x00c2ffd0
009996cc	strb wzr,[x23, x21]
009996d0	ldr x8,[x20]
009996d4	stp x8,x20,[x19]
009996d8	str x19,[x8, #0x8]
009996dc	ldr x8,[x20, #0x10]
009996e0	str x19,[x20]
009996e4	add x8,x8,#0x1
009996e8	str x8,[x20, #0x10]
009996ec	ldp x29,x30,[sp, #0x30]
009996f0	ldp x20,x19,[sp, #0x20]
009996f4	ldp x22,x21,[sp, #0x10]
009996f8	ldp x24,x23,[sp], #0x40
009996fc	ret
00999700	bl 0x00c30ce0
