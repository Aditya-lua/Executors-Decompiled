; std::__ndk1::function<std::__ndk1::shared_ptr<ix::ConnectionState>()>::~function @ 00987d38
00987d38	mov x8,x0
00987d3c	ldr x0,[x0, #0x20]
00987d40	cmp x8,x0
00987d44	b.eq 0x00987d58
00987d48	cbz x0,0x00987d64
00987d4c	ldr x8,[x0]
00987d50	ldr x1,[x8, #0x28]
00987d54	br x1
00987d58	ldr x8,[x0]
00987d5c	ldr x1,[x8, #0x20]
00987d60	br x1
00987d64	ret
