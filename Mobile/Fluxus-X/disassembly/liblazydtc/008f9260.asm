; std::__ndk1::__vector_base<cpr::Cookie,std::__ndk1::allocator<cpr::Cookie>>::~__vector_base @ 008f9260
008f9260	stp x22,x21,[sp, #-0x30]!
008f9264	stp x20,x19,[sp, #0x10]
008f9268	stp x29,x30,[sp, #0x20]
008f926c	add x29,sp,#0x20
008f9270	ldr x20,[x0]
008f9274	mov x19,x0
008f9278	cbz x20,0x008f930c
008f927c	ldr x21,[x19, #0x8]
008f9280	cmp x21,x20
008f9284	b.ne 0x008f92b4
008f9288	mov x0,x20
008f928c	b 0x008f92f8
008f9290	ldur x0,[x21, #-0x18]
008f9294	bl 0x00c301d0
008f9298	ldurb w8,[x21, #-0x48]
008f929c	tbz w8,#0x0,0x008f92c4
008f92a0	ldur x0,[x21, #-0x38]
008f92a4	bl 0x00c301d0
008f92a8	ldurb w8,[x21, #-0x60]
008f92ac	tbnz w8,#0x0,0x008f92cc
008f92b0	b 0x008f92d4
008f92b4	ldurb w8,[x21, #-0x28]
008f92b8	tbnz w8,#0x0,0x008f9290
008f92bc	ldurb w8,[x21, #-0x48]
008f92c0	tbnz w8,#0x0,0x008f92a0
008f92c4	ldurb w8,[x21, #-0x60]
008f92c8	tbz w8,#0x0,0x008f92d4
008f92cc	ldur x0,[x21, #-0x50]
008f92d0	bl 0x00c301d0
008f92d4	ldurb w8,[x21, #-0x78]
008f92d8	sub x22,x21,#0x78
008f92dc	tbz w8,#0x0,0x008f92e8
008f92e0	ldur x0,[x21, #-0x68]
008f92e4	bl 0x00c301d0
008f92e8	cmp x20,x22
008f92ec	mov x21,x22
008f92f0	b.ne 0x008f92b4
008f92f4	ldr x0,[x19]
008f92f8	str x20,[x19, #0x8]
008f92fc	ldp x29,x30,[sp, #0x20]
008f9300	ldp x20,x19,[sp, #0x10]
008f9304	ldp x22,x21,[sp], #0x30
008f9308	b 0x00c301d0
008f930c	ldp x29,x30,[sp, #0x20]
008f9310	ldp x20,x19,[sp, #0x10]
008f9314	ldp x22,x21,[sp], #0x30
008f9318	ret
