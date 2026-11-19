; std::__ndk1::function<void(std::__ndk1::shared_ptr<ix::ConnectionState>,ix::WebSocket&,std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>::~function @ 00993348
00993348	mov x8,x0
0099334c	ldr x0,[x0, #0x20]
00993350	cmp x8,x0
00993354	b.eq 0x00993368
00993358	cbz x0,0x00993374
0099335c	ldr x8,[x0]
00993360	ldr x1,[x8, #0x28]
00993364	br x1
00993368	ldr x8,[x0]
0099336c	ldr x1,[x8, #0x20]
00993370	br x1
00993374	ret
