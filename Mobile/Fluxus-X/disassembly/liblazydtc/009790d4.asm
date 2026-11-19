; std::__ndk1::deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>::push_back @ 009790d4
009790d4	stp x20,x19,[sp, #-0x20]!
009790d8	stp x29,x30,[sp, #0x10]
009790dc	add x29,sp,#0x10
009790e0	ldp x8,x9,[x0, #0x8]
009790e4	ldp x10,x11,[x0, #0x20]
009790e8	mov x19,x0
009790ec	mov x20,x1
009790f0	subs x9,x9,x8
009790f4	lsl x9,x9,#0x3
009790f8	sub x9,x9,#0x1
009790fc	csel x12,xzr,x9,eq
00979100	add x9,x11,x10
00979104	cmp x12,x9
00979108	b.ne 0x00979120
0097910c	mov x0,x19
00979110	bl 0x00c330f0
00979114	ldp x9,x10,[x19, #0x20]
00979118	ldr x8,[x19, #0x8]
0097911c	add x9,x9,x10
00979120	lsr x10,x9,#0x3
00979124	and x10,x10,#0x1ffffffffffffff8
00979128	ldr x8,[x8, x10#0x0]
0097912c	ldr q0,[x20]
00979130	and x9,x9,#0x3f
00979134	add x8,x8,x9, LSL #0x6
00979138	mov x1,x8
0097913c	str q0,[x1], #0x10
00979140	ldr x9,[x20, #0x30]
00979144	stp xzr,xzr,[x20]
00979148	cbz x9,0x00979164
0097914c	add x10,x20,#0x10
00979150	cmp x10,x9
00979154	b.eq 0x0097916c
00979158	str x9,[x8, #0x30]
0097915c	str xzr,[x20, #0x30]
00979160	b 0x00979180
00979164	str xzr,[x8, #0x30]
00979168	b 0x00979180
0097916c	str x1,[x8, #0x30]
00979170	ldr x0,[x20, #0x30]
00979174	ldr x8,[x0]
00979178	ldr x8,[x8, #0x18]
0097917c	blr x8
00979180	ldr x8,[x19, #0x28]
00979184	add x8,x8,#0x1
00979188	str x8,[x19, #0x28]
0097918c	ldp x29,x30,[sp, #0x10]
00979190	ldp x20,x19,[sp], #0x20
00979194	ret
