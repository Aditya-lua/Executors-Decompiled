; FUN_0085e984 @ 0085e984
0085e984	sub sp,sp,#0x140
0085e988	stp x29,x30,[sp, #0xf0]
0085e98c	str x28,[sp, #0x100]
0085e990	stp x24,x23,[sp, #0x110]
0085e994	stp x22,x21,[sp, #0x120]
0085e998	stp x20,x19,[sp, #0x130]
0085e99c	add x29,sp,#0xf0
0085e9a0	stp x5,x6,[x29, #-0x68]
0085e9a4	sub x9,x29,#0x68
0085e9a8	sub x10,x29,#0x28
0085e9ac	stur x7,[x29, #-0x58]
0085e9b0	mov x19,x3
0085e9b4	mov x20,x2
0085e9b8	stp q0,q1,[sp]
0085e9bc	sub x3,x29,#0x50
0085e9c0	mov x2,x4
0085e9c4	stp q2,q3,[sp, #0x20]
0085e9c8	mov x21,x1
0085e9cc	mov x22,x0
0085e9d0	stp q4,q5,[sp, #0x40]
0085e9d4	stp q6,q7,[sp, #0x60]
0085e9d8	mrs x24,tpidr_el0
0085e9dc	ldr x8,[x24, #0x28]
0085e9e0	stur x8,[x29, #-0x8]
0085e9e4	add x8,x9,#0x18
0085e9e8	add x9,x29,#0x50
0085e9ec	stp x9,x8,[x29, #-0x28]
0085e9f0	mov x8,#-0x18
0085e9f4	mov x9,sp
0085e9f8	movk x8,#0xff80, LSL #32
0085e9fc	add x9,x9,#0x80
0085ea00	stp x9,x8,[x29, #-0x18]
0085ea04	ldp q0,q1,[x10]
0085ea08	stp q0,q1,[x29, #-0x50]
0085ea0c	bl 0x0086e6b0
0085ea10	ldp x9,x8,[x22, #0x1d0]
0085ea14	mov w1,#0x48
0085ea18	ldr x0,[x22, #0xe8]
0085ea1c	mov w10,#0xffffffff
0085ea20	sub x8,x8,x9
0085ea24	mov w9,#0xaaab
0085ea28	lsr x8,x8,#0x4
0085ea2c	movk w9,#0xaaaa, LSL #16
0085ea30	madd w23,w8,w9,w10
0085ea34	bl 0x0084e938
0085ea38	mov x1,x21
0085ea3c	mov x2,x20
0085ea40	mov x3,x19
0085ea44	mov w4,w23
0085ea48	mov x22,x0
0085ea4c	bl 0x00850a5c
0085ea50	ldr x8,[x24, #0x28]
0085ea54	ldur x9,[x29, #-0x8]
0085ea58	cmp x8,x9
0085ea5c	b.ne 0x0085ea80
0085ea60	mov x0,x22
0085ea64	ldp x20,x19,[sp, #0x130]
0085ea68	ldr x28,[sp, #0x100]
0085ea6c	ldp x22,x21,[sp, #0x120]
0085ea70	ldp x24,x23,[sp, #0x110]
0085ea74	ldp x29,x30,[sp, #0xf0]
0085ea78	add sp,sp,#0x140
0085ea7c	ret
0085ea80	bl 0x00c2fec0
