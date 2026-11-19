; std::__ndk1::__shared_ptr_emplace<ix::HttpResponse,std::__ndk1::allocator<ix::HttpResponse>>::~__shared_ptr_emplace @ 0097a150
0097a150	str x19,[sp, #-0x20]!
0097a154	stp x29,x30,[sp, #0x10]
0097a158	add x29,sp,#0x10
0097a15c	adrp x9,0xcb4000
0097a160	ldrb w8,[x0, #0x70]
0097a164	ldr x9,[x9, #0xf48]
0097a168	mov x19,x0
0097a16c	add x9,x9,#0x10
0097a170	str x9,[x0]
0097a174	tbz w8,#0x0,0x0097a180
0097a178	ldr x0,[x19, #0x80]
0097a17c	bl 0x00c301d0
0097a180	ldrb w8,[x19, #0x58]
0097a184	tbz w8,#0x0,0x0097a190
0097a188	ldr x0,[x19, #0x68]
0097a18c	bl 0x00c301d0
0097a190	ldr x1,[x19, #0x48]
0097a194	add x0,x19,#0x40
0097a198	bl 0x00c32fc0
0097a19c	ldrb w8,[x19, #0x20]
0097a1a0	tbz w8,#0x0,0x0097a1ac
0097a1a4	ldr x0,[x19, #0x30]
0097a1a8	bl 0x00c301d0
0097a1ac	ldp x29,x30,[sp, #0x10]
0097a1b0	mov x0,x19
0097a1b4	ldr x19,[sp], #0x20
0097a1b8	b 0x00c30230
