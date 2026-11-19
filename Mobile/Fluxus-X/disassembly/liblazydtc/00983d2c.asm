; std::__ndk1::__shared_ptr_emplace<ix::HttpRequest,std::__ndk1::allocator<ix::HttpRequest>>::~__shared_ptr_emplace @ 00983d2c
00983d2c	str x19,[sp, #-0x20]!
00983d30	stp x29,x30,[sp, #0x10]
00983d34	add x29,sp,#0x10
00983d38	adrp x8,0xcb4000
00983d3c	ldr x8,[x8, #0xee0]
00983d40	ldr x1,[x0, #0x80]
00983d44	mov x19,x0
00983d48	add x8,x8,#0x10
00983d4c	str x8,[x0], #0x78
00983d50	bl 0x00c32fc0
00983d54	ldrb w8,[x19, #0x60]
00983d58	tbnz w8,#0x0,0x00983d8c
00983d5c	ldrb w8,[x19, #0x48]
00983d60	tbnz w8,#0x0,0x00983d9c
00983d64	ldrb w8,[x19, #0x30]
00983d68	tbnz w8,#0x0,0x00983dac
00983d6c	ldrb w8,[x19, #0x18]
00983d70	tbz w8,#0x0,0x00983d7c
00983d74	ldr x0,[x19, #0x28]
00983d78	bl 0x00c301d0
00983d7c	ldp x29,x30,[sp, #0x10]
00983d80	mov x0,x19
00983d84	ldr x19,[sp], #0x20
00983d88	b 0x00c30230
00983d8c	ldr x0,[x19, #0x70]
00983d90	bl 0x00c301d0
00983d94	ldrb w8,[x19, #0x48]
00983d98	tbz w8,#0x0,0x00983d64
00983d9c	ldr x0,[x19, #0x58]
00983da0	bl 0x00c301d0
00983da4	ldrb w8,[x19, #0x30]
00983da8	tbz w8,#0x0,0x00983d6c
00983dac	ldr x0,[x19, #0x40]
00983db0	bl 0x00c301d0
00983db4	ldrb w8,[x19, #0x18]
00983db8	tbnz w8,#0x0,0x00983d74
00983dbc	b 0x00983d7c
