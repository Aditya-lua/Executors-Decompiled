; std::__ndk1::__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>::__on_zero_shared @ 008f5688
008f5688	stp x20,x19,[sp, #-0x20]!
008f568c	stp x29,x30,[sp, #0x10]
008f5690	add x29,sp,#0x10
008f5694	mov x19,x0
008f5698	add x20,x0,#0x20
008f569c	add x0,x0,#0x50
008f56a0	bl 0x00c31710
008f56a4	ldr x0,[x19, #0x40]
008f56a8	cmp x0,x20
008f56ac	b.eq 0x008f56c4
008f56b0	cbz x0,0x008f56d0
008f56b4	ldr x8,[x0]
008f56b8	ldr x8,[x8, #0x20]
008f56bc	blr x8
008f56c0	b 0x008f56d0
008f56c4	ldr x8,[x0]
008f56c8	ldr x8,[x8, #0x18]
008f56cc	blr x8
008f56d0	ldp x29,x30,[sp, #0x10]
008f56d4	ldp x20,x19,[sp], #0x20
008f56d8	ret
