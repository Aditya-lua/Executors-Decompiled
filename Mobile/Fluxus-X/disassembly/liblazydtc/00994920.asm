; std::__ndk1::__shared_ptr_emplace<ix::WebSocket,std::__ndk1::allocator<ix::WebSocket>>::~__shared_ptr_emplace @ 00994920
00994920	str x19,[sp, #-0x20]!
00994924	stp x29,x30,[sp, #0x10]
00994928	add x29,sp,#0x10
0099492c	adrp x8,0xcb5000
00994930	ldr x8,[x8, #0xe8]
00994934	mov x19,x0
00994938	add x8,x8,#0x10
0099493c	str x8,[x0], #0x20
00994940	bl 0x00c306b0
00994944	mov x0,x19
00994948	bl 0x00c30230
0099494c	ldp x29,x30,[sp, #0x10]
00994950	mov x0,x19
00994954	ldr x19,[sp], #0x20
00994958	b 0x00c301d0
