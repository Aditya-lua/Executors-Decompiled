; ossl_d2i_DSA_PUBKEY @ 00b1d9d8
00b1d9d8	sub sp,sp,#0x50
00b1d9dc	stp x22,x21,[sp, #0x20]
00b1d9e0	stp x20,x19,[sp, #0x30]
00b1d9e4	stp x29,x30,[sp, #0x40]
00b1d9e8	ldr x8,[x1]
00b1d9ec	mov x20,x1
00b1d9f0	mov x19,x0
00b1d9f4	add x1,sp,#0x18
00b1d9f8	mov w5,#0x1
00b1d9fc	mov x0,xzr
00b1da00	mov x3,xzr
00b1da04	mov x4,xzr
00b1da08	add x29,sp,#0x40
00b1da0c	str x8,[sp, #0x18]
00b1da10	bl 0x00b1d214
00b1da14	cbz x0,0x00b1da80
00b1da18	mov x22,x0
00b1da1c	bl 0x00c3d940
00b1da20	mov x21,x0
00b1da24	mov x0,x22
00b1da28	bl 0x00c32450
00b1da2c	cbz x21,0x00b1da80
00b1da30	ldr x22,[sp, #0x18]
00b1da34	add x1,sp,#0x18
00b1da38	add x2,sp,#0x10
00b1da3c	add x3,sp,#0x8
00b1da40	mov x0,x21
00b1da44	bl 0x00c3a2c0
00b1da48	ldr x8,[sp, #0x18]
00b1da4c	cbz x8,0x00b1da78
00b1da50	ldr x8,[sp, #0x10]
00b1da54	cbz x8,0x00b1da78
00b1da58	ldr x8,[sp, #0x8]
00b1da5c	cbz x8,0x00b1da78
00b1da60	str x22,[x20]
00b1da64	cbz x19,0x00b1da84
00b1da68	ldr x0,[x19]
00b1da6c	bl 0x00c3a0a0
00b1da70	str x21,[x19]
00b1da74	b 0x00b1da84
00b1da78	mov x0,x21
00b1da7c	bl 0x00c3a0a0
00b1da80	mov x21,xzr
00b1da84	mov x0,x21
00b1da88	ldp x29,x30,[sp, #0x40]
00b1da8c	ldp x20,x19,[sp, #0x30]
00b1da90	ldp x22,x21,[sp, #0x20]
00b1da94	add sp,sp,#0x50
00b1da98	ret
