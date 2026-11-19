; FUN_008aa118 @ 008aa118
008aa118	sub sp,sp,#0x120
008aa11c	stp x29,x30,[sp, #0x100]
008aa120	stp x28,x19,[sp, #0x110]
008aa124	add x29,sp,#0x100
008aa128	stp x2,x3,[sp, #0x80]
008aa12c	add x9,sp,#0x80
008aa130	sub x10,x29,#0x28
008aa134	stp x4,x5,[sp, #0x90]
008aa138	sub x2,x29,#0x50
008aa13c	stp x6,x7,[sp, #0xa0]
008aa140	stp q0,q1,[sp]
008aa144	stp q2,q3,[sp, #0x20]
008aa148	stp q4,q5,[sp, #0x40]
008aa14c	stp q6,q7,[sp, #0x60]
008aa150	mrs x19,tpidr_el0
008aa154	ldr x8,[x19, #0x28]
008aa158	stur x8,[x29, #-0x8]
008aa15c	add x8,x9,#0x30
008aa160	add x9,x29,#0x20
008aa164	stp x9,x8,[x29, #-0x28]
008aa168	mov x8,#-0x30
008aa16c	mov x9,sp
008aa170	movk x8,#0xff80, LSL #32
008aa174	add x9,x9,#0x80
008aa178	stp x9,x8,[x29, #-0x18]
008aa17c	ldp q0,q1,[x10]
008aa180	stp q0,q1,[x29, #-0x50]
008aa184	bl 0x008a9f20
008aa188	ldr x8,[x19, #0x28]
008aa18c	ldur x9,[x29, #-0x8]
008aa190	cmp x8,x9
008aa194	b.ne 0x008aa1a8
008aa198	ldp x28,x19,[sp, #0x110]
008aa19c	ldp x29,x30,[sp, #0x100]
008aa1a0	add sp,sp,#0x120
008aa1a4	ret
008aa1a8	bl 0x00c2fec0
