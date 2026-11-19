; curl_msprintf @ 0092a654
0092a654	sub sp,sp,#0x120
0092a658	stp x28,x19,[sp, #0x100]
0092a65c	stp x29,x30,[sp, #0x110]
0092a660	add x29,sp,#0x110
0092a664	stp q6,q7,[sp, #0x60]
0092a668	stp q4,q5,[sp, #0x40]
0092a66c	stp q2,q3,[sp, #0x20]
0092a670	stp q0,q1,[sp]
0092a674	stp x6,x7,[sp, #0xa0]
0092a678	stp x4,x5,[sp, #0x90]
0092a67c	stp x2,x3,[sp, #0x80]
0092a680	mrs x19,tpidr_el0
0092a684	ldr x12,[x19, #0x28]
0092a688	orr x9,xzr,#-0x7f00000080
0092a68c	mov x10,sp
0092a690	add x11,sp,#0x80
0092a694	movk x9,#0xffd0
0092a698	add x13,x29,#0x10
0092a69c	add x10,x10,#0x80
0092a6a0	add x11,x11,#0x30
0092a6a4	stur x12,[x29, #-0x18]
0092a6a8	stp x10,x9,[x29, #-0x30]
0092a6ac	stp x13,x11,[x29, #-0x40]
0092a6b0	ldp q1,q0,[x29, #-0x40]
0092a6b4	mov x8,x1
0092a6b8	adrp x1,0x92a000
0092a6bc	stur x0,[x29, #-0x20]
0092a6c0	add x1,x1,#0x704
0092a6c4	sub x0,x29,#0x20
0092a6c8	sub x3,x29,#0x60
0092a6cc	mov x2,x8
0092a6d0	stp q1,q0,[x29, #-0x60]
0092a6d4	bl 0x00929028
0092a6d8	ldur x8,[x29, #-0x20]
0092a6dc	strb wzr,[x8]
0092a6e0	ldr x8,[x19, #0x28]
0092a6e4	ldur x9,[x29, #-0x18]
0092a6e8	cmp x8,x9
0092a6ec	b.ne 0x0092a700
0092a6f0	ldp x29,x30,[sp, #0x110]
0092a6f4	ldp x28,x19,[sp, #0x100]
0092a6f8	add sp,sp,#0x120
0092a6fc	ret
0092a700	bl 0x00c2fec0
