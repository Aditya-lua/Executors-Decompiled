; cpr::Cookies::push_back @ 008e8da0
008e8da0	str x19,[sp, #-0x20]!
008e8da4	stp x29,x30,[sp, #0x10]
008e8da8	add x29,sp,#0x10
008e8dac	mov x19,x0
008e8db0	ldr x0,[x0, #0x10]
008e8db4	ldr x8,[x19, #0x18]
008e8db8	cmp x0,x8
008e8dbc	b.eq 0x008e8ddc
008e8dc0	bl 0x00c30df0
008e8dc4	ldr x8,[x19, #0x10]
008e8dc8	add x8,x8,#0x78
008e8dcc	str x8,[x19, #0x10]
008e8dd0	ldp x29,x30,[sp, #0x10]
008e8dd4	ldr x19,[sp], #0x20
008e8dd8	ret
008e8ddc	ldp x29,x30,[sp, #0x10]
008e8de0	add x0,x19,#0x8
008e8de4	ldr x19,[sp], #0x20
008e8de8	b 0x00c30eb0
