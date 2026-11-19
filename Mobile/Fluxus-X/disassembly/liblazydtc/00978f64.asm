; std::__ndk1::__shared_ptr_emplace<ix::HttpRequestArgs,std::__ndk1::allocator<ix::HttpRequestArgs>>::~__shared_ptr_emplace @ 00978f64
00978f64	str x19,[sp, #-0x20]!
00978f68	stp x29,x30,[sp, #0x10]
00978f6c	add x29,sp,#0x10
00978f70	adrp x8,0xcb4000
00978f74	ldr x8,[x8, #0xf50]
00978f78	mov x19,x0
00978f7c	add x8,x8,#0x10
00978f80	str x8,[x0], #0x20
00978f84	bl 0x00c33040
00978f88	ldp x29,x30,[sp, #0x10]
00978f8c	mov x0,x19
00978f90	ldr x19,[sp], #0x20
00978f94	b 0x00c30230
