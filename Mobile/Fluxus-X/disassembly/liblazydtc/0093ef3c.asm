; curl_easy_setopt @ 0093ef3c
0093ef3c	sub sp,sp,#0x130
0093ef40	stp x28,x19,[sp, #0x110]
0093ef44	stp x29,x30,[sp, #0x120]
0093ef48	add x29,sp,#0x120
0093ef4c	stp q6,q7,[sp, #0x70]
0093ef50	stp q4,q5,[sp, #0x50]
0093ef54	stp q2,q3,[sp, #0x30]
0093ef58	stp q0,q1,[sp, #0x10]
0093ef5c	stp x6,x7,[sp, #0xb0]
0093ef60	stp x4,x5,[sp, #0xa0]
0093ef64	stp x2,x3,[sp, #0x90]
0093ef68	mrs x19,tpidr_el0
0093ef6c	ldr x8,[x19, #0x28]
0093ef70	str x8,[sp, #0x8]
0093ef74	cbz x0,0x0093efb8
0093ef78	orr x9,xzr,#-0x7f00000080
0093ef7c	movk x9,#0xffd0
0093ef80	add x10,sp,#0x10
0093ef84	add x12,sp,#0x90
0093ef88	add x11,x29,#0x10
0093ef8c	stur x9,[x29, #-0x20]
0093ef90	add x9,x10,#0x80
0093ef94	add x10,x12,#0x30
0093ef98	sub x8,x29,#0x38
0093ef9c	stur x9,[x29, #-0x28]
0093efa0	stp x11,x10,[x29, #-0x38]
0093efa4	ldp q1,q0,[x8]
0093efa8	sub x2,x29,#0x60
0093efac	stp q1,q0,[x29, #-0x60]
0093efb0	bl 0x00937da0
0093efb4	b 0x0093efbc
0093efb8	mov w0,#0x2b
0093efbc	ldr x8,[x19, #0x28]
0093efc0	ldr x9,[sp, #0x8]
0093efc4	cmp x8,x9
0093efc8	b.ne 0x0093efdc
0093efcc	ldp x29,x30,[sp, #0x120]
0093efd0	ldp x28,x19,[sp, #0x110]
0093efd4	add sp,sp,#0x130
0093efd8	ret
0093efdc	bl 0x00c2fec0
