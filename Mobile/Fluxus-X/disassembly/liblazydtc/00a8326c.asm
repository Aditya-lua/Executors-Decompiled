; OPENSSL_showfatal @ 00a8326c
00a8326c	sub sp,sp,#0x120
00a83270	orr x9,xzr,#-0x7f00000080
00a83274	stp x29,x30,[sp, #0x110]
00a83278	add x29,sp,#0x110
00a8327c	movk x9,#0xffc8
00a83280	mov x10,sp
00a83284	add x11,sp,#0x88
00a83288	add x12,x29,#0x10
00a8328c	stur x9,[x29, #-0x18]
00a83290	add x9,x10,#0x80
00a83294	add x10,x11,#0x38
00a83298	stp x12,x10,[x29, #-0x30]
00a8329c	stur x9,[x29, #-0x20]
00a832a0	stp q0,q1,[sp]
00a832a4	ldp q1,q0,[x29, #-0x30]
00a832a8	str x28,[sp, #0x100]
00a832ac	stp q6,q7,[sp, #0x60]
00a832b0	stp q4,q5,[sp, #0x40]
00a832b4	stp q2,q3,[sp, #0x20]
00a832b8	stp x6,x7,[sp, #0xb0]
00a832bc	stp x4,x5,[sp, #0xa0]
00a832c0	str x3,[sp, #0x98]
00a832c4	stp x1,x2,[sp, #0x88]
00a832c8	stp q1,q0,[x29, #-0x50]
00a832cc	adrp x9,0xcb4000
00a832d0	ldr x9,[x9, #0xba0]
00a832d4	mov x8,x0
00a832d8	sub x2,x29,#0x50
00a832dc	mov x1,x8
00a832e0	add x0,x9,#0x130
00a832e4	bl 0x00c3e020
00a832e8	ldp x29,x30,[sp, #0x110]
00a832ec	ldr x28,[sp, #0x100]
00a832f0	add sp,sp,#0x120
00a832f4	ret
