; std::__ndk1::__function::__func<std::__ndk1::shared_ptr<ix::ConnectionState>(*)(),std::__ndk1::allocator<std::__ndk1::shared_ptr<ix::ConnectionState>(*)()>,std::__ndk1::shared_ptr<ix::ConnectionState>()>::target @ 0098ac64
0098ac64	adrp x9,0xcb4000
0098ac68	ldr x8,[x1, #0x8]
0098ac6c	ldr x9,[x9, #0xfe8]
0098ac70	add x10,x0,#0x8
0098ac74	cmp x8,x9
0098ac78	csel x0,x10,xzr,eq
0098ac7c	ret
