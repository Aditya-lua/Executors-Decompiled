; ZSTD_DCtx_refPrefix @ 00bb23ac
00bb23ac	sub sp,sp,#0x60
00bb23b0	stp x29,x30,[sp, #0x20]
00bb23b4	str x23,[sp, #0x30]
00bb23b8	stp x22,x21,[sp, #0x40]
00bb23bc	stp x20,x19,[sp, #0x50]
00bb23c0	add x29,sp,#0x20
00bb23c4	mrs x22,tpidr_el0
00bb23c8	add x23,x0,#0x7, LSL #12
00bb23cc	ldr x8,[x22, #0x28]
00bb23d0	stur x8,[x29, #-0x8]
00bb23d4	ldr w8,[x23, #0x61c]
00bb23d8	cbz w8,0x00bb23e4
00bb23dc	mov x0,#-0x3c
00bb23e0	b 0x00bb2450
00bb23e4	mov x19,x0
00bb23e8	ldr x0,[x0, #0x75e8]
00bb23ec	mov x20,x2
00bb23f0	mov x21,x1
00bb23f4	bl 0x00c435b0
00bb23f8	movi v0.2D,#0x0
00bb23fc	mov w8,#0x75e8
00bb2400	str wzr,[x23, #0x600]
00bb2404	str q0,[x19,x8]
00bb2408	cbz x21,0x00bb2444
00bb240c	cbz x20,0x00bb2444
00bb2410	ldr q0,[x19, #0x75b0]
00bb2414	ldr x8,[x19, #0x75c0]
00bb2418	mov x4,sp
00bb241c	mov x0,x21
00bb2420	mov x1,x20
00bb2424	mov w2,#0x1
00bb2428	mov w3,#0x1
00bb242c	str q0,[sp]
00bb2430	str x8,[sp, #0x10]
00bb2434	bl 0x00c435a0
00bb2438	str x0,[x19, #0x75e8]
00bb243c	cbz x0,0x00bb2478
00bb2440	str x0,[x19, #0x75f0]
00bb2444	mov x0,xzr
00bb2448	mov w8,#0x1
00bb244c	str w8,[x23, #0x600]
00bb2450	ldr x8,[x22, #0x28]
00bb2454	ldur x9,[x29, #-0x8]
00bb2458	cmp x8,x9
00bb245c	b.ne 0x00bb2480
00bb2460	ldp x20,x19,[sp, #0x50]
00bb2464	ldr x23,[sp, #0x30]
00bb2468	ldp x22,x21,[sp, #0x40]
00bb246c	ldp x29,x30,[sp, #0x20]
00bb2470	add sp,sp,#0x60
00bb2474	ret
00bb2478	mov x0,#-0x40
00bb247c	b 0x00bb2450
00bb2480	bl 0x00c2fec0
