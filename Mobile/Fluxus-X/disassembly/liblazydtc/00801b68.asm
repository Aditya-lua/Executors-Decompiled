; FUN_00801b68 @ 00801b68
00801b68	sub sp,sp,#0x120
00801b6c	stp x29,x30,[sp, #0x100]
00801b70	stp x28,x19,[sp, #0x110]
00801b74	add x29,sp,#0x100
00801b78	stp x3,x4,[x29, #-0x78]
00801b7c	sub x9,x29,#0x78
00801b80	mov x10,sp
00801b84	stp x5,x6,[x29, #-0x68]
00801b88	add x10,x10,#0x80
00801b8c	sub x3,x29,#0x50
00801b90	stur x7,[x29, #-0x58]
00801b94	stp q0,q1,[sp]
00801b98	stp q2,q3,[sp, #0x20]
00801b9c	stp q4,q5,[sp, #0x40]
00801ba0	stp q6,q7,[sp, #0x60]
00801ba4	mrs x19,tpidr_el0
00801ba8	ldr x8,[x19, #0x28]
00801bac	stur x8,[x29, #-0x8]
00801bb0	add x8,x9,#0x28
00801bb4	add x9,x29,#0x20
00801bb8	stp x9,x8,[x29, #-0x28]
00801bbc	mov x8,#-0x28
00801bc0	sub x9,x29,#0x28
00801bc4	movk x8,#0xff80, LSL #32
00801bc8	stp x10,x8,[x29, #-0x18]
00801bcc	ldr x8,[x0]
00801bd0	ldp q0,q1,[x9]
00801bd4	ldr x8,[x8, #0x1f0]
00801bd8	stp q0,q1,[x29, #-0x50]
00801bdc	blr x8
00801be0	ldr x8,[x19, #0x28]
00801be4	ldur x9,[x29, #-0x8]
00801be8	cmp x8,x9
00801bec	b.ne 0x00801c00
00801bf0	ldp x28,x19,[sp, #0x110]
00801bf4	ldp x29,x30,[sp, #0x100]
00801bf8	add sp,sp,#0x120
00801bfc	ret
00801c00	bl 0x00c2fec0
