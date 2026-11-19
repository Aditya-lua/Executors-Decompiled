; FUN_0084be60 @ 0084be60
0084be60	stp x29,x30,[sp, #-0x20]!
0084be64	stp x20,x19,[sp, #0x10]
0084be68	mov x29,sp
0084be6c	ldp x9,x8,[x0, #0x20]
0084be70	mov x10,#0xc30d
0084be74	movk x10,#0xc30, LSL #16
0084be78	mov w11,#0x60
0084be7c	mov x19,x0
0084be80	movk x10,#0x30c3, LSL #32
0084be84	add x8,x8,x9
0084be88	movk x10,#0xc30c, LSL #48
0084be8c	sub x8,x8,#0x1
0084be90	lsr x9,x8,#0x1
0084be94	umulh x9,x9,x10
0084be98	mov w10,#0x2a
0084be9c	lsr x9,x9,#0x4
0084bea0	msub x8,x9,x10,x8
0084bea4	ldr x10,[x0, #0x8]
0084bea8	ldr x9,[x10, x9, LSL #0x3]
0084beac	nop
0084beb0	madd x20,x8,x11,x9
0084beb4	ldr x0,[x20, #0x38]
0084beb8	cbz x0,0x0084becc
0084bebc	ldr x8,[x20, #0x48]
0084bec0	str x0,[x20, #0x40]
0084bec4	sub x1,x8,x0
0084bec8	bl 0x00c2fe80
0084becc	ldr x0,[x20, #0x20]
0084bed0	cbz x0,0x0084bee4
0084bed4	ldr x8,[x20, #0x30]
0084bed8	str x0,[x20, #0x28]
0084bedc	sub x1,x8,x0
0084bee0	bl 0x00c2fe80
0084bee4	ldp x9,x8,[x19, #0x8]
0084bee8	mov w11,#0x2a
0084beec	mov x12,#-0x1
0084bef0	subs x10,x8,x9
0084bef4	asr x10,x10,#0x3
0084bef8	cmp x8,x9
0084befc	madd x10,x10,x11,x12
0084bf00	ldp x12,x11,[x19, #0x20]
0084bf04	csel x9,xzr,x10,eq
0084bf08	add x10,x11,x12
0084bf0c	sub x9,x9,x10
0084bf10	sub x10,x11,#0x1
0084bf14	add x9,x9,#0x1
0084bf18	str x10,[x19, #0x28]
0084bf1c	cmp x9,#0x54
0084bf20	b.cc 0x0084bf3c
0084bf24	ldur x0,[x8, #-0x8]
0084bf28	mov w1,#0xfc0
0084bf2c	bl 0x00c2fe80
0084bf30	ldr x8,[x19, #0x10]
0084bf34	sub x8,x8,#0x8
0084bf38	str x8,[x19, #0x10]
0084bf3c	ldp x20,x19,[sp, #0x10]
0084bf40	ldp x29,x30,[sp], #0x20
0084bf44	ret
