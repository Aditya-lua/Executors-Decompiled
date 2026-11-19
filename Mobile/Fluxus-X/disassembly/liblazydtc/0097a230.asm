; std::__ndk1::__shared_ptr_emplace<ix::HttpResponse,std::__ndk1::allocator<ix::HttpResponse>>::__on_zero_shared @ 0097a230
0097a230	str x19,[sp, #-0x20]!
0097a234	stp x29,x30,[sp, #0x10]
0097a238	add x29,sp,#0x10
0097a23c	ldrb w8,[x0, #0x70]
0097a240	mov x19,x0
0097a244	tbz w8,#0x0,0x0097a250
0097a248	ldr x0,[x19, #0x80]
0097a24c	bl 0x00c301d0
0097a250	ldrb w8,[x19, #0x58]
0097a254	tbz w8,#0x0,0x0097a260
0097a258	ldr x0,[x19, #0x68]
0097a25c	bl 0x00c301d0
0097a260	ldr x1,[x19, #0x48]
0097a264	add x0,x19,#0x40
0097a268	bl 0x00c32fc0
0097a26c	ldrb w8,[x19, #0x20]
0097a270	tbnz w8,#0x0,0x0097a280
0097a274	ldp x29,x30,[sp, #0x10]
0097a278	ldr x19,[sp], #0x20
0097a27c	ret
0097a280	ldr x0,[x19, #0x30]
0097a284	ldp x29,x30,[sp, #0x10]
0097a288	ldr x19,[sp], #0x20
0097a28c	b 0x00c301d0
