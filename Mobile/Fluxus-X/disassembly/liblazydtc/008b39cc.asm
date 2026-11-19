; FUN_008b39cc @ 008b39cc
008b39cc	stp x29,x30,[sp, #-0x30]!
008b39d0	str x28,[sp, #0x10]
008b39d4	stp x20,x19,[sp, #0x20]
008b39d8	mov x29,sp
008b39dc	sub sp,sp,#0x300
008b39e0	stp x2,x3,[sp, #0x80]
008b39e4	add x10,sp,#0x80
008b39e8	mov x11,sp
008b39ec	stp x4,x5,[sp, #0x90]
008b39f0	mov x8,x1
008b39f4	mov x19,x0
008b39f8	stp x6,x7,[sp, #0xa0]
008b39fc	add x0,sp,#0xf8
008b3a00	add x3,sp,#0xd0
008b3a04	stp q0,q1,[sp]
008b3a08	mov w1,#0x200
008b3a0c	mov x2,x8
008b3a10	stp q2,q3,[sp, #0x20]
008b3a14	stp q4,q5,[sp, #0x40]
008b3a18	stp q6,q7,[sp, #0x60]
008b3a1c	mrs x20,tpidr_el0
008b3a20	ldr x9,[x20, #0x28]
008b3a24	stur x9,[x29, #-0x8]
008b3a28	add x9,x10,#0x30
008b3a2c	add x10,x29,#0x30
008b3a30	stp x10,x9,[sp, #0xb0]
008b3a34	mov x9,#-0x30
008b3a38	add x10,x11,#0x80
008b3a3c	movk x9,#0xff80, LSL #32
008b3a40	stp x10,x9,[sp, #0xc0]
008b3a44	ldp q0,q1,[sp, #0xb0]
008b3a48	stp q0,q1,[sp, #0xd0]
008b3a4c	bl 0x00c30740
008b3a50	mov x0,x19
008b3a54	mov w1,#0x1
008b3a58	bl 0x008aa60c
008b3a5c	add x1,sp,#0xf8
008b3a60	mov x0,x19
008b3a64	bl 0x008b3d00
008b3a68	ldr x8,[x20, #0x28]
008b3a6c	ldur x9,[x29, #-0x8]
008b3a70	cmp x8,x9
008b3a74	b.ne 0x008b3a84
008b3a78	mov x0,x19
008b3a7c	mov w1,#0x2
008b3a80	bl 0x008b3f9c
008b3a84	bl 0x00c2fec0
