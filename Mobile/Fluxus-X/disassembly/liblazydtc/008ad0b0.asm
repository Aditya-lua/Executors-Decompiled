; FUN_008ad0b0 @ 008ad0b0
008ad0b0	sub sp,sp,#0x50
008ad0b4	stp x29,x30,[sp, #0x10]
008ad0b8	str x23,[sp, #0x20]
008ad0bc	stp x22,x21,[sp, #0x30]
008ad0c0	stp x20,x19,[sp, #0x40]
008ad0c4	add x29,sp,#0x10
008ad0c8	mrs x22,tpidr_el0
008ad0cc	mov w20,w2
008ad0d0	mov x19,x0
008ad0d4	ldr x8,[x22, #0x28]
008ad0d8	mov w21,w1
008ad0dc	str x8,[sp, #0x8]
008ad0e0	ldr x8,[x0, #0x60]
008ad0e4	ldp x8,x9,[x8, #0x8]
008ad0e8	cmp x9,x8
008ad0ec	b.cc 0x008ad0fc
008ad0f0	mov x0,x19
008ad0f4	mov w1,#0x1
008ad0f8	bl 0x008b52c4
008ad0fc	ldrb w8,[x19, #0x2]
008ad100	tbz w8,#0x2,0x008ad114
008ad104	add x2,x19,#0x38
008ad108	mov x0,x19
008ad10c	mov x1,x19
008ad110	bl 0x008b63a4
008ad114	ldr x8,[x19, #0x50]
008ad118	ldr x23,[x19, #0x68]
008ad11c	ldr x9,[x8, #0x18]
008ad120	add x10,x23,#0x10
008ad124	cmp x10,x9
008ad128	b.ls 0x008ad190
008ad12c	ldr x10,[x19, #0x70]
008ad130	mov w11,#0xf3f0
008ad134	movk w11,#0x1, LSL #16
008ad138	sub x10,x23,x10
008ad13c	cmp x10,x11
008ad140	b.gt 0x008ad1e0
008ad144	ldr x10,[x19, #0x48]
008ad148	sub x10,x10,x23
008ad14c	cmp x10,#0x10
008ad150	b.gt 0x008ad180
008ad154	mov w8,#0x1
008ad158	nop
008ad15c	adr x1,0x8aa604
008ad160	add x2,sp,#0x4
008ad164	mov x0,x19
008ad168	str w8,[sp, #0x4]
008ad16c	bl 0x008b3edc
008ad170	cbnz w0,0x008ad1e0
008ad174	ldr x8,[x19, #0x50]
008ad178	ldr x23,[x19, #0x68]
008ad17c	ldr x9,[x8, #0x18]
008ad180	add x10,x23,#0x10
008ad184	cmp x9,x10
008ad188	b.cs 0x008ad190
008ad18c	str x10,[x8, #0x18]
008ad190	mov x0,x19
008ad194	mov w1,w21
008ad198	mov w2,w20
008ad19c	bl 0x008bae54
008ad1a0	str x0,[x23]
008ad1a4	mov w8,#0x6
008ad1a8	ldr x9,[x19, #0x68]
008ad1ac	str w8,[x23, #0xc]
008ad1b0	add x8,x9,#0x10
008ad1b4	str x8,[x19, #0x68]
008ad1b8	ldr x8,[x22, #0x28]
008ad1bc	ldr x9,[sp, #0x8]
008ad1c0	cmp x8,x9
008ad1c4	b.ne 0x008ad208
008ad1c8	ldp x20,x19,[sp, #0x40]
008ad1cc	ldr x23,[sp, #0x20]
008ad1d0	ldp x22,x21,[sp, #0x30]
008ad1d4	ldp x29,x30,[sp, #0x10]
008ad1d8	add sp,sp,#0x50
008ad1dc	ret
008ad1e0	adrp x1,0x2b6000
008ad1e4	add x1,x1,#0xc71
008ad1e8	mov x0,x19
008ad1ec	bl 0x008b9568
008ad1f0	ldr x8,[x22, #0x28]
008ad1f4	ldr x9,[sp, #0x8]
008ad1f8	cmp x8,x9
008ad1fc	b.ne 0x008ad208
008ad200	mov x0,x19
008ad204	bl 0x008aa5f4
008ad208	bl 0x00c2fec0
