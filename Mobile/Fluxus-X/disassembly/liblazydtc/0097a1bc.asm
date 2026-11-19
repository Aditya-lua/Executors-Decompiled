; std::__ndk1::__shared_ptr_emplace<ix::HttpResponse,std::__ndk1::allocator<ix::HttpResponse>>::~__shared_ptr_emplace @ 0097a1bc
0097a1bc	str x19,[sp, #-0x20]!
0097a1c0	stp x29,x30,[sp, #0x10]
0097a1c4	add x29,sp,#0x10
0097a1c8	adrp x9,0xcb4000
0097a1cc	ldrb w8,[x0, #0x70]
0097a1d0	ldr x9,[x9, #0xf48]
0097a1d4	mov x19,x0
0097a1d8	add x9,x9,#0x10
0097a1dc	str x9,[x0]
0097a1e0	tbz w8,#0x0,0x0097a1ec
0097a1e4	ldr x0,[x19, #0x80]
0097a1e8	bl 0x00c301d0
0097a1ec	ldrb w8,[x19, #0x58]
0097a1f0	tbz w8,#0x0,0x0097a1fc
0097a1f4	ldr x0,[x19, #0x68]
0097a1f8	bl 0x00c301d0
0097a1fc	ldr x1,[x19, #0x48]
0097a200	add x0,x19,#0x40
0097a204	bl 0x00c32fc0
0097a208	ldrb w8,[x19, #0x20]
0097a20c	tbz w8,#0x0,0x0097a218
0097a210	ldr x0,[x19, #0x30]
0097a214	bl 0x00c301d0
0097a218	mov x0,x19
0097a21c	bl 0x00c30230
0097a220	ldp x29,x30,[sp, #0x10]
0097a224	mov x0,x19
0097a228	ldr x19,[sp], #0x20
0097a22c	b 0x00c301d0
