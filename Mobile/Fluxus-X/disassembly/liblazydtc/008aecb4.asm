; FUN_008aecb4 @ 008aecb4
008aecb4	sub sp,sp,#0x140
008aecb8	stp x29,x30,[sp, #0x100]
008aecbc	str x28,[sp, #0x110]
008aecc0	stp x22,x21,[sp, #0x120]
008aecc4	stp x20,x19,[sp, #0x130]
008aecc8	add x29,sp,#0x100
008aeccc	stp x2,x3,[sp, #0x80]
008aecd0	mov x9,sp
008aecd4	add x10,sp,#0x80
008aecd8	stp x4,x5,[sp, #0x90]
008aecdc	add x9,x9,#0x80
008aece0	mov x20,x1
008aece4	stp x6,x7,[sp, #0xa0]
008aece8	mov w1,#0x1
008aecec	mov x19,x0
008aecf0	stp q0,q1,[sp]
008aecf4	sub x22,x29,#0x28
008aecf8	stp q2,q3,[sp, #0x20]
008aecfc	stp q4,q5,[sp, #0x40]
008aed00	stp q6,q7,[sp, #0x60]
008aed04	mrs x21,tpidr_el0
008aed08	ldr x8,[x21, #0x28]
008aed0c	stur x8,[x29, #-0x8]
008aed10	mov x8,#-0x30
008aed14	movk x8,#0xff80, LSL #32
008aed18	stp x9,x8,[x29, #-0x18]
008aed1c	add x8,x10,#0x30
008aed20	add x9,x29,#0x40
008aed24	stp x9,x8,[x29, #-0x28]
008aed28	bl 0x008aee78
008aed2c	ldp q0,q1,[x22]
008aed30	sub x2,x29,#0x50
008aed34	mov x0,x19
008aed38	mov x1,x20
008aed3c	stp q0,q1,[x29, #-0x50]
008aed40	bl 0x008ac5e4
008aed44	mov x0,x19
008aed48	mov w1,#0x2
008aed4c	bl 0x008ae364
008aed50	ldr x8,[x21, #0x28]
008aed54	ldur x9,[x29, #-0x8]
008aed58	cmp x8,x9
008aed5c	b.ne 0x008aed68
008aed60	mov x0,x19
008aed64	bl 0x008aa5f4
008aed68	bl 0x00c2fec0
