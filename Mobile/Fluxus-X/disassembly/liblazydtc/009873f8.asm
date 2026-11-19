; std::__ndk1::__shared_ptr_pointer<addrinfo*,void(*)(addrinfo*),std::__ndk1::allocator<addrinfo>>::__get_deleter @ 009873f8
009873f8	adrp x9,0xcb4000
009873fc	ldr x8,[x1, #0x8]
00987400	ldr x9,[x9, #0xec8]
00987404	add x10,x0,#0x20
00987408	cmp x8,x9
0098740c	csel x0,x10,xzr,eq
00987410	ret
