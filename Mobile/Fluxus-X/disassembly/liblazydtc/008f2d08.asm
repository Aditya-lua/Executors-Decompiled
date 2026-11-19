; cpr::Session::SetOption @ 008f2d08
008f2d08	stp x26,x25,[sp, #-0x50]!
008f2d0c	stp x24,x23,[sp, #0x10]
008f2d10	stp x22,x21,[sp, #0x20]
008f2d14	stp x20,x19,[sp, #0x30]
008f2d18	stp x29,x30,[sp, #0x40]
008f2d1c	add x29,sp,#0x40
008f2d20	mov x21,x1
008f2d24	mov x23,x0
008f2d28	ldrb w8,[x21], #0x8
008f2d2c	ldr x24,[x23, #0x50]!
008f2d30	mov x20,x1
008f2d34	mov x19,x0
008f2d38	sturb w8,[x23, #-0x8]
008f2d3c	cbz x24,0x008f2d88
008f2d40	mov x22,x19
008f2d44	ldr x25,[x22, #0x58]!
008f2d48	cmp x25,x24
008f2d4c	b.eq 0x008f2d90
008f2d50	ldurb w8,[x25, #-0x18]
008f2d54	tbz w8,#0x0,0x008f2d60
008f2d58	ldur x0,[x25, #-0x8]
008f2d5c	bl 0x00c301d0
008f2d60	ldurb w8,[x25, #-0x30]
008f2d64	sub x26,x25,#0x30
008f2d68	tbz w8,#0x0,0x008f2d74
008f2d6c	ldur x0,[x25, #-0x20]
008f2d70	bl 0x00c301d0
008f2d74	cmp x24,x26
008f2d78	mov x25,x26
008f2d7c	b.ne 0x008f2d50
008f2d80	ldr x0,[x23]
008f2d84	b 0x008f2d94
008f2d88	add x22,x19,#0x58
008f2d8c	b 0x008f2da4
008f2d90	mov x0,x24
008f2d94	str x24,[x22]
008f2d98	bl 0x00c301d0
008f2d9c	stp xzr,xzr,[x23]
008f2da0	str xzr,[x23, #0x10]
008f2da4	ldr x8,[x20, #0x8]
008f2da8	str x8,[x19, #0x50]
008f2dac	ldr x8,[x20, #0x10]
008f2db0	str x8,[x22]
008f2db4	ldr x8,[x20, #0x18]
008f2db8	str x8,[x19, #0x60]
008f2dbc	stp xzr,xzr,[x21]
008f2dc0	str xzr,[x21, #0x10]
008f2dc4	ldp x29,x30,[sp, #0x40]
008f2dc8	ldp x20,x19,[sp, #0x30]
008f2dcc	ldp x22,x21,[sp, #0x20]
008f2dd0	ldp x24,x23,[sp, #0x10]
008f2dd4	ldp x26,x25,[sp], #0x50
008f2dd8	ret
