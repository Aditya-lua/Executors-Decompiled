; std::__ndk1::__shared_ptr_emplace<std::__ndk1::packaged_task<cpr::Response()>,std::__ndk1::allocator<std::__ndk1::packaged_task<cpr::Response()>>>::~__shared_ptr_emplace @ 008f5618
008f5618	stp x20,x19,[sp, #-0x20]!
008f561c	stp x29,x30,[sp, #0x10]
008f5620	add x29,sp,#0x10
008f5624	adrp x8,0xcb4000
008f5628	ldr x8,[x8, #0xd50]
008f562c	mov x19,x0
008f5630	add x20,x0,#0x20
008f5634	add x8,x8,#0x10
008f5638	str x8,[x0], #0x50
008f563c	bl 0x00c31710
008f5640	ldr x0,[x19, #0x40]
008f5644	cmp x0,x20
008f5648	b.eq 0x008f5660
008f564c	cbz x0,0x008f566c
008f5650	ldr x8,[x0]
008f5654	ldr x8,[x8, #0x20]
008f5658	blr x8
008f565c	b 0x008f566c
008f5660	ldr x8,[x0]
008f5664	ldr x8,[x8, #0x18]
008f5668	blr x8
008f566c	mov x0,x19
008f5670	bl 0x00c30230
008f5674	ldp x29,x30,[sp, #0x10]
008f5678	mov x0,x19
008f567c	ldp x20,x19,[sp], #0x20
008f5680	b 0x00c301d0
