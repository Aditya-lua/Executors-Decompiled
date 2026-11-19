; FUN_0087fcd8 @ 0087fcd8
0087fcd8	sub sp,sp,#0x160
0087fcdc	stp x29,x30,[sp, #0x130]
0087fce0	stp x28,x21,[sp, #0x140]
0087fce4	stp x20,x19,[sp, #0x150]
0087fce8	add x29,sp,#0x130
0087fcec	stp x2,x3,[sp, #0x80]
0087fcf0	add x10,sp,#0x80
0087fcf4	mov x11,sp
0087fcf8	stp x4,x5,[sp, #0x90]
0087fcfc	add x11,x11,#0x80
0087fd00	mov x9,x1
0087fd04	stp x6,x7,[sp, #0xa0]
0087fd08	mov x19,x0
0087fd0c	sub x1,x29,#0x60
0087fd10	stp q0,q1,[sp]
0087fd14	mov x0,x9
0087fd18	stp q2,q3,[sp, #0x20]
0087fd1c	stp q4,q5,[sp, #0x40]
0087fd20	stp q6,q7,[sp, #0x60]
0087fd24	mrs x21,tpidr_el0
0087fd28	ldr x8,[x21, #0x28]
0087fd2c	stur x8,[x29, #-0x8]
0087fd30	add x8,x10,#0x30
0087fd34	add x10,x29,#0x30
0087fd38	stp x10,x8,[x29, #-0x28]
0087fd3c	mov x8,#-0x30
0087fd40	sub x10,x29,#0x28
0087fd44	movk x8,#0xff80, LSL #32
0087fd48	stp x11,x8,[x29, #-0x18]
0087fd4c	sub x8,x29,#0x40
0087fd50	ldp q0,q1,[x10]
0087fd54	stp q0,q1,[x29, #-0x60]
0087fd58	bl 0x008aa1ac
0087fd5c	mov w0,#0x30
0087fd60	bl 0x00c30000
0087fd64	ldurb w8,[x29, #-0x40]
0087fd68	mov x20,x0
0087fd6c	tbnz w8,#0x0,0x0087fd84
0087fd70	ldur q0,[x29, #-0x40]
0087fd74	ldur x8,[x29, #-0x30]
0087fd78	stur q0,[x29, #-0x80]
0087fd7c	stur x8,[x29, #-0x70]
0087fd80	b 0x0087fd90
0087fd84	ldp x2,x1,[x29, #-0x38]
0087fd88	sub x0,x29,#0x80
0087fd8c	bl 0x007ff40c
0087fd90	adrp x8,0xc4a000
0087fd94	add x8,x8,#0x9b8
0087fd98	str x8,[x20]
0087fd9c	ldr q0,[x19]
0087fda0	stur q0,[x20, #0x8]
0087fda4	ldur q0,[x29, #-0x80]
0087fda8	ldur x8,[x29, #-0x70]
0087fdac	stp xzr,xzr,[x29, #-0x78]
0087fdb0	stur xzr,[x29, #-0x80]
0087fdb4	stur q0,[x20, #0x18]
0087fdb8	str x8,[x20, #0x28]
0087fdbc	ldr x8,[x21, #0x28]
0087fdc0	ldur x9,[x29, #-0x8]
0087fdc4	cmp x8,x9
0087fdc8	b.ne 0x0087fe40
0087fdcc	adrp x1,0xc4a000
0087fdd0	add x1,x1,#0x9d0
0087fdd4	nop
0087fdd8	adr x2,0x87fc28
0087fddc	mov x0,x20
0087fde0	bl 0x00c30020
0087fe40	bl 0x00c2fec0
