; std::__ndk1::__shared_ptr_emplace<ix::WebSocket,std::__ndk1::allocator<ix::WebSocket>>::~__shared_ptr_emplace @ 009948ec
009948ec	str x19,[sp, #-0x20]!
009948f0	stp x29,x30,[sp, #0x10]
009948f4	add x29,sp,#0x10
009948f8	adrp x8,0xcb5000
009948fc	ldr x8,[x8, #0xe8]
00994900	mov x19,x0
00994904	add x8,x8,#0x10
00994908	str x8,[x0], #0x20
0099490c	bl 0x00c306b0
00994910	ldp x29,x30,[sp, #0x10]
00994914	mov x0,x19
00994918	ldr x19,[sp], #0x20
0099491c	b 0x00c30230
