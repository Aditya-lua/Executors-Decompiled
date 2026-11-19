; FUN_00bd405c @ 00bd405c
00bd405c	paciasp
00bd4060	sub sp,sp,#0x30
00bd4064	stp x29,x30,[sp, #0x10]
00bd4068	stp x20,x19,[sp, #0x20]
00bd406c	add x29,sp,#0x10
00bd4070	mov x19,x0
00bd4074	mov x20,x1
00bd4078	add x0,sp,#0x8
00bd407c	mov x1,x19
00bd4080	mov w2,wzr
00bd4084	stur wzr,[x29, #-0x4]
00bd4088	bl 0x00c44060
00bd408c	ldrb w8,[sp, #0x8]
00bd4090	cmp w8,#0x1
00bd4094	b.ne 0x00bd4108
00bd4098	ldr x8,[x19]
00bd409c	ldur x9,[x8, #-0x18]
00bd40a0	mov x8,sp
00bd40a4	add x0,x19,x9
00bd40a8	bl 0x00c30070
00bd40ac	adrp x1,0xcb5000
00bd40b0	mov x0,sp
00bd40b4	ldr x1,[x1, #0xba0]
00bd40b8	bl 0x00c30080
00bd40bc	ldr x8,[x19]
00bd40c0	ldr x9,[x0]
00bd40c4	ldur x8,[x8, #-0x18]
00bd40c8	add x3,x19,x8
00bd40cc	ldr x8,[x9, #0x58]
00bd40d0	ldr x1,[x3, #0x28]
00bd40d4	sub x4,x29,#0x4
00bd40d8	mov x2,xzr
00bd40dc	mov x5,x20
00bd40e0	blr x8
00bd40e4	mov x0,sp
00bd40e8	bl 0x00c30090
00bd40ec	ldr x8,[x19]
00bd40f0	ldur x8,[x8, #-0x18]
00bd40f4	add x0,x19,x8
00bd40f8	ldur w8,[x29, #-0x4]
00bd40fc	ldr w9,[x0, #0x20]
00bd4100	orr w1,w9,w8
00bd4104	bl 0x00c30130
00bd4108	mov x0,x19
00bd410c	ldp x20,x19,[sp, #0x20]
00bd4110	ldp x29,x30,[sp, #0x10]
00bd4114	add sp,sp,#0x30
00bd4118	autiasp
00bd411c	ret
