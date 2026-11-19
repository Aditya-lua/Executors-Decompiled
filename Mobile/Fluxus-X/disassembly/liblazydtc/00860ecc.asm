; FUN_00860ecc @ 00860ecc
00860ecc	sub sp,sp,#0x120
00860ed0	stp x29,x30,[sp, #0x100]
00860ed4	stp x28,x19,[sp, #0x110]
00860ed8	add x29,sp,#0x100
00860edc	stp x3,x4,[x29, #-0x78]
00860ee0	sub x9,x29,#0x78
00860ee4	sub x10,x29,#0x28
00860ee8	stp x5,x6,[x29, #-0x68]
00860eec	sub x3,x29,#0x50
00860ef0	stur x7,[x29, #-0x58]
00860ef4	stp q0,q1,[sp]
00860ef8	stp q2,q3,[sp, #0x20]
00860efc	stp q4,q5,[sp, #0x40]
00860f00	stp q6,q7,[sp, #0x60]
00860f04	mrs x19,tpidr_el0
00860f08	ldr x8,[x19, #0x28]
00860f0c	stur x8,[x29, #-0x8]
00860f10	add x8,x9,#0x28
00860f14	add x9,x29,#0x20
00860f18	stp x9,x8,[x29, #-0x28]
00860f1c	mov x8,#-0x28
00860f20	mov x9,sp
00860f24	movk x8,#0xff80, LSL #32
00860f28	add x9,x9,#0x80
00860f2c	stp x9,x8,[x29, #-0x18]
00860f30	ldp q0,q1,[x10]
00860f34	stp q0,q1,[x29, #-0x50]
00860f38	bl 0x0086e6b0
00860f3c	ldr x8,[x19, #0x28]
00860f40	ldur x9,[x29, #-0x8]
00860f44	cmp x8,x9
00860f48	b.ne 0x00860f5c
00860f4c	ldp x28,x19,[sp, #0x110]
00860f50	ldp x29,x30,[sp, #0x100]
00860f54	add sp,sp,#0x120
00860f58	ret
00860f5c	bl 0x00c2fec0
