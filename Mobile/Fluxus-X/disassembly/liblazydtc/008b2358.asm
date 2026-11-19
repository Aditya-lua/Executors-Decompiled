; FUN_008b2358 @ 008b2358
008b2358	sub sp,sp,#0x70
008b235c	stp x29,x30,[sp, #0x10]
008b2360	stp x28,x27,[sp, #0x20]
008b2364	stp x26,x25,[sp, #0x30]
008b2368	stp x24,x23,[sp, #0x40]
008b236c	stp x22,x21,[sp, #0x50]
008b2370	stp x20,x19,[sp, #0x60]
008b2374	add x29,sp,#0x10
008b2378	mov x22,x2
008b237c	ldr x8,[x29, #0x60]
008b2380	ldrb w2,[x0, #0x4]
008b2384	mov w25,w4
008b2388	mov x27,x3
008b238c	mov x28,x1
008b2390	mov w1,#0x70
008b2394	mov w3,#0xb
008b2398	mov w4,wzr
008b239c	mov w20,w7
008b23a0	mov w24,w6
008b23a4	mov w23,w5
008b23a8	mov x19,x0
008b23ac	str x8,[sp, #0x8]
008b23b0	mov w21,#0xb
008b23b4	bl 0x008b78d0
008b23b8	ldr x8,[x19, #0x60]
008b23bc	mov w10,#0x558c
008b23c0	ldrb w2,[x19, #0x4]
008b23c4	mov x26,x0
008b23c8	strb w21,[x0]
008b23cc	ldrb w11,[x8, #0x2]
008b23d0	ldr w9,[x8, x10#0x0]
008b23d4	strb w2,[x0, #0x1]
008b23d8	str x28,[x0, #0x10]
008b23dc	and w11,w11,#0x3
008b23e0	strb w11,[x0, #0x2]
008b23e4	cbz w9,0x008b23f0
008b23e8	add w11,w9,#0x1
008b23ec	str w11,[x8, x10#0x0]
008b23f0	movi v0.2D,#0x0
008b23f4	ubfiz x1,x23,#0x4,#0x20
008b23f8	mov x0,x19
008b23fc	str w9,[x26, #0x18]
008b2400	stp q0,q0,[x26, #0x20]
008b2404	stp q0,q0,[x26, #0x40]
008b2408	stur q0,[x26, #0x5b]
008b240c	bl 0x008b7610
008b2410	str x0,[x26, #0x28]
008b2414	cbz w23,0x008b2468
008b2418	cmp w23,#0x1
008b241c	mov w8,w23
008b2420	b.ne 0x008b242c
008b2424	mov x9,xzr
008b2428	b 0x008b2450
008b242c	and x9,x8,#0xfffffffe
008b2430	add x10,x0,#0x1c
008b2434	mov x11,x9
008b2438	subs x11,x11,#0x2
008b243c	stur wzr,[x10, #-0x10]
008b2440	str wzr,[x10], #0x20
008b2444	b.ne 0x008b2438
008b2448	cmp x9,x8
008b244c	b.eq 0x008b2468
008b2450	add x10,x0,x9, LSL #0x4
008b2454	sub x8,x8,x9
008b2458	add x10,x10,#0xc
008b245c	subs x8,x8,#0x1
008b2460	str wzr,[x10], #0x10
008b2464	b.ne 0x008b245c
008b2468	add w8,w23,w25
008b246c	sub w10,w23,w20, UXTB 
008b2470	ldr x2,[sp, #0x8]
008b2474	stp w25,w8,[x26, #0x58]
008b2478	and w8,w24,#0xff
008b247c	mov x1,x26
008b2480	sub w9,w25,w8
008b2484	stp x22,x27,[x26, #0x38]
008b2488	stp w8,w9,[x26, #0x60]
008b248c	add x8,x0,w10, UXTW  #0x4
008b2490	mov x0,x19
008b2494	strb w20,[x26, #0x68]
008b2498	str x8,[x26, #0x30]
008b249c	bl 0x008b24c4
008b24a0	mov x0,x26
008b24a4	ldp x20,x19,[sp, #0x60]
008b24a8	ldp x22,x21,[sp, #0x50]
008b24ac	ldp x24,x23,[sp, #0x40]
008b24b0	ldp x26,x25,[sp, #0x30]
008b24b4	ldp x28,x27,[sp, #0x20]
008b24b8	ldp x29,x30,[sp, #0x10]
008b24bc	add sp,sp,#0x70
008b24c0	ret
