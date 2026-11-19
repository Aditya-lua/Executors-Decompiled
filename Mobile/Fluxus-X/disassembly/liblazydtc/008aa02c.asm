; FUN_008aa02c @ 008aa02c
008aa02c	sub sp,sp,#0x140
008aa030	stp x29,x30,[sp, #0x110]
008aa034	stp x28,x21,[sp, #0x120]
008aa038	stp x20,x19,[sp, #0x130]
008aa03c	add x29,sp,#0x110
008aa040	stp x1,x2,[sp, #0x88]
008aa044	mov x19,x8
008aa048	mov x10,sp
008aa04c	stp x3,x4,[sp, #0x98]
008aa050	add x10,x10,#0x80
008aa054	add x11,sp,#0x88
008aa058	stp x5,x6,[sp, #0xa8]
008aa05c	mov x9,x0
008aa060	str x7,[sp, #0xb8]
008aa064	stp q0,q1,[sp]
008aa068	stp q2,q3,[sp, #0x20]
008aa06c	stp q4,q5,[sp, #0x40]
008aa070	stp q6,q7,[sp, #0x60]
008aa074	mrs x21,tpidr_el0
008aa078	ldr x8,[x21, #0x28]
008aa07c	stur x8,[x29, #-0x8]
008aa080	mov x8,#-0x38
008aa084	movk x8,#0xff80, LSL #32
008aa088	stp xzr,xzr,[x19]
008aa08c	stp x10,x8,[x29, #-0x18]
008aa090	add x8,x11,#0x38
008aa094	add x11,x29,#0x30
008aa098	sub x10,x29,#0x28
008aa09c	stp x11,x8,[x29, #-0x28]
008aa0a0	ldp q1,q0,[x10]
008aa0a4	str xzr,[x19, #0x10]
008aa0a8	stp q1,q0,[x29, #-0x50]
008aa0ac	sub x2,x29,#0x50
008aa0b0	mov x0,x19
008aa0b4	mov x1,x9
008aa0b8	bl 0x008a9f20
008aa0bc	ldr x8,[x21, #0x28]
008aa0c0	ldur x9,[x29, #-0x8]
008aa0c4	cmp x8,x9
008aa0c8	b.ne 0x008aa114
008aa0cc	ldp x20,x19,[sp, #0x130]
008aa0d0	ldp x28,x21,[sp, #0x120]
008aa0d4	ldp x29,x30,[sp, #0x110]
008aa0d8	add sp,sp,#0x140
008aa0dc	ret
008aa114	bl 0x00c2fec0
