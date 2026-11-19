; ossl_rsa_get0_all_params @ 00ad23d0
00ad23d0	str x25,[sp, #-0x50]!
00ad23d4	stp x24,x23,[sp, #0x10]
00ad23d8	stp x22,x21,[sp, #0x20]
00ad23dc	stp x20,x19,[sp, #0x30]
00ad23e0	stp x29,x30,[sp, #0x40]
00ad23e4	add x29,sp,#0x40
00ad23e8	cbz x0,0x00ad2498
00ad23ec	mov x21,x1
00ad23f0	ldr x1,[x0, #0x40]
00ad23f4	mov x22,x0
00ad23f8	cbz x1,0x00ad2494
00ad23fc	mov x0,x21
00ad2400	mov x19,x3
00ad2404	mov x20,x2
00ad2408	bl 0x00c347a0
00ad240c	ldr x1,[x22, #0x48]
00ad2410	mov x0,x21
00ad2414	bl 0x00c347a0
00ad2418	ldr x1,[x22, #0x50]
00ad241c	mov x0,x20
00ad2420	bl 0x00c347a0
00ad2424	ldr x1,[x22, #0x58]
00ad2428	mov x0,x20
00ad242c	bl 0x00c347a0
00ad2430	ldr x1,[x22, #0x60]
00ad2434	mov x0,x19
00ad2438	bl 0x00c347a0
00ad243c	ldr x0,[x22, #0x88]
00ad2440	bl 0x00c325e0
00ad2444	cmp w0,#0x1
00ad2448	b.lt 0x00ad2494
00ad244c	mov w23,wzr
00ad2450	bic w25,w0,w0, ASR #0x1f
00ad2454	ldr x0,[x22, #0x88]
00ad2458	mov w1,w23
00ad245c	bl 0x00c32610
00ad2460	ldr x1,[x0]
00ad2464	mov x24,x0
00ad2468	mov x0,x21
00ad246c	bl 0x00c347a0
00ad2470	ldr x1,[x24, #0x8]
00ad2474	mov x0,x20
00ad2478	bl 0x00c347a0
00ad247c	ldr x1,[x24, #0x10]
00ad2480	mov x0,x19
00ad2484	bl 0x00c347a0
00ad2488	add w23,w23,#0x1
00ad248c	cmp w23,w25
00ad2490	b.cc 0x00ad2454
00ad2494	mov w0,#0x1
00ad2498	ldp x29,x30,[sp, #0x40]
00ad249c	ldp x20,x19,[sp, #0x30]
00ad24a0	ldp x22,x21,[sp, #0x20]
00ad24a4	ldp x24,x23,[sp, #0x10]
00ad24a8	ldr x25,[sp], #0x50
00ad24ac	ret
