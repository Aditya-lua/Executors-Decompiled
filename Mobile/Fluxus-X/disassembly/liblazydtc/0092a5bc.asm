; curl_maprintf @ 0092a5bc
0092a5bc	sub sp,sp,#0x140
0092a5c0	stp x28,x19,[sp, #0x120]
0092a5c4	stp x29,x30,[sp, #0x130]
0092a5c8	add x29,sp,#0x130
0092a5cc	stp q6,q7,[sp, #0x70]
0092a5d0	stp q4,q5,[sp, #0x50]
0092a5d4	stp q2,q3,[sp, #0x30]
0092a5d8	stp q0,q1,[sp, #0x10]
0092a5dc	stp x6,x7,[sp, #0xc0]
0092a5e0	stp x4,x5,[sp, #0xb0]
0092a5e4	stp x2,x3,[sp, #0xa0]
0092a5e8	str x1,[sp, #0x98]
0092a5ec	mrs x19,tpidr_el0
0092a5f0	ldr x12,[x19, #0x28]
0092a5f4	orr x9,xzr,#-0x7f00000080
0092a5f8	add x10,sp,#0x10
0092a5fc	add x11,sp,#0x98
0092a600	movk x9,#0xffc8
0092a604	add x13,x29,#0x10
0092a608	add x10,x10,#0x80
0092a60c	add x11,x11,#0x38
0092a610	sub x8,x29,#0x38
0092a614	str x12,[sp, #0x8]
0092a618	stp x10,x9,[x29, #-0x28]
0092a61c	stp x13,x11,[x29, #-0x38]
0092a620	ldp q1,q0,[x8]
0092a624	sub x1,x29,#0x60
0092a628	stp q1,q0,[x29, #-0x60]
0092a62c	bl 0x00c31eb0
0092a630	ldr x8,[x19, #0x28]
0092a634	ldr x9,[sp, #0x8]
0092a638	cmp x8,x9
0092a63c	b.ne 0x0092a650
0092a640	ldp x29,x30,[sp, #0x130]
0092a644	ldp x28,x19,[sp, #0x120]
0092a648	add sp,sp,#0x140
0092a64c	ret
0092a650	bl 0x00c2fec0
