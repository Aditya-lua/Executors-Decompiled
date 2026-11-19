; FUN_008659e8 @ 008659e8
008659e8	sub sp,sp,#0x130
008659ec	stp x29,x30,[sp, #0xf0]
008659f0	stp x28,x23,[sp, #0x100]
008659f4	stp x22,x21,[sp, #0x110]
008659f8	stp x20,x19,[sp, #0x120]
008659fc	add x29,sp,#0xf0
00865a00	stp x4,x5,[x29, #-0x70]
00865a04	sub x10,x29,#0x70
00865a08	sub x11,x29,#0x28
00865a0c	stp x6,x7,[x29, #-0x60]
00865a10	mov x8,x3
00865a14	mov x19,x2
00865a18	stp q0,q1,[sp]
00865a1c	sub x3,x29,#0x50
00865a20	mov x2,x8
00865a24	stp q2,q3,[sp, #0x20]
00865a28	mov x20,x1
00865a2c	mov x21,x0
00865a30	stp q4,q5,[sp, #0x40]
00865a34	stp q6,q7,[sp, #0x60]
00865a38	mrs x23,tpidr_el0
00865a3c	ldr x9,[x23, #0x28]
00865a40	stur x9,[x29, #-0x8]
00865a44	add x9,x10,#0x20
00865a48	add x10,x29,#0x40
00865a4c	stp x10,x9,[x29, #-0x28]
00865a50	mov x9,#-0x20
00865a54	mov x10,sp
00865a58	movk x9,#0xff80, LSL #32
00865a5c	add x10,x10,#0x80
00865a60	stp x10,x9,[x29, #-0x18]
00865a64	ldp q0,q1,[x11]
00865a68	stp q0,q1,[x29, #-0x50]
00865a6c	bl 0x0086e6b0
00865a70	ldp x9,x8,[x21, #0x1d0]
00865a74	mov w1,#0x38
00865a78	ldr x0,[x21, #0xe8]
00865a7c	mov w10,#0xffffffff
00865a80	sub x8,x8,x9
00865a84	mov w9,#0xaaab
00865a88	lsr x8,x8,#0x4
00865a8c	movk w9,#0xaaaa, LSL #16
00865a90	madd w22,w8,w9,w10
00865a94	bl 0x0084e938
00865a98	mov x1,x20
00865a9c	mov x2,x19
00865aa0	mov w3,w22
00865aa4	mov x21,x0
00865aa8	bl 0x0084f5e0
00865aac	ldr x8,[x23, #0x28]
00865ab0	ldur x9,[x29, #-0x8]
00865ab4	cmp x8,x9
00865ab8	b.ne 0x00865ad8
00865abc	mov x0,x21
00865ac0	ldp x20,x19,[sp, #0x120]
00865ac4	ldp x22,x21,[sp, #0x110]
00865ac8	ldp x28,x23,[sp, #0x100]
00865acc	ldp x29,x30,[sp, #0xf0]
00865ad0	add sp,sp,#0x130
00865ad4	ret
00865ad8	bl 0x00c2fec0
