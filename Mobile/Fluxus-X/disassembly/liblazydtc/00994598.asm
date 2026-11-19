; std::__ndk1::__tree<std::__ndk1::shared_ptr<ix::WebSocket>,std::__ndk1::less<std::__ndk1::shared_ptr<ix::WebSocket>>,std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::WebSocket>>>::destroy @ 00994598
00994598	stp x20,x19,[sp, #-0x20]!
0099459c	stp x29,x30,[sp, #0x10]
009945a0	add x29,sp,#0x10
009945a4	mov x19,x1
009945a8	mov x20,x0
009945ac	cbz x1,0x00994610
009945b0	ldr x1,[x19]
009945b4	mov x0,x20
009945b8	bl 0x00c33e20
009945bc	ldr x1,[x19, #0x8]
009945c0	mov x0,x20
009945c4	bl 0x00c33e20
009945c8	ldr x20,[x19, #0x28]
009945cc	cbz x20,0x00994600
009945d0	add x8,x20,#0x8
009945d4	ldaxr x9,[x8]
009945d8	sub x10,x9,#0x1
009945dc	stlxr w11,x10,[x8]
009945e0	cbnz w11,0x009945d4
009945e4	cbnz x9,0x00994600
009945e8	ldr x8,[x20]
009945ec	mov x0,x20
009945f0	ldr x8,[x8, #0x10]
009945f4	blr x8
009945f8	mov x0,x20
009945fc	bl 0x00c2ff00
00994600	ldp x29,x30,[sp, #0x10]
00994604	mov x0,x19
00994608	ldp x20,x19,[sp], #0x20
0099460c	b 0x00c301d0
00994610	ldp x29,x30,[sp, #0x10]
00994614	ldp x20,x19,[sp], #0x20
00994618	ret
