; std::__ndk1::__shared_ptr_emplace<ix::DNSLookup,std::__ndk1::allocator<ix::DNSLookup>>::~__shared_ptr_emplace @ 00986650
00986650	str x19,[sp, #-0x20]!
00986654	stp x29,x30,[sp, #0x10]
00986658	add x29,sp,#0x10
0098665c	adrp x8,0xcb4000
00986660	ldr x8,[x8, #0xfb0]
00986664	mov x19,x0
00986668	add x8,x8,#0x10
0098666c	str x8,[x0], #0x18
00986670	bl 0x00c335f0
00986674	mov x0,x19
00986678	bl 0x00c30230
0098667c	ldp x29,x30,[sp, #0x10]
00986680	mov x0,x19
00986684	ldr x19,[sp], #0x20
00986688	b 0x00c301d0
