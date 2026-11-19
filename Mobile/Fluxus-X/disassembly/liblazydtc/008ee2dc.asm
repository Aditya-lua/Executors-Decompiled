; cpr::Session::SetTimeout @ 008ee2dc
008ee2dc	str x19,[sp, #-0x20]!
008ee2e0	stp x29,x30,[sp, #0x10]
008ee2e4	add x29,sp,#0x10
008ee2e8	ldr x8,[x0, #0x18]
008ee2ec	mov x0,x1
008ee2f0	ldr x19,[x8]
008ee2f4	bl 0x00c31410
008ee2f8	ldp x29,x30,[sp, #0x10]
008ee2fc	mov w1,#0x9b
008ee300	mov x2,x0
008ee304	mov x0,x19
008ee308	ldr x19,[sp], #0x20
008ee30c	b 0x00c317c0
