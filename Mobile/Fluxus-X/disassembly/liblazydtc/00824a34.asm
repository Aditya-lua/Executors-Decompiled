; FUN_00824a34 @ 00824a34
00824a34	stp x29,x30,[sp, #-0x50]!
00824a38	str x28,[sp, #0x10]
00824a3c	stp x24,x23,[sp, #0x20]
00824a40	stp x22,x21,[sp, #0x30]
00824a44	stp x20,x19,[sp, #0x40]
00824a48	mov x29,sp
00824a4c	sub sp,sp,#0x2c0
00824a50	mrs x24,tpidr_el0
00824a54	mov x19,x8
00824a58	mov x23,x0
00824a5c	ldr x8,[x24, #0x28]
00824a60	mov x0,sp
00824a64	mov x20,x3
00824a68	mov x21,x2
00824a6c	mov x22,x1
00824a70	stur x8,[x29, #-0x8]
00824a74	bl 0x00c304b0
00824a78	mov x0,sp
00824a7c	mov x1,x23
00824a80	bl 0x00c304c0
00824a84	mov x0,sp
00824a88	mov x1,x22
00824a8c	bl 0x00c30500
00824a90	mov x0,sp
00824a94	mov x1,x21
00824a98	bl 0x00c304d0
00824a9c	mov x0,sp
00824aa0	mov x1,x20
00824aa4	bl 0x00c304e0
00824aa8	mov x0,sp
00824aac	mov x8,x19
00824ab0	bl 0x00c30520
00824ab4	mov x0,sp
00824ab8	bl 0x00826308
00824abc	ldr x8,[x24, #0x28]
00824ac0	ldur x9,[x29, #-0x8]
00824ac4	cmp x8,x9
00824ac8	b.ne 0x00824b0c
00824acc	add sp,sp,#0x2c0
00824ad0	ldp x20,x19,[sp, #0x40]
00824ad4	ldr x28,[sp, #0x10]
00824ad8	ldp x22,x21,[sp, #0x30]
00824adc	ldp x24,x23,[sp, #0x20]
00824ae0	ldp x29,x30,[sp], #0x50
00824ae4	ret
00824b0c	bl 0x00c2fec0
