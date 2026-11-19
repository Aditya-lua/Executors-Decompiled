; std::__ndk1::function<void(std::__ndk1::unique_ptr<ix::WebSocketMessage,std::__ndk1::default_delete<ix::WebSocketMessage>>const&)>::~function @ 0098ce5c
0098ce5c	mov x8,x0
0098ce60	ldr x0,[x0, #0x20]
0098ce64	cmp x8,x0
0098ce68	b.eq 0x0098ce7c
0098ce6c	cbz x0,0x0098ce88
0098ce70	ldr x8,[x0]
0098ce74	ldr x1,[x8, #0x28]
0098ce78	br x1
0098ce7c	ldr x8,[x0]
0098ce80	ldr x1,[x8, #0x20]
0098ce84	br x1
0098ce88	ret
