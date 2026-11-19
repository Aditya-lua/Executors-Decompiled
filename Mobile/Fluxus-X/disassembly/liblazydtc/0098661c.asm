; std::__ndk1::__shared_ptr_emplace<ix::DNSLookup,std::__ndk1::allocator<ix::DNSLookup>>::~__shared_ptr_emplace @ 0098661c
0098661c	str x19,[sp, #-0x20]!
00986620	stp x29,x30,[sp, #0x10]
00986624	add x29,sp,#0x10
00986628	adrp x8,0xcb4000
0098662c	ldr x8,[x8, #0xfb0]
00986630	mov x19,x0
00986634	add x8,x8,#0x10
00986638	str x8,[x0], #0x18
0098663c	bl 0x00c335f0
00986640	ldp x29,x30,[sp, #0x10]
00986644	mov x0,x19
00986648	ldr x19,[sp], #0x20
0098664c	b 0x00c30230
