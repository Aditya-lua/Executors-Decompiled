; cpr::Cookies::pop_back @ 008e8dec
008e8dec	str x21,[sp, #-0x30]!
008e8df0	stp x20,x19,[sp, #0x10]
008e8df4	stp x29,x30,[sp, #0x20]
008e8df8	add x29,sp,#0x20
008e8dfc	ldr x20,[x0, #0x10]
008e8e00	mov x19,x0
008e8e04	ldurb w8,[x20, #-0x28]
008e8e08	tbz w8,#0x0,0x008e8e14
008e8e0c	ldur x0,[x20, #-0x18]
008e8e10	bl 0x00c301d0
008e8e14	ldurb w8,[x20, #-0x48]
008e8e18	sub x21,x20,#0x78
008e8e1c	tbnz w8,#0x0,0x008e8e4c
008e8e20	ldurb w8,[x20, #-0x60]
008e8e24	tbnz w8,#0x0,0x008e8e5c
008e8e28	ldrb w8,[x21]
008e8e2c	tbz w8,#0x0,0x008e8e38
008e8e30	ldur x0,[x20, #-0x68]
008e8e34	bl 0x00c301d0
008e8e38	str x21,[x19, #0x10]
008e8e3c	ldp x29,x30,[sp, #0x20]
008e8e40	ldp x20,x19,[sp, #0x10]
008e8e44	ldr x21,[sp], #0x30
008e8e48	ret
008e8e4c	ldur x0,[x20, #-0x38]
008e8e50	bl 0x00c301d0
008e8e54	ldurb w8,[x20, #-0x60]
008e8e58	tbz w8,#0x0,0x008e8e28
008e8e5c	ldur x0,[x20, #-0x50]
008e8e60	bl 0x00c301d0
008e8e64	ldrb w8,[x21]
008e8e68	tbnz w8,#0x0,0x008e8e30
008e8e6c	b 0x008e8e38
