; FUN_008bda50 @ 008bda50
008bda50	sub sp,sp,#0x60
008bda54	stp x29,x30,[sp, #0x20]
008bda58	str x23,[sp, #0x30]
008bda5c	stp x22,x21,[sp, #0x40]
008bda60	stp x20,x19,[sp, #0x50]
008bda64	add x29,sp,#0x20
008bda68	mrs x21,tpidr_el0
008bda6c	mov x19,x1
008bda70	mov x20,x2
008bda74	ldr x8,[x21, #0x28]
008bda78	stur x8,[x29, #-0x8]
008bda7c	ldp w9,w23,[x1, #0x18]
008bda80	ldr x8,[x1, #0x10]
008bda84	add x1,sp,#0x8
008bda88	and w22,w23,#0xf
008bda8c	str x8,[sp, #0x8]
008bda90	stp w9,w22,[sp, #0x10]
008bda94	bl 0x008bd784
008bda98	cmp x0,x19
008bda9c	b.eq 0x008bdb08
008bdaa0	ldr w9,[x0, #0x1c]
008bdaa4	mov x8,x0
008bdaa8	sbfx x10,x9,#0x4,#0x1c
008bdaac	add x0,x0,x10, LSL #0x5
008bdab0	cmp x0,x19
008bdab4	b.ne 0x008bdaa0
008bdab8	sub x10,x20,x8
008bdabc	lsr x10,x10,#0x1
008bdac0	bfxil w10,w9,#0x0,#0x4
008bdac4	str w10,[x8, #0x1c]
008bdac8	ldp q1,q0,[x19]
008bdacc	stp q1,q0,[x20]
008bdad0	ldr w8,[x19, #0x1c]
008bdad4	cmp w8,#0x10
008bdad8	b.cc 0x008bdb00
008bdadc	sub x8,x19,x20
008bdae0	ldr w9,[x20, #0x1c]
008bdae4	lsr x8,x8,#0x1
008bdae8	and w8,w8,#0xfffffff0
008bdaec	add w8,w9,w8
008bdaf0	str w8,[x20, #0x1c]
008bdaf4	ldr w8,[x19, #0x1c]
008bdaf8	and w8,w8,#0xf
008bdafc	str w8,[x19, #0x1c]
008bdb00	str wzr,[x19, #0xc]
008bdb04	b 0x008bdb4c
008bdb08	cmp w23,#0xf
008bdb0c	b.ls 0x008bdb34
008bdb10	asr w8,w23,#0x4
008bdb14	ldr w9,[x20, #0x1c]
008bdb18	add x8,x19,x8, LSL #0x5
008bdb1c	sub x8,x8,x20
008bdb20	lsr x8,x8,#0x1
008bdb24	bfxil w8,w9,#0x0,#0x4
008bdb28	str w8,[x20, #0x1c]
008bdb2c	ldr w8,[x19, #0x1c]
008bdb30	and w22,w8,#0xf
008bdb34	sub x8,x20,x19
008bdb38	lsr x8,x8,#0x1
008bdb3c	and w8,w8,#0xfffffff0
008bdb40	orr w8,w22,w8
008bdb44	str w8,[x19, #0x1c]
008bdb48	mov x19,x20
008bdb4c	ldr x8,[x21, #0x28]
008bdb50	ldur x9,[x29, #-0x8]
008bdb54	cmp x8,x9
008bdb58	b.ne 0x008bdb78
008bdb5c	mov x0,x19
008bdb60	ldp x20,x19,[sp, #0x50]
008bdb64	ldr x23,[sp, #0x30]
008bdb68	ldp x22,x21,[sp, #0x40]
008bdb6c	ldp x29,x30,[sp, #0x20]
008bdb70	add sp,sp,#0x60
008bdb74	ret
008bdb78	bl 0x00c2fec0
