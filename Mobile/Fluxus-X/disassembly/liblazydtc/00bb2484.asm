; ZSTD_initDStream_usingDict @ 00bb2484
00bb2484	sub sp,sp,#0x60
00bb2488	stp x29,x30,[sp, #0x20]
00bb248c	str x23,[sp, #0x30]
00bb2490	stp x22,x21,[sp, #0x40]
00bb2494	stp x20,x19,[sp, #0x50]
00bb2498	add x29,sp,#0x20
00bb249c	mrs x22,tpidr_el0
00bb24a0	mov x19,x0
00bb24a4	add x23,x0,#0x7, LSL #12
00bb24a8	ldr x8,[x22, #0x28]
00bb24ac	mov x20,x2
00bb24b0	mov x21,x1
00bb24b4	stur x8,[x29, #-0x8]
00bb24b8	mov w8,#0x1
00bb24bc	ldr x0,[x0, #0x75e8]
00bb24c0	str wzr,[x23, #0x61c]
00bb24c4	str wzr,[x23, #0x66c]
00bb24c8	str w8,[x23, #0x5e0]
00bb24cc	bl 0x00c435b0
00bb24d0	movi v0.2D,#0x0
00bb24d4	mov w8,#0x75e8
00bb24d8	str wzr,[x23, #0x600]
00bb24dc	str q0,[x19,x8]
00bb24e0	cbz x21,0x00bb2524
00bb24e4	cbz x20,0x00bb2524
00bb24e8	ldr q0,[x19, #0x75b0]
00bb24ec	ldr x8,[x19, #0x75c0]
00bb24f0	mov x4,sp
00bb24f4	mov x0,x21
00bb24f8	mov x1,x20
00bb24fc	mov w2,wzr
00bb2500	mov w3,wzr
00bb2504	str q0,[sp]
00bb2508	str x8,[sp, #0x10]
00bb250c	bl 0x00c435a0
00bb2510	str x0,[x19, #0x75e8]
00bb2514	cbz x0,0x00bb255c
00bb2518	mov w8,#0xffffffff
00bb251c	str x0,[x19, #0x75f0]
00bb2520	str w8,[x23, #0x600]
00bb2524	ldr w8,[x23, #0x598]
00bb2528	cmp w8,#0x0
00bb252c	mov w8,#0x5
00bb2530	csinc x0,x8,xzr,eq
00bb2534	ldr x8,[x22, #0x28]
00bb2538	ldur x9,[x29, #-0x8]
00bb253c	cmp x8,x9
00bb2540	b.ne 0x00bb2564
00bb2544	ldp x20,x19,[sp, #0x50]
00bb2548	ldr x23,[sp, #0x30]
00bb254c	ldp x22,x21,[sp, #0x40]
00bb2550	ldp x29,x30,[sp, #0x20]
00bb2554	add sp,sp,#0x60
00bb2558	ret
00bb255c	mov x0,#-0x40
00bb2560	b 0x00bb2534
00bb2564	bl 0x00c2fec0
