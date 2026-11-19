; curl_msnprintf @ 0092a30c
0092a30c	sub sp,sp,#0x130
0092a310	stp x28,x19,[sp, #0x110]
0092a314	stp x29,x30,[sp, #0x120]
0092a318	add x29,sp,#0x120
0092a31c	stp q6,q7,[sp, #0x60]
0092a320	stp q4,q5,[sp, #0x40]
0092a324	stp q2,q3,[sp, #0x20]
0092a328	stp q0,q1,[sp]
0092a32c	stp x6,x7,[sp, #0xa0]
0092a330	stp x4,x5,[sp, #0x90]
0092a334	str x3,[sp, #0x88]
0092a338	mrs x19,tpidr_el0
0092a33c	ldr x8,[x19, #0x28]
0092a340	orr x9,xzr,#-0x7f00000080
0092a344	mov x10,sp
0092a348	add x11,sp,#0x88
0092a34c	movk x9,#0xffd8
0092a350	stur x8,[x29, #-0x18]
0092a354	add x8,x29,#0x10
0092a358	add x10,x10,#0x80
0092a35c	add x11,x11,#0x28
0092a360	stp x10,x9,[x29, #-0x60]
0092a364	stp x8,x11,[x29, #-0x70]
0092a368	ldp q0,q1,[x29, #-0x70]
0092a36c	stur x1,[x29, #-0x20]
0092a370	adrp x1,0x92a000
0092a374	stp x0,xzr,[x29, #-0x30]
0092a378	add x1,x1,#0x2d0
0092a37c	sub x0,x29,#0x30
0092a380	sub x3,x29,#0x50
0092a384	stp q0,q1,[x29, #-0x50]
0092a388	bl 0x00929028
0092a38c	ldur x9,[x29, #-0x20]
0092a390	cbz x9,0x0092a3b0
0092a394	ldp x8,x10,[x29, #-0x30]
0092a398	cmp x9,x10
0092a39c	b.ne 0x0092a3ac
0092a3a0	sturb wzr,[x8, #-0x1]
0092a3a4	sub w0,w0,#0x1
0092a3a8	b 0x0092a3b0
0092a3ac	strb wzr,[x8]
0092a3b0	ldr x8,[x19, #0x28]
0092a3b4	ldur x9,[x29, #-0x18]
0092a3b8	cmp x8,x9
0092a3bc	b.ne 0x0092a3d0
0092a3c0	ldp x29,x30,[sp, #0x120]
0092a3c4	ldp x28,x19,[sp, #0x110]
0092a3c8	add sp,sp,#0x130
0092a3cc	ret
0092a3d0	bl 0x00c2fec0
