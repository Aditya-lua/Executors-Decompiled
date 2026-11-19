; std::__ndk1::__shared_ptr_emplace<std::__ndk1::thread,std::__ndk1::allocator<std::__ndk1::thread>>::~__shared_ptr_emplace @ 0098744c
0098744c	str x19,[sp, #-0x20]!
00987450	stp x29,x30,[sp, #0x10]
00987454	add x29,sp,#0x10
00987458	adrp x8,0xcb4000
0098745c	ldr x8,[x8, #0xed0]
00987460	mov x19,x0
00987464	add x8,x8,#0x10
00987468	str x8,[x0], #0x18
0098746c	bl 0x00c2ff80
00987470	mov x0,x19
00987474	bl 0x00c30230
00987478	ldp x29,x30,[sp, #0x10]
0098747c	mov x0,x19
00987480	ldr x19,[sp], #0x20
00987484	b 0x00c301d0
