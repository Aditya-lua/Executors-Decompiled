; std::__ndk1::function<void(std::__ndk1::weak_ptr<ix::WebSocket>,std::__ndk1::shared_ptr<ix::ConnectionState>)>::~function @ 00993378
00993378	mov x8,x0
0099337c	ldr x0,[x0, #0x20]
00993380	cmp x8,x0
00993384	b.eq 0x00993398
00993388	cbz x0,0x009933a4
0099338c	ldr x8,[x0]
00993390	ldr x1,[x8, #0x28]
00993394	br x1
00993398	ldr x8,[x0]
0099339c	ldr x1,[x8, #0x20]
009933a0	br x1
009933a4	ret
