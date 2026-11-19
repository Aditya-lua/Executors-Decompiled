; std::__ndk1::__shared_ptr_pointer<std::__ndk1::thread*,std::__ndk1::default_delete<std::__ndk1::thread>,std::__ndk1::allocator<std::__ndk1::thread>>::__on_zero_shared @ 008feb5c
008feb5c	str x19,[sp, #-0x20]!
008feb60	stp x29,x30,[sp, #0x10]
008feb64	add x29,sp,#0x10
008feb68	ldr x19,[x0, #0x18]
008feb6c	cbz x19,0x008feb88
008feb70	mov x0,x19
008feb74	bl 0x00c2ff80
008feb78	ldp x29,x30,[sp, #0x10]
008feb7c	mov x0,x19
008feb80	ldr x19,[sp], #0x20
008feb84	b 0x00c301d0
008feb88	ldp x29,x30,[sp, #0x10]
008feb8c	ldr x19,[sp], #0x20
008feb90	ret
