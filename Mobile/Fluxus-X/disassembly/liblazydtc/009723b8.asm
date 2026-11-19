; std::__ndk1::queue<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::deque<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>,std::__ndk1::allocator<std::__ndk1::pair<std::__ndk1::shared_ptr<ix::HttpRequestArgs>,std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::HttpResponse>const&)>>>>>::~queue @ 009723b8
009723b8	str x21,[sp, #-0x30]!
009723bc	stp x20,x19,[sp, #0x10]
009723c0	stp x29,x30,[sp, #0x20]
009723c4	add x29,sp,#0x20
009723c8	mov x19,x0
009723cc	bl 0x00c33060
009723d0	ldp x20,x21,[x19, #0x8]
009723d4	cmp x20,x21
009723d8	b.eq 0x00972410
009723dc	ldr x0,[x20], #0x8
009723e0	bl 0x00c301d0
009723e4	cmp x21,x20
009723e8	b.ne 0x009723dc
009723ec	ldp x9,x8,[x19, #0x8]
009723f0	cmp x8,x9
009723f4	b.eq 0x00972410
009723f8	sub x10,x8,#0x8
009723fc	sub x9,x10,x9
00972400	mvn x9,x9
00972404	and x9,x9,#-0x8
00972408	add x8,x8,x9
0097240c	str x8,[x19, #0x10]
00972410	ldr x0,[x19]
00972414	cbz x0,0x00972428
00972418	ldp x29,x30,[sp, #0x20]
0097241c	ldp x20,x19,[sp, #0x10]
00972420	ldr x21,[sp], #0x30
00972424	b 0x00c301d0
00972428	ldp x29,x30,[sp, #0x20]
0097242c	ldp x20,x19,[sp, #0x10]
00972430	ldr x21,[sp], #0x30
00972434	ret
