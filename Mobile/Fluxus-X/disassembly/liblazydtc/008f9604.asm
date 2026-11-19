; std::__ndk1::__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>::__get_deleter @ 008f9604
008f9604	adrp x9,0xcb4000
008f9608	ldr x8,[x1, #0x8]
008f960c	ldr x9,[x9, #0xd28]
008f9610	add x10,x0,#0x18
008f9614	cmp x8,x9
008f9618	csel x0,x10,xzr,eq
008f961c	ret
