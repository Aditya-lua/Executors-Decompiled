; FUN_00915d74 @ 00915d74
00915d74	sub sp,sp,#0x120
00915d78	stp x28,x23,[sp, #0xe0]
00915d7c	stp x22,x21,[sp, #0xf0]
00915d80	stp x20,x19,[sp, #0x100]
00915d84	stp x29,x30,[sp, #0x110]
00915d88	add x29,sp,#0x110
00915d8c	stp q6,q7,[sp, #0x60]
00915d90	stp q4,q5,[sp, #0x40]
00915d94	stp q2,q3,[sp, #0x20]
00915d98	stp q0,q1,[sp]
00915d9c	stp x6,x7,[sp, #0xa8]
00915da0	stp x4,x5,[sp, #0x98]
00915da4	stp x2,x3,[sp, #0x88]
00915da8	mrs x21,tpidr_el0
00915dac	ldr x8,[x21, #0x28]
00915db0	mov w20,w1
00915db4	mov x19,x0
00915db8	stur x8,[x29, #-0x38]
00915dbc	cbz x0,0x00915e70
00915dc0	orr x8,xzr,#-0x7f00000080
00915dc4	movk x8,#0xffd0
00915dc8	add x9,x29,#0x10
00915dcc	mov x10,sp
00915dd0	add x11,sp,#0x88
00915dd4	and w12,w20,#0xf00000
00915dd8	stur x8,[x29, #-0x40]
00915ddc	stur x9,[x29, #-0x58]
00915de0	add x8,x10,#0x80
00915de4	add x9,x11,#0x30
00915de8	sub w10,w12,#0x100, LSL #12
00915dec	stp x9,x8,[x29, #-0x50]
00915df0	lsr w8,w10,#0x14
00915df4	cmp w8,#0x5
00915df8	b.hi 0x00916108
00915dfc	adrp x9,0x746000
00915e00	add x9,x9,#0x580
00915e04	ldrsw x8,[x9, x8, LSL #0x2]
00915e08	add x8,x8,x9
00915e0c	br x8
00915e70	mov w0,#0x2b
00915e74	b 0x009164bc
00916108	orr w0,wzr,#0x30
0091610c	b 0x009164bc
009164bc	ldr x8,[x21, #0x28]
009164c0	ldur x9,[x29, #-0x38]
009164c4	cmp x8,x9
009164c8	b.ne 0x009164e4
009164cc	ldp x29,x30,[sp, #0x110]
009164d0	ldp x20,x19,[sp, #0x100]
009164d4	ldp x22,x21,[sp, #0xf0]
009164d8	ldp x28,x23,[sp, #0xe0]
009164dc	add sp,sp,#0x120
009164e0	ret
009164e4	bl 0x00c2fec0
