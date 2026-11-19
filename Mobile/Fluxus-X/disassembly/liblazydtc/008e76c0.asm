; cpr::CertInfo::pop_back @ 008e76c0
008e76c0	stp x20,x19,[sp, #-0x20]!
008e76c4	stp x29,x30,[sp, #0x10]
008e76c8	add x29,sp,#0x10
008e76cc	ldr x8,[x0, #0x8]
008e76d0	mov x19,x0
008e76d4	mov x20,x8
008e76d8	ldrb w9,[x20, #-0x18]!
008e76dc	tbz w9,#0x0,0x008e76e8
008e76e0	ldur x0,[x8, #-0x8]
008e76e4	bl 0x00c301d0
008e76e8	str x20,[x19, #0x8]
008e76ec	ldp x29,x30,[sp, #0x10]
008e76f0	ldp x20,x19,[sp], #0x20
008e76f4	ret
