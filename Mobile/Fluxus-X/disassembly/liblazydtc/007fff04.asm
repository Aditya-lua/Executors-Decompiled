; FUN_007fff04 @ 007fff04
007fff04	sub sp,sp,#0x120
007fff08	stp x29,x30,[sp, #0x100]
007fff0c	stp x28,x19,[sp, #0x110]
007fff10	add x29,sp,#0x100
007fff14	stp x3,x4,[x29, #-0x78]
007fff18	sub x9,x29,#0x78
007fff1c	mov x10,sp
007fff20	stp x5,x6,[x29, #-0x68]
007fff24	add x10,x10,#0x80
007fff28	sub x3,x29,#0x50
007fff2c	stur x7,[x29, #-0x58]
007fff30	stp q0,q1,[sp]
007fff34	stp q2,q3,[sp, #0x20]
007fff38	stp q4,q5,[sp, #0x40]
007fff3c	stp q6,q7,[sp, #0x60]
007fff40	mrs x19,tpidr_el0
007fff44	ldr x8,[x19, #0x28]
007fff48	stur x8,[x29, #-0x8]
007fff4c	add x8,x9,#0x28
007fff50	add x9,x29,#0x20
007fff54	stp x9,x8,[x29, #-0x28]
007fff58	mov x8,#-0x28
007fff5c	sub x9,x29,#0x28
007fff60	movk x8,#0xff80, LSL #32
007fff64	stp x10,x8,[x29, #-0x18]
007fff68	ldr x8,[x0]
007fff6c	ldp q0,q1,[x9]
007fff70	ldr x8,[x8, #0x398]
007fff74	stp q0,q1,[x29, #-0x50]
007fff78	blr x8
007fff7c	ldr x8,[x19, #0x28]
007fff80	ldur x9,[x29, #-0x8]
007fff84	cmp x8,x9
007fff88	b.ne 0x007fff9c
007fff8c	ldp x28,x19,[sp, #0x110]
007fff90	ldp x29,x30,[sp, #0x100]
007fff94	add sp,sp,#0x120
007fff98	ret
007fff9c	bl 0x00c2fec0
