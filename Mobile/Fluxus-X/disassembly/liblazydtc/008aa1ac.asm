; FUN_008aa1ac @ 008aa1ac
008aa1ac	sub sp,sp,#0x60
008aa1b0	stp x29,x30,[sp, #0x30]
008aa1b4	str x21,[sp, #0x40]
008aa1b8	stp x20,x19,[sp, #0x50]
008aa1bc	add x29,sp,#0x30
008aa1c0	mrs x21,tpidr_el0
008aa1c4	mov x19,x8
008aa1c8	mov x9,x0
008aa1cc	ldr x8,[x21, #0x28]
008aa1d0	stur x8,[x29, #-0x8]
008aa1d4	ldp q0,q1,[x1]
008aa1d8	stp xzr,xzr,[x19]
008aa1dc	str xzr,[x19, #0x10]
008aa1e0	stp q0,q1,[sp]
008aa1e4	mov x2,sp
008aa1e8	mov x0,x19
008aa1ec	mov x1,x9
008aa1f0	bl 0x008a9f20
008aa1f4	ldr x8,[x21, #0x28]
008aa1f8	ldur x9,[x29, #-0x8]
008aa1fc	cmp x8,x9
008aa200	b.ne 0x008aa24c
008aa204	ldp x20,x19,[sp, #0x50]
008aa208	ldr x21,[sp, #0x40]
008aa20c	ldp x29,x30,[sp, #0x30]
008aa210	add sp,sp,#0x60
008aa214	ret
008aa24c	bl 0x00c2fec0
