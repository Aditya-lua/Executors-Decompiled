; FUN_00800fb8 @ 00800fb8
00800fb8	sub sp,sp,#0x120
00800fbc	stp x29,x30,[sp, #0x100]
00800fc0	stp x28,x19,[sp, #0x110]
00800fc4	add x29,sp,#0x100
00800fc8	stp x3,x4,[x29, #-0x78]
00800fcc	sub x9,x29,#0x78
00800fd0	mov x10,sp
00800fd4	stp x5,x6,[x29, #-0x68]
00800fd8	add x10,x10,#0x80
00800fdc	sub x3,x29,#0x50
00800fe0	stur x7,[x29, #-0x58]
00800fe4	stp q0,q1,[sp]
00800fe8	stp q2,q3,[sp, #0x20]
00800fec	stp q4,q5,[sp, #0x40]
00800ff0	stp q6,q7,[sp, #0x60]
00800ff4	mrs x19,tpidr_el0
00800ff8	ldr x8,[x19, #0x28]
00800ffc	stur x8,[x29, #-0x8]
00801000	add x8,x9,#0x28
00801004	add x9,x29,#0x20
00801008	stp x9,x8,[x29, #-0x28]
0080100c	mov x8,#-0x28
00801010	sub x9,x29,#0x28
00801014	movk x8,#0xff80, LSL #32
00801018	stp x10,x8,[x29, #-0x18]
0080101c	ldr x8,[x0]
00801020	ldp q0,q1,[x9]
00801024	ldr x8,[x8, #0x130]
00801028	stp q0,q1,[x29, #-0x50]
0080102c	blr x8
00801030	ldr x8,[x19, #0x28]
00801034	ldur x9,[x29, #-0x8]
00801038	cmp x8,x9
0080103c	b.ne 0x00801050
00801040	ldp x28,x19,[sp, #0x110]
00801044	ldp x29,x30,[sp, #0x100]
00801048	add sp,sp,#0x120
0080104c	ret
00801050	bl 0x00c2fec0
