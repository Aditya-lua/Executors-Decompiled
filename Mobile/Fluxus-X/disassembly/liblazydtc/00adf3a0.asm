; SHA1_Final @ 00adf3a0
00adf3a0	str x21,[sp, #-0x30]!
00adf3a4	stp x20,x19,[sp, #0x10]
00adf3a8	stp x29,x30,[sp, #0x20]
00adf3ac	ldr w8,[x1, #0x5c]
00adf3b0	add x21,x1,#0x1c
00adf3b4	mov w9,#0x80
00adf3b8	mov x20,x1
00adf3bc	mov x19,x0
00adf3c0	strb w9,[x21, x8]
00adf3c4	cmp w8,#0x38
00adf3c8	add x9,x8,#0x1
00adf3cc	add x29,sp,#0x20
00adf3d0	b.cc 0x00adf3fc
00adf3d4	add x0,x21,x9
00adf3d8	orr w9,wzr,#0x3f
00adf3dc	sub x2,x9,x8
00adf3e0	mov w1,wzr
00adf3e4	bl 0x00c301c0
00adf3e8	mov w2,#0x1
00adf3ec	mov x0,x20
00adf3f0	mov x1,x21
00adf3f4	bl 0x00ade188
00adf3f8	mov x9,xzr
00adf3fc	orr w8,wzr,#0x38
00adf400	add x0,x21,x9
00adf404	sub x2,x8,x9
00adf408	mov w1,wzr
00adf40c	bl 0x00c301c0
00adf410	ldp w9,w8,[x20, #0x14]
00adf414	mov w2,#0x1
00adf418	mov x0,x20
00adf41c	mov x1,x21
00adf420	lsr w10,w8,#0x18
00adf424	strb w10,[x20, #0x54]
00adf428	lsr w10,w8,#0x10
00adf42c	strb w8,[x20, #0x57]
00adf430	lsr w8,w8,#0x8
00adf434	strb w8,[x20, #0x56]
00adf438	lsr w8,w9,#0x18
00adf43c	strb w8,[x20, #0x58]
00adf440	lsr w8,w9,#0x10
00adf444	strb w8,[x20, #0x59]
00adf448	lsr w8,w9,#0x8
00adf44c	strb w10,[x20, #0x55]
00adf450	strb w8,[x20, #0x5a]
00adf454	strb w9,[x20, #0x5b]
00adf458	bl 0x00ade188
00adf45c	mov w1,#0x40
00adf460	mov x0,x21
00adf464	str wzr,[x20, #0x5c]
00adf468	bl 0x00c34750
00adf46c	ldr w8,[x20]
00adf470	mov w0,#0x1
00adf474	lsr w9,w8,#0x18
00adf478	strb w9,[x19]
00adf47c	lsr w9,w8,#0x10
00adf480	strb w8,[x19, #0x3]
00adf484	lsr w8,w8,#0x8
00adf488	strb w9,[x19, #0x1]
00adf48c	strb w8,[x19, #0x2]
00adf490	ldr w8,[x20, #0x4]
00adf494	lsr w9,w8,#0x18
00adf498	strb w9,[x19, #0x4]
00adf49c	lsr w9,w8,#0x10
00adf4a0	strb w8,[x19, #0x7]
00adf4a4	lsr w8,w8,#0x8
00adf4a8	strb w9,[x19, #0x5]
00adf4ac	strb w8,[x19, #0x6]
00adf4b0	ldr w8,[x20, #0x8]
00adf4b4	lsr w9,w8,#0x18
00adf4b8	strb w9,[x19, #0x8]
00adf4bc	lsr w9,w8,#0x10
00adf4c0	strb w8,[x19, #0xb]
00adf4c4	lsr w8,w8,#0x8
00adf4c8	strb w9,[x19, #0x9]
00adf4cc	strb w8,[x19, #0xa]
00adf4d0	ldr w8,[x20, #0xc]
00adf4d4	lsr w9,w8,#0x18
00adf4d8	strb w9,[x19, #0xc]
00adf4dc	lsr w9,w8,#0x10
00adf4e0	strb w8,[x19, #0xf]
00adf4e4	lsr w8,w8,#0x8
00adf4e8	strb w9,[x19, #0xd]
00adf4ec	strb w8,[x19, #0xe]
00adf4f0	ldr w8,[x20, #0x10]
00adf4f4	lsr w9,w8,#0x18
00adf4f8	strb w9,[x19, #0x10]
00adf4fc	lsr w9,w8,#0x10
00adf500	strb w9,[x19, #0x11]
00adf504	lsr w9,w8,#0x8
00adf508	strb w9,[x19, #0x12]
00adf50c	strb w8,[x19, #0x13]
00adf510	ldp x29,x30,[sp, #0x20]
00adf514	ldp x20,x19,[sp, #0x10]
00adf518	ldr x21,[sp], #0x30
00adf51c	ret
