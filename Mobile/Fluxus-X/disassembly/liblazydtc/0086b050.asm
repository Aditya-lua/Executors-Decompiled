; FUN_0086b050 @ 0086b050
0086b050	sub sp,sp,#0x140
0086b054	stp x29,x30,[sp, #0x100]
0086b058	str x28,[sp, #0x110]
0086b05c	stp x22,x21,[sp, #0x120]
0086b060	stp x20,x19,[sp, #0x130]
0086b064	add x29,sp,#0x100
0086b068	stp x4,x5,[sp, #0x80]
0086b06c	add x10,sp,#0x80
0086b070	sub x11,x29,#0x28
0086b074	stp x6,x7,[sp, #0x90]
0086b078	mov x8,x3
0086b07c	mov x19,x2
0086b080	stp q0,q1,[sp]
0086b084	sub x3,x29,#0x50
0086b088	mov x2,x8
0086b08c	stp q2,q3,[sp, #0x20]
0086b090	mov x20,x0
0086b094	stp q4,q5,[sp, #0x40]
0086b098	stp q6,q7,[sp, #0x60]
0086b09c	mrs x22,tpidr_el0
0086b0a0	ldr x9,[x22, #0x28]
0086b0a4	stur x9,[x29, #-0x8]
0086b0a8	add x9,x10,#0x20
0086b0ac	add x10,x29,#0x40
0086b0b0	stp x10,x9,[x29, #-0x28]
0086b0b4	mov x9,#-0x20
0086b0b8	mov x10,sp
0086b0bc	movk x9,#0xff80, LSL #32
0086b0c0	add x10,x10,#0x80
0086b0c4	stp x10,x9,[x29, #-0x18]
0086b0c8	ldp q0,q1,[x11]
0086b0cc	stp q0,q1,[x29, #-0x50]
0086b0d0	bl 0x0086e6b0
0086b0d4	ldp x9,x8,[x20, #0x1d0]
0086b0d8	mov w1,#0x38
0086b0dc	ldr x0,[x20, #0xe8]
0086b0e0	mov w10,#0xffffffff
0086b0e4	stp xzr,xzr,[x29, #-0x60]
0086b0e8	sub x8,x8,x9
0086b0ec	mov w9,#0xaaab
0086b0f0	lsr x8,x8,#0x4
0086b0f4	movk w9,#0xaaaa, LSL #16
0086b0f8	madd w21,w8,w9,w10
0086b0fc	bl 0x0084e938
0086b100	sub x2,x29,#0x60
0086b104	mov x1,x19
0086b108	mov w3,#0x1
0086b10c	mov w4,w21
0086b110	mov x20,x0
0086b114	bl 0x00851158
0086b118	ldr x8,[x22, #0x28]
0086b11c	ldur x9,[x29, #-0x8]
0086b120	cmp x8,x9
0086b124	b.ne 0x0086b144
0086b128	mov x0,x20
0086b12c	ldp x20,x19,[sp, #0x130]
0086b130	ldr x28,[sp, #0x110]
0086b134	ldp x22,x21,[sp, #0x120]
0086b138	ldp x29,x30,[sp, #0x100]
0086b13c	add sp,sp,#0x140
0086b140	ret
0086b144	bl 0x00c2fec0
