; FUN_007ffe68 @ 007ffe68
007ffe68	sub sp,sp,#0x120
007ffe6c	stp x29,x30,[sp, #0x100]
007ffe70	stp x28,x19,[sp, #0x110]
007ffe74	add x29,sp,#0x100
007ffe78	stp x3,x4,[x29, #-0x78]
007ffe7c	sub x9,x29,#0x78
007ffe80	mov x10,sp
007ffe84	stp x5,x6,[x29, #-0x68]
007ffe88	add x10,x10,#0x80
007ffe8c	sub x3,x29,#0x50
007ffe90	stur x7,[x29, #-0x58]
007ffe94	stp q0,q1,[sp]
007ffe98	stp q2,q3,[sp, #0x20]
007ffe9c	stp q4,q5,[sp, #0x40]
007ffea0	stp q6,q7,[sp, #0x60]
007ffea4	mrs x19,tpidr_el0
007ffea8	ldr x8,[x19, #0x28]
007ffeac	stur x8,[x29, #-0x8]
007ffeb0	add x8,x9,#0x28
007ffeb4	add x9,x29,#0x20
007ffeb8	stp x9,x8,[x29, #-0x28]
007ffebc	mov x8,#-0x28
007ffec0	sub x9,x29,#0x28
007ffec4	movk x8,#0xff80, LSL #32
007ffec8	stp x10,x8,[x29, #-0x18]
007ffecc	ldr x8,[x0]
007ffed0	ldp q0,q1,[x9]
007ffed4	ldr x8,[x8, #0x118]
007ffed8	stp q0,q1,[x29, #-0x50]
007ffedc	blr x8
007ffee0	ldr x8,[x19, #0x28]
007ffee4	ldur x9,[x29, #-0x8]
007ffee8	cmp x8,x9
007ffeec	b.ne 0x007fff00
007ffef0	ldp x28,x19,[sp, #0x110]
007ffef4	ldp x29,x30,[sp, #0x100]
007ffef8	add sp,sp,#0x120
007ffefc	ret
007fff00	bl 0x00c2fec0
