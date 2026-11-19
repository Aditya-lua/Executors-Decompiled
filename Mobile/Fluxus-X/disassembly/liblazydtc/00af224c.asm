; X509_load_crl_file @ 00af224c
00af224c	str x23,[sp, #-0x40]!
00af2250	stp x22,x21,[sp, #0x10]
00af2254	stp x20,x19,[sp, #0x20]
00af2258	stp x29,x30,[sp, #0x30]
00af225c	add x29,sp,#0x30
00af2260	mov w20,w2
00af2264	mov x22,x1
00af2268	mov x21,x0
00af226c	bl 0x00c32270
00af2270	bl 0x00c32240
00af2274	mov x19,x0
00af2278	cbz x0,0x00af2310
00af227c	mov w1,#0x6c
00af2280	orr w2,wzr,#0x3
00af2284	mov x0,x19
00af2288	mov x3,x22
00af228c	bl 0x00c321a0
00af2290	cmp w0,#0x0
00af2294	b.le 0x00af2310
00af2298	cmp w20,#0x2
00af229c	b.eq 0x00af2370
00af22a0	cmp w20,#0x1
00af22a4	b.ne 0x00af2398
00af22a8	adrp x3,0x2ab000
00af22ac	add x3,x3,#0x32c
00af22b0	mov x0,x19
00af22b4	mov x1,xzr
00af22b8	mov x2,xzr
00af22bc	bl 0x00c3f150
00af22c0	cbz x0,0x00af23c0
00af22c4	adrp x23,0x2ab000
00af22c8	mov x22,x0
00af22cc	mov w20,wzr
00af22d0	add x23,x23,#0x32c
00af22d4	ldr x0,[x21, #0x18]
00af22d8	mov x1,x22
00af22dc	bl 0x00c32bf0
00af22e0	cbz w0,0x00af2420
00af22e4	mov x0,x22
00af22e8	add w20,w20,#0x1
00af22ec	bl 0x00c382b0
00af22f0	mov x0,x19
00af22f4	mov x1,xzr
00af22f8	mov x2,xzr
00af22fc	mov x3,x23
00af2300	bl 0x00c3f150
00af2304	mov x22,x0
00af2308	cbnz x0,0x00af22d4
00af230c	b 0x00af23c4
00af2310	bl 0x00c342a0
00af2314	adrp x0,0x2dc000
00af2318	adrp x2,0x2ca000
00af231c	add x0,x0,#0xa05
00af2320	add x2,x2,#0x41c
00af2324	mov w1,#0xa9
00af2328	bl 0x00c342b0
00af232c	mov w1,#0x2
00af2330	mov w0,#0xb
00af2334	movk w1,#0x8, LSL #16
00af2338	mov x2,xzr
00af233c	bl 0x00c342c0
00af2340	mov w20,wzr
00af2344	mov x22,xzr
00af2348	mov x0,x22
00af234c	bl 0x00c382b0
00af2350	mov x0,x19
00af2354	bl 0x00c31a40
00af2358	mov w0,w20
00af235c	ldp x29,x30,[sp, #0x30]
00af2360	ldp x20,x19,[sp, #0x20]
00af2364	ldp x22,x21,[sp, #0x10]
00af2368	ldr x23,[sp], #0x40
00af236c	ret
00af2370	mov x0,x19
00af2374	mov x1,xzr
00af2378	bl 0x00c404b0
00af237c	mov x22,x0
00af2380	cbz x0,0x00af23ec
00af2384	ldr x0,[x21, #0x18]
00af2388	mov x1,x22
00af238c	bl 0x00c32bf0
00af2390	mov w20,w0
00af2394	b 0x00af2348
00af2398	bl 0x00c342a0
00af239c	adrp x0,0x2dc000
00af23a0	adrp x2,0x2ca000
00af23a4	add x0,x0,#0xa05
00af23a8	add x2,x2,#0x41c
00af23ac	mov w1,#0xcd
00af23b0	bl 0x00c342b0
00af23b4	mov w0,#0xb
00af23b8	mov w1,#0x64
00af23bc	b 0x00af2338
00af23c0	mov w20,wzr
00af23c4	bl 0x00c32420
00af23c8	cbz w20,0x00af2428
00af23cc	asr w8,w0,#0x1f
00af23d0	and w8,w8,#0x7f800000
00af23d4	orr w8,w8,#0x7fffff
00af23d8	and w8,w8,w0
00af23dc	cmp w8,#0x6c
00af23e0	b.ne 0x00af2428
00af23e4	bl 0x00c323e0
00af23e8	b 0x00af2344
00af23ec	bl 0x00c342a0
00af23f0	adrp x0,0x2dc000
00af23f4	adrp x2,0x2ca000
00af23f8	add x0,x0,#0xa05
00af23fc	add x2,x2,#0x41c
00af2400	mov w1,#0xc5
00af2404	bl 0x00c342b0
00af2408	mov w8,#0x2
00af240c	movk w8,#0x8, LSL #16
00af2410	add w1,w8,#0xb
00af2414	mov w0,#0xb
00af2418	mov x2,xzr
00af241c	bl 0x00c342c0
00af2420	mov w20,wzr
00af2424	b 0x00af2348
00af2428	bl 0x00c342a0
00af242c	adrp x0,0x2dc000
00af2430	adrp x2,0x2ca000
00af2434	add x0,x0,#0xa05
00af2438	add x2,x2,#0x41c
00af243c	mov w1,#0xb6
00af2440	bl 0x00c342b0
00af2444	mov w8,#0x2
00af2448	movk w8,#0x8, LSL #16
00af244c	add w1,w8,#0x7
00af2450	mov w0,#0xb
00af2454	b 0x00af2338
