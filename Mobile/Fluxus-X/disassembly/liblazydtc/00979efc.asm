; std::__ndk1::deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>::pop_front @ 00979efc
00979efc	str x21,[sp, #-0x30]!
00979f00	stp x20,x19,[sp, #0x10]
00979f04	stp x29,x30,[sp, #0x20]
00979f08	add x29,sp,#0x20
00979f0c	ldr x8,[x0, #0x20]
00979f10	ldr x9,[x0, #0x8]
00979f14	mov x19,x0
00979f18	lsr x10,x8,#0x3
00979f1c	and x10,x10,#0x1ffffffffffffff8
00979f20	ldr x20,[x9, x10#0x0]
00979f24	and x21,x8,#0x3f
00979f28	add x8,x20,x21, LSL #0x6
00979f2c	ldr x0,[x8, #0x30]
00979f30	add x8,x8,#0x10
00979f34	cmp x8,x0
00979f38	b.eq 0x00979f4c
00979f3c	cbz x0,0x00979f58
00979f40	ldr x8,[x0]
00979f44	ldr x8,[x8, #0x28]
00979f48	b 0x00979f54
00979f4c	ldr x8,[x0]
00979f50	ldr x8,[x8, #0x20]
00979f54	blr x8
00979f58	add x8,x20,x21, LSL #0x6
00979f5c	ldr x20,[x8, #0x8]
00979f60	cbz x20,0x00979f94
00979f64	add x8,x20,#0x8
00979f68	ldaxr x9,[x8]
00979f6c	sub x10,x9,#0x1
00979f70	stlxr w11,x10,[x8]
00979f74	cbnz w11,0x00979f68
00979f78	cbnz x9,0x00979f94
00979f7c	ldr x8,[x20]
00979f80	mov x0,x20
00979f84	ldr x8,[x8, #0x10]
00979f88	blr x8
00979f8c	mov x0,x20
00979f90	bl 0x00c2ff00
00979f94	adrp x8,0x29c000
00979f98	ldr q0,[x19, #0x20]
00979f9c	ldr q1,[x8, #0xf10]
00979fa0	add v0.2D,v0.2D,v1.2D
00979fa4	fmov x8,d0
00979fa8	cmp x8,#0x80
00979fac	str q0,[x19, #0x20]
00979fb0	b.cc 0x00979fd8
00979fb4	ldr x8,[x19, #0x8]
00979fb8	ldr x0,[x8]
00979fbc	bl 0x00c301d0
00979fc0	ldr x8,[x19, #0x8]
00979fc4	ldr x9,[x19, #0x20]
00979fc8	add x8,x8,#0x8
00979fcc	sub x9,x9,#0x40
00979fd0	str x8,[x19, #0x8]
00979fd4	str x9,[x19, #0x20]
00979fd8	ldp x29,x30,[sp, #0x20]
00979fdc	ldp x20,x19,[sp, #0x10]
00979fe0	ldr x21,[sp], #0x30
00979fe4	ret
