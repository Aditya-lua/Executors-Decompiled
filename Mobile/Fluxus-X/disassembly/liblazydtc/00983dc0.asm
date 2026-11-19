; std::__ndk1::__shared_ptr_emplace<ix::HttpRequest,std::__ndk1::allocator<ix::HttpRequest>>::~__shared_ptr_emplace @ 00983dc0
00983dc0	str x19,[sp, #-0x20]!
00983dc4	stp x29,x30,[sp, #0x10]
00983dc8	add x29,sp,#0x10
00983dcc	adrp x8,0xcb4000
00983dd0	ldr x8,[x8, #0xee0]
00983dd4	ldr x1,[x0, #0x80]
00983dd8	mov x19,x0
00983ddc	add x8,x8,#0x10
00983de0	str x8,[x0], #0x78
00983de4	bl 0x00c32fc0
00983de8	ldrb w8,[x19, #0x60]
00983dec	tbnz w8,#0x0,0x00983e28
00983df0	ldrb w8,[x19, #0x48]
00983df4	tbnz w8,#0x0,0x00983e38
00983df8	ldrb w8,[x19, #0x30]
00983dfc	tbnz w8,#0x0,0x00983e48
00983e00	ldrb w8,[x19, #0x18]
00983e04	tbz w8,#0x0,0x00983e10
00983e08	ldr x0,[x19, #0x28]
00983e0c	bl 0x00c301d0
00983e10	mov x0,x19
00983e14	bl 0x00c30230
00983e18	ldp x29,x30,[sp, #0x10]
00983e1c	mov x0,x19
00983e20	ldr x19,[sp], #0x20
00983e24	b 0x00c301d0
00983e28	ldr x0,[x19, #0x70]
00983e2c	bl 0x00c301d0
00983e30	ldrb w8,[x19, #0x48]
00983e34	tbz w8,#0x0,0x00983df8
00983e38	ldr x0,[x19, #0x58]
00983e3c	bl 0x00c301d0
00983e40	ldrb w8,[x19, #0x30]
00983e44	tbz w8,#0x0,0x00983e00
00983e48	ldr x0,[x19, #0x40]
00983e4c	bl 0x00c301d0
00983e50	ldrb w8,[x19, #0x18]
00983e54	tbnz w8,#0x0,0x00983e08
00983e58	b 0x00983e10
