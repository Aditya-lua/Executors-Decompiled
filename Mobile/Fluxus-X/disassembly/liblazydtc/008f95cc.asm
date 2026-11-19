; std::__ndk1::__shared_ptr_pointer<cpr::CurlHolder*,std::__ndk1::default_delete<cpr::CurlHolder>,std::__ndk1::allocator<cpr::CurlHolder>>::__on_zero_shared @ 008f95cc
008f95cc	str x19,[sp, #-0x20]!
008f95d0	stp x29,x30,[sp, #0x10]
008f95d4	add x29,sp,#0x10
008f95d8	ldr x19,[x0, #0x18]
008f95dc	cbz x19,0x008f95f8
008f95e0	mov x0,x19
008f95e4	bl 0x00c30fc0
008f95e8	ldp x29,x30,[sp, #0x10]
008f95ec	mov x0,x19
008f95f0	ldr x19,[sp], #0x20
008f95f4	b 0x00c301d0
008f95f8	ldp x29,x30,[sp, #0x10]
008f95fc	ldr x19,[sp], #0x20
008f9600	ret
