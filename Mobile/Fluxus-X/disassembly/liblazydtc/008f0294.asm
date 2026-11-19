; cpr::Session::GetSharedPtrFromThis @ 008f0294
008f0294	stp x20,x19,[sp, #-0x20]!
008f0298	stp x29,x30,[sp, #0x10]
008f029c	add x29,sp,#0x10
008f02a0	ldp x9,x0,[x0]
008f02a4	mov x19,x8
008f02a8	str x9,[x8]
008f02ac	cbz x0,0x008f02c8
008f02b0	bl 0x00c2fef0
008f02b4	str x0,[x19, #0x8]
008f02b8	cbz x0,0x008f02cc
008f02bc	ldp x29,x30,[sp, #0x10]
008f02c0	ldp x20,x19,[sp], #0x20
008f02c4	ret
008f02c8	str xzr,[x19, #0x8]
008f02cc	mov w0,#0x8
008f02d0	bl 0x00c30000
008f02d4	adrp x8,0xcb4000
008f02d8	ldr x8,[x8, #0xd30]
008f02dc	add x8,x8,#0x10
008f02e0	str x8,[x0]
008f02e4	adrp x1,0xcb4000
008f02e8	adrp x2,0xcb4000
008f02ec	ldr x1,[x1, #0xd18]
008f02f0	ldr x2,[x2, #0xd00]
008f02f4	bl 0x00c30020
