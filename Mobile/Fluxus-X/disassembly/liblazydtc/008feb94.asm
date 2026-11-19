; std::__ndk1::__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>::__get_deleter @ 008feb94
008feb94	adrp x9,0xcb4000
008feb98	ldr x8,[x1, #0x8]
008feb9c	ldr x9,[x9, #0xd60]
008feba0	add x10,x0,#0x18
008feba4	cmp x8,x9
008feba8	csel x0,x10,xzr,eq
008febac	ret
