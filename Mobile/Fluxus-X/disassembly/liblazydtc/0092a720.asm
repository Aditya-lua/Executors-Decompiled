; curl_mprintf @ 0092a720
0092a720	sub sp,sp,#0x140
0092a724	stp x28,x19,[sp, #0x120]
0092a728	stp x29,x30,[sp, #0x130]
0092a72c	add x29,sp,#0x130
0092a730	stp q6,q7,[sp, #0x70]
0092a734	stp q4,q5,[sp, #0x50]
0092a738	stp q2,q3,[sp, #0x30]
0092a73c	stp q0,q1,[sp, #0x10]
0092a740	stp x6,x7,[sp, #0xc0]
0092a744	stp x4,x5,[sp, #0xb0]
0092a748	stp x2,x3,[sp, #0xa0]
0092a74c	str x1,[sp, #0x98]
0092a750	mrs x19,tpidr_el0
0092a754	ldr x13,[x19, #0x28]
0092a758	orr x10,xzr,#-0x7f00000080
0092a75c	add x11,sp,#0x10
0092a760	add x12,sp,#0x98
0092a764	movk x10,#0xffc8
0092a768	add x14,x29,#0x10
0092a76c	add x11,x11,#0x80
0092a770	add x12,x12,#0x38
0092a774	sub x9,x29,#0x38
0092a778	str x13,[sp, #0x8]
0092a77c	stp x11,x10,[x29, #-0x28]
0092a780	stp x14,x12,[x29, #-0x38]
0092a784	ldp q1,q0,[x9]
0092a788	adrp x9,0xcb4000
0092a78c	mov x8,x0
0092a790	adrp x1,0x92a000
0092a794	stp q1,q0,[x29, #-0x60]
0092a798	ldr x9,[x9, #0xba0]
0092a79c	add x1,x1,#0x7d4
0092a7a0	sub x3,x29,#0x60
0092a7a4	mov x2,x8
0092a7a8	add x0,x9,#0x98
0092a7ac	bl 0x00929028
0092a7b0	ldr x8,[x19, #0x28]
0092a7b4	ldr x9,[sp, #0x8]
0092a7b8	cmp x8,x9
0092a7bc	b.ne 0x0092a7d0
0092a7c0	ldp x29,x30,[sp, #0x130]
0092a7c4	ldp x28,x19,[sp, #0x120]
0092a7c8	add sp,sp,#0x140
0092a7cc	ret
0092a7d0	bl 0x00c2fec0
