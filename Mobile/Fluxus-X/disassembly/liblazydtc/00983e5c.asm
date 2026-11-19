; std::__ndk1::__shared_ptr_emplace<ix::HttpRequest,std::__ndk1::allocator<ix::HttpRequest>>::__on_zero_shared @ 00983e5c
00983e5c	str x19,[sp, #-0x20]!
00983e60	stp x29,x30,[sp, #0x10]
00983e64	add x29,sp,#0x10
00983e68	ldr x1,[x0, #0x80]
00983e6c	mov x19,x0
00983e70	add x0,x0,#0x78
00983e74	bl 0x00c32fc0
00983e78	ldrb w8,[x19, #0x60]
00983e7c	tbnz w8,#0x0,0x00983ea4
00983e80	ldrb w8,[x19, #0x48]
00983e84	tbnz w8,#0x0,0x00983eb4
00983e88	ldrb w8,[x19, #0x30]
00983e8c	tbnz w8,#0x0,0x00983ec4
00983e90	ldrb w8,[x19, #0x18]
00983e94	tbnz w8,#0x0,0x00983ed4
00983e98	ldp x29,x30,[sp, #0x10]
00983e9c	ldr x19,[sp], #0x20
00983ea0	ret
00983ea4	ldr x0,[x19, #0x70]
00983ea8	bl 0x00c301d0
00983eac	ldrb w8,[x19, #0x48]
00983eb0	tbz w8,#0x0,0x00983e88
00983eb4	ldr x0,[x19, #0x58]
00983eb8	bl 0x00c301d0
00983ebc	ldrb w8,[x19, #0x30]
00983ec0	tbz w8,#0x0,0x00983e90
00983ec4	ldr x0,[x19, #0x40]
00983ec8	bl 0x00c301d0
00983ecc	ldrb w8,[x19, #0x18]
00983ed0	tbz w8,#0x0,0x00983e98
00983ed4	ldr x0,[x19, #0x28]
00983ed8	ldp x29,x30,[sp, #0x10]
00983edc	ldr x19,[sp], #0x20
00983ee0	b 0x00c301d0
