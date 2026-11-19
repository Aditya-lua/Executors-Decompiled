; std::__ndk1::__assoc_state<cpr::Response>::__on_zero_shared @ 008f5984
008f5984	str x19,[sp, #-0x20]!
008f5988	stp x29,x30,[sp, #0x10]
008f598c	add x29,sp,#0x10
008f5990	ldrb w8,[x0, #0x70]
008f5994	mov x19,x0
008f5998	tbz w8,#0x0,0x008f59a4
008f599c	add x0,x19,#0x78
008f59a0	bl 0x008247c0
008f59a4	ldr x8,[x19]
008f59a8	ldp x29,x30,[sp, #0x10]
008f59ac	mov x0,x19
008f59b0	ldr x1,[x8, #0x8]
008f59b4	ldr x19,[sp], #0x20
008f59b8	br x1
