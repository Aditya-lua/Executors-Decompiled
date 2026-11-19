; FUN_00956a58 @ 00956a58
00956a58	sub sp,sp,#0x160
00956a5c	str x28,[sp, #0x110]
00956a60	stp x24,x23,[sp, #0x120]
00956a64	stp x22,x21,[sp, #0x130]
00956a68	stp x20,x19,[sp, #0x140]
00956a6c	stp x29,x30,[sp, #0x150]
00956a70	add x29,sp,#0x150
00956a74	stp q6,q7,[sp, #0x70]
00956a78	stp q4,q5,[sp, #0x50]
00956a7c	stp q2,q3,[sp, #0x30]
00956a80	stp q0,q1,[sp, #0x10]
00956a84	stp x6,x7,[sp, #0xb0]
00956a88	stp x4,x5,[sp, #0xa0]
00956a8c	stp x2,x3,[sp, #0x90]
00956a90	mrs x23,tpidr_el0
00956a94	ldr x8,[x23, #0x28]
00956a98	mov x9,#0x4ec5
00956a9c	movk x9,#0xc4ec, LSL #16
00956aa0	movk x9,#0xec4e, LSL #32
00956aa4	str x8,[sp, #0x8]
00956aa8	ldr x24,[x0, #0x20]
00956aac	movk x9,#0x4ec4, LSL #48
00956ab0	mov x19,x0
00956ab4	mov x21,x1
00956ab8	ldr x8,[x24, #0x28]
00956abc	add x22,x24,#0x51c
00956ac0	smulh x9,x8,x9
00956ac4	asr x10,x9,#0x3
00956ac8	add x9,x10,x9, LSR #0x3f
00956acc	mov w10,#0x1a
00956ad0	msub x0,x9,x10,x8
00956ad4	bl 0x00963a68
00956ad8	ldrb w8,[x24, #0x522]
00956adc	adrp x2,0x2b9000
00956ae0	add w3,w0,#0x41
00956ae4	add x2,x2,#0x4b7
00956ae8	add w8,w8,#0x1
00956aec	and w4,w8,#0xff
00956af0	mov w1,#0x5
00956af4	mov x0,x22
00956af8	strb w8,[x24, #0x522]
00956afc	bl 0x00c31b70
00956b00	add x20,x24,#0x4e8
00956b04	mov x0,x20
00956b08	bl 0x0090456c
00956b0c	adrp x1,0x2d7000
00956b10	add x1,x1,#0x4c9
00956b14	mov x0,x20
00956b18	mov x2,x22
00956b1c	mov x3,x21
00956b20	bl 0x009048cc
00956b24	cbnz w0,0x00956b7c
00956b28	orr x8,xzr,#-0x7f00000080
00956b2c	movk x8,#0xffd0
00956b30	add x9,x29,#0x10
00956b34	add x10,sp,#0x10
00956b38	add x11,sp,#0x90
00956b3c	stur x8,[x29, #-0x50]
00956b40	stur x9,[x29, #-0x68]
00956b44	add x8,x10,#0x80
00956b48	add x9,x11,#0x30
00956b4c	mov x0,x20
00956b50	sub x22,x29,#0x68
00956b54	add x21,x24,#0x428
00956b58	stp x9,x8,[x29, #-0x60]
00956b5c	bl 0x00904974
00956b60	ldp q0,q1,[x22]
00956b64	mov x2,x0
00956b68	sub x3,x29,#0x90
00956b6c	mov x0,x19
00956b70	mov x1,x21
00956b74	stp q0,q1,[x29, #-0x90]
00956b78	bl 0x00945294
00956b7c	ldr x8,[x23, #0x28]
00956b80	ldr x9,[sp, #0x8]
00956b84	cmp x8,x9
00956b88	b.ne 0x00956ba8
00956b8c	ldp x29,x30,[sp, #0x150]
00956b90	ldp x20,x19,[sp, #0x140]
00956b94	ldp x22,x21,[sp, #0x130]
00956b98	ldp x24,x23,[sp, #0x120]
00956b9c	ldr x28,[sp, #0x110]
00956ba0	add sp,sp,#0x160
00956ba4	ret
00956ba8	bl 0x00c2fec0
