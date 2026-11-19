; std::__ndk1::__shared_ptr_emplace<std::__ndk1::thread,std::__ndk1::allocator<std::__ndk1::thread>>::~__shared_ptr_emplace @ 00987418
00987418	str x19,[sp, #-0x20]!
0098741c	stp x29,x30,[sp, #0x10]
00987420	add x29,sp,#0x10
00987424	adrp x8,0xcb4000
00987428	ldr x8,[x8, #0xed0]
0098742c	mov x19,x0
00987430	add x8,x8,#0x10
00987434	str x8,[x0], #0x18
00987438	bl 0x00c2ff80
0098743c	ldp x29,x30,[sp, #0x10]
00987440	mov x0,x19
00987444	ldr x19,[sp], #0x20
00987448	b 0x00c30230
