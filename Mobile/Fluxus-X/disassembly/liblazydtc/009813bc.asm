; std::__ndk1::__shared_ptr_emplace<ix::ConnectionState,std::__ndk1::allocator<ix::ConnectionState>>::~__shared_ptr_emplace @ 009813bc
009813bc	str x19,[sp, #-0x20]!
009813c0	stp x29,x30,[sp, #0x10]
009813c4	add x29,sp,#0x10
009813c8	adrp x8,0xcb4000
009813cc	ldr x8,[x8, #0xea8]
009813d0	ldrb w9,[x0, #0x80]
009813d4	mov x19,x0
009813d8	add x8,x8,#0x10
009813dc	str x8,[x0]
009813e0	adrp x8,0xcb4000
009813e4	ldr x8,[x8, #0xea0]
009813e8	add x8,x8,#0x10
009813ec	str x8,[x0, #0x20]
009813f0	tbz w9,#0x0,0x009813fc
009813f4	ldr x0,[x19, #0x90]
009813f8	bl 0x00c301d0
009813fc	ldr x0,[x19, #0x70]
00981400	add x8,x19,#0x50
00981404	cmp x8,x0
00981408	b.eq 0x0098141c
0098140c	cbz x0,0x00981428
00981410	ldr x8,[x0]
00981414	ldr x8,[x8, #0x28]
00981418	b 0x00981424
0098141c	ldr x8,[x0]
00981420	ldr x8,[x8, #0x20]
00981424	blr x8
00981428	ldrb w8,[x19, #0x30]
0098142c	tbz w8,#0x0,0x00981438
00981430	ldr x0,[x19, #0x40]
00981434	bl 0x00c301d0
00981438	mov x0,x19
0098143c	bl 0x00c30230
00981440	ldp x29,x30,[sp, #0x10]
00981444	mov x0,x19
00981448	ldr x19,[sp], #0x20
0098144c	b 0x00c301d0
