; std::__ndk1::__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>::~__shared_ptr_emplace @ 008f55b0
008f55b0	stp x20,x19,[sp, #-0x20]!
008f55b4	stp x29,x30,[sp, #0x10]
008f55b8	add x29,sp,#0x10
008f55bc	adrp x8,0xcb4000
008f55c0	ldr x8,[x8, #0xd50]
008f55c4	mov x19,x0
008f55c8	add x20,x0,#0x20
008f55cc	add x8,x8,#0x10
008f55d0	str x8,[x0], #0x50
008f55d4	bl 0x00c31710
008f55d8	ldr x0,[x19, #0x40]
008f55dc	cmp x0,x20
008f55e0	b.eq 0x008f55f8
008f55e4	cbz x0,0x008f5604
008f55e8	ldr x8,[x0]
008f55ec	ldr x8,[x8, #0x20]
008f55f0	blr x8
008f55f4	b 0x008f5604
008f55f8	ldr x8,[x0]
008f55fc	ldr x8,[x8, #0x18]
008f5600	blr x8
008f5604	ldp x29,x30,[sp, #0x10]
008f5608	mov x0,x19
008f560c	ldp x20,x19,[sp], #0x20
008f5610	b 0x00c30230
