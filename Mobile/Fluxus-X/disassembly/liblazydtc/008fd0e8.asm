; cpr::Files::push_back @ 008fd0e8
008fd0e8	str x19,[sp, #-0x20]!
008fd0ec	stp x29,x30,[sp, #0x10]
008fd0f0	add x29,sp,#0x10
008fd0f4	mov x19,x0
008fd0f8	ldr x0,[x0, #0x8]
008fd0fc	ldr x8,[x19, #0x10]
008fd100	cmp x0,x8
008fd104	b.eq 0x008fd124
008fd108	bl 0x00c31060
008fd10c	ldr x8,[x19, #0x8]
008fd110	add x8,x8,#0x30
008fd114	str x8,[x19, #0x8]
008fd118	ldp x29,x30,[sp, #0x10]
008fd11c	ldr x19,[sp], #0x20
008fd120	ret
008fd124	ldp x29,x30,[sp, #0x10]
008fd128	mov x0,x19
008fd12c	ldr x19,[sp], #0x20
008fd130	b 0x00c310a0
