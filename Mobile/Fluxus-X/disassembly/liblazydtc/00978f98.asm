; std::__ndk1::__shared_ptr_emplace<ix::HttpRequestArgs,std::__ndk1::allocator<ix::HttpRequestArgs>>::~__shared_ptr_emplace @ 00978f98
00978f98	str x19,[sp, #-0x20]!
00978f9c	stp x29,x30,[sp, #0x10]
00978fa0	add x29,sp,#0x10
00978fa4	adrp x8,0xcb4000
00978fa8	ldr x8,[x8, #0xf50]
00978fac	mov x19,x0
00978fb0	add x8,x8,#0x10
00978fb4	str x8,[x0], #0x20
00978fb8	bl 0x00c33040
00978fbc	mov x0,x19
00978fc0	bl 0x00c30230
00978fc4	ldp x29,x30,[sp, #0x10]
00978fc8	mov x0,x19
00978fcc	ldr x19,[sp], #0x20
00978fd0	b 0x00c301d0
