; FUN_00a8e958 @ 00a8e958
00a8e958	sub sp,sp,#0x90
00a8e95c	stp x28,x27,[sp, #0x30]
00a8e960	stp x26,x25,[sp, #0x40]
00a8e964	stp x24,x23,[sp, #0x50]
00a8e968	stp x22,x21,[sp, #0x60]
00a8e96c	stp x20,x19,[sp, #0x70]
00a8e970	stp x29,x30,[sp, #0x80]
00a8e974	add x29,sp,#0x80
00a8e978	mov x22,x3
00a8e97c	mov x20,x2
00a8e980	mov x23,x1
00a8e984	mov x19,x0
00a8e988	bl 0x00c3cea0
00a8e98c	mov x21,x0
00a8e990	mov w1,#0x2000
00a8e994	mov x0,x19
00a8e998	bl 0x00c3cce0
00a8e99c	cbz w0,0x00a8e9e4
00a8e9a0	mov x0,x19
00a8e9a4	bl 0x00c3ceb0
00a8e9a8	str w0,[sp, #0x2c]
00a8e9ac	mov x0,x19
00a8e9b0	add x24,x19,#0x28
00a8e9b4	bl 0x00c3cec0
00a8e9b8	ldr x7,[x21, #0x118]
00a8e9bc	mov w6,w0
00a8e9c0	add x5,sp,#0x2c
00a8e9c4	mov x0,x20
00a8e9c8	mov x1,x23
00a8e9cc	mov x2,x22
00a8e9d0	mov x3,x21
00a8e9d4	mov x4,x24
00a8e9d8	bl 0x00c3e2e0
00a8e9dc	ldr w1,[sp, #0x2c]
00a8e9e0	b 0x00a8ead4
00a8e9e4	lsr x8,x22,#0x3c
00a8e9e8	cbz x8,0x00a8ea88
00a8e9ec	orr x28,xzr,#-0x1000000000000000
00a8e9f0	add x8,x22,x28
00a8e9f4	str x8,[sp, #0x10]
00a8e9f8	and x8,x8,#-0x1000000000000000
00a8e9fc	orr x24,xzr,#0x1000000000000000
00a8ea00	add x27,x8,x24
00a8ea04	add x25,x19,#0x28
00a8ea08	str x8,[sp, #0x8]
00a8ea0c	add x8,x23,x27
00a8ea10	mov x26,x20
00a8ea14	str x8,[sp, #0x18]
00a8ea18	mov x0,x19
00a8ea1c	bl 0x00c3ceb0
00a8ea20	str w0,[sp, #0x28]
00a8ea24	mov x0,x19
00a8ea28	bl 0x00c3cec0
00a8ea2c	ldr x7,[x21, #0x118]
00a8ea30	mov w6,w0
00a8ea34	orr x2,xzr,#-0x8000000000000000
00a8ea38	add x5,sp,#0x28
00a8ea3c	mov x0,x26
00a8ea40	mov x1,x23
00a8ea44	mov x3,x21
00a8ea48	mov x4,x25
00a8ea4c	bl 0x00c3e2e0
00a8ea50	ldr w1,[sp, #0x28]
00a8ea54	mov x0,x19
00a8ea58	bl 0x00c3ced0
00a8ea5c	add x22,x22,x28
00a8ea60	add x23,x23,x24
00a8ea64	lsr x8,x22,#0x3c
00a8ea68	add x26,x26,x24
00a8ea6c	cbnz x8,0x00a8ea18
00a8ea70	ldp x9,x8,[sp, #0x8]
00a8ea74	ldr x24,[sp, #0x18]
00a8ea78	add x20,x20,x27
00a8ea7c	sub x22,x8,x9
00a8ea80	cbnz x22,0x00a8ea90
00a8ea84	b 0x00a8eadc
00a8ea88	mov x24,x23
00a8ea8c	cbz x22,0x00a8eadc
00a8ea90	mov x0,x19
00a8ea94	bl 0x00c3ceb0
00a8ea98	str w0,[sp, #0x24]
00a8ea9c	mov x0,x19
00a8eaa0	lsl x22,x22,#0x3
00a8eaa4	add x23,x19,#0x28
00a8eaa8	bl 0x00c3cec0
00a8eaac	ldr x7,[x21, #0x118]
00a8eab0	mov w6,w0
00a8eab4	add x5,sp,#0x24
00a8eab8	mov x0,x20
00a8eabc	mov x1,x24
00a8eac0	mov x2,x22
00a8eac4	mov x3,x21
00a8eac8	mov x4,x23
00a8eacc	bl 0x00c3e2e0
00a8ead0	ldr w1,[sp, #0x24]
00a8ead4	mov x0,x19
00a8ead8	bl 0x00c3ced0
00a8eadc	ldp x29,x30,[sp, #0x80]
00a8eae0	ldp x20,x19,[sp, #0x70]
00a8eae4	ldp x22,x21,[sp, #0x60]
00a8eae8	ldp x24,x23,[sp, #0x50]
00a8eaec	ldp x26,x25,[sp, #0x40]
00a8eaf0	ldp x28,x27,[sp, #0x30]
00a8eaf4	mov w0,#0x1
00a8eaf8	add sp,sp,#0x90
00a8eafc	ret
