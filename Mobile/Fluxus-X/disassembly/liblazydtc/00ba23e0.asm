; psa_parse_key_data_from_storage @ 00ba23e0
00ba23e0	stp x22,x21,[sp, #-0x30]!
00ba23e4	stp x20,x19,[sp, #0x10]
00ba23e8	stp x29,x30,[sp, #0x20]
00ba23ec	add x29,sp,#0x20
00ba23f0	mov x19,x4
00ba23f4	mov x21,x2
00ba23f8	subs x8,x1,#0x24
00ba23fc	mov x20,x0
00ba2400	b.cc 0x00ba2428
00ba2404	ldr x9,[x20]
00ba2408	mov x10,#0x5350
00ba240c	movk x10,#0x41, LSL #16
00ba2410	movk x10,#0x454b, LSL #32
00ba2414	movk x10,#0x59, LSL #48
00ba2418	cmp x9,x10
00ba241c	b.ne 0x00ba2428
00ba2420	ldr w9,[x20, #0x8]
00ba2424	cbz w9,0x00ba243c
00ba2428	mov w0,#0xffffff67
00ba242c	ldp x29,x30,[sp, #0x20]
00ba2430	ldp x20,x19,[sp, #0x10]
00ba2434	ldp x22,x21,[sp], #0x30
00ba2438	ret
00ba243c	ldr w22,[x20, #0x20]
00ba2440	mov w0,#0xffffff67
00ba2444	ubfx x9,x22,#0xd,#0x13
00ba2448	str x22,[x3]
00ba244c	cbnz w9,0x00ba242c
00ba2450	cmp x8,x22
00ba2454	b.cc 0x00ba242c
00ba2458	cbz w22,0x00ba2480
00ba245c	mov w0,#0x1
00ba2460	mov x1,x22
00ba2464	bl 0x00c30a30
00ba2468	str x0,[x21]
00ba246c	cbz x0,0x00ba24bc
00ba2470	add x1,x20,#0x24
00ba2474	mov x2,x22
00ba2478	bl 0x00c2ffd0
00ba247c	b 0x00ba2484
00ba2480	str xzr,[x21]
00ba2484	ldr w8,[x20, #0xc]
00ba2488	mov w0,wzr
00ba248c	str w8,[x19, #0x4]
00ba2490	ldrh w8,[x20, #0x10]
00ba2494	strh w8,[x19]
00ba2498	ldrh w8,[x20, #0x12]
00ba249c	strh w8,[x19, #0x2]
00ba24a0	ldr w8,[x20, #0x14]
00ba24a4	str w8,[x19, #0x8]
00ba24a8	ldr w8,[x20, #0x18]
00ba24ac	str w8,[x19, #0xc]
00ba24b0	ldr w8,[x20, #0x1c]
00ba24b4	str w8,[x19, #0x10]
00ba24b8	b 0x00ba242c
00ba24bc	mov w0,#0xffffff73
00ba24c0	b 0x00ba242c
